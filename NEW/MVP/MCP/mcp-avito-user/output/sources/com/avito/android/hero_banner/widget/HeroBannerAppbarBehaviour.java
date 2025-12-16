package com.avito.android.hero_banner.widget;

import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.avito.android.R;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: HeroBannerAppbarBehaviour.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/hero_banner/widget/HeroBannerAppbarBehaviour;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "_avito_bx-content_widget_hero-banner_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HeroBannerAppbarBehaviour extends AppBarLayout.Behavior {

    /* renamed from: q, reason: collision with root package name */
    public final float f161866q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f161867r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public CollapsingToolbarLayout f161868s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public View f161869t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public AppBarLayout f161870u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public View f161871v;

    public HeroBannerAppbarBehaviour() {
        this(0.0f, 1, null);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    public final void I(@Y61.k CoordinatorLayout coordinatorLayout, @Y61.k AppBarLayout appBarLayout, int i12) {
        super.I(coordinatorLayout, appBarLayout, i12);
        if (this.f161868s == null) {
            this.f161868s = (CollapsingToolbarLayout) appBarLayout.findViewById(R.id.hero_banner_collapsing_toolbar);
            this.f161869t = appBarLayout.findViewById(R.id.hero_banner);
            this.f161870u = appBarLayout;
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: J */
    public final void n(@Y61.k CoordinatorLayout coordinatorLayout, @Y61.k AppBarLayout appBarLayout, @Y61.k View view, int i12, int i13, @Y61.k int[] iArr, int i14) {
        if (this.f161867r) {
            i13 = 0;
        }
        super.n(coordinatorLayout, appBarLayout, view, i12, i13, iArr, i14);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: K */
    public final void o(@Y61.k CoordinatorLayout coordinatorLayout, @Y61.k AppBarLayout appBarLayout, @Y61.k View view, int i12, int i13, int i14, int i15, int i16, @Y61.k int[] iArr) {
        super.o(coordinatorLayout, appBarLayout, view, i12, i13, i14, this.f161867r ? 0 : i15, i16, iArr);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, com.google.android.material.appbar.k, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final /* bridge */ /* synthetic */ boolean j(CoordinatorLayout coordinatorLayout, View view, int i12) {
        I(coordinatorLayout, (AppBarLayout) view, i12);
        return true;
    }

    @Override // com.google.android.material.appbar.k
    public final boolean y(int i12) {
        float f12 = 1 - kotlin.ranges.s.f(Math.abs(i12) / this.f161866q, 0.0f, 1.0f);
        AppBarLayout appBarLayout = this.f161870u;
        if (appBarLayout != null) {
            appBarLayout.setAlpha(f12);
        }
        View view = this.f161871v;
        if (view != null) {
            view.setAlpha(f12);
        }
        View view2 = this.f161869t;
        if (view2 != null) {
            view2.setAlpha(f12);
        }
        return super.y(i12);
    }

    public /* synthetic */ HeroBannerAppbarBehaviour(float f12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? 0.0f : f12);
    }

    public HeroBannerAppbarBehaviour(float f12) {
        this.f161866q = f12;
    }
}
