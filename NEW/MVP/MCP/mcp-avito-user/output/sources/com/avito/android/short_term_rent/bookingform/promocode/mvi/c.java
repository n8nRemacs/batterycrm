package com.avito.android.short_term_rent.bookingform.promocode.mvi;

import com.avito.android.remote.d1;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ApplyPromoCodeUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d1> f282138a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f282139b;

    public c(Provider<d1> provider, Provider<R0> provider2) {
        this.f282138a = provider;
        this.f282139b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f282138a.get(), this.f282139b.get());
    }
}
