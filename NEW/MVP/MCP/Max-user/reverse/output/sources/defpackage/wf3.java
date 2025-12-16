package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class wf3 extends dtf implements sm6 {
    public byte[] X;
    public int Y;
    public int Z;
    public n92 o;
    public int s0;
    public /* synthetic */ Object t0;
    public final /* synthetic */ x26[] u0;
    public final /* synthetic */ cm6 v0;
    public final /* synthetic */ dtf w0;
    public final /* synthetic */ z26 x0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public wf3(z26 z26Var, cm6 cm6Var, um6 um6Var, Continuation continuation, x26[] x26VarArr) {
        super(2, continuation);
        this.u0 = x26VarArr;
        this.v0 = cm6Var;
        this.w0 = (dtf) um6Var;
        this.x0 = z26Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wf3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [dtf, um6] */
    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wf3 wf3Var = new wf3(this.x0, this.v0, this.w0, continuation, this.u0);
        wf3Var.t0 = obj;
        return wf3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x007d, code lost:
    
        if (r8 != 0) goto L19;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:41:0x00c4, B:35:0x00b2], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:42:0x00c6, B:19:0x007d], limit reached: 48 */
    /* JADX WARN: Path cross not found for [B:44:0x00d4, B:47:0x00e7], limit reached: 48 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0 A[LOOP:0: B:30:0x00a0->B:52:?, LOOP_START, PHI: r8 r12
  0x00a0: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:27:0x009b, B:52:?] A[DONT_GENERATE, DONT_INLINE]
  0x00a0: PHI (r12v4 uj7) = (r12v3 uj7), (r12v11 uj7) binds: [B:27:0x009b, B:52:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r10v7, types: [n92] */
    /* JADX WARN: Type inference failed for: r10v9, types: [n92] */
    /* JADX WARN: Type inference failed for: r13v4, types: [dtf, um6] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x00e4 -> B:19:0x007d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00fc -> B:19:0x007d). Please report as a decompilation issue!!! */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wf3.n(java.lang.Object):java.lang.Object");
    }
}
