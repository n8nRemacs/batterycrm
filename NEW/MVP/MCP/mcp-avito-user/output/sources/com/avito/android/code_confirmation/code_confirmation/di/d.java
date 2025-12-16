package com.avito.android.code_confirmation.code_confirmation.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.CodeConfirmationScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.code_confirmation.code_confirmation.di.j;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: CodeConfirmationModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class d implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f119489a;

    /* renamed from: b, reason: collision with root package name */
    public final l f119490b;

    public d(l lVar, Provider provider) {
        this.f119489a = provider;
        this.f119490b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((j.b.C3509j) this.f119489a).get();
        r rVar = (r) this.f119490b.f393949a;
        c.f119488a.getClass();
        return interfaceC28481c.a(new C28478k(CodeConfirmationScreen.f90326d, rVar, null, 4, null));
    }
}
