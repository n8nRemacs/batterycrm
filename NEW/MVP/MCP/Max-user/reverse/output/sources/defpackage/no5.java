package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class no5 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ qo5 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public no5(qo5 qo5Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = qo5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((no5) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        no5 no5Var = new no5(this.Z, this.Y, continuation);
        no5Var.X = obj;
        return no5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0056, code lost:
    
        if (r0.a(r7, r6) == r3) goto L15;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.o
            r1 = 2
            r2 = 1
            g84 r3 = defpackage.g84.a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            defpackage.g8j.b(r7)
            goto L59
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            java.lang.Object r0 = r6.X
            z26 r0 = (defpackage.z26) r0
            defpackage.g8j.b(r7)
            goto L4d
        L20:
            defpackage.g8j.b(r7)
            java.lang.Object r7 = r6.X
            r0 = r7
            z26 r0 = (defpackage.z26) r0
            fh2 r7 = new fh2
            xhb r4 = defpackage.xhb.T1
            r5 = 26
            r7.<init>(r4, r5)
            java.lang.String r4 = "url"
            java.lang.String r5 = r6.Y
            r7.x(r4, r5)
            qo5 r4 = r6.Z
            k18 r4 = r4.b
            java.lang.Object r4 = r4.getValue()
            m1g r4 = (defpackage.m1g) r4
            r6.X = r0
            r6.o = r2
            java.lang.Object r7 = r4.e(r7, r6)
            if (r7 != r3) goto L4d
            goto L58
        L4d:
            r2 = 0
            r6.X = r2
            r6.o = r1
            java.lang.Object r7 = r0.a(r7, r6)
            if (r7 != r3) goto L59
        L58:
            return r3
        L59:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no5.n(java.lang.Object):java.lang.Object");
    }
}
