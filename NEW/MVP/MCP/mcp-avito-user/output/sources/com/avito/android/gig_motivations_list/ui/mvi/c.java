package com.avito.android.gig_motivations_list.ui.mvi;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MotivationsListActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f160363a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f160364b;

    public c(u uVar, Provider provider) {
        this.f160363a = uVar;
        this.f160364b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((wH.h) this.f160363a.get(), this.f160364b.get());
    }
}
