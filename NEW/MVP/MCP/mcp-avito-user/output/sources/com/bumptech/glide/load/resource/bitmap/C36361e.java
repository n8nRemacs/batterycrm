package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.EncodeStrategy;
import j.N;
import j.P;

/* compiled from: BitmapEncoder.java */
/* renamed from: com.bumptech.glide.load.resource.bitmap.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C36361e implements com.bumptech.glide.load.m<Bitmap> {

    /* renamed from: b, reason: collision with root package name */
    public static final com.bumptech.glide.load.j<Integer> f339364b = com.bumptech.glide.load.j.a(90, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality");

    /* renamed from: c, reason: collision with root package name */
    public static final com.bumptech.glide.load.j<Bitmap.CompressFormat> f339365c = new com.bumptech.glide.load.j<>("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, com.bumptech.glide.load.j.f339195e);

    /* renamed from: a, reason: collision with root package name */
    @P
    public final com.bumptech.glide.load.engine.bitmap_recycle.j f339366a;

    public C36361e(@N com.bumptech.glide.load.engine.bitmap_recycle.j jVar) {
        this.f339366a = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    @Override // com.bumptech.glide.load.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(@j.N java.lang.Object r7, @j.N java.io.File r8, @j.N com.bumptech.glide.load.k r9) throws java.lang.Throwable {
        /*
            r6 = this;
            com.bumptech.glide.load.engine.w r7 = (com.bumptech.glide.load.engine.w) r7
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r7 = r7.get()
            android.graphics.Bitmap r7 = (android.graphics.Bitmap) r7
            com.bumptech.glide.load.j<android.graphics.Bitmap$CompressFormat> r1 = com.bumptech.glide.load.resource.bitmap.C36361e.f339365c
            java.lang.Object r2 = r9.c(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r7.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r7.getWidth()
            r7.getHeight()
            int r3 = com.bumptech.glide.util.g.f339641a
            android.os.SystemClock.elapsedRealtimeNanos()
            com.bumptech.glide.load.j<java.lang.Integer> r3 = com.bumptech.glide.load.resource.bitmap.C36361e.f339364b
            java.lang.Object r3 = r9.c(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r5.<init>(r8)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            com.bumptech.glide.load.engine.bitmap_recycle.j r8 = r6.f339366a
            if (r8 == 0) goto L4d
            com.bumptech.glide.load.data.c r4 = new com.bumptech.glide.load.data.c     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L4b
            r4.<init>(r5, r8)     // Catch: java.io.IOException -> L49 java.lang.Throwable -> L4b
            goto L4e
        L47:
            r4 = r5
            goto L83
        L49:
            r4 = r5
            goto L5e
        L4b:
            r7 = move-exception
            goto L47
        L4d:
            r4 = r5
        L4e:
            r7.compress(r2, r3, r4)     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r4.close()     // Catch: java.lang.Throwable -> L5c java.io.IOException -> L5e
            r4.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            goto L5a
        L58:
            r7 = move-exception
            goto L89
        L5a:
            r8 = 1
            goto L68
        L5c:
            r7 = move-exception
            goto L83
        L5e:
            r8 = 3
            android.util.Log.isLoggable(r0, r8)     // Catch: java.lang.Throwable -> L5c
            if (r4 == 0) goto L67
            r4.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L67
        L67:
            r8 = 0
        L68:
            r3 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r3)
            if (r0 == 0) goto L82
            java.util.Objects.toString(r2)
            com.bumptech.glide.util.m.c(r7)
            android.os.SystemClock.elapsedRealtimeNanos()
            java.lang.Object r9 = r9.c(r1)
            java.util.Objects.toString(r9)
            r7.hasAlpha()
        L82:
            return r8
        L83:
            if (r4 == 0) goto L8a
            r4.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L8a
            goto L8a
        L89:
            throw r7
        L8a:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.C36361e.a(java.lang.Object, java.io.File, com.bumptech.glide.load.k):boolean");
    }

    @Override // com.bumptech.glide.load.m
    @N
    public final EncodeStrategy b(@N com.bumptech.glide.load.k kVar) {
        return EncodeStrategy.f338838c;
    }

    @Deprecated
    public C36361e() {
        this.f339366a = null;
    }
}
