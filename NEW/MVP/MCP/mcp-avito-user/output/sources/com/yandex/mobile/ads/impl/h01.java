package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.reward.RewardData;
import com.yandex.mobile.ads.rewarded.RewardedAdLoadListener;

/* loaded from: classes8.dex */
public final class h01 extends rx<f01> {

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    private final yv0 f385875D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    private final c01 f385876E;

    public static final class a implements x3 {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        private final v3<h01> f385877a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        private final h01 f385878b;

        public a(@Y61.k v3<h01> v3Var, @Y61.k h01 h01Var) {
            this.f385877a = v3Var;
            this.f385878b = h01Var;
        }

        @Override // com.yandex.mobile.ads.impl.x3
        public final void a() {
            this.f385877a.a(this.f385878b);
        }
    }

    public /* synthetic */ h01(Context context, ko1 ko1Var, v3 v3Var) {
        a4 a4Var = new a4();
        e00 e00Var = new e00();
        g01 g01Var = new g01(context);
        m01 m01Var = new m01(context);
        this(context, ko1Var, v3Var, a4Var, e00Var, g01Var, m01Var, new yv0(context, a4Var, m01Var), new c01());
    }

    public final void a(@Y61.l RewardedAdLoadListener rewardedAdLoadListener) {
        this.f385875D.a(rewardedAdLoadListener);
    }

    @Override // com.yandex.mobile.ads.impl.rx
    @Y61.k
    public final lx<f01> a(@Y61.k mx mxVar) {
        return mxVar.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.re
    public final void a(@Y61.l String str) {
        super.a(str);
        this.f385875D.a(str);
    }

    @Override // com.yandex.mobile.ads.impl.b00, com.yandex.mobile.ads.impl.re, com.yandex.mobile.ads.impl.kz0.b
    public final void a(@Y61.k AdResponse<String> adResponse) {
        RewardData rewardDataC = adResponse.C();
        this.f385876E.getClass();
        if (c01.a(rewardDataC)) {
            super.a(adResponse);
        } else {
            b(i5.f386312d);
        }
    }

    public h01(@Y61.k Context context, @Y61.k ko1 ko1Var, @Y61.k v3<h01> v3Var, @Y61.k a4 a4Var, @Y61.k e00 e00Var, @Y61.k g01 g01Var, @Y61.k m01 m01Var, @Y61.k yv0 yv0Var, @Y61.k c01 c01Var) {
        super(context, ko1Var, y6.f391937d, yv0Var, a4Var, g01Var, e00Var);
        this.f385875D = yv0Var;
        this.f385876E = c01Var;
        yv0Var.a(new a(v3Var, this));
        yv0Var.a(d());
        yv0Var.a(e00Var);
    }
}
