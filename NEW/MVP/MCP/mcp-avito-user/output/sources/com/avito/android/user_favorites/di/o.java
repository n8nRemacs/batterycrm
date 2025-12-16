package com.avito.android.user_favorites.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.user_favorites.di.C35717a;
import javax.inject.Provider;

/* compiled from: UserFavoritesModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes5.dex */
public final class o implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f316904a;

    /* renamed from: b, reason: collision with root package name */
    public final n f316905b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f316906c;

    public o(Provider provider, n nVar, dagger.internal.l lVar) {
        this.f316904a = provider;
        this.f316905b = nVar;
        this.f316906c = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((C35717a.c.b) this.f316904a).get();
        Screen screen = (Screen) this.f316905b.get();
        com.avito.android.analytics.screens.r rVar = (com.avito.android.analytics.screens.r) this.f316906c.f393949a;
        int i12 = i.f316897a;
        return interfaceC28481c.a(new C28478k(screen, rVar, null, 4, null));
    }
}
