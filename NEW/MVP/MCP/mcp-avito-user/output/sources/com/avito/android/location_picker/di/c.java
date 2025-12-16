package com.avito.android.location_picker.di;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22983P;
import com.avito.android.U0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_map.AvitoMapAttachHelper;
import com.avito.android.avito_map.AvitoMapTarget;
import com.avito.android.geo_common.model.location_picker.LocationFlowType;
import com.avito.android.location.find.InterfaceC31503a;
import com.avito.android.location_picker.F0;
import com.avito.android.location_picker.InterfaceC31532a;
import com.avito.android.location_picker.K0;
import com.avito.android.location_picker.LocationPickerFragment;
import com.avito.android.location_picker.M0;
import com.avito.android.location_picker.N0;
import com.avito.android.location_picker.O0;
import com.avito.android.location_picker.Q0;
import com.avito.android.location_picker.analytics.LocationPickerScreenOpenEvent;
import com.avito.android.location_picker.di.e;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.providers.B;
import com.avito.android.location_picker.providers.C;
import com.avito.android.location_picker.providers.C31568e;
import com.avito.android.location_picker.providers.F;
import com.avito.android.location_picker.providers.InterfaceC31564a;
import com.avito.android.location_picker.providers.InterfaceC31565b;
import com.avito.android.location_picker.providers.InterfaceC31569f;
import com.avito.android.location_picker.view.InterfaceC31579a;
import com.avito.android.location_picker.view.InterfaceC31580b;
import com.avito.android.location_picker.view.InterfaceC31581c;
import com.avito.android.location_picker.view.LocationPickerChooseButtonLocation;
import com.avito.android.location_picker.view.T;
import com.avito.android.location_picker.view.U;
import com.avito.android.permissions.C33035e;
import com.avito.android.permissions.G;
import com.avito.android.remote.model.SearchParamsConverter;
import com.avito.android.remote.model.SearchParamsConverterImpl_Factory;
import com.avito.android.util.InterfaceC35745a5;
import io.reactivex.rxjava3.core.z;
import lW.C43693c;
import lW.InterfaceC43691a;
import nF.C44245a;
import pW.C47017h;
import pW.C47018i;
import uW.InterfaceC48983a;
import yc.C50213a;

/* compiled from: DaggerLocationPickerComponent.java */
@dagger.internal.e
/* loaded from: classes14.dex */
public final class c {

    /* compiled from: DaggerLocationPickerComponent.java */
    public static final class b implements e.a {

        /* renamed from: a, reason: collision with root package name */
        public com.jakewharton.rxrelay3.c f182227a;

        /* renamed from: b, reason: collision with root package name */
        public LocationPickerState f182228b;

        /* renamed from: c, reason: collision with root package name */
        public Boolean f182229c;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f182230d;

        /* renamed from: e, reason: collision with root package name */
        public Boolean f182231e;

        /* renamed from: f, reason: collision with root package name */
        public AvitoMapTarget f182232f;

        /* renamed from: g, reason: collision with root package name */
        public ActivityC22955m f182233g;

        /* renamed from: h, reason: collision with root package name */
        public View f182234h;

        /* renamed from: i, reason: collision with root package name */
        public ActivityC22955m f182235i;

        /* renamed from: j, reason: collision with root package name */
        public LocationPickerFragment f182236j;

        /* renamed from: k, reason: collision with root package name */
        public LocationPickerFragment f182237k;

        /* renamed from: l, reason: collision with root package name */
        public Resources f182238l;

        /* renamed from: m, reason: collision with root package name */
        public Boolean f182239m;

        /* renamed from: n, reason: collision with root package name */
        public Boolean f182240n;

        /* renamed from: o, reason: collision with root package name */
        public Boolean f182241o;

        /* renamed from: p, reason: collision with root package name */
        public N0 f182242p;

        /* renamed from: q, reason: collision with root package name */
        public LocationPickerChooseButtonLocation f182243q;

        /* renamed from: r, reason: collision with root package name */
        public com.avito.android.location_picker.job.f f182244r;

        /* renamed from: s, reason: collision with root package name */
        public LocationPickerScreenOpenEvent.EventSource f182245s;

        /* renamed from: t, reason: collision with root package name */
        public com.avito.android.analytics.screens.r f182246t;

        /* renamed from: u, reason: collision with root package name */
        public String f182247u;

        /* renamed from: v, reason: collision with root package name */
        public Boolean f182248v;

        /* renamed from: w, reason: collision with root package name */
        public LocationFlowType f182249w;

        /* renamed from: x, reason: collision with root package name */
        public f f182250x;

        public b() {
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a a(LocationPickerFragment locationPickerFragment) {
            this.f182237k = locationPickerFragment;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a b(Resources resources) {
            this.f182238l = resources;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e build() {
            dagger.internal.t.a(z.class, this.f182227a);
            dagger.internal.t.a(LocationPickerState.class, this.f182228b);
            dagger.internal.t.a(Boolean.class, this.f182229c);
            dagger.internal.t.a(Boolean.class, this.f182230d);
            dagger.internal.t.a(Boolean.class, this.f182231e);
            dagger.internal.t.a(Activity.class, this.f182233g);
            dagger.internal.t.a(View.class, this.f182234h);
            dagger.internal.t.a(ActivityC22955m.class, this.f182235i);
            dagger.internal.t.a(Fragment.class, this.f182236j);
            dagger.internal.t.a(InterfaceC22983P.class, this.f182237k);
            dagger.internal.t.a(Resources.class, this.f182238l);
            dagger.internal.t.a(Boolean.class, this.f182239m);
            dagger.internal.t.a(Boolean.class, this.f182240n);
            dagger.internal.t.a(Boolean.class, this.f182241o);
            dagger.internal.t.a(N0.class, this.f182242p);
            dagger.internal.t.a(LocationPickerChooseButtonLocation.class, this.f182243q);
            dagger.internal.t.a(com.avito.android.location_picker.job.f.class, this.f182244r);
            dagger.internal.t.a(LocationPickerScreenOpenEvent.EventSource.class, this.f182245s);
            dagger.internal.t.a(com.avito.android.analytics.screens.r.class, this.f182246t);
            dagger.internal.t.a(Boolean.class, this.f182248v);
            dagger.internal.t.a(LocationFlowType.class, this.f182249w);
            dagger.internal.t.a(f.class, this.f182250x);
            return new C5349c(this.f182250x, this.f182227a, this.f182228b, this.f182229c, this.f182230d, this.f182231e, this.f182232f, this.f182233g, this.f182234h, this.f182235i, this.f182236j, this.f182237k, this.f182238l, this.f182239m, this.f182240n, this.f182241o, this.f182242p, this.f182243q, this.f182244r, this.f182245s, this.f182246t, this.f182247u, this.f182248v, this.f182249w, null);
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a c(com.avito.android.analytics.screens.r rVar) {
            this.f182246t = rVar;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a d(ActivityC22955m activityC22955m) {
            this.f182233g = activityC22955m;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a e(boolean z12) {
            this.f182240n = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a f(AvitoMapTarget avitoMapTarget) {
            this.f182232f = avitoMapTarget;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a g(boolean z12) {
            this.f182229c = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a h(LocationPickerChooseButtonLocation locationPickerChooseButtonLocation) {
            locationPickerChooseButtonLocation.getClass();
            this.f182243q = locationPickerChooseButtonLocation;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a i(LocationFlowType locationFlowType) {
            locationFlowType.getClass();
            this.f182249w = locationFlowType;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a j(LocationPickerFragment locationPickerFragment) {
            this.f182236j = locationPickerFragment;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a k(f fVar) {
            this.f182250x = fVar;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a l(ActivityC22955m activityC22955m) {
            this.f182235i = activityC22955m;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a m(LocationPickerScreenOpenEvent.EventSource eventSource) {
            this.f182245s = eventSource;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a n(boolean z12) {
            this.f182231e = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a o(boolean z12) {
            this.f182239m = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a p(boolean z12) {
            this.f182230d = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a q(com.avito.android.location_picker.job.f fVar) {
            fVar.getClass();
            this.f182244r = fVar;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a r(String str) {
            this.f182247u = str;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a s(LocationPickerState locationPickerState) {
            this.f182228b = locationPickerState;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a t(boolean z12) {
            this.f182248v = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a u(N0 n02) {
            n02.getClass();
            this.f182242p = n02;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a v(boolean z12) {
            this.f182241o = Boolean.valueOf(z12);
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a w(View view) {
            this.f182234h = view;
            return this;
        }

        @Override // com.avito.android.location_picker.di.e.a
        public final e.a x(com.jakewharton.rxrelay3.c cVar) {
            cVar.getClass();
            this.f182227a = cVar;
            return this;
        }
    }

    /* compiled from: DaggerLocationPickerComponent.java */
    /* renamed from: com.avito.android.location_picker.di.c$c, reason: collision with other inner class name */
    public static final class C5349c implements com.avito.android.location_picker.di.e {

        /* renamed from: A, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.geo_common.interactor.g> f182251A;

        /* renamed from: B, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31564a> f182252B;

        /* renamed from: C, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC35745a5> f182253C;

        /* renamed from: D, reason: collision with root package name */
        public final dagger.internal.u<G> f182254D;

        /* renamed from: E, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.z> f182255E;

        /* renamed from: F, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.permissions.q> f182256F;

        /* renamed from: G, reason: collision with root package name */
        public final com.avito.android.location_picker.di.j f182257G;

        /* renamed from: H, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28373a> f182258H;

        /* renamed from: I, reason: collision with root package name */
        public final dagger.internal.u<C50213a> f182259I;

        /* renamed from: J, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location_picker.providers.w> f182260J;

        /* renamed from: K, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.server_time.f> f182261K;

        /* renamed from: L, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC43691a> f182262L;

        /* renamed from: M, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC48983a> f182263M;

        /* renamed from: N, reason: collision with root package name */
        public final dagger.internal.u<C> f182264N;

        /* renamed from: O, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31569f> f182265O;

        /* renamed from: P, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31565b> f182266P;

        /* renamed from: Q, reason: collision with root package name */
        public final dagger.internal.u<SearchParamsConverter> f182267Q;

        /* renamed from: R, reason: collision with root package name */
        public final dagger.internal.u<O0> f182268R;

        /* renamed from: S, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location_picker.analytics.a> f182269S;

        /* renamed from: T, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location_picker.job.a> f182270T;

        /* renamed from: U, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.util.C> f182271U;

        /* renamed from: V, reason: collision with root package name */
        public final dagger.internal.u<C44245a> f182272V;

        /* renamed from: W, reason: collision with root package name */
        public final dagger.internal.l f182273W;

        /* renamed from: X, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31532a> f182274X;

        /* renamed from: Y, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.geo.j> f182275Y;

        /* renamed from: Z, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31503a> f182276Z;

        /* renamed from: a, reason: collision with root package name */
        public final N0 f182277a;

        /* renamed from: a0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.find.d> f182278a0;

        /* renamed from: b, reason: collision with root package name */
        public final dagger.internal.l f182279b;

        /* renamed from: b0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.find.r> f182280b0;

        /* renamed from: c, reason: collision with root package name */
        public final dagger.internal.l f182281c;

        /* renamed from: c0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.find.w> f182282c0;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f182283d;

        /* renamed from: d0, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location.find.o> f182284d0;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.l f182285e;

        /* renamed from: f, reason: collision with root package name */
        public final dagger.internal.l f182286f;

        /* renamed from: g, reason: collision with root package name */
        public final dagger.internal.l f182287g;

        /* renamed from: h, reason: collision with root package name */
        public final dagger.internal.l f182288h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f182289i;

        /* renamed from: j, reason: collision with root package name */
        public final dagger.internal.l f182290j;

        /* renamed from: k, reason: collision with root package name */
        public final dagger.internal.u<U0> f182291k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.u<AvitoMapAttachHelper> f182292l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f182293m;

        /* renamed from: n, reason: collision with root package name */
        public final dagger.internal.l f182294n;

        /* renamed from: o, reason: collision with root package name */
        public final dagger.internal.l f182295o;

        /* renamed from: p, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location_picker.providers.z> f182296p;

        /* renamed from: q, reason: collision with root package name */
        public final dagger.internal.l f182297q;

        /* renamed from: r, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC28481c> f182298r;

        /* renamed from: s, reason: collision with root package name */
        public final dagger.internal.u<ScreenPerformanceTracker> f182299s;

        /* renamed from: t, reason: collision with root package name */
        public final dagger.internal.u<K0> f182300t;

        /* renamed from: u, reason: collision with root package name */
        public final dagger.internal.l f182301u;

        /* renamed from: v, reason: collision with root package name */
        public final dagger.internal.u<T> f182302v;

        /* renamed from: w, reason: collision with root package name */
        public final dagger.internal.u<com.avito.android.location_picker.view.publish.b> f182303w;

        /* renamed from: x, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31579a> f182304x;

        /* renamed from: y, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31581c> f182305y;

        /* renamed from: z, reason: collision with root package name */
        public final dagger.internal.u<InterfaceC31580b> f182306z;

        /* compiled from: DaggerLocationPickerComponent.java */
        /* renamed from: com.avito.android.location_picker.di.c$c$a */
        public static final class a implements dagger.internal.u<InterfaceC28373a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_picker.di.f f182307a;

            public a(com.avito.android.location_picker.di.f fVar) {
                this.f182307a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28373a interfaceC28373aA = this.f182307a.a();
                dagger.internal.t.c(interfaceC28373aA);
                return interfaceC28373aA;
            }
        }

        /* compiled from: DaggerLocationPickerComponent.java */
        /* renamed from: com.avito.android.location_picker.di.c$c$b */
        public static final class b implements dagger.internal.u<com.avito.android.util.C> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_picker.di.f f182308a;

            public b(com.avito.android.location_picker.di.f fVar) {
                this.f182308a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.util.C cJ2 = this.f182308a.j();
                dagger.internal.t.c(cJ2);
                return cJ2;
            }
        }

        /* compiled from: DaggerLocationPickerComponent.java */
        /* renamed from: com.avito.android.location_picker.di.c$c$c, reason: collision with other inner class name */
        public static final class C5350c implements dagger.internal.u<C44245a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_picker.di.f f182309a;

            public C5350c(com.avito.android.location_picker.di.f fVar) {
                this.f182309a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f182309a.R0();
            }
        }

        /* compiled from: DaggerLocationPickerComponent.java */
        /* renamed from: com.avito.android.location_picker.di.c$c$d */
        public static final class d implements dagger.internal.u<com.avito.android.geo.j> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_picker.di.f f182310a;

            public d(com.avito.android.location_picker.di.f fVar) {
                this.f182310a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo.j jVarC0 = this.f182310a.c0();
                dagger.internal.t.c(jVarC0);
                return jVarC0;
            }
        }

        /* compiled from: DaggerLocationPickerComponent.java */
        /* renamed from: com.avito.android.location_picker.di.c$c$e */
        public static final class e implements dagger.internal.u<com.avito.android.geo_common.interactor.g> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_picker.di.f f182311a;

            public e(com.avito.android.location_picker.di.f fVar) {
                this.f182311a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.geo_common.interactor.g gVarU0 = this.f182311a.u0();
                dagger.internal.t.c(gVarU0);
                return gVarU0;
            }
        }

        /* compiled from: DaggerLocationPickerComponent.java */
        /* renamed from: com.avito.android.location_picker.di.c$c$f */
        public static final class f implements dagger.internal.u<U0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_picker.di.f f182312a;

            public f(com.avito.android.location_picker.di.f fVar) {
                this.f182312a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f182312a.X0();
            }
        }

        /* compiled from: DaggerLocationPickerComponent.java */
        /* renamed from: com.avito.android.location_picker.di.c$c$g */
        public static final class g implements dagger.internal.u<com.avito.android.permissions.z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_picker.di.f f182313a;

            public g(com.avito.android.location_picker.di.f fVar) {
                this.f182313a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.permissions.z zVarA = this.f182313a.A();
                dagger.internal.t.c(zVarA);
                return zVarA;
            }
        }

        /* compiled from: DaggerLocationPickerComponent.java */
        /* renamed from: com.avito.android.location_picker.di.c$c$h */
        public static final class h implements dagger.internal.u<G> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_picker.di.f f182314a;

            public h(com.avito.android.location_picker.di.f fVar) {
                this.f182314a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f182314a.N();
            }
        }

        /* compiled from: DaggerLocationPickerComponent.java */
        /* renamed from: com.avito.android.location_picker.di.c$c$i */
        public static final class i implements dagger.internal.u<C50213a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_picker.di.f f182315a;

            public i(com.avito.android.location_picker.di.f fVar) {
                this.f182315a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                C50213a c50213aD1 = this.f182315a.D1();
                dagger.internal.t.c(c50213aD1);
                return c50213aD1;
            }
        }

        /* compiled from: DaggerLocationPickerComponent.java */
        /* renamed from: com.avito.android.location_picker.di.c$c$j */
        public static final class j implements dagger.internal.u<InterfaceC48983a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_picker.di.f f182316a;

            public j(com.avito.android.location_picker.di.f fVar) {
                this.f182316a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC48983a interfaceC48983aYk = this.f182316a.yk();
                dagger.internal.t.c(interfaceC48983aYk);
                return interfaceC48983aYk;
            }
        }

        /* compiled from: DaggerLocationPickerComponent.java */
        /* renamed from: com.avito.android.location_picker.di.c$c$k */
        public static final class k implements dagger.internal.u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_picker.di.f f182317a;

            public k(com.avito.android.location_picker.di.f fVar) {
                this.f182317a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5T5 = this.f182317a.T5();
                dagger.internal.t.c(interfaceC35745a5T5);
                return interfaceC35745a5T5;
            }
        }

        /* compiled from: DaggerLocationPickerComponent.java */
        /* renamed from: com.avito.android.location_picker.di.c$c$l */
        public static final class l implements dagger.internal.u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_picker.di.f f182318a;

            public l(com.avito.android.location_picker.di.f fVar) {
                this.f182318a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f182318a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        /* compiled from: DaggerLocationPickerComponent.java */
        /* renamed from: com.avito.android.location_picker.di.c$c$m */
        public static final class m implements dagger.internal.u<com.avito.android.server_time.f> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.location_picker.di.f f182319a;

            public m(com.avito.android.location_picker.di.f fVar) {
                this.f182319a = fVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                com.avito.android.server_time.f fVarL = this.f182319a.l();
                dagger.internal.t.c(fVarL);
                return fVarL;
            }
        }

        public C5349c() {
            throw null;
        }

        public C5349c(com.avito.android.location_picker.di.f fVar, z zVar, LocationPickerState locationPickerState, Boolean bool, Boolean bool2, Boolean bool3, AvitoMapTarget avitoMapTarget, Activity activity, View view, ActivityC22955m activityC22955m, Fragment fragment, InterfaceC22983P interfaceC22983P, Resources resources, Boolean bool4, Boolean bool5, Boolean bool6, N0 n02, LocationPickerChooseButtonLocation locationPickerChooseButtonLocation, com.avito.android.location_picker.job.f fVar2, LocationPickerScreenOpenEvent.EventSource eventSource, com.avito.android.analytics.screens.r rVar, String str, Boolean bool7, LocationFlowType locationFlowType, a aVar) {
            this.f182277a = n02;
            this.f182279b = dagger.internal.l.a(locationPickerState);
            this.f182281c = dagger.internal.l.a(bool7);
            this.f182283d = dagger.internal.l.a(view);
            this.f182285e = dagger.internal.l.a(fragment);
            this.f182286f = dagger.internal.l.a(n02);
            this.f182287g = dagger.internal.l.a(bool);
            this.f182288h = dagger.internal.l.a(bool2);
            this.f182289i = dagger.internal.l.a(fVar2);
            this.f182290j = dagger.internal.l.a(locationPickerChooseButtonLocation);
            this.f182291k = new f(fVar);
            this.f182292l = dagger.internal.g.d(new n(dagger.internal.l.a(bool4), this.f182291k));
            this.f182293m = dagger.internal.l.b(avitoMapTarget);
            this.f182294n = dagger.internal.l.a(resources);
            dagger.internal.l lVarA = dagger.internal.l.a(bool5);
            this.f182295o = lVarA;
            this.f182296p = dagger.internal.g.d(new B(this.f182294n, lVarA));
            this.f182297q = dagger.internal.l.a(bool3);
            this.f182298r = new l(fVar);
            dagger.internal.u<ScreenPerformanceTracker> uVarD = dagger.internal.g.d(new t(dagger.internal.l.a(rVar), this.f182298r));
            this.f182299s = uVarD;
            this.f182300t = dagger.internal.g.d(new M0(uVarD));
            dagger.internal.l lVarB = dagger.internal.l.b(str);
            this.f182301u = lVarB;
            this.f182302v = dagger.internal.g.d(new U(this.f182283d, this.f182285e, this.f182286f, this.f182287g, this.f182288h, this.f182289i, this.f182290j, this.f182292l, this.f182293m, this.f182296p, this.f182297q, this.f182300t, lVarB));
            dagger.internal.u<com.avito.android.location_picker.view.publish.b> uVarD2 = dagger.internal.g.d(new com.avito.android.location_picker.view.publish.m(this.f182283d, this.f182285e, this.f182286f, this.f182287g, this.f182288h, this.f182289i, this.f182290j, this.f182292l, this.f182293m, this.f182296p, this.f182297q, this.f182300t, this.f182301u));
            this.f182303w = uVarD2;
            this.f182304x = dagger.internal.g.d(new com.avito.android.location_picker.di.k(this.f182281c, uVarD2, this.f182302v));
            this.f182305y = dagger.internal.g.d(new com.avito.android.location_picker.di.m(this.f182281c, this.f182302v, this.f182303w));
            this.f182306z = dagger.internal.g.d(new com.avito.android.location_picker.di.l(this.f182281c, this.f182302v, this.f182303w));
            e eVar = new e(fVar);
            this.f182251A = eVar;
            this.f182252B = dagger.internal.g.d(new com.avito.android.location_picker.providers.v(eVar));
            this.f182253C = new k(fVar);
            dagger.internal.u<com.avito.android.permissions.q> uVarD3 = dagger.internal.g.d(new com.avito.android.permissions.s(new h(fVar), new g(fVar)));
            this.f182256F = uVarD3;
            this.f182257G = new com.avito.android.location_picker.di.j(uVarD3);
            a aVar2 = new a(fVar);
            this.f182258H = aVar2;
            this.f182260J = dagger.internal.g.d(new com.avito.android.location_picker.di.i(new com.avito.android.location_picker.providers.y(aVar2, new i(fVar)), this.f182279b));
            this.f182262L = dagger.internal.g.d(C43693c.a(this.f182258H, new m(fVar)));
            j jVar = new j(fVar);
            this.f182263M = jVar;
            this.f182264N = dagger.internal.g.d(new F(jVar));
            this.f182265O = dagger.internal.g.d(new com.avito.android.location_picker.providers.j(this.f182263M));
            this.f182266P = dagger.internal.g.d(new C31568e(this.f182251A));
            this.f182267Q = dagger.internal.g.d(SearchParamsConverterImpl_Factory.create());
            this.f182268R = dagger.internal.g.d(Q0.a());
            this.f182269S = dagger.internal.g.d(new com.avito.android.location_picker.analytics.c(dagger.internal.l.a(eventSource), this.f182258H));
            this.f182270T = dagger.internal.g.d(new com.avito.android.location_picker.job.e(this.f182251A));
            this.f182271U = new b(fVar);
            this.f182272V = new C5350c(fVar);
            this.f182273W = dagger.internal.l.a(bool6);
            this.f182274X = dagger.internal.g.d(new F0(this.f182279b, this.f182304x, this.f182305y, this.f182306z, this.f182252B, this.f182253C, this.f182257G, this.f182260J, this.f182262L, this.f182264N, this.f182265O, this.f182266P, this.f182267Q, this.f182268R, this.f182269S, this.f182270T, this.f182289i, this.f182271U, this.f182272V, this.f182295o, this.f182273W, dagger.internal.l.a(locationFlowType)));
            d dVar = new d(fVar);
            this.f182275Y = dVar;
            dagger.internal.u<InterfaceC31503a> uVarD4 = dagger.internal.g.d(C47017h.a(dVar));
            this.f182276Z = uVarD4;
            this.f182278a0 = dagger.internal.g.d(C47018i.a(uVarD4));
            dagger.internal.u<com.avito.android.location.find.r> uVarD5 = dagger.internal.g.d(com.avito.android.location.find.v.a(this.f182275Y));
            this.f182280b0 = uVarD5;
            dagger.internal.u<com.avito.android.location.find.w> uVarD6 = dagger.internal.g.d(com.avito.android.location.find.y.a(uVarD5));
            this.f182282c0 = uVarD6;
            this.f182284d0 = dagger.internal.g.d(com.avito.android.location.find.q.a(uVarD6, this.f182278a0));
        }

        @Override // com.avito.android.location_picker.di.e
        public final void a(LocationPickerFragment locationPickerFragment) {
            locationPickerFragment.f182162t0 = this.f182274X.get();
            locationPickerFragment.f182163u0 = this.f182269S.get();
            com.avito.android.permissions.q qVar = this.f182256F.get();
            com.avito.android.location_picker.di.g.f182320a.getClass();
            locationPickerFragment.f182164v0 = new C33035e(qVar);
            locationPickerFragment.f182165w0 = this.f182284d0.get();
            locationPickerFragment.f182166x0 = this.f182277a;
            locationPickerFragment.f182167y0 = this.f182300t.get();
        }
    }

    public static e.a a() {
        return new b();
    }
}
