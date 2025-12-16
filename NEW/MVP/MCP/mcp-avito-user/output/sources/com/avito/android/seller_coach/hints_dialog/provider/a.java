package com.avito.android.seller_coach.hints_dialog.provider;

import Hq0.C14023e;
import Hq0.InterfaceC14019a;
import androidx.recyclerview.widget.C;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.seller_coach.hints_dialog.provider.b;
import com.avito.android.seller_coach.hints_dialog.view.h;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;
import sI0.InterfaceC48055a;

/* compiled from: DaggerHintDialogComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerHintDialogComponent.java */
    public static final class b implements b.a {
        public b() {
        }
    }

    /* compiled from: DaggerHintDialogComponent.java */
    public static final class c implements com.avito.android.seller_coach.hints_dialog.provider.b {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f267511a;

        /* renamed from: b, reason: collision with root package name */
        public final u<h.b> f267512b = dagger.internal.g.d(new com.avito.android.seller_coach.hints_dialog.view.j(dagger.internal.l.a(this)));

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.f f267513c;

        /* renamed from: d, reason: collision with root package name */
        public final u<C> f267514d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.seller_coach.hints_dialog.item.hint.d> f267515e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.seller_coach.hints_dialog.item.hint.c f267516f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.seller_coach.hints_dialog.item.header.d> f267517g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.seller_coach.hints_dialog.item.header.c f267518h;

        /* renamed from: i, reason: collision with root package name */
        public final u<com.avito.android.seller_coach.hints_dialog.item.empty_hints.d> f267519i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f267520j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.h> f267521k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f267522l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f267523m;

        /* renamed from: n, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f267524n;

        /* renamed from: o, reason: collision with root package name */
        public final u<InterfaceC48055a> f267525o;

        /* renamed from: p, reason: collision with root package name */
        public final u<InterfaceC35745a5> f267526p;

        /* renamed from: q, reason: collision with root package name */
        public final u<InterfaceC14019a> f267527q;

        /* renamed from: r, reason: collision with root package name */
        public final u<InterfaceC28373a> f267528r;

        /* renamed from: s, reason: collision with root package name */
        public final com.avito.android.seller_coach.hints_dialog.vm.e f267529s;

        /* compiled from: DaggerHintDialogComponent.java */
        /* renamed from: com.avito.android.seller_coach.hints_dialog.provider.a$c$a, reason: collision with other inner class name */
        public static final class C7991a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final k f267530a;

            public C7991a(k kVar) {
                this.f267530a = kVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f267530a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerHintDialogComponent.java */
        public static final class b implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final k f267531a;

            public b(k kVar) {
                this.f267531a = kVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f267531a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerHintDialogComponent.java */
        /* renamed from: com.avito.android.seller_coach.hints_dialog.provider.a$c$c, reason: collision with other inner class name */
        public static final class C7992c implements u<InterfaceC48055a> {

            /* renamed from: a, reason: collision with root package name */
            public final k f267532a;

            public C7992c(k kVar) {
                this.f267532a = kVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48055a interfaceC48055aA1 = this.f267532a.A1();
                t.c(interfaceC48055aA1);
                return interfaceC48055aA1;
            }
        }

        public c(k kVar, cv.b bVar, C7990a c7990a) {
            this.f267511a = bVar;
            dagger.internal.f fVar = new dagger.internal.f();
            this.f267513c = fVar;
            this.f267514d = dagger.internal.g.d(new i(fVar));
            u<com.avito.android.seller_coach.hints_dialog.item.hint.d> uVarD = dagger.internal.g.d(com.avito.android.seller_coach.hints_dialog.item.hint.f.a());
            this.f267515e = uVarD;
            this.f267516f = new com.avito.android.seller_coach.hints_dialog.item.hint.c(uVarD);
            u<com.avito.android.seller_coach.hints_dialog.item.header.d> uVarD2 = dagger.internal.g.d(com.avito.android.seller_coach.hints_dialog.item.header.f.a());
            this.f267517g = uVarD2;
            this.f267518h = new com.avito.android.seller_coach.hints_dialog.item.header.c(uVarD2);
            u<com.avito.android.seller_coach.hints_dialog.item.empty_hints.d> uVarD3 = dagger.internal.g.d(com.avito.android.seller_coach.hints_dialog.item.empty_hints.f.a());
            this.f267519i = uVarD3;
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new g(this.f267516f, this.f267518h, new com.avito.android.seller_coach.hints_dialog.item.empty_hints.c(uVarD3)));
            this.f267520j = uVarD4;
            this.f267521k = dagger.internal.g.d(new d(uVarD4));
            u<com.avito.android.recycler.data_aware.e> uVarD5 = dagger.internal.g.d(new f(com.avito.android.seller_coach.hints_dialog.item.b.a(), com.avito.android.seller_coach.hints_dialog.item.d.a()));
            this.f267522l = uVarD5;
            u<com.avito.konveyor.adapter.a> uVarD6 = dagger.internal.g.d(new e(uVarD5, this.f267514d, this.f267521k));
            this.f267523m = uVarD6;
            dagger.internal.f.a(this.f267513c, dagger.internal.g.d(new j(uVarD6, this.f267520j)));
            this.f267524n = dagger.internal.g.d(new h(this.f267515e, this.f267517g, this.f267519i));
            C7992c c7992c = new C7992c(kVar);
            b bVar2 = new b(kVar);
            this.f267526p = bVar2;
            u<InterfaceC14019a> uVarD7 = dagger.internal.g.d(new C14023e(c7992c, bVar2));
            this.f267527q = uVarD7;
            this.f267529s = new com.avito.android.seller_coach.hints_dialog.vm.e(uVarD7, this.f267526p, new C7991a(kVar));
        }

        @Override // com.avito.android.seller_coach.hints_dialog.provider.l
        public final h.b a() {
            return this.f267512b.get();
        }

        @Override // com.avito.android.seller_coach.hints_dialog.provider.b
        public final void b(com.avito.android.seller_coach.hints_dialog.view.c cVar) {
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f267511a.u4();
            t.c(aVarU4);
            cVar.f267558I = aVarU4;
            cVar.f267559J = (com.avito.konveyor.adapter.j) this.f267513c.get();
            cVar.f267560K = this.f267523m.get();
            cVar.f267561L = this.f267524n.get();
            cVar.f267562M = this.f267529s;
        }
    }
}
