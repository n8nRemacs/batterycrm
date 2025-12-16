package com.avito.android.advert;

import android.app.Application;

/* compiled from: AdvertDetailsIntentFactoryImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.h, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C27796h implements dagger.internal.h<C27794f> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f71178a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.O f71179b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.navigation.c f71180c;

    public C27796h(com.avito.android.O o12, com.avito.android.navigation.c cVar, dagger.internal.l lVar) {
        this.f71178a = lVar;
        this.f71179b = o12;
        this.f71180c = cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C27794f((Application) this.f71178a.f393949a, (com.avito.android.L) this.f71179b.get(), (com.avito.android.navigation.a) this.f71180c.get());
    }
}
