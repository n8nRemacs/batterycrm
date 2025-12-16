package com.avito.android.avito_blog.article_screen.di;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_blog.article_screen.analytics.JobArticlePerfScreenConstants;
import com.avito.android.avito_blog.article_screen.di.i;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AvitoBlogArticleModule_ProvideScreenTrackerFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes11.dex */
public final class f implements dagger.internal.h<ScreenPerformanceTracker> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28481c> f97917a;

    /* renamed from: b, reason: collision with root package name */
    public final l f97918b;

    public f(l lVar, Provider provider) {
        this.f97917a = provider;
        this.f97918b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC28481c interfaceC28481c = (InterfaceC28481c) ((i.b.a) this.f97917a).get();
        r rVar = (r) this.f97918b.f393949a;
        c.f97916a.getClass();
        return interfaceC28481c.a(new C28478k(JobArticlePerfScreenConstants.JobArticleScreen.f97915d, rVar, "jobArticle"));
    }
}
