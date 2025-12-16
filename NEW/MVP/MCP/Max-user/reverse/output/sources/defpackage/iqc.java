package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class iqc extends l0g {
    public List c;
    public int d;
    public Long o;

    public iqc(tm9 tm9Var) {
        super(tm9Var);
        if (this.c == null) {
            this.c = Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x000e  */
    @Override // defpackage.l0g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.tm9 r14, java.lang.String r15) throws java.io.IOException {
        /*
            r13 = this;
            r15.getClass()
            int r0 = r15.hashCode()
            r1 = 2
            r2 = 1
            r3 = 0
            r4 = -1
            switch(r0) {
                case -1081306054: goto L26;
                case -934426595: goto L1b;
                case 110549828: goto L10;
                default: goto Le;
            }
        Le:
            r15 = r4
            goto L30
        L10:
            java.lang.String r0 = "total"
            boolean r15 = r15.equals(r0)
            if (r15 != 0) goto L19
            goto Le
        L19:
            r15 = r1
            goto L30
        L1b:
            java.lang.String r0 = "result"
            boolean r15 = r15.equals(r0)
            if (r15 != 0) goto L24
            goto Le
        L24:
            r15 = r2
            goto L30
        L26:
            java.lang.String r0 = "marker"
            boolean r15 = r15.equals(r0)
            if (r15 != 0) goto L2f
            goto Le
        L2f:
            r15 = r3
        L30:
            switch(r15) {
                case 0: goto Lac;
                case 1: goto L3e;
                case 2: goto L37;
                default: goto L33;
            }
        L33:
            r14.v()
            return
        L37:
            int r14 = r14.s0()
            r13.d = r14
            return
        L3e:
            int r15 = defpackage.efi.f(r14)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r15)
            r13.c = r0
            r0 = r3
        L4a:
            if (r0 >= r15) goto Lab
            java.util.List r5 = r13.c
            int r6 = defpackage.efi.m(r14)
            r7 = 0
            r10 = r3
            r8 = r7
            r9 = r8
        L56:
            if (r10 >= r6) goto La0
            java.lang.String r11 = r14.w0()
            r11.getClass()
            int r12 = r11.hashCode()
            switch(r12) {
                case 3052376: goto L7e;
                case 357304895: goto L73;
                case 951526432: goto L68;
                default: goto L66;
            }
        L66:
            r11 = r4
            goto L88
        L68:
            java.lang.String r12 = "contact"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L71
            goto L66
        L71:
            r11 = r1
            goto L88
        L73:
            java.lang.String r12 = "highlights"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L7c
            goto L66
        L7c:
            r11 = r2
            goto L88
        L7e:
            java.lang.String r12 = "chat"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L87
            goto L66
        L87:
            r11 = r3
        L88:
            switch(r11) {
                case 0: goto L99;
                case 1: goto L94;
                case 2: goto L8f;
                default: goto L8b;
            }
        L8b:
            r14.v()
            goto L9d
        L8f:
            r04 r9 = defpackage.r04.a(r14)
            goto L9d
        L94:
            sz r8 = defpackage.sz.g(r14)
            goto L9d
        L99:
            qb2 r7 = defpackage.qb2.a(r14)
        L9d:
            int r10 = r10 + 1
            goto L56
        La0:
            jqc r6 = new jqc
            r6.<init>(r7, r8, r9)
            r5.add(r6)
            int r0 = r0 + 1
            goto L4a
        Lab:
            return
        Lac:
            long r14 = r14.t0()
            java.lang.Long r14 = java.lang.Long.valueOf(r14)
            r13.o = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iqc.d(tm9, java.lang.String):void");
    }

    @Override // defpackage.pj0
    public final String toString() {
        int iA = zdi.a(this.c);
        int i = this.d;
        Long l = this.o;
        StringBuilder sbK = wy1.k("{result=", iA, ", total=", i, ", marker=");
        sbK.append(l);
        sbK.append("}");
        return sbK.toString();
    }
}
