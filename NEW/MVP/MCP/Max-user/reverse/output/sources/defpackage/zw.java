package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class zw extends dtf implements sm6 {
    public final /* synthetic */ k18 X;
    public final /* synthetic */ hx Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zw(k18 k18Var, hx hxVar, Continuation continuation) {
        super(2, continuation);
        this.X = k18Var;
        this.Y = hxVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((zw) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new zw(this.X, this.Y, continuation);
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
        gx9 gx9Var = (gx9) this.X.getValue();
        hx hxVar = this.Y;
        long j = hxVar.a;
        long jQ = hxVar.d.q();
        rs4 rs4Var = rs4.DELAYED;
        this.o = 1;
        bsd bsdVar = gx9Var.a;
        Object objI = svi.i(((q2b) ((lzf) bsdVar.c.a)).b(), new qrd(rs4Var, bsdVar, j, jQ, null), this);
        g84 g84Var = g84.a;
        if (objI != g84Var) {
            objI = qqgVar;
        }
        if (objI != g84Var) {
            objI = qqgVar;
        }
        return objI == g84Var ? g84Var : qqgVar;
    }
}
