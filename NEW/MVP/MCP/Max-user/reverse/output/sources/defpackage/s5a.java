package defpackage;

/* loaded from: classes2.dex */
public final class s5a extends l0g {
    public final long c;
    public final fh9 d;
    public final qb2 o;

    public s5a(long j, fh9 fh9Var, qb2 qb2Var) {
        this.c = j;
        this.d = fh9Var;
        this.o = qb2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.s5a e(defpackage.tm9 r15) {
        /*
            java.lang.String r0 = "payloadCatching catch error"
            java.lang.String r1 = "ServerPayload/PayloadCatching"
            boolean r2 = r15.l()
            if (r2 != 0) goto L10
            s5a r15 = new s5a
            r15.<init>()
            return r15
        L10:
            int r2 = r15.u0()
            if (r2 != 0) goto L1c
            s5a r15 = new s5a
            r15.<init>()
            return r15
        L1c:
            r3 = 0
            r5 = 0
            r6 = 0
            r7 = r3
            r9 = r5
            r10 = r9
        L23:
            if (r6 >= r2) goto Ld2
            r11 = 1
            java.lang.String r12 = defpackage.efi.p(r15, r5)     // Catch: java.lang.Throwable -> L2b
            goto L5a
        L2b:
            r12 = move-exception
            defpackage.wqi.p(r1, r0, r12)
            java.util.concurrent.CopyOnWriteArraySet r13 = defpackage.vfe.a
            java.util.Iterator r13 = r13.iterator()
        L35:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L48
            java.lang.Object r14 = r13.next()
            qwa r14 = (defpackage.qwa) r14
            r14.getClass()
            defpackage.qwa.a(r12)
            goto L35
        L48:
            int r13 = defpackage.ctd.a
            int r13 = defpackage.az1.v(r13)
            if (r13 == 0) goto L59
            if (r13 == r11) goto L58
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        L58:
            throw r12
        L59:
            r12 = r5
        L5a:
            if (r12 != 0) goto L5e
            goto Lce
        L5e:
            int r13 = r12.hashCode()
            r14 = -1361631597(0xffffffffaed72693, float:-9.78392E-11)
            if (r13 == r14) goto L8e
            r11 = 3052376(0x2e9358, float:4.27729E-39)
            if (r13 == r11) goto L80
            r11 = 954925063(0x38eb0007, float:1.1205678E-4)
            if (r13 == r11) goto L72
            goto L96
        L72:
            java.lang.String r11 = "message"
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L7b
            goto L96
        L7b:
            fh9 r9 = defpackage.ovi.a(r15)
            goto Lce
        L80:
            java.lang.String r11 = "chat"
            boolean r11 = r12.equals(r11)
            if (r11 != 0) goto L89
            goto L96
        L89:
            qb2 r10 = defpackage.qb2.a(r15)
            goto Lce
        L8e:
            java.lang.String r13 = "chatId"
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto L9a
        L96:
            r15.v()
            goto Lce
        L9a:
            long r7 = defpackage.efi.l(r15, r3)     // Catch: java.lang.Throwable -> L9f
            goto Lce
        L9f:
            r7 = move-exception
            defpackage.wqi.p(r1, r0, r7)
            java.util.concurrent.CopyOnWriteArraySet r8 = defpackage.vfe.a
            java.util.Iterator r8 = r8.iterator()
        La9:
            boolean r12 = r8.hasNext()
            if (r12 == 0) goto Lbc
            java.lang.Object r12 = r8.next()
            qwa r12 = (defpackage.qwa) r12
            r12.getClass()
            defpackage.qwa.a(r7)
            goto La9
        Lbc:
            int r8 = defpackage.ctd.a
            int r8 = defpackage.az1.v(r8)
            if (r8 == 0) goto Lcd
            if (r8 == r11) goto Lcc
            kotlin.NoWhenBranchMatchedException r15 = new kotlin.NoWhenBranchMatchedException
            r15.<init>()
            throw r15
        Lcc:
            throw r7
        Lcd:
            r7 = r3
        Lce:
            int r6 = r6 + 1
            goto L23
        Ld2:
            s5a r15 = new s5a
            r15.<init>(r7, r9, r10)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s5a.e(tm9):s5a");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5a)) {
            return false;
        }
        s5a s5aVar = (s5a) obj;
        return this.c == s5aVar.c && fni.a(this.d, s5aVar.d) && fni.a(this.o, s5aVar.o);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.c) * 31;
        fh9 fh9Var = this.d;
        int iHashCode2 = (iHashCode + (fh9Var == null ? 0 : fh9Var.hashCode())) * 31;
        qb2 qb2Var = this.o;
        return iHashCode2 + (qb2Var != null ? qb2Var.hashCode() : 0);
    }

    @Override // defpackage.pj0
    public final String toString() {
        return "Response(chatId=" + this.c + ", message=" + this.d + ")";
    }

    public /* synthetic */ s5a() {
        this(0L, null, null);
    }
}
