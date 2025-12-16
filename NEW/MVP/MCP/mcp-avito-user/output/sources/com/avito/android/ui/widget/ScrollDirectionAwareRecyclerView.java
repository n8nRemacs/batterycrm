package com.avito.android.ui.widget;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import hw.InterfaceC41177b;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ScrollDirectionAwareRecyclerView.kt */
@InterfaceC41177b
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/ui/widget/ScrollDirectionAwareRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "slopConstant", "Lkotlin/G0;", "setScrollingTouchSlop", "(I)V", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public class ScrollDirectionAwareRecyclerView extends RecyclerView {

    /* renamed from: F0, reason: collision with root package name */
    public int f304689F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f304690G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f304691H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f304692I0;

    @j
    public ScrollDirectionAwareRecyclerView(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@k MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.f304689F0 = motionEvent.getPointerId(0);
            this.f304690G0 = (int) (motionEvent.getX() + 0.5f);
            this.f304691H0 = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked != 2) {
            if (actionMasked != 5) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f304689F0 = motionEvent.getPointerId(actionIndex);
            this.f304690G0 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f304691H0 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(this.f304689F0);
        if (iFindPointerIndex < 0) {
            return false;
        }
        int x12 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
        int y12 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i12 = x12 - this.f304690G0;
        int i13 = y12 - this.f304691H0;
        RecyclerView.m layoutManager = getLayoutManager();
        boolean zI2 = layoutManager != null ? layoutManager.I() : false;
        RecyclerView.m layoutManager2 = getLayoutManager();
        boolean zJ2 = layoutManager2 != null ? layoutManager2.J() : false;
        boolean z12 = zI2 && Math.abs(i12) > this.f304692I0 && (Math.abs(i12) >= Math.abs(i13) || zJ2);
        if (zJ2 && Math.abs(i13) > this.f304692I0 && (Math.abs(i13) >= Math.abs(i12) || zI2)) {
            z12 = true;
        }
        return z12 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int slopConstant) {
        super.setScrollingTouchSlop(slopConstant);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (slopConstant == 0) {
            this.f304692I0 = viewConfiguration.getScaledTouchSlop();
        } else {
            if (slopConstant != 1) {
                return;
            }
            this.f304692I0 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    public /* synthetic */ ScrollDirectionAwareRecyclerView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    @j
    public ScrollDirectionAwareRecyclerView(@k Context context, @l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        this.f304689F0 = -1;
        this.f304692I0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z12) {
    }
}
