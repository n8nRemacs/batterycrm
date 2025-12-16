package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* loaded from: classes2.dex */
public final class avb extends lk0 {
    public final /* synthetic */ int c;
    public final int d;

    public /* synthetic */ avb(int i, int i2) {
        this.c = i2;
        this.d = i;
    }

    @Override // defpackage.lk0, defpackage.y6c
    public final vc3 a(Bitmap bitmap, r2c r2cVar) {
        switch (this.c) {
            case 0:
                Matrix matrix = new Matrix();
                int i = this.d;
                if (i > 0) {
                    matrix.postRotate(i, bitmap.getWidth() / 2, bitmap.getHeight() / 2);
                }
                return vc3.k0(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true), new iqa(10), vc3.X);
            default:
                Matrix matrix2 = new Matrix();
                int i2 = this.d;
                if (i2 > 0) {
                    matrix2.postRotate(i2, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                }
                return vc3.k0(Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix2, true), new iqa(11), vc3.X);
        }
    }

    @Override // defpackage.lk0, defpackage.y6c
    public final ty0 b() {
        switch (this.c) {
        }
        return new c1f(String.valueOf(this.d));
    }
}
