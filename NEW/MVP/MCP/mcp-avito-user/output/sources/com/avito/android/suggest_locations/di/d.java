package com.avito.android.suggest_locations.di;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.publish.PublishIntentFactory;
import com.avito.android.suggest_locations.C35155u;
import com.avito.android.suggest_locations.C35158x;
import com.avito.android.suggest_locations.InterfaceC35160z;
import com.avito.android.suggest_locations.SuggestLocationsFragment;
import com.avito.android.suggest_locations.U;
import com.avito.android.suggest_locations.di.q;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import nF.C44245a;

/* compiled from: DaggerSuggestLocationsComponent.java */
@dagger.internal.e
/* loaded from: classes4.dex */
public final class d {

    /* compiled from: DaggerSuggestLocationsComponent.java */
    public static final class b implements q.a {
        public b() {
        }

        @Override // com.avito.android.suggest_locations.di.q.a
        public final q a(Kundle kundle, String str, String str2, int i12, String str3, PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType, boolean z12, String str4, boolean z13, boolean z14, String str5, Boolean bool, C28478k c28478k, r rVar) {
            suggestLocationsFlowType.getClass();
            return new c(rVar, kundle, str, str2, Integer.valueOf(i12), str3, suggestLocationsFlowType, Boolean.valueOf(z12), str4, Boolean.valueOf(z13), Boolean.valueOf(z14), str5, bool, c28478k, null);
        }
    }

    /* compiled from: DaggerSuggestLocationsComponent.java */
    public static final class c implements q {

        /* renamed from: a, reason: collision with root package name */
        public final r f292300a;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.geo_common.interactor.g> f292301b;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f292302c;

        /* renamed from: d, reason: collision with root package name */
        public final C35155u f292303d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f292304e;

        /* renamed from: f, reason: collision with root package name */
        public final sA0.c f292305f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f292306g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f292307h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f292308i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f292309j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.l f292310k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f292311l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f292312m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.l f292313n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f292314o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<C44245a> f292315p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f292316q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f292317r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35160z> f292318s;

        /* compiled from: DaggerSuggestLocationsComponent.java */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final r f292319a;

            public a(r rVar) {
                this.f292319a = rVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f292319a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerSuggestLocationsComponent.java */
        public static final class b implements dagger.internal.u<C44245a> {

            /* renamed from: a, reason: collision with root package name */
            public final r f292320a;

            public b(r rVar) {
                this.f292320a = rVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f292320a.R0();
            }
        }

        /* compiled from: DaggerSuggestLocationsComponent.java */
        /* renamed from: com.avito.android.suggest_locations.di.d$c$c, reason: collision with other inner class name */
        public static final class C8865c implements dagger.internal.u<com.avito.android.geo_common.interactor.g> {

            /* renamed from: a, reason: collision with root package name */
            public final r f292321a;

            public C8865c(r rVar) {
                this.f292321a = rVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo_common.interactor.g gVarU0 = this.f292321a.u0();
                dagger.internal.t.c(gVarU0);
                return gVarU0;
            }
        }

        /* compiled from: DaggerSuggestLocationsComponent.java */
        /* renamed from: com.avito.android.suggest_locations.di.d$c$d, reason: collision with other inner class name */
        public static final class C8866d implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final r f292322a;

            public C8866d(r rVar) {
                this.f292322a = rVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5T5 = this.f292322a.T5();
                dagger.internal.t.c(interfaceC35745a5T5);
                return interfaceC35745a5T5;
            }
        }

        /* compiled from: DaggerSuggestLocationsComponent.java */
        public static final class e implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final r f292323a;

            public e(r rVar) {
                this.f292323a = rVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f292323a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(r rVar, Kundle kundle, String str, String str2, Integer num, String str3, PublishIntentFactory.SuggestLocationsFlowType suggestLocationsFlowType, Boolean bool, String str4, Boolean bool2, Boolean bool3, String str5, Boolean bool4, C28478k c28478k, a aVar) {
            this.f292300a = rVar;
            C8865c c8865c = new C8865c(rVar);
            C8866d c8866d = new C8866d(rVar);
            this.f292302c = c8866d;
            this.f292303d = new C35155u(c8865c, c8866d, C35158x.a());
            this.f292304e = new a(rVar);
            this.f292305f = new sA0.c(dagger.internal.l.b(str5), this.f292304e);
            this.f292306g = dagger.internal.l.b(str);
            this.f292307h = dagger.internal.l.b(str2);
            this.f292308i = dagger.internal.l.a(num);
            this.f292309j = dagger.internal.l.a(bool);
            this.f292310k = dagger.internal.l.b(str3);
            this.f292311l = dagger.internal.l.a(suggestLocationsFlowType);
            this.f292312m = dagger.internal.l.b(str4);
            this.f292313n = dagger.internal.l.a(bool3);
            this.f292314o = dagger.internal.l.b(bool4);
            this.f292315p = new b(rVar);
            this.f292316q = new e(rVar);
            this.f292317r = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f292316q);
            this.f292318s = dagger.internal.g.d(new U(this.f292303d, this.f292305f, this.f292302c, this.f292306g, this.f292307h, this.f292308i, this.f292309j, this.f292310k, this.f292311l, this.f292312m, this.f292313n, this.f292314o, this.f292315p, this.f292317r, dagger.internal.l.b(kundle)));
        }

        @Override // com.avito.android.suggest_locations.di.q
        public final void a(SuggestLocationsFragment suggestLocationsFragment) {
            suggestLocationsFragment.f292144t0 = this.f292318s.get();
            r rVar = this.f292300a;
            suggestLocationsFragment.f292139A0 = rVar.C1();
            rVar.H();
            suggestLocationsFragment.f292140B0 = this.f292317r.get();
        }
    }

    public static q.a a() {
        return new b();
    }
}
