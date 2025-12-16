package com.avito.android.publish.screen.step.select.loader;

import com.avito.android.publish.details.InterfaceC33675a;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectStepHeaderProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f242186a;

    /* renamed from: b, reason: collision with root package name */
    public final u f242187b;

    public f(u uVar, u uVar2) {
        this.f242186a = uVar;
        this.f242187b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((InterfaceC33675a) this.f242186a.get(), (com.avito.android.details.a) this.f242187b.get());
    }
}
