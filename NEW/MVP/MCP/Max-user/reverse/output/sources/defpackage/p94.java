package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class p94 extends dtf implements sm6 {
    public final /* synthetic */ r94 X;
    public final /* synthetic */ p92 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p94(r94 r94Var, p92 p92Var, Continuation continuation) {
        super(2, continuation);
        this.X = r94Var;
        this.Y = p92Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((p94) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new p94(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            jve jveVar = this.X.a;
            p92 p92Var = this.Y;
            n94 n94Var = new n94(p92Var.a, p92Var.b);
            this.o = 1;
            Object objA = jveVar.a(n94Var, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
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
