package com.avito.android.payment_list.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PaymentListActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f214995a;

    /* renamed from: b, reason: collision with root package name */
    public final u f214996b;

    public h(u uVar, Provider provider) {
        this.f214995a = provider;
        this.f214996b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f214995a.get(), (com.avito.android.payment_list.domain.a) this.f214996b.get());
    }
}
