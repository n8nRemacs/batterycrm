package com.facebook.imagepipeline.platform;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import com.facebook.webpsupport.WebpBitmapFactoryImpl;
import defpackage.f1i;
import defpackage.fz4;
import defpackage.nf9;
import defpackage.p48;
import defpackage.rei;
import defpackage.vc3;
import defpackage.xc3;
import defpackage.z5c;
import java.io.FileDescriptor;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@fz4
/* loaded from: classes.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {
    public static Method d;
    public final WebpBitmapFactoryImpl c;

    @fz4
    public GingerbreadPurgeableDecoder() {
        WebpBitmapFactoryImpl webpBitmapFactoryImpl = null;
        if (!f1i.a) {
            try {
                webpBitmapFactoryImpl = (WebpBitmapFactoryImpl) WebpBitmapFactoryImpl.class.newInstance();
            } catch (Throwable unused) {
            }
            f1i.a = true;
        }
        this.c = webpBitmapFactoryImpl;
    }

    public static MemoryFile g(vc3 vc3Var, int i, byte[] bArr) throws Throwable {
        OutputStream outputStream;
        p48 p48Var;
        z5c z5cVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i);
        memoryFile.allowPurging(false);
        try {
            z5c z5cVar2 = new z5c((nf9) vc3Var.Z());
            try {
                p48Var = new p48(z5cVar2, i);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    outputStream2.getClass();
                    byte[] bArr2 = new byte[4096];
                    while (true) {
                        int i2 = p48Var.read(bArr2);
                        if (i2 == -1) {
                            break;
                        }
                        outputStream2.write(bArr2, 0, i2);
                    }
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i, bArr.length);
                    }
                    vc3Var.close();
                    xc3.b(z5cVar2);
                    xc3.b(p48Var);
                    xc3.a(outputStream2);
                    return memoryFile;
                } catch (Throwable th) {
                    th = th;
                    outputStream = outputStream2;
                    z5cVar = z5cVar2;
                    vc3Var.close();
                    xc3.b(z5cVar);
                    xc3.b(p48Var);
                    xc3.a(outputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                outputStream = null;
                p48Var = null;
            }
        } catch (Throwable th3) {
            th = th3;
            outputStream = null;
            p48Var = null;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap a(vc3 vc3Var, BitmapFactory.Options options) {
        return h(vc3Var, ((nf9) vc3Var.Z()).Q(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap b(vc3 vc3Var, int i, BitmapFactory.Options options) {
        return h(vc3Var, i, DalvikPurgeableDecoder.d(i, vc3Var) ? null : DalvikPurgeableDecoder.b, options);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap h(defpackage.vc3 r2, int r3, byte[] r4, android.graphics.BitmapFactory.Options r5) throws java.lang.Throwable {
        /*
            r1 = this;
            r0 = 0
            android.os.MemoryFile r2 = g(r2, r3, r4)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            java.io.FileDescriptor r3 = r1.i(r2)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            com.facebook.webpsupport.WebpBitmapFactoryImpl r4 = r1.c     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            if (r4 == 0) goto L1f
            android.graphics.Bitmap r3 = com.facebook.webpsupport.WebpBitmapFactoryImpl.hookDecodeFileDescriptor(r3, r0, r5)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            java.lang.String r4 = "BitmapFactory returned null"
            defpackage.l5j.e(r3, r4)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            r2.close()
            return r3
        L1a:
            r3 = move-exception
            r0 = r2
            goto L2f
        L1d:
            r3 = move-exception
            goto L2b
        L1f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            java.lang.String r4 = "WebpBitmapFactory is null"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            throw r3     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
        L27:
            r3 = move-exception
            goto L2f
        L29:
            r3 = move-exception
            r2 = r0
        L2b:
            defpackage.rei.g(r3)     // Catch: java.lang.Throwable -> L1a
            throw r0     // Catch: java.lang.Throwable -> L1a
        L2f:
            if (r0 == 0) goto L34
            r0.close()
        L34:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder.h(vc3, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public final FileDescriptor i(MemoryFile memoryFile) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Method method;
        try {
            synchronized (this) {
                if (d == null) {
                    try {
                        d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", null);
                    } catch (Exception e) {
                        rei.g(e);
                        throw null;
                    }
                }
                method = d;
            }
            Object objInvoke = method.invoke(memoryFile, null);
            objInvoke.getClass();
            return (FileDescriptor) objInvoke;
        } catch (Exception e2) {
            rei.g(e2);
            throw null;
        }
    }
}
