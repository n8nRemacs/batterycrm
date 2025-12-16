package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public abstract class xp0 {
    public static final bwf a = new bwf(new l(22));

    public static final py0 a(InputStream inputStream) {
        if (inputStream == null) {
            throw new IllegalStateException("Required value was null.");
        }
        bwf bwfVar = a;
        ByteBuffer byteBufferAllocate = (ByteBuffer) ((e6c) bwfVar.getValue()).a();
        if (byteBufferAllocate == null) {
            rw0 rw0Var = eh4.a;
            byteBufferAllocate = ByteBuffer.allocate(16384);
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        try {
            options.inTempStorage = byteBufferAllocate.array();
            BitmapFactory.decodeStream(inputStream, null, options);
            return new py0(options.outWidth, options.outHeight, options.outColorSpace);
        } finally {
            ((e6c) bwfVar.getValue()).b(byteBufferAllocate);
        }
    }

    public static final int b(Bitmap.Config config) {
        switch (config == null ? -1 : wp0.$EnumSwitchMapping$0[config.ordinal()]) {
            case 1:
                return 4;
            case 2:
                return 1;
            case 3:
            case 4:
                return 2;
            case 5:
                return 8;
            case 6:
            case 7:
                return 4;
            default:
                throw new UnsupportedOperationException("The provided Bitmap.Config is not supported");
        }
    }

    public static final int c(int i, int i2, Bitmap.Config config) {
        if (i <= 0) {
            throw new IllegalArgumentException(ho7.f(i, "width must be > 0, width is: ").toString());
        }
        if (i2 <= 0) {
            throw new IllegalArgumentException(ho7.f(i2, "height must be > 0, height is: ").toString());
        }
        int iB = b(config);
        int i3 = i * i2 * iB;
        if (i3 > 0) {
            return i3;
        }
        StringBuilder sbK = wy1.k("size must be > 0: size: ", i3, ", width: ", i, ", height: ");
        sbK.append(i2);
        sbK.append(", pixelSize: ");
        sbK.append(iB);
        throw new IllegalStateException(sbK.toString().toString());
    }

    public static final int d(Bitmap bitmap) {
        if (bitmap == null) {
            return 0;
        }
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getByteCount();
        }
    }
}
