package com.avito.android.home.appending_item;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FillParentFrameLayout.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/home/appending_item/FillParentFrameLayout;", "Landroid/widget/FrameLayout;", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FillParentFrameLayout extends FrameLayout implements ViewTreeObserver.OnPreDrawListener {
    @j
    public FillParentFrameLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int bottom;
        int bottom2;
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null && (bottom2 = (bottom = viewGroup.getBottom()) - getTop()) != bottom && bottom2 > 0) {
            i13 = View.MeasureSpec.makeMeasureSpec(bottom2, 1073741824);
        }
        super.onMeasure(i12, i13);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        getViewTreeObserver().removeOnPreDrawListener(this);
        requestLayout();
        return false;
    }

    public FillParentFrameLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        getViewTreeObserver().addOnPreDrawListener(this);
    }
}
