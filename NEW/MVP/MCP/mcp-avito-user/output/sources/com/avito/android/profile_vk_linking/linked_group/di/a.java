package com.avito.android.profile_vk_linking.linked_group.di;

import Lc0.InterfaceC14378a;
import Mc0.InterfaceC14468a;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.x;
import com.avito.android.profile_vk_linking.linked_group.VkLinkedGroupFragment;
import com.avito.android.profile_vk_linking.linked_group.di.b;
import com.avito.android.profile_vk_linking.linked_group.g;
import com.avito.android.profile_vk_linking.linked_group.mvi.i;
import com.avito.android.profile_vk_linking.linked_group.mvi.k;
import com.avito.android.profile_vk_linking.linked_group.mvi.m;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerVkLinkedGroupComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerVkLinkedGroupComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.profile_vk_linking.linked_group.di.b.a
        public final com.avito.android.profile_vk_linking.linked_group.di.b a(InterfaceC14378a interfaceC14378a, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(interfaceC14378a, interfaceC39417a, null);
        }
    }

    /* compiled from: DaggerVkLinkedGroupComponent.java */
    public static final class c implements com.avito.android.profile_vk_linking.linked_group.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC14468a> f231272a;

        /* renamed from: b, reason: collision with root package name */
        public final u<x> f231273b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f231274c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.profile_vk_linking.linked_group.c> f231275d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f231276e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28373a> f231277f;

        /* renamed from: g, reason: collision with root package name */
        public final u<E> f231278g;

        /* renamed from: h, reason: collision with root package name */
        public final k f231279h;

        /* renamed from: i, reason: collision with root package name */
        public final g f231280i;

        /* compiled from: DaggerVkLinkedGroupComponent.java */
        /* renamed from: com.avito.android.profile_vk_linking.linked_group.di.a$c$a, reason: collision with other inner class name */
        public static final class C7042a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231281a;

            public C7042a(InterfaceC14378a interfaceC14378a) {
                this.f231281a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f231281a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerVkLinkedGroupComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231282a;

            public b(InterfaceC14378a interfaceC14378a) {
                this.f231282a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f231282a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerVkLinkedGroupComponent.java */
        /* renamed from: com.avito.android.profile_vk_linking.linked_group.di.a$c$c, reason: collision with other inner class name */
        public static final class C7043c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f231283a;

            public C7043c(cv.b bVar) {
                this.f231283a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f231283a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerVkLinkedGroupComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231284a;

            public d(InterfaceC14378a interfaceC14378a) {
                this.f231284a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f231284a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerVkLinkedGroupComponent.java */
        public static final class e implements u<x> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231285a;

            public e(InterfaceC14378a interfaceC14378a) {
                this.f231285a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                x xVarEf = this.f231285a.Ef();
                t.c(xVarEf);
                return xVarEf;
            }
        }

        /* compiled from: DaggerVkLinkedGroupComponent.java */
        public static final class f implements u<InterfaceC14468a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231286a;

            public f(InterfaceC14378a interfaceC14378a) {
                this.f231286a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14468a interfaceC14468aPg = this.f231286a.pg();
                t.c(interfaceC14468aPg);
                return interfaceC14468aPg;
            }
        }

        public c(InterfaceC14378a interfaceC14378a, cv.b bVar, C7041a c7041a) {
            f fVar = new f(interfaceC14378a);
            this.f231273b = new e(interfaceC14378a);
            this.f231274c = new d(interfaceC14378a);
            u<com.avito.android.profile_vk_linking.linked_group.c> uVarD = dagger.internal.g.d(new com.avito.android.profile_vk_linking.linked_group.e(fVar, m.a(), this.f231273b, this.f231274c));
            this.f231275d = uVarD;
            com.avito.android.profile_vk_linking.linked_group.mvi.d dVar = new com.avito.android.profile_vk_linking.linked_group.mvi.d(uVarD);
            com.avito.android.profile_vk_linking.linked_group.mvi.b bVar2 = new com.avito.android.profile_vk_linking.linked_group.mvi.b(uVarD, new C7043c(bVar));
            this.f231279h = new k(new b(interfaceC14378a), new C7042a(interfaceC14378a));
            this.f231280i = new g(new com.avito.android.profile_vk_linking.linked_group.mvi.g(dVar, bVar2, i.a(), this.f231279h));
        }

        @Override // com.avito.android.profile_vk_linking.linked_group.di.b
        public final void a(VkLinkedGroupFragment vkLinkedGroupFragment) {
            vkLinkedGroupFragment.f231243n0 = this.f231280i;
        }
    }

    public static b.a a() {
        return new b();
    }
}
