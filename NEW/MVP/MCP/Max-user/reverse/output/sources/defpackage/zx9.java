package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zx9 extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ pb2 Z;
    public x8d o;
    public final /* synthetic */ ay9 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zx9(pb2 pb2Var, ay9 ay9Var, Continuation continuation) {
        super(2, continuation);
        this.Z = pb2Var;
        this.s0 = ay9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zx9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zx9 zx9Var = new zx9(this.Z, this.s0, continuation);
        zx9Var.Y = obj;
        return zx9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objI;
        x8d x8dVar;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.Y;
            pb2 pb2Var = this.Z;
            if (pb2Var.x0 == null) {
                qy2 qy2Var = pb2Var.A0;
                String str = pb2Var.b.j0;
                qy2Var.getClass();
                pb2Var.x0 = l8g.c(str) ? null : ((yl9) qy2Var.g.get()).b(str);
            }
            x8d x8dVar2 = pb2Var.x0;
            if (x8dVar2 != null) {
                qt6 qt6Var = this.s0.h;
                pb2 pb2Var2 = this.Z;
                long j = pb2Var2.a;
                long j2 = pb2Var2.b.i0;
                this.Y = f84Var;
                this.o = x8dVar2;
                this.X = 1;
                objI = svi.i(((q2b) ((lzf) qt6Var.b)).b(), new pt6(qt6Var, j, j2, null), this);
                if (objI == g84Var) {
                    return g84Var;
                }
                x8dVar = x8dVar2;
            }
            return qqgVar;
        }
        if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        x8d x8dVar3 = this.o;
        g8j.b(obj);
        objI = obj;
        x8dVar = x8dVar3;
        si9 si9Var = (si9) objI;
        if (si9Var != null) {
            this.s0.f.invoke(Collections.singleton(x8dVar), new Long(si9Var.a));
            tcf tcfVar = this.s0.o;
            tcfVar.m(null, o3e.a((o3e) tcfVar.getValue(), 0, false, false, new n3e(this.Z.b.i0, si9Var.p(), x8dVar), 7));
            return qqgVar;
        }
        String str2 = this.s0.i;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.Y;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str2, "Chat model has reaction info, but can't find message for this reaction", null);
            }
        }
        return qqgVar;
    }
}
