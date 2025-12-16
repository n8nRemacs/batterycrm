package com.avito.android.ai_assistant.screens.chat.use_case;

import Nb.InterfaceC14555a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DiscoverUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f89537a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14555a> f89538b;

    public i(Provider<R0> provider, Provider<InterfaceC14555a> provider2) {
        this.f89537a = provider;
        this.f89538b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f89537a.get(), this.f89538b.get());
    }
}
