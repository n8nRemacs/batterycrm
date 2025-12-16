package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import androidx.compose.ui.graphics.C22271m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/platform/C0;", "Landroidx/compose/ui/platform/B0;", "Landroidx/compose/ui/graphics/A0;", "tmpMatrix", "<init>", "([FLkotlin/jvm/internal/w;)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class C0 implements B0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final float[] f41082a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final int[] f41083b = new int[2];

    public C0(float[] fArr, C42822w c42822w) {
        this.f41082a = fArr;
    }

    @Override // androidx.compose.ui.platform.B0
    public final void a(@Y61.k View view, @Y61.k float[] fArr) {
        androidx.compose.ui.graphics.A0.e(fArr);
        b(view, fArr);
    }

    public final void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z12 = parent instanceof View;
        float[] fArr2 = this.f41082a;
        if (z12) {
            b((View) parent, fArr);
            Y41.l<? super androidx.compose.ui.text.input.P, ? extends androidx.compose.ui.text.input.P> lVar = J.f41149a;
            androidx.compose.ui.graphics.A0.e(fArr2);
            androidx.compose.ui.graphics.A0.i(fArr2, -view.getScrollX(), -view.getScrollY());
            J.b(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            androidx.compose.ui.graphics.A0.e(fArr2);
            androidx.compose.ui.graphics.A0.i(fArr2, left, top);
            J.b(fArr, fArr2);
        } else {
            int[] iArr = this.f41083b;
            view.getLocationInWindow(iArr);
            Y41.l<? super androidx.compose.ui.text.input.P, ? extends androidx.compose.ui.text.input.P> lVar2 = J.f41149a;
            androidx.compose.ui.graphics.A0.e(fArr2);
            androidx.compose.ui.graphics.A0.i(fArr2, -view.getScrollX(), -view.getScrollY());
            J.b(fArr, fArr2);
            float f12 = iArr[0];
            float f13 = iArr[1];
            androidx.compose.ui.graphics.A0.e(fArr2);
            androidx.compose.ui.graphics.A0.i(fArr2, f12, f13);
            J.b(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        C22271m.b(matrix, fArr2);
        J.b(fArr, fArr2);
    }
}
