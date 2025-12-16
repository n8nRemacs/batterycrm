package com.avito.android.sx_address.list;

import com.avito.android.sx_address.list.mvi.D;
import com.avito.android.sx_address.list.mvi.E;
import dagger.internal.x;
import dagger.internal.y;
import kotlinx.coroutines.flow.i2;

/* compiled from: SxAddressListViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final E f293207a;

    public i(E e12) {
        this.f293207a = e12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        D d12 = (D) this.f293207a.get();
        i2.f411430a.getClass();
        return new h(d12, i2.a.f411433c);
    }
}
