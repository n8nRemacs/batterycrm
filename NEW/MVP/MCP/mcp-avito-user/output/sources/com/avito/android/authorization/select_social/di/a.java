package com.avito.android.authorization.select_social.di;

import Sm0.C15204c;
import android.content.res.Resources;
import com.avito.android.account.InterfaceC27663a;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.authorization.select_social.SelectSocialActivity;
import com.avito.android.authorization.select_social.adapter.SelectSocialField;
import com.avito.android.authorization.select_social.adapter.h;
import com.avito.android.authorization.select_social.adapter.k;
import com.avito.android.authorization.select_social.adapter.m;
import com.avito.android.authorization.select_social.adapter.n;
import com.avito.android.authorization.select_social.adapter.p;
import com.avito.android.authorization.select_social.di.b;
import com.avito.android.authorization.select_social.di.f;
import com.avito.android.social.M;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.ArrayList;
import java.util.List;

/* compiled from: DaggerSelectSocialComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class a {

    /* compiled from: DaggerSelectSocialComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.authorization.select_social.di.b.a
        public final com.avito.android.authorization.select_social.di.b a(com.avito.android.authorization.select_social.di.c cVar, InterfaceC39417a interfaceC39417a, Resources resources, Kundle kundle, ArrayList arrayList, String str) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, resources, kundle, arrayList, str, null);
        }
    }

    /* compiled from: DaggerSelectSocialComponent.java */
    public static final class c implements com.avito.android.authorization.select_social.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.authorization.select_social.di.c f94501a;

        /* renamed from: b, reason: collision with root package name */
        public final l f94502b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC27663a> f94503c;

        /* renamed from: d, reason: collision with root package name */
        public final C15204c f94504d;

        /* renamed from: e, reason: collision with root package name */
        public final u<M> f94505e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.authorization.select_social.c> f94506f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.jakewharton.rxrelay3.c<SelectSocialField>> f94507g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.authorization.select_social.adapter.d> f94508h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.authorization.select_social.adapter.a> f94509i;

        /* renamed from: j, reason: collision with root package name */
        public final u<n> f94510j;

        /* renamed from: k, reason: collision with root package name */
        public final u<k> f94511k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f94512l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f94513m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC35745a5> f94514n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC35741a1> f94515o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f94516p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC28373a> f94517q;

        /* renamed from: r, reason: collision with root package name */
        public final l f94518r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.android.authorization.select_social.g> f94519s;

        /* compiled from: DaggerSelectSocialComponent.java */
        /* renamed from: com.avito.android.authorization.select_social.di.a$c$a, reason: collision with other inner class name */
        public static final class C2804a implements u<InterfaceC27663a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_social.di.c f94520a;

            public C2804a(com.avito.android.authorization.select_social.di.c cVar) {
                this.f94520a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC27663a interfaceC27663aW0 = this.f94520a.w0();
                t.c(interfaceC27663aW0);
                return interfaceC27663aW0;
            }
        }

        /* compiled from: DaggerSelectSocialComponent.java */
        public static final class b implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_social.di.c f94521a;

            public b(com.avito.android.authorization.select_social.di.c cVar) {
                this.f94521a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f94521a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSelectSocialComponent.java */
        /* renamed from: com.avito.android.authorization.select_social.di.a$c$c, reason: collision with other inner class name */
        public static final class C2805c implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f94522a;

            public C2805c(cv.b bVar) {
                this.f94522a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f94522a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSelectSocialComponent.java */
        public static final class d implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_social.di.c f94523a;

            public d(com.avito.android.authorization.select_social.di.c cVar) {
                this.f94523a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f94523a.n();
                t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerSelectSocialComponent.java */
        public static final class e implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_social.di.c f94524a;

            public e(com.avito.android.authorization.select_social.di.c cVar) {
                this.f94524a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f94524a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerSelectSocialComponent.java */
        public static final class f implements u<M> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.authorization.select_social.di.c f94525a;

            public f(com.avito.android.authorization.select_social.di.c cVar) {
                this.f94525a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                M mR2 = this.f94525a.R2();
                t.c(mR2);
                return mR2;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.authorization.select_social.di.c cVar, cv.b bVar, Resources resources, Kundle kundle, List list, String str, C2803a c2803a) {
            this.f94501a = cVar;
            this.f94502b = l.a(list);
            this.f94503c = new C2804a(cVar);
            C15204c c15204c = new C15204c(l.a(resources));
            this.f94504d = c15204c;
            this.f94506f = dagger.internal.g.d(new com.avito.android.authorization.select_social.e(this.f94502b, this.f94503c, c15204c, new f(cVar)));
            u<com.jakewharton.rxrelay3.c<SelectSocialField>> uVarD = dagger.internal.g.d(f.a.f94528a);
            this.f94507g = uVarD;
            u<com.avito.android.authorization.select_social.adapter.d> uVarD2 = dagger.internal.g.d(new h(uVarD));
            this.f94508h = uVarD2;
            this.f94509i = dagger.internal.g.d(new com.avito.android.authorization.select_social.adapter.c(uVarD2));
            u<n> uVarD3 = dagger.internal.g.d(p.a());
            this.f94510j = uVarD3;
            u<k> uVarD4 = dagger.internal.g.d(new m(uVarD3));
            this.f94511k = uVarD4;
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new g(uVarD4, this.f94509i));
            this.f94512l = uVarD5;
            this.f94513m = dagger.internal.g.d(new com.avito.android.authorization.select_social.di.e(uVarD5));
            this.f94514n = new e(cVar);
            this.f94515o = new d(cVar);
            this.f94516p = new C2805c(bVar);
            this.f94517q = new b(cVar);
            this.f94518r = l.a(str);
            this.f94519s = dagger.internal.g.d(new com.avito.android.authorization.select_social.p(this.f94506f, this.f94513m, this.f94514n, this.f94515o, this.f94507g, this.f94504d, this.f94516p, this.f94517q, this.f94518r, l.b(kundle)));
        }

        @Override // com.avito.android.authorization.select_social.di.b
        public final void a(SelectSocialActivity selectSocialActivity) {
            com.avito.android.authorization.select_social.di.c cVar = this.f94501a;
            selectSocialActivity.f94466m = cVar.t0();
            selectSocialActivity.f94467n = this.f94519s.get();
            selectSocialActivity.f94468o = this.f94513m.get();
            selectSocialActivity.f94469p = this.f94512l.get();
            M mR2 = cVar.R2();
            t.c(mR2);
            selectSocialActivity.f94470q = mR2;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            selectSocialActivity.f94471r = interfaceC28373aA;
        }
    }

    public static b.a a() {
        return new b();
    }
}
