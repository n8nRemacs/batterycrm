package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class e33 extends dtf implements sm6 {
    public final /* synthetic */ b43 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ fh9 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e33(b43 b43Var, long j, fh9 fh9Var, Continuation continuation) {
        super(2, continuation);
        this.X = b43Var;
        this.Y = j;
        this.Z = fh9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((e33) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new e33(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            gx9 gx9Var = (gx9) this.X.x0.getValue();
            this.o = 1;
            obj = gx9Var.a(this.Y, this.Z, this);
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
        si9 si9Var = (si9) obj;
        if (si9Var != null) {
            return new Long(si9Var.a);
        }
        return null;
    }
}
