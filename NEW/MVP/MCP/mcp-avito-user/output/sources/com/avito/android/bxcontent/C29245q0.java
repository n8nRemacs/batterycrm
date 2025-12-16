package com.avito.android.bxcontent;

import android.app.Application;

/* compiled from: BxContentIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.bxcontent.q0, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29245q0 implements dagger.internal.h<C29239o0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f112818a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.navigation.c f112819b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.O f112820c;

    public C29245q0(com.avito.android.O o12, com.avito.android.navigation.c cVar, dagger.internal.l lVar) {
        this.f112818a = lVar;
        this.f112819b = cVar;
        this.f112820c = o12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C29239o0((Application) this.f112818a.f393949a, (com.avito.android.L) this.f112820c.get(), (com.avito.android.navigation.a) this.f112819b.get());
    }
}
