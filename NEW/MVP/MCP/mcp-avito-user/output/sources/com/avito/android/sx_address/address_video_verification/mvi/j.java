package com.avito.android.sx_address.address_video_verification.mvi;

import com.avito.android.sx_address.address_video_verification.mvi.entity.SxAddressVideoVerificationState;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SxAddressVideoVerificationFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final g f292715a;

    /* renamed from: b, reason: collision with root package name */
    public final e f292716b;

    /* renamed from: c, reason: collision with root package name */
    public final l f292717c;

    /* renamed from: d, reason: collision with root package name */
    public final n f292718d;

    public j(g gVar, e eVar, l lVar, n nVar) {
        this.f292715a = gVar;
        this.f292716b = eVar;
        this.f292717c = lVar;
        this.f292718d = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        f fVar = (f) this.f292715a.get();
        a aVar = (a) this.f292716b.get();
        this.f292717c.getClass();
        k kVar = new k();
        this.f292718d.getClass();
        m mVar = new m();
        SxAddressVideoVerificationState.f292694e.getClass();
        return new i("SxAddressVideoVerification", SxAddressVideoVerificationState.f292695f, new h(fVar, aVar, mVar, kVar));
    }
}
