package com.avito.android.ai_assistant.adapter.chat_list_item;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ChatListItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final g f88795a;

    public c(g gVar) {
        this.f88795a = gVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((f) this.f88795a.get());
    }
}
