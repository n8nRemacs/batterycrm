package com.avito.android.publish.screen.step.request.steps.mvi;

import com.avito.android.publish.C0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: StepsRequestActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f242057a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<C0> f242058b;

    public c(u uVar, Provider provider) {
        this.f242057a = uVar;
        this.f242058b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((com.avito.android.publish.screen.step.request.steps.loader.a) this.f242057a.get(), this.f242058b.get());
    }
}
