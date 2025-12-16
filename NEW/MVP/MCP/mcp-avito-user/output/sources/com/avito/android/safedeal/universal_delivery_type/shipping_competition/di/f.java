package com.avito.android.safedeal.universal_delivery_type.shipping_competition.di;

import com.avito.android.map_core.beduin.BeduinDeliveryMethodSelectTabAction;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Collections;
import java.util.Set;

/* compiled from: UniversalDeliveryTypeShippingCompetitionModule_ProvideBeduinCustomActionHandlerAssociationsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<Set<gj.f<?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final u f256799a;

    public f(u uVar) {
        this.f256799a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.safedeal.universal_delivery_type.beduin.a aVar = (com.avito.android.safedeal.universal_delivery_type.beduin.a) this.f256799a.get();
        d.f256794a.getClass();
        return Collections.singleton(new gj.f(BeduinDeliveryMethodSelectTabAction.class, aVar));
    }
}
