package com.avito.android.crm_paid_cvs.view.list_items.range_filter;

import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.T;

/* compiled from: RangeFilterBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<e> f130942a;

    /* renamed from: b, reason: collision with root package name */
    public final l f130943b;

    public c(l lVar, Provider provider) {
        this.f130942a = provider;
        this.f130943b = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f130942a.get(), (T) this.f130943b.f393949a);
    }
}
