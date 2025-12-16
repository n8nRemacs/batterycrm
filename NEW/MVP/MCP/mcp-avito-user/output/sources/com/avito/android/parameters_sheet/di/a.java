package com.avito.android.parameters_sheet.di;

import Jj.C14204c;
import android.app.Application;
import android.content.res.Resources;
import androidx.recyclerview.widget.C;
import com.avito.android.Q1;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.blueprints.input.C28878c;
import com.avito.android.blueprints.input.x;
import com.avito.android.blueprints.publish.html_editor.HtmlEditorViewModel;
import com.avito.android.llm.ui.LlmDescriptionPresenter;
import com.avito.android.parameters_sheet.di.b;
import com.avito.android.parameters_sheet.di.i;
import com.avito.android.parameters_sheet.di.j;
import com.avito.android.parameters_sheet.di.k;
import com.avito.android.parameters_sheet.di.r;
import com.avito.android.util.C35823j4;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35807h4;
import java.util.List;
import java.util.Set;

/* compiled from: DaggerParametersListDialogComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerParametersListDialogComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.parameters_sheet.di.b.a
        public final com.avito.android.parameters_sheet.di.b a(com.avito.android.parameters_sheet.di.c cVar, Resources resources, List<? extends com.avito.conveyor_item.a> list, com.avito.android.category_parameters.h hVar) {
            list.getClass();
            hVar.getClass();
            return new c(cVar, resources, list, hVar, null);
        }
    }

    /* compiled from: DaggerParametersListDialogComponent.java */
    public static final class c implements com.avito.android.parameters_sheet.di.b {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.chips_multiselect.c> f210701A;

        /* renamed from: B, reason: collision with root package name */
        public final com.avito.android.blueprints.chips_multiselect.b f210702B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.multiselect.inline.c> f210703C;

        /* renamed from: D, reason: collision with root package name */
        public final com.avito.android.blueprint.multiselect.inline.b f210704D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.publish.multiselect.inline.c> f210705E;

        /* renamed from: F, reason: collision with root package name */
        public final com.avito.android.blueprints.publish.multiselect.inline.b f210706F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.checkbox.c> f210707G;

        /* renamed from: H, reason: collision with root package name */
        public final com.avito.android.blueprint.checkbox.b f210708H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.publish.select.inline.c> f210709I;

        /* renamed from: J, reason: collision with root package name */
        public final com.avito.android.blueprints.publish.select.inline.b f210710J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.withSuggestedOptions.d> f210711K;

        /* renamed from: L, reason: collision with root package name */
        public final com.avito.android.blueprints.withSuggestedOptions.c f210712L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.input.c> f210713M;

        /* renamed from: N, reason: collision with root package name */
        public final com.avito.android.blueprint.input.b f210714N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.chips.single.d> f210715O;

        /* renamed from: P, reason: collision with root package name */
        public final com.avito.android.blueprint.chips.single.c f210716P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.chips.multiple.c> f210717Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f210718R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f210719S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.e> f210720T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.data_aware.c> f210721U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.l f210722V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.u<Set<TV0.d<?, ?>>> f210723W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f210724X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.parameters_sheet.e> f210725Y;

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.f f210726a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<C> f210727b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<Application> f210728c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35807h4> f210729d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<Q1> f210730e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.chips.d> f210731f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.text.a> f210732g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<u3.l<SimpleTestGroupWithNone>> f210733h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.blueprints.chips.c f210734i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.radiogroup.c> f210735j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<u3.l<SimpleTestGroupWithNone>> f210736k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.blueprints.radiogroup.b f210737l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprint.radiogroup.c> f210738m;

        /* renamed from: n, reason: collision with root package name */
        public final com.avito.android.blueprint.radiogroup.b f210739n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f210740o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<hJ.h> f210741p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<HtmlEditorViewModel> f210742q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f210743r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<LlmDescriptionPresenter> f210744s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.input.d> f210745t;

        /* renamed from: u, reason: collision with root package name */
        public final C28878c f210746u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.publish.infomation.item.d> f210747v;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.blueprints.publish.infomation.item.b f210748w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<AK0.l> f210749x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.publish.header.e> f210750y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.blueprints.publish.header.b> f210751z;

        /* compiled from: DaggerParametersListDialogComponent.java */
        /* renamed from: com.avito.android.parameters_sheet.di.a$c$a, reason: collision with other inner class name */
        public static final class C6296a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.parameters_sheet.di.c f210752a;

            public C6296a(com.avito.android.parameters_sheet.di.c cVar) {
                this.f210752a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f210752a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerParametersListDialogComponent.java */
        public static final class b implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.parameters_sheet.di.c f210753a;

            public b(com.avito.android.parameters_sheet.di.c cVar) {
                this.f210753a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f210753a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerParametersListDialogComponent.java */
        /* renamed from: com.avito.android.parameters_sheet.di.a$c$c, reason: collision with other inner class name */
        public static final class C6297c implements dagger.internal.u<com.avito.android.util.text.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.parameters_sheet.di.c f210754a;

            public C6297c(com.avito.android.parameters_sheet.di.c cVar) {
                this.f210754a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.text.a aVarE = this.f210754a.e();
                dagger.internal.t.c(aVarE);
                return aVarE;
            }
        }

        /* compiled from: DaggerParametersListDialogComponent.java */
        public static final class d implements dagger.internal.u<LlmDescriptionPresenter> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.parameters_sheet.di.c f210755a;

            public d(com.avito.android.parameters_sheet.di.c cVar) {
                this.f210755a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f210755a.Y0();
            }
        }

        /* compiled from: DaggerParametersListDialogComponent.java */
        public static final class e implements dagger.internal.u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.parameters_sheet.di.c f210756a;

            public e(com.avito.android.parameters_sheet.di.c cVar) {
                this.f210756a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f210756a.r();
            }
        }

        /* compiled from: DaggerParametersListDialogComponent.java */
        public static final class f implements dagger.internal.u<Q1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.parameters_sheet.di.c f210757a;

            public f(com.avito.android.parameters_sheet.di.c cVar) {
                this.f210757a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f210757a.z0();
            }
        }

        /* compiled from: DaggerParametersListDialogComponent.java */
        public static final class g implements dagger.internal.u<u3.l<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.parameters_sheet.di.c f210758a;

            public g(com.avito.android.parameters_sheet.di.c cVar) {
                this.f210758a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.l<SimpleTestGroupWithNone> lVarC1 = this.f210758a.c1();
                dagger.internal.t.c(lVarC1);
                return lVarC1;
            }
        }

        /* compiled from: DaggerParametersListDialogComponent.java */
        public static final class h implements dagger.internal.u<u3.l<SimpleTestGroupWithNone>> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.parameters_sheet.di.c f210759a;

            public h(com.avito.android.parameters_sheet.di.c cVar) {
                this.f210759a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.l<SimpleTestGroupWithNone> lVarO0 = this.f210759a.O0();
                dagger.internal.t.c(lVarO0);
                return lVarO0;
            }
        }

        /* compiled from: DaggerParametersListDialogComponent.java */
        public static final class i implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.parameters_sheet.di.c f210760a;

            public i(com.avito.android.parameters_sheet.di.c cVar) {
                this.f210760a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f210760a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.parameters_sheet.di.c cVar, Resources resources, List list, com.avito.android.category_parameters.h hVar, C6295a c6295a) {
            dagger.internal.f fVar = new dagger.internal.f();
            this.f210726a = fVar;
            this.f210727b = dagger.internal.g.d(new o(fVar));
            dagger.internal.u<InterfaceC35807h4> uVarD = dagger.internal.g.d(new C35823j4(new b(cVar)));
            this.f210729d = uVarD;
            f fVar2 = new f(cVar);
            this.f210730e = fVar2;
            dagger.internal.u<com.avito.android.blueprints.chips.d> uVarD2 = dagger.internal.g.d(new com.avito.android.parameters_sheet.di.g(uVarD, fVar2));
            this.f210731f = uVarD2;
            C6297c c6297c = new C6297c(cVar);
            this.f210732g = c6297c;
            g gVar = new g(cVar);
            this.f210733h = gVar;
            this.f210734i = new com.avito.android.blueprints.chips.c(uVarD2, c6297c, gVar);
            dagger.internal.u<com.avito.android.blueprints.radiogroup.c> uVarD3 = dagger.internal.g.d(new t(this.f210729d, this.f210730e));
            this.f210735j = uVarD3;
            h hVar2 = new h(cVar);
            this.f210736k = hVar2;
            this.f210737l = new com.avito.android.blueprints.radiogroup.b(uVarD3, this.f210732g, hVar2);
            dagger.internal.u<com.avito.android.blueprint.radiogroup.c> uVarD4 = dagger.internal.g.d(r.a.f210805a);
            this.f210738m = uVarD4;
            this.f210739n = new com.avito.android.blueprint.radiogroup.b(uVarD4, this.f210732g, this.f210736k);
            dagger.internal.l lVarA = dagger.internal.l.a(resources);
            this.f210740o = lVarA;
            this.f210741p = dagger.internal.g.d(new l(lVarA));
            dagger.internal.u<HtmlEditorViewModel> uVarD5 = dagger.internal.g.d(k.a.f210772a);
            this.f210742q = uVarD5;
            C6296a c6296a = new C6296a(cVar);
            this.f210743r = c6296a;
            d dVar = new d(cVar);
            this.f210744s = dVar;
            dagger.internal.u<com.avito.android.blueprints.input.d> uVarD6 = dagger.internal.g.d(new x(dVar, this.f210732g, this.f210741p, uVarD5, c6296a, this.f210729d, this.f210730e));
            this.f210745t = uVarD6;
            this.f210746u = new C28878c(uVarD6, this.f210733h);
            dagger.internal.u<com.avito.android.blueprints.publish.infomation.item.d> uVarD7 = dagger.internal.g.d(j.a.f210771a);
            this.f210747v = uVarD7;
            dagger.internal.u<com.avito.android.util.text.a> uVar = this.f210732g;
            this.f210748w = new com.avito.android.blueprints.publish.infomation.item.b(uVarD7, uVar);
            dagger.internal.u<com.avito.android.blueprints.publish.header.e> uVarD8 = dagger.internal.g.d(new com.avito.android.blueprints.publish.header.i(new C14204c(new e(cVar)), uVar));
            this.f210750y = uVarD8;
            this.f210751z = dagger.internal.g.d(new com.avito.android.blueprints.publish.header.d(uVarD8, this.f210730e));
            dagger.internal.u<com.avito.android.blueprints.chips_multiselect.c> uVarD9 = dagger.internal.g.d(new com.avito.android.parameters_sheet.di.f(this.f210729d, this.f210730e));
            this.f210701A = uVarD9;
            this.f210702B = new com.avito.android.blueprints.chips_multiselect.b(this.f210732g, this.f210733h, uVarD9);
            dagger.internal.u<com.avito.android.blueprint.multiselect.inline.c> uVarD10 = dagger.internal.g.d(com.avito.android.blueprint.multiselect.inline.f.a());
            this.f210703C = uVarD10;
            dagger.internal.u<com.avito.android.util.text.a> uVar2 = this.f210732g;
            this.f210704D = new com.avito.android.blueprint.multiselect.inline.b(uVar2, this.f210736k, uVarD10);
            dagger.internal.u<com.avito.android.blueprints.publish.multiselect.inline.c> uVarD11 = dagger.internal.g.d(new com.avito.android.blueprints.publish.multiselect.inline.e(uVar2, this.f210730e, this.f210729d));
            this.f210705E = uVarD11;
            this.f210706F = new com.avito.android.blueprints.publish.multiselect.inline.b(this.f210736k, uVarD11);
            dagger.internal.u<com.avito.android.blueprint.checkbox.c> uVarD12 = dagger.internal.g.d(com.avito.android.blueprint.checkbox.i.a());
            this.f210707G = uVarD12;
            dagger.internal.u<com.avito.android.util.text.a> uVar3 = this.f210732g;
            this.f210708H = new com.avito.android.blueprint.checkbox.b(uVarD12, uVar3, this.f210736k);
            dagger.internal.u<com.avito.android.blueprints.publish.select.inline.c> uVarD13 = dagger.internal.g.d(new com.avito.android.blueprints.publish.select.inline.g(uVar3, this.f210729d, this.f210730e));
            this.f210709I = uVarD13;
            this.f210710J = new com.avito.android.blueprints.publish.select.inline.b(uVarD13, this.f210736k);
            dagger.internal.u<com.avito.android.blueprints.withSuggestedOptions.d> uVarD14 = dagger.internal.g.d(new v(this.f210740o, this.f210729d, this.f210730e));
            this.f210711K = uVarD14;
            this.f210712L = new com.avito.android.blueprints.withSuggestedOptions.c(uVarD14, this.f210732g);
            dagger.internal.u<com.avito.android.blueprint.input.c> uVarD15 = dagger.internal.g.d(new com.avito.android.blueprint.input.r(this.f210741p, this.f210742q, this.f210743r, this.f210730e, this.f210744s));
            this.f210713M = uVarD15;
            this.f210714N = new com.avito.android.blueprint.input.b(uVarD15, this.f210732g, this.f210733h);
            dagger.internal.u<com.avito.android.blueprint.chips.single.d> uVarD16 = dagger.internal.g.d(com.avito.android.blueprint.chips.single.g.a());
            this.f210715O = uVarD16;
            this.f210716P = new com.avito.android.blueprint.chips.single.c(uVarD16, this.f210732g, this.f210733h);
            dagger.internal.u<com.avito.android.blueprint.chips.multiple.c> uVarD17 = dagger.internal.g.d(com.avito.android.blueprint.chips.multiple.g.a());
            this.f210717Q = uVarD17;
            dagger.internal.u<com.avito.konveyor.a> uVarD18 = dagger.internal.g.d(new m(this.f210734i, this.f210737l, this.f210739n, this.f210746u, this.f210748w, this.f210751z, this.f210702B, this.f210704D, this.f210706F, this.f210708H, this.f210710J, this.f210712L, this.f210714N, this.f210716P, new com.avito.android.blueprint.chips.multiple.b(uVarD17, this.f210732g, this.f210733h)));
            this.f210718R = uVarD18;
            this.f210719S = dagger.internal.g.d(new com.avito.android.parameters_sheet.di.e(uVarD18));
            dagger.internal.u<com.avito.android.recycler.data_aware.e> uVarD19 = dagger.internal.g.d(i.a.f210770a);
            this.f210720T = uVarD19;
            dagger.internal.u<com.avito.android.recycler.data_aware.c> uVarD20 = dagger.internal.g.d(new com.avito.android.parameters_sheet.di.h(uVarD19, this.f210727b, this.f210719S));
            this.f210721U = uVarD20;
            dagger.internal.f.a(this.f210726a, dagger.internal.g.d(new u(uVarD20, this.f210718R)));
            this.f210722V = dagger.internal.l.a(list);
            this.f210723W = dagger.internal.g.d(new n(this.f210735j, this.f210745t, this.f210747v, this.f210750y, this.f210703C, this.f210705E, this.f210709I, this.f210707G, this.f210711K, this.f210713M));
            this.f210725Y = dagger.internal.g.d(new q(this.f210722V, dagger.internal.l.a(hVar), this.f210719S, this.f210723W, new i(cVar)));
        }

        @Override // com.avito.android.parameters_sheet.di.b
        public final void a(com.avito.android.parameters_sheet.d dVar) {
            dVar.f210699I = (com.avito.konveyor.adapter.j) this.f210726a.get();
            dVar.f210700J = this.f210725Y.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
