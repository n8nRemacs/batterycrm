package com.avito.android.universal_transaction.navigation.deeplink;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: TransactionDeeplinkHandlerModule_ProvideTransactionLinkDeeplinkHandlerMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f306484a;

    /* renamed from: b, reason: collision with root package name */
    public final f f306485b;

    public c(d dVar, f fVar) {
        this.f306484a = dVar;
        this.f306485b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f306485b.getClass();
        e eVar = new e();
        d dVar = this.f306484a;
        b.f306483a.getClass();
        return new C43834a(TransactionLink.class, eVar, new C43834a.b.C11809b(dVar));
    }
}
