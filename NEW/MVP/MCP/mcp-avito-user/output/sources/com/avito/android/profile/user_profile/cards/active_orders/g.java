package com.avito.android.profile.user_profile.cards.active_orders;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ActiveOrdersCardPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class g implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f224662a;

    /* renamed from: b, reason: collision with root package name */
    public final u f224663b;

    public g(dagger.internal.l lVar, u uVar) {
        this.f224662a = lVar;
        this.f224663b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new f((Y41.l) this.f224662a.f393949a, (com.avito.konveyor.adapter.d) this.f224663b.get());
    }
}
