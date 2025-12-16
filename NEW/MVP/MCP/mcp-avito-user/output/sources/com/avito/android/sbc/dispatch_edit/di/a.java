package com.avito.android.sbc.dispatch_edit.di;

import Xo0.InterfaceC17032a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.sbc.autodispatches.InterfaceC34468d;
import com.avito.android.sbc.di.w;
import com.avito.android.sbc.di.x;
import com.avito.android.sbc.dispatch_edit.SbcDispatchEditFragment;
import com.avito.android.sbc.dispatch_edit.di.b;
import com.avito.android.sbc.dispatch_edit.mvi.f;
import com.avito.android.sbc.dispatch_edit.mvi.i;
import com.avito.android.sbc.dispatch_edit.mvi.k;
import com.avito.android.sbc.dispatch_edit.mvi.m;
import com.avito.android.sbc.dispatch_edit.t;
import com.avito.android.util.R0;
import dagger.internal.e;
import dagger.internal.l;
import dagger.internal.u;
import java.util.Locale;

/* compiled from: DaggerSbcDispatchEditFragmentComponent.java */
@e
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: DaggerSbcDispatchEditFragmentComponent.java */
    public static final class b implements b.a {
        public b() {
        }

        @Override // com.avito.android.sbc.dispatch_edit.di.b.a
        public final com.avito.android.sbc.dispatch_edit.di.b a(C28478k c28478k, long j12, com.avito.android.sbc.dispatch_edit.di.c cVar) {
            return new c(cVar, c28478k, Long.valueOf(j12), null);
        }
    }

    /* compiled from: DaggerSbcDispatchEditFragmentComponent.java */
    public static final class c implements com.avito.android.sbc.dispatch_edit.di.b {

        /* renamed from: a, reason: collision with root package name */
        public final u<InterfaceC34468d> f260060a;

        /* renamed from: b, reason: collision with root package name */
        public final f f260061b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC17032a> f260062c;

        /* renamed from: d, reason: collision with root package name */
        public final u<R0> f260063d;

        /* renamed from: e, reason: collision with root package name */
        public final com.avito.android.sbc.dispatch_edit.mvi.d f260064e;

        /* renamed from: f, reason: collision with root package name */
        public final u<Locale> f260065f;

        /* renamed from: g, reason: collision with root package name */
        public final m f260066g;

        /* renamed from: h, reason: collision with root package name */
        public final u<InterfaceC28481c> f260067h;

        /* renamed from: i, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f260068i;

        /* renamed from: j, reason: collision with root package name */
        public final t f260069j;

        /* compiled from: DaggerSbcDispatchEditFragmentComponent.java */
        /* renamed from: com.avito.android.sbc.dispatch_edit.di.a$c$a, reason: collision with other inner class name */
        public static final class C7800a implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.dispatch_edit.di.c f260070a;

            public C7800a(com.avito.android.sbc.dispatch_edit.di.c cVar) {
                this.f260070a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0I0 = this.f260070a.i0();
                dagger.internal.t.c(r0I0);
                return r0I0;
            }
        }

        /* compiled from: DaggerSbcDispatchEditFragmentComponent.java */
        public static final class b implements u<Locale> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.dispatch_edit.di.c f260071a;

            public b(com.avito.android.sbc.dispatch_edit.di.c cVar) {
                this.f260071a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f260071a.locale();
            }
        }

        /* compiled from: DaggerSbcDispatchEditFragmentComponent.java */
        /* renamed from: com.avito.android.sbc.dispatch_edit.di.a$c$c, reason: collision with other inner class name */
        public static final class C7801c implements u<InterfaceC17032a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.dispatch_edit.di.c f260072a;

            public C7801c(com.avito.android.sbc.dispatch_edit.di.c cVar) {
                this.f260072a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC17032a interfaceC17032aN2 = this.f260072a.N2();
                dagger.internal.t.c(interfaceC17032aN2);
                return interfaceC17032aN2;
            }
        }

        /* compiled from: DaggerSbcDispatchEditFragmentComponent.java */
        public static final class d implements u<InterfaceC34468d> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.dispatch_edit.di.c f260073a;

            public d(com.avito.android.sbc.dispatch_edit.di.c cVar) {
                this.f260073a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC34468d interfaceC34468dBk = this.f260073a.bk();
                dagger.internal.t.c(interfaceC34468dBk);
                return interfaceC34468dBk;
            }
        }

        /* compiled from: DaggerSbcDispatchEditFragmentComponent.java */
        public static final class e implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.sbc.dispatch_edit.di.c f260074a;

            public e(com.avito.android.sbc.dispatch_edit.di.c cVar) {
                this.f260074a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f260074a.b();
                dagger.internal.t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public c(com.avito.android.sbc.dispatch_edit.di.c cVar, C28478k c28478k, Long l12, C7799a c7799a) {
            l lVarA = l.a(l12);
            this.f260061b = new f(lVarA, new d(cVar));
            this.f260064e = new com.avito.android.sbc.dispatch_edit.mvi.d(lVarA, new C7801c(cVar), new C7800a(cVar));
            x xVar = new x(new b(cVar));
            this.f260066g = new m(xVar, new w(xVar));
            this.f260067h = new e(cVar);
            this.f260068i = com.avito.android.actions_sheet.a.s(l.a(c28478k), this.f260067h);
            this.f260069j = new t(new i(this.f260061b, this.f260064e, k.a(), this.f260066g, this.f260068i));
        }

        @Override // com.avito.android.sbc.dispatch_edit.di.b
        public final void a(SbcDispatchEditFragment sbcDispatchEditFragment) {
            sbcDispatchEditFragment.f260033n0 = this.f260069j;
            sbcDispatchEditFragment.f260035p0 = this.f260068i.get();
        }
    }

    public static b.a a() {
        return new b();
    }
}
