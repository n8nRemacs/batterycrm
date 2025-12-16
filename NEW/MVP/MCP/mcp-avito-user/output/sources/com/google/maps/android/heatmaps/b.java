package com.google.maps.android.heatmaps;

import android.graphics.Color;
import androidx.appcompat.app.r;
import com.facebook.imageutils.JfifUtil;
import com.google.android.gms.maps.model.l;
import com.google.maps.android.heatmaps.a;
import java.util.HashMap;

/* compiled from: HeatmapTileProvider.java */
/* loaded from: classes6.dex */
public class b implements l {

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.maps.android.heatmaps.a f362274c;

    /* renamed from: a, reason: collision with root package name */
    public final com.google.maps.android.heatmaps.a f362275a;

    /* renamed from: b, reason: collision with root package name */
    public final double f362276b;

    /* compiled from: HeatmapTileProvider.java */
    /* renamed from: com.google.maps.android.heatmaps.b$b, reason: collision with other inner class name */
    public static class C10740b {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.maps.android.heatmaps.a f362277a = b.f362274c;

        /* renamed from: b, reason: collision with root package name */
        public final double f362278b = 0.7d;
    }

    static {
        int[] iArr = {Color.rgb(102, JfifUtil.MARKER_APP1, 0), Color.rgb(255, 0, 0)};
        float[] fArr = {0.2f, 1.0f};
        com.google.maps.android.heatmaps.a aVar = new com.google.maps.android.heatmaps.a();
        if (fArr[1] <= fArr[0]) {
            throw new IllegalArgumentException("startPoints should be in increasing order");
        }
        int[] iArr2 = new int[2];
        aVar.f362269a = iArr2;
        float[] fArr2 = new float[2];
        aVar.f362270b = fArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 2);
        System.arraycopy(fArr, 0, fArr2, 0, 2);
        f362274c = aVar;
    }

    public b(C10740b c10740b, a aVar) {
        c10740b.getClass();
        this.f362275a = c10740b.f362277a;
        this.f362276b = c10740b.f362278b;
        double d12 = 20 / 3.0d;
        double[] dArr = new double[41];
        for (int i12 = -20; i12 <= 20; i12++) {
            dArr[i12 + 20] = Math.exp(((-i12) * i12) / ((2.0d * d12) * d12));
        }
        com.google.maps.android.heatmaps.a aVar2 = this.f362275a;
        this.f362275a = aVar2;
        aVar2.getClass();
        HashMap map = new HashMap();
        float[] fArr = aVar2.f362270b;
        float f12 = fArr[0];
        int[] iArr = aVar2.f362269a;
        if (f12 != 0.0f) {
            map.put(0, new a.b(aVar2, Color.argb(0, Color.red(iArr[0]), Color.green(iArr[0]), Color.blue(iArr[0])), iArr[0], 1000 * fArr[0], null));
        }
        for (int i13 = 1; i13 < iArr.length; i13++) {
            float f13 = 1000;
            int i14 = i13 - 1;
            map.put(Integer.valueOf((int) (fArr[i14] * f13)), new a.b(aVar2, iArr[i14], iArr[i13], (fArr[i13] - fArr[i14]) * f13, null));
        }
        if (fArr[fArr.length - 1] != 1.0f) {
            int length = fArr.length - 1;
            float f14 = 1000;
            Integer numValueOf = Integer.valueOf((int) (fArr[length] * f14));
            int i15 = iArr[length];
            map.put(numValueOf, new a.b(aVar2, i15, i15, (1.0f - fArr[length]) * f14, null));
        }
        int[] iArr2 = new int[1000];
        a.b bVar = (a.b) map.get(0);
        int i16 = 0;
        for (int i17 = 0; i17 < 1000; i17++) {
            if (map.containsKey(Integer.valueOf(i17))) {
                bVar = (a.b) map.get(Integer.valueOf(i17));
                i16 = i17;
            }
            float f15 = (i17 - i16) / bVar.f362273c;
            int i18 = bVar.f362272b;
            int iAlpha = Color.alpha(i18);
            int i19 = bVar.f362271a;
            int iAlpha2 = (int) (((iAlpha - Color.alpha(i19)) * f15) + Color.alpha(i19));
            float[] fArr2 = new float[3];
            Color.RGBToHSV(Color.red(i19), Color.green(i19), Color.blue(i19), fArr2);
            float[] fArr3 = new float[3];
            Color.RGBToHSV(Color.red(i18), Color.green(i18), Color.blue(i18), fArr3);
            float f16 = fArr2[0];
            float f17 = fArr3[0];
            if (f16 - f17 > 180.0f) {
                fArr3[0] = f17 + 360.0f;
            } else if (f17 - f16 > 180.0f) {
                fArr2[0] = f16 + 360.0f;
            }
            float[] fArr4 = new float[3];
            for (int i22 = 0; i22 < 3; i22++) {
                float f18 = fArr3[i22];
                float f19 = fArr2[i22];
                fArr4[i22] = r.c(f18, f19, f15, f19);
            }
            iArr2[i17] = Color.HSVToColor(iAlpha2, fArr4);
        }
        double d13 = this.f362276b;
        if (d13 != 1.0d) {
            for (int i23 = 0; i23 < 1000; i23++) {
                int i24 = iArr2[i23];
                iArr2[i23] = Color.argb((int) (Color.alpha(i24) * d13), Color.red(i24), Color.green(i24), Color.blue(i24));
            }
        }
        throw null;
    }
}
