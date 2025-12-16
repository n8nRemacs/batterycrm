package com.avito.android.messenger.channels.mvi.list_feature;

import android.content.Context;
import javax.inject.Provider;

/* compiled from: MessengerDockingBadgeConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class v1 implements dagger.internal.h<u1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f188235a;

    public v1(Provider<Context> provider) {
        this.f188235a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u1(this.f188235a.get());
    }
}
