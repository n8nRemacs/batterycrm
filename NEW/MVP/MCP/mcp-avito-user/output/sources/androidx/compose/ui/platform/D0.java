package androidx.compose.ui.platform;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.graphics.C22271m;
import j.InterfaceC42164u;
import kotlin.Metadata;

/* compiled from: AndroidComposeView.android.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0017ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/D0;", "Landroidx/compose/ui/platform/B0;", "<init>", "()V", "Landroid/view/View;", "view", "Landroidx/compose/ui/graphics/A0;", "matrix", "Lkotlin/G0;", "a", "(Landroid/view/View;[F)V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@j.X
/* loaded from: classes.dex */
final class D0 implements B0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Matrix f41096a = new Matrix();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final int[] f41097b = new int[2];

    @Override // androidx.compose.ui.platform.B0
    @InterfaceC42164u
    public void a(@Y61.k View view, @Y61.k float[] matrix) {
        Matrix matrix2 = this.f41096a;
        matrix2.reset();
        view.transformMatrixToGlobal(matrix2);
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            view = parent;
            parent = view.getParent();
        }
        int[] iArr = this.f41097b;
        view.getLocationOnScreen(iArr);
        int i12 = iArr[0];
        int i13 = iArr[1];
        view.getLocationInWindow(iArr);
        matrix2.postTranslate(iArr[0] - i12, iArr[1] - i13);
        C22271m.b(matrix2, matrix);
    }
}
