package com.avito.android.cpt.activation.ui.items.dbs;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CptActivationDbsItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f126369a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f126370b;

    public c(u uVar, Provider provider) {
        this.f126369a = uVar;
        this.f126370b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f126369a.get(), this.f126370b.get());
    }
}
