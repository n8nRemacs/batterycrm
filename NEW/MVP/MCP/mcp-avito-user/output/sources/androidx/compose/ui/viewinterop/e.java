package androidx.compose.ui.viewinterop;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import androidx.compose.ui.focus.B;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.v;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: FocusGroupNode.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {
    public static final boolean a(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect b(B b12, View view, View view2) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        l0.j focusRect = b12.getFocusRect();
        if (focusRect == null) {
            return null;
        }
        int i12 = (int) focusRect.f413390a;
        int i13 = iArr[0];
        int i14 = iArr2[0];
        int i15 = (int) focusRect.f413391b;
        int i16 = iArr[1];
        int i17 = iArr2[1];
        return new Rect((i12 + i13) - i14, (i15 + i16) - i17, (((int) focusRect.f413392c) + i13) - i14, (((int) focusRect.f413393d) + i16) - i17);
    }

    public static final View c(v.d dVar) {
        a aVar = C22421l.g(dVar.f42880b).f40642r;
        View view = aVar != null ? aVar.getView() : null;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }
}
