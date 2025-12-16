package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.nativeads.ExtendedNativeAdView;

/* loaded from: classes8.dex */
public final class xd {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final com.yandex.div2.H0 f391700a;

    public xd(@Y61.k com.yandex.div2.H0 h02) {
        this.f391700a = h02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
    }

    @Y61.k
    public final u80 a(@Y61.k Context context, @Y61.k AdResponse adResponse, @Y61.k com.yandex.mobile.ads.nativeads.u uVar, @Y61.k sl0 sl0Var) {
        vi viVar = new vi();
        B2 b22 = new B2();
        return new u80(R.layout.monetization_ads_internal_divkit, ExtendedNativeAdView.class, new sk(new rq(context, this.f391700a, viVar, b22, new wd()), new jk0(uVar, b22, sl0Var, viVar)), new yq(adResponse));
    }
}
