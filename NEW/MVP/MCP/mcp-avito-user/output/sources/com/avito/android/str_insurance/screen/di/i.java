package com.avito.android.str_insurance.screen.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StrInsuranceFragmentTrackerModule_ProvidePerfScreenDataFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class i implements dagger.internal.h<C28478k> {

    /* renamed from: a, reason: collision with root package name */
    public final h f288704a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Screen> f288705b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f288706c;

    public i(h hVar, Provider provider, dagger.internal.l lVar) {
        this.f288704a = hVar;
        this.f288705b = provider;
        this.f288706c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        Screen screen = this.f288705b.get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f288706c.f393949a;
        this.f288704a.getClass();
        return new C28478k(screen, rVar, null, 4, null);
    }
}
