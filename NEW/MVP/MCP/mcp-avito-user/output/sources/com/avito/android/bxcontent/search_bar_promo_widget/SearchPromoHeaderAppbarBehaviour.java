package com.avito.android.bxcontent.search_bar_promo_widget;

import android.view.View;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.avito.android.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SearchPromoHeaderAppbarBehaviour.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/search_bar_promo_widget/SearchPromoHeaderAppbarBehaviour;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SearchPromoHeaderAppbarBehaviour extends AppBarLayout.Behavior {

    /* renamed from: q, reason: collision with root package name */
    public final float f112837q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f112838r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public CollapsingToolbarLayout f112839s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public FrameLayout f112840t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public FrameLayout f112841u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public AppBarLayout f112842v;

    public SearchPromoHeaderAppbarBehaviour() {
        this(0.0f, 1, null);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    public final void I(@Y61.k CoordinatorLayout coordinatorLayout, @Y61.k AppBarLayout appBarLayout, int i12) {
        super.I(coordinatorLayout, appBarLayout, i12);
        if (this.f112839s == null) {
            this.f112839s = (CollapsingToolbarLayout) appBarLayout.getChildAt(0);
            this.f112840t = (FrameLayout) appBarLayout.findViewById(R.id.search_promo_header_background);
            this.f112841u = (FrameLayout) appBarLayout.findViewById(R.id.search_promo_header_bottom);
            this.f112842v = appBarLayout;
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: J */
    public final void n(@Y61.k CoordinatorLayout coordinatorLayout, @Y61.k AppBarLayout appBarLayout, @Y61.k View view, int i12, int i13, @Y61.k int[] iArr, int i14) {
        if (this.f112838r) {
            i13 = 0;
        }
        super.n(coordinatorLayout, appBarLayout, view, i12, i13, iArr, i14);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: K */
    public final void o(@Y61.k CoordinatorLayout coordinatorLayout, @Y61.k AppBarLayout appBarLayout, @Y61.k View view, int i12, int i13, int i14, int i15, int i16, @Y61.k int[] iArr) {
        super.o(coordinatorLayout, appBarLayout, view, i12, i13, i14, this.f112838r ? 0 : i15, i16, iArr);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.k, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final /* bridge */ /* synthetic */ boolean j(CoordinatorLayout coordinatorLayout, View view, int i12) {
        I(coordinatorLayout, (AppBarLayout) view, i12);
        return true;
    }

    @Override // com.google.android.material.appbar.k
    public final boolean y(int i12) {
        AppBarLayout appBarLayout = this.f112842v;
        if (appBarLayout != null) {
            appBarLayout.setAlpha(1 - M0.a.a((-i12) / this.f112837q, 0.0f, 1.0f));
        }
        FrameLayout frameLayout = this.f112840t;
        if (frameLayout != null) {
            frameLayout.setTranslationY(-i12);
        }
        FrameLayout frameLayout2 = this.f112841u;
        if (frameLayout2 != null) {
            frameLayout2.setTranslationY((-i12) * 2);
        }
        return super.y(i12);
    }

    public /* synthetic */ SearchPromoHeaderAppbarBehaviour(float f12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0.0f : f12);
    }

    public SearchPromoHeaderAppbarBehaviour(float f12) {
        this.f112837q = f12;
    }
}
