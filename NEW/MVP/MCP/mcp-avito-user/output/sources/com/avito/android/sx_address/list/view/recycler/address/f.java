package com.avito.android.sx_address.list.view.recycler.address;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.Y1;

/* compiled from: AddressItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f293526a;

    public f(u uVar) {
        this.f293526a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((Y1) this.f293526a.get());
    }
}
