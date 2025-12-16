package com.avito.android.ai_assistant.screens.chat.mvi;

import com.avito.android.ai_assistant.AssistantChatArguments;
import javax.inject.Provider;

/* compiled from: AiAssistantChatBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class z implements dagger.internal.h<y> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f89459a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.ai_assistant.screens.chat.mvi.interactor.a> f89460b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f89461c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.favorite.h> f89462d;

    public z(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f89459a = lVar;
        this.f89460b = provider;
        this.f89461c = uVar;
        this.f89462d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new y((AssistantChatArguments) this.f89459a.f393949a, this.f89460b.get(), (Vb.e) this.f89461c.get(), this.f89462d.get());
    }
}
