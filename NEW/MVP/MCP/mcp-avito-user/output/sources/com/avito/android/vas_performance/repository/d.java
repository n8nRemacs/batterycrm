package com.avito.android.vas_performance.repository;

import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import zL0.InterfaceC50482a;

/* compiled from: VasRepositoryImpl_Factory.java */
@e
@y
@x
/* loaded from: classes5.dex */
public final class d implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final u f320235a;

    /* renamed from: b, reason: collision with root package name */
    public final u f320236b;

    public d(u uVar, u uVar2) {
        this.f320235a = uVar;
        this.f320236b = uVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((InterfaceC50482a) this.f320235a.get(), (InterfaceC35745a5) this.f320236b.get());
    }
}
