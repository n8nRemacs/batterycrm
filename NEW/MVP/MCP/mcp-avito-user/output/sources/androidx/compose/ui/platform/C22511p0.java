package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.node.LayoutNode;
import java.util.HashMap;
import kotlin.Metadata;
import s0.C47949a;

/* compiled from: AndroidViewsHandler.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001R3\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR3\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0002j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0003`\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0007\u001a\u0004\b\f\u0010\t¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/platform/p0;", "Landroid/view/ViewGroup;", "Ljava/util/HashMap;", "Landroidx/compose/ui/viewinterop/a;", "Landroidx/compose/ui/node/LayoutNode;", "Lkotlin/collections/HashMap;", "b", "Ljava/util/HashMap;", "getHolderToLayoutNode", "()Ljava/util/HashMap;", "holderToLayoutNode", "c", "getLayoutNodeToHolder", "layoutNodeToHolder", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22511p0 extends ViewGroup {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final HashMap<androidx.compose.ui.viewinterop.a, LayoutNode> holderToLayoutNode;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final HashMap<LayoutNode, androidx.compose.ui.viewinterop.a> layoutNodeToHolder;

    public C22511p0(@Y61.k Context context) {
        super(context);
        setClipChildren(false);
        this.holderToLayoutNode = new HashMap<>();
        this.layoutNodeToHolder = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(@Y61.l MotionEvent motionEvent) {
        return true;
    }

    @Y61.k
    public final HashMap<androidx.compose.ui.viewinterop.a, LayoutNode> getHolderToLayoutNode() {
        return this.holderToLayoutNode;
    }

    @Y61.k
    public final HashMap<LayoutNode, androidx.compose.ui.viewinterop.a> getLayoutNodeToHolder() {
        return this.layoutNodeToHolder;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        for (androidx.compose.ui.viewinterop.a aVar : this.holderToLayoutNode.keySet()) {
            aVar.layout(aVar.getLeft(), aVar.getTop(), aVar.getRight(), aVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14;
        if (!(View.MeasureSpec.getMode(i12) == 1073741824)) {
            C47949a.a("widthMeasureSpec should be EXACTLY");
        }
        if (!(View.MeasureSpec.getMode(i13) == 1073741824)) {
            C47949a.a("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i12), View.MeasureSpec.getSize(i13));
        for (androidx.compose.ui.viewinterop.a aVar : this.holderToLayoutNode.keySet()) {
            int i15 = aVar.f42917v;
            if (i15 != Integer.MIN_VALUE && (i14 = aVar.f42918w) != Integer.MIN_VALUE) {
                aVar.measure(i15, i14);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            LayoutNode layoutNode = this.holderToLayoutNode.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.o0(layoutNode, false, 7);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void onDescendantInvalidated(@Y61.k View view, @Y61.k View view2) {
    }
}
