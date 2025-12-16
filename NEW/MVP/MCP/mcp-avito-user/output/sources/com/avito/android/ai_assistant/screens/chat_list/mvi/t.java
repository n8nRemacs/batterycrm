package com.avito.android.ai_assistant.screens.chat_list.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AiAssistantChatListViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final j f89645a;

    public t(j jVar) {
        this.f89645a = jVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((i) this.f89645a.get(), null, 2, null);
    }
}
