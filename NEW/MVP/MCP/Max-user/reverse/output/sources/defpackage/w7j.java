package defpackage;

import android.graphics.RectF;
import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class w7j {
    public static ye4 a(xmd xmdVar, String str, q7d q7dVar, int i) {
        Map map = Collections.EMPTY_MAP;
        Uri uriI = koi.i(str, q7dVar.c);
        long j = q7dVar.a;
        long j2 = q7dVar.b;
        String strA = xmdVar.a();
        if (strA == null) {
            strA = koi.i(((jl0) xmdVar.b.get(0)).a, q7dVar.c).toString();
        }
        String str2 = strA;
        if (uriI != null) {
            return new ye4(uriI, 0L, 1, null, map, j, j2, str2, i);
        }
        throw new IllegalStateException("The uri must be set.");
    }

    public static float[] b(RectF rectF) {
        float f = rectF.left;
        float f2 = rectF.top;
        float f3 = rectF.right;
        float f4 = rectF.bottom;
        return new float[]{f, f2, f3, f2, f3, f4, f, f4};
    }

    public static RectF c(float[] fArr) {
        RectF rectF = new RectF(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        for (int i = 1; i < fArr.length; i += 2) {
            float fRound = Math.round(fArr[i - 1] * 10.0f) / 10.0f;
            float fRound2 = Math.round(fArr[i] * 10.0f) / 10.0f;
            float f = rectF.left;
            if (fRound < f) {
                f = fRound;
            }
            rectF.left = f;
            float f2 = rectF.top;
            if (fRound2 < f2) {
                f2 = fRound2;
            }
            rectF.top = f2;
            float f3 = rectF.right;
            if (fRound <= f3) {
                fRound = f3;
            }
            rectF.right = fRound;
            float f4 = rectF.bottom;
            if (fRound2 <= f4) {
                fRound2 = f4;
            }
            rectF.bottom = fRound2;
        }
        rectF.sort();
        return rectF;
    }
}
