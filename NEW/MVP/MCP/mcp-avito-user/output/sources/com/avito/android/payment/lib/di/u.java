package com.avito.android.payment.lib.di;

import android.app.Activity;
import com.avito.android.payment.lib.di.d;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: PaymentMethodsModule_RecyclerViewDeclarations_ProvidePaymentMethodWidthProvider$_avito_payment_lib_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class u implements dagger.internal.h<ru.avito.component.payments.method.list.material.f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f214652a;

    public u(dagger.internal.l lVar) {
        this.f214652a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Activity activity = (Activity) this.f214652a.f393949a;
        int i12 = d.b.f214621a;
        return new ru.avito.component.payments.method.list.material.f(activity);
    }
}
