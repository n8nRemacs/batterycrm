package com.avito.android.profile.user_profile.cards.calls;

import com.avito.android.profile.user_profile.cards.o;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CallsCardBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class b implements h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final e f224835a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<o> f224836b;

    public b(e eVar, Provider provider) {
        this.f224835a = eVar;
        this.f224836b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((d) this.f224835a.get(), this.f224836b.get());
    }
}
