package com.avito.android.cv_actualization.view.code_input.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cv_actualization.view.code_input.JsxCvActualizationCodeInputFragment;
import com.avito.android.cv_actualization.view.code_input.di.b;
import com.avito.android.cv_actualization.view.code_input.mvi.i;
import com.avito.android.cv_actualization.view.code_input.mvi.k;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.B;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerJsxCvActualizationCodeInputComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerJsxCvActualizationCodeInputComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.cv_actualization.view.code_input.di.b.a
        public final com.avito.android.cv_actualization.view.code_input.di.b a(com.avito.android.cv_actualization.view.code_input.di.c cVar, JsxCvActualizationCodeInputFragment jsxCvActualizationCodeInputFragment, Resources resources, String str, long j12, r rVar) {
            str.getClass();
            return new c(cVar, jsxCvActualizationCodeInputFragment, resources, str, Long.valueOf(j12), rVar, null);
        }
    }

    /* compiled from: DaggerJsxCvActualizationCodeInputComponent.java */
    public static final class c implements com.avito.android.cv_actualization.view.code_input.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final l f131149a;

        /* renamed from: b, reason: collision with root package name */
        public final u<DP.a> f131150b;

        /* renamed from: c, reason: collision with root package name */
        public final u<com.avito.android.cv_actualization.view.code_input.e> f131151c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC35745a5> f131152d;

        /* renamed from: e, reason: collision with root package name */
        public final u<com.avito.android.code_confirmation.code_confirmation.timer.a> f131153e;

        /* renamed from: f, reason: collision with root package name */
        public final u<com.avito.android.cv_actualization.view.code_input.mvi.domain.c> f131154f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.cv_actualization.view.code_input.mvi.b f131155g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f131156h;

        /* renamed from: i, reason: collision with root package name */
        public final u<C28478k> f131157i;

        /* renamed from: j, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f131158j;

        /* renamed from: k, reason: collision with root package name */
        public final com.avito.android.cv_actualization.view.code_input.mvi.d f131159k;

        /* renamed from: l, reason: collision with root package name */
        public final rt.b f131160l;

        /* compiled from: DaggerJsxCvActualizationCodeInputComponent.java */
        /* renamed from: com.avito.android.cv_actualization.view.code_input.di.a$c$a, reason: collision with other inner class name */
        public static final class C3904a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cv_actualization.view.code_input.di.c f131161a;

            public C3904a(com.avito.android.cv_actualization.view.code_input.di.c cVar) {
                this.f131161a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f131161a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerJsxCvActualizationCodeInputComponent.java */
        public static final class b implements u<DP.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cv_actualization.view.code_input.di.c f131162a;

            public b(com.avito.android.cv_actualization.view.code_input.di.c cVar) {
                this.f131162a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                DP.a aVarU1 = this.f131162a.u1();
                t.c(aVarU1);
                return aVarU1;
            }
        }

        /* compiled from: DaggerJsxCvActualizationCodeInputComponent.java */
        /* renamed from: com.avito.android.cv_actualization.view.code_input.di.a$c$c, reason: collision with other inner class name */
        public static final class C3905c implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cv_actualization.view.code_input.di.c f131163a;

            public C3905c(com.avito.android.cv_actualization.view.code_input.di.c cVar) {
                this.f131163a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f131163a.d();
                t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        public c(com.avito.android.cv_actualization.view.code_input.di.c cVar, Fragment fragment, Resources resources, String str, Long l12, r rVar, C3903a c3903a) {
            this.f131149a = l.a(str);
            this.f131151c = g.d(new com.avito.android.cv_actualization.view.d(new b(cVar)));
            u<com.avito.android.code_confirmation.code_confirmation.timer.a> uVarD = g.d(new f(new C3905c(cVar)));
            this.f131153e = uVarD;
            u<com.avito.android.cv_actualization.view.code_input.mvi.domain.c> uVarA = B.a(new com.avito.android.cv_actualization.view.code_input.mvi.domain.d(uVarD));
            this.f131154f = uVarA;
            l lVar = this.f131149a;
            u<com.avito.android.cv_actualization.view.code_input.e> uVar = this.f131151c;
            this.f131155g = new com.avito.android.cv_actualization.view.code_input.mvi.b(new com.avito.android.cv_actualization.view.code_input.mvi.action_handler.d(lVar, uVarA, uVar), new com.avito.android.cv_actualization.view.code_input.mvi.action_handler.b(lVar, uVar));
            this.f131156h = new C3904a(cVar);
            u<C28478k> uVarD2 = g.d(new e(l.a(rVar)));
            this.f131157i = uVarD2;
            this.f131158j = com.avito.android.advert.item.delivery_suggests.l.i(this.f131156h, uVarD2);
            this.f131159k = new com.avito.android.cv_actualization.view.code_input.mvi.d(l.a(l12), this.f131154f);
            this.f131160l = new rt.b(new com.avito.android.cv_actualization.view.code_input.mvi.g(k.a(), this.f131155g, i.a(), this.f131158j, this.f131159k, this.f131149a));
        }

        @Override // com.avito.android.cv_actualization.view.code_input.di.b
        public final void a(JsxCvActualizationCodeInputFragment jsxCvActualizationCodeInputFragment) {
            jsxCvActualizationCodeInputFragment.f131119n0 = this.f131160l;
            jsxCvActualizationCodeInputFragment.f131120o0 = this.f131158j.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
