package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import java.util.List;

/* loaded from: classes.dex */
public final class z65 extends b2f {
    public final /* synthetic */ int m;
    public final Object n;

    public z65(List list) {
        this.m = 0;
        byte[] bArr = (byte[]) list.get(0);
        int length = bArr.length;
        int i = ((bArr[0] & 255) << 8) | (bArr[1] & 255);
        int i2 = (bArr[3] & 255) | ((bArr[2] & 255) << 8);
        vl3 vl3Var = new vl3();
        Paint paint = new Paint();
        vl3Var.a = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        vl3Var.b = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        vl3Var.c = new Canvas();
        vl3Var.d = new c75(719, 575, 0, 719, 0, 575);
        vl3Var.o = new a75(0, new int[]{0, -1, -16777216, -8421505}, vl3.k(), vl3.l());
        vl3Var.X = new m75(i, i2, 0);
        this.n = vl3Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0343  */
    @Override // defpackage.b2f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.gof e(int r48, boolean r49, byte[] r50) throws com.google.android.exoplayer2.text.SubtitleDecoderException {
        /*
            Method dump skipped, instructions count: 1230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z65.e(int, boolean, byte[]):gof");
    }

    public z65() {
        this.m = 1;
        this.n = new qyg(2, false);
    }
}
