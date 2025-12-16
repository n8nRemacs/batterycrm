package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class ef0 {
    public final k18 a;
    public final k18 b;

    public ef0(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    public static final wuf a(ef0 ef0Var, byte[] bArr, xyg xygVar) {
        wuf wufVar = new wuf(new String(bArr, lb2.a).intern(), xygVar.b, xygVar.c);
        wufVar.setAlpha(xygVar.d);
        wufVar.a.g.setXfermode(new PorterDuffXfermode(xygVar.e ? PorterDuff.Mode.OVERLAY : PorterDuff.Mode.SRC_OVER));
        return wufVar;
    }

    public static ArrayList b(JSONArray jSONArray, int[] iArr) throws JSONException {
        ArrayList arrayList = new ArrayList();
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            JSONArray jSONArray2 = jSONObject.getJSONArray("stops");
            int i2 = i * 3;
            int iMin = Math.min(i2 + 3, iArr.length);
            bsi.b(iMin, iArr.length);
            int[] iArrCopyOfRange = Arrays.copyOfRange(iArr, i2, iMin);
            if (iArrCopyOfRange.length < 2) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            int length2 = iArrCopyOfRange.length;
            int length3 = jSONArray2.length();
            float[] fArr = new float[length3];
            int length4 = jSONArray2.length();
            int i3 = 0;
            while (i3 < length4) {
                fArr[i3] = (float) jSONArray2.getDouble(i3);
                i3++;
                i = i;
            }
            int i4 = i;
            if (length2 != length3) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            arrayList.add(new wyg((float) jSONObject.getDouble("x"), (float) jSONObject.getDouble("y"), (float) jSONObject.getDouble("radiusX"), (float) jSONObject.getDouble("radiusY"), (float) jSONObject.getDouble("angle"), fArr, iArrCopyOfRange));
            i = i4 + 1;
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.LinkedHashMap c(android.content.Context r37, defpackage.of0 r38) throws org.json.JSONException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 645
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ef0.c(android.content.Context, of0):java.util.LinkedHashMap");
    }

    public final Object d(Context context, xyg xygVar, dtf dtfVar) {
        return svi.i(((q2b) ((lzf) this.a.getValue())).b(), new df0(this, context, xygVar, null), dtfVar);
    }
}
