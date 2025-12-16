package com.avito.android.publish.pretend.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.publish.C0;
import com.avito.android.publish.pretend.PretendFragment;
import com.avito.android.publish.pretend.di.b;
import com.avito.android.publish.pretend.i;
import com.avito.android.remote.model.category_parameters.CategoryParametersConverter;
import com.avito.android.remote.u1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.t;
import dagger.internal.u;
import yc.C50213a;

/* compiled from: DaggerPretendComponent.java */
@e
/* loaded from: classes16.dex */
public final class a {

    /* compiled from: DaggerPretendComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.publish.pretend.di.c f238354a;

        public b() {
        }

        @Override // com.avito.android.publish.pretend.di.b.a
        public final b.a a(com.avito.android.publish.pretend.di.c cVar) {
            this.f238354a = cVar;
            return this;
        }

        @Override // com.avito.android.publish.pretend.di.b.a
        public final com.avito.android.publish.pretend.di.b build() {
            t.a(com.avito.android.publish.pretend.di.c.class, this.f238354a);
            return new c(this.f238354a, null);
        }
    }

    /* compiled from: DaggerPretendComponent.java */
    public static final class c implements com.avito.android.publish.pretend.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.pretend.di.c f238355a;

        /* renamed from: b, reason: collision with root package name */
        public final u<u1> f238356b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35745a5> f238357c;

        /* renamed from: d, reason: collision with root package name */
        public final u<CategoryParametersConverter> f238358d;

        /* renamed from: e, reason: collision with root package name */
        public final u<C50213a> f238359e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.publish.pretend.e> f238360f;

        /* compiled from: DaggerPretendComponent.java */
        /* renamed from: com.avito.android.publish.pretend.di.a$c$a, reason: collision with other inner class name */
        public static final class C7162a implements u<CategoryParametersConverter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.pretend.di.c f238361a;

            public C7162a(com.avito.android.publish.pretend.di.c cVar) {
                this.f238361a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                CategoryParametersConverter categoryParametersConverterI = this.f238361a.I();
                t.c(categoryParametersConverterI);
                return categoryParametersConverterI;
            }
        }

        /* compiled from: DaggerPretendComponent.java */
        public static final class b implements u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.pretend.di.c f238362a;

            public b(com.avito.android.publish.pretend.di.c cVar) {
                this.f238362a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f238362a.D1();
                t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerPretendComponent.java */
        /* renamed from: com.avito.android.publish.pretend.di.a$c$c, reason: collision with other inner class name */
        public static final class C7163c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.pretend.di.c f238363a;

            public C7163c(com.avito.android.publish.pretend.di.c cVar) {
                this.f238363a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f238363a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerPretendComponent.java */
        public static final class d implements u<u1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.pretend.di.c f238364a;

            public d(com.avito.android.publish.pretend.di.c cVar) {
                this.f238364a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u1 u1VarEh = this.f238364a.Eh();
                t.c(u1VarEh);
                return u1VarEh;
            }
        }

        public c(com.avito.android.publish.pretend.di.c cVar, C7161a c7161a) {
            this.f238355a = cVar;
            this.f238360f = g.d(new com.avito.android.publish.pretend.g(new d(cVar), new C7163c(cVar), new C7162a(cVar), new b(cVar)));
        }

        @Override // com.avito.android.publish.pretend.di.b
        public final void a(PretendFragment pretendFragment) {
            com.avito.android.publish.pretend.di.c cVar = this.f238355a;
            InterfaceC28373a interfaceC28373aA = cVar.a();
            t.c(interfaceC28373aA);
            pretendFragment.f238347f0 = interfaceC28373aA;
            InterfaceC35745a5 interfaceC35745a5D = cVar.d();
            t.c(interfaceC35745a5D);
            com.avito.android.publish.pretend.e eVar = this.f238360f.get();
            C0 c0U = cVar.u();
            t.c(c0U);
            pretendFragment.f238348g0 = new i(interfaceC35745a5D, eVar, c0U);
            t.c(cVar.u());
        }
    }

    public static b.a a() {
        return new b();
    }
}
