package com.avito.android.cpx_promo.v2;

import com.avito.android.cpx_promo.v2.mvi.s;
import com.avito.android.cpx_promo.v2.mvi.t;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: CpxPromoV2ViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final t f127781a;

    public r(t tVar) {
        this.f127781a = tVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        s sVar = (s) this.f127781a.get();
        i2.f411430a.getClass();
        return new q(sVar, i2.a.f411433c);
    }
}
