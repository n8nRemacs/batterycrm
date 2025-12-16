package com.avito.android.short_term_rent.toggle_booking;

import com.avito.android.remote.d1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrToggleBookingInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d1> f283006a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f283007b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.remote.error.i f283008c;

    public e(com.avito.android.remote.error.i iVar, Provider provider, Provider provider2) {
        this.f283006a = provider;
        this.f283007b = provider2;
        this.f283008c = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f283006a.get(), this.f283007b.get(), (com.avito.android.remote.error.f) this.f283008c.get());
    }
}
