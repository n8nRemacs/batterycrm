package com.avito.android.avito_blog.article_screen.ui;

import Y41.l;
import Y61.k;
import android.net.Uri;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.avito.android.R;
import com.avito.android.avito_blog.article_screen.presentation.AvitoBlogArticleViewModel;
import com.avito.android.avito_blog.article_screen.ui.AvitoBlogArticleActivity;
import com.yatatsu.powerwebview.PowerWebView;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: AvitoBlogArticleView.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/avito_blog/article_screen/ui/f;", "", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final Y41.a<G0> f97958a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Toolbar f97959b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PowerWebView f97960c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final View f97961d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final com.avito.android.ui.view.d f97962e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a f97963f;

    /* compiled from: AvitoBlogArticleView.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_blog/article_screen/ui/f$a;", "Lcom/yatatsu/powerwebview/d;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.yatatsu.powerwebview.d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final l<Uri, Boolean> f97964a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public String f97965b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k l<? super Uri, Boolean> lVar) {
            this.f97964a = lVar;
        }

        @Override // com.yatatsu.powerwebview.d
        public final boolean b(boolean z12, @k Uri uri) {
            if (L.f(uri.toString(), this.f97965b)) {
                return false;
            }
            return ((Boolean) ((AvitoBlogArticleActivity.b) this.f97964a).invoke(uri)).booleanValue();
        }
    }

    /* compiled from: AvitoBlogArticleView.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {
        static {
            int[] iArr = new int[AvitoBlogArticleViewModel.ViewState.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                AvitoBlogArticleViewModel.ViewState viewState = AvitoBlogArticleViewModel.ViewState.f97937b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public f(@k View view, @k l<? super Uri, Boolean> lVar, @k Y41.a<G0> aVar) {
        this.f97958a = aVar;
        View viewFindViewById = view.findViewById(R.id.toolbar);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.appcompat.widget.Toolbar");
        }
        Toolbar toolbar = (Toolbar) viewFindViewById;
        toolbar.setNavigationIcon(R.drawable.ic_close_24_blue);
        this.f97959b = toolbar;
        View viewFindViewById2 = view.findViewById(R.id.web_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.yatatsu.powerwebview.PowerWebView");
        }
        PowerWebView powerWebView = (PowerWebView) viewFindViewById2;
        this.f97960c = powerWebView;
        View viewFindViewById3 = view.findViewById(R.id.loading);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f97961d = viewFindViewById3;
        com.avito.android.ui.view.d dVar = new com.avito.android.ui.view.d(powerWebView);
        this.f97962e = dVar;
        a aVar2 = new a(lVar);
        this.f97963f = aVar2;
        powerWebView.setLayerType(2, null);
        powerWebView.setHorizontalScrollBarEnabled(false);
        powerWebView.setVerticalScrollBarEnabled(false);
        dVar.a(aVar2);
    }
}
