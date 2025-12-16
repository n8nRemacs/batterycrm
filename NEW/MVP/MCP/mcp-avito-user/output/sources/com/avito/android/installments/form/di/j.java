package com.avito.android.installments.form.di;

import com.avito.android.analytics.screens.InstallmentsForm;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.installments.form.di.a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: InstallmentsFormTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes14.dex */
public final class j implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f172691a;

    /* renamed from: b, reason: collision with root package name */
    public final l f172692b;

    public j(l lVar, Provider provider) {
        this.f172691a = provider;
        this.f172692b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((a.c.k) this.f172691a).get();
        r rVar = (r) this.f172692b.f393949a;
        int i12 = f.f172687a;
        return interfaceC28481c.b(InstallmentsForm.f90380d, rVar);
    }
}
