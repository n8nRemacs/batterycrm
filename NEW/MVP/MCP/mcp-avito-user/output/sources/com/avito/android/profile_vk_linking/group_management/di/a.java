package com.avito.android.profile_vk_linking.group_management.di;

import Lc0.InterfaceC14378a;
import Mc0.InterfaceC14468a;
import Y41.l;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.profile_vk_linking.group_management.VkLinkingGroupManagementFragment;
import com.avito.android.profile_vk_linking.group_management.di.b;
import com.avito.android.profile_vk_linking.group_management.g;
import com.avito.android.profile_vk_linking.group_management.mvi.j;
import com.avito.android.profile_vk_linking.group_management.mvi.m;
import com.avito.android.profile_vk_linking.group_management.mvi.o;
import com.avito.android.profile_vk_linking.group_management.mvi.q;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.A;
import dagger.internal.B;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;

/* compiled from: DaggerVkLinkingGroupManagementComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerVkLinkingGroupManagementComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.profile_vk_linking.group_management.di.b.a
        public final com.avito.android.profile_vk_linking.group_management.di.b a(l lVar, InterfaceC14378a interfaceC14378a, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(interfaceC14378a, interfaceC39417a, lVar, null);
        }
    }

    /* compiled from: DaggerVkLinkingGroupManagementComponent.java */
    public static final class c implements com.avito.android.profile_vk_linking.group_management.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f231160a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC14468a> f231161b;

        /* renamed from: c, reason: collision with root package name */
        public final u<x> f231162c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f231163d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.profile_vk_linking.group_management.b> f231164e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f231165f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28373a> f231166g;

        /* renamed from: h, reason: collision with root package name */
        public final u<E> f231167h;

        /* renamed from: i, reason: collision with root package name */
        public final q f231168i;

        /* renamed from: j, reason: collision with root package name */
        public final g f231169j;

        /* renamed from: k, reason: collision with root package name */
        public final u<Set<TV0.b<?, ?>>> f231170k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.profile_vk_linking.group_management.adapter.group.d> f231171l;

        /* renamed from: m, reason: collision with root package name */
        public final u<TV0.b<?, ?>> f231172m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f231173n;

        /* renamed from: o, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f231174o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.d> f231175p;

        /* compiled from: DaggerVkLinkingGroupManagementComponent.java */
        /* renamed from: com.avito.android.profile_vk_linking.group_management.di.a$c$a, reason: collision with other inner class name */
        public static final class C7036a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231176a;

            public C7036a(InterfaceC14378a interfaceC14378a) {
                this.f231176a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f231176a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerVkLinkingGroupManagementComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231177a;

            public b(InterfaceC14378a interfaceC14378a) {
                this.f231177a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f231177a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerVkLinkingGroupManagementComponent.java */
        /* renamed from: com.avito.android.profile_vk_linking.group_management.di.a$c$c, reason: collision with other inner class name */
        public static final class C7037c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f231178a;

            public C7037c(cv.b bVar) {
                this.f231178a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f231178a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerVkLinkingGroupManagementComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231179a;

            public d(InterfaceC14378a interfaceC14378a) {
                this.f231179a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f231179a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerVkLinkingGroupManagementComponent.java */
        public static final class e implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231180a;

            public e(InterfaceC14378a interfaceC14378a) {
                this.f231180a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarEf = this.f231180a.Ef();
                t.c(xVarEf);
                return xVarEf;
            }
        }

        /* compiled from: DaggerVkLinkingGroupManagementComponent.java */
        public static final class f implements u<InterfaceC14468a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231181a;

            public f(InterfaceC14378a interfaceC14378a) {
                this.f231181a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14468a interfaceC14468aPg = this.f231181a.pg();
                t.c(interfaceC14468aPg);
                return interfaceC14468aPg;
            }
        }

        public c() {
            throw null;
        }

        public c(InterfaceC14378a interfaceC14378a, cv.b bVar, l lVar, C7035a c7035a) {
            this.f231160a = bVar;
            f fVar = new f(interfaceC14378a);
            this.f231162c = new e(interfaceC14378a);
            this.f231163d = new d(interfaceC14378a);
            u<com.avito.android.profile_vk_linking.group_management.b> uVarD = dagger.internal.g.d(new com.avito.android.profile_vk_linking.group_management.d(fVar, com.avito.android.profile_vk_linking.group_management.mvi.d.a(), com.avito.android.profile_vk_linking.group_management.mvi.b.a(), this.f231162c, this.f231163d));
            this.f231164e = uVarD;
            j jVar = new j(uVarD, new C7037c(bVar));
            com.avito.android.profile_vk_linking.group_management.mvi.f fVar2 = new com.avito.android.profile_vk_linking.group_management.mvi.f(uVarD);
            this.f231168i = new q(new b(interfaceC14378a), new C7036a(interfaceC14378a));
            this.f231169j = new g(new m(jVar, fVar2, o.a(), this.f231168i));
            this.f231170k = B.a(com.avito.android.konveyor_adapter_module.d.a());
            u<com.avito.android.profile_vk_linking.group_management.adapter.group.d> uVarD2 = dagger.internal.g.d(new com.avito.android.profile_vk_linking.group_management.adapter.group.g(dagger.internal.l.a(lVar)));
            this.f231171l = uVarD2;
            this.f231172m = dagger.internal.g.d(new com.avito.android.profile_vk_linking.group_management.adapter.group.c(uVarD2));
            A.b bVarA = A.a(1, 1);
            bVarA.f393938b.add(this.f231170k);
            bVarA.f393937a.add(this.f231172m);
            u<com.avito.konveyor.a> uVarK = com.avito.android.advert.item.delivery_suggests.l.k(bVarA.b());
            this.f231173n = uVarK;
            u<com.avito.konveyor.adapter.a> uVarH = com.avito.android.advert.item.delivery_suggests.l.h(uVarK);
            this.f231174o = uVarH;
            this.f231175p = dagger.internal.g.d(new com.avito.android.profile_vk_linking.group_management.di.d(uVarH, this.f231173n));
        }

        @Override // com.avito.android.profile_vk_linking.group_management.di.b
        public final void a(VkLinkingGroupManagementFragment vkLinkingGroupManagementFragment) {
            vkLinkingGroupManagementFragment.f231084n0 = this.f231169j;
            vkLinkingGroupManagementFragment.f231085o0 = this.f231175p.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f231160a.u4();
            t.c(aVarU4);
            vkLinkingGroupManagementFragment.f231087q0 = aVarU4;
        }
    }

    public static b.a a() {
        return new b();
    }
}
