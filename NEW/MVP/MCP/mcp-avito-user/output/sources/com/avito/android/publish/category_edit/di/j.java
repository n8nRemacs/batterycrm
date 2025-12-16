package com.avito.android.publish.category_edit.di;

import Jf0.InterfaceC14192a;
import androidx.fragment.app.DialogFragment;
import androidx.view.InterfaceC23487e;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.category_edit.CategoryEditSheet;
import com.avito.android.publish.category_edit.di.a;
import com.avito.android.publish.category_edit.k;
import com.avito.android.publish.category_edit.o;
import com.avito.android.remote.model.Navigation;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import java.util.Set;
import yc.C50213a;

/* compiled from: DaggerCategoryEditComponent.java */
@dagger.internal.e
/* loaded from: classes16.dex */
public final class j {

    /* compiled from: DaggerCategoryEditComponent.java */
    public static final class b implements a.InterfaceC7064a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.publish.category_edit.di.b f232361a;

        /* renamed from: b, reason: collision with root package name */
        public String f232362b;

        /* renamed from: c, reason: collision with root package name */
        public Navigation f232363c;

        /* renamed from: d, reason: collision with root package name */
        public CategoryEditSheet f232364d;

        public b() {
        }

        @Override // com.avito.android.publish.category_edit.di.a.InterfaceC7064a
        public final a.InterfaceC7064a a(CategoryEditSheet categoryEditSheet) {
            this.f232364d = categoryEditSheet;
            return this;
        }

        @Override // com.avito.android.publish.category_edit.di.a.InterfaceC7064a
        public final a.InterfaceC7064a b(Navigation navigation2) {
            this.f232363c = navigation2;
            return this;
        }

        @Override // com.avito.android.publish.category_edit.di.a.InterfaceC7064a
        public final com.avito.android.publish.category_edit.di.a build() {
            t.a(com.avito.android.publish.category_edit.di.b.class, this.f232361a);
            t.a(Navigation.class, this.f232363c);
            t.a(DialogFragment.class, this.f232364d);
            return new c(this.f232361a, this.f232362b, this.f232363c, this.f232364d, null);
        }

        @Override // com.avito.android.publish.category_edit.di.a.InterfaceC7064a
        public final a.InterfaceC7064a c(com.avito.android.publish.category_edit.di.b bVar) {
            this.f232361a = bVar;
            return this;
        }

        @Override // com.avito.android.publish.category_edit.di.a.InterfaceC7064a
        public final a.InterfaceC7064a e(String str) {
            this.f232362b = str;
            return this;
        }
    }

    /* compiled from: DaggerCategoryEditComponent.java */
    public static final class c implements com.avito.android.publish.category_edit.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.publish.category_edit.di.b f232365a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.checkable.d> f232366b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.blueprints.publish.checkable.a> f232367c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f232368d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.publish.category_edit.di.d f232369e;

        /* renamed from: f, reason: collision with root package name */
        public final l f232370f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC23487e> f232371g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC14192a> f232372h;

        /* renamed from: i, reason: collision with root package name */
        public final l f232373i;

        /* renamed from: j, reason: collision with root package name */
        public final l f232374j;

        /* renamed from: k, reason: collision with root package name */
        public final u<C50213a> f232375k;

        /* renamed from: l, reason: collision with root package name */
        public final u<com.avito.android.publish.category_edit.a> f232376l;

        /* renamed from: m, reason: collision with root package name */
        public final u<InterfaceC35745a5> f232377m;

        /* renamed from: n, reason: collision with root package name */
        public final u<InterfaceC33535v> f232378n;

        /* renamed from: o, reason: collision with root package name */
        public final u<k> f232379o;

        /* renamed from: p, reason: collision with root package name */
        public final u<Set<TV0.d<?, ?>>> f232380p;

        /* compiled from: DaggerCategoryEditComponent.java */
        public static final class a implements u<InterfaceC33535v> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.category_edit.di.b f232381a;

            public a(com.avito.android.publish.category_edit.di.b bVar) {
                this.f232381a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f232381a.y7();
            }
        }

        /* compiled from: DaggerCategoryEditComponent.java */
        public static final class b implements u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.category_edit.di.b f232382a;

            public b(com.avito.android.publish.category_edit.di.b bVar) {
                this.f232382a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f232382a.D1();
            }
        }

        /* compiled from: DaggerCategoryEditComponent.java */
        /* renamed from: com.avito.android.publish.category_edit.di.j$c$c, reason: collision with other inner class name */
        public static final class C7065c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.category_edit.di.b f232383a;

            public C7065c(com.avito.android.publish.category_edit.di.b bVar) {
                this.f232383a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f232383a.Ha();
            }
        }

        /* compiled from: DaggerCategoryEditComponent.java */
        public static final class d implements u<InterfaceC14192a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.publish.category_edit.di.b f232384a;

            public d(com.avito.android.publish.category_edit.di.b bVar) {
                this.f232384a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f232384a.l7();
            }
        }

        public c(com.avito.android.publish.category_edit.di.b bVar, String str, Navigation navigation2, DialogFragment dialogFragment, a aVar) {
            this.f232365a = bVar;
            u<com.avito.android.blueprints.publish.checkable.d> uVarD = dagger.internal.g.d(com.avito.android.blueprints.publish.checkable.g.a());
            this.f232366b = uVarD;
            u<com.avito.android.blueprints.publish.checkable.a> uVarD2 = dagger.internal.g.d(new com.avito.android.blueprints.publish.checkable.c(uVarD));
            this.f232367c = uVarD2;
            u<com.avito.konveyor.a> uVarD3 = dagger.internal.g.d(new e(uVarD2));
            this.f232368d = uVarD3;
            this.f232369e = new com.avito.android.publish.category_edit.di.d(uVarD3);
            l lVarA = l.a(dialogFragment);
            this.f232370f = lVarA;
            this.f232371g = dagger.internal.g.d(new g(lVarA));
            this.f232372h = new d(bVar);
            this.f232373i = l.b(str);
            l lVarA2 = l.a(navigation2);
            this.f232374j = lVarA2;
            b bVar2 = new b(bVar);
            u<com.avito.android.publish.category_edit.a> uVarD4 = dagger.internal.g.d(new i(this.f232373i, lVarA2, this.f232372h, bVar2));
            this.f232376l = uVarD4;
            C7065c c7065c = new C7065c(bVar);
            a aVar2 = new a(bVar);
            this.f232379o = dagger.internal.g.d(new h(this.f232370f, new o(this.f232374j, uVarD4, this.f232371g, c7065c, aVar2)));
            this.f232380p = dagger.internal.g.d(new f(this.f232366b));
        }

        @Override // com.avito.android.publish.category_edit.di.a
        public final void a(CategoryEditSheet categoryEditSheet) {
            categoryEditSheet.f232326f0 = this.f232369e;
            categoryEditSheet.f232327g0 = this.f232379o.get();
            categoryEditSheet.f232328h0 = this.f232365a.j4();
            categoryEditSheet.f232329i0 = this.f232380p.get();
        }
    }

    public static a.InterfaceC7064a a() {
        return new b();
    }
}
