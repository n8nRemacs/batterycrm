package com.avito.android.motivation_screen.di;

import com.avito.android.motivation_screen.di.b;
import com.avito.android.motivation_screen.domain.d;
import com.avito.android.motivation_screen.mvi.g;
import com.avito.android.motivation_screen.mvi.j;
import com.avito.android.motivation_screen.mvi.n;
import com.avito.android.motivation_screen.mvi.p;
import com.avito.android.motivation_screen.mvi.r;
import com.avito.android.motivation_screen.ui.MotivationActivity;
import cv.InterfaceC39417a;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerMotivationComponent.java */
@e
/* loaded from: classes15.dex */
public final class a {

    /* compiled from: DaggerMotivationComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.motivation_screen.di.b.a
        public final com.avito.android.motivation_screen.di.b a(String str, com.avito.android.motivation_screen.di.c cVar, InterfaceC39417a interfaceC39417a) {
            str.getClass();
            interfaceC39417a.getClass();
            return new c(cVar, interfaceC39417a, str, null);
        }
    }

    /* compiled from: DaggerMotivationComponent.java */
    public static final class c implements com.avito.android.motivation_screen.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f206289a;

        /* renamed from: b, reason: collision with root package name */
        public final u<WF.a> f206290b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.motivation_screen.domain.a> f206291c;

        /* renamed from: d, reason: collision with root package name */
        public final p f206292d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.motivation_screen.mvi.e f206293e;

        /* renamed from: f, reason: collision with root package name */
        public final n f206294f;

        /* renamed from: g, reason: collision with root package name */
        public final g f206295g;

        /* renamed from: h, reason: collision with root package name */
        public final r f206296h;

        /* compiled from: DaggerMotivationComponent.java */
        /* renamed from: com.avito.android.motivation_screen.di.a$c$a, reason: collision with other inner class name */
        public static final class C6145a implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f206297a;

            public C6145a(cv.b bVar) {
                this.f206297a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f206297a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerMotivationComponent.java */
        public static final class b implements u<WF.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.motivation_screen.di.c f206298a;

            public b(com.avito.android.motivation_screen.di.c cVar) {
                this.f206298a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                WF.a aVarH9 = this.f206298a.h9();
                t.c(aVarH9);
                return aVarH9;
            }
        }

        public c(com.avito.android.motivation_screen.di.c cVar, cv.b bVar, String str, C6144a c6144a) {
            this.f206289a = new C6145a(bVar);
            this.f206290b = new b(cVar);
            u<com.avito.android.motivation_screen.domain.a> uVarD = dagger.internal.g.d(new com.avito.android.motivation_screen.domain.b(this.f206290b, l.a(str), d.a()));
            this.f206291c = uVarD;
            p pVar = new p(uVarD);
            this.f206292d = pVar;
            this.f206293e = new com.avito.android.motivation_screen.mvi.e(this.f206289a, pVar);
            this.f206294f = new n(com.avito.android.motivation_screen.mvi.b.a());
            this.f206295g = new g(this.f206292d);
            this.f206296h = new r(new j(this.f206293e, com.avito.android.motivation_screen.mvi.l.a(), this.f206294f, this.f206295g));
        }

        @Override // com.avito.android.motivation_screen.di.b
        public final void a(MotivationActivity motivationActivity) {
            motivationActivity.f206396m = this.f206296h;
        }
    }

    public static b.a a() {
        return new b();
    }
}
