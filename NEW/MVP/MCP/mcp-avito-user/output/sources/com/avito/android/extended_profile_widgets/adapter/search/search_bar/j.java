package com.avito.android.extended_profile_widgets.adapter.search.search_bar;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SearchBarItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class j implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f154758a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f154759b;

    public j(dagger.internal.l lVar, Provider provider) {
        this.f154758a = lVar;
        this.f154759b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((Y41.l) this.f154758a.f393949a, this.f154759b.get());
    }
}
