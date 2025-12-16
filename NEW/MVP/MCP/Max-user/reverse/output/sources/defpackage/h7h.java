package defpackage;

import java.io.Serializable;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h7h extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ x26 Y;
    public final /* synthetic */ k7h Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h7h(x26 x26Var, Continuation continuation, k7h k7hVar) {
        super(2, continuation);
        this.Y = x26Var;
        this.Z = k7hVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((h7h) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        h7h h7hVar = new h7h(this.Y, continuation, this.Z);
        h7hVar.X = obj;
        return h7hVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            a40 a40Var = new a40((Serializable) new rid(), (z26) this.X, (Object) this.Z, 12);
            this.o = 1;
            Object objD = this.Y.d(a40Var, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
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
