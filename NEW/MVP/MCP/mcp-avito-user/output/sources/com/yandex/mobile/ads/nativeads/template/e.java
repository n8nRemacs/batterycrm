package com.yandex.mobile.ads.nativeads.template;

import com.adjust.sdk.Constants;
import com.yandex.mobile.ads.impl.cn0;
import com.yandex.mobile.ads.nativeads.NativeAdAssets;
import com.yandex.mobile.ads.nativeads.NativeAdImage;
import com.yandex.mobile.ads.nativeads.NativeAdType;
import j.N;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private final int f392858a;

    /* renamed from: b, reason: collision with root package name */
    private final String f392859b;

    /* renamed from: c, reason: collision with root package name */
    private final NativeAdImage f392860c;

    /* renamed from: d, reason: collision with root package name */
    private final Float f392861d;

    /* renamed from: e, reason: collision with root package name */
    private final String f392862e;

    /* renamed from: f, reason: collision with root package name */
    private final String f392863f;

    /* renamed from: g, reason: collision with root package name */
    private final String f392864g;

    /* renamed from: h, reason: collision with root package name */
    private final String f392865h;

    /* renamed from: i, reason: collision with root package name */
    private final String f392866i;

    /* renamed from: j, reason: collision with root package name */
    private final String f392867j;

    /* renamed from: k, reason: collision with root package name */
    private final String f392868k;

    /* renamed from: l, reason: collision with root package name */
    private final NativeAdImage f392869l;

    /* renamed from: m, reason: collision with root package name */
    private final NativeAdImage f392870m;

    public e(@N NativeAdAssets nativeAdAssets, @N NativeAdType nativeAdType) {
        this.f392859b = nativeAdAssets.getCallToAction();
        this.f392860c = nativeAdAssets.getImage();
        this.f392861d = nativeAdAssets.getRating();
        this.f392862e = nativeAdAssets.getReviewCount();
        this.f392863f = nativeAdAssets.getWarning();
        this.f392864g = nativeAdAssets.getAge();
        this.f392865h = nativeAdAssets.getSponsored();
        this.f392866i = nativeAdAssets.getTitle();
        this.f392867j = nativeAdAssets.getBody();
        this.f392868k = nativeAdAssets.getDomain();
        this.f392869l = nativeAdAssets.getIcon();
        this.f392870m = nativeAdAssets.getFavicon();
        this.f392858a = cn0.a(nativeAdType);
    }

    private boolean e() {
        return !((this.f392861d == null && this.f392862e == null) ? false : true);
    }

    public final boolean a() {
        return (this.f392866i == null && this.f392867j == null && this.f392868k == null && this.f392869l == null && this.f392870m == null) ? false : true;
    }

    public final boolean b() {
        return this.f392859b != null && (1 == this.f392858a || e());
    }

    public final boolean c() {
        NativeAdImage nativeAdImage = this.f392860c;
        return nativeAdImage != null && (Constants.LARGE.equals(nativeAdImage.a()) || "wide".equals(this.f392860c.a()));
    }

    public final boolean d() {
        return (this.f392864g == null && this.f392865h == null && !a()) ? false : true;
    }

    public final boolean f() {
        return (this.f392859b == null && this.f392861d == null && this.f392862e == null) ? false : true;
    }

    public final boolean g() {
        return this.f392859b != null && (b() || c());
    }

    public final boolean h() {
        return this.f392863f != null;
    }

    public final boolean i() {
        return b() || (c() && e());
    }
}
