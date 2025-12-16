package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yb extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ac Y;
    public final /* synthetic */ k18 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yb(ac acVar, k18 k18Var, Continuation continuation) {
        super(2, continuation);
        this.Y = acVar;
        this.Z = k18Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yb) l((String) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yb ybVar = new yb(this.Y, this.Z, continuation);
        ybVar.X = obj;
        return ybVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            String str = (String) this.X;
            ac acVar = this.Y;
            if (str == null || str.length() == 0) {
                jve jveVar = acVar.X;
                this.o = 1;
                Object objA = jveVar.a(hd5.a, this);
                g84 g84Var = g84.a;
                if (objA == g84Var) {
                    return g84Var;
                }
            } else {
                z74 z74VarA = ((q2b) ((lzf) this.Z.getValue())).a();
                xb xbVar = new xb(acVar, str, null);
                yy7[] yy7VarArr = ac.s0;
                acVar.o.O(acVar, ac.s0[0], svi.d(acVar.a, z74VarA, i84.b, xbVar));
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
