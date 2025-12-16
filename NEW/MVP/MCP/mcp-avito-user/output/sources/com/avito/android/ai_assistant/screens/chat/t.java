package com.avito.android.ai_assistant.screens.chat;

import com.avito.android.ai_assistant.screens.chat.mvi.B;
import com.avito.android.ai_assistant.screens.chat.mvi.C;
import dagger.internal.x;
import dagger.internal.y;
import iT.C41343c;

/* compiled from: AiAssistantChatViewModel_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final C f89512a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.u f89513b;

    public t(C c12, dagger.internal.u uVar) {
        this.f89512a = c12;
        this.f89513b = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new s((B) this.f89512a.get(), (C41343c) this.f89513b.get());
    }
}
