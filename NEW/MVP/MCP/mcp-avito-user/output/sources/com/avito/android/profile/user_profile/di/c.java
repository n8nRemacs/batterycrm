package com.avito.android.profile.user_profile.di;

import java.util.UUID;

/* compiled from: SessionModule_ProvideSessionIdFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<N90.p> {

    /* renamed from: a, reason: collision with root package name */
    public final b f226087a;

    public c(b bVar) {
        this.f226087a = bVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f226087a.getClass();
        return new N90.p(UUID.randomUUID().toString());
    }
}
