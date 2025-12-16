package com.avito.android.gig_motivation_payment.ui.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MotivationPaymentFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final m f160267a;

    /* renamed from: b, reason: collision with root package name */
    public final i f160268b;

    /* renamed from: c, reason: collision with root package name */
    public final r f160269c;

    /* renamed from: d, reason: collision with root package name */
    public final t f160270d;

    public p(m mVar, i iVar, r rVar, t tVar) {
        this.f160267a = mVar;
        this.f160268b = iVar;
        this.f160269c = rVar;
        this.f160270d = tVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        l lVar = (l) this.f160267a.get();
        h hVar = (h) this.f160268b.get();
        this.f160269c.getClass();
        q qVar = new q();
        this.f160270d.getClass();
        s sVar = new s();
        vH.c.f440638a.getClass();
        return new o("MotivationPayment", vH.c.f440639b, new n(lVar, hVar, sVar, qVar));
    }
}
