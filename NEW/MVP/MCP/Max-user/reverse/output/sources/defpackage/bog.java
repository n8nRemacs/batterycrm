package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bog extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ eog Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bog(eog eogVar, Continuation continuation) {
        super(2, continuation);
        this.Y = eogVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bog) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bog bogVar = new bog(this.Y, continuation);
        bogVar.X = obj;
        return bogVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        Object ipdVar;
        int i = this.o;
        eog eogVar = this.Y;
        try {
            if (i == 0) {
                g8j.b(obj);
                hwa hwaVar = (hwa) eogVar.s0.getValue();
                wua wuaVar = new wua(eogVar.b, (String) null);
                this.o = 1;
                obj = hwaVar.F(wuaVar, this);
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
            ipdVar = (c80) obj;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (!(ipdVar instanceof ipd)) {
            eogVar.v0.m(null, new Long(((c80) ipdVar).o));
            x9f x9fVar = eogVar.z0;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            eogVar.z0 = null;
            eogVar.z0 = xfh.o(eogVar, null, new dog(eogVar, null), 3);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            if (thA instanceof CancellationException) {
                throw thA;
            }
            xfh.r(eogVar.x0, new lmg(0, 6, vmi.d(thA)));
        }
        return qqg.a;
    }
}
