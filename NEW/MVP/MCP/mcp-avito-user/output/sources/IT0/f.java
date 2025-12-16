package it0;

import AK0.l;
import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TooltipStorageImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements h<C42110e> {

    /* renamed from: a, reason: collision with root package name */
    public final u f405351a;

    public f(u uVar) {
        this.f405351a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C42110e((l) this.f405351a.get());
    }
}
