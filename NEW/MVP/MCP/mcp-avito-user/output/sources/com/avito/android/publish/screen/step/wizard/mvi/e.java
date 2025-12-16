package com.avito.android.publish.screen.step.wizard.mvi;

import com.avito.android.publish.analytics.InterfaceC33535v;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WizardActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f242527a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC33535v> f242528b;

    public e(u uVar, Provider provider) {
        this.f242527a = uVar;
        this.f242528b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((com.avito.android.publish.screen.step.wizard.data.a) this.f242527a.get(), this.f242528b.get());
    }
}
