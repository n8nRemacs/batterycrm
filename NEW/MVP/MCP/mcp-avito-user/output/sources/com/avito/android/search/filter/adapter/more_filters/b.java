package com.avito.android.search.filter.adapter.more_filters;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: MoreFiltersItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f262528a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f262529b;

    public b(u uVar, Provider provider) {
        this.f262528a = uVar;
        this.f262529b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f262528a.get(), this.f262529b.get());
    }
}
