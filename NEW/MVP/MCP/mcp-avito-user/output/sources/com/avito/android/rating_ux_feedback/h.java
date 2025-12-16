package com.avito.android.rating_ux_feedback;

import Mg0.InterfaceC14487a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RatingUxFeedbackInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14487a> f250499a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f250500b;

    public h(Provider<InterfaceC14487a> provider, Provider<R0> provider2) {
        this.f250499a = provider;
        this.f250500b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f250500b.get(), dagger.internal.g.b(this.f250499a));
    }
}
