package com.avito.android.ai_assistant.di.chat;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AiAssistantChatModule_ProvideListAdapter$_avito_ai_assistant_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f88944a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f88945b;

    public f(u uVar, Provider provider) {
        this.f88944a = uVar;
        this.f88945b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f88944a.get();
        com.avito.konveyor.a aVar2 = this.f88945b.get();
        c cVar = c.f88941a;
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
