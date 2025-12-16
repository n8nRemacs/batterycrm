package com.avito.android.user_advert.advert.items.service_booking;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SbStatusBlockItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f310129a;

    /* renamed from: b, reason: collision with root package name */
    public final u f310130b;

    public c(u uVar, Provider provider) {
        this.f310129a = provider;
        this.f310130b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f310129a.get(), (com.avito.android.util.text.a) this.f310130b.get());
    }
}
