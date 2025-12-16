package com.avito.android.profile_vk_linking.start.di;

import Lc0.InterfaceC14378a;
import Mc0.InterfaceC14468a;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.profile_vk_linking.start.VkLinkingStartFragment;
import com.avito.android.profile_vk_linking.start.di.b;
import com.avito.android.profile_vk_linking.start.mvi.j;
import com.avito.android.profile_vk_linking.start.mvi.m;
import com.avito.android.profile_vk_linking.start.mvi.o;
import com.avito.android.profile_vk_linking.start.mvi.q;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerVkLinkingStartComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerVkLinkingStartComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.profile_vk_linking.start.di.b.a
        public final com.avito.android.profile_vk_linking.start.di.b a(InterfaceC14378a interfaceC14378a, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(interfaceC14378a, interfaceC39417a, null);
        }
    }

    /* compiled from: DaggerVkLinkingStartComponent.java */
    public static final class c implements com.avito.android.profile_vk_linking.start.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC14468a> f231425a;

        /* renamed from: b, reason: collision with root package name */
        public final u<x> f231426b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f231427c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f231428d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.profile_vk_linking.start.b> f231429e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f231430f;

        /* renamed from: g, reason: collision with root package name */
        public final u<E> f231431g;

        /* renamed from: h, reason: collision with root package name */
        public final q f231432h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.profile_vk_linking.start.f f231433i;

        /* compiled from: DaggerVkLinkingStartComponent.java */
        /* renamed from: com.avito.android.profile_vk_linking.start.di.a$c$a, reason: collision with other inner class name */
        public static final class C7048a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231434a;

            public C7048a(InterfaceC14378a interfaceC14378a) {
                this.f231434a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f231434a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerVkLinkingStartComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231435a;

            public b(InterfaceC14378a interfaceC14378a) {
                this.f231435a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f231435a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerVkLinkingStartComponent.java */
        /* renamed from: com.avito.android.profile_vk_linking.start.di.a$c$c, reason: collision with other inner class name */
        public static final class C7049c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f231436a;

            public C7049c(cv.b bVar) {
                this.f231436a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f231436a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerVkLinkingStartComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231437a;

            public d(InterfaceC14378a interfaceC14378a) {
                this.f231437a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f231437a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerVkLinkingStartComponent.java */
        public static final class e implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231438a;

            public e(InterfaceC14378a interfaceC14378a) {
                this.f231438a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarEf = this.f231438a.Ef();
                t.c(xVarEf);
                return xVarEf;
            }
        }

        /* compiled from: DaggerVkLinkingStartComponent.java */
        public static final class f implements u<InterfaceC14468a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231439a;

            public f(InterfaceC14378a interfaceC14378a) {
                this.f231439a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14468a interfaceC14468aPg = this.f231439a.pg();
                t.c(interfaceC14468aPg);
                return interfaceC14468aPg;
            }
        }

        public c(InterfaceC14378a interfaceC14378a, cv.b bVar, C7047a c7047a) {
            f fVar = new f(interfaceC14378a);
            this.f231426b = new e(interfaceC14378a);
            this.f231427c = new C7049c(bVar);
            this.f231428d = new d(interfaceC14378a);
            u<com.avito.android.profile_vk_linking.start.b> uVarD = g.d(new com.avito.android.profile_vk_linking.start.d(fVar, com.avito.android.profile_vk_linking.start.mvi.b.a(), this.f231426b, this.f231427c, this.f231428d));
            this.f231429e = uVarD;
            b bVar2 = new b(interfaceC14378a);
            C7048a c7048a = new C7048a(interfaceC14378a);
            u<com.avito.android.deeplink_handler.handler.composite.a> uVar = this.f231427c;
            j jVar = new j(uVarD, uVar, bVar2, c7048a);
            com.avito.android.profile_vk_linking.start.mvi.e eVar = new com.avito.android.profile_vk_linking.start.mvi.e(uVarD, uVar);
            this.f231432h = new q(bVar2, c7048a);
            this.f231433i = new com.avito.android.profile_vk_linking.start.f(new m(jVar, eVar, o.a(), this.f231432h));
        }

        @Override // com.avito.android.profile_vk_linking.start.di.b
        public final void a(VkLinkingStartFragment vkLinkingStartFragment) {
            vkLinkingStartFragment.f231393n0 = this.f231433i;
        }
    }

    public static b.a a() {
        return new b();
    }
}
