package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import kotlin.Metadata;

/* compiled from: AndroidWindowInfo.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/v0;", "Landroidx/compose/ui/platform/u0;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.v0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22534v0 implements InterfaceC22530u0 {
    static {
        new C22534v0();
    }

    @Override // androidx.compose.ui.platform.InterfaceC22530u0
    @Y61.k
    public final Rect a(@Y61.k Activity activity) {
        int i12;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        int i13 = point.x;
        if (i13 == 0 || (i12 = point.y) == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = i13;
            rect.bottom = i12;
        }
        return rect;
    }
}
