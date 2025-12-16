package com.avito.android.early_access_advert.di;

import Tx.InterfaceC15421a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.early_access_advert.di.f;
import com.avito.android.early_access_advert.feedback_screen.EarlyAccessAdvertFeedbackFragment;
import com.avito.android.early_access_advert.feedback_screen.domain.EarlyAccessAdvertFeedbackType;
import com.avito.android.early_access_advert.feedback_screen.mvi.k;
import com.avito.android.remote.model.early_access_advert.EarlyAccessFeedback;
import com.avito.android.util.R0;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerEarlyAccessAdvertFeedbackComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class b {

    /* compiled from: DaggerEarlyAccessAdvertFeedbackComponent.java */
    /* renamed from: com.avito.android.early_access_advert.di.b$b, reason: collision with other inner class name */
    public static final class C4230b implements f {

        /* renamed from: a, reason: collision with root package name */
        public final l f145596a;

        /* renamed from: b, reason: collision with root package name */
        public final l f145597b;

        /* renamed from: c, reason: collision with root package name */
        public final com.avito.android.early_access_advert.feedback_screen.mvi.d f145598c;

        /* renamed from: d, reason: collision with root package name */
        public final u<com.avito.android.early_access_advert.a> f145599d;

        /* renamed from: e, reason: collision with root package name */
        public final u<InterfaceC15421a> f145600e;

        /* renamed from: f, reason: collision with root package name */
        public final u<R0> f145601f;

        /* renamed from: g, reason: collision with root package name */
        public final com.avito.android.early_access_advert.feedback_screen.mvi.b f145602g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f145603h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f145604i;

        /* renamed from: j, reason: collision with root package name */
        public final com.avito.android.early_access_advert.feedback_screen.e f145605j;

        /* compiled from: DaggerEarlyAccessAdvertFeedbackComponent.java */
        /* renamed from: com.avito.android.early_access_advert.di.b$b$a */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final e f145606a;

            public a(e eVar) {
                this.f145606a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cF = this.f145606a.f();
                t.c(interfaceC28481cF);
                return interfaceC28481cF;
            }
        }

        /* compiled from: DaggerEarlyAccessAdvertFeedbackComponent.java */
        /* renamed from: com.avito.android.early_access_advert.di.b$b$b, reason: collision with other inner class name */
        public static final class C4231b implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final e f145607a;

            public C4231b(e eVar) {
                this.f145607a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f145607a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerEarlyAccessAdvertFeedbackComponent.java */
        /* renamed from: com.avito.android.early_access_advert.di.b$b$c */
        public static final class c implements u<com.avito.android.early_access_advert.a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f145608a;

            public c(e eVar) {
                this.f145608a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f145608a.E7();
            }
        }

        /* compiled from: DaggerEarlyAccessAdvertFeedbackComponent.java */
        /* renamed from: com.avito.android.early_access_advert.di.b$b$d */
        public static final class d implements u<InterfaceC15421a> {

            /* renamed from: a, reason: collision with root package name */
            public final e f145609a;

            public d(e eVar) {
                this.f145609a = eVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC15421a interfaceC15421aRd = this.f145609a.rd();
                t.c(interfaceC15421aRd);
                return interfaceC15421aRd;
            }
        }

        public C4230b(e eVar, C28478k c28478k, String str, EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType, EarlyAccessFeedback earlyAccessFeedback, a aVar) {
            this.f145596a = l.a(str);
            this.f145597b = l.a(earlyAccessAdvertFeedbackType);
            this.f145598c = new com.avito.android.early_access_advert.feedback_screen.mvi.d(this.f145596a, this.f145597b, l.a(earlyAccessFeedback));
            this.f145602g = new com.avito.android.early_access_advert.feedback_screen.mvi.b(new c(eVar), new com.avito.android.early_access_advert.feedback_screen.domain.b(new d(eVar), new C4231b(eVar)));
            this.f145603h = new a(eVar);
            this.f145604i = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f145603h);
            this.f145605j = new com.avito.android.early_access_advert.feedback_screen.e(new com.avito.android.early_access_advert.feedback_screen.mvi.g(this.f145598c, this.f145602g, com.avito.android.early_access_advert.feedback_screen.mvi.i.a(), k.a(), this.f145604i));
        }

        @Override // com.avito.android.early_access_advert.di.f
        public final void a(EarlyAccessAdvertFeedbackFragment earlyAccessAdvertFeedbackFragment) {
            earlyAccessAdvertFeedbackFragment.f145622n0 = this.f145605j;
            earlyAccessAdvertFeedbackFragment.f145624p0 = this.f145604i.get();
        }
    }

    /* compiled from: DaggerEarlyAccessAdvertFeedbackComponent.java */
    public static final class c implements f.a {
        public c() {
        }

        @Override // com.avito.android.early_access_advert.di.f.a
        public final f a(e eVar, C28478k c28478k, String str, EarlyAccessAdvertFeedbackType earlyAccessAdvertFeedbackType, EarlyAccessFeedback earlyAccessFeedback) {
            return new C4230b(eVar, c28478k, str, earlyAccessAdvertFeedbackType, earlyAccessFeedback, null);
        }
    }

    public static f.a a() {
        return new c();
    }
}
