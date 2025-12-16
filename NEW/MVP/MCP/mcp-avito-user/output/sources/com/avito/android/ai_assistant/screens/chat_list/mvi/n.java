package com.avito.android.ai_assistant.screens.chat_list.mvi;

import Nb.InterfaceC14555a;
import com.avito.android.ai_assistant.screens.chat_list.AssistantChatListArguments;
import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AiAssistantChatListInteractor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class n implements dagger.internal.h<k> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f89639a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC14555a> f89640b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<R0> f89641c;

    public n(dagger.internal.l lVar, Provider provider, Provider provider2) {
        this.f89639a = lVar;
        this.f89640b = provider;
        this.f89641c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new k((AssistantChatListArguments) this.f89639a.f393949a, this.f89640b.get(), this.f89641c.get());
    }
}
