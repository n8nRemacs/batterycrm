package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import j.k0;
import kotlin.Metadata;

/* compiled from: AndroidPopup.android.kt */
@k0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\ba\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/window/P;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public interface P {
    void a(@Y61.k L l12, int i12, int i13);

    void b(@Y61.k WindowManager windowManager, @Y61.k L l12, @Y61.k WindowManager.LayoutParams layoutParams);

    void c(@Y61.k View view, @Y61.k Rect rect);
}
