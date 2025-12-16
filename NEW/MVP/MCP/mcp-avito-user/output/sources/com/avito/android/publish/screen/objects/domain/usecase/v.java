package com.avito.android.publish.screen.objects.domain.usecase;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: SetupObjectViewUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f240142a;

    public v(dagger.internal.u uVar) {
        this.f240142a = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u((com.avito.android.publish.screen.objects.domain.repository.e) this.f240142a.get());
    }
}
