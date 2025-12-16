package LY0;

import AK.c;
import java.util.HashMap;

/* compiled from: com.google.android.play:integrity@@1.1.0 */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f9986a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f9987b;

    static {
        HashMap map = new HashMap();
        f9986a = map;
        HashMap map2 = new HashMap();
        f9987b = map2;
        Integer numF = c.f(-2, -1, "Integrity API is not available.\nIntegrity API is not enabled, or the Play Store version might be old.\nRecommended actions:\n1) Make sure that Integrity API is enabled in Google Play Console.\n2) Ask the user to update Play Store.\n", "The Play Store app is either not installed or not the official version.\nAsk the user to install an official and recent version of Play Store.\n", map);
        Integer numF2 = c.f(-4, -3, "Network error: unable to obtain integrity details.\nAsk the user to check for a connection.\n", "No active account found in the Play Store app. Note that the Play Integrity API now supports unauthenticated requests. This error code is used only for older Play Store versions that lack support.\nAsk the user to authenticate in Play Store.\n", map);
        Integer numF3 = c.f(-6, -5, "PackageManager could not find this app.\nSomething is wrong (possibly an attack). Non-actionable.\n", "Google Play Services is not available or version is too old.\nAsk the user to Install or Update Play Services.\n", map);
        Integer numF4 = c.f(-8, -7, "The calling app UID (user id) does not match the one from Package Manager.\nSomething is wrong (possibly an attack). Non-actionable.\n", "The calling app is making too many requests to the API and hence is throttled.\nRetry with an exponential backoff.\n", map);
        Integer numF5 = c.f(-10, -9, "Binding to the service in the Play Store has failed. This can be due to having an old Play Store version installed on the device.\nAsk the user to update Play Store.\n", "Nonce length is too short. The nonce must be a minimum of 16 bytes (before base64 encoding) to allow for a better security.\nRetry with a longer nonce.\n", map);
        Integer numF6 = c.f(-12, -11, "Nonce length is too long. The nonce must be less than 500 bytes before base64 encoding.\nRetry with a shorter nonce.\n", "Unknown internal Google server error.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n", map);
        Integer numF7 = c.f(-14, -13, "Nonce is not encoded as a base64 web-safe no-wrap string.\nRetry with correct nonce format.\n", "The Play Store needs to be updated.\nAsk the user to update the Google Play Store.\n", map);
        Integer numF8 = c.f(-16, -15, "Play Services needs to be updated.\nAsk the user to update Google Play Services.\n", "The provided cloud project number is invalid.\nUse the cloud project number which can be found in Project info in your Google Cloud Console for the cloud project where Play Integrity API is enabled.\n", map);
        Integer numF9 = c.f(-17, -100, "Unknown error processing integrity request.\nRetry with an exponential backoff. Consider filing a bug if fails consistently.\n", "There is a transient error on the calling device.\nRetry with an exponential backoff.\n", map);
        map2.put(-1, "API_NOT_AVAILABLE");
        map2.put(-3, "NETWORK_ERROR");
        map2.put(numF, "PLAY_STORE_NOT_FOUND");
        map2.put(numF2, "PLAY_STORE_ACCOUNT_NOT_FOUND");
        map2.put(numF7, "PLAY_STORE_VERSION_OUTDATED");
        map2.put(-5, "APP_NOT_INSTALLED");
        map2.put(numF3, "PLAY_SERVICES_NOT_FOUND");
        map2.put(-15, "PLAY_SERVICES_VERSION_OUTDATED");
        map2.put(-7, "APP_UID_MISMATCH");
        map2.put(numF4, "TOO_MANY_REQUESTS");
        map2.put(-9, "CANNOT_BIND_TO_SERVICE");
        map2.put(numF5, "NONCE_TOO_SHORT");
        map2.put(-11, "NONCE_TOO_LONG");
        map2.put(-13, "NONCE_IS_NOT_BASE64");
        map2.put(numF8, "CLOUD_PROJECT_NUMBER_IS_INVALID");
        map2.put(numF6, "GOOGLE_SERVER_UNAVAILABLE");
        map2.put(-100, "INTERNAL_ERROR");
        map2.put(numF9, "CLIENT_TRANSIENT_ERROR");
    }
}
