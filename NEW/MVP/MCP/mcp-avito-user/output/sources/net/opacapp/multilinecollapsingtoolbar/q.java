package net.opacapp.multilinecollapsingtoolbar;

import android.annotation.TargetApi;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.View;

/* compiled from: ViewGroupUtilsHoneycomb.java */
@TargetApi(11)
/* loaded from: classes7.dex */
class q {

    /* renamed from: a, reason: collision with root package name */
    public static final ThreadLocal<Matrix> f419101a = new ThreadLocal<>();

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadLocal<RectF> f419102b = new ThreadLocal<>();

    public static void a(CollapsingToolbarLayout collapsingToolbarLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != collapsingToolbarLayout) {
            a(collapsingToolbarLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
