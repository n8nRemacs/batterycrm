package com.avito.android.publish.screen.objects.view.actions;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ObjectBottomButtonHelperImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f240263a;

    public c(Provider<com.avito.android.details.a> provider) {
        this.f240263a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f240263a.get());
    }
}
