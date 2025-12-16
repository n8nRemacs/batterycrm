package com.avito.android.blueprints.metro;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MultiStateMetroItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f106055a;

    public b(Provider<c> provider) {
        this.f106055a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a(this.f106055a.get());
    }
}
