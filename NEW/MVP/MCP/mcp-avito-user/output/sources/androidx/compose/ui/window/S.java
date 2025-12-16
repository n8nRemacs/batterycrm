package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import kotlin.Metadata;

/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/window/S;", "Landroidx/compose/ui/window/P;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
class S implements P {
    @Override // androidx.compose.ui.window.P
    public final void b(@Y61.k WindowManager windowManager, @Y61.k L l12, @Y61.k WindowManager.LayoutParams layoutParams) {
        windowManager.updateViewLayout(l12, layoutParams);
    }

    @Override // androidx.compose.ui.window.P
    public final void c(@Y61.k View view, @Y61.k Rect rect) {
        view.getWindowVisibleDisplayFrame(rect);
    }

    @Override // androidx.compose.ui.window.P
    public void a(@Y61.k L l12, int i12, int i13) {
    }
}
