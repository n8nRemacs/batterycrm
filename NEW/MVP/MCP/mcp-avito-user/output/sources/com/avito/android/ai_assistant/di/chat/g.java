package com.avito.android.ai_assistant.di.chat;

import com.avito.android.ai_assistant.screens.chat.mvi.D;
import com.avito.android.ai_assistant.screens.chat.mvi.E;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AiAssistantChatModule_ProvidePrivateStateHolder$_avito_ai_assistant_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class g implements dagger.internal.h<Vb.e> {

    /* renamed from: a, reason: collision with root package name */
    public final E f88946a;

    public g(E e12) {
        this.f88946a = e12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        D d12 = (D) this.f88946a.get();
        c cVar = c.f88941a;
        return new Vb.e(new Vb.d(d12.a().f17254g));
    }
}
