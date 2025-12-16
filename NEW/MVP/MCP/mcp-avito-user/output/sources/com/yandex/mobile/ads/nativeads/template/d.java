package com.yandex.mobile.ads.nativeads.template;

import com.adjust.sdk.Constants;
import com.yandex.mobile.ads.impl.cn0;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdMedia;
import com.yandex.mobile.ads.nativeads.NativeAdType;
import j.N;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final NativeAdImage f392853a;

    /* renamed from: b, reason: collision with root package name */
    private final NativeAdImage f392854b;

    /* renamed from: c, reason: collision with root package name */
    private final NativeAdImage f392855c;

    /* renamed from: d, reason: collision with root package name */
    private final NativeAdMedia f392856d;

    /* renamed from: e, reason: collision with root package name */
    private final int f392857e;

    public d(@N NativeAdAssets nativeAdAssets, @N NativeAdType nativeAdType) {
        this.f392853a = nativeAdAssets.getFavicon();
        this.f392854b = nativeAdAssets.getIcon();
        this.f392855c = nativeAdAssets.getImage();
        this.f392856d = nativeAdAssets.getMedia();
        this.f392857e = cn0.a(nativeAdType);
    }

    public static boolean a(@N NativeAdImage nativeAdImage) {
        return Constants.LARGE.equals(nativeAdImage.a()) || "wide".equals(nativeAdImage.a());
    }

    public final boolean b() {
        NativeAdImage nativeAdImage;
        return (c() || this.f392853a == null || !(e() || (nativeAdImage = this.f392855c) == null || a(nativeAdImage))) ? false : true;
    }

    public final boolean c() {
        return this.f392854b != null && (2 == this.f392857e || !f());
    }

    public final boolean d() {
        NativeAdImage nativeAdImage;
        return (e() || (nativeAdImage = this.f392855c) == null || !a(nativeAdImage)) ? false : true;
    }

    public final boolean e() {
        return this.f392856d != null;
    }

    public final boolean f() {
        NativeAdImage nativeAdImage;
        return (e() || (nativeAdImage = this.f392855c) == null || a(nativeAdImage) || 2 == this.f392857e) ? false : true;
    }

    public final boolean a() {
        NativeAdImage nativeAdImage;
        return (e() || (nativeAdImage = this.f392855c) == null || !"fill".equals(nativeAdImage.a())) ? false : true;
    }
}
