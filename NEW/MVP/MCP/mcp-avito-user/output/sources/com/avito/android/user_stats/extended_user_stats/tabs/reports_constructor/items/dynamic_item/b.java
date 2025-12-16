package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.dynamic_item;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DynamicBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f317987a;

    public b(u uVar) {
        this.f317987a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f317987a.get());
    }
}
