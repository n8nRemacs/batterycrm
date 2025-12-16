package com.avito.android.comparison;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: GestureProxyView.kt */
@s0
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015R\"\u0010!\u001a\u00020\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/avito/android/comparison/GestureProxyView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "Landroidx/recyclerview/widget/RecyclerView;", "b", "Landroidx/recyclerview/widget/RecyclerView;", "getHeaderRecycler", "()Landroidx/recyclerview/widget/RecyclerView;", "headerRecycler", "c", "getBodyRecycler", "bodyRecycler", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "getToolbarTitle", "()Landroid/widget/TextView;", "toolbarTitle", "Landroid/widget/FrameLayout;", "e", "Landroid/widget/FrameLayout;", "getOverlayContainer", "()Landroid/widget/FrameLayout;", "overlayContainer", "f", "getOverlayHeaderRecycler", "overlayHeaderRecycler", "", "g", "Z", "getNeedResolveMotionEvent", "()Z", "setNeedResolveMotionEvent", "(Z)V", "needResolveMotionEvent", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class GestureProxyView extends CoordinatorLayout {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final RecyclerView headerRecycler;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final RecyclerView bodyRecycler;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final TextView toolbarTitle;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final FrameLayout overlayContainer;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final FrameLayout overlayHeaderRecycler;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean needResolveMotionEvent;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final CollapsingHeader f123817h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public q f123818i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public GestureDetector f123819j;

    @X41.j
    public GestureProxyView(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @Y61.k
    public final RecyclerView getBodyRecycler() {
        return this.bodyRecycler;
    }

    @Y61.k
    public final RecyclerView getHeaderRecycler() {
        return this.headerRecycler;
    }

    public final boolean getNeedResolveMotionEvent() {
        return this.needResolveMotionEvent;
    }

    @Y61.k
    public final FrameLayout getOverlayContainer() {
        return this.overlayContainer;
    }

    @Y61.k
    public final FrameLayout getOverlayHeaderRecycler() {
        return this.overlayHeaderRecycler;
    }

    @Y61.k
    public final TextView getToolbarTitle() {
        return this.toolbarTitle;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(@Y61.l MotionEvent motionEvent) {
        if (this.needResolveMotionEvent) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View
    public final boolean onTouchEvent(@Y61.l MotionEvent motionEvent) {
        GestureDetector gestureDetector;
        if (motionEvent == null || (gestureDetector = this.f123819j) == null) {
            return false;
        }
        boolean zOnTouchEvent = !this.needResolveMotionEvent ? super.onTouchEvent(motionEvent) : gestureDetector.onTouchEvent(motionEvent);
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.bodyRecycler.dispatchTouchEvent(motionEvent);
            q qVar = this.f123818i;
            if (qVar != null) {
                qVar.a(motionEvent);
            }
            super.onTouchEvent(motionEvent);
        }
        return zOnTouchEvent;
    }

    public final void setNeedResolveMotionEvent(boolean z12) {
        this.needResolveMotionEvent = z12;
    }

    public GestureProxyView(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        super(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
        this.needResolveMotionEvent = true;
        LayoutInflater.from(context).inflate(R.layout.comparison_gesture_proxy_view_content, this);
        View viewFindViewById = findViewById(R.id.header_recycler);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.headerRecycler = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.body_recycler);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        this.bodyRecycler = (RecyclerView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.collapsing_header);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.android.comparison.CollapsingHeader");
        }
        this.f123817h = (CollapsingHeader) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.toolbar_text);
        if (viewFindViewById4 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        this.toolbarTitle = (TextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.overlay_container);
        if (viewFindViewById5 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.overlayContainer = (FrameLayout) viewFindViewById5;
        View viewFindViewById6 = findViewById(R.id.overlay_header_recycler);
        if (viewFindViewById6 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        this.overlayHeaderRecycler = (FrameLayout) viewFindViewById6;
    }
}
