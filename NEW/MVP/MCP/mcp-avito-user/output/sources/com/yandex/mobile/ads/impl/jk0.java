package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;

/* loaded from: classes8.dex */
public final class jk0 implements up<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.nativeads.u f386896a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final pl f386897b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final NativeAdEventListener f386898c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final qj0 f386899d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final fr f386900e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final vi f386901f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final ac f386902g;

    public jk0(@j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N pl plVar, @j.N NativeAdEventListener nativeAdEventListener, @j.N vi viVar) {
        this(uVar, plVar, nativeAdEventListener, new sj0(), new xq(), viVar, new fr());
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        ll0 ll0VarA = this.f386902g.a(extendedNativeAdView, this.f386899d);
        try {
            fr frVar = this.f386900e;
            Context context = extendedNativeAdView.getContext();
            frVar.getClass();
            if (fr.a(context)) {
                this.f386896a.b(ll0VarA, this.f386901f);
            } else {
                this.f386896a.a(ll0VarA);
            }
            this.f386896a.setNativeAdEventListener(this.f386898c);
        } catch (NativeAdException unused) {
            this.f386897b.e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
        this.f386896a.setNativeAdEventListener(null);
    }

    @j.k0
    public jk0(@j.N com.yandex.mobile.ads.nativeads.u uVar, @j.N pl plVar, @j.N NativeAdEventListener nativeAdEventListener, @j.N sj0 sj0Var, @j.N xq xqVar, @j.N vi viVar, @j.N fr frVar) {
        this.f386896a = uVar;
        this.f386897b = plVar;
        this.f386898c = nativeAdEventListener;
        this.f386899d = sj0Var;
        this.f386902g = new ac(xqVar.a(uVar));
        this.f386901f = viVar;
        this.f386900e = frVar;
    }
}
