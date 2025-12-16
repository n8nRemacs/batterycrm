package com.avito.android.safety.password_setting.di;

import android.app.Activity;
import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import com.avito.android.account.G;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.credman.o;
import com.avito.android.remote.InterfaceC34401z0;
import com.avito.android.safety.password_setting.PasswordSettingFragment;
import com.avito.android.safety.password_setting.di.b;
import com.avito.android.safety.password_setting.m;
import com.avito.android.safety.password_setting.mvi.i;
import com.avito.android.safety.password_setting.mvi.k;
import com.avito.android.safety.password_setting.mvi.m;
import com.avito.android.safety.password_setting.n;
import com.avito.android.util.Kundle;
import cv.InterfaceC39417a;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerPasswordSettingComponent.java */
@dagger.internal.e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerPasswordSettingComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.safety.password_setting.di.b.a
        public final com.avito.android.safety.password_setting.di.b a(com.avito.android.safety.password_setting.di.c cVar, InterfaceC39417a interfaceC39417a, ActivityC22955m activityC22955m, r rVar, Resources resources, Kundle kundle) {
            interfaceC39417a.getClass();
            return new c(new d(), cVar, interfaceC39417a, activityC22955m, rVar, resources, kundle, null);
        }
    }

    /* compiled from: DaggerPasswordSettingComponent.java */
    public static final class c implements com.avito.android.safety.password_setting.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.safety.password_setting.di.c f257436a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28481c> f257437b;

        /* renamed from: c, reason: collision with root package name */
        public final u<C28478k> f257438c;

        /* renamed from: d, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f257439d;

        /* renamed from: e, reason: collision with root package name */
        public final u<G> f257440e;

        /* renamed from: f, reason: collision with root package name */
        public final u<B3.c> f257441f;

        /* renamed from: g, reason: collision with root package name */
        public final u<B3.a> f257442g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC34401z0> f257443h;

        /* renamed from: i, reason: collision with root package name */
        public final u<o> f257444i;

        /* renamed from: j, reason: collision with root package name */
        public final l f257445j;

        /* compiled from: DaggerPasswordSettingComponent.java */
        /* renamed from: com.avito.android.safety.password_setting.di.a$c$a, reason: collision with other inner class name */
        public static final class C7727a implements u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.password_setting.di.c f257446a;

            public C7727a(com.avito.android.safety.password_setting.di.c cVar) {
                this.f257446a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                G gW2 = this.f257446a.w();
                t.c(gW2);
                return gW2;
            }
        }

        /* compiled from: DaggerPasswordSettingComponent.java */
        public static final class b implements u<o> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.password_setting.di.c f257447a;

            public b(com.avito.android.safety.password_setting.di.c cVar) {
                this.f257447a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f257447a.P2();
            }
        }

        /* compiled from: DaggerPasswordSettingComponent.java */
        /* renamed from: com.avito.android.safety.password_setting.di.a$c$c, reason: collision with other inner class name */
        public static final class C7728c implements u<B3.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.password_setting.di.c f257448a;

            public C7728c(com.avito.android.safety.password_setting.di.c cVar) {
                this.f257448a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f257448a.O2();
            }
        }

        /* compiled from: DaggerPasswordSettingComponent.java */
        public static final class d implements u<InterfaceC34401z0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.password_setting.di.c f257449a;

            public d(com.avito.android.safety.password_setting.di.c cVar) {
                this.f257449a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34401z0 interfaceC34401z0B = this.f257449a.B();
                t.c(interfaceC34401z0B);
                return interfaceC34401z0B;
            }
        }

        /* compiled from: DaggerPasswordSettingComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.password_setting.di.c f257450a;

            public e(com.avito.android.safety.password_setting.di.c cVar) {
                this.f257450a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f257450a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerPasswordSettingComponent.java */
        public static final class f implements u<B3.c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.safety.password_setting.di.c f257451a;

            public f(com.avito.android.safety.password_setting.di.c cVar) {
                this.f257451a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f257451a.md();
            }
        }

        public c(com.avito.android.safety.password_setting.di.d dVar, com.avito.android.safety.password_setting.di.c cVar, cv.b bVar, Activity activity, r rVar, Resources resources, Kundle kundle, C7726a c7726a) {
            this.f257436a = cVar;
            this.f257437b = new e(cVar);
            u<C28478k> uVarD = g.d(new com.avito.android.safety.password_setting.di.e(dVar, l.a(rVar)));
            this.f257438c = uVarD;
            this.f257439d = com.avito.android.advert.item.delivery_suggests.l.i(this.f257437b, uVarD);
            C7727a c7727a = new C7727a(cVar);
            com.avito.android.safety.password_setting.l lVar = new com.avito.android.safety.password_setting.l(new com.avito.android.safety.common.d(c7727a, new f(cVar), new C7728c(cVar)), c7727a, new d(cVar));
            this.f257445j = l.a(new com.avito.android.safety.password_setting.o(new n(new i(new com.avito.android.safety.password_setting.mvi.f(lVar), new com.avito.android.safety.password_setting.mvi.d(new b(cVar), lVar), k.a(), this.f257439d, m.a()))));
        }

        @Override // com.avito.android.safety.password_setting.di.b
        public final void a(PasswordSettingFragment passwordSettingFragment) {
            passwordSettingFragment.f257420n0 = this.f257436a.x();
            passwordSettingFragment.f257421o0 = this.f257439d.get();
            passwordSettingFragment.f257422p0 = (m.a) this.f257445j.f393949a;
        }
    }

    public static b.a a() {
        return new b();
    }
}
