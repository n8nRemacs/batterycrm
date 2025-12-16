package com.avito.android.messenger.conversation.mvi.messages;

import android.content.res.Resources;
import com.avito.android.C30277e1;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyer2TestGroup;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsBuyerTestGroup;
import com.avito.android.ab_tests.configs.AssistantUxImprovementsSellerTestGroup;
import javax.inject.Provider;

/* compiled from: MessageListItemConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class d0 implements dagger.internal.h<c0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<LY.b> f192885a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<LY.d> f192886b;

    /* renamed from: c, reason: collision with root package name */
    public final y0 f192887c;

    /* renamed from: d, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.messages.builders.h f192888d;

    /* renamed from: e, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.messages.builders.n f192889e;

    /* renamed from: f, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.messages.builders.j f192890f;

    /* renamed from: g, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.messages.builders.p f192891g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.messages.builders.q> f192892h;

    /* renamed from: i, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.messages.builders.f f192893i;

    /* renamed from: j, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.messages.builders.b f192894j;

    /* renamed from: k, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.messages.builders.l f192895k;

    /* renamed from: l, reason: collision with root package name */
    public final com.avito.android.messenger.conversation.mvi.messages.builders.d f192896l;

    /* renamed from: m, reason: collision with root package name */
    public final Provider<C30277e1> f192897m;

    /* renamed from: n, reason: collision with root package name */
    public final Provider<u3.g<AssistantUxImprovementsSellerTestGroup>> f192898n;

    /* renamed from: o, reason: collision with root package name */
    public final Provider<u3.g<AssistantUxImprovementsBuyerTestGroup>> f192899o;

    /* renamed from: p, reason: collision with root package name */
    public final Provider<u3.g<AssistantUxImprovementsBuyer2TestGroup>> f192900p;

    /* renamed from: q, reason: collision with root package name */
    public final dagger.internal.l f192901q;

    public d0(Provider provider, Provider provider2, y0 y0Var, com.avito.android.messenger.conversation.mvi.messages.builders.h hVar, com.avito.android.messenger.conversation.mvi.messages.builders.n nVar, com.avito.android.messenger.conversation.mvi.messages.builders.j jVar, com.avito.android.messenger.conversation.mvi.messages.builders.p pVar, Provider provider3, com.avito.android.messenger.conversation.mvi.messages.builders.f fVar, com.avito.android.messenger.conversation.mvi.messages.builders.b bVar, com.avito.android.messenger.conversation.mvi.messages.builders.l lVar, com.avito.android.messenger.conversation.mvi.messages.builders.d dVar, Provider provider4, Provider provider5, Provider provider6, Provider provider7, dagger.internal.l lVar2) {
        this.f192885a = provider;
        this.f192886b = provider2;
        this.f192887c = y0Var;
        this.f192888d = hVar;
        this.f192889e = nVar;
        this.f192890f = jVar;
        this.f192891g = pVar;
        this.f192892h = provider3;
        this.f192893i = fVar;
        this.f192894j = bVar;
        this.f192895k = lVar;
        this.f192896l = dVar;
        this.f192897m = provider4;
        this.f192898n = provider5;
        this.f192899o = provider6;
        this.f192900p = provider7;
        this.f192901q = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        LY.b bVar = this.f192885a.get();
        LY.d dVar = this.f192886b.get();
        x0 x0Var = (x0) this.f192887c.get();
        com.avito.android.messenger.conversation.mvi.messages.builders.g gVar = (com.avito.android.messenger.conversation.mvi.messages.builders.g) this.f192888d.get();
        this.f192889e.getClass();
        com.avito.android.messenger.conversation.mvi.messages.builders.m mVar = new com.avito.android.messenger.conversation.mvi.messages.builders.m();
        com.avito.android.messenger.conversation.mvi.messages.builders.i iVar = (com.avito.android.messenger.conversation.mvi.messages.builders.i) this.f192890f.get();
        this.f192891g.getClass();
        com.avito.android.messenger.conversation.mvi.messages.builders.o oVar = new com.avito.android.messenger.conversation.mvi.messages.builders.o();
        com.avito.android.messenger.conversation.mvi.messages.builders.q qVar = this.f192892h.get();
        this.f192893i.getClass();
        com.avito.android.messenger.conversation.mvi.messages.builders.e eVar = new com.avito.android.messenger.conversation.mvi.messages.builders.e();
        com.avito.android.messenger.conversation.mvi.messages.builders.a aVar = (com.avito.android.messenger.conversation.mvi.messages.builders.a) this.f192894j.get();
        this.f192895k.getClass();
        com.avito.android.messenger.conversation.mvi.messages.builders.k kVar = new com.avito.android.messenger.conversation.mvi.messages.builders.k();
        this.f192896l.getClass();
        return new c0(bVar, dVar, x0Var, gVar, mVar, iVar, oVar, qVar, eVar, aVar, kVar, new com.avito.android.messenger.conversation.mvi.messages.builders.c(), this.f192897m.get(), this.f192898n.get(), this.f192899o.get(), this.f192900p.get(), (Resources) this.f192901q.f393949a);
    }
}
