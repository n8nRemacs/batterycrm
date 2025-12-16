package defpackage;

import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class bg6 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ cg6 Y;
    public Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg6(cg6 cg6Var, Continuation continuation) {
        super(2, continuation);
        this.Y = cg6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bg6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new bg6(this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        cg6 cg6Var;
        f9a f9aVar;
        vg6 vg6Var;
        cg6 cg6Var2 = this.Y;
        yg6 yg6Var = cg6Var2.b;
        Set set = cg6Var2.a;
        int i = this.X;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            gx9 gx9Var = (gx9) pf6.a.getAccessor().c(138);
            this.o = cg6Var2;
            this.X = 1;
            obj = gx9Var.a.k(set, this);
            if (obj != g84Var) {
                cg6Var = cg6Var2;
            }
            return g84Var;
        }
        if (i != 1) {
            if (i == 2) {
                f9aVar = (f9a) this.o;
                g8j.b(obj);
                vg6Var = (vg6) obj;
                f9aVar.setValue(vg6Var);
                return qqgVar;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f9aVar = (f9a) this.o;
            g8j.b(obj);
            vg6Var = (vg6) obj;
            f9aVar.setValue(vg6Var);
            return qqgVar;
        }
        cg6Var = (cg6) this.o;
        g8j.b(obj);
        cg6Var.o = (List) obj;
        tcf tcfVar = cg6Var2.m;
        if (set.size() <= 1) {
            si9 si9Var = (si9) ue3.I(cg6Var2.o);
            if (si9Var != null) {
                Long l = cg6Var2.d;
                this.o = tcfVar;
                this.X = 3;
                Object objA = yg6Var.a(si9Var, l, this);
                if (objA != g84Var) {
                    f9aVar = tcfVar;
                    obj = objA;
                    vg6Var = (vg6) obj;
                    f9aVar.setValue(vg6Var);
                    return qqgVar;
                }
                return g84Var;
            }
            return qqgVar;
        }
        si9 si9Var2 = (si9) ue3.I(cg6Var2.o);
        if (si9Var2 != null) {
            long j = si9Var2.Z;
            List list = cg6Var2.o;
            this.o = tcfVar;
            this.X = 2;
            Object objB = yg6Var.b(j, this, list);
            if (objB != g84Var) {
                f9aVar = tcfVar;
                obj = objB;
                vg6Var = (vg6) obj;
                f9aVar.setValue(vg6Var);
                return qqgVar;
            }
            return g84Var;
        }
        return qqgVar;
    }
}
