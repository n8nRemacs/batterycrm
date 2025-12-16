package com.avito.android.comparison;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.p6;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: HeaderRecyclerView.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/comparison/HeaderRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "progress", "Lkotlin/G0;", "setAnimationProgress", "(F)V", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HeaderRecyclerView extends RecyclerView {

    /* renamed from: F0, reason: collision with root package name */
    public float f123820F0;

    @X41.j
    public HeaderRecyclerView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void h0(@Y61.k View view) {
        if (view instanceof MotionLayout) {
            ((MotionLayout) view).setProgress(this.f123820F0);
        }
    }

    public final void setAnimationProgress(float progress) {
        this.f123820F0 = progress;
        p6 p6Var = new p6(this);
        while (p6Var.hasNext()) {
            View view = (View) p6Var.next();
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(this.f123820F0);
            }
        }
    }

    public HeaderRecyclerView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }
}
