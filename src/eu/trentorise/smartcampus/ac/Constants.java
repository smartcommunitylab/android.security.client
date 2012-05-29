package eu.trentorise.smartcampus.ac;

public class Constants {

    public static final String AUTH_BASE_URL = "https://192.168.255.75:8443/smartcampus.security.web/";
    public static final String AUTH_REQUEST_URL = AUTH_BASE_URL + "getToken";
    public static final String AUTH_OK_URL = AUTH_BASE_URL + "success";
    public static final String AUTH_CANCEL_URL = AUTH_BASE_URL + "cancel";
    public static final String AUTH_INVALIDATE_URL = AUTH_BASE_URL + "invalidateToken";

    public static final String ACCOUNT_TYPE = "eu.trentorise.smartcampus.account";
    public static final String TOKEN_TYPE_DEFAULT = "eu.trentorise.smartcampus.account";
	public static final String ACCOUNT_NAME = "eu.trentorise.smartcampus.account";
	public static final String KEY_AUTHORITY = "eu.trentorise.smartcampus.account.AUTHORITY";
	
	public static final int RESULT_FAILURE = 2;

	public static final String ACCOUNT_AUTHTOKEN_CHANGED_ACTION = "eu.trentorise.smartcampus.account.AUTHTOKEN_CHANGED";
	public static final String ACCOUNT_AUTHENTICATE_ACTION = "eu.trentorise.smartcampus.account.AUTHENTICATE";
}