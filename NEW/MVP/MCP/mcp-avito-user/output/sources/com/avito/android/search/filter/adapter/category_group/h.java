package com.avito.android.search.filter.adapter.category_group;

import javax.inject.Provider;
import ur.InterfaceC49101b;

/* compiled from: CategoryGroupItemBlueprintImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f262064a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC49101b> f262065b;

    public h(dagger.internal.u uVar, Provider provider) {
        this.f262064a = uVar;
        this.f262065b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((i) this.f262064a.get(), this.f262065b.get());
    }
}
