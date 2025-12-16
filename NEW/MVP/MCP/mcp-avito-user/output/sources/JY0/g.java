package JY0;

import java.util.HashMap;

/* compiled from: com.google.android.play:app-update@@2.1.0 */
/* loaded from: classes6.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f9034a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f9035b;

    static {
        HashMap map = new HashMap();
        f9034a = map;
        HashMap map2 = new HashMap();
        f9035b = map2;
        Integer numF = AK.c.f(-3, -2, "An unknown error occurred.", "The API is not available on this device.", map);
        Integer numF2 = AK.c.f(-5, -4, "The request that was sent by the app is malformed.", "The install is unavailable to this user or device.", map);
        Integer numF3 = AK.c.f(-7, -6, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).", "The install/update has not been (fully) downloaded yet.", map);
        Integer numF4 = AK.c.f(-9, -8, "The install is already in progress and there is no UI flow to resume.", "The Play Store app is either not installed or not the official version.", map);
        Integer numF5 = AK.c.f(-100, -10, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", "An internal error happened in the Play Store.", map);
        map2.put(-2, "ERROR_UNKNOWN");
        map2.put(numF, "ERROR_API_NOT_AVAILABLE");
        map2.put(-4, "ERROR_INVALID_REQUEST");
        map2.put(numF2, "ERROR_INSTALL_UNAVAILABLE");
        map2.put(-6, "ERROR_INSTALL_NOT_ALLOWED");
        map2.put(numF3, "ERROR_DOWNLOAD_NOT_PRESENT");
        map2.put(-8, "ERROR_INSTALL_IN_PROGRESS");
        map2.put(numF5, "ERROR_INTERNAL_ERROR");
        map2.put(numF4, "ERROR_PLAY_STORE_NOT_FOUND");
        map2.put(-10, "ERROR_APP_NOT_OWNED");
        map2.put(numF5, "ERROR_INTERNAL_ERROR");
    }
}
