package com.avito.android.user_viewed.domain.mapper;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: UserViewedAdvertMapperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final l f318363a;

    /* renamed from: b, reason: collision with root package name */
    public final f f318364b;

    public c(l lVar, f fVar) {
        this.f318363a = lVar;
        this.f318364b = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f318363a.getClass();
        k kVar = new k();
        this.f318364b.getClass();
        return new b(kVar, new e());
    }
}
