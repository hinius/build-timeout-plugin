package hudson.plugins.build_timeout;

import org.apache.commons.mail.SimpleEmail;

/**
 * Uses Commons Mail to email build timeout alerts
 * 
 * @author ChuaH
 */
public class BuildEmailer {

	/**
	 * Email-related properties
	 */
	public static final String SMTP_SERVER = "lon02-exch-01.corp.monitise.net";
	
	public static final String FROM_EMAIL = "SCM-No-Reply@monitisegroup.com";
	public static final String FROM_NAME = "SCM Service Monitor";
	public static final String TO_EMAIL = "hin.chua@monitisegroup.com";
	
	public static void alert(String subject, String message) {
		
		try {
			SimpleEmail email = new SimpleEmail();
			email.setDebug(false);
			
			email.setHostName(SMTP_SERVER);
			email.addTo(TO_EMAIL);
			email.setFrom(FROM_EMAIL, FROM_NAME);
			email.setSubject(subject);
			email.setMsg(message);

			email.send();
		}

		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}