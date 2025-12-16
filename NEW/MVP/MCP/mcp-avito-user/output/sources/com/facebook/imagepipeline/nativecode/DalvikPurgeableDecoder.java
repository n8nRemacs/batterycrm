package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import androidx.appcompat.app.r;
import com.facebook.common.internal.u;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.common.TooManyBitmapsException;
import com.facebook.imagepipeline.memory.C36384b;
import com.facebook.imagepipeline.memory.C36386d;
import com.facebook.imageutils.BitmapUtil;
import com.facebook.infer.annotation.Nullsafe;
import com.facebook.soloader.InterfaceC36428e;
import iX0.C41358a;
import j.k0;
import java.util.List;
import java.util.Locale;

@com.facebook.common.internal.g
@Nullsafe
/* loaded from: classes13.dex */
public abstract class DalvikPurgeableDecoder implements com.facebook.imagepipeline.platform.d {

    /* renamed from: b, reason: collision with root package name */
    public static final byte[] f340493b;

    /* renamed from: a, reason: collision with root package name */
    public final C36384b f340494a;

    @InterfaceC36428e
    public static class OreoUtils {
        private OreoUtils() {
        }
    }

    static {
        List<String> list = b.f340502a;
        C41358a.c("imagepipeline");
        f340493b = new byte[]{-1, -39};
    }

    public DalvikPurgeableDecoder() {
        if (C36386d.f340464c == null) {
            synchronized (C36386d.class) {
                try {
                    if (C36386d.f340464c == null) {
                        C36386d.f340464c = new C36384b(C36386d.f340463b, C36386d.f340462a);
                    }
                } finally {
                }
            }
        }
        this.f340494a = C36386d.f340464c;
    }

    @k0
    public static boolean e(com.facebook.common.references.a<PooledByteBuffer> aVar, int i12) {
        PooledByteBuffer pooledByteBufferI = aVar.i();
        return i12 >= 2 && pooledByteBufferI.l(i12 + (-2)) == -1 && pooledByteBufferI.l(i12 - 1) == -39;
    }

    @com.facebook.common.internal.g
    private static native void nativePinBitmap(Bitmap bitmap);

    @Override // com.facebook.imagepipeline.platform.d
    public final com.facebook.common.references.a a(YW0.d dVar, Bitmap.Config config) {
        int i12 = dVar.f19504h;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i12;
        options.inMutable = true;
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        com.facebook.common.references.a<PooledByteBuffer> aVarB = com.facebook.common.references.a.b(dVar.f19498b);
        aVarB.getClass();
        try {
            return f(c(aVarB, options));
        } finally {
            com.facebook.common.references.a.c(aVarB);
        }
    }

    @Override // com.facebook.imagepipeline.platform.d
    public final com.facebook.common.references.a b(YW0.d dVar, Bitmap.Config config, int i12) {
        int i13 = dVar.f19504h;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inPurgeable = true;
        options.inInputShareable = true;
        options.inSampleSize = i13;
        options.inMutable = true;
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        com.facebook.common.references.a<PooledByteBuffer> aVarB = com.facebook.common.references.a.b(dVar.f19498b);
        aVarB.getClass();
        try {
            return f(d(aVarB, i12, options));
        } finally {
            com.facebook.common.references.a.c(aVarB);
        }
    }

    public abstract Bitmap c(com.facebook.common.references.a<PooledByteBuffer> aVar, BitmapFactory.Options options);

    public abstract Bitmap d(com.facebook.common.references.a<PooledByteBuffer> aVar, int i12, BitmapFactory.Options options);

    public final com.facebook.common.references.a<Bitmap> f(Bitmap bitmap) throws Throwable {
        int i12;
        long j12;
        int i13;
        bitmap.getClass();
        try {
            nativePinBitmap(bitmap);
            C36384b c36384b = this.f340494a;
            synchronized (c36384b) {
                int sizeInBytes = BitmapUtil.getSizeInBytes(bitmap);
                int i14 = c36384b.f340456a;
                if (i14 < c36384b.f340458c) {
                    long j13 = c36384b.f340457b + sizeInBytes;
                    if (j13 <= c36384b.f340459d) {
                        c36384b.f340456a = i14 + 1;
                        c36384b.f340457b = j13;
                        return com.facebook.common.references.a.n(bitmap, this.f340494a.f340460e, com.facebook.common.references.a.f339839g);
                    }
                }
                int sizeInBytes2 = BitmapUtil.getSizeInBytes(bitmap);
                bitmap.recycle();
                Locale locale = Locale.US;
                C36384b c36384b2 = this.f340494a;
                synchronized (c36384b2) {
                    i12 = c36384b2.f340456a;
                }
                C36384b c36384b3 = this.f340494a;
                synchronized (c36384b3) {
                    j12 = c36384b3.f340457b;
                }
                C36384b c36384b4 = this.f340494a;
                synchronized (c36384b4) {
                    i13 = c36384b4.f340458c;
                }
                int iB2 = this.f340494a.b();
                StringBuilder sbY = r.y(sizeInBytes2, i12, "Attempted to pin a bitmap of size ", " bytes. The current pool count is ", ", the current pool size is ");
                sbY.append(j12);
                sbY.append(" bytes. The current pool max count is ");
                sbY.append(i13);
                sbY.append(", the current pool max size is ");
                sbY.append(iB2);
                sbY.append(" bytes.");
                throw new TooManyBitmapsException(sbY.toString());
            }
        } catch (Exception e12) {
            bitmap.recycle();
            u.a(e12);
            throw null;
        }
    }
}
