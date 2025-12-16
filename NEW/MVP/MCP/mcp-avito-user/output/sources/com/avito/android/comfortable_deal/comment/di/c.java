package com.avito.android.comfortable_deal.comment.di;

import Jp.InterfaceC14233a;
import Y41.l;
import com.avito.android.P;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.comfortable_deal.comment.CommentDialog;
import com.avito.android.comfortable_deal.comment.di.a;
import com.avito.android.comfortable_deal.comment.h;
import com.avito.android.comfortable_deal.comment.model.CommentArguments;
import com.avito.android.comfortable_deal.comment.mvi.j;
import com.avito.android.util.R0;
import cp.InterfaceC39387a;
import d20.C39487a;
import dagger.internal.e;
import dagger.internal.t;
import dagger.internal.u;
import kotlin.G0;
import mp.InterfaceC44113a;

/* compiled from: DaggerCommentComponent.java */
@e
/* loaded from: classes12.dex */
public final class c {

    /* compiled from: DaggerCommentComponent.java */
    public static final class b implements com.avito.android.comfortable_deal.comment.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final l<? super InterfaceC44113a, G0> f120514a;

        /* renamed from: b, reason: collision with root package name */
        public final u<InterfaceC39387a> f120515b;

        /* renamed from: c, reason: collision with root package name */
        public final u<R0> f120516c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC14233a> f120517d;

        /* renamed from: e, reason: collision with root package name */
        public final u<AK0.l> f120518e;

        /* renamed from: f, reason: collision with root package name */
        public final u<P> f120519f;

        /* renamed from: g, reason: collision with root package name */
        public final u<C39487a> f120520g;

        /* renamed from: h, reason: collision with root package name */
        public final com.avito.android.comfortable_deal.comment.mvi.c f120521h;

        /* renamed from: i, reason: collision with root package name */
        public final dagger.internal.l f120522i;

        /* renamed from: j, reason: collision with root package name */
        public final h f120523j;

        /* renamed from: k, reason: collision with root package name */
        public final u<InterfaceC28481c> f120524k;

        /* renamed from: l, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f120525l;

        /* compiled from: DaggerCommentComponent.java */
        public static final class a implements u<InterfaceC14233a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120526a;

            public a(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120526a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC14233a interfaceC14233aV8 = this.f120526a.v8();
                t.c(interfaceC14233aV8);
                return interfaceC14233aV8;
            }
        }

        /* compiled from: DaggerCommentComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.comment.di.c$b$b, reason: collision with other inner class name */
        public static final class C3547b implements u<InterfaceC39387a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120527a;

            public C3547b(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120527a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC39387a interfaceC39387aQ2 = this.f120527a.Q2();
                t.c(interfaceC39387aQ2);
                return interfaceC39387aQ2;
            }
        }

        /* compiled from: DaggerCommentComponent.java */
        /* renamed from: com.avito.android.comfortable_deal.comment.di.c$b$c, reason: collision with other inner class name */
        public static final class C3548c implements u<P> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120528a;

            public C3548c(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120528a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f120528a.E();
            }
        }

        /* compiled from: DaggerCommentComponent.java */
        public static final class d implements u<R0> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120529a;

            public d(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120529a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                R0 r0C = this.f120529a.c();
                t.c(r0C);
                return r0C;
            }
        }

        /* compiled from: DaggerCommentComponent.java */
        public static final class e implements u<C39487a> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120530a;

            public e(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120530a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f120530a.M2();
            }
        }

        /* compiled from: DaggerCommentComponent.java */
        public static final class f implements u<AK0.l> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120531a;

            public f(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120531a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                return this.f120531a.r();
            }
        }

        /* compiled from: DaggerCommentComponent.java */
        public static final class g implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.comfortable_deal.di.a f120532a;

            public g(com.avito.android.comfortable_deal.di.a aVar) {
                this.f120532a = aVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cB = this.f120532a.b();
                t.c(interfaceC28481cB);
                return interfaceC28481cB;
            }
        }

        public b() {
            throw null;
        }

        public b(com.avito.android.comfortable_deal.di.a aVar, C28478k c28478k, CommentArguments commentArguments, l lVar, a aVar2) {
            this.f120514a = lVar;
            this.f120521h = new com.avito.android.comfortable_deal.comment.mvi.c(new com.avito.android.comfortable_deal.repository.l(new f(aVar), new C3548c(aVar), new e(aVar), new C3547b(aVar), new d(aVar), new a(aVar)));
            this.f120522i = dagger.internal.l.a(commentArguments);
            this.f120523j = new h(new com.avito.android.comfortable_deal.comment.mvi.f(this.f120521h, com.avito.android.comfortable_deal.comment.mvi.h.a(), j.a(), this.f120522i));
            this.f120524k = new g(aVar);
            this.f120525l = com.avito.android.actions_sheet.a.s(dagger.internal.l.a(c28478k), this.f120524k);
        }

        @Override // com.avito.android.comfortable_deal.comment.di.a
        public final void a(CommentDialog commentDialog) {
            commentDialog.f120478h0 = this.f120523j;
            commentDialog.f120480j0 = this.f120525l.get();
            commentDialog.f120481k0 = new com.avito.android.comfortable_deal.comment.d(this.f120514a);
        }
    }

    /* compiled from: DaggerCommentComponent.java */
    /* renamed from: com.avito.android.comfortable_deal.comment.di.c$c, reason: collision with other inner class name */
    public static final class C3549c implements a.InterfaceC3546a {
        public C3549c() {
        }

        @Override // com.avito.android.comfortable_deal.comment.di.a.InterfaceC3546a
        public final com.avito.android.comfortable_deal.comment.di.a a(com.avito.android.comfortable_deal.di.a aVar, C28478k c28478k, CommentArguments commentArguments, l<? super InterfaceC44113a, G0> lVar) {
            return new b(aVar, c28478k, commentArguments, lVar, null);
        }
    }

    public static a.InterfaceC3546a a() {
        return new C3549c();
    }
}
