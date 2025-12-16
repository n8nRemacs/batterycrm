package com.avito.android.silent_update.permissions.di;

import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.silent_update.permissions.PermissionsActivity;
import com.avito.android.silent_update.permissions.di.b;
import com.avito.android.silent_update.permissions.h;
import com.avito.android.silent_update.permissions.j;
import com.avito.android.silent_update.permissions.k;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPermissionsActivityComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerPermissionsActivityComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.silent_update.permissions.di.b.a
        public final com.avito.android.silent_update.permissions.di.b a(k kVar, C28478k c28478k, String str) {
            return new c(kVar, c28478k, str, null);
        }
    }

    /* compiled from: DaggerPermissionsActivityComponent.java */
    public static final class c implements com.avito.android.silent_update.permissions.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<Context> f283701a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.permissions.u> f283702b;

        /* renamed from: c, reason: collision with root package name */
        public final j f283703c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28373a> f283704d;

        /* renamed from: e, reason: collision with root package name */
        public final Ew0.d f283705e;

        /* renamed from: f, reason: collision with root package name */
        public final h f283706f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC28481c> f283707g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f283708h;

        /* compiled from: DaggerPermissionsActivityComponent.java */
        /* renamed from: com.avito.android.silent_update.permissions.di.a$c$a, reason: collision with other inner class name */
        public static final class C8459a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final k f283709a;

            public C8459a(k kVar) {
                this.f283709a = kVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aP2 = this.f283709a.p2();
                t.c(interfaceC28373aP2);
                return interfaceC28373aP2;
            }
        }

        /* compiled from: DaggerPermissionsActivityComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final k f283710a;

            public b(k kVar) {
                this.f283710a = kVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cDm = this.f283710a.dm();
                t.c(interfaceC28481cDm);
                return interfaceC28481cDm;
            }
        }

        /* compiled from: DaggerPermissionsActivityComponent.java */
        /* renamed from: com.avito.android.silent_update.permissions.di.a$c$c, reason: collision with other inner class name */
        public static final class C8460c implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final k f283711a;

            public C8460c(k kVar) {
                this.f283711a = kVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f283711a.Wc();
            }
        }

        /* compiled from: DaggerPermissionsActivityComponent.java */
        public static final class d implements u<com.avito.android.permissions.u> {

            /* renamed from: a, reason: collision with root package name */
            public final k f283712a;

            public d(k kVar) {
                this.f283712a = kVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f283712a.y8();
            }
        }

        public c(k kVar, C28478k c28478k, String str, C8458a c8458a) {
            this.f283703c = new j(new C8460c(kVar), new d(kVar));
            this.f283705e = new Ew0.d(new C8459a(kVar));
            this.f283706f = new h(new com.avito.android.silent_update.permissions.mvi.h(new com.avito.android.silent_update.permissions.mvi.e(this.f283703c, this.f283705e, l.b(str)), com.avito.android.silent_update.permissions.mvi.b.a(), com.avito.android.silent_update.permissions.mvi.j.a()));
            this.f283707g = new b(kVar);
            this.f283708h = g.d(new com.avito.android.silent_update.permissions.di.d(l.a(c28478k), this.f283707g));
        }

        @Override // com.avito.android.silent_update.permissions.di.b
        public final void a(PermissionsActivity permissionsActivity) {
            permissionsActivity.f283679m = this.f283706f;
            permissionsActivity.f283681o = this.f283708h.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
