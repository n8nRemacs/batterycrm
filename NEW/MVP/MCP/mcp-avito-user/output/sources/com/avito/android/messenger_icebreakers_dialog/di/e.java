package com.avito.android.messenger_icebreakers_dialog.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.messenger_icebreakers_dialog.di.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MessengerIcebreakerDialogPerformanceTrackerModule_ProvideIMessengerIcebreakerDialogFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f197656a;

    /* renamed from: b, reason: collision with root package name */
    public final l f197657b;

    public e(l lVar, Provider provider) {
        this.f197656a = provider;
        this.f197657b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.C5821a) this.f197656a).get();
        r rVar = (r) this.f197657b.f393949a;
        int i12 = c.f197655a;
        return interfaceC28481c.a(new C28478k(MessengerIcebreakerDialogScreen.f197648d, rVar, null, 4, null));
    }
}
