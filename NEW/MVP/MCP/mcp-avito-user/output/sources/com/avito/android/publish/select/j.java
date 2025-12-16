package com.avito.android.publish.select;

import com.avito.android.publish.details.InterfaceC33675a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SelectStepHeaderProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f242701a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f242702b;

    public j(dagger.internal.u uVar, dagger.internal.u uVar2) {
        this.f242701a = uVar;
        this.f242702b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i((InterfaceC33675a) this.f242701a.get(), (com.avito.android.details.a) this.f242702b.get());
    }
}
