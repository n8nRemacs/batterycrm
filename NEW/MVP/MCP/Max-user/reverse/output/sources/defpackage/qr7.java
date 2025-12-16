package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qr7 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ String Z;
    public String o;
    public final /* synthetic */ wr7 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qr7(String str, String str2, wr7 wr7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = str2;
        this.s0 = wr7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qr7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qr7(this.Y, this.Z, this.s0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007c, code lost:
    
        if (r10 == r6) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.X
            r1 = 3
            r2 = 2
            r3 = 1
            qqg r4 = defpackage.qqg.a
            wr7 r5 = r9.s0
            g84 r6 = defpackage.g84.a
            if (r0 == 0) goto L29
            if (r0 == r3) goto L23
            if (r0 == r2) goto L1f
            if (r0 != r1) goto L17
            defpackage.g8j.b(r10)
            goto L7f
        L17:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1f:
            defpackage.g8j.b(r10)
            goto L66
        L23:
            java.lang.String r0 = r9.o
            defpackage.g8j.b(r10)
            goto L49
        L29:
            defpackage.g8j.b(r10)
            java.lang.String r10 = r9.Y
            java.lang.String r0 = " "
            java.lang.String r7 = r9.Z
            java.lang.String r10 = defpackage.u45.k(r10, r0, r7)
            yid r0 = r5.H0
            java.lang.String r8 = ""
            java.lang.String r0 = r0.b(r10, r8)
            r9.o = r0
            r9.X = r3
            java.lang.Object r10 = defpackage.wr7.t(r5, r0, r7, r9)
            if (r10 != r6) goto L49
            goto L7e
        L49:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L52
            goto La2
        L52:
            k18 r10 = r5.c
            java.lang.Object r10 = r10.getValue()
            ks6 r10 = (defpackage.ks6) r10
            r3 = 0
            r9.o = r3
            r9.X = r2
            java.lang.Object r10 = r10.a(r0, r9)
            if (r10 != r6) goto L66
            goto L7e
        L66:
            java.lang.Long r10 = (java.lang.Long) r10
            if (r10 == 0) goto La2
            long r2 = r10.longValue()
            k18 r10 = r5.o
            java.lang.Object r10 = r10.getValue()
            w63 r10 = (defpackage.w63) r10
            r9.X = r1
            java.lang.Object r10 = r10.p(r2, r9)
            if (r10 != r6) goto L7f
        L7e:
            return r6
        L7f:
            pb2 r10 = (defpackage.pb2) r10
            if (r10 == 0) goto La2
            ci5 r0 = r5.w0
            xq7 r1 = defpackage.xq7.c
            long r2 = r10.a
            r1.getClass()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r1 = ":chats?id="
            r10.<init>(r1)
            r10.append(r2)
            java.lang.String r1 = "&type=local"
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            defpackage.xc0.l(r10, r0)
        La2:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qr7.n(java.lang.Object):java.lang.Object");
    }
}
