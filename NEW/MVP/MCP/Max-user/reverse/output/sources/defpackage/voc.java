package defpackage;

import android.animation.TypeEvaluator;

/* loaded from: classes2.dex */
public final class voc implements TypeEvaluator {
    public xob[] a = null;

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f, Object obj, Object obj2) {
        xob[] xobVarArr = (xob[]) obj;
        xob[] xobVarArr2 = (xob[]) obj2;
        if (!ve3.b(xobVarArr, xobVarArr2)) {
            throw new IllegalArgumentException("Can't interpolate between two incompatible pathData");
        }
        if (!ve3.b(this.a, xobVarArr)) {
            this.a = xobVarArr != null ? ve3.g(xobVarArr) : null;
        }
        xob[] xobVarArr3 = this.a;
        if (xobVarArr3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (xobVarArr == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        int length = xobVarArr.length;
        for (int i = 0; i < length; i++) {
            if (xobVarArr2 != null) {
                xob xobVar = xobVarArr3[i];
                xob xobVar2 = xobVarArr[i];
                xob xobVar3 = xobVarArr2[i];
                xobVar.getClass();
                xobVar.a = xobVar2.a;
                int i2 = 0;
                while (true) {
                    float[] fArr = xobVar2.b;
                    if (i2 < fArr.length) {
                        xobVar.b[i2] = (xobVar3.b[i2] * f) + ((1.0f - f) * fArr[i2]);
                        i2++;
                    }
                }
            }
        }
        return xobVarArr3;
    }
}
