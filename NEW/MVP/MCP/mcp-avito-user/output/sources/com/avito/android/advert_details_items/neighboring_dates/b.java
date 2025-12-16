package com.avito.android.advert_details_items.neighboring_dates;

import androidx.recyclerview.widget.A;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsNeighboringDatesBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f84892a;

    /* renamed from: b, reason: collision with root package name */
    public final u f84893b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<A> f84894c;

    public b(f fVar, u uVar, Provider provider) {
        this.f84892a = fVar;
        this.f84893b = uVar;
        this.f84894c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f84892a.get(), (com.avito.konveyor.adapter.d) this.f84893b.get(), this.f84894c.get());
    }
}
