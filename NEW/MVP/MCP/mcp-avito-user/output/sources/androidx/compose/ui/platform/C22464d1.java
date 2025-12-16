package androidx.compose.ui.platform;

import android.content.Context;
import android.graphics.Canvas;
import android.view.ViewGroup;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22247d;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: ViewLayerContainer.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0010\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/platform/d1;", "Landroid/view/ViewGroup;", "", "getChildCount", "()I", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.d1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C22464d1 extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    public boolean f41429b;

    public C22464d1(@Y61.k Context context) {
        super(context);
        setClipChildren(false);
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    public final void a(@Y61.k androidx.compose.ui.graphics.M m12, @Y61.k C22548y2 c22548y2, long j12) {
        Canvas canvas = C22247d.f39473a;
        super.drawChild(((C22245c) m12).f39351a, c22548y2, j12);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@Y61.k Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            if (((C22548y2) getChildAt(i12)).isInvalidated) {
                this.f41429b = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.f41429b = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.f41429b) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
    }
}
