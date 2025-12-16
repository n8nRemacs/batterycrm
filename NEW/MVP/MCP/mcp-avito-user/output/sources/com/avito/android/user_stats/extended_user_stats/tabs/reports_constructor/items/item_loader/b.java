package com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.items.item_loader;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LoaderBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f318038a;

    public b(u uVar) {
        this.f318038a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f318038a.get());
    }
}
