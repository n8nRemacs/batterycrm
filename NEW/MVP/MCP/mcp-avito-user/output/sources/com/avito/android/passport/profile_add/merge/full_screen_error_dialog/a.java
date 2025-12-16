package com.avito.android.passport.profile_add.merge.full_screen_error_dialog;

import Cd.D;
import Cd.F;
import androidx.fragment.app.Fragment;
import androidx.view.M0;
import androidx.view.S0;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.passport.profile_add.merge.full_screen_error_dialog.b;
import dagger.internal.B;
import dagger.internal.q;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerFullScreenUserDialogComponent.java */
@dagger.internal.e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerFullScreenUserDialogComponent.java */
    public static final class b implements b.a {
        public b() {
        }
    }

    /* compiled from: DaggerFullScreenUserDialogComponent.java */
    public static final class c implements com.avito.android.passport.profile_add.merge.full_screen_error_dialog.b {

        /* renamed from: a, reason: collision with root package name */
        public final dagger.internal.l f213060a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f213061b;

        /* renamed from: c, reason: collision with root package name */
        public final u<M0> f213062c;

        /* renamed from: d, reason: collision with root package name */
        public final u<D> f213063d;

        /* renamed from: e, reason: collision with root package name */
        public final u<k> f213064e;

        /* renamed from: f, reason: collision with root package name */
        public final u<InterfaceC28481c> f213065f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C28478k> f213066g;

        /* renamed from: h, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f213067h;

        /* compiled from: DaggerFullScreenUserDialogComponent.java */
        /* renamed from: com.avito.android.passport.profile_add.merge.full_screen_error_dialog.a$c$a, reason: collision with other inner class name */
        public static final class C6377a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f213068a;

            public C6377a(cv.b bVar) {
                this.f213068a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f213068a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerFullScreenUserDialogComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.passport.profile_add.merge.full_screen_error_dialog.c f213069a;

            public b(com.avito.android.passport.profile_add.merge.full_screen_error_dialog.c cVar) {
                this.f213069a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f213069a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.passport.profile_add.merge.full_screen_error_dialog.c cVar, cv.b bVar, r rVar, S0 s02, Fragment fragment, C6376a c6376a) {
            this.f213060a = dagger.internal.l.a(s02);
            this.f213062c = dagger.internal.g.d(new m(new C6377a(bVar)));
            q.b bVarA = q.a(1);
            bVarA.a(l.class, this.f213062c);
            u<D> uVarA = B.a(new F(bVarA.b()));
            this.f213063d = uVarA;
            this.f213064e = dagger.internal.g.d(new h(this.f213060a, uVarA));
            this.f213065f = new b(cVar);
            u<C28478k> uVarD = dagger.internal.g.d(new j(dagger.internal.l.a(rVar)));
            this.f213066g = uVarD;
            this.f213067h = com.avito.android.advert.item.delivery_suggests.l.i(this.f213065f, uVarD);
        }
    }
}
