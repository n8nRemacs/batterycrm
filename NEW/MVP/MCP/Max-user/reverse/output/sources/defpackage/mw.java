package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mw extends dtf implements sm6 {
    public final /* synthetic */ xw X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(xw xwVar, long j, Continuation continuation) {
        super(2, continuation);
        this.X = xwVar;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mw) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mw(this.X, this.Y, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, jkd] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        mw mwVar;
        Object value;
        Object obj2;
        int i = this.o;
        xw xwVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            ?? r2 = xwVar.k;
            this.o = 1;
            mwVar = this;
            obj = xwVar.s(r2, this.Y, false, mwVar);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            mwVar = this;
        }
        if (((Number) obj).intValue() >= 0) {
            xwVar.c.s(new jv(xwVar, 1));
            tcf tcfVar = xwVar.B;
            pv pvVar = new pv(mwVar.Y, true);
            do {
                value = tcfVar.getValue();
                rv rvVar = (rv) value;
                obj2 = rvVar instanceof ov ? (ov) rvVar : null;
                if (obj2 == null) {
                    obj2 = pvVar;
                }
            } while (!tcfVar.c(value, obj2));
        }
        return qqg.a;
    }
}
