package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fic extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ qic Y;
    public final /* synthetic */ pb2 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fic(qic qicVar, pb2 pb2Var, Continuation continuation) {
        super(2, continuation);
        this.Y = qicVar;
        this.Z = pb2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fic) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fic ficVar = new fic(this.Y, this.Z, continuation);
        ficVar.X = obj;
        return ficVar;
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
        f84 f84Var = (f84) this.X;
        qic qicVar = this.Y;
        if (!((ur3) qicVar.Z.getValue()).f()) {
            jve jveVar = qicVar.Y;
            this.o = 1;
            Object objA = jveVar.a(t94.a, this);
            g84 g84Var = g84.a;
            return objA == g84Var ? g84Var : qqgVar;
        }
        pb2 pb2Var = this.Z;
        if (pb2Var.b.a != 0) {
            qicVar.A0.set(((hwa) qicVar.X.getValue()).g(pb2Var.a, pb2Var.b.a, 0, null, true, null));
            return qqgVar;
        }
        wqi.q(f84Var.getClass().getName(), "Try update revokePrivateLink with charServerId == 0", new Object[0]);
        ((j94) qicVar.v0.getValue()).a("ONEME-18920", new IllegalArgumentException("Try update revokePrivateLink with charServerId == 0. ProfileInvite"));
        return qqgVar;
    }
}
