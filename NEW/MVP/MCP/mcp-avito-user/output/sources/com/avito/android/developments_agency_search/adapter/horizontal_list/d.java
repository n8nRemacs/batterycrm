package com.avito.android.developments_agency_search.adapter.horizontal_list;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: HorizontalListItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f136301a;

    /* renamed from: b, reason: collision with root package name */
    public final u f136302b;

    public d(u uVar, Provider provider) {
        this.f136301a = provider;
        this.f136302b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f136301a.get(), (com.avito.konveyor.a) this.f136302b.get());
    }
}
