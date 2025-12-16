package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.interstitial.InterstitialAdLoadListener;

/* loaded from: classes8.dex */
public final class s70 extends rx<q70> {

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    private final wv0 f389804D;

    public static final class a implements x3 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final v3<s70> f389805a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final s70 f389806b;

        public a(@Y61.k v3<s70> v3Var, @Y61.k s70 s70Var) {
            this.f389805a = v3Var;
            this.f389806b = s70Var;
        }

        @Override // com.yandex.mobile.ads.impl.x3
        public final void a() {
            this.f389805a.a(this.f389806b);
        }
    }

    public /* synthetic */ s70(Context context, ko1 ko1Var, v3 v3Var) {
        a4 a4Var = new a4();
        e00 e00Var = new e00();
        r70 r70Var = new r70(context);
        x70 x70Var = new x70(context);
        this(context, ko1Var, v3Var, a4Var, e00Var, r70Var, x70Var, new wv0(context, a4Var, x70Var));
    }

    public final void a(@Y61.l InterstitialAdLoadListener interstitialAdLoadListener) {
        this.f389804D.a(interstitialAdLoadListener);
    }

    @Override // com.yandex.mobile.ads.impl.rx
    @Y61.k
    public final lx<q70> a(@Y61.k mx mxVar) {
        return mxVar.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.re
    public final void a(@Y61.l String str) {
        super.a(str);
        this.f389804D.a(str);
    }

    public s70(@Y61.k Context context, @Y61.k ko1 ko1Var, @Y61.k v3<s70> v3Var, @Y61.k a4 a4Var, @Y61.k e00 e00Var, @Y61.k r70 r70Var, @Y61.k x70 x70Var, @Y61.k wv0 wv0Var) {
        super(context, ko1Var, y6.f391936c, wv0Var, a4Var, r70Var, e00Var);
        this.f389804D = wv0Var;
        wv0Var.a(new a(v3Var, this));
        wv0Var.a(d());
        wv0Var.a(e00Var);
    }
}
