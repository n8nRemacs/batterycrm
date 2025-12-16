package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;

/* loaded from: classes.dex */
public final class rk4 extends gj0 implements CloseableStaticBitmap {
    public static final /* synthetic */ int s0 = 0;
    public final ksc X;
    public final int Y;
    public final int Z;
    public vc3 d;
    public volatile Bitmap o;

    public rk4(Bitmap bitmap, fod fodVar, ksc kscVar, int i, int i2) {
        bitmap.getClass();
        this.o = bitmap;
        Bitmap bitmap2 = this.o;
        fodVar.getClass();
        this.d = vc3.k0(bitmap2, fodVar, vc3.X);
        this.X = kscVar;
        this.Y = i;
        this.Z = i2;
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final synchronized vc3 cloneUnderlyingBitmapReference() {
        return vc3.y(this.d);
    }

    @Override // defpackage.sc3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        vc3 vc3Var;
        synchronized (this) {
            vc3Var = this.d;
            this.d = null;
            this.o = null;
        }
        if (vc3Var != null) {
            vc3Var.close();
        }
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final synchronized vc3 convertToBitmapReference() {
        vc3 vc3Var;
        l5j.e(this.d, "Cannot convert a closed static bitmap");
        synchronized (this) {
            vc3Var = this.d;
            this.d = null;
            this.o = null;
        }
        return vc3Var;
        return vc3Var;
    }

    public final void finalize() throws Throwable {
        if (isClosed()) {
            return;
        }
        op5.m("DefaultCloseableStaticBitmap", "finalize: %s %x still open.", rk4.class.getSimpleName(), Integer.valueOf(System.identityHashCode(this)));
        try {
            close();
        } finally {
            super.finalize();
        }
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final int getExifOrientation() {
        return this.Z;
    }

    @Override // defpackage.sc3, defpackage.pe7
    public final int getHeight() {
        int i;
        if (this.Y % 180 != 0 || (i = this.Z) == 5 || i == 7) {
            Bitmap bitmap = this.o;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getWidth();
        }
        Bitmap bitmap2 = this.o;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getHeight();
    }

    @Override // defpackage.gj0, defpackage.sc3
    public final ksc getQualityInfo() {
        return this.X;
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final int getRotationAngle() {
        return this.Y;
    }

    @Override // defpackage.sc3
    public final int getSizeInBytes() {
        return xp0.d(this.o);
    }

    @Override // com.facebook.imagepipeline.image.CloseableStaticBitmap
    public final Bitmap getUnderlyingBitmap() {
        return this.o;
    }

    @Override // defpackage.sc3, defpackage.pe7
    public final int getWidth() {
        int i;
        if (this.Y % 180 != 0 || (i = this.Z) == 5 || i == 7) {
            Bitmap bitmap = this.o;
            if (bitmap == null) {
                return 0;
            }
            return bitmap.getHeight();
        }
        Bitmap bitmap2 = this.o;
        if (bitmap2 == null) {
            return 0;
        }
        return bitmap2.getWidth();
    }

    @Override // defpackage.sc3
    public final synchronized boolean isClosed() {
        return this.d == null;
    }

    public rk4(vc3 vc3Var, ksc kscVar, int i, int i2) {
        vc3 vc3VarW = vc3Var.w();
        vc3VarW.getClass();
        this.d = vc3VarW;
        this.o = (Bitmap) vc3VarW.Z();
        this.X = kscVar;
        this.Y = i;
        this.Z = i2;
    }
}
