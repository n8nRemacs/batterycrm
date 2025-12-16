package com.avito.android.publish.screen.step.wizard.mvi;

import com.avito.android.Q1;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WizardBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final u f242545a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f242546b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Q1> f242547c;

    public h(u uVar, Provider provider, Provider provider2) {
        this.f242545a = uVar;
        this.f242546b = provider;
        this.f242547c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((com.avito.android.publish.screen.step.wizard.data.a) this.f242545a.get(), this.f242546b.get(), this.f242547c.get());
    }
}
