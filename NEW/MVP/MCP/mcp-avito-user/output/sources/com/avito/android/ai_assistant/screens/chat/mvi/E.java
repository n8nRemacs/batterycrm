package com.avito.android.ai_assistant.screens.chat.mvi;

import com.avito.android.ai_assistant.AssistantChatArguments;

/* compiled from: AiAssistantChatInitialStateBuilder_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f89198a;

    public E(dagger.internal.l lVar) {
        this.f89198a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new D((AssistantChatArguments) this.f89198a.f393949a);
    }
}
