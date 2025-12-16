package com.avito.android.safedeal.universal_delivery_type.di;

import com.avito.android.beduin_shared.model.action.custom.reloadScreen.BeduinReloadScreenAction;
import com.avito.android.map_core.beduin.BeduinDeliveryMethodSelectTabAction;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: UniversalDeliveryTypeModule_ProvideBeduinCustomActionHandlerAssociationsFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<Set<gj.f<?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final k f256607a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.safedeal.universal_delivery_type.beduin.a> f256608b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f256609c;

    public n(k kVar, Provider provider, dagger.internal.u uVar) {
        this.f256607a = kVar;
        this.f256608b = provider;
        this.f256609c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.safedeal.universal_delivery_type.beduin.a aVar = this.f256608b.get();
        Wi.b bVar = (Wi.b) this.f256609c.get();
        this.f256607a.getClass();
        Set setL0 = C42756l.l0(new gj.f[]{new gj.f(BeduinDeliveryMethodSelectTabAction.class, aVar), new gj.f(BeduinReloadScreenAction.class, bVar)});
        dagger.internal.t.d(setL0);
        return setL0;
    }
}
