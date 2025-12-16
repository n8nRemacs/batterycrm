package com.google.android.gms.internal.mlkit_vision_face_bundled;

/* compiled from: com.google.mlkit:face-detection@@16.1.6 */
/* loaded from: classes6.dex */
final class zzyh {
    public static /* bridge */ /* synthetic */ void a(byte b12, byte b13, byte b14, byte b15, char[] cArr, int i12) throws zzvv {
        if (!e(b13)) {
            if ((((b13 + 112) + (b12 << 28)) >> 30) == 0 && !e(b14) && !e(b15)) {
                int i13 = ((b12 & 7) << 18) | ((b13 & 63) << 12) | ((b14 & 63) << 6) | (b15 & 63);
                cArr[i12] = (char) ((i13 >>> 10) + 55232);
                cArr[i12 + 1] = (char) ((i13 & 1023) + 56320);
                return;
            }
        }
        throw zzvv.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0016 A[PHI: r2
  0x0016: PHI (r2v3 byte) = (r2v2 byte), (r2v9 byte) binds: [B:9:0x0011, B:11:0x0015] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* bridge */ /* synthetic */ void b(byte r2, byte r3, byte r4, char[] r5, int r6) throws com.google.android.gms.internal.mlkit_vision_face_bundled.zzvv {
        /*
            boolean r0 = e(r3)
            if (r0 != 0) goto L2c
            r0 = -96
            r1 = -32
            if (r2 != r1) goto Lf
            if (r3 < r0) goto L2c
            r2 = r1
        Lf:
            r1 = -19
            if (r2 != r1) goto L16
            if (r3 >= r0) goto L2c
            r2 = r1
        L16:
            boolean r0 = e(r4)
            if (r0 != 0) goto L2c
            r2 = r2 & 15
            r3 = r3 & 63
            r4 = r4 & 63
            int r2 = r2 << 12
            int r3 = r3 << 6
            r2 = r2 | r3
            r2 = r2 | r4
            char r2 = (char) r2
            r5[r6] = r2
            return
        L2c:
            com.google.android.gms.internal.mlkit_vision_face_bundled.zzvv r2 = com.google.android.gms.internal.mlkit_vision_face_bundled.zzvv.a()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.mlkit_vision_face_bundled.zzyh.b(byte, byte, byte, char[], int):void");
    }

    public static /* bridge */ /* synthetic */ void c(byte b12, byte b13, char[] cArr, int i12) throws zzvv {
        if (b12 < -62 || e(b13)) {
            throw zzvv.a();
        }
        cArr[i12] = (char) (((b12 & 31) << 6) | (b13 & 63));
    }

    public static /* bridge */ /* synthetic */ boolean d(byte b12) {
        return b12 >= 0;
    }

    public static boolean e(byte b12) {
        return b12 > -65;
    }
}
