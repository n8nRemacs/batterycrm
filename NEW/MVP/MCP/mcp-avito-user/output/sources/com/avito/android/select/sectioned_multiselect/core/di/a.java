package com.avito.android.select.sectioned_multiselect.core.di;

import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.app.Application;
import android.content.res.Resources;
import android.os.Bundle;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.C;
import androidx.view.P0;
import androidx.view.T0;
import aq0.C23655d;
import aq0.C23656e;
import aq0.InterfaceC23653b;
import cE.C27025b;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.features.auto.ab_tests.configs.AutoGlowFiltersTestGroup;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.category_parameters.SectionedMultiselectParameter;
import com.avito.android.select.bottom_sheet_pagination.blueprints.PaginationState;
import com.avito.android.select.sectioned_multiselect.core.InterfaceC34659i;
import com.avito.android.select.sectioned_multiselect.core.L;
import com.avito.android.select.sectioned_multiselect.core.O;
import com.avito.android.select.sectioned_multiselect.core.P;
import com.avito.android.select.sectioned_multiselect.core.Q;
import com.avito.android.select.sectioned_multiselect.core.S;
import com.avito.android.select.sectioned_multiselect.core.SectionedMultiselectCoreFragment;
import com.avito.android.select.sectioned_multiselect.core.T;
import com.avito.android.select.sectioned_multiselect.core.di.c;
import com.avito.android.select.sectioned_multiselect.core.di.m;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;
import java.util.List;

/* compiled from: DaggerSectionedMultiselectDialogComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSectionedMultiselectDialogComponent.java */
    public static final class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC23653b f266567a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f266568b;

        /* renamed from: c, reason: collision with root package name */
        public String f266569c;

        /* renamed from: d, reason: collision with root package name */
        public Bundle f266570d;

        /* renamed from: e, reason: collision with root package name */
        public Resources f266571e;

        /* renamed from: f, reason: collision with root package name */
        public Boolean f266572f;

        /* renamed from: g, reason: collision with root package name */
        public SearchParams f266573g;

        /* renamed from: h, reason: collision with root package name */
        public List<SectionedMultiselectParameter.Value> f266574h;

        /* renamed from: i, reason: collision with root package name */
        public ActivityC22955m f266575i;

        /* renamed from: j, reason: collision with root package name */
        public InterfaceC19588c<? super InterfaceC19587b> f266576j;

        public b() {
        }

        @Override // com.avito.android.select.sectioned_multiselect.core.di.c.a
        public final c.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f266568b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.core.di.c.a
        public final c.a b(Resources resources) {
            this.f266571e = resources;
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.core.di.c.a
        public final com.avito.android.select.sectioned_multiselect.core.di.c build() {
            t.a(InterfaceC23653b.class, this.f266567a);
            t.a(cv.b.class, this.f266568b);
            t.a(String.class, this.f266569c);
            t.a(Resources.class, this.f266571e);
            t.a(Boolean.class, this.f266572f);
            t.a(SearchParams.class, this.f266573g);
            t.a(List.class, this.f266574h);
            t.a(T0.class, this.f266575i);
            return new c(this.f266568b, this.f266567a, this.f266569c, this.f266570d, this.f266571e, this.f266572f, this.f266573g, this.f266574h, this.f266575i, this.f266576j, null, null);
        }

        @Override // com.avito.android.select.sectioned_multiselect.core.di.c.a
        public final c.a c(String str) {
            str.getClass();
            this.f266569c = str;
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.core.di.c.a
        public final c.a d(InterfaceC23653b interfaceC23653b) {
            this.f266567a = interfaceC23653b;
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.core.di.c.a
        public final c.a e(InterfaceC19588c interfaceC19588c) {
            this.f266576j = interfaceC19588c;
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.core.di.c.a
        public final c.a f(boolean z12) {
            this.f266572f = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.core.di.c.a
        public final c.a g(ActivityC22955m activityC22955m) {
            this.f266575i = activityC22955m;
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.core.di.c.a
        public final c.a h(List list) {
            list.getClass();
            this.f266574h = list;
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.core.di.c.a
        public final c.a o(SearchParams searchParams) {
            this.f266573g = searchParams;
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.core.di.c.a
        public final c.a q(Bundle bundle) {
            this.f266570d = bundle;
            return this;
        }
    }

    /* compiled from: DaggerSectionedMultiselectDialogComponent.java */
    public static final class c implements com.avito.android.select.sectioned_multiselect.core.di.c {

        /* renamed from: A, reason: collision with root package name */
        public final u<u3.g<AutoGlowFiltersTestGroup>> f266577A;

        /* renamed from: B, reason: collision with root package name */
        public final com.avito.android.select.sectioned_multiselect.d f266578B;

        /* renamed from: C, reason: collision with root package name */
        public final u<InterfaceC28373a> f266579C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.android.remote.error.f> f266580D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f266581E;

        /* renamed from: F, reason: collision with root package name */
        public final u<C27025b> f266582F;

        /* renamed from: G, reason: collision with root package name */
        public final u<InterfaceC34659i> f266583G;

        /* renamed from: a, reason: collision with root package name */
        public final T0 f266584a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.select.sectioned_multiselect.Items.section_item.d> f266585b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.select.sectioned_multiselect.Items.section_item.j f266586c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.d> f266587d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.c f266588e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.c f266589f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.jakewharton.rxrelay3.c<PaginationState>> f266590g;

        /* renamed from: h, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet_pagination.blueprints.error.c> f266591h;

        /* renamed from: i, reason: collision with root package name */
        public final com.avito.android.select.bottom_sheet_pagination.blueprints.error.b f266592i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet_pagination.blueprints.loading.c> f266593j;

        /* renamed from: k, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f266594k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f266595l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.f f266596m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.j> f266597n;

        /* renamed from: o, reason: collision with root package name */
        public final u<C> f266598o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f266599p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.l f266600q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.l f266601r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.l f266602s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.android.select.g> f266603t;

        /* renamed from: u, reason: collision with root package name */
        public final u<InterfaceC35745a5> f266604u;

        /* renamed from: v, reason: collision with root package name */
        public final O f266605v;

        /* renamed from: w, reason: collision with root package name */
        public final u<Gson> f266606w;

        /* renamed from: x, reason: collision with root package name */
        public final u<Application> f266607x;

        /* renamed from: y, reason: collision with root package name */
        public final u<AK0.l> f266608y;

        /* renamed from: z, reason: collision with root package name */
        public final u<com.avito.android.select.i> f266609z;

        /* compiled from: DaggerSectionedMultiselectDialogComponent.java */
        /* renamed from: com.avito.android.select.sectioned_multiselect.core.di.a$c$a, reason: collision with other inner class name */
        public static final class C7951a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f266610a;

            public C7951a(InterfaceC23653b interfaceC23653b) {
                this.f266610a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f266610a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSectionedMultiselectDialogComponent.java */
        public static final class b implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f266611a;

            public b(InterfaceC23653b interfaceC23653b) {
                this.f266611a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f266611a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerSectionedMultiselectDialogComponent.java */
        /* renamed from: com.avito.android.select.sectioned_multiselect.core.di.a$c$c, reason: collision with other inner class name */
        public static final class C7952c implements u<u3.g<AutoGlowFiltersTestGroup>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f266612a;

            public C7952c(InterfaceC23653b interfaceC23653b) {
                this.f266612a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.g<AutoGlowFiltersTestGroup> gVarQ5 = this.f266612a.Q5();
                t.c(gVarQ5);
                return gVarQ5;
            }
        }

        /* compiled from: DaggerSectionedMultiselectDialogComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f266613a;

            public d(cv.b bVar) {
                this.f266613a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f266613a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSectionedMultiselectDialogComponent.java */
        public static final class e implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f266614a;

            public e(InterfaceC23653b interfaceC23653b) {
                this.f266614a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f266614a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerSectionedMultiselectDialogComponent.java */
        public static final class f implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f266615a;

            public f(InterfaceC23653b interfaceC23653b) {
                this.f266615a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f266615a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerSectionedMultiselectDialogComponent.java */
        public static final class g implements u<C27025b> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f266616a;

            public g(InterfaceC23653b interfaceC23653b) {
                this.f266616a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f266616a.v0();
            }
        }

        /* compiled from: DaggerSectionedMultiselectDialogComponent.java */
        public static final class h implements u<com.avito.android.remote.error.f> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f266617a;

            public h(InterfaceC23653b interfaceC23653b) {
                this.f266617a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f266617a.o();
            }
        }

        public c() {
            throw null;
        }

        public c(cv.b bVar, InterfaceC23653b interfaceC23653b, String str, Bundle bundle, Resources resources, Boolean bool, SearchParams searchParams, List list, T0 t02, InterfaceC19588c interfaceC19588c, Y41.l lVar, C7950a c7950a) {
            this.f266584a = t02;
            u<com.avito.android.select.sectioned_multiselect.Items.section_item.d> uVarD = dagger.internal.g.d(com.avito.android.select.sectioned_multiselect.Items.section_item.g.a());
            this.f266585b = uVarD;
            this.f266586c = new com.avito.android.select.sectioned_multiselect.Items.section_item.j(uVarD);
            u<com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.d> uVarD2 = dagger.internal.g.d(com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.g.a());
            this.f266587d = uVarD2;
            this.f266588e = new com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.c(uVarD2);
            this.f266589f = new com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.c(com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.e.a());
            u<com.jakewharton.rxrelay3.c<PaginationState>> uVarD3 = dagger.internal.g.d(m.a.f266637a);
            this.f266590g = uVarD3;
            u<com.avito.android.select.bottom_sheet_pagination.blueprints.error.c> uVarD4 = dagger.internal.g.d(new com.avito.android.select.bottom_sheet_pagination.blueprints.error.e(uVarD3));
            this.f266591h = uVarD4;
            this.f266592i = new com.avito.android.select.bottom_sheet_pagination.blueprints.error.b(uVarD4);
            u<com.avito.android.select.bottom_sheet_pagination.blueprints.loading.c> uVarD5 = dagger.internal.g.d(new com.avito.android.select.bottom_sheet_pagination.blueprints.loading.e(this.f266590g));
            this.f266593j = uVarD5;
            u<com.avito.konveyor.a> uVarD6 = dagger.internal.g.d(new j(this.f266586c, this.f266588e, this.f266589f, this.f266592i, new com.avito.android.select.bottom_sheet_pagination.blueprints.loading.b(uVarD5)));
            this.f266594k = uVarD6;
            this.f266595l = dagger.internal.g.d(new i(uVarD6));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f266596m = fVar;
            u<com.avito.konveyor.adapter.j> uVarD7 = dagger.internal.g.d(new com.avito.android.select.sectioned_multiselect.core.di.e(fVar, this.f266594k));
            this.f266597n = uVarD7;
            this.f266598o = dagger.internal.g.d(new com.avito.android.select.sectioned_multiselect.core.di.h(uVarD7));
            u<com.avito.android.recycler.data_aware.e> uVarD8 = dagger.internal.g.d(new com.avito.android.select.sectioned_multiselect.core.di.g(com.avito.android.select.sectioned_multiselect.Items.section_list.i.a()));
            this.f266599p = uVarD8;
            dagger.internal.f.a(this.f266596m, dagger.internal.g.d(new com.avito.android.select.sectioned_multiselect.core.di.f(uVarD8, this.f266598o, this.f266595l)));
            this.f266600q = dagger.internal.l.b(bundle);
            this.f266601r = dagger.internal.l.a(list);
            this.f266602s = dagger.internal.l.a(bool);
            this.f266603t = dagger.internal.g.d(new l(this.f266601r, this.f266602s, dagger.internal.l.b(interfaceC19588c)));
            this.f266604u = new f(interfaceC23653b);
            this.f266605v = new O(dagger.internal.l.a(resources));
            this.f266606w = new e(interfaceC23653b);
            u<AK0.l> uVarD9 = dagger.internal.g.d(new C23655d(new b(interfaceC23653b)));
            this.f266608y = uVarD9;
            this.f266609z = dagger.internal.g.d(new C23656e(uVarD9, this.f266606w));
            dagger.internal.l lVarA = dagger.internal.l.a(str);
            this.f266577A = new C7952c(interfaceC23653b);
            this.f266578B = new com.avito.android.select.sectioned_multiselect.d(this.f266609z, lVarA, com.avito.android.select.glow_animation.e.a(), this.f266577A);
            k kVar = new k(dagger.internal.l.a(t02), T.a());
            C7951a c7951a = new C7951a(interfaceC23653b);
            u<Gson> uVar = this.f266606w;
            u<InterfaceC35745a5> uVar2 = this.f266604u;
            this.f266583G = dagger.internal.g.d(new L(this.f266600q, this.f266603t, uVar2, this.f266585b, this.f266587d, this.f266605v, this.f266578B, kVar, new com.avito.android.select.sectioned_multiselect.core.analytics.e(c7951a, uVar, uVar2), this.f266590g, new h(interfaceC23653b), this.f266602s, new d(bVar), new g(interfaceC23653b)));
        }

        @Override // com.avito.android.select.sectioned_multiselect.core.di.c
        public final void a(SectionedMultiselectCoreFragment sectionedMultiselectCoreFragment) {
            sectionedMultiselectCoreFragment.f266536h0 = this.f266595l.get();
            this.f266594k.get();
            sectionedMultiselectCoreFragment.f266537i0 = (com.avito.android.recycler.data_aware.c) this.f266596m.get();
            sectionedMultiselectCoreFragment.f266538j0 = this.f266597n.get();
            sectionedMultiselectCoreFragment.f266539k0 = this.f266583G.get();
            S s5 = new S();
            com.avito.android.select.sectioned_multiselect.core.di.d.f266618a.getClass();
            sectionedMultiselectCoreFragment.f266540l0 = (P) new P0(this.f266584a, s5).a(Q.class);
        }
    }

    public static c.a a() {
        return new b();
    }
}
