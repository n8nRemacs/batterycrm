package com.avito.android.ai_assistant.screens.chat.mvi;

import Jb.InterfaceC14183a;
import javax.inject.Provider;

/* compiled from: AiAssistantChatActor_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class u implements dagger.internal.h<C28362a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.ai_assistant.screens.chat.mvi.interactor.a> f89435a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.ai_assistant.screens.chat.mvi.interactor.f> f89436b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f89437c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.clientEventBus.a> f89438d;

    /* renamed from: e, reason: collision with root package name */
    public final t f89439e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<InterfaceC14183a> f89440f;

    /* renamed from: g, reason: collision with root package name */
    public final Provider<Vb.e> f89441g;

    public u(Provider provider, Provider provider2, dagger.internal.u uVar, Provider provider3, t tVar, Provider provider4, Provider provider5) {
        this.f89435a = provider;
        this.f89436b = provider2;
        this.f89437c = uVar;
        this.f89438d = provider3;
        this.f89439e = tVar;
        this.f89440f = provider4;
        this.f89441g = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.ai_assistant.screens.chat.mvi.interactor.a aVar = this.f89435a.get();
        com.avito.android.ai_assistant.screens.chat.mvi.interactor.f fVar = this.f89436b.get();
        com.avito.android.ai_assistant.screens.chat.use_case.j jVar = (com.avito.android.ai_assistant.screens.chat.use_case.j) this.f89437c.get();
        com.avito.android.clientEventBus.a aVar2 = this.f89438d.get();
        this.f89439e.getClass();
        return new C28362a(aVar, fVar, jVar, aVar2, new s(), this.f89440f.get(), this.f89441g.get());
    }
}
