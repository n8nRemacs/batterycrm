package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class ck6 extends lk0 {
    public final g2h c;
    public final long d;
    public final String e = ck6.class.getName();

    public ck6(g2h g2hVar, long j) {
        this.c = g2hVar;
        this.d = j;
    }

    @Override // defpackage.lk0, defpackage.y6c
    public final vc3 a(Bitmap bitmap, r2c r2cVar) {
        g2h g2hVar = this.c;
        ry ryVarF = g2hVar.f();
        if (ryVarF == null) {
            wqi.q(this.e, "No video collage", new Object[0]);
            r2cVar.getClass();
            return r2cVar.b(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), null);
        }
        int i = ryVarF.d;
        int i2 = ryVarF.o;
        int duration = ((int) g2hVar.getDuration()) / i2;
        int width = bitmap.getWidth() / i;
        int i3 = ((int) this.d) / duration;
        int i4 = i2 - 1;
        int iMin = (Math.min(i3, i4) % width) * i;
        int iMin2 = Math.min(i3, i4) / width;
        int i5 = ryVarF.c;
        return r2cVar.b(bitmap, iMin, iMin2 * i5, ryVarF.d, i5, null);
    }

    @Override // defpackage.lk0, defpackage.y6c
    public final ty0 b() {
        StringBuilder sbL = az1.l(this.c.i(), "videoId=", ", millis=");
        sbL.append(this.d);
        return new c1f(sbL.toString());
    }

    @Override // defpackage.lk0, defpackage.y6c
    public final String getName() {
        return ck6.class.getSimpleName();
    }
}
