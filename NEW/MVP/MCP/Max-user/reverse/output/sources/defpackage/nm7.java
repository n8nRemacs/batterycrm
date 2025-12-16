package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.Image;

/* loaded from: classes.dex */
public final class nm7 {
    public volatile Bitmap a;
    public volatile awd b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final Matrix g;

    public nm7(Bitmap bitmap) {
        s5j.g(bitmap);
        this.a = bitmap;
        this.c = bitmap.getWidth();
        this.d = bitmap.getHeight();
        b(0);
        this.e = 0;
        this.f = -1;
        this.g = null;
    }

    public static void b(int i) {
        boolean z = true;
        if (i != 0 && i != 90 && i != 180 && i != 270) {
            z = false;
        }
        s5j.a("Invalid rotation. Only 0, 90, 180, 270 are supported currently.", z);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(int r16, int r17, long r18, int r20, int r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nm7.c(int, int, long, int, int, int, int):void");
    }

    public final Image.Plane[] a() {
        if (this.b == null) {
            return null;
        }
        return ((Image) this.b.b).getPlanes();
    }

    public nm7(Image image, int i, int i2, int i3, Matrix matrix) {
        this.b = new awd(11, image);
        this.c = i;
        this.d = i2;
        b(i3);
        this.e = i3;
        this.f = 35;
        this.g = matrix;
    }
}
