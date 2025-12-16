package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.core.widgets.g;
import androidx.constraintlayout.core.widgets.j;
import androidx.constraintlayout.widget.l;

/* compiled from: MotionPlaceholder.java */
/* loaded from: classes.dex */
public class e extends l {
    @Override // androidx.constraintlayout.widget.l, androidx.constraintlayout.widget.a
    public final void l(AttributeSet attributeSet) {
        super.l(attributeSet);
        this.f44236e = new j();
        r();
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i12, int i13) {
        s(null, i12, i13);
    }

    @Override // androidx.constraintlayout.widget.l
    public final void s(androidx.constraintlayout.core.widgets.l lVar, int i12, int i13) {
        int mode = View.MeasureSpec.getMode(i12);
        int size = View.MeasureSpec.getSize(i12);
        int mode2 = View.MeasureSpec.getMode(i13);
        int size2 = View.MeasureSpec.getSize(i13);
        if (lVar == null) {
            setMeasuredDimension(0, 0);
        } else {
            lVar.W(mode, size, mode2, size2);
            setMeasuredDimension(lVar.f43653D0, lVar.f43654E0);
        }
    }

    @Override // androidx.constraintlayout.widget.a
    public final void q(g gVar, SparseArray sparseArray) {
    }
}
