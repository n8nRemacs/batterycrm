package androidx.compose.ui.platform;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;

/* compiled from: FocusFinderCompat.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.i1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22484i1 {
    public static final View a(View view, Y41.l<? super View, Boolean> lVar, View view2) {
        View viewA;
        if (lVar.invoke(view).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            if (childAt != view2 && (viewA = a(childAt, lVar, view2)) != null) {
                return viewA;
            }
        }
        return null;
    }
}
