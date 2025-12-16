package com.avito.android.ai_assistant.screens.chat_list.mvi;

import Wb.c;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AiAssistantChatListFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final e f89621a;

    /* renamed from: b, reason: collision with root package name */
    public final c f89622b;

    /* renamed from: c, reason: collision with root package name */
    public final p f89623c;

    /* renamed from: d, reason: collision with root package name */
    public final r f89624d;

    public j(e eVar, c cVar, p pVar, r rVar) {
        this.f89621a = eVar;
        this.f89622b = cVar;
        this.f89623c = pVar;
        this.f89624d = rVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        d dVar = (d) this.f89621a.get();
        a aVar = (a) this.f89622b.get();
        this.f89623c.getClass();
        o oVar = new o();
        return new i("AiAssistantChatList", c.C1275c.f17975b, new h(dVar, aVar, (q) this.f89624d.get(), oVar));
    }
}
