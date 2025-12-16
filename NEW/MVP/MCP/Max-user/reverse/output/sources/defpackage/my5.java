package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class my5 extends dtf implements sm6 {
    public ty5 X;
    public Object Y;
    public Object Z;
    public Object o;
    public AtomicReference s0;
    public int t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ ty5 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my5(ty5 ty5Var, Continuation continuation) {
        super(2, continuation);
        this.v0 = ty5Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((my5) l((sac) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        my5 my5Var = new my5(this.v0, continuation);
        my5Var.u0 = obj;
        return my5Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f4, code lost:
    
        if (r8.i(r0, r17) == r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0118, code lost:
    
        if (r7.a.h(r0, r17) != r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x012e, code lost:
    
        if (r4 != r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0201, code lost:
    
        if (((defpackage.pac) r8).a.h(r0, r17) == r3) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014e A[Catch: all -> 0x0179, TryCatch #2 {all -> 0x0179, blocks: (B:56:0x0189, B:58:0x018f, B:61:0x01ab, B:63:0x01b3, B:67:0x01e0, B:48:0x0148, B:50:0x014e, B:55:0x017e, B:47:0x0136), top: B:87:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018f A[Catch: all -> 0x0179, TryCatch #2 {all -> 0x0179, blocks: (B:56:0x0189, B:58:0x018f, B:61:0x01ab, B:63:0x01b3, B:67:0x01e0, B:48:0x0148, B:50:0x014e, B:55:0x017e, B:47:0x0136), top: B:87:0x0136 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v12, types: [sac] */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object, sac] */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my5.n(java.lang.Object):java.lang.Object");
    }
}
