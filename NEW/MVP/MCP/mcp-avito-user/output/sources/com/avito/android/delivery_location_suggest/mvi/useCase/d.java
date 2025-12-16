package com.avito.android.delivery_location_suggest.mvi.useCase;

import com.avito.android.delivery_location_suggest.l;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LoadCoordsUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f135197a;

    public d(u uVar) {
        this.f135197a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((l) this.f135197a.get());
    }
}
