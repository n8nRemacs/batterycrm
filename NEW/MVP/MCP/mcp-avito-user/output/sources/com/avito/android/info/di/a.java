package com.avito.android.info.di;

import android.os.Bundle;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.info.di.b;
import com.avito.android.info.ui.InfoActivity;
import com.avito.android.info.ui.h;
import com.avito.android.remote.InterfaceC34322j0;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.e;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import hD.C40806a;
import xN.C49867c;
import xN.InterfaceC49865a;

/* compiled from: DaggerInfoActivityComponent.java */
@e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerInfoActivityComponent.java */
    public static final class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        public com.avito.android.info.di.c f170938a;

        /* renamed from: b, reason: collision with root package name */
        public String f170939b;

        /* renamed from: c, reason: collision with root package name */
        public String f170940c;

        /* renamed from: d, reason: collision with root package name */
        public Bundle f170941d;

        public b() {
        }

        @Override // com.avito.android.info.di.b.a
        public final b.a a(String str) {
            str.getClass();
            this.f170939b = str;
            return this;
        }

        @Override // com.avito.android.info.di.b.a
        public final b.a b(String str) {
            str.getClass();
            this.f170940c = str;
            return this;
        }

        @Override // com.avito.android.info.di.b.a
        public final com.avito.android.info.di.b build() {
            t.a(com.avito.android.info.di.c.class, this.f170938a);
            t.a(String.class, this.f170939b);
            t.a(String.class, this.f170940c);
            return new c(this.f170938a, this.f170939b, this.f170940c, this.f170941d, null);
        }

        @Override // com.avito.android.info.di.b.a
        public final b.a c(Bundle bundle) {
            this.f170941d = bundle;
            return this;
        }

        @Override // com.avito.android.info.di.b.a
        public final b.a d(com.avito.android.info.di.c cVar) {
            this.f170938a = cVar;
            return this;
        }
    }

    /* compiled from: DaggerInfoActivityComponent.java */
    public static final class c implements com.avito.android.info.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.info.di.c f170942a;

        /* renamed from: b, reason: collision with root package name */
        public final l f170943b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC34322j0> f170944c;

        /* renamed from: d, reason: collision with root package name */
        public final u<C40806a> f170945d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC49865a> f170946e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC35745a5> f170947f;

        /* renamed from: g, reason: collision with root package name */
        public final u<com.avito.android.info.ui.c> f170948g;

        /* compiled from: DaggerInfoActivityComponent.java */
        /* renamed from: com.avito.android.info.di.a$c$a, reason: collision with other inner class name */
        public static final class C5062a implements u<C40806a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.info.di.c f170949a;

            public C5062a(com.avito.android.info.di.c cVar) {
                this.f170949a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f170949a.R();
            }
        }

        /* compiled from: DaggerInfoActivityComponent.java */
        public static final class b implements u<InterfaceC34322j0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.info.di.c f170950a;

            public b(com.avito.android.info.di.c cVar) {
                this.f170950a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34322j0 interfaceC34322j0H8 = this.f170950a.h8();
                t.c(interfaceC34322j0H8);
                return interfaceC34322j0H8;
            }
        }

        /* compiled from: DaggerInfoActivityComponent.java */
        /* renamed from: com.avito.android.info.di.a$c$c, reason: collision with other inner class name */
        public static final class C5063c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.info.di.c f170951a;

            public C5063c(com.avito.android.info.di.c cVar) {
                this.f170951a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f170951a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(com.avito.android.info.di.c cVar, String str, String str2, Bundle bundle, C5061a c5061a) {
            this.f170942a = cVar;
            this.f170943b = l.a(str);
            this.f170944c = new b(cVar);
            this.f170946e = g.d(new C49867c(l.a(str2), this.f170944c, new C5062a(cVar)));
            this.f170947f = new C5063c(cVar);
            this.f170948g = g.d(new h(this.f170943b, l.b(bundle), this.f170946e, this.f170947f));
        }

        @Override // com.avito.android.info.di.b
        public final void a(InfoActivity infoActivity) {
            infoActivity.f170952m = this.f170948g.get();
            InterfaceC28373a interfaceC28373aA = this.f170942a.a();
            t.c(interfaceC28373aA);
            infoActivity.f170953n = interfaceC28373aA;
        }
    }

    public static b.a a() {
        return new b();
    }
}
