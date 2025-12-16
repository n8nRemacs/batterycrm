package com.avito.android.advert.notes.di;

import com.avito.android.advert.notes.EditAdvertNoteActivity;
import com.avito.android.advert.notes.di.a;
import com.avito.android.advert.notes.i;
import com.avito.android.advert.notes.j;
import com.avito.android.favorite.h;
import com.avito.android.remote.error.f;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import fa.InterfaceC40383a;

/* compiled from: DaggerAdvertDetailsNoteComponent.java */
@e
/* loaded from: classes10.dex */
public final class d {

    /* compiled from: DaggerAdvertDetailsNoteComponent.java */
    public static final class b implements com.avito.android.advert.notes.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final l f80884a;

        /* renamed from: b, reason: collision with root package name */
        public final l f80885b;

        /* renamed from: c, reason: collision with root package name */
        public final l f80886c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC40383a> f80887d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC35745a5> f80888e;

        /* renamed from: f, reason: collision with root package name */
        public final u<f> f80889f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.advert.notes.c> f80890g;

        /* renamed from: h, reason: collision with root package name */
        public final u<h> f80891h;

        /* renamed from: i, reason: collision with root package name */
        public final l f80892i;

        /* renamed from: j, reason: collision with root package name */
        public final l f80893j;

        /* renamed from: k, reason: collision with root package name */
        public final u<j> f80894k;

        /* compiled from: DaggerAdvertDetailsNoteComponent.java */
        public static final class a implements u<InterfaceC40383a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert.notes.di.b f80895a;

            public a(com.avito.android.advert.notes.di.b bVar) {
                this.f80895a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC40383a interfaceC40383aD2 = this.f80895a.d2();
                t.c(interfaceC40383aD2);
                return interfaceC40383aD2;
            }
        }

        /* compiled from: DaggerAdvertDetailsNoteComponent.java */
        /* renamed from: com.avito.android.advert.notes.di.d$b$b, reason: collision with other inner class name */
        public static final class C2398b implements u<h> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert.notes.di.b f80896a;

            public C2398b(com.avito.android.advert.notes.di.b bVar) {
                this.f80896a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f80896a.P0();
            }
        }

        /* compiled from: DaggerAdvertDetailsNoteComponent.java */
        public static final class c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert.notes.di.b f80897a;

            public c(com.avito.android.advert.notes.di.b bVar) {
                this.f80897a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f80897a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerAdvertDetailsNoteComponent.java */
        /* renamed from: com.avito.android.advert.notes.di.d$b$d, reason: collision with other inner class name */
        public static final class C2399d implements u<f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.advert.notes.di.b f80898a;

            public C2399d(com.avito.android.advert.notes.di.b bVar) {
                this.f80898a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f80898a.o();
            }
        }

        public b(com.avito.android.advert.notes.di.b bVar, String str, ContactBarData contactBarData, String str2, Boolean bool, Boolean bool2, String str3, a aVar) {
            this.f80884a = l.a(str);
            this.f80885b = l.b(contactBarData);
            this.f80886c = l.a(str2);
            a aVar2 = new a(bVar);
            c cVar = new c(bVar);
            this.f80888e = cVar;
            this.f80890g = g.d(new i(aVar2, cVar, new C2399d(bVar)));
            this.f80891h = new C2398b(bVar);
            this.f80892i = l.a(bool);
            this.f80893j = l.a(bool2);
            this.f80894k = g.d(new com.avito.android.advert.notes.u(this.f80884a, this.f80885b, this.f80886c, this.f80890g, this.f80888e, this.f80891h, this.f80892i, this.f80893j, l.b(str3)));
        }

        @Override // com.avito.android.advert.notes.di.a
        public final void a(EditAdvertNoteActivity editAdvertNoteActivity) {
            editAdvertNoteActivity.f80877m = this.f80894k.get();
        }
    }

    /* compiled from: DaggerAdvertDetailsNoteComponent.java */
    public static final class c implements a.InterfaceC2396a {

        /* renamed from: a, reason: collision with root package name */
        public String f80899a;

        /* renamed from: b, reason: collision with root package name */
        public ContactBarData f80900b;

        /* renamed from: c, reason: collision with root package name */
        public String f80901c;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f80902d;

        /* renamed from: e, reason: collision with root package name */
        public Boolean f80903e;

        /* renamed from: f, reason: collision with root package name */
        public String f80904f;

        /* renamed from: g, reason: collision with root package name */
        public com.avito.android.advert.notes.di.b f80905g;

        public c() {
        }

        @Override // com.avito.android.advert.notes.di.a.InterfaceC2396a
        public final a.InterfaceC2396a a(String str) {
            this.f80901c = str;
            return this;
        }

        @Override // com.avito.android.advert.notes.di.a.InterfaceC2396a
        public final a.InterfaceC2396a b(boolean z12) {
            this.f80903e = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.advert.notes.di.a.InterfaceC2396a
        public final com.avito.android.advert.notes.di.a build() {
            t.a(String.class, this.f80899a);
            t.a(String.class, this.f80901c);
            t.a(Boolean.class, this.f80902d);
            t.a(Boolean.class, this.f80903e);
            t.a(com.avito.android.advert.notes.di.b.class, this.f80905g);
            return new b(this.f80905g, this.f80899a, this.f80900b, this.f80901c, this.f80902d, this.f80903e, this.f80904f, null);
        }

        @Override // com.avito.android.advert.notes.di.a.InterfaceC2396a
        public final a.InterfaceC2396a c(ContactBarData contactBarData) {
            this.f80900b = contactBarData;
            return this;
        }

        @Override // com.avito.android.advert.notes.di.a.InterfaceC2396a
        public final a.InterfaceC2396a d(boolean z12) {
            this.f80902d = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.advert.notes.di.a.InterfaceC2396a
        public final a.InterfaceC2396a e(com.avito.android.advert.notes.di.b bVar) {
            this.f80905g = bVar;
            return this;
        }

        @Override // com.avito.android.advert.notes.di.a.InterfaceC2396a
        public final a.InterfaceC2396a n(String str) {
            this.f80904f = str;
            return this;
        }

        @Override // com.avito.android.advert.notes.di.a.InterfaceC2396a
        public final a.InterfaceC2396a r(String str) {
            str.getClass();
            this.f80899a = str;
            return this;
        }
    }

    public static a.InterfaceC2396a a() {
        return new c();
    }
}
