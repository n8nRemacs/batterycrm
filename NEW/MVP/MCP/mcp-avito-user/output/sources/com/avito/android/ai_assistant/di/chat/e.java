package com.avito.android.ai_assistant.di.chat;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AiAssistantChatModule_ProvideAdapterPresenter$_avito_ai_assistant_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<com.avito.konveyor.adapter.a> {

    /* renamed from: a, reason: collision with root package name */
    public final u f88943a;

    public e(u uVar) {
        this.f88943a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.a aVar = (com.avito.konveyor.a) this.f88943a.get();
        c cVar = c.f88941a;
        return new com.avito.konveyor.adapter.h(aVar, aVar, null, 4, null);
    }
}
