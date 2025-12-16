package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;
import com.yandex.mobile.ads.nativeads.NativeAd;
import com.yandex.mobile.ads.nativeads.NativeAdEventListener;
import com.yandex.mobile.ads.nativeads.NativeAdException;
import java.util.Iterator;

/* loaded from: classes8.dex */
final class y41 implements up<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final z41 f391924a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final pl f391925b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final vi f391926c;

    /* renamed from: d, reason: collision with root package name */
    @j.N
    private final qj0 f391927d;

    /* renamed from: e, reason: collision with root package name */
    @j.N
    private final il0 f391928e;

    /* renamed from: f, reason: collision with root package name */
    @j.N
    private final fr f391929f;

    /* renamed from: g, reason: collision with root package name */
    @j.N
    private final ac f391930g;

    public y41(@j.N z41 z41Var, @j.N pl plVar, @j.N NativeAdEventListener nativeAdEventListener, @j.N vi viVar) {
        this(z41Var, plVar, viVar, new sj0(), new il0(z41Var, nativeAdEventListener), new fr(), new xq());
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        try {
            ll0 ll0VarA = this.f391930g.a(extendedNativeAdView, this.f391927d);
            fr frVar = this.f391929f;
            Context context = extendedNativeAdView.getContext();
            frVar.getClass();
            if (fr.a(context)) {
                this.f391924a.a(ll0VarA, this.f391926c);
            } else {
                this.f391924a.b(ll0VarA);
            }
            cr.a().a(this.f391928e);
        } catch (NativeAdException unused) {
            this.f391925b.e();
        }
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
        cr.a().b(this.f391928e);
        Iterator<NativeAd> it = this.f391924a.getNativeAds().iterator();
        while (it.hasNext()) {
            it.next().setNativeAdEventListener(null);
        }
    }

    @j.k0
    public y41(@j.N z41 z41Var, @j.N pl plVar, @j.N vi viVar, @j.N sj0 sj0Var, @j.N il0 il0Var, @j.N fr frVar, @j.N xq xqVar) {
        this.f391924a = z41Var;
        this.f391925b = plVar;
        this.f391926c = viVar;
        this.f391927d = sj0Var;
        this.f391928e = il0Var;
        this.f391929f = frVar;
        this.f391930g = new ac(xqVar.a(z41Var));
    }
}
