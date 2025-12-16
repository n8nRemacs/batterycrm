package com.avito.android.profile_vk_linking.request_token.di;

import Lc0.InterfaceC14378a;
import Y41.l;
import Zc0.InterfaceC19538a;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.profile_vk_linking.request_token.VkRequestTokenFragment;
import com.avito.android.profile_vk_linking.request_token.di.b;
import com.avito.android.profile_vk_linking.request_token.g;
import com.avito.android.profile_vk_linking.request_token.mvi.d;
import com.avito.android.profile_vk_linking.request_token.mvi.i;
import com.avito.android.profile_vk_linking.request_token.mvi.k;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.G0;

/* compiled from: DaggerVkTokenRequestComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerVkTokenRequestComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.profile_vk_linking.request_token.di.b.a
        public final com.avito.android.profile_vk_linking.request_token.di.b a(String str, l lVar, InterfaceC14378a interfaceC14378a, InterfaceC39417a interfaceC39417a) {
            str.getClass();
            interfaceC39417a.getClass();
            return new c(interfaceC14378a, interfaceC39417a, str, lVar, null);
        }
    }

    /* compiled from: DaggerVkTokenRequestComponent.java */
    public static final class c implements com.avito.android.profile_vk_linking.request_token.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l<? super InterfaceC19538a, G0> f231349a;

        /* renamed from: b, reason: collision with root package name */
        public final String f231350b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f231351c;

        /* renamed from: d, reason: collision with root package name */
        public final u<E> f231352d;

        /* renamed from: e, reason: collision with root package name */
        public final k f231353e;

        /* renamed from: f, reason: collision with root package name */
        public final g f231354f;

        /* compiled from: DaggerVkTokenRequestComponent.java */
        /* renamed from: com.avito.android.profile_vk_linking.request_token.di.a$c$a, reason: collision with other inner class name */
        public static final class C7045a implements u<E> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231355a;

            public C7045a(InterfaceC14378a interfaceC14378a) {
                this.f231355a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                E eI2 = this.f231355a.i();
                t.c(eI2);
                return eI2;
            }
        }

        /* compiled from: DaggerVkTokenRequestComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC14378a f231356a;

            public b(InterfaceC14378a interfaceC14378a) {
                this.f231356a = interfaceC14378a;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f231356a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        public c() {
            throw null;
        }

        public c(InterfaceC14378a interfaceC14378a, cv.b bVar, String str, l lVar, C7044a c7044a) {
            this.f231349a = lVar;
            this.f231350b = str;
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            b bVar2 = new b(interfaceC14378a);
            C7045a c7045a = new C7045a(interfaceC14378a);
            d dVar = new d(lVarA, bVar2, c7045a);
            com.avito.android.profile_vk_linking.request_token.mvi.b bVar3 = new com.avito.android.profile_vk_linking.request_token.mvi.b(lVarA);
            this.f231353e = new k(bVar2, c7045a);
            this.f231354f = new g(new com.avito.android.profile_vk_linking.request_token.mvi.g(dVar, bVar3, i.a(), this.f231353e));
        }

        @Override // com.avito.android.profile_vk_linking.request_token.di.b
        public final void a(VkRequestTokenFragment vkRequestTokenFragment) {
            vkRequestTokenFragment.f231337n0 = new com.avito.android.profile_vk_linking.request_token.l(this.f231350b, this.f231349a);
            vkRequestTokenFragment.f231338o0 = this.f231354f;
        }
    }

    public static b.a a() {
        return new b();
    }
}
