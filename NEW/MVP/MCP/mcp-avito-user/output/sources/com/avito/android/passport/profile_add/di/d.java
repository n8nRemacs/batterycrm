package com.avito.android.passport.profile_add.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.r;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PassportAddProfileModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class d implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Screen> f212293a;

    /* renamed from: b, reason: collision with root package name */
    public final l f212294b;

    public d(l lVar, Provider provider) {
        this.f212293a = provider;
        this.f212294b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = this.f212293a.get();
        r rVar = (r) this.f212294b.f393949a;
        b.f212288a.getClass();
        return new C28478k(screen, rVar, null, 4, null);
    }
}
