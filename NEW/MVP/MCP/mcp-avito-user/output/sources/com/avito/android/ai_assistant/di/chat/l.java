package com.avito.android.ai_assistant.di.chat;

import Jb.InterfaceC14183a;
import Nb.InterfaceC14555a;
import com.avito.android.ai_assistant.AssistantChatArguments;
import com.avito.android.ai_assistant.di.chat.a;
import com.avito.android.ai_assistant.di.chat.d;
import com.avito.android.ai_assistant.screens.chat.AiAssistantChatFragment;
import com.avito.android.ai_assistant.screens.chat.mvi.C;
import com.avito.android.ai_assistant.screens.chat.mvi.E;
import com.avito.android.ai_assistant.screens.chat.mvi.G;
import com.avito.android.ai_assistant.screens.chat.mvi.J;
import com.avito.android.ai_assistant.screens.chat.mvi.z;
import com.avito.android.ai_assistant.screens.chat.t;
import com.avito.android.ai_assistant.screens.chat.use_case.m;
import com.avito.android.ai_assistant.screens.chat.use_case.q;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.u;
import iT.C41343c;
import iT.InterfaceC41342b;

/* compiled from: DaggerAiAssistantChatComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class l {

    /* compiled from: DaggerAiAssistantChatComponent.java */
    public static final class b implements com.avito.android.ai_assistant.di.chat.a {

        /* renamed from: A, reason: collision with root package name */
        public final u<InterfaceC28481c> f88957A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.l f88958B;

        /* renamed from: C, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f88959C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.adapter.user_message.f> f88960D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.util.text.a> f88961E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.adapter.user_message.c> f88962F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.adapter.assistant_text_message.f> f88963G;

        /* renamed from: H, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.adapter.assistant_text_message.c> f88964H;

        /* renamed from: I, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.adapter.answer_loading.c> f88965I;

        /* renamed from: J, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.adapter.append.g> f88966J;

        /* renamed from: K, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.adapter.append.c> f88967K;

        /* renamed from: L, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.adapter.message_actions.b> f88968L;

        /* renamed from: M, reason: collision with root package name */
        public final com.avito.android.ai_assistant.adapter.segment_buttons.c f88969M;

        /* renamed from: N, reason: collision with root package name */
        public final com.avito.android.ai_assistant.adapter.simple_snippet.b f88970N;

        /* renamed from: O, reason: collision with root package name */
        public final u<com.avito.android.lib.beduin_v2.feature.item.b> f88971O;

        /* renamed from: P, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.adapter.beduin.b> f88972P;

        /* renamed from: Q, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f88973Q;

        /* renamed from: R, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f88974R;

        /* renamed from: S, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f88975S;

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f88976a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.ai_assistant.di.chat.b f88977b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f88978c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f88979d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.screens.chat.mvi.interactor.f> f88980e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC14555a> f88981f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.screens.chat.use_case.e> f88982g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.screens.chat.use_case.a> f88983h;

        /* renamed from: i, reason: collision with root package name */
        public final u<m> f88984i;

        /* renamed from: j, reason: collision with root package name */
        public final u<InterfaceC28373a> f88985j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC14183a> f88986k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.favorite.h> f88987l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.screens.chat.mvi.interactor.a> f88988m;

        /* renamed from: n, reason: collision with root package name */
        public final E f88989n;

        /* renamed from: o, reason: collision with root package name */
        public final u<Vb.e> f88990o;

        /* renamed from: p, reason: collision with root package name */
        public final z f88991p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.screens.chat.use_case.j> f88992q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.android.clientEventBus.a> f88993r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.ai_assistant.screens.chat.mvi.u f88994s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.adapter.k> f88995t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.adapter.e> f88996u;

        /* renamed from: v, reason: collision with root package name */
        public final u<com.avito.android.ai_assistant.adapter.b> f88997v;

        /* renamed from: w, reason: collision with root package name */
        public final J f88998w;

        /* renamed from: x, reason: collision with root package name */
        public final C f88999x;

        /* renamed from: y, reason: collision with root package name */
        public final u<C41343c> f89000y;

        /* renamed from: z, reason: collision with root package name */
        public final t f89001z;

        /* compiled from: DaggerAiAssistantChatComponent.java */
        public static final class a implements u<InterfaceC14555a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.ai_assistant.di.chat.b f89002a;

            public a(com.avito.android.ai_assistant.di.chat.b bVar) {
                this.f89002a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14555a interfaceC14555aM4 = this.f89002a.m4();
                dagger.internal.t.c(interfaceC14555aM4);
                return interfaceC14555aM4;
            }
        }

        /* compiled from: DaggerAiAssistantChatComponent.java */
        /* renamed from: com.avito.android.ai_assistant.di.chat.l$b$b, reason: collision with other inner class name */
        public static final class C2629b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.ai_assistant.di.chat.b f89003a;

            public C2629b(com.avito.android.ai_assistant.di.chat.b bVar) {
                this.f89003a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f89003a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerAiAssistantChatComponent.java */
        public static final class c implements u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.ai_assistant.di.chat.b f89004a;

            public c(com.avito.android.ai_assistant.di.chat.b bVar) {
                this.f89004a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f89004a.e();
                dagger.internal.t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerAiAssistantChatComponent.java */
        public static final class d implements u<com.avito.android.lib.beduin_v2.feature.item.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.ai_assistant.di.chat.b f89005a;

            public d(com.avito.android.ai_assistant.di.chat.b bVar) {
                this.f89005a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f89005a.j0();
            }
        }

        /* compiled from: DaggerAiAssistantChatComponent.java */
        public static final class e implements u<com.avito.android.clientEventBus.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.ai_assistant.di.chat.b f89006a;

            public e(com.avito.android.ai_assistant.di.chat.b bVar) {
                this.f89006a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.clientEventBus.a aVarH0 = this.f89006a.h0();
                dagger.internal.t.c(aVarH0);
                return aVarH0;
            }
        }

        /* compiled from: DaggerAiAssistantChatComponent.java */
        public static final class f implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.ai_assistant.di.chat.b f89007a;

            public f(com.avito.android.ai_assistant.di.chat.b bVar) {
                this.f89007a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f89007a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerAiAssistantChatComponent.java */
        public static final class g implements u<com.avito.android.favorite.h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.ai_assistant.di.chat.b f89008a;

            public g(com.avito.android.ai_assistant.di.chat.b bVar) {
                this.f89008a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f89008a.P0();
            }
        }

        /* compiled from: DaggerAiAssistantChatComponent.java */
        public static final class h implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.ai_assistant.di.chat.b f89009a;

            public h(com.avito.android.ai_assistant.di.chat.b bVar) {
                this.f89009a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f89009a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.ai_assistant.di.chat.b bVar, cv.b bVar2, C28478k c28478k, AssistantChatArguments assistantChatArguments, InterfaceC41342b interfaceC41342b, com.avito.android.ai_assistant.adapter.append.f fVar, com.avito.android.ai_assistant.adapter.message_actions.h hVar, com.avito.android.ai_assistant.adapter.segment_buttons.e eVar, com.avito.android.ai_assistant.adapter.simple_snippet.e eVar2, com.avito.android.ai_assistant.adapter.repeat_button.e eVar3, a aVar) {
            this.f88976a = bVar2;
            this.f88977b = bVar;
            this.f88978c = dagger.internal.l.a(assistantChatArguments);
            f fVar2 = new f(bVar);
            this.f88979d = fVar2;
            this.f88980e = B.a(new com.avito.android.ai_assistant.screens.chat.mvi.interactor.h(fVar2));
            a aVar2 = new a(bVar);
            this.f88981f = aVar2;
            this.f88982g = B.a(new com.avito.android.ai_assistant.screens.chat.use_case.i(this.f88979d, aVar2));
            this.f88983h = B.a(new com.avito.android.ai_assistant.screens.chat.use_case.d(this.f88979d, this.f88981f));
            this.f88984i = B.a(new q(this.f88979d, this.f88981f));
            u<InterfaceC14183a> uVarA = B.a(new Jb.c(new C2629b(bVar)));
            this.f88986k = uVarA;
            g gVar = new g(bVar);
            this.f88987l = gVar;
            this.f88988m = B.a(new com.avito.android.ai_assistant.screens.chat.mvi.interactor.e(uVarA, this.f88980e, this.f88982g, this.f88983h, this.f88984i, gVar));
            E e12 = new E(this.f88978c);
            this.f88989n = e12;
            u<Vb.e> uVarD = dagger.internal.g.d(new com.avito.android.ai_assistant.di.chat.g(e12));
            this.f88990o = uVarD;
            this.f88991p = new z(this.f88978c, uVarD, this.f88988m, this.f88987l);
            u<com.avito.android.ai_assistant.screens.chat.use_case.j> uVarA2 = B.a(new com.avito.android.ai_assistant.screens.chat.use_case.l(this.f88981f));
            this.f88992q = uVarA2;
            this.f88994s = new com.avito.android.ai_assistant.screens.chat.mvi.u(this.f88988m, this.f88980e, uVarA2, new e(bVar), com.avito.android.ai_assistant.screens.chat.mvi.t.a(), this.f88986k, this.f88990o);
            this.f88995t = dagger.internal.g.d(com.avito.android.ai_assistant.adapter.m.a());
            u<com.avito.android.ai_assistant.adapter.e> uVarD2 = dagger.internal.g.d(com.avito.android.ai_assistant.adapter.g.a());
            this.f88996u = uVarD2;
            u<com.avito.android.ai_assistant.adapter.b> uVarD3 = dagger.internal.g.d(new com.avito.android.ai_assistant.adapter.d(uVarD2, this.f88995t));
            this.f88997v = uVarD3;
            this.f88998w = new J(uVarD3);
            this.f88999x = new C(this.f88991p, this.f88994s, G.a(), this.f88998w, this.f88989n);
            u<C41343c> uVarD4 = dagger.internal.g.d(d.a.f88942a);
            this.f89000y = uVarD4;
            this.f89001z = new t(this.f88999x, uVarD4);
            this.f88957A = new h(bVar);
            dagger.internal.l lVarA = dagger.internal.l.a(c28478k);
            this.f88958B = lVarA;
            this.f88959C = com.avito.android.actions_sheet.a.s(lVarA, this.f88957A);
            u<com.avito.android.ai_assistant.adapter.user_message.f> uVarD5 = dagger.internal.g.d(com.avito.android.ai_assistant.adapter.user_message.h.a());
            this.f88960D = uVarD5;
            c cVar = new c(bVar);
            this.f88961E = cVar;
            this.f88962F = dagger.internal.g.d(new com.avito.android.ai_assistant.adapter.user_message.e(uVarD5, cVar));
            u<com.avito.android.ai_assistant.adapter.assistant_text_message.f> uVarD6 = dagger.internal.g.d(new com.avito.android.ai_assistant.adapter.assistant_text_message.i(this.f88979d));
            this.f88963G = uVarD6;
            this.f88964H = dagger.internal.g.d(new com.avito.android.ai_assistant.adapter.assistant_text_message.e(uVarD6, this.f88961E));
            this.f88965I = dagger.internal.g.d(com.avito.android.ai_assistant.adapter.answer_loading.e.a());
            u<com.avito.android.ai_assistant.adapter.append.g> uVarD7 = dagger.internal.g.d(new com.avito.android.ai_assistant.adapter.append.j(dagger.internal.l.a(fVar)));
            this.f88966J = uVarD7;
            this.f88967K = dagger.internal.g.d(new com.avito.android.ai_assistant.adapter.append.e(uVarD7));
            this.f88968L = dagger.internal.g.d(new com.avito.android.ai_assistant.adapter.message_actions.d(dagger.internal.l.a(hVar)));
            this.f88969M = new com.avito.android.ai_assistant.adapter.segment_buttons.c(dagger.internal.l.a(eVar));
            this.f88970N = new com.avito.android.ai_assistant.adapter.simple_snippet.b(dagger.internal.l.a(eVar2), this.f88961E);
            this.f88971O = new d(bVar);
            this.f88972P = dagger.internal.g.d(new com.avito.android.ai_assistant.adapter.beduin.d(this.f88958B, dagger.internal.l.a(interfaceC41342b), this.f88959C, this.f88971O));
            u<com.avito.konveyor.a> uVarD8 = dagger.internal.g.d(new com.avito.android.ai_assistant.di.chat.h(this.f88962F, this.f88964H, this.f88965I, this.f88967K, this.f88968L, this.f88969M, this.f88970N, this.f88972P, new com.avito.android.ai_assistant.adapter.repeat_button.d(dagger.internal.l.a(eVar3))));
            this.f88973Q = uVarD8;
            u<com.avito.konveyor.adapter.a> uVarD9 = dagger.internal.g.d(new com.avito.android.ai_assistant.di.chat.e(uVarD8));
            this.f88974R = uVarD9;
            this.f88975S = dagger.internal.g.d(new com.avito.android.ai_assistant.di.chat.f(uVarD9, this.f88973Q));
        }

        @Override // com.avito.android.ai_assistant.di.chat.a
        public final void a(AiAssistantChatFragment aiAssistantChatFragment) {
            aiAssistantChatFragment.f89145n0 = this.f89001z;
            aiAssistantChatFragment.f89146o0 = this.f88959C.get();
            aiAssistantChatFragment.f89147p0 = this.f88975S.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f88976a.u4();
            dagger.internal.t.c(aVarU4);
            aiAssistantChatFragment.f89148q0 = aVarU4;
            com.avito.android.ai_assistant.di.chat.b bVar = this.f88977b;
            com.avito.android.util.text.a aVarE = bVar.e();
            dagger.internal.t.c(aVarE);
            aiAssistantChatFragment.f89149r0 = aVarE;
            SK0.b bVarP = bVar.p();
            dagger.internal.t.c(bVarP);
            aiAssistantChatFragment.f89150s0 = new Xb.d(bVarP);
            aiAssistantChatFragment.f89151t0 = this.f88963G.get();
        }
    }

    /* compiled from: DaggerAiAssistantChatComponent.java */
    public static final class c implements a.InterfaceC2628a {
        public c() {
        }

        @Override // com.avito.android.ai_assistant.di.chat.a.InterfaceC2628a
        public final com.avito.android.ai_assistant.di.chat.a a(com.avito.android.ai_assistant.di.chat.b bVar, InterfaceC39417a interfaceC39417a, C28478k c28478k, AssistantChatArguments assistantChatArguments, com.avito.android.ai_assistant.screens.chat.a aVar, AiAssistantChatFragment.f fVar, AiAssistantChatFragment.g gVar, com.avito.android.ai_assistant.screens.chat.g gVar2, AiAssistantChatFragment.h hVar, com.avito.android.ai_assistant.screens.chat.b bVar2) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, c28478k, assistantChatArguments, aVar, fVar, gVar, gVar2, hVar, bVar2, null);
        }
    }

    public static a.InterfaceC2628a a() {
        return new c();
    }
}
