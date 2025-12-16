package com.avito.android.sx_address.list.mvi;

/* compiled from: SxAddressListReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes4.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f293223a;

    public I(dagger.internal.u uVar) {
        this.f293223a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new H((com.avito.android.sx_address.list.mvi.entity.d) this.f293223a.get());
    }
}
