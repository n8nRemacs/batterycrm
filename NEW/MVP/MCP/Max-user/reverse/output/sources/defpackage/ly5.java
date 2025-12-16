package defpackage;

import java.nio.channels.AsynchronousFileChannel;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ly5 extends dtf implements sm6 {
    public final /* synthetic */ AtomicBoolean X;
    public final /* synthetic */ ty5 Y;
    public final /* synthetic */ AsynchronousFileChannel Z;
    public /* synthetic */ Object o;
    public final /* synthetic */ AtomicReference s0;
    public final /* synthetic */ sac t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ly5(AtomicBoolean atomicBoolean, ty5 ty5Var, AsynchronousFileChannel asynchronousFileChannel, AtomicReference atomicReference, sac sacVar, Continuation continuation) {
        super(2, continuation);
        this.X = atomicBoolean;
        this.Y = ty5Var;
        this.Z = asynchronousFileChannel;
        this.s0 = atomicReference;
        this.t0 = sacVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ly5 ly5Var = (ly5) l((ebg) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ly5Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ly5 ly5Var = new ly5(this.X, this.Y, this.Z, this.s0, this.t0, continuation);
        ly5Var.o = obj;
        return ly5Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ebg ebgVar = (ebg) this.o;
        AtomicBoolean atomicBoolean = this.X;
        boolean z = atomicBoolean.get();
        qqg qqgVar = qqg.a;
        if (!z) {
            return qqgVar;
        }
        ty5 ty5Var = this.Y;
        svi.e((f84) ty5Var.q.getValue(), ty5Var.p, null, new ky5(ty5Var, ebgVar, this.Z, atomicBoolean, this.s0, this.t0, null), 2);
        return qqgVar;
    }
}
