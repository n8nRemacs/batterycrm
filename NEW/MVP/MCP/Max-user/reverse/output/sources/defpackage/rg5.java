package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rg5 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ sg5 Y;
    public final /* synthetic */ String Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg5(sg5 sg5Var, String str, Continuation continuation) {
        super(2, continuation);
        this.Y = sg5Var;
        this.Z = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rg5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rg5 rg5Var = new rg5(this.Y, this.Z, continuation);
        rg5Var.X = obj;
        return rg5Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        sg5 sg5Var = this.Y;
        ci5 ci5Var = sg5Var.o;
        int i = this.o;
        qqg qqgVar = qqg.a;
        try {
            if (i == 0) {
                g8j.b(obj);
                f84 f84Var2 = (f84) this.X;
                sg5Var.s0 = true;
                bwf bwfVar = if5.a;
                String strA = if5.a(this.Z);
                if (!d7j.f(f84Var2)) {
                    return qqgVar;
                }
                pe8 pe8Var = (pe8) ((pb3) sg5Var.b.getValue());
                if (!fni.a(pe8Var.g.getString("app.pin_" + pe8Var.s(), null), strA)) {
                    xfh.r(ci5Var, tg5.b);
                    return qqgVar;
                }
                xfh.r(ci5Var, tg5.a);
                this.X = f84Var2;
                this.o = 1;
                Object objC = s8j.c(1000L, this);
                g84 g84Var = g84.a;
                if (objC == g84Var) {
                    return g84Var;
                }
                f84Var = f84Var2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                f84Var = (f84) this.X;
                g8j.b(obj);
            }
            if (d7j.f(f84Var)) {
                xfh.r(sg5Var.X, qqgVar);
            }
            return qqgVar;
        } finally {
            sg5Var.s0 = false;
        }
    }
}
