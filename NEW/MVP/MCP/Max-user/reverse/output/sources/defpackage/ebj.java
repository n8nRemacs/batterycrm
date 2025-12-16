package defpackage;

/* loaded from: classes.dex */
public abstract class ebj {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.df7 r6, defpackage.rf7 r7, long r8, java.lang.Object r10, boolean r11, boolean r12, defpackage.q44 r13) {
        /*
            boolean r0 = r13 instanceof defpackage.lu5
            if (r0 == 0) goto L13
            r0 = r13
            lu5 r0 = (defpackage.lu5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            lu5 r0 = new lu5
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.Y
            int r1 = r0.Z
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2c
            boolean r12 = r0.X
            boolean r11 = r0.o
            rf7 r7 = r0.d
            defpackage.g8j.b(r13)
            goto L66
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            defpackage.g8j.b(r13)
            r0.d = r7
            r0.o = r11
            r0.X = r12
            r0.Z = r2
            pe4 r6 = r6.b(r7, r10)
            ou5 r10 = new ou5
            r10.<init>(r6, r3)
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 != 0) goto L5c
            mu5 r6 = new mu5
            r6.<init>(r10, r3)
            java.lang.Object r6 = defpackage.d7j.d(r6, r0)
        L5a:
            r13 = r6
            goto L61
        L5c:
            java.lang.Object r6 = defpackage.yei.g(r8, r10, r0)
            goto L5a
        L61:
            g84 r6 = defpackage.g84.a
            if (r13 != r6) goto L66
            return r6
        L66:
            vc3 r13 = (defpackage.vc3) r13
            if (r13 != 0) goto L6b
            goto Lae
        L6b:
            java.lang.Object r6 = r13.Z()
            sc3 r6 = (defpackage.sc3) r6
            boolean r8 = r6 instanceof com.facebook.imagepipeline.image.CloseableStaticBitmap
            if (r8 == 0) goto L7c
            com.facebook.imagepipeline.image.CloseableStaticBitmap r6 = (com.facebook.imagepipeline.image.CloseableStaticBitmap) r6
            android.graphics.Bitmap r6 = r6.getUnderlyingBitmap()
            goto L9d
        L7c:
            boolean r8 = r6 instanceof defpackage.wc3
            if (r8 == 0) goto Lae
            wc3 r6 = (defpackage.wc3) r6
            android.graphics.drawable.Drawable r6 = r6.F()
            r2 = 0
            if (r6 == 0) goto L9c
            ynd r7 = r7.h
            r8 = 200(0xc8, float:2.8E-43)
            if (r7 == 0) goto L92
            int r9 = r7.a
            goto L93
        L92:
            r9 = r8
        L93:
            if (r7 == 0) goto L97
            int r8 = r7.b
        L97:
            android.graphics.Bitmap r6 = defpackage.q9j.b(r6, r9, r8)
            goto L9d
        L9c:
            r6 = r3
        L9d:
            if (r6 == 0) goto La3
            android.graphics.Bitmap$Config r3 = r6.getConfig()
        La3:
            if (r11 == 0) goto Lad
            if (r2 == 0) goto Lad
            if (r3 == 0) goto Lad
            android.graphics.Bitmap r6 = r6.copy(r3, r12)
        Lad:
            return r6
        Lae:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebj.a(df7, rf7, long, java.lang.Object, boolean, boolean, q44):java.lang.Object");
    }

    public static w6f c() {
        return (w6f) w6f.h.getValue();
    }
}
