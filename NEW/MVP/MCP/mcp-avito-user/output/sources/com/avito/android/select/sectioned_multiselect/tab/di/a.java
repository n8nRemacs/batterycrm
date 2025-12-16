package com.avito.android.select.sectioned_multiselect.tab.di;

import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.app.Application;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.C;
import androidx.view.T0;
import aq0.C23655d;
import aq0.C23656e;
import aq0.InterfaceC23653b;
import com.avito.android.features.auto.ab_tests.configs.AutoGlowFiltersTestGroup;
import com.avito.android.select.bottom_sheet_pagination.blueprints.PaginationState;
import com.avito.android.select.sectioned_multiselect.core.O;
import com.avito.android.select.sectioned_multiselect.core.T;
import com.avito.android.select.sectioned_multiselect.tab.SectionedMultiselectTabFragment;
import com.avito.android.select.sectioned_multiselect.tab.di.d;
import com.avito.android.select.sectioned_multiselect.tab.di.l;
import com.avito.android.select.sectioned_multiselect.tab.r;
import com.avito.android.util.InterfaceC35745a5;
import com.google.gson.Gson;
import cv.InterfaceC39417a;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSectionedMultiselectTabComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSectionedMultiselectTabComponent.java */
    public static final class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public InterfaceC23653b f266706a;

        /* renamed from: b, reason: collision with root package name */
        public InterfaceC39417a f266707b;

        /* renamed from: c, reason: collision with root package name */
        public String f266708c;

        /* renamed from: d, reason: collision with root package name */
        public String f266709d;

        /* renamed from: e, reason: collision with root package name */
        public ActivityC22955m f266710e;

        /* renamed from: f, reason: collision with root package name */
        public Boolean f266711f;

        /* renamed from: g, reason: collision with root package name */
        public InterfaceC19588c<? super InterfaceC19587b> f266712g;

        /* renamed from: h, reason: collision with root package name */
        public Resources f266713h;

        public b() {
        }

        @Override // com.avito.android.select.sectioned_multiselect.tab.di.d.a
        public final d.a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f266707b = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.tab.di.d.a
        public final d.a b(Resources resources) {
            this.f266713h = resources;
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.tab.di.d.a
        public final d build() {
            t.a(InterfaceC23653b.class, this.f266706a);
            t.a(cv.b.class, this.f266707b);
            t.a(String.class, this.f266709d);
            t.a(T0.class, this.f266710e);
            t.a(Boolean.class, this.f266711f);
            t.a(Resources.class, this.f266713h);
            return new c(this.f266707b, this.f266706a, this.f266708c, this.f266709d, this.f266710e, this.f266711f, this.f266712g, this.f266713h, null);
        }

        @Override // com.avito.android.select.sectioned_multiselect.tab.di.d.a
        public final d.a c(String str) {
            str.getClass();
            this.f266709d = str;
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.tab.di.d.a
        public final d.a d(InterfaceC23653b interfaceC23653b) {
            this.f266706a = interfaceC23653b;
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.tab.di.d.a
        public final d.a e(InterfaceC19588c interfaceC19588c) {
            this.f266712g = interfaceC19588c;
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.tab.di.d.a
        public final d.a f(boolean z12) {
            this.f266711f = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.tab.di.d.a
        public final d.a g(ActivityC22955m activityC22955m) {
            this.f266710e = activityC22955m;
            return this;
        }

        @Override // com.avito.android.select.sectioned_multiselect.tab.di.d.a
        public final d.a h(String str) {
            this.f266708c = str;
            return this;
        }
    }

    /* compiled from: DaggerSectionedMultiselectTabComponent.java */
    public static final class c implements com.avito.android.select.sectioned_multiselect.tab.di.d {

        /* renamed from: A, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet_pagination.blueprints.loading.c> f266714A;

        /* renamed from: B, reason: collision with root package name */
        public final com.avito.android.select.bottom_sheet_pagination.blueprints.loading.b f266715B;

        /* renamed from: C, reason: collision with root package name */
        public final u<com.avito.android.select.bottom_sheet_pagination.blueprints.error.c> f266716C;

        /* renamed from: D, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f266717D;

        /* renamed from: E, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f266718E;

        /* renamed from: F, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f266719F;

        /* renamed from: G, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.c> f266720G;

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.l f266721a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.select.sectioned_multiselect.Items.section_item.d> f266722b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.d> f266723c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.d> f266724d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35745a5> f266725e;

        /* renamed from: f, reason: collision with root package name */
        public final com.avito.android.select.sectioned_multiselect.core.di.k f266726f;

        /* renamed from: g, reason: collision with root package name */
        public final u<Gson> f266727g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Application> f266728h;

        /* renamed from: i, reason: collision with root package name */
        public final u<AK0.l> f266729i;

        /* renamed from: j, reason: collision with root package name */
        public final u<com.avito.android.select.i> f266730j;

        /* renamed from: k, reason: collision with root package name */
        public final u<u3.g<AutoGlowFiltersTestGroup>> f266731k;

        /* renamed from: l, reason: collision with root package name */
        public final com.avito.android.select.sectioned_multiselect.d f266732l;

        /* renamed from: m, reason: collision with root package name */
        public final u<com.avito.android.select.glow_animation.f> f266733m;

        /* renamed from: n, reason: collision with root package name */
        public final u<com.jakewharton.rxrelay3.c<PaginationState>> f266734n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f266735o;

        /* renamed from: p, reason: collision with root package name */
        public final u<com.avito.android.select.g> f266736p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.select.sectioned_multiselect.tab.c> f266737q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.f f266738r;

        /* renamed from: s, reason: collision with root package name */
        public final u<C> f266739s;

        /* renamed from: t, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f266740t;

        /* renamed from: u, reason: collision with root package name */
        public final u<com.avito.android.recycler.data_aware.e> f266741u;

        /* renamed from: v, reason: collision with root package name */
        public final com.avito.android.select.sectioned_multiselect.Items.section_list.c f266742v;

        /* renamed from: w, reason: collision with root package name */
        public final com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.c f266743w;

        /* renamed from: x, reason: collision with root package name */
        public final com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.c f266744x;

        /* renamed from: y, reason: collision with root package name */
        public final com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.c f266745y;

        /* renamed from: z, reason: collision with root package name */
        public final com.avito.android.select.glow_animation.c f266746z;

        /* compiled from: DaggerSectionedMultiselectTabComponent.java */
        /* renamed from: com.avito.android.select.sectioned_multiselect.tab.di.a$c$a, reason: collision with other inner class name */
        public static final class C7954a implements u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f266747a;

            public C7954a(InterfaceC23653b interfaceC23653b) {
                this.f266747a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f266747a.k();
                t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerSectionedMultiselectTabComponent.java */
        public static final class b implements u<u3.g<AutoGlowFiltersTestGroup>> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f266748a;

            public b(InterfaceC23653b interfaceC23653b) {
                this.f266748a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                u3.g<AutoGlowFiltersTestGroup> gVarQ5 = this.f266748a.Q5();
                t.c(gVarQ5);
                return gVarQ5;
            }
        }

        /* compiled from: DaggerSectionedMultiselectTabComponent.java */
        /* renamed from: com.avito.android.select.sectioned_multiselect.tab.di.a$c$c, reason: collision with other inner class name */
        public static final class C7955c implements u<Gson> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f266749a;

            public C7955c(InterfaceC23653b interfaceC23653b) {
                this.f266749a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Gson gsonS = this.f266749a.s();
                t.c(gsonS);
                return gsonS;
            }
        }

        /* compiled from: DaggerSectionedMultiselectTabComponent.java */
        public static final class d implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final InterfaceC23653b f266750a;

            public d(InterfaceC23653b interfaceC23653b) {
                this.f266750a = interfaceC23653b;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f266750a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c() {
            throw null;
        }

        public c(cv.b bVar, InterfaceC23653b interfaceC23653b, String str, String str2, T0 t02, Boolean bool, InterfaceC19588c interfaceC19588c, Resources resources, C7953a c7953a) {
            this.f266721a = dagger.internal.l.b(str);
            this.f266722b = dagger.internal.g.d(com.avito.android.select.sectioned_multiselect.Items.section_item.g.a());
            this.f266723c = dagger.internal.g.d(com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.g.a());
            this.f266724d = dagger.internal.g.d(com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.g.a());
            this.f266725e = new d(interfaceC23653b);
            this.f266726f = new com.avito.android.select.sectioned_multiselect.core.di.k(dagger.internal.l.a(t02), T.a());
            this.f266727g = new C7955c(interfaceC23653b);
            u<AK0.l> uVarD = dagger.internal.g.d(new C23655d(new C7954a(interfaceC23653b)));
            this.f266729i = uVarD;
            this.f266730j = dagger.internal.g.d(new C23656e(uVarD, this.f266727g));
            dagger.internal.l lVarA = dagger.internal.l.a(str2);
            this.f266731k = new b(interfaceC23653b);
            this.f266732l = new com.avito.android.select.sectioned_multiselect.d(this.f266730j, lVarA, com.avito.android.select.glow_animation.e.a(), this.f266731k);
            this.f266733m = dagger.internal.g.d(com.avito.android.select.glow_animation.j.a());
            this.f266734n = dagger.internal.g.d(com.avito.android.select.sectioned_multiselect.core.di.m.a());
            this.f266735o = dagger.internal.l.a(bool);
            this.f266736p = dagger.internal.g.d(new i(this.f266735o, dagger.internal.l.b(interfaceC19588c)));
            this.f266737q = dagger.internal.g.d(new r(this.f266721a, this.f266722b, this.f266723c, this.f266724d, this.f266725e, this.f266726f, this.f266732l, this.f266733m, this.f266734n, this.f266736p, new O(dagger.internal.l.a(resources))));
            dagger.internal.f fVar = new dagger.internal.f();
            this.f266738r = fVar;
            this.f266739s = dagger.internal.g.d(new m(fVar));
            this.f266740t = dagger.internal.g.d(new h(new com.avito.android.select.sectioned_multiselect.Items.section_item.c(this.f266722b)));
            this.f266741u = dagger.internal.g.d(new f(com.avito.android.select.sectioned_multiselect.Items.section_list.i.a()));
            this.f266742v = new com.avito.android.select.sectioned_multiselect.Items.section_list.c(com.avito.android.select.sectioned_multiselect.Items.section_list.e.a(), this.f266740t, this.f266741u);
            this.f266743w = new com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.c(com.avito.android.select.sectioned_multiselect.Items.section_item.section_title.e.a());
            this.f266744x = new com.avito.android.select.sectioned_multiselect.Items.section_item.section_checkbox.c(this.f266724d);
            this.f266745y = new com.avito.android.select.sectioned_multiselect.Items.section_item.radio_select.c(this.f266723c);
            this.f266746z = new com.avito.android.select.glow_animation.c(this.f266733m);
            u<com.avito.android.select.bottom_sheet_pagination.blueprints.loading.c> uVarD2 = dagger.internal.g.d(new com.avito.android.select.bottom_sheet_pagination.blueprints.loading.e(this.f266734n));
            this.f266714A = uVarD2;
            this.f266715B = new com.avito.android.select.bottom_sheet_pagination.blueprints.loading.b(uVarD2);
            u<com.avito.android.select.bottom_sheet_pagination.blueprints.error.c> uVarD3 = dagger.internal.g.d(new com.avito.android.select.bottom_sheet_pagination.blueprints.error.e(this.f266734n));
            this.f266716C = uVarD3;
            u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new g(this.f266742v, this.f266743w, this.f266744x, this.f266745y, this.f266746z, this.f266715B, new com.avito.android.select.bottom_sheet_pagination.blueprints.error.b(uVarD3)));
            this.f266717D = uVarD4;
            this.f266718E = dagger.internal.g.d(new n(uVarD4));
            u<com.avito.android.recycler.data_aware.e> uVarD5 = dagger.internal.g.d(l.a.f266768a);
            this.f266719F = uVarD5;
            u<com.avito.android.recycler.data_aware.c> uVarD6 = dagger.internal.g.d(new k(uVarD5, this.f266739s, this.f266718E));
            this.f266720G = uVarD6;
            dagger.internal.f.a(this.f266738r, dagger.internal.g.d(new j(uVarD6, this.f266717D)));
        }

        @Override // com.avito.android.select.sectioned_multiselect.tab.di.d
        public final void a(SectionedMultiselectTabFragment sectionedMultiselectTabFragment) {
            sectionedMultiselectTabFragment.f266696n0 = this.f266737q.get();
            sectionedMultiselectTabFragment.f266697o0 = (com.avito.konveyor.adapter.j) this.f266738r.get();
            sectionedMultiselectTabFragment.f266698p0 = this.f266720G.get();
        }
    }

    public static d.a a() {
        return new b();
    }
}
