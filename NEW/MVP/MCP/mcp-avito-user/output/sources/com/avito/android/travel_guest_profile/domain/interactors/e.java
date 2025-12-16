package com.avito.android.travel_guest_profile.domain.interactors;

import com.avito.android.travel_guest_profile.domain.converters.q;
import com.avito.android.travel_guest_profile.domain.converters.r;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TravelGuestProfileInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class e implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f301992a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<LE0.a> f301993b;

    /* renamed from: c, reason: collision with root package name */
    public final r f301994c;

    public e(Provider provider, Provider provider2, r rVar) {
        this.f301992a = provider;
        this.f301993b = provider2;
        this.f301994c = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        R0 r02 = this.f301992a.get();
        LE0.a aVar = this.f301993b.get();
        this.f301994c.getClass();
        return new c(r02, aVar, new q());
    }
}
