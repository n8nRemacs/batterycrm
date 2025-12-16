package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ifa extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ jfa Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifa(jfa jfaVar, Continuation continuation) {
        super(2, continuation);
        this.Y = jfaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ifa) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ifa ifaVar = new ifa(this.Y, continuation);
        ifaVar.X = obj;
        return ifaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0071, code lost:
    
        if (r0.a((defpackage.o8c) r7, r6) == r4) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (r0.a(r5, r6) == r4) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [z26] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, z26] */
    /* JADX WARN: Type inference failed for: r0v7, types: [z26] */
    /* JADX WARN: Type inference failed for: r7v21, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.o
            r1 = 3
            r2 = 2
            r3 = 1
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L26
            if (r0 == r3) goto L1c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L10
            goto L18
        L10:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L18:
            defpackage.g8j.b(r7)
            goto L7d
        L1c:
            java.lang.Object r0 = r6.X
            z26 r0 = (defpackage.z26) r0
            defpackage.g8j.b(r7)     // Catch: java.lang.Throwable -> L24
            goto L51
        L24:
            r7 = move-exception
            goto L5a
        L26:
            defpackage.g8j.b(r7)
            java.lang.Object r7 = r6.X
            r0 = r7
            z26 r0 = (defpackage.z26) r0
            jfa r7 = r6.Y
            o8c r5 = r7.a
            if (r5 != 0) goto L74
            k18 r7 = r7.b     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L24
            exa r7 = (defpackage.exa) r7     // Catch: java.lang.Throwable -> L24
            r6.X = r0     // Catch: java.lang.Throwable -> L24
            r6.o = r3     // Catch: java.lang.Throwable -> L24
            k18 r7 = r7.a     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> L24
            m1g r7 = (defpackage.m1g) r7     // Catch: java.lang.Throwable -> L24
            m8c r1 = defpackage.m8c.d     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r7.e(r1, r6)     // Catch: java.lang.Throwable -> L24
            if (r7 != r4) goto L51
            goto L7c
        L51:
            n8c r7 = (defpackage.n8c) r7     // Catch: java.lang.Throwable -> L24
            java.lang.Object r7 = r7.c     // Catch: java.lang.Throwable -> L24
            o8c r7 = defpackage.wxi.b(r7)     // Catch: java.lang.Throwable -> L24
            goto L60
        L5a:
            ipd r1 = new ipd
            r1.<init>(r7)
            r7 = r1
        L60:
            boolean r1 = r7 instanceof defpackage.ipd
            r3 = 0
            if (r1 == 0) goto L67
            r7 = r3
        L67:
            o8c r7 = (defpackage.o8c) r7
            r6.X = r3
            r6.o = r2
            java.lang.Object r7 = r0.a(r7, r6)
            if (r7 != r4) goto L7d
            goto L7c
        L74:
            r6.o = r1
            java.lang.Object r7 = r0.a(r5, r6)
            if (r7 != r4) goto L7d
        L7c:
            return r4
        L7d:
            qqg r7 = defpackage.qqg.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ifa.n(java.lang.Object):java.lang.Object");
    }
}
