package com.avito.android.contact_access.di.service;

import com.avito.android.analytics.screens.ContactAccessServiceScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.contact_access.di.service.h;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactAccessServiceTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class f implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f126121a;

    /* renamed from: b, reason: collision with root package name */
    public final l f126122b;

    public f(l lVar, Provider provider) {
        this.f126121a = provider;
        this.f126122b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((h.c.f) this.f126121a).get();
        r rVar = (r) this.f126122b.f393949a;
        int i12 = c.f126118a;
        return interfaceC28481c.b(ContactAccessServiceScreen.f90332d, rVar);
    }
}
