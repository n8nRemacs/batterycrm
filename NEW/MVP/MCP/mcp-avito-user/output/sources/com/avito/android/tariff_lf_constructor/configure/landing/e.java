package com.avito.android.tariff_lf_constructor.configure.landing;

import com.avito.android.tariff_lf_constructor.configure.landing.mvi.i;
import com.avito.android.tariff_lf_constructor.configure.landing.mvi.j;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: ConstructorLandingViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final j f299686a;

    public e(j jVar) {
        this.f299686a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        i iVar = (i) this.f299686a.get();
        i2.f411430a.getClass();
        return new d(iVar, i2.a.f411433c);
    }
}
