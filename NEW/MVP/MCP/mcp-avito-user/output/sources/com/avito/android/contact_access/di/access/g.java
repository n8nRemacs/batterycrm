package com.avito.android.contact_access.di.access;

import com.avito.android.analytics.screens.ContactAccessPackageScreen;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.H;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.contact_access.di.access.i;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ContactAccessPackageTrackerModule_ProvideScreenTrackerFactoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class g implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f126091a;

    /* renamed from: b, reason: collision with root package name */
    public final l f126092b;

    public g(l lVar, Provider provider) {
        this.f126091a = provider;
        this.f126092b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((i.c.C3743c) this.f126091a).get();
        r rVar = (r) this.f126092b.f393949a;
        int i12 = d.f126088a;
        return interfaceC28481c.b(ContactAccessPackageScreen.f90331d, rVar);
    }
}
