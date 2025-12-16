package androidx.compose.ui.window;

import android.graphics.Rect;
import j.X;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/window/Q;", "Landroidx/compose/ui/window/S;", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X
/* loaded from: classes.dex */
final class Q extends S {
    @Override // androidx.compose.ui.window.S, androidx.compose.ui.window.P
    public final void a(@Y61.k L l12, int i12, int i13) {
        l12.setSystemGestureExclusionRects(C42745f0.e0(new Rect(0, 0, i12, i13)));
    }
}
