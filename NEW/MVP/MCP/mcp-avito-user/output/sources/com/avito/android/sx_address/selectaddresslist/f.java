package com.avito.android.sx_address.selectaddresslist;

import com.avito.android.sx_address.selectaddresslist.mvi.p;
import com.avito.android.sx_address.selectaddresslist.mvi.q;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectAddressListViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final q f294091a;

    public f(q qVar) {
        this.f294091a = qVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((p) this.f294091a.get(), null, 2, null);
    }
}
