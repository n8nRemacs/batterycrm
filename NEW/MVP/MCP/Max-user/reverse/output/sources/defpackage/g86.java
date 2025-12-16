package defpackage;

import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;

/* loaded from: classes2.dex */
public final class g86 extends d2f {
    public static final ShapeDrawable E0;

    static {
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        float f = vw4.d().getDisplayMetrics().density * 16.0f;
        float[] fArr = new float[8];
        for (int i = 0; i < 8; i++) {
            fArr[i] = f;
        }
        shapeDrawable.setShape(new RoundRectShape(fArr, null, null));
        E0 = shapeDrawable;
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
    }
}
