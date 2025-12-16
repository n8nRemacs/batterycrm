package com.avito.android.feedback_adverts.di;

import Cd.D;
import Cd.F;
import android.content.res.Resources;
import androidx.fragment.app.Fragment;
import androidx.view.R0;
import com.avito.android.C30277e1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.feedback_adverts.FeedbackAdvertsFragment;
import com.avito.android.feedback_adverts.adapter.c;
import com.avito.android.feedback_adverts.di.d;
import com.avito.android.feedback_adverts.g;
import com.avito.android.feedback_adverts.o;
import com.avito.android.feedback_adverts.p;
import com.avito.android.feedback_adverts.q;
import com.avito.android.mvi.rx3.with_monolithic_state.t;
import com.avito.android.util.InterfaceC35741a1;
import com.avito.android.util.InterfaceC35745a5;
import dagger.internal.B;
import dagger.internal.q;
import dagger.internal.u;
import ru.avito.messenger.C47743i;
import ru.avito.messenger.F0;
import ru.avito.messenger.InterfaceC47842z;

/* compiled from: DaggerFeedbackAdvertsFragmentComponent.java */
@dagger.internal.e
/* loaded from: classes13.dex */
public final class b {

    /* compiled from: DaggerFeedbackAdvertsFragmentComponent.java */
    /* renamed from: com.avito.android.feedback_adverts.di.b$b, reason: collision with other inner class name */
    public static final class C4607b implements d.a {
        public C4607b() {
        }

        @Override // com.avito.android.feedback_adverts.di.d.a
        public final d a(String str, String str2, FeedbackAdvertsFragment feedbackAdvertsFragment, com.avito.android.feedback_adverts.di.c cVar) {
            return new c(cVar, str, str2, feedbackAdvertsFragment, null);
        }
    }

    /* compiled from: DaggerFeedbackAdvertsFragmentComponent.java */
    public static final class c implements com.avito.android.feedback_adverts.di.d {

        /* renamed from: a, reason: collision with root package name */
        public final Fragment f157778a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.feedback_adverts.di.c f157779b;

        /* renamed from: c, reason: collision with root package name */
        public final u<InterfaceC35745a5> f157780c;

        /* renamed from: d, reason: collision with root package name */
        public final dagger.internal.l f157781d;

        /* renamed from: e, reason: collision with root package name */
        public final dagger.internal.f f157782e;

        /* renamed from: f, reason: collision with root package name */
        public final h f157783f;

        /* renamed from: g, reason: collision with root package name */
        public final u<InterfaceC35741a1> f157784g;

        /* renamed from: h, reason: collision with root package name */
        public final u<Resources> f157785h;

        /* renamed from: i, reason: collision with root package name */
        public final u<t<o.b>> f157786i;

        /* renamed from: j, reason: collision with root package name */
        public final q f157787j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC47842z> f157788k;

        /* renamed from: l, reason: collision with root package name */
        public final dagger.internal.l f157789l;

        /* renamed from: m, reason: collision with root package name */
        public final dagger.internal.l f157790m;

        /* renamed from: n, reason: collision with root package name */
        public final u<t<g.c>> f157791n;

        /* renamed from: o, reason: collision with root package name */
        public final com.avito.android.feedback_adverts.m f157792o;

        /* renamed from: p, reason: collision with root package name */
        public final u<c.a> f157793p;

        /* renamed from: q, reason: collision with root package name */
        public final u<com.avito.android.feedback_adverts.adapter.c> f157794q;

        /* renamed from: r, reason: collision with root package name */
        public final u<com.avito.konveyor.a> f157795r;

        /* renamed from: s, reason: collision with root package name */
        public final u<com.avito.konveyor.adapter.a> f157796s;

        /* renamed from: t, reason: collision with root package name */
        public final u<F0> f157797t;

        /* renamed from: u, reason: collision with root package name */
        public final u<C30277e1> f157798u;

        /* renamed from: v, reason: collision with root package name */
        public final C47743i f157799v;

        /* compiled from: DaggerFeedbackAdvertsFragmentComponent.java */
        public static final class a implements u<InterfaceC35741a1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.feedback_adverts.di.c f157800a;

            public a(com.avito.android.feedback_adverts.di.c cVar) {
                this.f157800a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35741a1 interfaceC35741a1N = this.f157800a.n();
                dagger.internal.t.c(interfaceC35741a1N);
                return interfaceC35741a1N;
            }
        }

        /* compiled from: DaggerFeedbackAdvertsFragmentComponent.java */
        /* renamed from: com.avito.android.feedback_adverts.di.b$c$b, reason: collision with other inner class name */
        public static final class C4608b implements u<InterfaceC47842z> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.feedback_adverts.di.c f157801a;

            public C4608b(com.avito.android.feedback_adverts.di.c cVar) {
                this.f157801a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f157801a.d0();
            }
        }

        /* compiled from: DaggerFeedbackAdvertsFragmentComponent.java */
        /* renamed from: com.avito.android.feedback_adverts.di.b$c$c, reason: collision with other inner class name */
        public static final class C4609c implements u<C30277e1> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.feedback_adverts.di.c f157802a;

            public C4609c(com.avito.android.feedback_adverts.di.c cVar) {
                this.f157802a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f157802a.C();
            }
        }

        /* compiled from: DaggerFeedbackAdvertsFragmentComponent.java */
        public static final class d implements u<InterfaceC35745a5> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.feedback_adverts.di.c f157803a;

            public d(com.avito.android.feedback_adverts.di.c cVar) {
                this.f157803a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC35745a5 interfaceC35745a5D = this.f157803a.d();
                dagger.internal.t.c(interfaceC35745a5D);
                return interfaceC35745a5D;
            }
        }

        /* compiled from: DaggerFeedbackAdvertsFragmentComponent.java */
        public static final class e implements u<F0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.feedback_adverts.di.c f157804a;

            public e(com.avito.android.feedback_adverts.di.c cVar) {
                this.f157804a = cVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f157804a.B0();
            }
        }

        public c(com.avito.android.feedback_adverts.di.c cVar, String str, String str2, Fragment fragment, a aVar) {
            this.f157778a = fragment;
            this.f157779b = cVar;
            this.f157780c = new d(cVar);
            this.f157781d = dagger.internal.l.a(fragment);
            dagger.internal.f fVar = new dagger.internal.f();
            this.f157782e = fVar;
            dagger.internal.l lVar = this.f157781d;
            this.f157783f = new h(fVar, lVar);
            this.f157784g = new a(cVar);
            this.f157785h = dagger.internal.g.d(new l(lVar));
            u<t<o.b>> uVarD = dagger.internal.g.d(new k(this.f157780c));
            this.f157786i = uVarD;
            this.f157787j = new q(this.f157780c, this.f157783f, this.f157784g, this.f157785h, uVarD);
            this.f157788k = new C4608b(cVar);
            this.f157789l = dagger.internal.l.b(str);
            this.f157790m = dagger.internal.l.a(str2);
            u<t<g.c>> uVarD2 = dagger.internal.g.d(new i(this.f157780c));
            this.f157791n = uVarD2;
            this.f157792o = new com.avito.android.feedback_adverts.m(this.f157789l, this.f157790m, uVarD2, this.f157780c, this.f157788k);
            q.b bVarA = dagger.internal.q.a(2);
            bVarA.a(p.class, this.f157787j);
            bVarA.a(com.avito.android.feedback_adverts.h.class, this.f157792o);
            dagger.internal.f.a(this.f157782e, B.a(new F(bVarA.b())));
            u<c.a> uVarD3 = dagger.internal.g.d(new j(this.f157782e, this.f157781d));
            this.f157793p = uVarD3;
            u<com.avito.android.feedback_adverts.adapter.c> uVarD4 = dagger.internal.g.d(new com.avito.android.feedback_adverts.adapter.f(uVarD3));
            this.f157794q = uVarD4;
            u<com.avito.konveyor.a> uVarD5 = dagger.internal.g.d(new m(new com.avito.android.feedback_adverts.adapter.b(uVarD4), com.avito.android.feedback_adverts.adapter.j.a()));
            this.f157795r = uVarD5;
            this.f157796s = dagger.internal.g.d(new f(uVarD5));
            this.f157799v = new C47743i(new e(cVar), new C4609c(cVar));
        }

        @Override // com.avito.android.feedback_adverts.di.d
        public final void a(FeedbackAdvertsFragment feedbackAdvertsFragment) {
            D d12 = (D) this.f157782e.get();
            com.avito.android.feedback_adverts.di.e.f157805a.getClass();
            feedbackAdvertsFragment.f157728n0 = (o) R0.a(this.f157778a, d12).a(p.class);
            feedbackAdvertsFragment.f157729o0 = this.f157796s.get();
            feedbackAdvertsFragment.f157730p0 = this.f157795r.get();
            InterfaceC28373a interfaceC28373aA = this.f157779b.a();
            dagger.internal.t.c(interfaceC28373aA);
            feedbackAdvertsFragment.f157731q0 = interfaceC28373aA;
            feedbackAdvertsFragment.f157732r0 = this.f157799v;
        }
    }

    public static d.a a() {
        return new C4607b();
    }
}
