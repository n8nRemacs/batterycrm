package com.avito.android.advert_details_items.neighboring_dates;

import androidx.recyclerview.widget.A;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsNeighboringDatesPresenter_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final u f84901a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.f f84902b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.advert_details_items.neighboring_dates.tools.e> f84903c;

    public f(dagger.internal.f fVar, u uVar, Provider provider) {
        this.f84901a = uVar;
        this.f84902b = fVar;
        this.f84903c = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c((A) this.f84901a.get(), (com.avito.android.advert_details_items.neighboring_dates.tools.d) this.f84902b.get(), this.f84903c.get());
    }
}
