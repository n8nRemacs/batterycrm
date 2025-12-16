package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.common.BidderTokenLoadListener;
import com.yandex.mobile.ads.impl.p21;

/* loaded from: classes8.dex */
final class in1 implements p21.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f386559a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ BidderTokenLoadListener f386560b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ jn1 f386561c;

    public in1(jn1 jn1Var, Context context, BidderTokenLoadListener bidderTokenLoadListener) {
        this.f386561c = jn1Var;
        this.f386559a = context;
        this.f386560b = bidderTokenLoadListener;
    }

    @Override // com.yandex.mobile.ads.impl.p21.a
    public final void a(@j.N q8 q8Var, @j.N ts tsVar) {
        String strA = this.f386561c.f386929b.a(this.f386559a, q8Var, tsVar);
        if (strA == null) {
            this.f386561c.f386930c.post(new J0(this.f386560b, 1));
        } else {
            this.f386561c.f386930c.post(new H(2, this.f386560b, strA));
        }
    }

    @Override // com.yandex.mobile.ads.impl.p21.a
    public final void a(@j.N w2 w2Var) {
        this.f386561c.f386930c.post(new J0(this.f386560b, 0));
    }
}
