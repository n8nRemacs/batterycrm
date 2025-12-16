package com.avito.android.vas_union.ui.items.vas_bundle;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasUnionV2BundleItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f323297a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f323298b;

    public e(u uVar, Provider provider) {
        this.f323297a = uVar;
        this.f323298b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((f) this.f323297a.get(), this.f323298b.get());
    }
}
