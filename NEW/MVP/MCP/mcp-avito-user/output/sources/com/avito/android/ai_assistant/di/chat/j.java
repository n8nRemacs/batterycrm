package com.avito.android.ai_assistant.di.chat;

import com.avito.android.socketEvents.SocketEventParserByClass;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AiAssistantChatSocketEventMappingModule_ProvideChatUpdateSocketEventMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<mx0.c> {

    /* renamed from: a, reason: collision with root package name */
    public final i f88956a;

    public j(i iVar) {
        this.f88956a = iVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f88956a.getClass();
        return new mx0.c(Tb.b.class, new mx0.e("buyerAssistant.ChatUpdate", null, false, 6, null), new SocketEventParserByClass(Tb.b.class));
    }
}
