package com.avito.android.advert.item.ownership_cost.dialogs;

import com.avito.android.advert.item.ownership_cost.dialogs.e;
import com.avito.android.util.InterfaceC35770d;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: OwnershipCostDisclaimerContentViewFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f77900a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f77901b;

    public h(dagger.internal.f fVar, u uVar) {
        this.f77900a = uVar;
        this.f77901b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((InterfaceC35770d) this.f77900a.get(), (e.a) this.f77901b.get());
    }
}
