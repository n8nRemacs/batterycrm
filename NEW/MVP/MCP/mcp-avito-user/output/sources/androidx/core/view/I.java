package androidx.core.view;

import android.view.View;

/* compiled from: NestedScrollingParent2.java */
/* loaded from: classes.dex */
public interface I extends K {
    void onNestedPreScroll(@j.N View view, int i12, int i13, @j.N int[] iArr, int i14);

    void onNestedScroll(@j.N View view, int i12, int i13, int i14, int i15, int i16);

    void onNestedScrollAccepted(@j.N View view, @j.N View view2, int i12, int i13);

    boolean onStartNestedScroll(@j.N View view, @j.N View view2, int i12, int i13);

    void onStopNestedScroll(@j.N View view, int i12);
}
