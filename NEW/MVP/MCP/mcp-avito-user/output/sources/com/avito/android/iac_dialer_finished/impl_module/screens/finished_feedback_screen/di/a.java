package com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di;

import android.content.res.Resources;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.IacFinishedFeedbackScreenFragment;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.b;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.i;
import com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.k;
import com.avito.android.iac_dialer_finished.public_module.screens.finished_feedback_screen.IacFinishedFeedbackScreenArgument;
import dagger.internal.g;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerIacFinishedFeedbackScreenComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class a {

    /* compiled from: DaggerIacFinishedFeedbackScreenComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.b.a
        public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.b a(IacFinishedFeedbackScreenFragment iacFinishedFeedbackScreenFragment, ActivityC22955m activityC22955m, Resources resources, r rVar, IacFinishedFeedbackScreenArgument iacFinishedFeedbackScreenArgument, com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.c cVar) {
            return new c(cVar, iacFinishedFeedbackScreenFragment, activityC22955m, resources, rVar, iacFinishedFeedbackScreenArgument, null);
        }
    }

    /* compiled from: DaggerIacFinishedFeedbackScreenComponent.java */
    public static final class c implements com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.c f166652a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC28373a> f166653b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.d f166654c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28481c> f166655d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f166656e;

        /* renamed from: f, reason: collision with root package name */
        public final l f166657f;

        /* renamed from: g, reason: collision with root package name */
        public final i f166658g;

        /* compiled from: DaggerIacFinishedFeedbackScreenComponent.java */
        /* renamed from: com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.a$c$a, reason: collision with other inner class name */
        public static final class C4952a implements u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.c f166659a;

            public C4952a(com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.c cVar) {
                this.f166659a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f166659a.a();
                t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerIacFinishedFeedbackScreenComponent.java */
        public static final class b implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.c f166660a;

            public b(com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.c cVar) {
                this.f166660a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f166660a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.c cVar, Fragment fragment, ActivityC22955m activityC22955m, Resources resources, r rVar, IacFinishedFeedbackScreenArgument iacFinishedFeedbackScreenArgument, C4951a c4951a) {
            this.f166652a = cVar;
            this.f166654c = new com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.d(new C4952a(cVar));
            this.f166655d = new b(cVar);
            this.f166656e = g.d(new f(l.a(rVar), this.f166655d));
            this.f166657f = l.a(iacFinishedFeedbackScreenArgument);
            this.f166658g = new i(new com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.i(this.f166654c, com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.mvi.f.a(), k.a(), this.f166656e, this.f166657f));
        }

        @Override // com.avito.android.iac_dialer_finished.impl_module.screens.finished_feedback_screen.di.b
        public final void a(IacFinishedFeedbackScreenFragment iacFinishedFeedbackScreenFragment) {
            iacFinishedFeedbackScreenFragment.f166629n0 = this.f166658g;
            XK.a aVarMm = this.f166652a.mm();
            t.c(aVarMm);
            iacFinishedFeedbackScreenFragment.f166631p0 = aVarMm;
            iacFinishedFeedbackScreenFragment.f166632q0 = this.f166656e.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
