package com.avito.android.support_bottom_sheet.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.t1;
import com.avito.android.support_bottom_sheet.di.b;
import com.avito.android.support_bottom_sheet.mvi.f;
import com.avito.android.support_bottom_sheet.mvi.i;
import com.avito.android.support_bottom_sheet.mvi.k;
import com.avito.android.support_bottom_sheet.mvi.m;
import com.avito.android.support_bottom_sheet.mvi.o;
import com.avito.android.support_bottom_sheet.ui.SupportDialogFragment;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerSupportBottomSheetComponent.java */
@e
/* loaded from: classes4.dex */
public final class a {

    /* compiled from: DaggerSupportBottomSheetComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.support_bottom_sheet.di.b.a
        public final com.avito.android.support_bottom_sheet.di.b a(d dVar, InterfaceC39417a interfaceC39417a, String str, String str2, String str3, String str4, String str5, String str6, Long l12, Y41.a aVar, Y41.a aVar2) {
            interfaceC39417a.getClass();
            return new c(dVar, interfaceC39417a, str, str2, str3, str4, str5, str6, l12, aVar, aVar2, null);
        }
    }

    /* compiled from: DaggerSupportBottomSheetComponent.java */
    public static final class c implements com.avito.android.support_bottom_sheet.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f292403a;

        /* renamed from: b, reason: collision with root package name */
        public final u<ZG.a> f292404b;

        /* renamed from: c, reason: collision with root package name */
        public final u<t1> f292405c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f292406d;

        /* renamed from: e, reason: collision with root package name */
        public final l f292407e;

        /* renamed from: f, reason: collision with root package name */
        public final l f292408f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.support_bottom_sheet.domain.b f292409g;

        /* renamed from: h, reason: collision with root package name */
        public final f f292410h;

        /* renamed from: i, reason: collision with root package name */
        public final l f292411i;

        /* renamed from: j, reason: collision with root package name */
        public final l f292412j;

        /* renamed from: k, reason: collision with root package name */
        public final l f292413k;

        /* renamed from: l, reason: collision with root package name */
        public final l f292414l;

        /* renamed from: m, reason: collision with root package name */
        public final l f292415m;

        /* renamed from: n, reason: collision with root package name */
        public final l f292416n;

        /* renamed from: o, reason: collision with root package name */
        public final o f292417o;

        /* compiled from: DaggerSupportBottomSheetComponent.java */
        /* renamed from: com.avito.android.support_bottom_sheet.di.a$c$a, reason: collision with other inner class name */
        public static final class C8869a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.support_bottom_sheet.di.d f292418a;

            public C8869a(com.avito.android.support_bottom_sheet.di.d dVar) {
                this.f292418a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f292418a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSupportBottomSheetComponent.java */
        public static final class b implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f292419a;

            public b(cv.b bVar) {
                this.f292419a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f292419a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerSupportBottomSheetComponent.java */
        /* renamed from: com.avito.android.support_bottom_sheet.di.a$c$c, reason: collision with other inner class name */
        public static final class C8870c implements u<ZG.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.support_bottom_sheet.di.d f292420a;

            public C8870c(com.avito.android.support_bottom_sheet.di.d dVar) {
                this.f292420a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                ZG.a aVarNa = this.f292420a.Na();
                t.c(aVarNa);
                return aVarNa;
            }
        }

        /* compiled from: DaggerSupportBottomSheetComponent.java */
        public static final class d implements u<t1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.support_bottom_sheet.di.d f292421a;

            public d(com.avito.android.support_bottom_sheet.di.d dVar) {
                this.f292421a = dVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f292421a.u7();
            }
        }

        public c() {
            throw null;
        }

        public c(com.avito.android.support_bottom_sheet.di.d dVar, cv.b bVar, String str, String str2, String str3, String str4, String str5, String str6, Long l12, Y41.a aVar, Y41.a aVar2, C8868a c8868a) {
            this.f292403a = new b(bVar);
            this.f292404b = new C8870c(dVar);
            this.f292405c = new d(dVar);
            this.f292406d = new C8869a(dVar);
            this.f292407e = l.a(str6);
            l lVarB = l.b(l12);
            this.f292408f = lVarB;
            this.f292409g = new com.avito.android.support_bottom_sheet.domain.b(this.f292407e, lVarB, this.f292404b, this.f292405c, this.f292406d);
            this.f292410h = new f(this.f292403a, this.f292409g, this.f292406d, l.a(str5), this.f292408f);
            this.f292411i = l.a(str);
            this.f292412j = l.b(str2);
            this.f292413k = l.a(str3);
            this.f292414l = l.b(str4);
            this.f292415m = l.a(aVar);
            this.f292416n = l.a(aVar2);
            this.f292417o = new o(new i(this.f292410h, k.a(), m.a(), this.f292411i, this.f292412j, this.f292413k, this.f292414l, this.f292415m, this.f292416n));
        }

        @Override // com.avito.android.support_bottom_sheet.di.b
        public final void a(SupportDialogFragment supportDialogFragment) {
            supportDialogFragment.f292498h0 = this.f292417o;
        }
    }

    public static b.a a() {
        return new b();
    }
}
