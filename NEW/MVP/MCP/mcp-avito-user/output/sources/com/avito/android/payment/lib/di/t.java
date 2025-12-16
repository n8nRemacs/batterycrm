package com.avito.android.payment.lib.di;

import arrow.core.C23678f0;
import com.avito.android.payment.lib.di.d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentMethodsModule_RecyclerViewDeclarations_ProvideMaterialPaymentMethodItemPresenter$_avito_payment_lib_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class t implements dagger.internal.h<ru.avito.component.payments.method.list.material.d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f214651a;

    public t(dagger.internal.l lVar) {
        this.f214651a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        C23678f0 c23678f0 = (C23678f0) this.f214651a.f393949a;
        int i12 = d.b.f214621a;
        return new ru.avito.component.payments.method.list.material.d(e.f214622l, new f(c23678f0));
    }
}
