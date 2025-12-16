package com.avito.android.comparison;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.avito.android.R;
import com.avito.android.util.p6;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CollapsingHeader.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/comparison/CollapsingHeader;", "Landroidx/constraintlayout/motion/widget/MotionLayout;", "Lcom/google/android/material/appbar/AppBarLayout$g;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CollapsingHeader extends MotionLayout implements AppBarLayout.g {

    /* renamed from: r0, reason: collision with root package name */
    @Y61.l
    public HeaderRecyclerView f123769r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public FrameLayout f123770s0;

    @X41.j
    public CollapsingHeader(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.b
    public final void c(@Y61.l AppBarLayout appBarLayout, int i12) {
        setProgress((-i12) / (appBarLayout != null ? appBarLayout.getTotalScrollRange() : 0.0f));
        HeaderRecyclerView headerRecyclerView = this.f123769r0;
        if (headerRecyclerView != null) {
            headerRecyclerView.setAnimationProgress(getProgress());
        }
        FrameLayout frameLayout = this.f123770s0;
        if (frameLayout != null) {
            p6 p6Var = new p6(frameLayout);
            while (p6Var.hasNext()) {
                View view = (View) p6Var.next();
                int height = ((View) view.getParent()).getHeight();
                if (height != view.getHeight()) {
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                    }
                    layoutParams.height = height;
                    view.setLayoutParams(layoutParams);
                }
                if (view instanceof MotionLayout) {
                    ((MotionLayout) view).setProgress(getProgress());
                }
            }
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        AppBarLayout appBarLayout = parent instanceof AppBarLayout ? (AppBarLayout) parent : null;
        if (appBarLayout != null) {
            appBarLayout.a(this);
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f123769r0 = (HeaderRecyclerView) findViewById(R.id.header_recycler);
        this.f123770s0 = (FrameLayout) findViewById(R.id.overlay_header_recycler);
    }

    public CollapsingHeader(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }
}
