package com.avito.android.publish.screen.objects.view.actions;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ObjectFillFormViewActionsConfiguratorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f240276a;

    public j(Provider<com.avito.android.details.a> provider) {
        this.f240276a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f240276a.get());
    }
}
