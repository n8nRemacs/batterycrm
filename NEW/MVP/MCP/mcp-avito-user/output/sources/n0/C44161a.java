package n0;

import Y61.k;
import Y61.l;
import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.layer.D;
import kotlin.Metadata;

/* compiled from: ViewLayerContainer.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ln0/a;", "Landroid/view/ViewGroup;", "", "getChildCount", "()I", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: n0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C44161a extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public boolean f414843b;

    public final void a(@k M m12, @k View view, long j12) {
        Canvas canvas = C22247d.f39473a;
        super.drawChild(((C22245c) m12).f39351a, view, j12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@k Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            if (((D) getChildAt(i12)).isInvalidated) {
                this.f414843b = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f414843b = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f414843b) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @l
    public final ViewParent invalidateChildInParent(@l int[] iArr, @l Rect rect) {
        return null;
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
    }
}
