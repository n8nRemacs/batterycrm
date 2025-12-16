package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;

/* loaded from: classes.dex */
public final /* synthetic */ class qs1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ vs1 b;

    public /* synthetic */ qs1(vs1 vs1Var, int i) {
        this.a = i;
        this.b = vs1Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                cm6 cm6Var = this.b.h1;
                if (cm6Var != null) {
                    return (x4h) cm6Var.invoke();
                }
                return null;
            case 1:
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(a93.s0.B(this.b).c.b().l);
                return shapeDrawable;
            default:
                return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{a93.s0.B(this.b).c.b().f, 0, 0});
        }
    }
}
