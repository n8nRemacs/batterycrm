package com.avito.android.social;

import android.content.Context;

/* compiled from: OdnoklassnikiSocialManagerImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.social.z, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C35033z implements dagger.internal.h<C35032y> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f284433a;

    public C35033z(dagger.internal.u uVar) {
        this.f284433a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C35032y((Context) this.f284433a.get());
    }
}
