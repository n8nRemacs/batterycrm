package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class aw1 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hw1 Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aw1(hw1 hw1Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = hw1Var;
        this.Z = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((aw1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        aw1 aw1Var = new aw1(this.Y, this.Z, continuation);
        aw1Var.X = obj;
        return aw1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        int i = this.o;
        qqg qqgVar = qqg.a;
        try {
            if (i == 0) {
                g8j.b(obj);
                hw1 hw1Var = this.Y;
                long j = this.Z;
                k1a k1aVar = (k1a) hw1Var.I0.getValue();
                int i2 = s65.d;
                long jH = v9j.h(10, y65.SECONDS);
                this.o = 1;
                Object objS = k1aVar.s(j, jH, this);
                g84 g84Var = g84.a;
                if (objS == g84Var) {
                    return g84Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
            }
            ipdVar = qqgVar;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Throwable thA = kpd.a(ipdVar);
        if (thA != null) {
            wqi.e("CallEngineTag", "fail to fetch missed user", thA);
        }
        return qqgVar;
    }
}
