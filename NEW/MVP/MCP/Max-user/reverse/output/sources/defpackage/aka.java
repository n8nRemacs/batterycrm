package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class aka extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ xja Y;
    public final /* synthetic */ cka Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aka(long j, xja xjaVar, cka ckaVar, Continuation continuation) {
        super(2, continuation);
        this.X = j;
        this.Y = xjaVar;
        this.Z = ckaVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((aka) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new aka(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (defpackage.cka.a(r1, r10, r3, r19) == r15) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
    
        if (r2 == r15) goto L34;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aka.n(java.lang.Object):java.lang.Object");
    }
}
