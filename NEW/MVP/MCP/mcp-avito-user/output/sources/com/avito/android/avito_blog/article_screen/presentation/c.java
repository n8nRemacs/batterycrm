package com.avito.android.avito_blog.article_screen.presentation;

import Y61.k;
import androidx.view.M0;
import androidx.view.P0;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.x;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AvitoBlogArticleViewModelFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_blog/article_screen/presentation/c;", "Landroidx/lifecycle/P0$c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements P0.c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final x f97946a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f97947b;

    @Inject
    public c(@k x xVar, @k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f97946a = xVar;
        this.f97947b = screenPerformanceTracker;
    }

    @Override // androidx.lifecycle.P0.c
    @k
    public final <T extends M0> T create(@k Class<T> cls) {
        return new AvitoBlogArticleViewModel(this.f97946a, this.f97947b);
    }
}
