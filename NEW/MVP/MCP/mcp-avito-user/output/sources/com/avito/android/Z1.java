package com.avito.android;

import Mg0.InterfaceC14487a;
import javax.inject.Provider;

/* compiled from: RatingDetailsGalleryInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes10.dex */
public final class Z1 implements dagger.internal.h<Y1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14487a> f67624a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.util.R0> f67625b;

    public Z1(Provider<InterfaceC14487a> provider, Provider<com.avito.android.util.R0> provider2) {
        this.f67624a = provider;
        this.f67625b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new Y1(this.f67624a.get(), this.f67625b.get());
    }
}
