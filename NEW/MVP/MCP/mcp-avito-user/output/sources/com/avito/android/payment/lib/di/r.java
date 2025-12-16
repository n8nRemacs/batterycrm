package com.avito.android.payment.lib.di;

import com.avito.android.payment.lib.di.d;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentMethodsModule_RecyclerViewDeclarations_ProvideItemBinder$_avito_payment_lib_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class r implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f214649a;

    public r(dagger.internal.u uVar) {
        this.f214649a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        ru.avito.component.payments.method.list.material.a aVar = (ru.avito.component.payments.method.list.material.a) this.f214649a.get();
        int i12 = d.b.f214621a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        return c10493a.a();
    }
}
