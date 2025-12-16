package com.avito.android.ai_assistant.di.chat_list;

import Nb.InterfaceC14555a;
import com.avito.android.ai_assistant.adapter.append.f;
import com.avito.android.ai_assistant.di.chat_list.a;
import com.avito.android.ai_assistant.screens.chat_list.AiAssistantChatListFragment;
import com.avito.android.ai_assistant.screens.chat_list.AssistantChatListArguments;
import com.avito.android.ai_assistant.screens.chat_list.mvi.g;
import com.avito.android.ai_assistant.screens.chat_list.mvi.j;
import com.avito.android.ai_assistant.screens.chat_list.mvi.n;
import com.avito.android.ai_assistant.screens.chat_list.mvi.p;
import com.avito.android.ai_assistant.screens.chat_list.mvi.r;
import com.avito.android.ai_assistant.screens.chat_list.mvi.t;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.u;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerAiAssistantChatListComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class e {

    /* compiled from: DaggerAiAssistantChatListComponent.java */
    public static final class b implements com.avito.android.ai_assistant.di.chat_list.a {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC14555a> f89013a;

        /* renamed from: b, reason: collision with root package name */
        public final u<R0> f89014b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.ai_assistant.screens.chat_list.mvi.e f89015c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f89016d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.ai_assistant.screens.chat_list.mvi.c f89017e;

        /* renamed from: f, reason: collision with root package name */
        public final r f89018f;

        /* renamed from: g, reason: collision with root package name */
        public final t f89019g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f89020h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f89021i;

        /* renamed from: j, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f89022j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.ai_assistant.adapter.chat_list_item.c f89023k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.ai_assistant.adapter.chat_list_date_item.c f89024l;

        /* renamed from: m, reason: collision with root package name */
        public final com.avito.android.ai_assistant.adapter.append.e f89025m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f89026n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f89027o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f89028p;

        /* compiled from: DaggerAiAssistantChatListComponent.java */
        public static final class a implements u<InterfaceC14555a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.ai_assistant.di.chat_list.b f89029a;

            public a(com.avito.android.ai_assistant.di.chat_list.b bVar) {
                this.f89029a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14555a interfaceC14555aM4 = this.f89029a.m4();
                dagger.internal.t.c(interfaceC14555aM4);
                return interfaceC14555aM4;
            }
        }

        /* compiled from: DaggerAiAssistantChatListComponent.java */
        /* renamed from: com.avito.android.ai_assistant.di.chat_list.e$b$b, reason: collision with other inner class name */
        public static final class C2631b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.ai_assistant.di.chat_list.b f89030a;

            public C2631b(com.avito.android.ai_assistant.di.chat_list.b bVar) {
                this.f89030a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f89030a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerAiAssistantChatListComponent.java */
        public static final class c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.ai_assistant.di.chat_list.b f89031a;

            public c(com.avito.android.ai_assistant.di.chat_list.b bVar) {
                this.f89031a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f89031a.c();
                dagger.internal.t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerAiAssistantChatListComponent.java */
        public static final class d implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.ai_assistant.di.chat_list.b f89032a;

            public d(com.avito.android.ai_assistant.di.chat_list.b bVar) {
                this.f89032a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f89032a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b(com.avito.android.ai_assistant.di.chat_list.b bVar, cv.b bVar2, AssistantChatListArguments assistantChatListArguments, C28478k c28478k, com.avito.android.ai_assistant.adapter.chat_list_item.d dVar, f fVar, a aVar) {
            n nVar = new n(l.a(assistantChatListArguments), new a(bVar), new c(bVar));
            this.f89015c = new com.avito.android.ai_assistant.screens.chat_list.mvi.e(nVar);
            this.f89017e = new com.avito.android.ai_assistant.screens.chat_list.mvi.c(nVar, new Jb.c(new C2631b(bVar)));
            this.f89018f = new r(g.a());
            this.f89019g = new t(new j(this.f89015c, this.f89017e, p.a(), this.f89018f));
            this.f89020h = new d(bVar);
            this.f89021i = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f89020h);
            this.f89022j = B.a(com.avito.android.konveyor_adapter_module.d.a());
            this.f89023k = new com.avito.android.ai_assistant.adapter.chat_list_item.c(new com.avito.android.ai_assistant.adapter.chat_list_item.g(l.a(dVar)));
            this.f89024l = new com.avito.android.ai_assistant.adapter.chat_list_date_item.c(com.avito.android.ai_assistant.adapter.chat_list_date_item.e.a());
            this.f89025m = new com.avito.android.ai_assistant.adapter.append.e(new com.avito.android.ai_assistant.adapter.append.j(l.a(fVar)));
            A.b bVarA = A.a(3, 1);
            bVarA.f393938b.add(this.f89022j);
            com.avito.android.ai_assistant.adapter.chat_list_item.c cVar = this.f89023k;
            List<u<T>> list = bVarA.f393937a;
            list.add(cVar);
            list.add(this.f89024l);
            list.add(this.f89025m);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f89026n = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f89027o = uVarH;
            this.f89028p = dagger.internal.g.d(new com.avito.android.ai_assistant.di.chat_list.d(uVarH, this.f89026n));
        }

        @Override // com.avito.android.ai_assistant.di.chat_list.a
        public final void a(AiAssistantChatListFragment aiAssistantChatListFragment) {
            aiAssistantChatListFragment.f89568n0 = this.f89019g;
            aiAssistantChatListFragment.f89569o0 = this.f89021i.get();
            aiAssistantChatListFragment.f89570p0 = this.f89028p.get();
        }
    }

    /* compiled from: DaggerAiAssistantChatListComponent.java */
    public static final class c implements a.InterfaceC2630a {
        public c() {
        }

        @Override // com.avito.android.ai_assistant.di.chat_list.a.InterfaceC2630a
        public final com.avito.android.ai_assistant.di.chat_list.a a(com.avito.android.ai_assistant.di.chat_list.b bVar, InterfaceC39417a interfaceC39417a, AssistantChatListArguments assistantChatListArguments, C28478k c28478k, com.avito.android.ai_assistant.screens.chat_list.a aVar, AiAssistantChatListFragment.e eVar) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, assistantChatListArguments, c28478k, aVar, eVar, null);
        }
    }

    public static a.InterfaceC2630a a() {
        return new c();
    }
}
