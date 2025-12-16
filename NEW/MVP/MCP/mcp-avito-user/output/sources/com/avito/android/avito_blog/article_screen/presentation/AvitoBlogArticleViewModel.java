package com.avito.android.avito_blog.article_screen.presentation;

import Y61.k;
import android.net.Uri;
import androidx.view.M0;
import b31.C25402a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.x;
import com.avito.android.util.architecture_components.D;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AvitoBlogArticleViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/avito_blog/article_screen/presentation/AvitoBlogArticleViewModel;", "Landroidx/lifecycle/M0;", "a", "b", "ViewState", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoBlogArticleViewModel extends M0 {

    /* renamed from: E, reason: collision with root package name */
    @k
    public final x f97929E;

    /* renamed from: J, reason: collision with root package name */
    @k
    public final ScreenPerformanceTracker f97930J;

    /* renamed from: K, reason: collision with root package name */
    public int f97931K;

    /* renamed from: L, reason: collision with root package name */
    @k
    public final D<ViewState> f97932L;

    /* renamed from: M, reason: collision with root package name */
    @k
    public final D f97933M;

    /* renamed from: N, reason: collision with root package name */
    @k
    public final D<b> f97934N;

    /* renamed from: O, reason: collision with root package name */
    @k
    public final D f97935O;

    /* renamed from: P, reason: collision with root package name */
    @k
    public final io.reactivex.rxjava3.disposables.c f97936P;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AvitoBlogArticleViewModel.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_blog/article_screen/presentation/AvitoBlogArticleViewModel$ViewState;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ViewState {

        /* renamed from: b, reason: collision with root package name */
        public static final ViewState f97937b;

        /* renamed from: c, reason: collision with root package name */
        public static final ViewState f97938c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ ViewState[] f97939d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f97940e;

        static {
            ViewState viewState = new ViewState("LOADING", 0);
            f97937b = viewState;
            ViewState viewState2 = new ViewState("CONTENT", 1);
            f97938c = viewState2;
            ViewState[] viewStateArr = {viewState, viewState2};
            f97939d = viewStateArr;
            f97940e = kotlin.enums.c.a(viewStateArr);
        }

        public ViewState() {
            throw null;
        }

        public static ViewState valueOf(String str) {
            return (ViewState) Enum.valueOf(ViewState.class, str);
        }

        public static ViewState[] values() {
            return (ViewState[]) f97939d.clone();
        }
    }

    /* compiled from: AvitoBlogArticleViewModel.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/avito_blog/article_screen/presentation/AvitoBlogArticleViewModel$a;", "", "<init>", "()V", "", "BLOG_WITHOUT_NAVIGATION_KEY", "Ljava/lang/String;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AvitoBlogArticleViewModel.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/avito_blog/article_screen/presentation/AvitoBlogArticleViewModel$b;", "", "<init>", "()V", "a", "b", "c", "Lcom/avito/android/avito_blog/article_screen/presentation/AvitoBlogArticleViewModel$b$a;", "Lcom/avito/android/avito_blog/article_screen/presentation/AvitoBlogArticleViewModel$b$b;", "Lcom/avito/android/avito_blog/article_screen/presentation/AvitoBlogArticleViewModel$b$c;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b {

        /* compiled from: AvitoBlogArticleViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_blog/article_screen/presentation/AvitoBlogArticleViewModel$b$a;", "Lcom/avito/android/avito_blog/article_screen/presentation/AvitoBlogArticleViewModel$b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final DeepLink f97941a;

            public a(@k DeepLink deepLink) {
                super(null);
                this.f97941a = deepLink;
            }
        }

        /* compiled from: AvitoBlogArticleViewModel.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_blog/article_screen/presentation/AvitoBlogArticleViewModel$b$b;", "Lcom/avito/android/avito_blog/article_screen/presentation/AvitoBlogArticleViewModel$b;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.avito_blog.article_screen.presentation.AvitoBlogArticleViewModel$b$b, reason: collision with other inner class name */
        public static final class C2934b extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Uri f97942a;

            public C2934b(@k Uri uri) {
                super(null);
                this.f97942a = uri;
            }
        }

        /* compiled from: AvitoBlogArticleViewModel.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avito_blog/article_screen/presentation/AvitoBlogArticleViewModel$b$c;", "Lcom/avito/android/avito_blog/article_screen/presentation/AvitoBlogArticleViewModel$b;", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c extends b {

            /* renamed from: a, reason: collision with root package name */
            @k
            public static final c f97943a = new c();

            public c() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new a(null);
    }

    public AvitoBlogArticleViewModel(@k x xVar, @k ScreenPerformanceTracker screenPerformanceTracker) {
        this.f97929E = xVar;
        this.f97930J = screenPerformanceTracker;
        D<ViewState> d12 = new D<>();
        this.f97932L = d12;
        this.f97933M = d12;
        D<b> d13 = new D<>();
        this.f97934N = d13;
        this.f97935O = d13;
        this.f97936P = new io.reactivex.rxjava3.disposables.c();
    }

    public final void ke(@k C25402a c25402a) {
        this.f97936P.b(c25402a.v0(new com.avito.android.avito_blog.article_screen.presentation.a(this), com.avito.android.avito_blog.article_screen.presentation.b.f97945b, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // androidx.view.M0
    public final void onCleared() {
        this.f97936P.e();
    }
}
