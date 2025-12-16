package com.avito.android.ai_assistant.screens.chat_list.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AiAssistantChatListBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final n f89607a;

    public e(n nVar) {
        this.f89607a = nVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d((k) this.f89607a.get());
    }
}
