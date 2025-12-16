package defpackage;

import java.io.File;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class k15 extends dtf implements sm6 {
    public final /* synthetic */ n15 X;
    public final /* synthetic */ File Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k15(n15 n15Var, File file, Continuation continuation) {
        super(2, continuation);
        this.X = n15Var;
        this.Y = file;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((k15) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new k15(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws NoSuchAlgorithmException {
        int i = this.o;
        n15 n15Var = this.X;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            ur3 ur3Var = (ur3) n15Var.k.getValue();
            this.o = 1;
            l42 l42Var = new l42(1, hni.f(this));
            l42Var.o();
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            if (ur3Var.f() && atomicBoolean.compareAndSet(false, true)) {
                l42Var.resumeWith(qqg.a);
            } else {
                wr3 wr3Var = new wr3(ur3Var, l42Var, atomicBoolean);
                wqi.c(ur3Var.getClass().getName(), "Network connection lost, waiting network.", new Object[0]);
                ur3Var.c(wr3Var);
                l42Var.e(new hu1(ur3Var, 3, wr3Var));
            }
            if (l42Var.n() != g84Var) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        ctf ctfVar = (ctf) n15Var.e.getValue();
        String str = n15Var.v;
        m2g m2gVar = n15Var.a;
        String str2 = m2gVar.g;
        String str3 = m2gVar.b;
        boolean z = m2gVar.m;
        this.o = 2;
        Object objB = ctfVar.a.b(str2, this.Y, n15Var, str3, z, str, this);
        return objB == g84Var ? g84Var : objB;
    }
}
