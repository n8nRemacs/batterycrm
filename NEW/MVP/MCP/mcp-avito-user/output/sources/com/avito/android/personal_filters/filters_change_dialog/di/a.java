package com.avito.android.personal_filters.filters_change_dialog.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.personal_filters.filters_change_dialog.PersonalFiltersChangeDialogFragment;
import com.avito.android.personal_filters.filters_change_dialog.di.b;
import com.avito.android.personal_filters.filters_change_dialog.h;
import com.avito.android.personal_filters.filters_change_dialog.mvi.f;
import com.avito.android.personal_filters.filters_change_dialog.mvi.k;
import com.avito.android.personal_filters.filters_change_dialog.mvi.m;
import com.avito.android.util.R0;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import e70.InterfaceC39961a;
import e70.g;
import e70.i;

/* compiled from: DaggerPersonalFiltersChangeDialogComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerPersonalFiltersChangeDialogComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.personal_filters.filters_change_dialog.di.b.a
        public final com.avito.android.personal_filters.filters_change_dialog.di.b a(com.avito.android.personal_filters.filters_change_dialog.di.c cVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, null);
        }
    }

    /* compiled from: DaggerPersonalFiltersChangeDialogComponent.java */
    public static final class c implements com.avito.android.personal_filters.filters_change_dialog.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<e70.d> f215720a;

        /* renamed from: b, reason: collision with root package name */
        public final u<g> f215721b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC28373a> f215722c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC39961a> f215723d;

        /* renamed from: e, reason: collision with root package name */
        public final u<R0> f215724e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f215725f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.personal_filters.filters_change_dialog.g> f215726g;

        /* compiled from: DaggerPersonalFiltersChangeDialogComponent.java */
        /* renamed from: com.avito.android.personal_filters.filters_change_dialog.di.a$c$a, reason: collision with other inner class name */
        public static final class C6465a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.personal_filters.filters_change_dialog.di.c f215727a;

            public C6465a(com.avito.android.personal_filters.filters_change_dialog.di.c cVar) {
                this.f215727a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f215727a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerPersonalFiltersChangeDialogComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f215728a;

            public b(cv.b bVar) {
                this.f215728a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f215728a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerPersonalFiltersChangeDialogComponent.java */
        /* renamed from: com.avito.android.personal_filters.filters_change_dialog.di.a$c$c, reason: collision with other inner class name */
        public static final class C6466c implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.personal_filters.filters_change_dialog.di.c f215729a;

            public C6466c(com.avito.android.personal_filters.filters_change_dialog.di.c cVar) {
                this.f215729a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0I0 = this.f215729a.i0();
                t.c(r0I0);
                return r0I0;
            }
        }

        /* compiled from: DaggerPersonalFiltersChangeDialogComponent.java */
        public static final class d implements u<e70.d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.personal_filters.filters_change_dialog.di.c f215730a;

            public d(com.avito.android.personal_filters.filters_change_dialog.di.c cVar) {
                this.f215730a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                e70.d dVarIf = this.f215730a.If();
                t.c(dVarIf);
                return dVarIf;
            }
        }

        public c(com.avito.android.personal_filters.filters_change_dialog.di.c cVar, cv.b bVar, C6464a c6464a) {
            this.f215721b = dagger.internal.g.d(new i(new d(cVar)));
            u<InterfaceC39961a> uVarD = dagger.internal.g.d(new e70.c(new C6465a(cVar)));
            this.f215723d = uVarD;
            this.f215726g = dagger.internal.g.d(new h(new com.avito.android.personal_filters.filters_change_dialog.mvi.i(new f(uVarD, this.f215721b, new C6466c(cVar), new b(bVar)), m.a(), k.a())));
        }

        @Override // com.avito.android.personal_filters.filters_change_dialog.di.b
        public final void a(PersonalFiltersChangeDialogFragment personalFiltersChangeDialogFragment) {
            personalFiltersChangeDialogFragment.f215705i0 = this.f215726g;
        }
    }

    public static b.a a() {
        return new b();
    }
}
