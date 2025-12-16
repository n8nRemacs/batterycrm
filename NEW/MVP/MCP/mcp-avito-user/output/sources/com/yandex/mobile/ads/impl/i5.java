package com.yandex.mobile.ads.impl;

import androidx.media3.exoplayer.C23179x;
import java.util.Locale;

/* loaded from: classes8.dex */
public abstract class i5 {

    /* renamed from: a, reason: collision with root package name */
    public static final w2 f386309a = new w2(1, "Received unsupported ad type", "Received unsupported ad type. We are already working on this issue.");

    /* renamed from: b, reason: collision with root package name */
    public static final w2 f386310b = new w2(5, "android.webkit.WebView database is inoperable", "android.webkit.WebViewDatabase is inoperable. Try using another device for testing.");

    /* renamed from: c, reason: collision with root package name */
    public static final w2 f386311c = new w2(1, "Internal state wasn't completely configured", "Internal state wasn't completely configured. Please try again later.");

    /* renamed from: d, reason: collision with root package name */
    public static final w2 f386312d = new w2(1, "Incorrect data in server response", "Failed to parse server's response. We are already working on this issue.");

    /* renamed from: e, reason: collision with root package name */
    public static final w2 f386313e = new w2(5, "android.webkit.WebView creation failed", "android.webkit.WebView creation failed. Try using another device for testing.");

    /* renamed from: f, reason: collision with root package name */
    public static final w2 f386314f = new w2(1, "Invalid server response code", "Unexpected server response code. We are already working on this issue.");

    /* renamed from: g, reason: collision with root package name */
    public static final w2 f386315g = new w2(1, "Ad request failed with unexpected exception", "Ad request failed with unexpected exception");

    /* renamed from: h, reason: collision with root package name */
    public static final w2 f386316h = new w2(1, "Service temporarily unavailable", "Service temporarily unavailable. Please try again later.");

    /* renamed from: i, reason: collision with root package name */
    public static final w2 f386317i = new w2(1, "The loaded banner can't fit in the container.", "The loaded banner can't fit in the container.");

    /* renamed from: j, reason: collision with root package name */
    public static final w2 f386318j = new w2(1, "Banner rendering failed with timeout", "Banner rendering failed with timeout. Please try again.");

    /* renamed from: k, reason: collision with root package name */
    public static final w2 f386319k = new w2(1, "Invalid SDK state.", "Invalid SDK state.");

    /* renamed from: l, reason: collision with root package name */
    public static final w2 f386320l = new w2(4, "Ad request completed successfully, but there are no ads available.", "Ad request completed successfully, but there are no ads available.");

    /* renamed from: m, reason: collision with root package name */
    public static final w2 f386321m = new w2(3, "Ad request failed with network error", "Ad request failed with network error. Please try again later.");

    /* renamed from: n, reason: collision with root package name */
    public static final w2 f386322n = new w2(2, "Ad request configured incorrectly", "Ad request configured incorrectly");

    /* renamed from: o, reason: collision with root package name */
    public static final w2 f386323o = new w2(2, "Invalid request parameters", "Invalid request parameters");

    /* renamed from: p, reason: collision with root package name */
    public static final w2 f386324p = new w2(2, "Invalid Ad Unit Id. AdUnitId should be not empty string", "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.");

    /* renamed from: q, reason: collision with root package name */
    public static final w2 f386325q = new w2(2, "Invalid ad size. Please, specify AdSize excplicitly", "Invalid ad size. Set the ad size using the 'setAdSize' method.");

    /* renamed from: r, reason: collision with root package name */
    public static final w2 f386326r = new w2(1, "Invalid sdk configuration. Please request another ad.", "Invalid sdk configuration. Please request another ad.");

    /* renamed from: s, reason: collision with root package name */
    public static final w2 f386327s = new w2(0, "Unknown error", "Unknown error");

    @j.N
    public static w2 a(@j.P String str) {
        String str2;
        String str3;
        if (str == null || str.isEmpty()) {
            str2 = "Invalid AdUnitId. Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
            str3 = "Invalid Ad Unit Id. AdUnitId should be not empty string";
        } else {
            str2 = "Provided AdUnitId '%s' does not exist! Please set the AdUnitId using the setAdUnitId method. AdUnitId is a unique identifier in R-M-XXXXXX-Y format, which is assigned in the Partner Interface.";
            str3 = "Provided ad unit id doesn't exist";
        }
        return new w2(2, str3, String.format(Locale.US, str2, str));
    }

    @j.N
    public static w2 a(int i12, int i13, int i14, int i15, int i16, int i17) {
        Locale locale = Locale.US;
        StringBuilder sbY = androidx.appcompat.app.r.y(i12, i13, "Ad was loaded successfully, but there is not enough space to display it. Requested size: [", "x", "], Received size : [");
        C23179x.a(sbY, i14, "x", i15, "], device screen size: [");
        sbY.append(i16);
        sbY.append("x");
        sbY.append(i17);
        sbY.append("].");
        return new w2(1, "Ad was loaded successfully, but there is not enough space to display it", sbY.toString());
    }

    public static w2 a(@j.N String str, @j.N String str2) {
        return new w2(1, str, str2);
    }
}
