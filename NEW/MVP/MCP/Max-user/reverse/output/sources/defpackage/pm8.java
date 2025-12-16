package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pm8 extends dtf implements sm6 {
    public final /* synthetic */ qm8 X;
    public final /* synthetic */ zya Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pm8(qm8 qm8Var, zya zyaVar, Continuation continuation) {
        super(2, continuation);
        this.X = qm8Var;
        this.Y = zyaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pm8) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pm8(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
    
        if (r8.a(r5, r7) == r6) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0044, code lost:
    
        if (r0.a(r8, r7) == r6) goto L17;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            qm8 r0 = r7.X
            tcf r1 = r0.d
            int r2 = r7.o
            r3 = 2
            r4 = 1
            zya r5 = r7.Y
            if (r2 == 0) goto L20
            if (r2 == r4) goto L1c
            if (r2 != r3) goto L14
            defpackage.g8j.b(r8)
            goto L47
        L14:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1c:
            defpackage.g8j.b(r8)
            goto L4a
        L20:
            defpackage.g8j.b(r8)
            java.lang.Object r8 = r1.getValue()
            zya r8 = (defpackage.zya) r8
            boolean r2 = defpackage.fni.a(r8, r5)
            g84 r6 = defpackage.g84.a
            if (r2 == 0) goto L3c
            jve r8 = r0.Z
            r7.o = r4
            java.lang.Object r8 = r8.a(r5, r7)
            if (r8 != r6) goto L4a
            goto L46
        L3c:
            jve r0 = r0.t0
            r7.o = r3
            java.lang.Object r8 = r0.a(r8, r7)
            if (r8 != r6) goto L47
        L46:
            return r6
        L47:
            r1.setValue(r5)
        L4a:
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pm8.n(java.lang.Object):java.lang.Object");
    }
}
