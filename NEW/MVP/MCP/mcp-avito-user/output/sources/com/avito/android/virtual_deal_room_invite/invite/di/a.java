package com.avito.android.virtual_deal_room_invite.invite.di;

import bO0.InterfaceC25538b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.util.R0;
import com.avito.android.virtual_deal_room.deeplink.model.Category;
import com.avito.android.virtual_deal_room_invite.invite.InviteFragment;
import com.avito.android.virtual_deal_room_invite.invite.di.b;
import com.avito.android.virtual_deal_room_invite.invite.model.InvitationArguments;
import com.avito.android.virtual_deal_room_invite.invite.mvi.i;
import com.avito.android.virtual_deal_room_invite.invite.mvi.k;
import com.avito.android.virtual_deal_room_invite.invite.mvi.m;
import cv.InterfaceC39417a;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import fO0.InterfaceC40325a;
import gO0.InterfaceC40606a;
import java.util.Map;
import lO0.C43666c;
import lO0.InterfaceC43664a;

/* compiled from: DaggerInviteComponent.java */
@e
/* loaded from: classes5.dex */
public final class a {

    /* compiled from: DaggerInviteComponent.java */
    public static final class b implements b.InterfaceC10128b {
        public b() {
        }

        @Override // com.avito.android.virtual_deal_room_invite.invite.di.b.InterfaceC10128b
        public final com.avito.android.virtual_deal_room_invite.invite.di.b a(InterfaceC40325a interfaceC40325a, InterfaceC39417a interfaceC39417a, C28478k c28478k, InvitationArguments invitationArguments) {
            interfaceC39417a.getClass();
            invitationArguments.getClass();
            return new c(interfaceC40325a, interfaceC39417a, c28478k, invitationArguments, null);
        }
    }

    /* compiled from: DaggerInviteComponent.java */
    public static final class c implements com.avito.android.virtual_deal_room_invite.invite.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f326971a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC40606a> f326972b;

        /* renamed from: c, reason: collision with root package name */
        public final l f326973c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f326974d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC43664a> f326975e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.virtual_deal_room_invite.invite.interactor.e> f326976f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.connection_quality.connectivity.a> f326977g;

        /* renamed from: h, reason: collision with root package name */
        public final u<R0> f326978h;

        /* renamed from: i, reason: collision with root package name */
        public final u<Map<Category, InterfaceC25538b>> f326979i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.virtual_deal_room_invite.invite.interactor.a> f326980j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.virtual_deal_room_invite.invite.mvi.f f326981k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.virtual_deal_room_invite.invite.mvi.d f326982l;

        /* renamed from: m, reason: collision with root package name */
        public final m f326983m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC28481c> f326984n;

        /* renamed from: o, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f326985o;

        /* renamed from: p, reason: collision with root package name */
        public final com.avito.android.virtual_deal_room_invite.invite.d f326986p;

        /* compiled from: DaggerInviteComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room_invite.invite.di.a$c$a, reason: collision with other inner class name */
        public static final class C10126a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40325a f326987a;

            public C10126a(InterfaceC40325a interfaceC40325a) {
                this.f326987a = interfaceC40325a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f326987a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerInviteComponent.java */
        public static final class b implements u<com.avito.android.connection_quality.connectivity.a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40325a f326988a;

            public b(InterfaceC40325a interfaceC40325a) {
                this.f326988a = interfaceC40325a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.connection_quality.connectivity.a aVarU = this.f326988a.U();
                t.c(aVarU);
                return aVarU;
            }
        }

        /* compiled from: DaggerInviteComponent.java */
        /* renamed from: com.avito.android.virtual_deal_room_invite.invite.di.a$c$c, reason: collision with other inner class name */
        public static final class C10127c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40325a f326989a;

            public C10127c(InterfaceC40325a interfaceC40325a) {
                this.f326989a = interfaceC40325a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f326989a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerInviteComponent.java */
        public static final class d implements u<InterfaceC40606a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40325a f326990a;

            public d(InterfaceC40325a interfaceC40325a) {
                this.f326990a = interfaceC40325a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40606a interfaceC40606aQc = this.f326990a.qc();
                t.c(interfaceC40606aQc);
                return interfaceC40606aQc;
            }
        }

        /* compiled from: DaggerInviteComponent.java */
        public static final class e implements u<Map<Category, InterfaceC25538b>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40325a f326991a;

            public e(InterfaceC40325a interfaceC40325a) {
                this.f326991a = interfaceC40325a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Map<Category, InterfaceC25538b> mapOa = this.f326991a.oa();
                t.c(mapOa);
                return mapOa;
            }
        }

        /* compiled from: DaggerInviteComponent.java */
        public static final class f implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC40325a f326992a;

            public f(InterfaceC40325a interfaceC40325a) {
                this.f326992a = interfaceC40325a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f326992a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(InterfaceC40325a interfaceC40325a, cv.b bVar, C28478k c28478k, InvitationArguments invitationArguments, C10125a c10125a) {
            this.f326971a = bVar;
            this.f326972b = new d(interfaceC40325a);
            l lVarA = l.a(invitationArguments);
            this.f326973c = lVarA;
            this.f326975e = B.a(new C43666c(lVarA, new C10126a(interfaceC40325a)));
            u<com.avito.android.virtual_deal_room_invite.invite.interactor.e> uVarD = g.d(com.avito.android.virtual_deal_room_invite.invite.interactor.f.a());
            this.f326976f = uVarD;
            b bVar2 = new b(interfaceC40325a);
            C10127c c10127c = new C10127c(interfaceC40325a);
            e eVar = new e(interfaceC40325a);
            u<com.avito.android.virtual_deal_room_invite.invite.interactor.a> uVarA = B.a(new com.avito.android.virtual_deal_room_invite.invite.interactor.d(this.f326973c, uVarD, this.f326972b, this.f326975e, bVar2, c10127c, eVar));
            this.f326980j = uVarA;
            this.f326981k = new com.avito.android.virtual_deal_room_invite.invite.mvi.f(uVarA, this.f326976f);
            this.f326982l = new com.avito.android.virtual_deal_room_invite.invite.mvi.d(uVarA, this.f326975e);
            this.f326983m = new m(com.avito.android.virtual_deal_room_invite.invite.mvi.builder.c.a());
            this.f326984n = new f(interfaceC40325a);
            this.f326985o = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f326984n);
            this.f326986p = new com.avito.android.virtual_deal_room_invite.invite.d(new i(this.f326981k, this.f326982l, k.a(), this.f326983m, this.f326985o));
        }

        @Override // com.avito.android.virtual_deal_room_invite.invite.di.b
        public final void a(InviteFragment inviteFragment) {
            inviteFragment.f326932n0 = this.f326986p;
            inviteFragment.f326934p0 = this.f326985o.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f326971a.u4();
            t.c(aVarU4);
            inviteFragment.f326935q0 = aVarU4;
        }
    }

    public static b.InterfaceC10128b a() {
        return new b();
    }
}
