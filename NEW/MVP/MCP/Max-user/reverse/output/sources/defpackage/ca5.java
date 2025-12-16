package defpackage;

import android.content.Context;
import android.graphics.Color;

/* loaded from: classes.dex */
public final class ca5 {
    public static final int f = (int) Math.round(5.1000000000000005d);
    public final boolean a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;

    public ca5(Context context) {
        boolean zF = wsi.f(dvc.elevationOverlayEnabled, context, false);
        int iD = eti.d(dvc.elevationOverlayColor, 0, context);
        int iD2 = eti.d(dvc.elevationOverlayAccentColor, 0, context);
        int iD3 = eti.d(dvc.colorSurface, 0, context);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.a = zF;
        this.b = iD;
        this.c = iD2;
        this.d = iD3;
        this.e = f2;
    }

    public final int a(int i, float f2) {
        int i2;
        if (!this.a || rf3.i(i, 255) != this.d) {
            return i;
        }
        float fMin = (this.e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r1)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int iAlpha = Color.alpha(i);
        int iJ = eti.j(rf3.i(i, 255), fMin, this.b);
        if (fMin > 0.0f && (i2 = this.c) != 0) {
            iJ = rf3.g(rf3.i(i2, f), iJ);
        }
        return rf3.i(iJ, iAlpha);
    }
}
