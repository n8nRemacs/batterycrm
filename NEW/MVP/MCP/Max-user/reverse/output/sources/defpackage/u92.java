package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public class u92 extends t92 {
    public final /* synthetic */ int d = 1;
    public final Object o;

    public u92(Iterable iterable, x74 x74Var, int i, int i2) {
        super(x74Var, i, i2);
        this.o = iterable;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [dtf, sm6] */
    @Override // defpackage.t92
    public Object j(sac sacVar, Continuation continuation) {
        switch (this.d) {
            case 0:
                Object objInvoke = ((dtf) this.o).invoke(sacVar, continuation);
                if (objInvoke != g84.a) {
                    break;
                }
                break;
            default:
                xde xdeVar = new xde(sacVar);
                Iterator it = ((Iterable) this.o).iterator();
                while (it.hasNext()) {
                    svi.e(sacVar, null, null, new ga2((x26) it.next(), xdeVar, null), 3);
                }
                break;
        }
        return qqg.a;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [dtf, sm6] */
    @Override // defpackage.t92
    public t92 k(x74 x74Var, int i, int i2) {
        switch (this.d) {
            case 0:
                return new u92((sm6) this.o, x74Var, i, i2);
            default:
                return new u92((Iterable) this.o, x74Var, i, i2);
        }
    }

    @Override // defpackage.t92
    public ccd m(f84 f84Var) {
        switch (this.d) {
            case 1:
                s92 s92Var = new s92(this, null);
                pac pacVar = new pac(z6j.c(f84Var, this.a), gzi.a(this.b, 1, 4));
                pacVar.start(i84.a, pacVar, s92Var);
                return pacVar;
            default:
                return super.m(f84Var);
        }
    }

    @Override // defpackage.t92
    public String toString() {
        switch (this.d) {
            case 0:
                return "block[" + ((dtf) this.o) + "] -> " + super.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u92(sm6 sm6Var, x74 x74Var, int i, int i2) {
        super(x74Var, i, i2);
        this.o = (dtf) sm6Var;
    }
}
