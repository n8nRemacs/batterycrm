package com.avito.android.vas_performance.di.visual_legacy;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LegacyVisualVasListModule_ProvideItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class m implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final k f320184a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.vas_performance.screens.visual.item.header.c f320185b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.c f320186c;

    public m(k kVar, com.avito.android.vas_performance.screens.visual.item.header.c cVar, com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.c cVar2) {
        this.f320184a = kVar;
        this.f320185b = cVar;
        this.f320186c = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.vas_performance.screens.visual.item.header.b bVar = (com.avito.android.vas_performance.screens.visual.item.header.b) this.f320185b.get();
        com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.b bVar2 = (com.avito.android.vas_performance.ui.items.visual_vas_item_legacy.b) this.f320186c.get();
        this.f320184a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        return c10493a.a();
    }
}
