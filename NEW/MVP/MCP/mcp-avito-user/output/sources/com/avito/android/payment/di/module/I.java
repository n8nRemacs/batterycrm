package com.avito.android.payment.di.module;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import javax.inject.Provider;

/* compiled from: PaymentStatusFormModule_ProvideItemBinder$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class I implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final F f214208a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.payment.items.submit_button_item.a> f214209b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.payment.items.text_item.b> f214210c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.u f214211d;

    public I(F f12, Provider provider, Provider provider2, dagger.internal.u uVar) {
        this.f214208a = f12;
        this.f214209b = provider;
        this.f214210c = provider2;
        this.f214211d = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.payment.items.submit_button_item.a aVar = this.f214209b.get();
        com.avito.android.payment.items.text_item.b bVar = this.f214210c.get();
        com.avito.android.payment.items.text_item.a aVar2 = (com.avito.android.payment.items.text_item.a) this.f214211d.get();
        this.f214208a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(bVar);
        c10493a.b(aVar2);
        return c10493a.a();
    }
}
