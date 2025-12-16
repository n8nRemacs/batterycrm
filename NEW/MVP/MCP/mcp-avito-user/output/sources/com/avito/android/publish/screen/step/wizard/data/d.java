package com.avito.android.publish.screen.step.wizard.data;

import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: WizardInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f242452a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f242453b;

    public d(u uVar, Provider provider) {
        this.f242452a = uVar;
        this.f242453b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((e) this.f242452a.get(), this.f242453b.get());
    }
}
