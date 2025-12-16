package com.avito.android.avito_blog.article_screen.ui;

import Y41.l;
import Y61.k;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.view.InterfaceC23040h0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.avito_blog.article_screen.di.a;
import com.avito.android.avito_blog.article_screen.di.i;
import com.avito.android.avito_blog.article_screen.presentation.AvitoBlogArticleViewModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.vertical_main.AvitoBlogArticle;
import com.avito.android.util.C35974x2;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.L5;
import com.avito.android.util.V2;
import com.avito.android.util.architecture_components.D;
import com.yatatsu.powerwebview.PowerWebView;
import gg.C40676a;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoBlogArticleActivity.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/avito_blog/article_screen/ui/AvitoBlogArticleActivity;", "Lcom/avito/android/ui/activity/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes11.dex */
public final class AvitoBlogArticleActivity extends com.avito.android.ui.activity.a implements InterfaceC28477j.b {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f97948s = 0;

    /* renamed from: m, reason: collision with root package name */
    @Inject
    public AvitoBlogArticleViewModel f97949m;

    /* renamed from: n, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f97950n;

    /* renamed from: o, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f97951o;

    /* renamed from: p, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f97952p;

    /* renamed from: q, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f97953q;

    /* renamed from: r, reason: collision with root package name */
    public com.avito.android.avito_blog.article_screen.ui.f f97954r;

    /* compiled from: AvitoBlogArticleActivity.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/avito_blog/article_screen/ui/AvitoBlogArticleActivity$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f97955a = new a();
    }

    /* compiled from: AvitoBlogArticleActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<Uri, Boolean> {
        @Override // Y41.l
        public final Boolean invoke(Uri uri) {
            boolean z12;
            Uri uri2 = uri;
            AvitoBlogArticleViewModel avitoBlogArticleViewModel = (AvitoBlogArticleViewModel) this.receiver;
            avitoBlogArticleViewModel.getClass();
            if (L.f(uri2.getQueryParameter("embedded"), "true")) {
                z12 = false;
            } else {
                DeepLink deepLinkE = avitoBlogArticleViewModel.f97929E.e(uri2);
                boolean z13 = deepLinkE instanceof NoMatchLink;
                D<AvitoBlogArticleViewModel.b> d12 = avitoBlogArticleViewModel.f97934N;
                if (z13) {
                    d12.setValue(new AvitoBlogArticleViewModel.b.C2934b(uri2));
                } else {
                    d12.setValue(new AvitoBlogArticleViewModel.b.a(deepLinkE));
                }
                z12 = true;
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: AvitoBlogArticleActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.a<G0> {
        @Override // Y41.a
        public final G0 invoke() {
            AvitoBlogArticleViewModel avitoBlogArticleViewModel = (AvitoBlogArticleViewModel) this.receiver;
            ScreenPerformanceTracker.a.c(avitoBlogArticleViewModel.f97930J, null, null, Integer.valueOf(avitoBlogArticleViewModel.f97931K), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: AvitoBlogArticleActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements l<AvitoBlogArticleViewModel.ViewState, G0> {
        @Override // Y41.l
        public final G0 invoke(AvitoBlogArticleViewModel.ViewState viewState) {
            com.avito.android.avito_blog.article_screen.ui.f fVar = (com.avito.android.avito_blog.article_screen.ui.f) this.receiver;
            fVar.getClass();
            int iOrdinal = viewState.ordinal();
            PowerWebView powerWebView = fVar.f97960c;
            View view = fVar.f97961d;
            if (iOrdinal == 0) {
                D6.g(powerWebView);
                D6.H(view);
            } else if (iOrdinal == 1) {
                D6.w(view);
                D6.H(powerWebView);
                fVar.f97958a.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AvitoBlogArticleActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements l<AvitoBlogArticleViewModel.b, G0> {
        @Override // Y41.l
        public final G0 invoke(AvitoBlogArticleViewModel.b bVar) {
            AvitoBlogArticleViewModel.b bVar2 = bVar;
            AvitoBlogArticleActivity avitoBlogArticleActivity = (AvitoBlogArticleActivity) this.receiver;
            int i12 = AvitoBlogArticleActivity.f97948s;
            avitoBlogArticleActivity.getClass();
            if (bVar2 instanceof AvitoBlogArticleViewModel.b.a) {
                AvitoBlogArticleViewModel.b.a aVar = (AvitoBlogArticleViewModel.b.a) bVar2;
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = avitoBlogArticleActivity.f97950n;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, aVar.f97941a, null, null, 6);
                avitoBlogArticleActivity.finish();
            } else if (bVar2 instanceof AvitoBlogArticleViewModel.b.C2934b) {
                AvitoBlogArticleViewModel.b.C2934b c2934b = (AvitoBlogArticleViewModel.b.C2934b) bVar2;
                InterfaceC35845m2 interfaceC35845m2 = avitoBlogArticleActivity.f97951o;
                if (interfaceC35845m2 == null) {
                    interfaceC35845m2 = null;
                }
                Intent intentQ = interfaceC35845m2.q(c2934b.f97942a, null);
                if (intentQ != null) {
                    C35974x2.d(intentQ);
                    try {
                        avitoBlogArticleActivity.startActivity(intentQ);
                    } catch (Exception e12) {
                        V2.f318762a.a("AvitoBlogArticleActivity", "StartActivityError", e12);
                    }
                }
            } else if (L.f(bVar2, AvitoBlogArticleViewModel.b.c.f97943a)) {
                L5.b(avitoBlogArticleActivity, avitoBlogArticleActivity.getString(R.string.serp_network_unavailable_message), 0);
                avitoBlogArticleActivity.finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AvitoBlogArticleActivity.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f implements InterfaceC23040h0, kotlin.jvm.internal.D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ H f97956b;

        /* JADX WARN: Multi-variable type inference failed */
        public f(l lVar) {
            this.f97956b = (H) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof kotlin.jvm.internal.D)) {
                return this.f97956b.equals(((kotlin.jvm.internal.D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f97956b;
        }

        public final int hashCode() {
            return this.f97956b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.H] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f97956b.invoke(obj);
        }
    }

    @Override // com.avito.android.ui.activity.a
    public final int M1() {
        return R.layout.avito_blog_article_screen;
    }

    @Override // com.avito.android.ui.activity.a
    public final void Y1(@Y61.l Bundle bundle) {
        new com.avito.android.analytics.screens.D();
        F f12 = new F();
        f12.c();
        a.InterfaceC2933a interfaceC2933aA = i.a();
        interfaceC2933aA.d((com.avito.android.avito_blog.article_screen.di.b) C29972i.a(C29972i.b(this), com.avito.android.avito_blog.article_screen.di.b.class));
        interfaceC2933aA.a(cv.c.a(this));
        interfaceC2933aA.b(this);
        interfaceC2933aA.c(s.a(this));
        interfaceC2933aA.build().a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97952p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(f12.b());
    }

    @Override // com.avito.android.ui.activity.a, androidx.fragment.app.ActivityC22955m, androidx.view.n, androidx.core.app.ActivityC22757o, android.app.Activity
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f97952p;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewK1 = K1();
        AvitoBlogArticleViewModel avitoBlogArticleViewModel = this.f97949m;
        b bVar = new b(1, avitoBlogArticleViewModel != null ? avitoBlogArticleViewModel : null, AvitoBlogArticleViewModel.class, "interceptUri", "interceptUri(Landroid/net/Uri;)Z", 0);
        AvitoBlogArticleViewModel avitoBlogArticleViewModel2 = this.f97949m;
        this.f97954r = new com.avito.android.avito_blog.article_screen.ui.f(viewK1, bVar, new c(0, avitoBlogArticleViewModel2 != null ? avitoBlogArticleViewModel2 : null, AvitoBlogArticleViewModel.class, "onContentDrawn", "onContentDrawn()V", 0));
        AvitoBlogArticleViewModel avitoBlogArticleViewModel3 = this.f97949m;
        if (avitoBlogArticleViewModel3 == null) {
            avitoBlogArticleViewModel3 = null;
        }
        D d12 = avitoBlogArticleViewModel3.f97933M;
        com.avito.android.avito_blog.article_screen.ui.f fVar = this.f97954r;
        d12.observe(this, new f(new d(1, fVar == null ? null : fVar, com.avito.android.avito_blog.article_screen.ui.f.class, "renderViewState", "renderViewState(Lcom/avito/android/avito_blog/article_screen/presentation/AvitoBlogArticleViewModel$ViewState;)V", 0)));
        AvitoBlogArticleViewModel avitoBlogArticleViewModel4 = this.f97949m;
        if (avitoBlogArticleViewModel4 == null) {
            avitoBlogArticleViewModel4 = null;
        }
        avitoBlogArticleViewModel4.f97935O.observe(this, new f(new e(1, this, AvitoBlogArticleActivity.class, "handleNavigationEvent", "handleNavigationEvent(Lcom/avito/android/avito_blog/article_screen/presentation/AvitoBlogArticleViewModel$NavigationEvents;)V", 0)));
        AvitoBlogArticleViewModel avitoBlogArticleViewModel5 = this.f97949m;
        if (avitoBlogArticleViewModel5 == null) {
            avitoBlogArticleViewModel5 = null;
        }
        com.avito.android.avito_blog.article_screen.ui.f fVar2 = this.f97954r;
        if (fVar2 == null) {
            fVar2 = null;
        }
        avitoBlogArticleViewModel5.ke(fVar2.f97962e.f304688b);
        if (bundle == null) {
            InterfaceC28373a interfaceC28373a = this.f97953q;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new C40676a());
        }
        Intent intent = getIntent();
        AvitoBlogArticle avitoBlogArticle = (AvitoBlogArticle) (Build.VERSION.SDK_INT >= 33 ? (Parcelable) intent.getParcelableExtra("articles", AvitoBlogArticle.class) : intent.getParcelableExtra("articles"));
        if (avitoBlogArticle != null) {
            com.avito.android.avito_blog.article_screen.ui.f fVar3 = this.f97954r;
            if (fVar3 == null) {
                fVar3 = null;
            }
            String title = avitoBlogArticle.getTitle();
            String url = avitoBlogArticle.getUrl();
            fVar3.f97959b.setTitle(title);
            fVar3.f97963f.f97965b = url;
            fVar3.f97962e.d(url);
        } else {
            V2.f318762a.e("AvitoBlogArticleActivity launched without article in intent", null);
            finish();
        }
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f97952p;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // androidx.appcompat.app.m, androidx.fragment.app.ActivityC22955m, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        com.avito.android.avito_blog.article_screen.ui.f fVar = this.f97954r;
        if (fVar == null) {
            fVar = null;
        }
        fVar.f97962e.f304687a.f392926d.remove(fVar.f97963f);
        fVar.f97960c.destroy();
    }
}
