package com.avito.android.payment.di.module;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import javax.inject.Provider;

/* compiled from: PaymentGenericFormModule_ProvideItemBinder$_avito_payment_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.payment.di.module.n, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C32987n implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final C32977d f214280a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.payment.items.submit_button_item.a> f214281b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.payment.items.phone_item.b f214282c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<ru.avito.component.info_label.f> f214283d;

    /* renamed from: e, reason: collision with root package name */
    public final dagger.internal.u f214284e;

    public C32987n(C32977d c32977d, Provider provider, com.avito.android.payment.items.phone_item.b bVar, Provider provider2, dagger.internal.u uVar) {
        this.f214280a = c32977d;
        this.f214281b = provider;
        this.f214282c = bVar;
        this.f214283d = provider2;
        this.f214284e = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.payment.items.submit_button_item.a aVar = this.f214281b.get();
        com.avito.android.payment.items.phone_item.a aVar2 = (com.avito.android.payment.items.phone_item.a) this.f214282c.get();
        ru.avito.component.info_label.f fVar = this.f214283d.get();
        com.avito.android.payment.items.text_item.b bVar = (com.avito.android.payment.items.text_item.b) this.f214284e.get();
        this.f214280a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(fVar);
        c10493a.b(bVar);
        return c10493a.a();
    }
}
