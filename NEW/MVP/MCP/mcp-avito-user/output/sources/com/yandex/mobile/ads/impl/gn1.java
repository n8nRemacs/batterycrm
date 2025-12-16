package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewTreeObserver;

/* loaded from: classes8.dex */
public final class gn1 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.banner.h f385785a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final n2 f385786b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    private final com.yandex.mobile.ads.banner.d f385787c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    private final na0 f385788d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    private final n70 f385789e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    private final a f385790f;

    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final com.yandex.mobile.ads.banner.h f385791b;

        public a(@Y61.k com.yandex.mobile.ads.banner.h hVar) {
            this.f385791b = hVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            fj1.a(this.f385791b, false);
        }
    }

    public gn1(@Y61.k Context context, @Y61.k com.yandex.mobile.ads.banner.h hVar, @Y61.k n2 n2Var, @Y61.k com.yandex.mobile.ads.banner.d dVar, @Y61.k na0 na0Var, @Y61.k n70 n70Var, @Y61.k a aVar) {
        this.f385785a = hVar;
        this.f385786b = n2Var;
        this.f385787c = dVar;
        this.f385788d = na0Var;
        this.f385789e = n70Var;
        this.f385790f = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.f385787c.k();
        this.f385789e.a(this.f385786b, this.f385785a);
        this.f385788d.a(this.f385790f);
        return true;
    }

    public /* synthetic */ gn1(Context context, com.yandex.mobile.ads.banner.h hVar, n2 n2Var, com.yandex.mobile.ads.banner.d dVar) {
        this(context, hVar, n2Var, dVar, new na0(), new n70(context), new a(hVar));
    }
}
