package com.avito.android.user_advert.advert.items.parameters;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: MyAdvertParameterItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f309777a;

    public b(u uVar) {
        this.f309777a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f309777a.get());
    }
}
