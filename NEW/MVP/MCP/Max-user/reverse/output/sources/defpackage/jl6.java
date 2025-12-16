package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.util.Arrays;
import one.me.sdk.uikit.qr.QrCodeGenerator;

/* loaded from: classes2.dex */
public final class jl6 implements je7 {
    public static final bwf c = new bwf(new nq5(15));
    public static final bwf d = new bwf(new nq5(16));
    public final k18 a;
    public final k18 b;

    public jl6(k18 k18Var, k18 k18Var2) {
        this.a = k18Var;
        this.b = k18Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int b(defpackage.yid r5, java.lang.String r6) {
        /*
            java.util.regex.Pattern r0 = r5.a
            java.util.regex.Matcher r6 = r0.matcher(r6)
            r0 = 0
            boolean r0 = r6.find(r0)
            r1 = 0
            if (r0 != 0) goto L10
            r0 = r1
            goto L17
        L10:
            xt4 r0 = new xt4
            r2 = 23
            r0.<init>(r2, r6)
        L17:
            if (r0 == 0) goto L35
            java.lang.Object r6 = r0.c
            wp8 r6 = (defpackage.wp8) r6
            if (r6 != 0) goto L27
            wp8 r6 = new wp8
            r2 = 0
            r6.<init>(r2, r0)
            r0.c = r6
        L27:
            java.lang.Object r6 = r0.c
            wp8 r6 = (defpackage.wp8) r6
            if (r6 == 0) goto L35
            r0 = 1
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            goto L36
        L35:
            r6 = r1
        L36:
            if (r6 == 0) goto L41
            int r6 = java.lang.Integer.parseInt(r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L42
        L41:
            r6 = r1
        L42:
            if (r6 == 0) goto L49
            int r5 = r6.intValue()
            return r5
        L49:
            java.lang.Class<jl6> r6 = defpackage.jl6.class
            java.lang.String r6 = r6.getName()
            l6b r0 = defpackage.wqi.a
            if (r0 != 0) goto L54
            goto L6d
        L54:
            lg8 r2 = defpackage.lg8.X
            boolean r3 = r0.b(r2)
            if (r3 == 0) goto L6d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can't determine SVG size by regex "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r0.c(r2, r6, r5, r1)
        L6d:
            r5 = 100
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl6.b(yid, java.lang.String):int");
    }

    @Override // defpackage.je7
    public final sc3 a(ce5 ce5Var, int i, ksc kscVar, ie7 ie7Var) {
        Object ipdVar;
        v5c v5cVar = (v5c) this.a.getValue();
        if (v5cVar.e == null) {
            uy5 uy5Var = v5cVar.a;
            v5cVar.e = new d26((rf9) uy5Var.o, (w5c) uy5Var.d);
        }
        d26 d26Var = v5cVar.e;
        qk4 qk4VarK0 = vc3.k0((byte[]) d26Var.b.get(i), d26Var.a, vc3.X);
        try {
            Object objZ = qk4VarK0.Z();
            byte[] bArr = (byte[]) objZ;
            Arrays.fill(bArr, 0, bArr.length, (byte) 0);
            byte[] bArr2 = (byte[]) objZ;
            ((nf9) vc3.y(ce5Var.a).Z()).P(0, 0, i, bArr2);
            String str = new String(bArr2, 0, i, lb2.a);
            qk4VarK0.close();
            boolean z = ie7Var instanceof uuf;
            int iB = z ? ((uuf) ie7Var).d : b((yid) c.getValue(), str);
            int iB2 = z ? ((uuf) ie7Var).e : b((yid) d.getValue(), str);
            vc3 vc3VarC = ((r2c) this.b.getValue()).c(iB, iB2, ie7Var.a);
            try {
                Bitmap bitmap = (Bitmap) vc3VarC.Z();
                bitmap.eraseColor(0);
                try {
                    ipdVar = QrCodeGenerator.nativeRenderSvg(str, iB, iB2);
                } catch (Throwable th) {
                    ipdVar = new ipd(th);
                }
                if (ipdVar instanceof ipd) {
                    ipdVar = null;
                }
                int[] iArr = (int[]) ipdVar;
                if (iArr != null) {
                    bitmap.setPixels(iArr, 0, iB, 0, 0, iB, iB2);
                }
                CloseableStaticBitmap closeableStaticBitmapOf = CloseableStaticBitmap.of(vc3VarC, kscVar, 0);
                vc3VarC.close();
                return closeableStaticBitmapOf;
            } finally {
            }
        } finally {
        }
    }
}
