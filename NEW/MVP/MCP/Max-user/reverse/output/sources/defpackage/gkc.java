package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gkc extends dtf implements sm6 {
    public final /* synthetic */ hkc X;
    public final /* synthetic */ HashMap Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gkc(hkc hkcVar, HashMap map, Continuation continuation) {
        super(2, continuation);
        this.X = hkcVar;
        this.Y = map;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gkc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gkc(this.X, this.Y, continuation);
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
        hkc hkcVar = this.X;
        if (((ur3) hkcVar.Y.getValue()).f()) {
            pb2 pb2Var = (pb2) ((w63) hkcVar.c.getValue()).j(hkcVar.b).a.getValue();
            if (pb2Var != null) {
                hkcVar.x0.set(((hwa) hkcVar.o.getValue()).g(pb2Var.a, pb2Var.b.a, 0, null, false, this.Y));
                return qqgVar;
            }
        } else {
            jve jveVar = hkcVar.s0;
            Boolean bool = Boolean.TRUE;
            this.o = 1;
            Object objA = jveVar.a(bool, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
