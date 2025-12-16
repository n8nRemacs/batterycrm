package com.avito.android.ai_assistant.screens.chat_list.mvi;

import Jb.InterfaceC14183a;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AiAssistantChatListActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final n f89604a;

    /* renamed from: b, reason: collision with root package name */
    public final Jb.c f89605b;

    public c(n nVar, Jb.c cVar) {
        this.f89604a = nVar;
        this.f89605b = cVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new a((k) this.f89604a.get(), (InterfaceC14183a) this.f89605b.get());
    }
}
