package com.avito.android.motivation_screen.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MotivationActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f206352a;

    /* renamed from: b, reason: collision with root package name */
    public final p f206353b;

    public e(Provider provider, p pVar) {
        this.f206352a = provider;
        this.f206353b = pVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f206352a.get(), (o) this.f206353b.get());
    }
}
