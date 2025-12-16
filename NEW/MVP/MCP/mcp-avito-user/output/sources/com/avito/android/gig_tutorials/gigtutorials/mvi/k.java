package com.avito.android.gig_tutorials.gigtutorials.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigTutorialsReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f161161a;

    public k(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f161161a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f161161a.get());
    }
}
