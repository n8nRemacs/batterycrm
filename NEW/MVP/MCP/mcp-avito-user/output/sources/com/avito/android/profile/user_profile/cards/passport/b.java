package com.avito.android.profile.user_profile.cards.passport;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PassportCardBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f225137a;

    /* renamed from: b, reason: collision with root package name */
    public final u f225138b;

    public b(u uVar, Provider provider) {
        this.f225137a = provider;
        this.f225138b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f225137a.get(), (l41.g) this.f225138b.get());
    }
}
