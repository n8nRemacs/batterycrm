package defpackage;

import java.nio.channels.AsynchronousFileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ky5 extends dtf implements sm6 {
    public long X;
    public int Y;
    public final /* synthetic */ ty5 Z;
    public Object o;
    public final /* synthetic */ ebg s0;
    public final /* synthetic */ AsynchronousFileChannel t0;
    public final /* synthetic */ AtomicBoolean u0;
    public final /* synthetic */ AtomicReference v0;
    public final /* synthetic */ sac w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ky5(ty5 ty5Var, ebg ebgVar, AsynchronousFileChannel asynchronousFileChannel, AtomicBoolean atomicBoolean, AtomicReference atomicReference, sac sacVar, Continuation continuation) {
        super(2, continuation);
        this.Z = ty5Var;
        this.s0 = ebgVar;
        this.t0 = asynchronousFileChannel;
        this.u0 = atomicBoolean;
        this.v0 = atomicReference;
        this.w0 = sacVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ky5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ky5(this.Z, this.s0, this.t0, this.u0, this.v0, this.w0, continuation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x011d, code lost:
    
        if (r0.c(r1, r16) == r7) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x014e, code lost:
    
        if (r0.c(r1, r16) != r7) goto L55;
     */
    @Override // defpackage.ij0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ky5.n(java.lang.Object):java.lang.Object");
    }
}
