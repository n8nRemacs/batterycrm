package com.avito.android.important_addresses_selection.data;

import dagger.internal.u;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ImportantAddressesSelectionRepositoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f169711a;

    /* renamed from: b, reason: collision with root package name */
    public final e f169712b;

    public i(u uVar, e eVar) {
        this.f169711a = uVar;
        this.f169712b = eVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        h31.e eVarA = dagger.internal.g.a(w.a(this.f169711a));
        this.f169712b.getClass();
        return new h(eVarA, new d());
    }
}
