package com.avito.android.publish.screen.objects.domain.usecase;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RestoreObjectStateUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.screen.objects.domain.repository.a> f240138a;

    public r(Provider<com.avito.android.publish.screen.objects.domain.repository.a> provider) {
        this.f240138a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f240138a.get());
    }
}
