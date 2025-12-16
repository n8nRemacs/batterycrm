package com.avito.android.payment.lib.di;

import androidx.recyclerview.widget.C;
import com.avito.android.payment.lib.di.d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentMethodsModule_RecyclerViewDeclarations_ProvideListUpdateListenerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class s implements dagger.internal.h<C> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.f f214650a;

    public s(dagger.internal.f fVar) {
        this.f214650a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.j jVar = (com.avito.konveyor.adapter.j) this.f214650a.get();
        int i12 = d.b.f214621a;
        return jVar;
    }
}
