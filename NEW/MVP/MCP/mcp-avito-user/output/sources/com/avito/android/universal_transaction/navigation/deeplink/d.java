package com.avito.android.universal_transaction.navigation.deeplink;

import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TransactionDeeplinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final DG0.c f306486a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f306487b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.navigation.c f306488c;

    public d(DG0.c cVar, dv.b bVar, com.avito.android.navigation.c cVar2) {
        this.f306486a = cVar;
        this.f306487b = bVar;
        this.f306488c = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((DG0.a) this.f306486a.get(), (a.InterfaceC4053a) this.f306487b.get(), (com.avito.android.navigation.a) this.f306488c.get());
    }
}
