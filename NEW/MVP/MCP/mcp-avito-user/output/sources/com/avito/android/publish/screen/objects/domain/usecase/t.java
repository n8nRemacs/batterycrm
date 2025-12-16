package com.avito.android.publish.screen.objects.domain.usecase;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SaveObjectStateUseCase_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.publish.screen.objects.domain.repository.a> f240140a;

    public t(Provider<com.avito.android.publish.screen.objects.domain.repository.a> provider) {
        this.f240140a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s(this.f240140a.get());
    }
}
