package com.avito.android.messenger.di;

import java.util.List;
import kotlin.collections.C42745f0;

/* compiled from: MessageMenuModule_ProvideMessageMenuElementProvidersListFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class P0 implements dagger.internal.h<List<com.avito.android.messenger.conversation.mvi.message_menu.c>> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.message_menu.elements.g f195687a;

    /* renamed from: b, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.message_menu.elements.i f195688b;

    /* renamed from: c, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.e f195689c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.message_menu.elements.c f195690d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.message_menu.elements.o f195691e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.message_menu.elements.e f195692f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.e f195693g;

    /* renamed from: h, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote.d f195694h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.message_menu.elements.quote.c f195695i;

    public P0(com.avito.android.messenger.conversation.mvi.message_menu.elements.g gVar, com.avito.android.messenger.conversation.mvi.message_menu.elements.i iVar, com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.e eVar, com.avito.android.messenger.conversation.mvi.message_menu.elements.c cVar, com.avito.android.messenger.conversation.mvi.message_menu.elements.o oVar, com.avito.android.messenger.conversation.mvi.message_menu.elements.e eVar2, com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.e eVar3, com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote.d dVar, com.avito.android.messenger.conversation.mvi.message_menu.elements.quote.c cVar2) {
        this.f195687a = gVar;
        this.f195688b = iVar;
        this.f195689c = eVar;
        this.f195690d = cVar;
        this.f195691e = oVar;
        this.f195692f = eVar2;
        this.f195693g = eVar3;
        this.f195694h = dVar;
        this.f195695i = cVar2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        this.f195687a.getClass();
        com.avito.android.messenger.conversation.mvi.message_menu.elements.f fVar = new com.avito.android.messenger.conversation.mvi.message_menu.elements.f();
        com.avito.android.messenger.conversation.mvi.message_menu.elements.h hVar = (com.avito.android.messenger.conversation.mvi.message_menu.elements.h) this.f195688b.get();
        com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.c cVar = (com.avito.android.messenger.conversation.mvi.message_menu.elements.quick_reply.c) this.f195689c.get();
        com.avito.android.messenger.conversation.mvi.message_menu.elements.a aVar = (com.avito.android.messenger.conversation.mvi.message_menu.elements.a) this.f195690d.get();
        com.avito.android.messenger.conversation.mvi.message_menu.elements.j jVar = (com.avito.android.messenger.conversation.mvi.message_menu.elements.j) this.f195691e.get();
        com.avito.android.messenger.conversation.mvi.message_menu.elements.d dVar = (com.avito.android.messenger.conversation.mvi.message_menu.elements.d) this.f195692f.get();
        com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.a aVar2 = (com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_local.a) this.f195693g.get();
        com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote.a aVar3 = (com.avito.android.messenger.conversation.mvi.message_menu.elements.delete_remote.a) this.f195694h.get();
        com.avito.android.messenger.conversation.mvi.message_menu.elements.quote.a aVar4 = (com.avito.android.messenger.conversation.mvi.message_menu.elements.quote.a) this.f195695i.get();
        int i12 = N0.f195675a;
        List listU = C42745f0.U(fVar, hVar, aVar4, cVar, aVar, jVar, aVar2, aVar3, dVar);
        dagger.internal.t.d(listU);
        return listU;
    }
}
