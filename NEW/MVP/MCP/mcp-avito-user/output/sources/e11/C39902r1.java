package e11;

import android.graphics.Bitmap;

/* renamed from: e11.r1, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39902r1 extends F1<Bitmap> {

    /* renamed from: d, reason: collision with root package name */
    public final boolean f394774d;

    public C39902r1(boolean z12) {
        this.f394774d = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c0  */
    /* JADX WARN: Type inference failed for: r6v3, types: [T, android.graphics.Bitmap] */
    @Override // e11.F1
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@j.N java.lang.String r5, @j.P java.lang.String r6, @j.P java.util.HashMap r7, @j.N android.content.Context r8) {
        /*
            r4 = this;
            e11.B r6 = e11.C39847B.a(r8)
            r7 = 0
            r8 = 0
            if (r6 == 0) goto L5f
            boolean r0 = r4.f394774d
            if (r0 == 0) goto L16
            java.lang.String r0 = ".img"
            java.lang.String r0 = r6.f(r5, r0)
            if (r0 == 0) goto L66
            goto Lc8
        L16:
            monitor-enter(r6)
            r6.c()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r0 = ".img"
            java.io.File r0 = r6.b(r5, r0)     // Catch: java.lang.Throwable -> L3b
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L54
            r0.getPath()     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L33 java.lang.OutOfMemoryError -> L35
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r1)     // Catch: java.lang.Throwable -> L33 java.lang.OutOfMemoryError -> L35
        L31:
            monitor-exit(r6)
            goto L56
        L33:
            r0 = move-exception
            goto L37
        L35:
            r1 = move-exception
            goto L3d
        L37:
            r0.toString()     // Catch: java.lang.Throwable -> L3b
            goto L54
        L3b:
            r5 = move-exception
            goto L5d
        L3d:
            java.lang.System.gc()     // Catch: java.lang.Throwable -> L3b
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L51
            r2.<init>()     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L51
            r3 = 2
            r2.inSampleSize = r3     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L51
            java.lang.String r0 = r0.getAbsolutePath()     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L51
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0, r2)     // Catch: java.lang.Throwable -> L3b java.lang.OutOfMemoryError -> L51
            goto L31
        L51:
            r1.toString()     // Catch: java.lang.Throwable -> L3b
        L54:
            monitor-exit(r6)
            r0 = r8
        L56:
            r4.f394352c = r0
            if (r0 == 0) goto L66
            r8 = r0
            goto Lc8
        L5d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3b
            throw r5
        L5f:
            boolean r0 = r4.f394774d
            if (r0 == 0) goto L66
            r4.f394350a = r7
            goto Lc8
        L66:
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Throwable -> Lb7
            r0.<init>(r5)     // Catch: java.lang.Throwable -> Lb7
            java.net.URLConnection r0 = r0.openConnection()     // Catch: java.lang.Throwable -> Lb7
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch: java.lang.Throwable -> Lb7
            r8 = 10000(0x2710, float:1.4013E-41)
            r0.setReadTimeout(r8)     // Catch: java.lang.Throwable -> L9b
            r0.setConnectTimeout(r8)     // Catch: java.lang.Throwable -> L9b
            r8 = 1
            r0.setInstanceFollowRedirects(r8)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r8 = "connection"
            java.lang.String r1 = "close"
            r0.setRequestProperty(r8, r1)     // Catch: java.lang.Throwable -> L9b
            r0.connect()     // Catch: java.lang.Throwable -> L9b
            int r8 = r0.getResponseCode()     // Catch: java.lang.Throwable -> L9b
            r4.f394351b = r8     // Catch: java.lang.Throwable -> L9b
            r1 = 200(0xc8, float:2.8E-43)
            if (r8 != r1) goto Lb4
            java.io.InputStream r8 = r0.getInputStream()     // Catch: java.lang.Throwable -> L9b
            if (r6 == 0) goto L9e
            r4.c(r6, r8, r5)     // Catch: java.lang.Throwable -> L9b
            goto Lbe
        L9b:
            r5 = move-exception
            r8 = r0
            goto Lb8
        L9e:
            java.io.BufferedInputStream r5 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L9b
            r6 = 8192(0x2000, float:1.148E-41)
            r5.<init>(r8, r6)     // Catch: java.lang.Throwable -> L9b
            android.graphics.Bitmap r6 = android.graphics.BitmapFactory.decodeStream(r5)     // Catch: java.lang.Throwable -> L9b
            r4.f394352c = r6     // Catch: java.lang.Throwable -> L9b
            r5.close()     // Catch: java.lang.Throwable -> Laf
            goto Lbe
        Laf:
            r5 = move-exception
            r5.getMessage()     // Catch: java.lang.Throwable -> L9b
            goto Lbe
        Lb4:
            r4.f394350a = r7     // Catch: java.lang.Throwable -> L9b
            goto Lbe
        Lb7:
            r5 = move-exception
        Lb8:
            r4.f394350a = r7
            r5.getMessage()
            r0 = r8
        Lbe:
            if (r0 == 0) goto Lc3
            r0.disconnect()
        Lc3:
            T r5 = r4.f394352c
            r8 = r5
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
        Lc8:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.C39902r1.a(java.lang.String, java.lang.String, java.util.HashMap, android.content.Context):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0046  */
    /* JADX WARN: Type inference failed for: r3v4, types: [T, android.graphics.Bitmap] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(@j.N e11.C39847B r3, @j.N java.io.InputStream r4, @j.N java.lang.String r5) {
        /*
            r2 = this;
            monitor-enter(r3)
            r3.c()     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = ".img"
            java.io.File r5 = r3.b(r5, r0)     // Catch: java.lang.Throwable -> L20
            r5.getPath()     // Catch: java.lang.Throwable -> L20
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L24
            r1.<init>(r5)     // Catch: java.lang.Throwable -> L24
            e11.C39847B.d(r4, r1)     // Catch: java.lang.Throwable -> L22
            r1.close()     // Catch: java.lang.Throwable -> L1a
            goto L1e
        L1a:
            r4 = move-exception
            r4.toString()     // Catch: java.lang.Throwable -> L20
        L1e:
            monitor-exit(r3)
            goto L35
        L20:
            r4 = move-exception
            goto L56
        L22:
            r4 = move-exception
            goto L26
        L24:
            r4 = move-exception
            r1 = r0
        L26:
            r4.toString()     // Catch: java.lang.Throwable -> L4a
            if (r1 == 0) goto L33
            r1.close()     // Catch: java.lang.Throwable -> L2f
            goto L33
        L2f:
            r4 = move-exception
            r4.toString()     // Catch: java.lang.Throwable -> L20
        L33:
            monitor-exit(r3)
            r5 = r0
        L35:
            if (r5 == 0) goto L46
            boolean r3 = r2.f394774d
            if (r3 != 0) goto L49
            java.lang.String r3 = r5.getAbsolutePath()
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeFile(r3)
            r2.f394352c = r3
            goto L49
        L46:
            r3 = 0
            r2.f394350a = r3
        L49:
            return
        L4a:
            r4 = move-exception
            if (r1 == 0) goto L55
            r1.close()     // Catch: java.lang.Throwable -> L51
            goto L55
        L51:
            r5 = move-exception
            r5.toString()     // Catch: java.lang.Throwable -> L20
        L55:
            throw r4     // Catch: java.lang.Throwable -> L20
        L56:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: e11.C39902r1.c(e11.B, java.io.InputStream, java.lang.String):void");
    }
}
