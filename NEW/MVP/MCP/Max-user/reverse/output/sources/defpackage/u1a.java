package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.media.Image;
import android.os.SystemClock;
import com.google.mlkit.common.MlKitException;
import java.io.Closeable;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public abstract class u1a implements Closeable, f48 {
    public static final hl4 o = new hl4("MobileVisionBase", "", 1);
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final j3 b;
    public final iv6 c;
    public final Executor d;

    public u1a(fyi fyiVar, Executor executor) {
        this.b = fyiVar;
        iv6 iv6Var = new iv6(8);
        this.c = iv6Var;
        this.d = executor;
        ((AtomicInteger) fyiVar.b).incrementAndGet();
        fyiVar.c(executor, afi.a, (zkb) iv6Var.b).j(b6a.B0);
    }

    public final ybj c(Image image, int i, Matrix matrix) {
        nm7 nm7Var;
        int iLimit;
        Bitmap bitmapCreateBitmap;
        s5j.a("Only YUV_420_888 is supported now", image.getFormat() == 35);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        nm7.b(i);
        s5j.a("Only JPEG and YUV_420_888 are supported now", image.getFormat() == 256 || image.getFormat() == 35);
        Image.Plane[] planes = image.getPlanes();
        if (image.getFormat() == 256) {
            int iLimit2 = image.getPlanes()[0].getBuffer().limit();
            s5j.a("Only JPEG is supported now", image.getFormat() == 256);
            Image.Plane[] planes2 = image.getPlanes();
            if (planes2 == null || planes2.length != 1) {
                throw new IllegalArgumentException("Unexpected image format, JPEG should have exactly 1 image plane");
            }
            ByteBuffer buffer = planes2[0].getBuffer();
            buffer.rewind();
            int iRemaining = buffer.remaining();
            byte[] bArr = new byte[iRemaining];
            buffer.get(bArr);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, iRemaining);
            int width = bitmapDecodeByteArray.getWidth();
            int height = bitmapDecodeByteArray.getHeight();
            if (i == 0) {
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, width, height);
            } else {
                Matrix matrix2 = new Matrix();
                matrix2.postRotate(i);
                bitmapCreateBitmap = Bitmap.createBitmap(bitmapDecodeByteArray, 0, 0, width, height, matrix2, true);
            }
            iLimit = iLimit2;
            nm7Var = new nm7(bitmapCreateBitmap);
        } else {
            for (Image.Plane plane : planes) {
                if (plane.getBuffer() != null) {
                    plane.getBuffer().rewind();
                }
            }
            nm7Var = new nm7(image, image.getWidth(), image.getHeight(), i, matrix);
            iLimit = (image.getPlanes()[0].getBuffer().limit() * 3) / 2;
        }
        nm7.c(image.getFormat(), 5, jElapsedRealtime, image.getHeight(), image.getWidth(), iLimit, i);
        return i(nm7Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.ni0
    @ova(k38.ON_DESTROY)
    public synchronized void close() {
        if (this.a.getAndSet(true)) {
            return;
        }
        this.c.j();
        j3 j3Var = this.b;
        Executor executor = this.d;
        if (((AtomicInteger) j3Var.b).get() <= 0) {
            throw new IllegalStateException();
        }
        ((dl6) j3Var.a).u(new c5e(j3Var, 14, new n2g()), executor);
    }

    public final synchronized ybj i(nm7 nm7Var) {
        if (this.a.get()) {
            return n5e.e(new MlKitException("This detector is already closed!", 14));
        }
        if (nm7Var.c < 32 || nm7Var.d < 32) {
            return n5e.e(new MlKitException("InputImage width and height should be at least 32!", 3));
        }
        return this.b.c(this.d, new jad(this, nm7Var), (zkb) this.c.b);
    }
}
