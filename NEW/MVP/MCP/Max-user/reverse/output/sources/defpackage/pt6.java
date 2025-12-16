package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class pt6 extends dtf implements sm6 {
    public final /* synthetic */ qt6 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pt6(qt6 qt6Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.X = qt6Var;
        this.Y = j;
        this.Z = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pt6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pt6(this.X, this.Y, this.Z, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c9, code lost:
    
        if (r0 == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00aa A[PHI: r0
  0x00aa: PHI (r0v21 java.lang.Object) = (r0v20 java.lang.Object), (r0v30 java.lang.Object) binds: [B:30:0x00a7, B:11:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5  */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pt6.n(java.lang.Object):java.lang.Object");
    }
}
