package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class uyg {
    public final b7g a;
    public final Object b = ipi.b(3, new q8g(6));
    public final Object c = ipi.b(3, new q8g(7));
    public final Object d = ipi.b(3, new q8g(8));
    public final Object e = ipi.b(3, new q8g(9));
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final ArrayList i = new ArrayList();

    public uyg(b7g b7gVar) {
        this.a = b7gVar;
    }

    public static void a(Canvas canvas, List list, List list2, Paint paint) {
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                ve3.p();
                throw null;
            }
            tyg tygVar = (tyg) obj;
            Shader shader = (Shader) ue3.J(i, list2);
            if (shader != null) {
                paint.setShader(shader);
                float f = tygVar.c;
                float f2 = tygVar.b;
                float f3 = tygVar.a;
                float f4 = tygVar.d;
                float fMax = f / Math.max(f, f4);
                float fMax2 = f4 / Math.max(f, f4);
                int iSave = canvas.save();
                try {
                    canvas.rotate(tygVar.e, f3, f2);
                    canvas.scale(fMax, fMax2, f3, f2);
                    canvas.drawCircle(f3, f2, Math.max(f, f4), paint);
                } finally {
                    canvas.restoreToCount(iSave);
                }
            }
            i = i2;
        }
    }

    public static void b(List list, List list2, List list3, int i, int i2) {
        list2.clear();
        list3.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            z6g z6gVar = (z6g) it.next();
            float f = i;
            float f2 = z6gVar.a;
            float[] fArr = z6gVar.d;
            float f3 = (f2 * f) / 100.0f;
            float f4 = i2;
            float f5 = (z6gVar.b * f4) / 100.0f;
            float f6 = (f * z6gVar.e) / 100.0f;
            float f7 = (f4 * z6gVar.f) / 100.0f;
            list3.add(new RadialGradient(f3, f5, Math.max(f6, f7), z6gVar.c, fArr, Shader.TileMode.CLAMP));
            list2.add(new tyg(f3, f5, f6, f7, z6gVar.g, fArr));
        }
    }

    public static RectF c(int i, float f, int i2) {
        RectF rectF = new RectF(0.0f, 0.0f, i, i2);
        float[] fArr = new float[2];
        d(i, i2, f, fArr);
        rectF.left = fArr[0];
        rectF.top = fArr[1];
        d(i, i2, (f + 180.0f) % 360, fArr);
        rectF.right = fArr[0];
        rectF.bottom = fArr[1];
        return rectF;
    }

    public static final void d(int i, int i2, float f, float[] fArr) {
        float f2 = i / 2.0f;
        float f3 = i2 / 2.0f;
        double d = f;
        float fCos = (float) Math.cos(Math.toRadians(d));
        float fSin = (float) Math.sin(Math.toRadians(d));
        float fAbs = Math.abs(f2 / fCos);
        float fAbs2 = Math.abs(f3 / fSin);
        imb imbVar = fAbs >= fAbs2 ? new imb(Float.valueOf(Math.abs(fAbs2 * fCos)), Float.valueOf(f3)) : new imb(Float.valueOf(f2), Float.valueOf(Math.abs(fAbs * fSin)));
        float fFloatValue = ((Number) imbVar.a).floatValue();
        float fFloatValue2 = ((Number) imbVar.b).floatValue();
        if (fCos >= 0.0f && fSin >= 0.0f) {
            fArr[0] = f2 + fFloatValue;
            fArr[1] = f3 - fFloatValue2;
            return;
        }
        if (fCos < 0.0f && fSin >= 0.0f) {
            fArr[0] = f2 - fFloatValue;
            fArr[1] = f3 - fFloatValue2;
        } else if (fCos < 0.0f && fSin < 0.0f) {
            fArr[0] = f2 - fFloatValue;
            fArr[1] = f3 + fFloatValue2;
        } else {
            if (fCos < 0.0f || fSin >= 0.0f) {
                return;
            }
            fArr[0] = f2 + fFloatValue;
            fArr[1] = f3 + fFloatValue2;
        }
    }
}
