package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ysg extends dtf implements sm6 {
    public final /* synthetic */ zsg X;
    public final /* synthetic */ boolean Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ysg(zsg zsgVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = zsgVar;
        this.Y = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ysg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ysg(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        zsg zsgVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            hwa hwaVar = (hwa) zsgVar.a.getValue();
            oxg oxgVar = new oxg();
            oxgVar.y = Boolean.valueOf(this.Y);
            fh2 fh2Var = new fh2(null, 0L, new po3(null, new qxg(oxgVar), 23), false);
            this.o = 1;
            obj = hwaVar.F(fh2Var, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        qxg qxgVar = ((do3) obj).d;
        if (qxgVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        ((sxg) zsgVar.b.getValue()).t(qxgVar);
        ij2 ij2Var = (ij2) zsgVar.d.getValue();
        ij2Var.A.i(-1);
        ij2Var.C.i(-1);
        ((c7c) zsgVar.f.getValue()).a();
        ((w63) zsgVar.e.getValue()).i().X();
        ((ej0) zsgVar.g.getValue()).a(q03.a);
        return qqg.a;
    }
}
