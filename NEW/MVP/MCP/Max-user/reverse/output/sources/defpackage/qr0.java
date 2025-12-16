package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qr0 extends dtf implements sm6 {
    public final /* synthetic */ sr0 X;
    public final /* synthetic */ rr0 Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr0(sr0 sr0Var, rr0 rr0Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = sr0Var;
        this.Y = rr0Var;
        this.Z = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qr0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qr0(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
    
        if (r13 == r1) goto L30;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r13) {
        /*
            r12 = this;
            qqg r0 = defpackage.qqg.a
            g84 r1 = defpackage.g84.a
            int r2 = r12.o
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L1f
            if (r2 == r5) goto L1b
            if (r2 != r3) goto L13
            defpackage.g8j.b(r13)
            goto L46
        L13:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L1b:
            defpackage.g8j.b(r13)
            return r0
        L1f:
            defpackage.g8j.b(r13)
            sr0 r13 = r12.X
            java.util.List r13 = r13.a
            if (r13 == 0) goto L6b
            boolean r13 = r13.isEmpty()
            if (r13 == 0) goto L2f
            goto L6b
        L2f:
            rr0 r7 = r12.Y
            long r8 = r12.Z
            sr0 r10 = r12.X
            pr0 r6 = new pr0
            r11 = 0
            r6.<init>(r7, r8, r10, r11)
            r12.o = r3
            bd5 r13 = defpackage.bd5.a
            java.lang.Object r13 = defpackage.vmi.i(r13, r6, r12)
            if (r13 != r1) goto L46
            goto L8a
        L46:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L8b
            rr0 r13 = r12.Y
            java.lang.String r13 = r13.c
            long r1 = r12.Z
            l6b r3 = defpackage.wqi.a
            if (r3 != 0) goto L59
            goto L8b
        L59:
            lg8 r5 = defpackage.lg8.X
            boolean r6 = r3.b(r5)
            if (r6 == 0) goto L8b
            java.lang.String r6 = "Failed to store botCommands, chatId = "
            java.lang.String r1 = defpackage.vb9.e(r1, r6)
            r3.c(r5, r13, r1, r4)
            return r0
        L6b:
            rr0 r13 = r12.Y
            long r2 = r12.Z
            r12.o = r5
            k18 r5 = r13.b
            java.lang.Object r5 = r5.getValue()
            lzf r5 = (defpackage.lzf) r5
            q2b r5 = (defpackage.q2b) r5
            z74 r5 = r5.b()
            lr0 r6 = new lr0
            r6.<init>(r13, r2, r4)
            java.lang.Object r13 = defpackage.svi.i(r5, r6, r12)
            if (r13 != r1) goto L8b
        L8a:
            return r1
        L8b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr0.n(java.lang.Object):java.lang.Object");
    }
}
