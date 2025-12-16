package com.avito.android.social.esia.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: EsiaAuthActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final f f284393a;

    public b(f fVar) {
        this.f284393a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((c) this.f284393a.get());
    }
}
