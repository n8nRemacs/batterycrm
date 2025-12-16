package defpackage;

import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class t27 {
    public static final Rect b = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
    public final dy a;

    public t27(dy dyVar) {
        this.a = dyVar;
    }

    public final void a(View view, Rect rect, Float f, Integer num) {
        Path path = new Path();
        Path path2 = new Path();
        Rect rect2 = new Rect();
        RectF rectF = new RectF();
        Rect rect3 = new Rect();
        RectF rectF2 = new RectF();
        rid ridVar = new rid();
        if (rect == null) {
            return;
        }
        view.setBackground(new r27(ridVar, path2, a93.s0.y(view).b().f));
        float[] fArr = new float[8];
        float[] fArr2 = new float[8];
        float[] fArr3 = new float[8];
        if (f != null) {
            for (int i = 0; i < 8; i++) {
                fArr[i] = f.floatValue();
                if (i < 4) {
                    fArr2[i] = f.floatValue();
                } else {
                    fArr3[i] = f.floatValue();
                }
            }
        }
        ((ArrayList) this.a.X).add(new s27(ridVar, path2, path, rect2, rect, num, rect3, rectF, f, fArr, rectF2, view));
    }
}
