package com.avito.android.lf_levels.di;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LfLevelsListModule_ProvideItemBinder$_avito_lf_levels_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.lf_levels.ui.items.business_tools_header.c f175354a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.lf_levels.ui.items.business_tool.c f175355b;

    public f(com.avito.android.lf_levels.ui.items.business_tools_header.c cVar, com.avito.android.lf_levels.ui.items.business_tool.c cVar2) {
        this.f175354a = cVar;
        this.f175355b = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.lf_levels.ui.items.business_tools_header.b bVar = (com.avito.android.lf_levels.ui.items.business_tools_header.b) this.f175354a.get();
        com.avito.android.lf_levels.ui.items.business_tool.b bVar2 = (com.avito.android.lf_levels.ui.items.business_tool.b) this.f175355b.get();
        d.f175352a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(bVar);
        c10493a.b(bVar2);
        return c10493a.a();
    }
}
