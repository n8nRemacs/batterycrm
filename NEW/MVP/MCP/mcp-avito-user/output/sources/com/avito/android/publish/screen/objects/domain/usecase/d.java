package com.avito.android.publish.screen.objects.domain.usecase;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DetachListenersUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f240087a;

    public d(dagger.internal.u uVar) {
        this.f240087a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c((com.avito.android.publish.screen.objects.domain.repository.e) this.f240087a.get());
    }
}
