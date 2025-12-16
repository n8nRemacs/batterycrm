package com.avito.android.gig_motivations_list.di;

import aG.InterfaceC19767a;
import com.avito.android.gig_motivations_list.di.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MotivationsListModule_ProvideRepositoryFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class e implements h<wH.h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC19767a> f160284a;

    public e(Provider<InterfaceC19767a> provider) {
        this.f160284a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC19767a interfaceC19767a = (InterfaceC19767a) ((a.c.b) this.f160284a).get();
        d.f160283a.getClass();
        return new com.avito.android.gig_motivations_list.data.c(interfaceC19767a);
    }
}
