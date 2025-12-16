package com.avito.android.avito_blog.article_screen.presentation;

import com.avito.android.analytics.screens.J;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_blog.article_screen.presentation.AvitoBlogArticleViewModel;
import com.avito.android.remote.error.ApiError;
import com.avito.android.util.V2;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import kotlin.Metadata;
import l41.g;

/* compiled from: AvitoBlogArticleViewModel.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "it", "Lkotlin/G0;", "accept", "(Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a<T> implements g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AvitoBlogArticleViewModel f97944b;

    /* compiled from: AvitoBlogArticleViewModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.avito_blog.article_screen.presentation.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C2935a {
        static {
            int[] iArr = new int[PowerWebViewStateChangeEvent.State.values().length];
            try {
                iArr[1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                PowerWebViewStateChangeEvent.State state = PowerWebViewStateChangeEvent.State.f392943b;
                iArr[3] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public a(AvitoBlogArticleViewModel avitoBlogArticleViewModel) {
        this.f97944b = avitoBlogArticleViewModel;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        PowerWebViewStateChangeEvent powerWebViewStateChangeEvent = (PowerWebViewStateChangeEvent) obj;
        int iOrdinal = powerWebViewStateChangeEvent.f392937a.ordinal();
        AvitoBlogArticleViewModel avitoBlogArticleViewModel = this.f97944b;
        if (iOrdinal == 1) {
            ScreenPerformanceTracker.a.d(avitoBlogArticleViewModel.f97930J, null, null, null, Integer.valueOf(avitoBlogArticleViewModel.f97931K), 7);
            ScreenPerformanceTracker screenPerformanceTracker = avitoBlogArticleViewModel.f97930J;
            screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
            avitoBlogArticleViewModel.f97932L.setValue(AvitoBlogArticleViewModel.ViewState.f97938c);
            avitoBlogArticleViewModel.f97931K++;
            return;
        }
        if (iOrdinal != 3) {
            ScreenPerformanceTracker.a.b(avitoBlogArticleViewModel.f97930J, null, 3);
            avitoBlogArticleViewModel.f97932L.setValue(AvitoBlogArticleViewModel.ViewState.f97937b);
            return;
        }
        ScreenPerformanceTracker screenPerformanceTracker2 = avitoBlogArticleViewModel.f97930J;
        StringBuilder sb2 = new StringBuilder("code ");
        int i12 = powerWebViewStateChangeEvent.f392941e;
        sb2.append(i12);
        ScreenPerformanceTracker.a.d(screenPerformanceTracker2, null, null, new J.a(new ApiError.UnknownError(sb2.toString(), null, null, 6, null)), Integer.valueOf(avitoBlogArticleViewModel.f97931K), 3);
        ScreenPerformanceTracker.a.c(avitoBlogArticleViewModel.f97930J, null, new J.a(new ApiError.UnknownError(AK.c.g(i12, "code "), null, null, 6, null)), Integer.valueOf(avitoBlogArticleViewModel.f97931K), 1);
        avitoBlogArticleViewModel.f97934N.setValue(AvitoBlogArticleViewModel.b.c.f97943a);
        V2.f318762a.e("AvitoBlogArticleViewModel load code " + powerWebViewStateChangeEvent + ".errorCode", null);
        avitoBlogArticleViewModel.f97931K = avitoBlogArticleViewModel.f97931K + 1;
    }
}
