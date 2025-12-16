package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes2.dex */
public final class rkb extends lk0 {
    public final Uri c;
    public final Context d;

    public rkb(Context context, Uri uri) {
        this.c = uri;
        this.d = context;
    }

    @Override // defpackage.lk0, defpackage.y6c
    public final ty0 b() {
        return new c1f(String.valueOf(this.c.hashCode()));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.lk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.graphics.Bitmap r18) throws java.lang.Throwable {
        /*
            r17 = this;
            r1 = r17
            android.net.Uri r2 = r1.c
            java.lang.String r0 = "r"
            android.content.Context r3 = r1.d
            android.content.ContentResolver r3 = r3.getContentResolver()
            r4 = 1
            r5 = 0
            android.os.ParcelFileDescriptor r6 = r3.openFileDescriptor(r2, r0)     // Catch: java.lang.Throwable -> L80 java.io.IOException -> L82
            java.io.FileDescriptor r7 = r6.getFileDescriptor()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            pk5 r8 = new pk5     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            java.lang.String r7 = "Orientation"
            int r7 = r8.e(r4, r7)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            r6.close()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            android.os.ParcelFileDescriptor r6 = r3.openFileDescriptor(r2, r0)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            java.io.FileDescriptor r8 = r6.getFileDescriptor()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            android.graphics.Point r8 = defpackage.tfi.a(r8, r7)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            r6.close()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            android.graphics.BitmapFactory$Options r9 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            r9.<init>()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            r10 = 2048(0x800, float:2.87E-42)
            int r8 = defpackage.tfi.d(r8, r10, r10)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            r9.inSampleSize = r8     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            android.os.ParcelFileDescriptor r6 = r3.openFileDescriptor(r2, r0)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            java.io.FileDescriptor r0 = r6.getFileDescriptor()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            android.graphics.Bitmap r10 = android.graphics.BitmapFactory.decodeFileDescriptor(r0, r5, r9)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            r6.close()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            int r0 = defpackage.tfi.f(r7)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            if (r0 != 0) goto L5a
            defpackage.gbj.c(r6)
            goto Lc3
        L5a:
            android.graphics.Matrix r15 = new android.graphics.Matrix     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            r15.<init>()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            float r0 = (float) r0     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            r15.setRotate(r0)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            int r13 = r10.getWidth()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            int r14 = r10.getHeight()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            r16 = 1
            r11 = 0
            r12 = 0
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r10, r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
            r10.recycle()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7e
        L76:
            defpackage.gbj.c(r6)
            r10 = r0
            goto Lc3
        L7b:
            r0 = move-exception
            r5 = r6
            goto Ldf
        L7e:
            r0 = move-exception
            goto L84
        L80:
            r0 = move-exception
            goto Ldf
        L82:
            r0 = move-exception
            r6 = r5
        L84:
            boolean r3 = r0 instanceof java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L7b
            java.lang.String r7 = "qfi"
            if (r3 == 0) goto Lba
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L7b
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> La8
            r2.<init>(r0)     // Catch: java.lang.Throwable -> La8
            boolean r2 = r2.exists()     // Catch: java.lang.Throwable -> La8
            if (r2 != 0) goto Laa
            java.lang.String r2 = "file by path %s not exists"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> La8
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r4)     // Catch: java.lang.Throwable -> La8
            defpackage.wqi.o(r7, r5, r2, r0)     // Catch: java.lang.Throwable -> La8
        La6:
            r0 = r5
            goto L76
        La8:
            r0 = move-exception
            goto Lb4
        Laa:
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> La8
            r2.<init>()     // Catch: java.lang.Throwable -> La8
            android.graphics.Bitmap r0 = android.graphics.BitmapFactory.decodeFile(r0, r2)     // Catch: java.lang.Throwable -> La8
            goto L76
        Lb4:
            java.lang.String r2 = "getBitmapFromExternalStorage fail"
            defpackage.wqi.p(r7, r2, r0)     // Catch: java.lang.Throwable -> L7b
            goto La6
        Lba:
            java.lang.String r2 = "getBitmapFromPath: failed to get bitmap"
            defpackage.wqi.e(r7, r2, r0)     // Catch: java.lang.Throwable -> L7b
            defpackage.gbj.c(r6)
            r10 = r5
        Lc3:
            if (r10 == 0) goto Lde
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r2 = r18
            r0.<init>(r2)
            int r2 = r2.getWidth()
            float r2 = (float) r2
            int r3 = r10.getWidth()
            float r3 = (float) r3
            float r2 = r2 / r3
            r0.scale(r2, r2)
            r2 = 0
            r0.drawBitmap(r10, r2, r2, r5)
        Lde:
            return
        Ldf:
            defpackage.gbj.c(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rkb.c(android.graphics.Bitmap):void");
    }
}
