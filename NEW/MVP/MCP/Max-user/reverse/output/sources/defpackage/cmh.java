package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cmh extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ tmh Z;
    public String o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmh(tmh tmhVar, Continuation continuation, boolean z) {
        super(2, continuation);
        this.Y = z;
        this.Z = tmhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cmh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cmh(this.Z, continuation, this.Y);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r10 == r1) goto L53;
     */
    /* JADX WARN: Type inference failed for: r2v0, types: [int, java.lang.String] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cmh.n(java.lang.Object):java.lang.Object");
    }
}
