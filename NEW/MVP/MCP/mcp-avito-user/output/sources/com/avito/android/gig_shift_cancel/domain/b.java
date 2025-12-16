package com.avito.android.gig_shift_cancel.domain;

import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import xG.InterfaceC49829a;

/* compiled from: GigShiftCancelInteractor_Factory.java */
@e
@y
@x
/* loaded from: classes13.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC49829a> f160626a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.gig_snippet.a> f160627b;

    public b(Provider<InterfaceC49829a> provider, Provider<com.avito.android.gig_snippet.a> provider2) {
        this.f160626a = provider;
        this.f160627b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f160626a.get(), this.f160627b.get());
    }
}
