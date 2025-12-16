package com.avito.android.autoteka.presentation.choosingPurchase.mvi;

import com.avito.android.autoteka.deeplinks.ChoosingPurchaseDetails;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AutotekaChoosingPurchaseOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f97209a;

    /* renamed from: b, reason: collision with root package name */
    public final u f97210b;

    /* renamed from: c, reason: collision with root package name */
    public final u f97211c;

    public o(dagger.internal.l lVar, u uVar, u uVar2) {
        this.f97209a = lVar;
        this.f97210b = uVar;
        this.f97211c = uVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n((ChoosingPurchaseDetails) this.f97209a.f393949a, (com.avito.android.autoteka.data.a) this.f97210b.get(), (com.avito.android.deeplink_handler.handler.composite.a) this.f97211c.get());
    }
}
