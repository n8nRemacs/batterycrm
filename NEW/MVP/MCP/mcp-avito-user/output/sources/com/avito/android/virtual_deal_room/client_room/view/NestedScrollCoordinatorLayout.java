package com.avito.android.virtual_deal_room.client_room.view;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.F;
import androidx.core.view.H;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NestedScrollingCoordinatorLayout.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_room/view/NestedScrollCoordinatorLayout;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroidx/core/view/F;", "", "enabled", "Lkotlin/G0;", "setNestedScrollingEnabled", "(Z)V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NestedScrollCoordinatorLayout extends CoordinatorLayout implements F {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final H f326420b;

    @j
    public NestedScrollCoordinatorLayout(@k Context context, @l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Override // android.view.View
    public final boolean dispatchNestedFling(float f12, float f13, boolean z12) {
        return this.f326420b.a(f12, f13, z12);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreFling(float f12, float f13) {
        return this.f326420b.b(f12, f13);
    }

    @Override // android.view.View
    public final boolean dispatchNestedPreScroll(int i12, int i13, @l int[] iArr, @l int[] iArr2) {
        return this.f326420b.c(i12, i13, 0, iArr, iArr2);
    }

    @Override // android.view.View
    public final boolean dispatchNestedScroll(int i12, int i13, int i14, int i15, @l int[] iArr) {
        return this.f326420b.d(i12, i13, i14, i15, iArr, 0, null);
    }

    @Override // android.view.View
    public final boolean hasNestedScrollingParent() {
        return this.f326420b.f(0);
    }

    @Override // android.view.View
    public final boolean isNestedScrollingEnabled() {
        return this.f326420b.f44937d;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(@k View view, float f12, float f13, boolean z12) {
        return this.f326420b.a(f12, f13, z12) || super.onNestedFling(view, f12, f13, z12);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(@k View view, float f12, float f13) {
        return this.f326420b.b(f12, f13) || super.onNestedPreFling(view, f12, f13);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedPreScroll(@k View view, int i12, int i13, @k int[] iArr) {
        dispatchNestedPreScroll(i12, i13, iArr, null);
        if (iArr[1] == 0) {
            super.onNestedPreScroll(view, i12, i13, iArr, 0);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.I
    public final void onNestedScroll(@k View view, int i12, int i13, int i14, int i15, int i16) {
        super.onNestedScroll(view, i12, i13, i14, i15, i16);
        this.f326420b.d(i12, i13, i14, i15, null, i16, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.I
    public final boolean onStartNestedScroll(@k View view, @k View view2, int i12, int i13) {
        return this.f326420b.h(i12, i13) || super.onStartNestedScroll(view, view2, i12, i13);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.I
    public final void onStopNestedScroll(@k View view, int i12) {
        super.onStopNestedScroll(view, i12);
        this.f326420b.i(i12);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean enabled) {
        this.f326420b.g(enabled);
    }

    @Override // android.view.View
    public final boolean startNestedScroll(int i12) {
        return this.f326420b.h(i12, 0);
    }

    @Override // android.view.View
    public final void stopNestedScroll() {
        this.f326420b.i(0);
    }

    public NestedScrollCoordinatorLayout(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.f326420b = new H(this);
        setNestedScrollingEnabled(true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onNestedScroll(@k View view, int i12, int i13, int i14, int i15) {
        super.onNestedScroll(view, i12, i13, i14, i15);
        dispatchNestedScroll(i12, i13, i14, i15, null);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final boolean onStartNestedScroll(@k View view, @k View view2, int i12) {
        return startNestedScroll(i12) || super.onStartNestedScroll(view, view2, i12);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup, android.view.ViewParent
    public final void onStopNestedScroll(@k View view) {
        super.onStopNestedScroll(view);
        stopNestedScroll();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, androidx.core.view.I
    public final void onNestedPreScroll(@k View view, int i12, int i13, @k int[] iArr, int i14) {
        this.f326420b.c(i12, i13, i14, iArr, null);
        if (iArr[1] == 0) {
            super.onNestedPreScroll(view, i12, i13, iArr, i14);
        }
    }
}
