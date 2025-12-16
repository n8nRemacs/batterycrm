package com.avito.android.sx_address.entry.domain;

import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.h;
import dagger.internal.w;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SxAddressEntryUseCase_Factory.java */
@e
@y
@x
/* loaded from: classes4.dex */
public final class d implements h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<EA0.a> f292937a;

    public d(Provider<EA0.a> provider) {
        this.f292937a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(g.a(w.a(this.f292937a)));
    }
}
