package com.facebook.imagepipeline.platform;

import I41.h;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.MemoryFile;
import com.facebook.common.internal.g;
import com.facebook.common.internal.u;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder;
import com.facebook.infer.annotation.Nullsafe;
import java.io.FileDescriptor;
import java.io.OutputStream;
import java.lang.reflect.Method;
import xW0.C49894a;

@g
@Nullsafe
/* loaded from: classes13.dex */
public class GingerbreadPurgeableDecoder extends DalvikPurgeableDecoder {

    /* renamed from: d, reason: collision with root package name */
    public static Method f340505d;

    /* renamed from: c, reason: collision with root package name */
    @h
    public final zW0.b f340506c;

    @g
    public GingerbreadPurgeableDecoder() {
        zW0.b bVar = null;
        if (!zW0.c.f444048a) {
            try {
                bVar = (zW0.b) Class.forName("com.facebook.webpsupport.WebpBitmapFactoryImpl").newInstance();
            } catch (Throwable unused) {
            }
            zW0.c.f444048a = true;
        }
        this.f340506c = bVar;
    }

    public static MemoryFile g(com.facebook.common.references.a<PooledByteBuffer> aVar, int i12, @h byte[] bArr) throws Throwable {
        OutputStream outputStream;
        C49894a c49894a;
        wW0.h hVar = null;
        OutputStream outputStream2 = null;
        MemoryFile memoryFile = new MemoryFile(null, (bArr == null ? 0 : bArr.length) + i12);
        memoryFile.allowPurging(false);
        try {
            wW0.h hVar2 = new wW0.h(aVar.i());
            try {
                c49894a = new C49894a(hVar2, i12);
                try {
                    outputStream2 = memoryFile.getOutputStream();
                    outputStream2.getClass();
                    byte[] bArr2 = new byte[4096];
                    while (true) {
                        int i13 = c49894a.read(bArr2);
                        if (i13 == -1) {
                            break;
                        }
                        outputStream2.write(bArr2, 0, i13);
                    }
                    if (bArr != null) {
                        memoryFile.writeBytes(bArr, 0, i12, bArr.length);
                    }
                    com.facebook.common.references.a.c(aVar);
                    com.facebook.common.internal.e.b(hVar2);
                    com.facebook.common.internal.e.b(c49894a);
                    com.facebook.common.internal.e.a(outputStream2);
                    return memoryFile;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = outputStream2;
                    hVar = hVar2;
                    com.facebook.common.references.a.c(aVar);
                    com.facebook.common.internal.e.b(hVar);
                    com.facebook.common.internal.e.b(c49894a);
                    com.facebook.common.internal.e.a(outputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                outputStream = null;
                c49894a = null;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
            c49894a = null;
        }
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap c(com.facebook.common.references.a<PooledByteBuffer> aVar, BitmapFactory.Options options) {
        return h(aVar, aVar.i().size(), null, options);
    }

    @Override // com.facebook.imagepipeline.nativecode.DalvikPurgeableDecoder
    public final Bitmap d(com.facebook.common.references.a<PooledByteBuffer> aVar, int i12, BitmapFactory.Options options) {
        return h(aVar, i12, DalvikPurgeableDecoder.e(aVar, i12) ? null : DalvikPurgeableDecoder.f340493b, options);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap h(com.facebook.common.references.a<com.facebook.common.memory.PooledByteBuffer> r1, int r2, @I41.h byte[] r3, android.graphics.BitmapFactory.Options r4) throws java.lang.Throwable {
        /*
            r0 = this;
            r4 = 0
            android.os.MemoryFile r1 = g(r1, r2, r3)     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L29
            r0.i(r1)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            zW0.b r2 = r0.f340506c     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            if (r2 == 0) goto L1f
            android.graphics.Bitmap r2 = r2.a()     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            java.lang.String r3 = "BitmapFactory returned null"
            com.facebook.common.internal.o.c(r2, r3)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            r1.close()
            return r2
        L19:
            r4 = r1
            goto L2f
        L1b:
            r2 = move-exception
            goto L19
        L1d:
            r2 = move-exception
            goto L2b
        L1f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            java.lang.String r3 = "WebpBitmapFactory is null"
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
            throw r2     // Catch: java.lang.Throwable -> L1b java.io.IOException -> L1d
        L27:
            r2 = move-exception
            goto L2f
        L29:
            r2 = move-exception
            r1 = r4
        L2b:
            com.facebook.common.internal.u.a(r2)     // Catch: java.lang.Throwable -> L1b
            throw r4     // Catch: java.lang.Throwable -> L1b
        L2f:
            if (r4 == 0) goto L34
            r4.close()
        L34:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.platform.GingerbreadPurgeableDecoder.h(com.facebook.common.references.a, int, byte[], android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    public final FileDescriptor i(MemoryFile memoryFile) throws Throwable {
        Method method;
        try {
            synchronized (this) {
                if (f340505d == null) {
                    try {
                        f340505d = MemoryFile.class.getDeclaredMethod("getFileDescriptor", new Class[0]);
                    } catch (Exception e12) {
                        u.a(e12);
                        throw null;
                    }
                }
                method = f340505d;
            }
            Object objInvoke = method.invoke(memoryFile, new Object[0]);
            objInvoke.getClass();
            return (FileDescriptor) objInvoke;
        } catch (Exception e13) {
            u.a(e13);
            throw null;
        }
    }
}
