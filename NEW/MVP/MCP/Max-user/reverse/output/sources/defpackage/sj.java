package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sj extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wj Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(wj wjVar, Continuation continuation) {
        super(2, continuation);
        this.Y = wjVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((sj) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sj sjVar = new sj(this.Y, continuation);
        sjVar.X = obj;
        return sjVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        int i = this.o;
        qqg qqgVar = qqg.a;
        wj wjVar = this.Y;
        g84 g84Var = g84.a;
        try {
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (i == 0) {
            g8j.b(obj);
            hwa hwaVar = wjVar.a;
            w4e w4eVar = (w4e) wjVar.c;
            wua wuaVar = new wua(10, ((Number) w4eVar.Y.D(w4eVar, w4e.m0[42])).longValue());
            this.o = 1;
            obj = hwaVar.F(wuaVar, this);
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
                return qqgVar;
            }
            g8j.b(obj);
        }
        ipdVar = (tu) obj;
        if (ipdVar instanceof ipd) {
            ipdVar = null;
        }
        tu tuVar = (tu) ipdVar;
        if (tuVar != null) {
            ((w4e) wjVar.c).C(tuVar.c);
            List list = tuVar.d;
            Map map = tuVar.Z;
            this.o = 2;
            if (wj.c(wjVar, list, map, this) == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
