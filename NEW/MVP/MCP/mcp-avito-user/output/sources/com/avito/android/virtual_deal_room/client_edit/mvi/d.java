package com.avito.android.virtual_deal_room.client_edit.mvi;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientEditActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<IN0.a> f326211a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f326212b;

    public d(Provider<IN0.a> provider, Provider<R0> provider2) {
        this.f326211a = provider;
        this.f326212b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f326211a.get(), this.f326212b.get());
    }
}
