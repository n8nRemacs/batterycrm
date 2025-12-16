package com.avito.android.publish.slots.group_inlined_block;

import com.avito.android.blueprints.input.C28877b;
import com.avito.android.blueprints.input.C28878c;
import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GroupInlinedBlockModule_ProvideGroupInlinedBlockItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.blueprints.switcher.a> f244020a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.blueprint.switcher.a> f244021b;

    /* renamed from: c, reason: collision with root package name */
    public final C28878c f244022c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.blueprint.input.b f244023d;

    public i(Provider provider, Provider provider2, C28878c c28878c, com.avito.android.blueprint.input.b bVar) {
        this.f244020a = provider;
        this.f244021b = provider2;
        this.f244022c = c28878c;
        this.f244023d = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.blueprints.switcher.a aVar = this.f244020a.get();
        com.avito.android.blueprint.switcher.a aVar2 = this.f244021b.get();
        C28877b c28877b = (C28877b) this.f244022c.get();
        com.avito.android.blueprint.input.a aVar3 = (com.avito.android.blueprint.input.a) this.f244023d.get();
        c.f244011a.getClass();
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(aVar);
        c10493a.b(aVar2);
        c10493a.b(c28877b);
        c10493a.b(aVar3);
        return c10493a.a();
    }
}
