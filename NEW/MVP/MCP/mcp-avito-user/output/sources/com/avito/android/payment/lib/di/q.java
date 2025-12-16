package com.avito.android.payment.lib.di;

import com.avito.android.payment.lib.di.d;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentMethodsModule_RecyclerViewDeclarations_ProvideHorizontalMaterialPaymentMethodBlueprint$_avito_payment_lib_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class q implements dagger.internal.h<ru.avito.component.payments.method.list.material.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ru.avito.component.payments.method.list.material.f> f214647a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f214648b;

    public q(dagger.internal.u uVar, Provider provider) {
        this.f214647a = provider;
        this.f214648b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        ru.avito.component.payments.method.list.material.f fVar = this.f214647a.get();
        ru.avito.component.payments.method.list.material.d dVar = (ru.avito.component.payments.method.list.material.d) this.f214648b.get();
        int i12 = d.b.f214621a;
        return new ru.avito.component.payments.method.list.material.a(dVar, fVar);
    }
}
