package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class kwb extends dtf implements sm6 {
    public final /* synthetic */ nwb X;
    public final /* synthetic */ pb2 Y;
    public final /* synthetic */ long[] Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kwb(nwb nwbVar, pb2 pb2Var, long[] jArr, Continuation continuation) {
        super(2, continuation);
        this.X = nwbVar;
        this.Y = pb2Var;
        this.Z = jArr;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((kwb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new kwb(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        yy7[] yy7VarArr = nwb.l;
        nwb nwbVar = this.X;
        if (((ur3) nwbVar.f.getValue()).f()) {
            nwbVar.i.set(((hwa) nwbVar.b.getValue()).a(nwbVar.a, this.Y.b.a, ys.C(this.Z), true));
            return qqgVar;
        }
        jve jveVar = nwbVar.g;
        this.o = 1;
        Object objA = jveVar.a(hwb.a, this);
        g84 g84Var = g84.a;
        return objA == g84Var ? g84Var : qqgVar;
    }
}
