package com.facebook.imagepipeline.platform;

import I41.h;
import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import androidx.core.util.y;
import com.facebook.imagepipeline.memory.InterfaceC36387e;
import j.k0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import okhttp3.internal.http2.Http2;

/* compiled from: DefaultDecoder.java */
@J41.d
@TargetApi(11)
/* loaded from: classes13.dex */
public abstract class b implements d {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f340508d = {-1, -39};

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC36387e f340509a;

    /* renamed from: b, reason: collision with root package name */
    @h
    public final PreverificationHelper f340510b = new PreverificationHelper();

    /* renamed from: c, reason: collision with root package name */
    @k0
    public final y.c<ByteBuffer> f340511c;

    public b(InterfaceC36387e interfaceC36387e, int i12, y.c cVar) {
        this.f340509a = interfaceC36387e;
        this.f340511c = cVar;
        for (int i13 = 0; i13 < i12; i13++) {
            this.f340511c.a(ByteBuffer.allocate(Http2.INITIAL_MAX_FRAME_SIZE));
        }
    }

    public static BitmapFactory.Options e(YW0.d dVar, Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = dVar.f19504h;
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeStream(dVar.f(), null, options);
        if (options.outWidth == -1 || options.outHeight == -1) {
            throw new IllegalArgumentException();
        }
        options.inJustDecodeBounds = false;
        options.inDither = true;
        options.inPreferredConfig = config;
        options.inMutable = true;
        return options;
    }

    @Override // com.facebook.imagepipeline.platform.d
    public final com.facebook.common.references.a a(YW0.d dVar, Bitmap.Config config) {
        BitmapFactory.Options optionsE = e(dVar, config);
        boolean z12 = optionsE.inPreferredConfig != Bitmap.Config.ARGB_8888;
        try {
            InputStream inputStreamF = dVar.f();
            inputStreamF.getClass();
            return c(inputStreamF, optionsE);
        } catch (RuntimeException e12) {
            if (z12) {
                return a(dVar, Bitmap.Config.ARGB_8888);
            }
            throw e12;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x000c  */
    @Override // com.facebook.imagepipeline.platform.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.facebook.common.references.a b(YW0.d r6, android.graphics.Bitmap.Config r7, int r8) throws java.io.IOException {
        /*
            r5 = this;
            RW0.c r0 = r6.f19499c
            RW0.c r1 = RW0.b.f14495a
            r2 = 1
            r3 = 0
            if (r0 == r1) goto Le
            RW0.c r1 = RW0.b.f14506l
            if (r0 == r1) goto Le
        Lc:
            r0 = r2
            goto L2e
        Le:
            com.facebook.common.references.a<com.facebook.common.memory.PooledByteBuffer> r0 = r6.f19498b
            r0.getClass()
            java.lang.Object r0 = r0.i()
            com.facebook.common.memory.PooledByteBuffer r0 = (com.facebook.common.memory.PooledByteBuffer) r0
            int r1 = r8 + (-2)
            byte r1 = r0.l(r1)
            r4 = -1
            if (r1 != r4) goto L2d
            int r1 = r8 + (-1)
            byte r0 = r0.l(r1)
            r1 = -39
            if (r0 != r1) goto L2d
            goto Lc
        L2d:
            r0 = r3
        L2e:
            android.graphics.BitmapFactory$Options r7 = e(r6, r7)
            java.io.InputStream r1 = r6.f()
            r1.getClass()
            int r4 = r6.g()
            if (r4 <= r8) goto L45
            xW0.a r4 = new xW0.a
            r4.<init>(r1, r8)
            r1 = r4
        L45:
            if (r0 != 0) goto L4f
            xW0.b r0 = new xW0.b
            byte[] r4 = com.facebook.imagepipeline.platform.b.f340508d
            r0.<init>(r1, r4)
            r1 = r0
        L4f:
            android.graphics.Bitmap$Config r0 = r7.inPreferredConfig
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            if (r0 == r4) goto L56
            goto L57
        L56:
            r2 = r3
        L57:
            com.facebook.common.references.a r6 = r5.c(r1, r7)     // Catch: java.lang.Throwable -> L64 java.lang.RuntimeException -> L66
            r1.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r7 = move-exception
            r7.printStackTrace()
        L63:
            return r6
        L64:
            r6 = move-exception
            goto L79
        L66:
            r7 = move-exception
            if (r2 == 0) goto L78
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888     // Catch: java.lang.Throwable -> L64
            com.facebook.common.references.a r6 = r5.b(r6, r7, r8)     // Catch: java.lang.Throwable -> L64
            r1.close()     // Catch: java.io.IOException -> L73
            goto L77
        L73:
            r7 = move-exception
            r7.printStackTrace()
        L77:
            return r6
        L78:
            throw r7     // Catch: java.lang.Throwable -> L64
        L79:
            r1.close()     // Catch: java.io.IOException -> L7d
            goto L81
        L7d:
            r7 = move-exception
            r7.printStackTrace()
        L81:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.b.b(YW0.d, android.graphics.Bitmap$Config, int):com.facebook.common.references.a");
    }

    public final com.facebook.common.references.a c(InputStream inputStream, BitmapFactory.Options options) {
        Bitmap bitmap;
        int i12 = options.outWidth;
        int i13 = options.outHeight;
        PreverificationHelper preverificationHelper = this.f340510b;
        boolean z12 = preverificationHelper != null && preverificationHelper.shouldUseHardwareBitmapConfig(options.inPreferredConfig);
        InterfaceC36387e interfaceC36387e = this.f340509a;
        if (z12) {
            options.inMutable = false;
            bitmap = null;
        } else {
            bitmap = interfaceC36387e.get(d(options, i12, i13));
            if (bitmap == null) {
                throw new NullPointerException("BitmapPool.get returned null");
            }
        }
        options.inBitmap = bitmap;
        options.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.SRGB);
        y.c<ByteBuffer> cVar = this.f340511c;
        ByteBuffer byteBufferB = cVar.b();
        if (byteBufferB == null) {
            byteBufferB = ByteBuffer.allocate(Http2.INITIAL_MAX_FRAME_SIZE);
        }
        try {
            try {
                try {
                    options.inTempStorage = byteBufferB.array();
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream, null, options);
                    cVar.a(byteBufferB);
                    if (bitmap == null || bitmap == bitmapDecodeStream) {
                        return com.facebook.common.references.a.n(bitmapDecodeStream, interfaceC36387e, com.facebook.common.references.a.f339839g);
                    }
                    interfaceC36387e.a(bitmap);
                    bitmapDecodeStream.recycle();
                    throw new IllegalStateException();
                } catch (IllegalArgumentException e12) {
                    if (bitmap != null) {
                        interfaceC36387e.a(bitmap);
                    }
                    try {
                        inputStream.reset();
                        Bitmap bitmapDecodeStream2 = BitmapFactory.decodeStream(inputStream);
                        if (bitmapDecodeStream2 == null) {
                            throw e12;
                        }
                        com.facebook.common.references.a aVarN = com.facebook.common.references.a.n(bitmapDecodeStream2, com.facebook.imagepipeline.bitmaps.h.b(), com.facebook.common.references.a.f339839g);
                        cVar.a(byteBufferB);
                        return aVarN;
                    } catch (IOException unused) {
                        throw e12;
                    }
                }
            } catch (RuntimeException e13) {
                if (bitmap != null) {
                    interfaceC36387e.a(bitmap);
                }
                throw e13;
            }
        } catch (Throwable th2) {
            cVar.a(byteBufferB);
            throw th2;
        }
    }

    public abstract int d(BitmapFactory.Options options, int i12, int i13);
}
