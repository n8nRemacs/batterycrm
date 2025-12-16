package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class du1 extends dtf implements sm6 {
    public final /* synthetic */ eu1 X;
    public final /* synthetic */ k18 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public du1(eu1 eu1Var, k18 k18Var, Continuation continuation) {
        super(2, continuation);
        this.X = eu1Var;
        this.Y = k18Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        du1 du1Var = (du1) l((qa) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        du1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        du1 du1Var = new du1(this.X, this.Y, continuation);
        du1Var.o = obj;
        return du1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        Object au1Var;
        Object zt1Var;
        g8j.b(obj);
        qa qaVar = (qa) this.o;
        eu1 eu1Var = this.X;
        tcf tcfVar = eu1Var.c;
        do {
            value = tcfVar.getValue();
            au1Var = (cu1) value;
            Map map = qaVar.a;
            if (!map.isEmpty() || qaVar.b.isEmpty()) {
                if (map.isEmpty()) {
                    au1Var = new au1(qaVar.c);
                } else {
                    int size = map.size();
                    k18 k18Var = this.Y;
                    if (size == 1) {
                        zi1 zi1Var = (zi1) ((Map.Entry) ue3.F(map.entrySet())).getKey();
                        gs1 gs1Var = (gs1) ((Map.Entry) ue3.F(map.entrySet())).getValue();
                        zt1Var = new bu1(zi1Var, new r5g(eu1.u(eu1Var, gs1Var.getName())), ((mr1) k18Var.getValue()).a(new n5g(m0b.e2)), fui.a(gs1Var.j(), new Long(gs1Var.d())), gs1Var.q(), qaVar.c);
                    } else if (map.size() == 2) {
                        List listV = ue3.V(map.values());
                        zt1Var = new zt1(new p5g(m0b.d2, ys.D(new Object[]{eu1.u(eu1Var, ((gs1) ue3.G(listV)).getName()), eu1.u(eu1Var, ((gs1) ue3.P(listV)).getName())})), ((mr1) k18Var.getValue()).a(new n5g(m0b.f2)), eu1.t(eu1Var, listV), qaVar.c);
                    } else {
                        List listV2 = ue3.V(map.values());
                        zt1Var = new zt1(new p5g(m0b.c2, ys.D(new Object[]{eu1.u(eu1Var, ((gs1) ue3.G(listV2)).getName()), String.valueOf(listV2.size() - 1)})), ((mr1) k18Var.getValue()).a(new n5g(m0b.f2)), eu1.t(eu1Var, listV2), qaVar.c);
                    }
                    au1Var = zt1Var;
                }
            }
        } while (!tcfVar.c(value, au1Var));
        return qqg.a;
    }
}
