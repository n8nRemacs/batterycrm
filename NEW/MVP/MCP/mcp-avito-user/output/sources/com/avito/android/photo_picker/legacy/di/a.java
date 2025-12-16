package com.avito.android.photo_picker.legacy.di;

import android.app.Application;
import android.content.Context;
import com.avito.android.ab_tests.groups.SimpleTestGroupWithNone;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.b0;
import com.avito.android.image.enhancement.InterfaceC30973d;
import com.avito.android.permissions.G;
import com.avito.android.photo_picker.M;
import com.avito.android.photo_picker.N;
import com.avito.android.photo_picker.PhotoPickerActivity;
import com.avito.android.photo_picker.PhotoPickerIntentFactory;
import com.avito.android.photo_picker.legacy.InterfaceC33243e;
import com.avito.android.photo_picker.legacy.InterfaceC33244f;
import com.avito.android.photo_picker.legacy.di.d;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.InterfaceC35863o4;
import com.avito.android.util.L0;
import com.google.gson.Gson;
import w80.C49468b;

/* compiled from: DaggerPhotoPickerComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerPhotoPickerComponent.java */
    public static final class b implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public e f219664a;

        /* renamed from: b, reason: collision with root package name */
        public f f219665b;

        /* renamed from: c, reason: collision with root package name */
        public PhotoPickerIntentFactory.PhotoPickerMode f219666c;

        /* renamed from: d, reason: collision with root package name */
        public Integer f219667d;

        /* renamed from: e, reason: collision with root package name */
        public Gson f219668e;

        public b() {
        }

        @Override // com.avito.android.photo_picker.legacy.di.d.a
        public final d.a a(Gson gson) {
            this.f219668e = gson;
            return this;
        }

        @Override // com.avito.android.photo_picker.legacy.di.d.a
        public final d.a b(int i12) {
            this.f219667d = Integer.valueOf(i12);
            return this;
        }

        @Override // com.avito.android.photo_picker.legacy.di.d.a
        public final d build() {
            dagger.internal.t.a(e.class, this.f219664a);
            dagger.internal.t.a(f.class, this.f219665b);
            dagger.internal.t.a(PhotoPickerIntentFactory.PhotoPickerMode.class, this.f219666c);
            dagger.internal.t.a(Integer.class, this.f219667d);
            dagger.internal.t.a(Gson.class, this.f219668e);
            return new c(this.f219665b, this.f219664a, this.f219666c, this.f219667d, this.f219668e, null);
        }

        @Override // com.avito.android.photo_picker.legacy.di.d.a
        public final d.a c(e eVar) {
            this.f219664a = eVar;
            return this;
        }

        @Override // com.avito.android.photo_picker.legacy.di.d.a
        public final d.a d(f fVar) {
            this.f219665b = fVar;
            return this;
        }

        @Override // com.avito.android.photo_picker.legacy.di.d.a
        public final d.a e(PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode) {
            this.f219666c = photoPickerMode;
            return this;
        }
    }

    /* compiled from: DaggerPhotoPickerComponent.java */
    public static final class c implements com.avito.android.photo_picker.legacy.di.d {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC33243e> f219669A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_picker.legacy.y> f219670B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35863o4> f219671C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC30973d> f219672D;

        /* renamed from: E, reason: collision with root package name */
        public final m f219673E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<HM.a> f219674F;

        /* renamed from: G, reason: collision with root package name */
        public final dagger.internal.l f219675G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<M> f219676H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.responsive.a> f219677I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.recycler.responsive.e> f219678J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.j> f219679K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.j> f219680L;

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.photo_picker.legacy.di.e f219681a;

        /* renamed from: b, reason: collision with root package name */
        public final Gson f219682b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.photo_picker.legacy.di.f f219683c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.x> f219684d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<Context> f219685e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.device_orientation.i> f219686f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_picker.legacy.details_list.i> f219687g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.u<L0> f219688h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_picker.legacy.details_list.a> f219689i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f219690j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f219691k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.f f219692l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_picker.legacy.thumbnail_list.d> f219693m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.u<TV0.b<com.avito.android.photo_picker.legacy.thumbnail_list.j, com.avito.android.photo_picker.legacy.thumbnail_list.a>> f219694n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.a> f219695o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.konveyor.adapter.a> f219696p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_cache.b> f219697q;

        /* renamed from: r, reason: collision with root package name */
        public final com.avito.android.photo_storage.f f219698r;

        /* renamed from: s, reason: collision with root package name */
        public final C49468b f219699s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<Application> f219700t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.photo_picker.converter.b> f219701u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<D70.a> f219702v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<b0> f219703w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.computer_vision.a> f219704x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f219705y;

        /* renamed from: z, reason: collision with root package name */
        public final N70.d f219706z;

        /* compiled from: DaggerPhotoPickerComponent.java */
        /* renamed from: com.avito.android.photo_picker.legacy.di.a$c$a, reason: collision with other inner class name */
        public static final class C6606a implements dagger.internal.u<Application> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.legacy.di.e f219707a;

            public C6606a(com.avito.android.photo_picker.legacy.di.e eVar) {
                this.f219707a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                Application applicationK = this.f219707a.k();
                dagger.internal.t.c(applicationK);
                return applicationK;
            }
        }

        /* compiled from: DaggerPhotoPickerComponent.java */
        public static final class b implements dagger.internal.u<com.avito.android.computer_vision.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.legacy.di.e f219708a;

            public b(com.avito.android.photo_picker.legacy.di.e eVar) {
                this.f219708a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.computer_vision.a aVarG6 = this.f219708a.g6();
                dagger.internal.t.c(aVarG6);
                return aVarG6;
            }
        }

        /* compiled from: DaggerPhotoPickerComponent.java */
        /* renamed from: com.avito.android.photo_picker.legacy.di.a$c$c, reason: collision with other inner class name */
        public static final class C6607c implements dagger.internal.u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.legacy.di.e f219709a;

            public C6607c(com.avito.android.photo_picker.legacy.di.e eVar) {
                this.f219709a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f219709a.g();
            }
        }

        /* compiled from: DaggerPhotoPickerComponent.java */
        public static final class d implements dagger.internal.u<L0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.legacy.di.e f219710a;

            public d(com.avito.android.photo_picker.legacy.di.e eVar) {
                this.f219710a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                L0 l0Z = this.f219710a.z();
                dagger.internal.t.c(l0Z);
                return l0Z;
            }
        }

        /* compiled from: DaggerPhotoPickerComponent.java */
        public static final class e implements dagger.internal.u<InterfaceC30973d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.legacy.di.e f219711a;

            public e(com.avito.android.photo_picker.legacy.di.e eVar) {
                this.f219711a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC30973d interfaceC30973dE4 = this.f219711a.E4();
                dagger.internal.t.c(interfaceC30973dE4);
                return interfaceC30973dE4;
            }
        }

        /* compiled from: DaggerPhotoPickerComponent.java */
        public static final class f implements dagger.internal.u<HM.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.legacy.di.e f219712a;

            public f(com.avito.android.photo_picker.legacy.di.e eVar) {
                this.f219712a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f219712a.d7();
            }
        }

        /* compiled from: DaggerPhotoPickerComponent.java */
        public static final class g implements dagger.internal.u<com.avito.android.photo_cache.b> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.legacy.di.e f219713a;

            public g(com.avito.android.photo_picker.legacy.di.e eVar) {
                this.f219713a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.photo_cache.b bVarF = this.f219713a.F();
                dagger.internal.t.c(bVarF);
                return bVarF;
            }
        }

        /* compiled from: DaggerPhotoPickerComponent.java */
        public static final class h implements dagger.internal.u<b0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.legacy.di.e f219714a;

            public h(com.avito.android.photo_picker.legacy.di.e eVar) {
                this.f219714a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                b0 b0VarZ3 = this.f219714a.Z3();
                dagger.internal.t.c(b0VarZ3);
                return b0VarZ3;
            }
        }

        /* compiled from: DaggerPhotoPickerComponent.java */
        public static final class i implements dagger.internal.u<InterfaceC35863o4> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.legacy.di.e f219715a;

            public i(com.avito.android.photo_picker.legacy.di.e eVar) {
                this.f219715a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35863o4 interfaceC35863o4M = this.f219715a.m();
                dagger.internal.t.c(interfaceC35863o4M);
                return interfaceC35863o4M;
            }
        }

        /* compiled from: DaggerPhotoPickerComponent.java */
        public static final class j implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.photo_picker.legacy.di.e f219716a;

            public j(com.avito.android.photo_picker.legacy.di.e eVar) {
                this.f219716a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f219716a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(com.avito.android.photo_picker.legacy.di.f fVar, com.avito.android.photo_picker.legacy.di.e eVar, PhotoPickerIntentFactory.PhotoPickerMode photoPickerMode, Integer num, Gson gson, C6605a c6605a) {
            this.f219681a = eVar;
            this.f219682b = gson;
            this.f219683c = fVar;
            this.f219684d = dagger.internal.g.d(new n(fVar));
            C6607c c6607c = new C6607c(eVar);
            this.f219685e = c6607c;
            dagger.internal.u<com.avito.android.device_orientation.i> uVarD = dagger.internal.g.d(new com.avito.android.device_orientation.p(c6607c));
            this.f219686f = uVarD;
            dagger.internal.u<com.avito.android.photo_picker.legacy.details_list.i> uVarD2 = dagger.internal.g.d(new l(fVar, uVarD));
            this.f219687g = uVarD2;
            dagger.internal.u<com.avito.android.photo_picker.legacy.details_list.a> uVarD3 = dagger.internal.g.d(new com.avito.android.photo_picker.legacy.di.h(fVar, uVarD2, new k(fVar, new d(eVar))));
            this.f219689i = uVarD3;
            dagger.internal.u<com.avito.konveyor.a> uVarD4 = dagger.internal.g.d(new com.avito.android.photo_picker.legacy.di.i(fVar, uVarD3));
            this.f219690j = uVarD4;
            this.f219691k = dagger.internal.g.d(new w(fVar, uVarD4));
            dagger.internal.f fVar2 = new dagger.internal.f();
            this.f219692l = fVar2;
            dagger.internal.u<com.avito.android.photo_picker.legacy.thumbnail_list.d> uVarD5 = dagger.internal.g.d(new x(fVar, fVar2, this.f219686f));
            this.f219693m = uVarD5;
            dagger.internal.u<TV0.b<com.avito.android.photo_picker.legacy.thumbnail_list.j, com.avito.android.photo_picker.legacy.thumbnail_list.a>> uVarD6 = dagger.internal.g.d(new s(fVar, uVarD5));
            this.f219694n = uVarD6;
            dagger.internal.u<com.avito.konveyor.a> uVarD7 = dagger.internal.g.d(new u(fVar, uVarD6));
            this.f219695o = uVarD7;
            this.f219696p = dagger.internal.g.d(new z(fVar, uVarD7));
            this.f219697q = new g(eVar);
            this.f219698r = com.avito.android.photo_storage.f.a(this.f219685e);
            this.f219699s = C49468b.a(this.f219698r, com.avito.android.photo_storage.h.a(this.f219685e));
            this.f219700t = new C6606a(eVar);
            this.f219701u = dagger.internal.g.d(new com.avito.android.photo_picker.legacy.di.g(fVar, this.f219700t, com.avito.android.photo_storage.k.a(this.f219685e)));
            this.f219702v = dagger.internal.g.d(new t(fVar, this.f219700t));
            this.f219703w = new h(eVar);
            this.f219704x = new b(eVar);
            this.f219705y = new j(eVar);
            this.f219706z = N70.d.a(dagger.internal.l.a(gson));
            dagger.internal.u<Context> uVar = this.f219685e;
            com.avito.android.photo_info.d.f218049b.getClass();
            this.f219669A = dagger.internal.g.d(new o(fVar, this.f219697q, this.f219699s, this.f219701u, this.f219702v, this.f219703w, this.f219704x, this.f219705y, this.f219706z, new com.avito.android.photo_info.d(uVar)));
            dagger.internal.u<com.avito.android.photo_picker.legacy.y> uVarD8 = dagger.internal.g.d(new q(fVar));
            this.f219670B = uVarD8;
            i iVar = new i(eVar);
            this.f219671C = iVar;
            e eVar2 = new e(eVar);
            dagger.internal.u<InterfaceC35745a5> uVar2 = this.f219705y;
            m mVar = new m(fVar, uVar2, eVar2, this.f219697q);
            this.f219673E = mVar;
            dagger.internal.f.a(this.f219692l, dagger.internal.g.d(new p(fVar, this.f219691k, this.f219696p, this.f219669A, this.f219686f, uVar2, uVarD8, this.f219704x, iVar, this.f219703w, mVar, new f(eVar))));
            this.f219675G = dagger.internal.l.a(photoPickerMode);
            this.f219676H = dagger.internal.g.d(new N(this.f219669A, this.f219705y, this.f219703w, this.f219704x, this.f219671C, this.f219673E, this.f219675G, dagger.internal.l.a(num)));
            dagger.internal.u<com.avito.android.recycler.responsive.a> uVarD9 = dagger.internal.g.d(new r(fVar));
            this.f219677I = uVarD9;
            dagger.internal.u<com.avito.android.recycler.responsive.e> uVarD10 = dagger.internal.g.d(new y(fVar, uVarD9, this.f219691k));
            this.f219678J = uVarD10;
            this.f219679K = dagger.internal.g.d(new com.avito.android.photo_picker.legacy.di.j(fVar, uVarD10, this.f219690j));
            this.f219680L = dagger.internal.g.d(new v(fVar, this.f219696p, this.f219695o));
        }

        @Override // com.avito.android.photo_picker.camera.di.b
        public final N70.c B7() {
            return new N70.c(this.f219682b);
        }

        @Override // com.avito.android.photo_picker.camera.di.b
        public final com.avito.android.permissions.x D8() {
            return this.f219684d.get();
        }

        @Override // com.avito.android.photo_picker.gallery.di.c, com.avito.android.photo_picker.camera.di.b
        public final G N() {
            return this.f219681a.N();
        }

        @Override // com.avito.android.photo_picker.edit.di.c
        public final b0 Z3() {
            b0 b0VarZ3 = this.f219681a.Z3();
            dagger.internal.t.c(b0VarZ3);
            return b0VarZ3;
        }

        @Override // com.avito.android.photo_picker.gallery.di.c
        public final InterfaceC28373a a() {
            InterfaceC28373a interfaceC28373aA = this.f219681a.a();
            dagger.internal.t.c(interfaceC28373aA);
            return interfaceC28373aA;
        }

        @Override // com.avito.android.photo_picker.gallery.di.c, com.avito.android.photo_picker.camera.di.b, com.avito.android.photo_picker.edit.di.c
        public final InterfaceC35745a5 d() {
            InterfaceC35745a5 interfaceC35745a5D = this.f219681a.d();
            dagger.internal.t.c(interfaceC35745a5D);
            return interfaceC35745a5D;
        }

        @Override // com.avito.android.photo_picker.edit.di.c
        public final Context g() {
            return this.f219681a.g();
        }

        @Override // com.avito.android.photo_picker.legacy.di.d
        public final void gm(PhotoPickerActivity photoPickerActivity) {
            com.avito.android.photo_picker.legacy.di.e eVar = this.f219681a;
            photoPickerActivity.f218781m = eVar.h();
            photoPickerActivity.f218782n = (InterfaceC33244f) this.f219692l.get();
            photoPickerActivity.f218783o = this.f219669A.get();
            photoPickerActivity.f218784p = this.f219686f.get();
            L0 l0Z = eVar.z();
            dagger.internal.t.c(l0Z);
            this.f219683c.getClass();
            new com.avito.android.photo_picker.legacy.details_list.d(l0Z);
            photoPickerActivity.f218785q = this.f219676H.get();
            photoPickerActivity.f218786r = this.f219679K.get();
            photoPickerActivity.f218787s = this.f219680L.get();
            InterfaceC28373a interfaceC28373aA = eVar.a();
            dagger.internal.t.c(interfaceC28373aA);
            photoPickerActivity.f218788t = interfaceC28373aA;
            u3.l<SimpleTestGroupWithNone> lVarH4 = eVar.H4();
            dagger.internal.t.c(lVarH4);
            photoPickerActivity.f218789u = lVarH4;
            photoPickerActivity.f218790v = new com.avito.android.photo_permission.b(eVar.V());
        }

        @Override // com.avito.android.photo_picker.gallery.di.c
        public final Application k() {
            Application applicationK = this.f219681a.k();
            dagger.internal.t.c(applicationK);
            return applicationK;
        }

        @Override // com.avito.android.photo_picker.edit.di.c
        public final Gson s() {
            return this.f219682b;
        }
    }

    public static d.a a() {
        return new b();
    }
}
