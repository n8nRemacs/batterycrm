package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class gl9 {
    public final long a;
    public final String b;
    public final long c;
    public final Long d;
    public final long e;
    public final String f;
    public final long g;
    public final Bitmap h;
    public final long i;
    public final lm9 j;
    public final ot5 k;
    public final pma l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ gl9(long r24, java.lang.String r26, long r27, java.lang.Long r29, long r30, java.lang.String r32, long r33, android.graphics.Bitmap r35, long r36, defpackage.lm9 r38, defpackage.ot5 r39, defpackage.pma r40, boolean r41, int r42) {
        /*
            r23 = this;
            r0 = r42
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto La
            r1 = 0
            r19 = r1
            goto Lc
        La:
            r19 = r40
        Lc:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L15
            r20 = r3
            goto L17
        L15:
            r20 = r2
        L17:
            r1 = r0 & 8192(0x2000, float:1.148E-41)
            if (r1 == 0) goto L1e
            r21 = r3
            goto L20
        L1e:
            r21 = r2
        L20:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L3f
            r22 = r3
            r2 = r23
            r5 = r26
            r6 = r27
            r8 = r29
            r9 = r30
            r11 = r32
            r12 = r33
            r14 = r35
            r15 = r36
            r17 = r38
            r18 = r39
            r3 = r24
            goto L59
        L3f:
            r22 = r41
            r2 = r23
            r3 = r24
            r5 = r26
            r6 = r27
            r8 = r29
            r9 = r30
            r11 = r32
            r12 = r33
            r14 = r35
            r15 = r36
            r17 = r38
            r18 = r39
        L59:
            r2.<init>(r3, r5, r6, r8, r9, r11, r12, r14, r15, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl9.<init>(long, java.lang.String, long, java.lang.Long, long, java.lang.String, long, android.graphics.Bitmap, long, lm9, ot5, pma, boolean, int):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl9)) {
            return false;
        }
        gl9 gl9Var = (gl9) obj;
        return this.a == gl9Var.a && fni.a(this.b, gl9Var.b) && this.c == gl9Var.c && fni.a(this.d, gl9Var.d) && this.e == gl9Var.e && fni.a(this.f, gl9Var.f) && this.g == gl9Var.g && fni.a(this.h, gl9Var.h) && this.i == gl9Var.i && fni.a(this.j, gl9Var.j) && this.k == gl9Var.k && fni.a(this.l, gl9Var.l) && this.m == gl9Var.m && this.n == gl9Var.n && this.o == gl9Var.o;
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iA = a9h.a((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Long l = this.d;
        int iA2 = a9h.a(u45.e(a9h.a((iA + (l == null ? 0 : l.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g);
        Bitmap bitmap = this.h;
        int iHashCode2 = (this.k.hashCode() + ((this.j.hashCode() + a9h.a((iA2 + (bitmap == null ? 0 : bitmap.hashCode())) * 31, 31, this.i)) * 31)) * 31;
        pma pmaVar = this.l;
        return Boolean.hashCode(this.o) + a9h.b(a9h.b((iHashCode2 + (pmaVar != null ? pmaVar.hashCode() : 0)) * 31, 31, this.m), 31, this.n);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessageNotification(pushId=");
        sb.append(this.a);
        sb.append(", eventKey=");
        sb.append(this.b);
        sb.append(", chatServerId=");
        sb.append(this.c);
        sb.append(", chatId=");
        sb.append(this.d);
        sb.append(", messageId=");
        sb.append(this.e);
        sb.append("', senderUserId=");
        sb.append(this.g);
        sb.append(", time=");
        sb.append(this.i);
        sb.append(", text=");
        sb.append(this.j);
        sb.append(", fcmNotificationType=");
        sb.append(this.k);
        sb.append(", image=");
        sb.append(this.l);
        sb.append(", fcmSource=");
        sb.append(this.m);
        sb.append(", isScheduledMessage=");
        sb.append(this.n);
        sb.append(", hasAnyError=");
        return az1.k(sb, this.o, ")");
    }

    public gl9(long j, String str, long j2, Long l, long j3, String str2, long j4, Bitmap bitmap, long j5, lm9 lm9Var, ot5 ot5Var, pma pmaVar, boolean z, boolean z2, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = j2;
        this.d = l;
        this.e = j3;
        this.f = str2;
        this.g = j4;
        this.h = bitmap;
        this.i = j5;
        this.j = lm9Var;
        this.k = ot5Var;
        this.l = pmaVar;
        this.m = z;
        this.n = z2;
        this.o = z3;
    }
}
