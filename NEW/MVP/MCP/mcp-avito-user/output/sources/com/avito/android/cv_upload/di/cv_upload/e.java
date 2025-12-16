package com.avito.android.cv_upload.di.cv_upload;

import Jt.InterfaceC14244a;
import android.content.Context;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cv_upload.di.cv_upload.a;
import com.avito.android.cv_upload.domain.f;
import com.avito.android.cv_upload.screens.cv_upload.CvUploadActivity;
import com.avito.android.cv_upload.screens.cv_upload.mvi.g;
import com.avito.android.cv_upload.screens.cv_upload.mvi.j;
import com.avito.android.cv_upload.screens.cv_upload.mvi.n;
import com.avito.android.di.module.C30065i;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerCvUploadComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class e {

    /* compiled from: DaggerCvUploadComponent.java */
    public static final class b implements com.avito.android.cv_upload.di.cv_upload.a {

        /* renamed from: a, reason: collision with root package name */
        public final cv.b f131636a;

        /* renamed from: b, reason: collision with root package name */
        public final u<com.avito.android.deeplink_handler.handler.composite.a> f131637b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC14244a> f131638c;

        /* renamed from: d, reason: collision with root package name */
        public final u<Context> f131639d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28373a> f131640e;

        /* renamed from: f, reason: collision with root package name */
        public final g f131641f;

        /* renamed from: g, reason: collision with root package name */
        public final n f131642g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f131643h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C28478k> f131644i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f131645j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.cv_upload.screens.cv_upload.e f131646k;

        /* compiled from: DaggerCvUploadComponent.java */
        public static final class a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cv_upload.di.cv_upload.b f131647a;

            public a(com.avito.android.cv_upload.di.cv_upload.b bVar) {
                this.f131647a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f131647a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerCvUploadComponent.java */
        /* renamed from: com.avito.android.cv_upload.di.cv_upload.e$b$b, reason: collision with other inner class name */
        public static final class C3939b implements u<Context> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cv_upload.di.cv_upload.b f131648a;

            public C3939b(com.avito.android.cv_upload.di.cv_upload.b bVar) {
                this.f131648a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f131648a.g();
            }
        }

        /* compiled from: DaggerCvUploadComponent.java */
        public static final class c implements u<InterfaceC14244a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cv_upload.di.cv_upload.b f131649a;

            public c(com.avito.android.cv_upload.di.cv_upload.b bVar) {
                this.f131649a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14244a interfaceC14244aRd = this.f131649a.Rd();
                t.c(interfaceC14244aRd);
                return interfaceC14244aRd;
            }
        }

        /* compiled from: DaggerCvUploadComponent.java */
        public static final class d implements u<com.avito.android.deeplink_handler.handler.composite.a> {

            /* renamed from: a, reason: collision with root package name */
            public final cv.b f131650a;

            public d(cv.b bVar) {
                this.f131650a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f131650a.u4();
                t.c(aVarU4);
                return aVarU4;
            }
        }

        /* compiled from: DaggerCvUploadComponent.java */
        /* renamed from: com.avito.android.cv_upload.di.cv_upload.e$b$e, reason: collision with other inner class name */
        public static final class C3940e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cv_upload.di.cv_upload.b f131651a;

            public C3940e(com.avito.android.cv_upload.di.cv_upload.b bVar) {
                this.f131651a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cT3 = this.f131651a.t3();
                t.c(interfaceC28481cT3);
                return interfaceC28481cT3;
            }
        }

        public b(com.avito.android.cv_upload.di.cv_upload.b bVar, cv.b bVar2, r rVar, a aVar) {
            this.f131636a = bVar2;
            this.f131637b = new d(bVar2);
            com.avito.android.cv_upload.domain.d dVar = new com.avito.android.cv_upload.domain.d(new c(bVar), com.avito.android.cv_upload.domain.mapper.b.a(), com.avito.android.cv_upload.domain.mapper.d.a());
            f fVar = new f(new C3939b(bVar));
            this.f131641f = new g(this.f131637b, dVar, fVar, new a(bVar));
            this.f131642g = new n(fVar);
            this.f131643h = new C3940e(bVar);
            u<C28478k> uVarD = dagger.internal.g.d(new com.avito.android.cv_upload.di.cv_upload.d(l.a(rVar)));
            this.f131644i = uVarD;
            this.f131645j = dagger.internal.g.d(new C30065i(this.f131643h, uVarD));
            this.f131646k = new com.avito.android.cv_upload.screens.cv_upload.e(new j(this.f131641f, com.avito.android.cv_upload.screens.cv_upload.mvi.l.a(), this.f131642g, this.f131645j));
        }

        @Override // com.avito.android.cv_upload.di.cv_upload.a
        public final void a(CvUploadActivity cvUploadActivity) {
            cvUploadActivity.f131701m = this.f131646k;
            cvUploadActivity.f131703o = this.f131645j.get();
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f131636a.u4();
            t.c(aVarU4);
            cvUploadActivity.f131704p = aVarU4;
        }
    }

    /* compiled from: DaggerCvUploadComponent.java */
    public static final class c implements a.InterfaceC3938a {
        public c() {
        }

        @Override // com.avito.android.cv_upload.di.cv_upload.a.InterfaceC3938a
        public final com.avito.android.cv_upload.di.cv_upload.a a(r rVar, com.avito.android.cv_upload.di.cv_upload.b bVar, InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            return new b(bVar, interfaceC39417a, rVar, null);
        }
    }

    public static a.InterfaceC3938a a() {
        return new c();
    }
}
