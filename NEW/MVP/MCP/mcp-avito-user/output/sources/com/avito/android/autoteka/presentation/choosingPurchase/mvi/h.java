package com.avito.android.autoteka.presentation.choosingPurchase.mvi;

import com.avito.android.autoteka.deeplinks.ChoosingPurchaseDetails;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AutotekaChoosingPurchaseBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.choosingProduct.a> f97192a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f97193b;

    /* renamed from: c, reason: collision with root package name */
    public final u f97194c;

    /* renamed from: d, reason: collision with root package name */
    public final If.g f97195d;

    public h(Provider provider, dagger.internal.l lVar, u uVar, If.g gVar) {
        this.f97192a = provider;
        this.f97193b = lVar;
        this.f97194c = uVar;
        this.f97195d = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f97192a.get(), (ChoosingPurchaseDetails) this.f97193b.f393949a, (com.avito.android.deeplink_handler.handler.composite.a) this.f97194c.get(), (If.f) this.f97195d.get());
    }
}
