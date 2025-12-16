package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ivh extends dtf implements sm6 {
    public final /* synthetic */ uvh X;
    public final /* synthetic */ qv7 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ivh(uvh uvhVar, qv7 qv7Var, Continuation continuation) {
        super(2, continuation);
        this.X = uvhVar;
        this.Y = qv7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ivh) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ivh(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            uvh uvhVar = this.X;
            klc klcVar = (klc) uvhVar.y0.getValue();
            long jS = ((w4e) uvhVar.Z).s();
            this.o = 1;
            obj = klcVar.a(jS, this);
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
        this.Y.a(String.valueOf(((xac) obj).d.q()));
        return qqg.a;
    }
}
