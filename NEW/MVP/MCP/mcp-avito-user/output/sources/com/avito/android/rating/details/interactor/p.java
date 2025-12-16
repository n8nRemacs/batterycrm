package com.avito.android.rating.details.interactor;

import Mg0.InterfaceC14487a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingDetailsNetworkRequestInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class p implements dagger.internal.h<o> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14487a> f247143a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f247144b;

    public p(Provider<InterfaceC14487a> provider, Provider<R0> provider2) {
        this.f247143a = provider;
        this.f247144b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new o(this.f247143a.get(), this.f247144b.get());
    }
}
