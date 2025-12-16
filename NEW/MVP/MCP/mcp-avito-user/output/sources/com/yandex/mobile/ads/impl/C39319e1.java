package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdException;

/* renamed from: com.yandex.mobile.ads.impl.e1, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C39319e1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.nativeads.u f384721a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final pl f384722b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final qj0 f384723c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final ac f384724d;

    public C39319e1(@Y61.k com.yandex.mobile.ads.nativeads.u uVar, @Y61.k pl plVar, @Y61.k qj0 qj0Var, @Y61.k ac acVar) {
        this.f384721a = uVar;
        this.f384722b = plVar;
        this.f384723c = qj0Var;
        this.f384724d = acVar;
    }

    public final boolean a(@Y61.k ExtendedNativeAdView extendedNativeAdView) {
        try {
            if (this.f384721a instanceof z41) {
                ((z41) this.f384721a).b(this.f384724d.a(extendedNativeAdView, this.f384723c));
            }
            return true;
        } catch (NativeAdException unused) {
            this.f384722b.e();
            return false;
        }
    }

    public /* synthetic */ C39319e1(com.yandex.mobile.ads.nativeads.u uVar, pl plVar) {
        this(uVar, plVar, new sj0(), new ac());
    }
}
