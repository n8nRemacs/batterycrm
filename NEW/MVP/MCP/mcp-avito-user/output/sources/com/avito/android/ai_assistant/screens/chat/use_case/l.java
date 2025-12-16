package com.avito.android.ai_assistant.screens.chat.use_case;

import Nb.InterfaceC14555a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: MessageActionsUseCaseImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class l implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC14555a> f89540a;

    public l(Provider<InterfaceC14555a> provider) {
        this.f89540a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new k(this.f89540a.get());
    }
}
