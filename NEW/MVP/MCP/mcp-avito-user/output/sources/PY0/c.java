package PY0;

import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.play:feature-delivery@@2.0.1 */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f13132a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f13133b;

    /* renamed from: c, reason: collision with root package name */
    public static final HashMap f13134c;

    static {
        HashMap map = new HashMap();
        f13132a = map;
        HashMap map2 = new HashMap();
        f13133b = map2;
        Integer numF = AK.c.f(-2, -1, "Too many sessions are running for current app, existing sessions must be resolved first.", "A requested module is not available (to this user/device, for the installed apk).", map);
        Integer numF2 = AK.c.f(-4, -3, "Request is otherwise invalid.", "Requested session is not found.", map);
        Integer numF3 = AK.c.f(-6, -5, "Split Install API is not available.", "Network error: unable to obtain split details.", map);
        Integer numF4 = AK.c.f(-8, -7, "Download not permitted under current device circumstances (e.g. in background).", "Requested session contains modules from an existing active session and also new modules.", map);
        Integer numF5 = AK.c.f(-10, -9, "Service handling split install has died.", "Install failed due to insufficient storage.", map);
        Integer numF6 = AK.c.f(-12, -11, "Signature verification error when invoking SplitCompat.", "Error in SplitCompat emulation.", map);
        Integer numF7 = AK.c.f(-14, -13, "Error in copying files for SplitCompat.", "The Play Store app is either not installed or not the official version.", map);
        Integer numF8 = AK.c.f(-100, -15, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", "Unknown error processing split install.", map);
        map2.put(-1, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        map2.put(numF, "MODULE_UNAVAILABLE");
        map2.put(-3, "INVALID_REQUEST");
        map2.put(numF2, "DOWNLOAD_NOT_FOUND");
        map2.put(-5, "API_NOT_AVAILABLE");
        map2.put(numF3, "NETWORK_ERROR");
        map2.put(-7, "ACCESS_DENIED");
        map2.put(numF4, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        map2.put(-9, "SERVICE_DIED");
        map2.put(numF5, "INSUFFICIENT_STORAGE");
        map2.put(-11, "SPLITCOMPAT_VERIFICATION_ERROR");
        map2.put(numF6, "SPLITCOMPAT_EMULATION_ERROR");
        map2.put(-13, "SPLITCOMPAT_COPY_ERROR");
        map2.put(numF7, "PLAY_STORE_NOT_FOUND");
        map2.put(-15, "APP_NOT_OWNED");
        map2.put(numF8, "INTERNAL_ERROR");
        f13134c = new HashMap();
        for (Map.Entry entry : map2.entrySet()) {
            f13134c.put((String) entry.getValue(), (Integer) entry.getKey());
        }
    }
}
