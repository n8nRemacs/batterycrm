package NY0;

import AK.c;
import java.util.HashMap;

/* compiled from: com.google.android.play:review@@2.0.1 */
/* loaded from: classes6.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f11590a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f11591b;

    static {
        HashMap map = new HashMap();
        f11590a = map;
        HashMap map2 = new HashMap();
        f11591b = map2;
        Integer numF = c.f(-2, -1, "The Play Store app is either not installed or not the official version.", "Call first requestReviewFlow to get the ReviewInfo.", map);
        map.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        map2.put(-1, "PLAY_STORE_NOT_FOUND");
        map2.put(numF, "INVALID_REQUEST");
        map2.put(-100, "INTERNAL_ERROR");
    }
}
