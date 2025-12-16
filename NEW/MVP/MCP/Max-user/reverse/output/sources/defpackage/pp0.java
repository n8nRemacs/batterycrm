package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* loaded from: classes2.dex */
public final class pp0 {
    public final hfd a;
    public final k18 b;
    public final k18 c;

    public pp0(hfd hfdVar, k18 k18Var, k18 k18Var2) {
        this.a = hfdVar;
        this.b = k18Var;
        this.c = k18Var2;
    }

    public static Bitmap a(byte[] bArr) {
        Object ipdVar;
        byte[] bArrDecode;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            bArrDecode = Base64.decode(bArr, 0);
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (bArrDecode != null && bArrDecode.length != 0) {
            ipdVar = BitmapFactory.decodeByteArray(bArrDecode, 0, bArrDecode.length);
            if (ipdVar == null) {
                return null;
            }
            return (Bitmap) (ipdVar instanceof ipd ? null : ipdVar);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [ipd] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.graphics.Bitmap] */
    public static byte[] c(Bitmap bitmap, byte[] bArr) throws IOException {
        int iD;
        byte[] ipdVar;
        if (bitmap.isRecycled() || (iD = xp0.d(bitmap)) == 0) {
            return bArr;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(iD);
        try {
            String name = pp0.class.getName();
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, name, "try to encode bitmap by size " + bitmap.getWidth() + "x" + bitmap.getHeight(), null);
                }
            }
            try {
                bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                ipdVar = byteArray.length == 0 ? bArr : Base64.encode(byteArray, 0);
            } catch (Throwable th) {
                ipdVar = new ipd(th);
            }
            if (!(ipdVar instanceof ipd)) {
                bArr = ipdVar;
            }
            byte[] bArr2 = bArr;
            byteArrayOutputStream.close();
            return bArr2;
        } finally {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r3v2, types: [byte[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(defpackage.rf7 r5, defpackage.q44 r6) throws java.io.IOException {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.op0
            if (r0 == 0) goto L13
            r0 = r6
            op0 r0 = (defpackage.op0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            op0 r0 = new op0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.o
            int r1 = r0.Y
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L28
            pp0 r5 = r0.d
            defpackage.g8j.b(r6)
            goto L57
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            defpackage.g8j.b(r6)
            k18 r6 = r4.b
            java.lang.Object r6 = r6.getValue()
            df7 r6 = (defpackage.df7) r6
            r0.d = r4
            r0.Y = r2
            pe4 r5 = r6.b(r5, r3)
            ou5 r6 = new ou5
            r6.<init>(r5, r3)
            mu5 r5 = new mu5
            r5.<init>(r6, r3)
            java.lang.Object r6 = defpackage.d7j.d(r5, r0)
            g84 r5 = defpackage.g84.a
            if (r6 != r5) goto L56
            return r5
        L56:
            r5 = r4
        L57:
            vc3 r6 = (defpackage.vc3) r6
            if (r6 == 0) goto L89
            java.lang.Object r0 = r6.Z()     // Catch: java.lang.Throwable -> L66
            boolean r1 = r0 instanceof com.facebook.imagepipeline.image.CloseableStaticBitmap     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L68
            com.facebook.imagepipeline.image.CloseableStaticBitmap r0 = (com.facebook.imagepipeline.image.CloseableStaticBitmap) r0     // Catch: java.lang.Throwable -> L66
            goto L69
        L66:
            r5 = move-exception
            goto L83
        L68:
            r0 = r3
        L69:
            if (r0 == 0) goto L7f
            android.graphics.Bitmap r0 = r0.getUnderlyingBitmap()     // Catch: java.lang.Throwable -> L66
            hfd r5 = r5.a     // Catch: java.lang.Throwable -> L66
            java.lang.Object r5 = r5.b     // Catch: java.lang.Throwable -> L66
            bwf r5 = (defpackage.bwf) r5     // Catch: java.lang.Throwable -> L66
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L66
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> L66
            byte[] r3 = c(r0, r5)     // Catch: java.lang.Throwable -> L66
        L7f:
            r6.close()
            return r3
        L83:
            throw r5     // Catch: java.lang.Throwable -> L84
        L84:
            r0 = move-exception
            defpackage.r4j.a(r6, r5)
            throw r0
        L89:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pp0.b(rf7, q44):java.io.Serializable");
    }
}
