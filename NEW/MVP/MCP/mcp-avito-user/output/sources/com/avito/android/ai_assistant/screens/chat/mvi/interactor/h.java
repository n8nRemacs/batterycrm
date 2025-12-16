package com.avito.android.ai_assistant.screens.chat.mvi.interactor;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: TimeoutFallbackInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f89397a;

    public h(Provider<R0> provider) {
        this.f89397a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g(this.f89397a.get());
    }
}
