package com.avito.android.ai_assistant.screens.chat.use_case;

import Nb.InterfaceC14555a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SendMessageUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class q implements dagger.internal.h<p> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f89555a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14555a> f89556b;

    public q(Provider<R0> provider, Provider<InterfaceC14555a> provider2) {
        this.f89555a = provider;
        this.f89556b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new p(this.f89555a.get(), this.f89556b.get());
    }
}
