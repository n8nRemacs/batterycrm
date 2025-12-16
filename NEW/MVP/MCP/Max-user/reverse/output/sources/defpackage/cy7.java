package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class cy7 extends dpd implements um6 {
    public int c;
    public /* synthetic */ pi4 d;
    public final /* synthetic */ c0 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cy7(c0 c0Var, Continuation continuation) {
        super(3, continuation);
        this.o = c0Var;
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        cy7 cy7Var = new cy7(this.o, (Continuation) obj3);
        cy7Var.d = (pi4) obj;
        return cy7Var.n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        c0 c0Var = this.o;
        ggg gggVar = (ggg) c0Var.c;
        int i = this.c;
        if (i == 0) {
            g8j.b(obj);
            pi4 pi4Var = this.d;
            byte bX = gggVar.X();
            if (bX == 1) {
                return c0Var.g(true);
            }
            if (bX == 0) {
                return c0Var.g(false);
            }
            if (bX != 6) {
                if (bX == 8) {
                    return c0Var.f();
                }
                ggg.G(gggVar, "Can't begin reading element, unexpected token", 0, null, 6);
                throw null;
            }
            this.c = 1;
            obj = c0.d(c0Var, pi4Var, this);
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
        return (sw7) obj;
    }
}
