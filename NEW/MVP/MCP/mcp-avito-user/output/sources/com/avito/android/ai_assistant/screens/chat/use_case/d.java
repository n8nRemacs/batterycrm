package com.avito.android.ai_assistant.screens.chat.use_case;

import Nb.InterfaceC14555a;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ChatHistoryUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<R0> f89521a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14555a> f89522b;

    public d(Provider<R0> provider, Provider<InterfaceC14555a> provider2) {
        this.f89521a = provider;
        this.f89522b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f89521a.get(), this.f89522b.get());
    }
}
