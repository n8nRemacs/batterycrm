package com.avito.android.ai_assistant.di.chat;

import com.avito.konveyor.a;
import com.avito.konveyor.exception.BlueprintCollisionException;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AiAssistantChatModule_ProvidesItemBinderFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class h implements dagger.internal.h<com.avito.konveyor.a> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.ai_assistant.adapter.user_message.c> f88947a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.ai_assistant.adapter.assistant_text_message.c> f88948b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.ai_assistant.adapter.answer_loading.c> f88949c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.ai_assistant.adapter.append.c> f88950d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.ai_assistant.adapter.message_actions.b> f88951e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.ai_assistant.adapter.segment_buttons.c f88952f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.ai_assistant.adapter.simple_snippet.b f88953g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.ai_assistant.adapter.beduin.b> f88954h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.ai_assistant.adapter.repeat_button.d f88955i;

    public h(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, com.avito.android.ai_assistant.adapter.segment_buttons.c cVar, com.avito.android.ai_assistant.adapter.simple_snippet.b bVar, Provider provider6, com.avito.android.ai_assistant.adapter.repeat_button.d dVar) {
        this.f88947a = provider;
        this.f88948b = provider2;
        this.f88949c = provider3;
        this.f88950d = provider4;
        this.f88951e = provider5;
        this.f88952f = cVar;
        this.f88953g = bVar;
        this.f88954h = provider6;
        this.f88955i = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() throws BlueprintCollisionException {
        com.avito.android.ai_assistant.adapter.user_message.c cVar = this.f88947a.get();
        com.avito.android.ai_assistant.adapter.assistant_text_message.c cVar2 = this.f88948b.get();
        com.avito.android.ai_assistant.adapter.answer_loading.c cVar3 = this.f88949c.get();
        com.avito.android.ai_assistant.adapter.append.c cVar4 = this.f88950d.get();
        com.avito.android.ai_assistant.adapter.message_actions.b bVar = this.f88951e.get();
        com.avito.android.ai_assistant.adapter.segment_buttons.b bVar2 = (com.avito.android.ai_assistant.adapter.segment_buttons.b) this.f88952f.get();
        com.avito.android.ai_assistant.adapter.simple_snippet.a aVar = (com.avito.android.ai_assistant.adapter.simple_snippet.a) this.f88953g.get();
        com.avito.android.ai_assistant.adapter.beduin.b bVar3 = this.f88954h.get();
        com.avito.android.ai_assistant.adapter.repeat_button.c cVar5 = (com.avito.android.ai_assistant.adapter.repeat_button.c) this.f88955i.get();
        c cVar6 = c.f88941a;
        a.C10493a c10493a = new a.C10493a();
        c10493a.b(cVar);
        c10493a.b(cVar2);
        c10493a.b(cVar3);
        c10493a.b(cVar4);
        c10493a.b(bVar);
        c10493a.b(bVar2);
        c10493a.b(aVar);
        c10493a.b(bVar3);
        c10493a.b(cVar5);
        return c10493a.a();
    }
}
