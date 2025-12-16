package defpackage;

import android.graphics.Bitmap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class bk6 extends lk0 {
    public final f2h c;
    public final long d;

    public bk6(f2h f2hVar, long j) {
        this.c = f2hVar;
        this.d = j;
    }

    @Override // defpackage.lk0, defpackage.y6c
    public final vc3 a(Bitmap bitmap, r2c r2cVar) {
        ml0 ml0Var = (ml0) this.c;
        ry ryVar = ml0Var.e;
        if (ryVar == null) {
            wqi.e("bk6", "No video collage", null);
            r2cVar.getClass();
            return r2cVar.b(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), null);
        }
        int i = ryVar.d;
        int i2 = ryVar.o;
        int i3 = ((int) ml0Var.a) / i2;
        int width = bitmap.getWidth() / i;
        int i4 = ((int) this.d) / i3;
        int i5 = i2 - 1;
        int iMin = (Math.min(i4, i5) % width) * i;
        int iMin2 = Math.min(i4, i5) / width;
        int i6 = ryVar.c;
        return r2cVar.b(bitmap, iMin, iMin2 * i6, ryVar.d, i6, null);
    }

    @Override // defpackage.lk0, defpackage.y6c
    public final ty0 b() {
        Locale locale = Locale.ENGLISH;
        StringBuilder sbL = az1.l(((ml0) this.c).d, "videoId=", ", millis=");
        sbL.append(this.d);
        return new c1f(sbL.toString());
    }

    @Override // defpackage.lk0, defpackage.y6c
    public final String getName() {
        return bk6.class.getSimpleName();
    }
}
