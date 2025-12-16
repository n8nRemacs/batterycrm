package com.avito.android.advert.item.neighboring_dates;

import E4.g;
import com.avito.android.util.R0;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: NeighboringDatesPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final c f77798a;

    /* renamed from: b, reason: collision with root package name */
    public final E4.h f77799b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f77800c;

    /* renamed from: d, reason: collision with root package name */
    public final u f77801d;

    public f(c cVar, E4.h hVar, Provider provider, u uVar) {
        this.f77798a = cVar;
        this.f77799b = hVar;
        this.f77800c = provider;
        this.f77801d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((a) this.f77798a.get(), (g) this.f77799b.get(), this.f77800c.get(), (com.avito.android.advert_details_items.neighboring_dates.tools.e) this.f77801d.get());
    }
}
