package com.avito.android.mortgage_invite.participant.di;

import c20.InterfaceC26928e;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage_invite.model.participant.ParticipantArguments;
import com.avito.android.mortgage_invite.participant.O;
import com.avito.android.mortgage_invite.participant.ParticipantFragment;
import com.avito.android.mortgage_invite.participant.di.f;
import com.avito.android.mortgage_invite.participant.domain.validation.j;
import com.avito.android.mortgage_invite.participant.domain.validation.o;
import com.avito.android.mortgage_invite.participant.mvi.q;
import com.avito.android.mortgage_invite.participant.mvi.s;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import e20.InterfaceC39928a;
import q20.InterfaceC47188b;

/* compiled from: DaggerParticipantComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class d {

    /* compiled from: DaggerParticipantComponent.java */
    public static final class b implements f.b {
        public b() {
        }

        @Override // com.avito.android.mortgage_invite.participant.di.f.b
        public final f a(InterfaceC26928e interfaceC26928e, InterfaceC39417a interfaceC39417a, ParticipantArguments participantArguments, C28478k c28478k) {
            interfaceC39417a.getClass();
            return new c(interfaceC26928e, interfaceC39417a, participantArguments, c28478k, null);
        }
    }

    /* compiled from: DaggerParticipantComponent.java */
    public static final class c implements f {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f206075a;

        /* renamed from: b, reason: collision with root package name */
        public final InterfaceC26928e f206076b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28481c> f206077c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f206078d;

        /* renamed from: e, reason: collision with root package name */
        public final l f206079e;

        /* renamed from: f, reason: collision with root package name */
        public final u<S10.c> f206080f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC39928a> f206081g;

        /* renamed from: h, reason: collision with root package name */
        public final u<R0> f206082h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.mortgage_invite.participant.interactor.d> f206083i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.mortgage_invite.participant.mvi.l f206084j;

        /* renamed from: k, reason: collision with root package name */
        public final s f206085k;

        /* renamed from: l, reason: collision with root package name */
        public final o f206086l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC28373a> f206087m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.android.mortgage_invite.participant.interactor.a> f206088n;

        /* renamed from: o, reason: collision with root package name */
        public final O f206089o;

        /* compiled from: DaggerParticipantComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f206090a;

            public a(InterfaceC26928e interfaceC26928e) {
                this.f206090a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f206090a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerParticipantComponent.java */
        public static final class b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f206091a;

            public b(InterfaceC26928e interfaceC26928e) {
                this.f206091a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f206091a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerParticipantComponent.java */
        /* renamed from: com.avito.android.mortgage_invite.participant.di.d$c$c, reason: collision with other inner class name */
        public static final class C6141c implements u<InterfaceC39928a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f206092a;

            public C6141c(InterfaceC26928e interfaceC26928e) {
                this.f206092a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39928a interfaceC39928aJb = this.f206092a.Jb();
                t.c(interfaceC39928aJb);
                return interfaceC39928aJb;
            }
        }

        /* compiled from: DaggerParticipantComponent.java */
        /* renamed from: com.avito.android.mortgage_invite.participant.di.d$c$d, reason: collision with other inner class name */
        public static final class C6142d implements u<S10.c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f206093a;

            public C6142d(InterfaceC26928e interfaceC26928e) {
                this.f206093a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                S10.c cVarCj = this.f206093a.cj();
                t.c(cVarCj);
                return cVarCj;
            }
        }

        /* compiled from: DaggerParticipantComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC26928e f206094a;

            public e(InterfaceC26928e interfaceC26928e) {
                this.f206094a = interfaceC26928e;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f206094a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(InterfaceC26928e interfaceC26928e, cv.b bVar, ParticipantArguments participantArguments, C28478k c28478k, a aVar) {
            this.f206075a = bVar;
            this.f206076b = interfaceC26928e;
            this.f206077c = new e(interfaceC26928e);
            this.f206078d = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f206077c);
            this.f206079e = l.a(participantArguments);
            this.f206080f = new C6142d(interfaceC26928e);
            this.f206081g = new C6141c(interfaceC26928e);
            this.f206082h = new b(interfaceC26928e);
            u<com.avito.android.mortgage_invite.participant.interactor.d> uVarA = B.a(new com.avito.android.mortgage_invite.participant.interactor.g(com.avito.android.mortgage_invite.participant.domain.mapper.c.a(), this.f206079e, this.f206080f, this.f206081g, this.f206082h));
            this.f206083i = uVarA;
            this.f206084j = new com.avito.android.mortgage_invite.participant.mvi.l(uVarA);
            this.f206085k = new s(com.avito.android.mortgage_invite.participant.mvi.builder.c.a());
            this.f206086l = new o(j.a(), com.avito.android.mortgage_invite.participant.domain.validation.l.a(), com.avito.android.mortgage_invite.participant.domain.validation.b.a(), com.avito.android.mortgage_invite.participant.domain.validation.f.a(), com.avito.android.mortgage_invite.participant.domain.validation.h.a(), com.avito.android.mortgage_invite.participant.domain.validation.d.a());
            u<com.avito.android.mortgage_invite.participant.interactor.a> uVarA2 = B.a(new com.avito.android.mortgage_invite.participant.interactor.c(new a(interfaceC26928e)));
            this.f206088n = uVarA2;
            this.f206089o = new O(new com.avito.android.mortgage_invite.participant.mvi.o(this.f206084j, this.f206085k, new com.avito.android.mortgage_invite.participant.mvi.j(this.f206086l, this.f206083i, uVarA2), q.a(), this.f206078d));
        }

        @Override // com.avito.android.mortgage_invite.participant.di.f
        public final void a(ParticipantFragment participantFragment) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f206075a.u4();
            t.c(aVarU4);
            participantFragment.f206039n0 = aVarU4;
            InterfaceC47188b interfaceC47188bE4 = this.f206076b.e4();
            t.c(interfaceC47188bE4);
            participantFragment.f206040o0 = interfaceC47188bE4;
            participantFragment.f206041p0 = this.f206078d.get();
            participantFragment.f206043r0 = this.f206089o;
        }
    }

    public static f.b a() {
        return new b();
    }
}
