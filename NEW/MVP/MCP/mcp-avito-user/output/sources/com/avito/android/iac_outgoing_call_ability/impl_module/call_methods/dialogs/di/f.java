package com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_outgoing_call_ability.impl_module.call_methods.dialogs.di.a;
import dagger.internal.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacCallMethodsDialogPerformanceTrackerModule_ProvideIacForceScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class f implements h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f168464a;

    /* renamed from: b, reason: collision with root package name */
    public final l f168465b;

    public f(l lVar, Provider provider) {
        this.f168464a = provider;
        this.f168465b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.C4983a) this.f168464a).get();
        r rVar = (r) this.f168465b.f393949a;
        int i12 = c.f168463a;
        return interfaceC28481c.a(new C28478k(IacForceCallMethodsDialogScreen.f168458d, rVar, null, 4, null));
    }
}
