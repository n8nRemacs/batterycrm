package com.avito.beduin.v2.component.lazy_column.android_view;

import Y61.k;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: ScrollDirectionAwareRecyclerView.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/beduin/v2/component/lazy_column/android_view/e;", "Landroidx/recyclerview/widget/RecyclerView;", "", "slopConstant", "Lkotlin/G0;", "setScrollingTouchSlop", "(I)V", "android-view_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e extends RecyclerView {

    /* renamed from: F0, reason: collision with root package name */
    public int f335901F0;

    /* renamed from: G0, reason: collision with root package name */
    public int f335902G0;

    /* renamed from: H0, reason: collision with root package name */
    public int f335903H0;

    /* renamed from: I0, reason: collision with root package name */
    public int f335904I0;

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@k MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            this.f335901F0 = motionEvent.getPointerId(0);
            this.f335902G0 = (int) (motionEvent.getX() + 0.5f);
            this.f335903H0 = (int) (motionEvent.getY() + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        if (actionMasked != 2) {
            if (actionMasked != 5) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            this.f335901F0 = motionEvent.getPointerId(actionIndex);
            this.f335902G0 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.f335903H0 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            return super.onInterceptTouchEvent(motionEvent);
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(this.f335901F0);
        if (iFindPointerIndex < 0) {
            return false;
        }
        int x12 = (int) (motionEvent.getX(iFindPointerIndex) + 0.5f);
        int y12 = (int) (motionEvent.getY(iFindPointerIndex) + 0.5f);
        if (getScrollState() == 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int i12 = x12 - this.f335902G0;
        int i13 = y12 - this.f335903H0;
        RecyclerView.m layoutManager = getLayoutManager();
        boolean zI2 = layoutManager != null ? layoutManager.I() : false;
        RecyclerView.m layoutManager2 = getLayoutManager();
        boolean zJ2 = layoutManager2 != null ? layoutManager2.J() : false;
        boolean z12 = zI2 && Math.abs(i12) > this.f335904I0 && (Math.abs(i12) >= Math.abs(i13) || zJ2);
        if (zJ2 && Math.abs(i13) > this.f335904I0 && (Math.abs(i13) >= Math.abs(i12) || zI2)) {
            z12 = true;
        }
        return z12 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setScrollingTouchSlop(int slopConstant) {
        super.setScrollingTouchSlop(slopConstant);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (slopConstant == 0) {
            this.f335904I0 = viewConfiguration.getScaledTouchSlop();
        } else {
            if (slopConstant != 1) {
                return;
            }
            this.f335904I0 = viewConfiguration.getScaledPagingTouchSlop();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z12) {
    }
}
