package com.avito.android.cv_actualization.view.phone_input.di;

import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cv_actualization.view.phone_input.JsxCvActualizationPhoneInputFragment;
import com.avito.android.cv_actualization.view.phone_input.di.b;
import com.avito.android.cv_actualization.view.phone_input.mvi.g;
import com.avito.android.cv_actualization.view.phone_input.mvi.i;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;
import st.InterfaceC48411b;
import ut.C49109b;

/* compiled from: DaggerJsxCvActualizationPhoneInputComponent.java */
@dagger.internal.e
/* loaded from: classes12.dex */
public final class a {

    /* compiled from: DaggerJsxCvActualizationPhoneInputComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.cv_actualization.view.phone_input.di.b.a
        public final com.avito.android.cv_actualization.view.phone_input.di.b a(com.avito.android.cv_actualization.view.phone_input.di.c cVar, JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment, Resources resources, boolean z12, r rVar) {
            return new c(cVar, jsxCvActualizationPhoneInputFragment, resources, Boolean.valueOf(z12), rVar, null);
        }
    }

    /* compiled from: DaggerJsxCvActualizationPhoneInputComponent.java */
    public static final class c implements com.avito.android.cv_actualization.view.phone_input.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<DP.a> f131261a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC48411b> f131262b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.cv_actualization.view.phone_input.mvi.b f131263c;

        /* renamed from: d, reason: collision with root package name */
        public final g f131264d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC28481c> f131265e;

        /* renamed from: f, reason: collision with root package name */
        public final u<C28478k> f131266f;

        /* renamed from: g, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f131267g;

        /* renamed from: h, reason: collision with root package name */
        public final C49109b f131268h;

        /* compiled from: DaggerJsxCvActualizationPhoneInputComponent.java */
        /* renamed from: com.avito.android.cv_actualization.view.phone_input.di.a$c$a, reason: collision with other inner class name */
        public static final class C3912a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cv_actualization.view.phone_input.di.c f131269a;

            public C3912a(com.avito.android.cv_actualization.view.phone_input.di.c cVar) {
                this.f131269a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f131269a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerJsxCvActualizationPhoneInputComponent.java */
        public static final class b implements u<DP.a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.cv_actualization.view.phone_input.di.c f131270a;

            public b(com.avito.android.cv_actualization.view.phone_input.di.c cVar) {
                this.f131270a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                DP.a aVarU1 = this.f131270a.u1();
                t.c(aVarU1);
                return aVarU1;
            }
        }

        public c(com.avito.android.cv_actualization.view.phone_input.di.c cVar, Fragment fragment, Resources resources, Boolean bool, r rVar, C3911a c3911a) {
            u<InterfaceC48411b> uVarD = dagger.internal.g.d(new com.avito.android.cv_actualization.view.d(new b(cVar)));
            this.f131262b = uVarD;
            this.f131263c = new com.avito.android.cv_actualization.view.phone_input.mvi.b(new com.avito.android.cv_actualization.view.phone_input.mvi.action_handler.e(uVarD));
            this.f131264d = new g(l.a(bool));
            this.f131265e = new C3912a(cVar);
            u<C28478k> uVarD2 = dagger.internal.g.d(new e(l.a(rVar)));
            this.f131266f = uVarD2;
            this.f131267g = com.avito.android.advert.item.delivery_suggests.l.i(this.f131265e, uVarD2);
            this.f131268h = new C49109b(new com.avito.android.cv_actualization.view.phone_input.mvi.e(i.a(), this.f131263c, this.f131264d, this.f131267g));
        }

        @Override // com.avito.android.cv_actualization.view.phone_input.di.b
        public final void a(JsxCvActualizationPhoneInputFragment jsxCvActualizationPhoneInputFragment) {
            jsxCvActualizationPhoneInputFragment.f131229n0 = this.f131268h;
            jsxCvActualizationPhoneInputFragment.f131230o0 = this.f131267g.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
