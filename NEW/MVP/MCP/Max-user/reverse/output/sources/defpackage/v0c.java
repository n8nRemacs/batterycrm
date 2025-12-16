package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class v0c extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ pb2 Y;
    public final /* synthetic */ long Z;
    public final /* synthetic */ x0c o;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0c(x0c x0cVar, int i, pb2 pb2Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.o = x0cVar;
        this.X = i;
        this.Y = pb2Var;
        this.Z = j;
        this.s0 = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        v0c v0cVar = (v0c) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        v0cVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new v0c(this.o, this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ccb ccbVar = (ccb) this.o.e.getValue();
        ccbVar.c(new kcb(0, 0, this.X, 3));
        ccbVar.g(new n5g(m8b.d));
        ccbVar.e(tcb.a);
        ccbVar.f(new zcb(new n5g(mvd.q)));
        final x0c x0cVar = this.o;
        final pb2 pb2Var = this.Y;
        final long j = this.Z;
        final long j2 = this.s0;
        ccbVar.d(new dcb() { // from class: t0c
            @Override // defpackage.dcb
            public final void l(ecb ecbVar) {
                if (ecbVar == ecb.o) {
                    x0c x0cVar2 = x0cVar;
                    svi.e(x0cVar2.d, ((q2b) x0cVar2.b).b(), null, new u0c(x0cVar2, pb2Var, j, j2, null), 2);
                }
            }
        });
        ccbVar.i();
        return qqg.a;
    }
}
