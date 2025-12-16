package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class iw extends dtf implements sm6 {
    public final /* synthetic */ xw X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw(xw xwVar, long j, Continuation continuation) {
        super(2, continuation);
        this.X = xwVar;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((iw) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new iw(this.X, this.Y, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (r8.a(r5, true, r7) == r4) goto L15;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.o
            r1 = 2
            r2 = 1
            xw r3 = r7.X
            g84 r4 = defpackage.g84.a
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L1a
            if (r0 != r1) goto L12
            defpackage.g8j.b(r8)
            goto L4b
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            defpackage.g8j.b(r8)
            goto L34
        L1e:
            defpackage.g8j.b(r8)
            k18 r8 = r3.o
            java.lang.Object r8 = r8.getValue()
            w63 r8 = (defpackage.w63) r8
            long r5 = r3.a
            r7.o = r2
            java.lang.Object r8 = r8.r(r5, r7)
            if (r8 != r4) goto L34
            goto L4a
        L34:
            pb2 r8 = (defpackage.pb2) r8
            rf2 r8 = r8.b
            long r5 = r8.a
            k18 r8 = r3.v
            java.lang.Object r8 = r8.getValue()
            is6 r8 = (defpackage.is6) r8
            r7.o = r1
            java.lang.Comparable r8 = r8.a(r5, r2, r7)
            if (r8 != r4) goto L4b
        L4a:
            return r4
        L4b:
            long r0 = r7.Y
            r3.n(r0)
            qqg r8 = defpackage.qqg.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iw.n(java.lang.Object):java.lang.Object");
    }
}
