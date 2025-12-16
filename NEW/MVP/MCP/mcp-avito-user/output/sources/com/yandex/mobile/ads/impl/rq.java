package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.div.core.view2.C38029k;
import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class rq implements up<ExtendedNativeAdView> {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.div2.H0 f389604a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    private final jr f389605b;

    /* renamed from: c, reason: collision with root package name */
    @j.N
    private final pq f389606c;

    public rq(@j.N Context context, @j.N com.yandex.div2.H0 h02, @j.N vi viVar, @j.N pl plVar, @j.N qq qqVar) {
        this(h02, new jr(), new pq(context, viVar, plVar, qqVar));
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void a(@j.N ViewGroup viewGroup) {
        ExtendedNativeAdView extendedNativeAdView = (ExtendedNativeAdView) viewGroup;
        try {
            Context context = extendedNativeAdView.getContext();
            this.f389605b.getClass();
            C38029k c38029kA = jr.a(context);
            extendedNativeAdView.addView(c38029kA);
            c38029kA.s(this.f389604a, new q21.c(UUID.randomUUID().toString()));
            c38029kA.setActionHandler(this.f389606c);
        } catch (Throwable unused) {
        }
    }

    @j.k0
    public rq(@j.N com.yandex.div2.H0 h02, @j.N jr jrVar, @j.N pq pqVar) {
        this.f389604a = h02;
        this.f389605b = jrVar;
        this.f389606c = pqVar;
    }

    @Override // com.yandex.mobile.ads.impl.up
    public final void c() {
    }
}
