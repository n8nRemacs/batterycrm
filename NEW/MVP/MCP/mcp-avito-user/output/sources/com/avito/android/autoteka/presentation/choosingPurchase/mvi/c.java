package com.avito.android.autoteka.presentation.choosingPurchase.mvi;

import If.C14097b;
import If.C14098c;
import com.avito.android.autoteka.deeplinks.ChoosingPurchaseDetails;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaChoosingPurchaseActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.autoteka.data.j f97138a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f97139b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.choosingProduct.a> f97140c;

    /* renamed from: d, reason: collision with root package name */
    public final C14098c f97141d;

    /* renamed from: e, reason: collision with root package name */
    public final If.e f97142e;

    public c(com.avito.android.autoteka.data.j jVar, dagger.internal.l lVar, Provider provider, C14098c c14098c, If.e eVar) {
        this.f97138a = jVar;
        this.f97139b = lVar;
        this.f97140c = provider;
        this.f97141d = c14098c;
        this.f97142e = eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.autoteka.data.i) this.f97138a.get(), (ChoosingPurchaseDetails) this.f97139b.f393949a, this.f97140c.get(), (C14097b) this.f97141d.get(), (If.d) this.f97142e.get());
    }
}
