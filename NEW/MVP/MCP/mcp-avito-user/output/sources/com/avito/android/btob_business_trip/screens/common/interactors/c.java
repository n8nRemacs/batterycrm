package com.avito.android.btob_business_trip.screens.common.interactors;

import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import uk.InterfaceC49068a;

/* compiled from: B2bBusinessTripInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f107897a;

    /* renamed from: b, reason: collision with root package name */
    public final u f107898b;

    public c(u uVar, u uVar2) {
        this.f107897a = uVar;
        this.f107898b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC49068a) this.f107897a.get(), (R0) this.f107898b.get());
    }
}
