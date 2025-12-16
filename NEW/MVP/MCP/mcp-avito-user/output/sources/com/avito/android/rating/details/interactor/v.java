package com.avito.android.rating.details.interactor;

import Mg0.InterfaceC14487a;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserReviewsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class v implements dagger.internal.h<u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14487a> f247169a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC35745a5> f247170b;

    public v(Provider<InterfaceC14487a> provider, Provider<InterfaceC35745a5> provider2) {
        this.f247169a = provider;
        this.f247170b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new u(this.f247169a.get(), this.f247170b.get());
    }
}
