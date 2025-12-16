package defpackage;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class loa implements ui8 {
    public static final /* synthetic */ int Y = 0;
    public final ContextScope X;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;

    public loa(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, lzf lzfVar, a84 a84Var) {
        this.a = k18Var;
        this.b = k18Var2;
        this.c = k18Var3;
        this.d = k18Var4;
        this.o = k18Var5;
        this.X = d7j.a(((q2b) lzfVar).b().limitedParallelism(1, "notifs-readmarks").plus(a84Var));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0087, code lost:
    
        if (r15 == r10) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.loa r11, defpackage.pb2 r12, long r13, defpackage.q44 r15) {
        /*
            boolean r0 = r15 instanceof defpackage.goa
            if (r0 == 0) goto L14
            r0 = r15
            goa r0 = (defpackage.goa) r0
            int r1 = r0.t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.t0 = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            goa r0 = new goa
            r0.<init>(r11, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r6.Z
            int r0 = r6.t0
            r8 = 2
            r9 = 1
            g84 r10 = defpackage.g84.a
            if (r0 == 0) goto L42
            if (r0 == r9) goto L36
            if (r0 != r8) goto L2e
            boolean r11 = r6.Y
            defpackage.g8j.b(r15)
            goto L8a
        L2e:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L36:
            long r13 = r6.X
            pb2 r12 = r6.o
            loa r11 = r6.d
            defpackage.g8j.b(r15)
            r1 = r11
            r4 = r13
            goto L70
        L42:
            defpackage.g8j.b(r15)
            k18 r15 = r11.c
            java.lang.Object r15 = r15.getValue()
            pb3 r15 = (defpackage.pb3) r15
            w4e r15 = (defpackage.w4e) r15
            long r0 = r15.s()
            r2 = -1
            int r15 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r15 == 0) goto L9b
            r6.d = r11
            r6.o = r12
            r6.X = r13
            r6.t0 = r9
            r2 = r12
            r3 = r13
            r7 = r6
            r5 = r0
            r1 = r11
            java.lang.Object r15 = r1.d(r2, r3, r5, r7)
            r6 = r7
            if (r15 != r10) goto L6e
            goto L89
        L6e:
            r12 = r2
            r4 = r3
        L70:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r11 = r15.booleanValue()
            rf2 r12 = r12.b
            long r2 = r12.a
            r12 = 0
            r6.d = r12
            r6.o = r12
            r6.Y = r11
            r6.t0 = r8
            java.lang.Object r15 = r1.b(r2, r4, r6)
            if (r15 != r10) goto L8a
        L89:
            return r10
        L8a:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r12 = r15.booleanValue()
            if (r12 != 0) goto L96
            if (r11 == 0) goto L95
            goto L96
        L95:
            r9 = 0
        L96:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r9)
            return r11
        L9b:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "logged out"
            r11.<init>(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.loa.a(loa, pb2, long, q44):java.lang.Object");
    }

    public final Object b(long j, long j2, q44 q44Var) {
        coa coaVar = (coa) this.a.getValue();
        return i8j.a(coaVar.a, new ia(coaVar, 25, new cna(j, j2)), q44Var);
    }

    @Override // defpackage.ui8
    public final void c() {
        eoi.c(this.X.getCoroutineContext(), new CancellationException("logout"));
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.pb2 r14, long r15, long r17, defpackage.q44 r19) {
        /*
            r13 = this;
            r6 = r15
            r0 = r19
            boolean r1 = r0 instanceof defpackage.hoa
            if (r1 == 0) goto L17
            r1 = r0
            hoa r1 = (defpackage.hoa) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.Z = r2
        L15:
            r9 = r1
            goto L1d
        L17:
            hoa r1 = new hoa
            r1.<init>(r13, r0)
            goto L15
        L1d:
            java.lang.Object r0 = r9.X
            int r1 = r9.Z
            r10 = 1
            if (r1 == 0) goto L36
            if (r1 != r10) goto L2e
            long r1 = r9.o
            pb2 r14 = r9.d
            defpackage.g8j.b(r0)
            goto L87
        L2e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L36:
            defpackage.g8j.b(r0)
            long r11 = r14.p()
            int r0 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r0 < 0) goto L44
            java.lang.Boolean r14 = java.lang.Boolean.FALSE
            return r14
        L44:
            long r0 = r14.a
            java.lang.String r2 = "changeSelfReadMarkInChatsCache: chatId="
            java.lang.String r3 = ", mark="
            java.lang.StringBuilder r0 = defpackage.az1.l(r0, r2, r3)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "loa"
            defpackage.wqi.d(r1, r0)
            k18 r0 = r13.b
            java.lang.Object r0 = r0.getValue()
            r1 = r0
            w63 r1 = (defpackage.w63) r1
            long r2 = r14.a
            r9.d = r14
            r9.o = r11
            r9.Z = r10
            r1.getClass()
            k63 r0 = new k63
            r8 = 0
            r4 = r17
            r0.<init>(r1, r2, r4, r6, r8)
            bd5 r1 = defpackage.bd5.a
            java.lang.Object r0 = defpackage.vmi.i(r1, r0, r9)
            g84 r1 = defpackage.g84.a
            if (r0 != r1) goto L81
            goto L83
        L81:
            qqg r0 = defpackage.qqg.a
        L83:
            if (r0 != r1) goto L86
            return r1
        L86:
            r1 = r11
        L87:
            long r3 = r14.p()
            int r14 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r14 == 0) goto L90
            goto L91
        L90:
            r10 = 0
        L91:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.loa.d(pb2, long, long, q44):java.lang.Object");
    }

    public final void e(long j, long j2) {
        StringBuilder sbL = az1.l(j, "onSelfReadMarkChanged: chatId=", ", mark=");
        sbL.append(j2);
        wqi.c("loa", sbL.toString(), new Object[0]);
        svi.e(this.X, null, null, new joa(this, j, j2, null), 3);
    }

    public final void f(long j, long j2) {
        StringBuilder sbL = az1.l(j, "onSelfReadMarkChangedByServerId: chatServerId=", ", mark=");
        sbL.append(j2);
        wqi.c("loa", sbL.toString(), new Object[0]);
        svi.e(this.X, null, null, new koa(this, j, j2, null), 3);
    }
}
