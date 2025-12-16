package com.avito.android.ai_assistant.di.chat;

import cU0.C27106d;
import dagger.internal.x;
import dagger.internal.y;
import iT.C41343c;

/* compiled from: AiAssistantChatModule_MetaStoragesHolderFactory.java */
@dagger.internal.e
@x
@y
/* loaded from: classes11.dex */
public final class d implements dagger.internal.h<C41343c> {

    /* compiled from: AiAssistantChatModule_MetaStoragesHolderFactory.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final d f88942a = new d();
    }

    @Override // javax.inject.Provider
    public final Object get() {
        c.f88941a.getClass();
        return new C41343c(new com.avito.beduin.v2.engine.component.x(), new C27106d());
    }
}
