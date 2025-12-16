package HY0;

import java.util.HashMap;

/* compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* loaded from: classes6.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final HashMap f7274a;

    /* renamed from: b, reason: collision with root package name */
    public static final HashMap f7275b;

    static {
        HashMap map = new HashMap();
        f7274a = map;
        HashMap map2 = new HashMap();
        f7275b = map2;
        Integer numF = AK.c.f(-2, -1, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).", "The requested pack is not available.", map);
        Integer numF2 = AK.c.f(-4, -3, "The request is invalid.", "The requested download is not found.", map);
        Integer numF3 = AK.c.f(-6, -5, "The Asset Delivery API is not available.", "Network error. Unable to obtain the asset pack details.", map);
        Integer numF4 = AK.c.f(-10, -7, "Download not permitted under current device circumstances (e.g. in background).", "Asset pack download failed due to insufficient storage.", map);
        Integer numF5 = AK.c.f(-12, -11, "The Play Store app is either not installed or not the official version.", "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.", map);
        Integer numF6 = AK.c.f(-100, -13, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", "Unknown error downloading an asset pack.", map);
        map2.put(-1, "APP_UNAVAILABLE");
        map2.put(numF, "PACK_UNAVAILABLE");
        map2.put(-3, "INVALID_REQUEST");
        map2.put(numF2, "DOWNLOAD_NOT_FOUND");
        map2.put(-5, "API_NOT_AVAILABLE");
        map2.put(numF3, "NETWORK_ERROR");
        map2.put(-7, "ACCESS_DENIED");
        map2.put(numF4, "INSUFFICIENT_STORAGE");
        map2.put(-11, "PLAY_STORE_NOT_FOUND");
        map2.put(numF5, "NETWORK_UNRESTRICTED");
        map2.put(-13, "APP_NOT_OWNED");
        map2.put(numF6, "INTERNAL_ERROR");
    }
}
