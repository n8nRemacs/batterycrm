package com.avito.android.extended_profile_widgets.adapter.search.inline_filters;

import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InlineFiltersItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f154670a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC31062w> f154671b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f154672c;

    public l(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f154670a = lVar;
        this.f154671b = provider;
        this.f154672c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k((Y41.l) this.f154670a.f393949a, this.f154671b.get(), this.f154672c.get());
    }
}
