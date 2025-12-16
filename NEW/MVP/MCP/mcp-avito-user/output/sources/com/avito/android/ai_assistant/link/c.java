package com.avito.android.ai_assistant.link;

import bv.C25719a;
import bv.C25721c;
import com.avito.android.deeplink_handler.view.a;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: AiAssistantOpenLinkHandler_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Sb.c f89098a;

    /* renamed from: b, reason: collision with root package name */
    public final dv.b f89099b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.navigation.c f89100c;

    /* renamed from: d, reason: collision with root package name */
    public final C25721c f89101d;

    public c(Sb.c cVar, dv.b bVar, com.avito.android.navigation.c cVar2, C25721c c25721c) {
        this.f89098a = cVar;
        this.f89099b = bVar;
        this.f89100c = cVar2;
        this.f89101d = c25721c;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b((Ib.c) this.f89098a.get(), (a.InterfaceC4053a) this.f89099b.get(), (com.avito.android.navigation.a) this.f89100c.get(), (C25719a) this.f89101d.get());
    }
}
