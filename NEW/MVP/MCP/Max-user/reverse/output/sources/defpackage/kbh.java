package defpackage;

import android.content.Context;
import android.view.View;
import one.me.sdk.uikit.common.views.OneMeDraweeView;

/* loaded from: classes.dex */
public final class kbh extends OneMeDraweeView {
    public final int[] C0;
    public s0h D0;
    public float E0;

    public kbh(Context context) {
        super(context);
        this.C0 = new int[2];
    }

    public final void k(s0h s0hVar, float f) {
        boolean z = (s0hVar.equals(this.D0) && f == this.E0) ? false : true;
        this.D0 = s0hVar;
        this.E0 = f;
        if (z) {
            i(rf7.a(s0hVar.b), rf7.a(s0hVar.h));
        }
    }

    @Override // defpackage.o45, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        s0h s0hVar = this.D0;
        if (s0hVar != null) {
            int i3 = s0hVar.d;
            int i4 = s0hVar.c;
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                int size = View.MeasureSpec.getSize(i);
                int size2 = View.MeasureSpec.getSize(i2);
                float f = this.E0;
                int[] iArr = this.C0;
                if (f == 90.0f) {
                    nqi.a(size2, size, i4, i3, iArr);
                } else {
                    nqi.a(size, size2, i4, i3, iArr);
                }
                setMeasuredDimension(iArr[0], iArr[1]);
                return;
            }
        }
        super.onMeasure(i, i2);
    }
}
