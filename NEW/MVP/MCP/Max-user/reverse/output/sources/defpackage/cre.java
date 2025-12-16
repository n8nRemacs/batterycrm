package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cre extends dtf implements sm6 {
    public final /* synthetic */ ere X;
    public final /* synthetic */ int Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cre(ere ereVar, int i, Continuation continuation) {
        super(2, continuation);
        this.X = ereVar;
        this.Y = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cre) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cre(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
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
        yy7[] yy7VarArr = ere.R0;
        ere ereVar = this.X;
        int iB = xrf.b(ereVar.x().g.getString("app.privacy.incoming.call", "ALL"));
        int i2 = this.Y;
        if (iB != i2) {
            ereVar.x().i("app.privacy.incoming.call", xrf.i(i2));
            hwa hwaVarW = ereVar.w();
            oxg oxgVar = new oxg();
            oxgVar.p = i2;
            hwaVarW.o(new qxg(oxgVar));
            this.o = 1;
            Object objV = ere.v(ereVar, this);
            g84 g84Var = g84.a;
            if (objV == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
