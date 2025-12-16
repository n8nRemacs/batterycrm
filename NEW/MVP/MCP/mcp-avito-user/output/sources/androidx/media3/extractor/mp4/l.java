package androidx.media3.extractor.mp4;

import androidx.media3.common.util.J;
import androidx.media3.extractor.J;
import j.P;

/* compiled from: TrackEncryptionBox.java */
@J
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f51052a;

    /* renamed from: b, reason: collision with root package name */
    @P
    public final String f51053b;

    /* renamed from: c, reason: collision with root package name */
    public final J.a f51054c;

    /* renamed from: d, reason: collision with root package name */
    public final int f51055d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public final byte[] f51056e;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0020 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l(boolean r6, @j.P java.lang.String r7, int r8, byte[] r9, int r10, int r11, @j.P byte[] r12) {
        /*
            r5 = this;
            r0 = 2
            r5.<init>()
            r1 = 0
            r2 = 1
            if (r8 != 0) goto La
            r3 = r2
            goto Lb
        La:
            r3 = r1
        Lb:
            if (r12 != 0) goto Lf
            r4 = r2
            goto L10
        Lf:
            r4 = r1
        L10:
            r3 = r3 ^ r4
            androidx.media3.common.util.C23110a.b(r3)
            r5.f51052a = r6
            r5.f51053b = r7
            r5.f51055d = r8
            r5.f51056e = r12
            androidx.media3.extractor.J$a r6 = new androidx.media3.extractor.J$a
            if (r7 != 0) goto L22
        L20:
            r0 = r2
            goto L5d
        L22:
            r8 = -1
            int r12 = r7.hashCode()
            switch(r12) {
                case 3046605: goto L4d;
                case 3046671: goto L42;
                case 3049879: goto L37;
                case 3049895: goto L2c;
                default: goto L2a;
            }
        L2a:
            r1 = r8
            goto L56
        L2c:
            java.lang.String r12 = "cens"
            boolean r7 = r7.equals(r12)
            if (r7 != 0) goto L35
            goto L2a
        L35:
            r1 = 3
            goto L56
        L37:
            java.lang.String r12 = "cenc"
            boolean r7 = r7.equals(r12)
            if (r7 != 0) goto L40
            goto L2a
        L40:
            r1 = r0
            goto L56
        L42:
            java.lang.String r12 = "cbcs"
            boolean r7 = r7.equals(r12)
            if (r7 != 0) goto L4b
            goto L2a
        L4b:
            r1 = r2
            goto L56
        L4d:
            java.lang.String r12 = "cbc1"
            boolean r7 = r7.equals(r12)
            if (r7 != 0) goto L56
            goto L2a
        L56:
            switch(r1) {
                case 0: goto L5d;
                case 1: goto L5d;
                case 2: goto L20;
                case 3: goto L20;
                default: goto L59;
            }
        L59:
            androidx.media3.common.util.s.g()
            goto L20
        L5d:
            r6.<init>(r0, r10, r11, r9)
            r5.f51054c = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.mp4.l.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
