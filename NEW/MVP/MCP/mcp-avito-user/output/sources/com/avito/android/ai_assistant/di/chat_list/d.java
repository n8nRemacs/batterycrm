package com.avito.android.ai_assistant.di.chat_list;

import dagger.internal.h;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AiAssistantChatListModule_ProvideRecyclerAdapterFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class d implements h<com.avito.konveyor.adapter.d> {

    /* renamed from: a, reason: collision with root package name */
    public final u f89011a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.a> f89012b;

    public d(u uVar, Provider provider) {
        this.f89011a = uVar;
        this.f89012b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = (com.avito.konveyor.adapter.a) this.f89011a.get();
        com.avito.konveyor.a aVar2 = this.f89012b.get();
        c.f89010a.getClass();
        return new com.avito.konveyor.adapter.d(aVar, aVar2, null, 4, null);
    }
}
