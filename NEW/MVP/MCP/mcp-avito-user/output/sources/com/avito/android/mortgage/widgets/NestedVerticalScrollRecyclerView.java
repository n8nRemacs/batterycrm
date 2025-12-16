package com.avito.android.mortgage.widgets;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.runtime.internal.P;
import androidx.core.view.J;
import androidx.core.view.L;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NestedVerticalScrollRecyclerView.kt */
@P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002J\u0019\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/mortgage/widgets/NestedVerticalScrollRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/core/view/J;", "Landroid/view/View;", "target", "Lkotlin/G0;", "setChildView", "(Landroid/view/View;)V", "", "getNestedScrollAxes", "()I", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class NestedVerticalScrollRecyclerView extends RecyclerView implements J {

    /* renamed from: F0, reason: collision with root package name */
    @l
    public View f203955F0;

    /* renamed from: G0, reason: collision with root package name */
    public boolean f203956G0;

    /* renamed from: H0, reason: collision with root package name */
    @k
    public final L f203957H0;

    @j
    public NestedVerticalScrollRecyclerView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void setChildView(View target) {
        this.f203955F0 = target;
        this.f203956G0 = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@k MotionEvent motionEvent) {
        if (this.f203955F0 == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        requestDisallowInterceptTouchEvent(true);
        boolean zDispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        requestDisallowInterceptTouchEvent(false);
        return (!zDispatchTouchEvent || this.f203956G0) ? super.dispatchTouchEvent(motionEvent) : zDispatchTouchEvent;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f203957H0.a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(@k View view, int i12, int i13, int i14, int i15) {
        if (!view.equals(this.f203955F0) || i15 == 0) {
            return;
        }
        this.f203956G0 = true;
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // androidx.core.view.I
    public final void onNestedScrollAccepted(@k View view, @k View view2, int i12, int i13) {
        if ((i12 & 2) != 0) {
            setChildView(view2);
        }
        L l12 = this.f203957H0;
        if (i13 == 1) {
            l12.f44969b = i12;
        } else {
            l12.f44968a = i12;
        }
    }

    @Override // androidx.core.view.I
    public final boolean onStartNestedScroll(@k View view, @k View view2, int i12, int i13) {
        return (i12 & 2) != 0;
    }

    @Override // androidx.core.view.I
    public final void onStopNestedScroll(@k View view, int i12) {
        setChildView(null);
        L l12 = this.f203957H0;
        if (i12 == 1) {
            l12.f44969b = 0;
        } else {
            l12.f44968a = 0;
        }
    }

    public NestedVerticalScrollRecyclerView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f203957H0 = new L();
    }
}
