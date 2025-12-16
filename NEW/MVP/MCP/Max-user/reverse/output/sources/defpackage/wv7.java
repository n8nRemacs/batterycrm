package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wv7 extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ ra3 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wv7(String str, String str2, ra3 ra3Var, Continuation continuation) {
        super(2, continuation);
        this.X = str;
        this.Y = str2;
        this.Z = ra3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wv7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wv7(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006d, code lost:
    
        if (r7.a(r5, r0, r9) == r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
    
        if (r10.a(r5, r0, r9) == r6) goto L24;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.o
            java.lang.String r1 = "JsBridge"
            r2 = 2
            r3 = 1
            r4 = 0
            java.lang.String r5 = r9.X
            if (r0 == 0) goto L20
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L13
            defpackage.g8j.b(r10)
            goto L7d
        L13:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1b:
            defpackage.g8j.b(r10)
            goto L93
        L20:
            defpackage.g8j.b(r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Process js event: "
            r10.<init>(r0)
            r10.append(r5)
            java.lang.String r0 = ", data = "
            r10.append(r0)
            java.lang.String r0 = r9.Y
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            defpackage.wqi.h(r1, r10, r4)
            ra3 r10 = r9.Z
            java.lang.Object r6 = r10.d
            java.util.List r6 = (java.util.List) r6
            java.util.Iterator r6 = r6.iterator()
        L48:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L60
            java.lang.Object r7 = r6.next()
            r8 = r7
            cw7 r8 = (defpackage.cw7) r8
            java.util.Set r8 = r8.c()
            boolean r8 = r8.contains(r5)
            if (r8 == 0) goto L48
            goto L61
        L60:
            r7 = r4
        L61:
            cw7 r7 = (defpackage.cw7) r7
            g84 r6 = defpackage.g84.a
            if (r7 == 0) goto L70
            r9.o = r3
            java.lang.Object r10 = r7.a(r5, r0, r9)
            if (r10 != r6) goto L93
            goto L7c
        L70:
            java.lang.Object r10 = r10.e
            rzh r10 = (defpackage.rzh) r10
            r9.o = r2
            java.lang.Object r10 = r10.a(r5, r0, r9)
            if (r10 != r6) goto L7d
        L7c:
            return r6
        L7d:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r0 = "Unhandled method "
            r10.<init>(r0)
            r10.append(r5)
            java.lang.String r0 = " in JsBridge"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            defpackage.wqi.e(r1, r10, r4)
        L93:
            qqg r10 = defpackage.qqg.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wv7.n(java.lang.Object):java.lang.Object");
    }
}
