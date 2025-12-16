package com.avito.android.publish.screen.objects.domain.usecase;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ObserveListenersUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f240136a;

    public p(dagger.internal.u uVar) {
        this.f240136a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o((com.avito.android.publish.screen.objects.domain.repository.e) this.f240136a.get());
    }
}
