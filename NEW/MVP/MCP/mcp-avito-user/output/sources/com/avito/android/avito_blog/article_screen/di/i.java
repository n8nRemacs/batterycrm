package com.avito.android.avito_blog.article_screen.di;

import androidx.view.P0;
import androidx.view.T0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_blog.article_screen.di.a;
import com.avito.android.avito_blog.article_screen.presentation.AvitoBlogArticleViewModel;
import com.avito.android.avito_blog.article_screen.ui.AvitoBlogArticleActivity;
import com.avito.android.deep_linking.x;
import cv.InterfaceC39417a;
import dagger.internal.l;
import dagger.internal.t;
import dagger.internal.u;

/* compiled from: DaggerAvitoBlogArticleComponent.java */
@dagger.internal.e
/* loaded from: classes11.dex */
public final class i {

    /* compiled from: DaggerAvitoBlogArticleComponent.java */
    public static final class b implements com.avito.android.avito_blog.article_screen.di.a {

        /* renamed from: a, reason: collision with root package name */
        public final T0 f97919a;

        /* renamed from: b, reason: collision with root package name */
        public final com.avito.android.avito_blog.article_screen.di.b f97920b;

        /* renamed from: c, reason: collision with root package name */
        public final cv.b f97921c;

        /* renamed from: d, reason: collision with root package name */
        public final u<InterfaceC28481c> f97922d;

        /* renamed from: e, reason: collision with root package name */
        public final u<ScreenPerformanceTracker> f97923e;

        /* compiled from: DaggerAvitoBlogArticleComponent.java */
        public static final class a implements u<InterfaceC28481c> {

            /* renamed from: a, reason: collision with root package name */
            public final com.avito.android.avito_blog.article_screen.di.b f97924a;

            public a(com.avito.android.avito_blog.article_screen.di.b bVar) {
                this.f97924a = bVar;
            }

            @Override // javax.inject.Provider
            public final Object get() {
                InterfaceC28481c interfaceC28481cI7 = this.f97924a.i7();
                t.c(interfaceC28481cI7);
                return interfaceC28481cI7;
            }
        }

        public b(com.avito.android.avito_blog.article_screen.di.b bVar, cv.b bVar2, T0 t02, r rVar, a aVar) {
            this.f97919a = t02;
            this.f97920b = bVar;
            this.f97921c = bVar2;
            this.f97922d = new a(bVar);
            this.f97923e = dagger.internal.g.d(new f(l.a(rVar), this.f97922d));
        }

        @Override // com.avito.android.avito_blog.article_screen.di.a
        public final void a(AvitoBlogArticleActivity avitoBlogArticleActivity) {
            com.avito.android.avito_blog.article_screen.di.b bVar = this.f97920b;
            x xVarT = bVar.t();
            t.c(xVarT);
            com.avito.android.avito_blog.article_screen.presentation.c cVar = new com.avito.android.avito_blog.article_screen.presentation.c(xVarT, this.f97923e.get());
            com.avito.android.avito_blog.article_screen.di.c.f97916a.getClass();
            avitoBlogArticleActivity.f97949m = (AvitoBlogArticleViewModel) new P0(this.f97919a, cVar).a(AvitoBlogArticleViewModel.class);
            com.avito.android.deeplink_handler.handler.composite.a aVarU4 = this.f97921c.u4();
            t.c(aVarU4);
            avitoBlogArticleActivity.f97950n = aVarU4;
            avitoBlogArticleActivity.f97951o = bVar.h();
            avitoBlogArticleActivity.f97952p = this.f97923e.get();
            InterfaceC28373a interfaceC28373aA = bVar.a();
            t.c(interfaceC28373aA);
            avitoBlogArticleActivity.f97953q = interfaceC28373aA;
        }
    }

    /* compiled from: DaggerAvitoBlogArticleComponent.java */
    public static final class c implements a.InterfaceC2933a {

        /* renamed from: a, reason: collision with root package name */
        public AvitoBlogArticleActivity f97925a;

        /* renamed from: b, reason: collision with root package name */
        public r f97926b;

        /* renamed from: c, reason: collision with root package name */
        public com.avito.android.avito_blog.article_screen.di.b f97927c;

        /* renamed from: d, reason: collision with root package name */
        public InterfaceC39417a f97928d;

        public c() {
        }

        @Override // com.avito.android.avito_blog.article_screen.di.a.InterfaceC2933a
        public final a.InterfaceC2933a a(InterfaceC39417a interfaceC39417a) {
            interfaceC39417a.getClass();
            this.f97928d = interfaceC39417a;
            return this;
        }

        @Override // com.avito.android.avito_blog.article_screen.di.a.InterfaceC2933a
        public final a.InterfaceC2933a b(AvitoBlogArticleActivity avitoBlogArticleActivity) {
            this.f97925a = avitoBlogArticleActivity;
            return this;
        }

        @Override // com.avito.android.avito_blog.article_screen.di.a.InterfaceC2933a
        public final com.avito.android.avito_blog.article_screen.di.a build() {
            t.a(T0.class, this.f97925a);
            t.a(r.class, this.f97926b);
            t.a(com.avito.android.avito_blog.article_screen.di.b.class, this.f97927c);
            t.a(cv.b.class, this.f97928d);
            return new b(this.f97927c, this.f97928d, this.f97925a, this.f97926b, null);
        }

        @Override // com.avito.android.avito_blog.article_screen.di.a.InterfaceC2933a
        public final a.InterfaceC2933a c(r rVar) {
            this.f97926b = rVar;
            return this;
        }

        @Override // com.avito.android.avito_blog.article_screen.di.a.InterfaceC2933a
        public final a.InterfaceC2933a d(com.avito.android.avito_blog.article_screen.di.b bVar) {
            this.f97927c = bVar;
            return this;
        }
    }

    public static a.InterfaceC2933a a() {
        return new c();
    }
}
