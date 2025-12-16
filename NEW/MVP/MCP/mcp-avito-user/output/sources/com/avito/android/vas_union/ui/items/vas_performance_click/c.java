package com.avito.android.vas_union.ui.items.vas_performance_click;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: VasUnionV2PerformanceClickItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f323326a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.text.a> f323327b;

    public c(u uVar, Provider provider) {
        this.f323326a = uVar;
        this.f323327b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((d) this.f323326a.get(), this.f323327b.get());
    }
}
