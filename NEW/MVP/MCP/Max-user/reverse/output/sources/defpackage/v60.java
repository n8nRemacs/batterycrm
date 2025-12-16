package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v60 extends dtf implements sm6 {
    public final /* synthetic */ w60 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v60(w60 w60Var, Continuation continuation) {
        super(2, continuation);
        this.X = w60Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((v60) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new v60(this.X, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c9, code lost:
    
        if (defpackage.s8j.c(75, r16) != r2) goto L46;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x00c9 -> B:46:0x00cc). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            qqg r1 = defpackage.qqg.a
            g84 r2 = defpackage.g84.a
            int r3 = r0.o
            r4 = 75
            r6 = 3
            r7 = 2
            r8 = 1
            if (r3 == 0) goto L2b
            if (r3 == r8) goto L27
            if (r3 == r7) goto L22
            if (r3 != r6) goto L1a
            defpackage.g8j.b(r17)
            goto Lcc
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L22:
            defpackage.g8j.b(r17)
            goto Lc3
        L27:
            defpackage.g8j.b(r17)
            goto L38
        L2b:
            defpackage.g8j.b(r17)
            r0.o = r8
            java.lang.Object r3 = defpackage.s8j.c(r4, r0)
            if (r3 != r2) goto L38
            goto Lcb
        L38:
            w60 r3 = r0.X
            x9f r3 = r3.n
            if (r3 == 0) goto Ld0
            boolean r3 = r3.isActive()
            if (r3 != r8) goto Ld0
            w60 r3 = r0.X
            k18 r9 = r3.a
            java.lang.Object r9 = r9.getValue()
            xfd r9 = (defpackage.xfd) r9
            int r9 = r9.a()
            r0.o = r7
            java.util.ArrayList r10 = r3.c
            r11 = 32768(0x8000, float:4.5918E-41)
            r12 = -4591842032569286656(0xc046800000000000, double:-45.0)
            if (r9 != 0) goto L62
            r7 = r12
            goto L6c
        L62:
            double r14 = (double) r9
            double r7 = (double) r11
            double r14 = r14 / r7
            double r7 = java.lang.Math.log10(r14)
            r14 = 4626322717216342016(0x4034000000000000, double:20.0)
            double r7 = r7 * r14
        L6c:
            int r14 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r14 >= 0) goto L71
            r7 = r12
        L71:
            double r7 = r7 - r12
            double r12 = (double) r11
            double r7 = r7 * r12
            r12 = 4631530004285489152(0x4046800000000000, double:45.0)
            double r7 = r7 / r12
            int r7 = (int) r7
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r7)
            r10.add(r8)
            java.util.ArrayList r7 = r3.c
            r8 = 0
            if (r7 == 0) goto Lbb
            boolean r10 = r7.isEmpty()
            if (r10 == 0) goto L8f
            goto Lbb
        L8f:
            int r10 = r7.size()
            byte[] r10 = new byte[r10]
            java.util.Iterator r7 = r7.iterator()
            r12 = 0
        L9a:
            boolean r13 = r7.hasNext()
            if (r13 == 0) goto Lba
            java.lang.Object r13 = r7.next()
            int r14 = r12 + 1
            if (r12 < 0) goto Lb6
            java.lang.Number r13 = (java.lang.Number) r13
            int r13 = r13.intValue()
            int r13 = r13 * 127
            int r13 = r13 / r11
            byte r13 = (byte) r13
            r10[r12] = r13
            r12 = r14
            goto L9a
        Lb6:
            defpackage.ve3.p()
            throw r8
        Lba:
            r8 = r10
        Lbb:
            r3.b = r8
            r3.a()
            if (r1 != r2) goto Lc3
            goto Lcb
        Lc3:
            r0.o = r6
            java.lang.Object r3 = defpackage.s8j.c(r4, r0)
            if (r3 != r2) goto Lcc
        Lcb:
            return r2
        Lcc:
            r7 = 2
            r8 = 1
            goto L38
        Ld0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v60.n(java.lang.Object):java.lang.Object");
    }
}
