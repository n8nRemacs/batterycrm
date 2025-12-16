package com.avito.android.social;

import android.content.Context;
import javax.inject.Provider;

/* compiled from: GoogleSocialManagerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.social.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35019k implements dagger.internal.h<C35018j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f284423a;

    public C35019k(Provider<Context> provider) {
        this.f284423a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C35018j(this.f284423a.get());
    }
}
