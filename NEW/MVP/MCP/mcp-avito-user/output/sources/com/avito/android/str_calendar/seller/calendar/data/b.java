package com.avito.android.str_calendar.seller.calendar.data;

import Hy0.C14050b;
import Hy0.C14052d;
import com.avito.android.remote.d1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrSellerCalendarInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d1> f287528a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f287529b;

    /* renamed from: c, reason: collision with root package name */
    public final C14052d f287530c;

    public b(Provider provider, Provider provider2, C14052d c14052d) {
        this.f287528a = provider;
        this.f287529b = provider2;
        this.f287530c = c14052d;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f287528a.get(), this.f287529b.get(), (C14050b) this.f287530c.get());
    }
}
