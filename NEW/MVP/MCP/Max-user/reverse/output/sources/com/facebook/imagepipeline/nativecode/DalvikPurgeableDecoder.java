package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import defpackage.ce5;
import defpackage.ez4;
import defpackage.fz4;
import defpackage.hf7;
import defpackage.nca;
import defpackage.nf9;
import defpackage.qk4;
import defpackage.rei;
import defpackage.s2c;
import defpackage.utb;
import defpackage.vc3;
import defpackage.vo0;
import defpackage.wo0;
import defpackage.wy1;
import defpackage.xp0;
import java.util.Locale;

@fz4
/* loaded from: classes.dex */
public abstract class DalvikPurgeableDecoder implements s2c {
    public static final byte[] b;
    public final vo0 a;

    @ez4
    public static class OreoUtils {
        private OreoUtils() {
        }
    }

    static {
        int i = hf7.a;
        nca.b("imagepipeline");
        b = new byte[]{-1, -39};
    }

    public DalvikPurgeableDecoder() {
        if (wo0.c == null) {
            synchronized (wo0.class) {
                if (wo0.c == null) {
                    wo0.c = new vo0(wo0.b, wo0.a);
                }
            }
        }
        this.a = wo0.c;
    }

    public static boolean d(int i, vc3 vc3Var) {
        nf9 nf9Var = (nf9) vc3Var.Z();
        return i >= 2 && nf9Var.y(i + (-2)) == -1 && nf9Var.y(i - 1) == -39;
    }

    @fz4
    private static native void nativePinBitmap(Bitmap bitmap);

    public abstract Bitmap a(vc3 vc3Var, BitmapFactory.Options options);

    public abstract Bitmap b(vc3 vc3Var, int i, BitmapFactory.Options options);

    @Override // defpackage.s2c
    public final vc3 c(ce5 ce5Var, Bitmap.Config config) {
        int i = ce5Var.Y;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i;
        options.inMutable = true;
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        vc3 vc3VarY = vc3.y(ce5Var.a);
        vc3VarY.getClass();
        try {
            return e(a(vc3VarY, options));
        } finally {
            vc3VarY.close();
        }
    }

    public final qk4 e(Bitmap bitmap) {
        int i;
        long j;
        int i2;
        bitmap.getClass();
        try {
            nativePinBitmap(bitmap);
            vo0 vo0Var = this.a;
            synchronized (vo0Var) {
                int iD = xp0.d(bitmap);
                int i3 = vo0Var.a;
                if (i3 < vo0Var.c) {
                    long j2 = vo0Var.b + iD;
                    if (j2 <= vo0Var.d) {
                        vo0Var.a = i3 + 1;
                        vo0Var.b = j2;
                        return vc3.k0(bitmap, this.a.e, vc3.X);
                    }
                }
                int iD2 = xp0.d(bitmap);
                bitmap.recycle();
                Locale locale = Locale.US;
                vo0 vo0Var2 = this.a;
                synchronized (vo0Var2) {
                    i = vo0Var2.a;
                }
                vo0 vo0Var3 = this.a;
                synchronized (vo0Var3) {
                    j = vo0Var3.b;
                }
                vo0 vo0Var4 = this.a;
                synchronized (vo0Var4) {
                    i2 = vo0Var4.c;
                }
                int iB = this.a.b();
                StringBuilder sbK = wy1.k("Attempted to pin a bitmap of size ", iD2, " bytes. The current pool count is ", i, ", the current pool size is ");
                utb.n(sbK, j, " bytes. The current pool max count is ", i2);
                sbK.append(", the current pool max size is ");
                sbK.append(iB);
                sbK.append(" bytes.");
                throw new TooManyBitmapsException(sbK.toString());
            }
        } catch (Exception e) {
            bitmap.recycle();
            rei.g(e);
            throw null;
        }
    }

    @Override // defpackage.s2c
    public final vc3 f(ce5 ce5Var, Bitmap.Config config, int i, ColorSpace colorSpace) {
        int i2 = ce5Var.Y;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i2;
        options.inMutable = true;
        if (colorSpace == null) {
            colorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        }
        options.inPreferredColorSpace = colorSpace;
        vc3 vc3VarY = vc3.y(ce5Var.a);
        vc3VarY.getClass();
        try {
            return e(b(vc3VarY, i, options));
        } finally {
            vc3VarY.close();
        }
    }
}
