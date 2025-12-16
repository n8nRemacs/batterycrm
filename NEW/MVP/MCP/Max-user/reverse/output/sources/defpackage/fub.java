package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fub extends dtf implements sm6 {
    public List X;
    public List Y;
    public List Z;
    public List o;
    public long s0;
    public int t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ kub v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fub(kub kubVar, Continuation continuation) {
        super(2, continuation);
        this.v0 = kubVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fub) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fub fubVar = new fub(this.v0, continuation);
        fubVar.u0 = obj;
        return fubVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0255, code lost:
    
        if (r4 == r3) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0310 A[LOOP:0: B:95:0x030a->B:97:0x0310, LOOP_END] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v9, types: [java.util.List] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 795
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fub.n(java.lang.Object):java.lang.Object");
    }
}
