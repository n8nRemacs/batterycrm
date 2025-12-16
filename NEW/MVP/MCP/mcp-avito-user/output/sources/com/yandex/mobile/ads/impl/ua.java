package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.appopenad.AppOpenAdLoadListener;

/* loaded from: classes8.dex */
public final class ua extends rx<sa> {

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    private final uv0 f390499D;

    public static final class a implements x3 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final v3<ua> f390500a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final ua f390501b;

        public a(@Y61.k v3<ua> v3Var, @Y61.k ua uaVar) {
            this.f390500a = v3Var;
            this.f390501b = uaVar;
        }

        @Override // com.yandex.mobile.ads.impl.x3
        public final void a() {
            this.f390500a.a(this.f390501b);
        }
    }

    public /* synthetic */ ua(Context context, ko1 ko1Var, v3 v3Var) {
        a4 a4Var = new a4();
        this(context, ko1Var, v3Var, a4Var, new e00(), new ta(context), new uv0(context, a4Var));
    }

    public final void a(@Y61.l AppOpenAdLoadListener appOpenAdLoadListener) {
        this.f390499D.a(appOpenAdLoadListener);
    }

    @Override // com.yandex.mobile.ads.impl.rx
    @Y61.k
    public final lx<sa> a(@Y61.k mx mxVar) {
        return mxVar.c(this);
    }

    public ua(@Y61.k Context context, @Y61.k ko1 ko1Var, @Y61.k v3<ua> v3Var, @Y61.k a4 a4Var, @Y61.k e00 e00Var, @Y61.k ta taVar, @Y61.k uv0 uv0Var) {
        super(context, ko1Var, y6.f391941h, uv0Var, a4Var, taVar, e00Var);
        this.f390499D = uv0Var;
        uv0Var.a(new a(v3Var, this));
        uv0Var.a(e00Var);
        uv0Var.a(d());
    }
}
