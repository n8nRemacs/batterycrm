package com.avito.android.user_advert.advert;

import android.content.res.Resources;

/* compiled from: AdvertAddressFormatterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.user_advert.advert.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35379c implements dagger.internal.h<C35376b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f308517a;

    public C35379c(dagger.internal.l lVar) {
        this.f308517a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new C35376b((Resources) this.f308517a.f393949a);
    }
}
