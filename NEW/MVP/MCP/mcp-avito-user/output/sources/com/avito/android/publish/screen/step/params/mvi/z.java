package com.avito.android.publish.screen.step.params.mvi;

import com.avito.android.publish.screen.step.params.domain.InterfaceC34074a;
import com.avito.android.publish.screen.step.params.domain.g0;
import javax.inject.Provider;

/* compiled from: PublishDetailsActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34074a> f241507a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f241508b;

    public z(dagger.internal.u uVar, Provider provider) {
        this.f241507a = provider;
        this.f241508b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new y(this.f241507a.get(), (g0) this.f241508b.get());
    }
}
