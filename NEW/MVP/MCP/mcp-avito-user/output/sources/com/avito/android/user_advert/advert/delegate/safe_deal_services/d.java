package com.avito.android.user_advert.advert.delegate.safe_deal_services;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SafeDealServicesPresenterDelegateImpl_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f308809a;

    /* renamed from: b, reason: collision with root package name */
    public final u f308810b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.advert_core.safedeal.c f308811c;

    public d(u uVar, u uVar2, com.avito.android.advert_core.safedeal.c cVar) {
        this.f308809a = uVar;
        this.f308810b = uVar2;
        this.f308811c = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.advert_core.safedeal.d) this.f308809a.get(), (InterfaceC35745a5) this.f308810b.get(), (com.avito.android.advert_core.safedeal.b) this.f308811c.get());
    }
}
