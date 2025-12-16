package com.avito.android.publish.screen.objects.domain.usecase;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: GetObjectItemsUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f240109a;

    public h(dagger.internal.u uVar) {
        this.f240109a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e((com.avito.android.publish.screen.objects.domain.repository.e) this.f240109a.get());
    }
}
