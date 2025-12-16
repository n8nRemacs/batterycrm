package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class jj extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ wj Y;
    public final /* synthetic */ n8a Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jj(wj wjVar, n8a n8aVar, Continuation continuation) {
        super(2, continuation);
        this.Y = wjVar;
        this.Z = n8aVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((jj) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jj jjVar = new jj(this.Y, this.Z, continuation);
        jjVar.X = obj;
        return jjVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        int i = this.o;
        try {
            if (i == 0) {
                g8j.b(obj);
                wj wjVar = this.Y;
                n8a n8aVar = this.Z;
                hwa hwaVar = wjVar.a;
                wua wuaVar = new wua(9, dsi.f(n8aVar));
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
            ipdVar = (gu) obj;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (ipdVar instanceof ipd) {
            return null;
        }
        return ipdVar;
    }
}
