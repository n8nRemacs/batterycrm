package defpackage;

import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class oi7 extends dtf implements sm6 {
    public int X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ bj7 Z;
    public long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi7(bj7 bj7Var, Continuation continuation) {
        super(2, continuation);
        this.Z = bj7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((oi7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        oi7 oi7Var = new oi7(this.Z, continuation);
        oi7Var.Y = obj;
        return oi7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        long jElapsedRealtime;
        bj7 bj7Var = this.Z;
        AtomicInteger atomicInteger = bj7Var.w0;
        int i = this.X;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.Y;
            jElapsedRealtime = SystemClock.elapsedRealtime();
            wqi.c(bj7.D0, "prefetch " + atomicInteger.get() + ": start load real albums", new Object[0]);
            ni7 ni7Var = new ni7(bj7Var, null);
            this.Y = f84Var;
            this.o = jElapsedRealtime;
            this.X = 1;
            obj = d7j.d(ni7Var, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jElapsedRealtime = this.o;
            f84Var = (f84) this.Y;
            g8j.b(obj);
        }
        List list = (List) obj;
        boolean zF = d7j.f(f84Var);
        qqg qqgVar = qqg.a;
        if (!zF) {
            return qqgVar;
        }
        bj7Var.u0.m(null, new yh5(list));
        String str = bj7.D0;
        StringBuilder sbM = u45.m(atomicInteger.get(), SystemClock.elapsedRealtime() - jElapsedRealtime, "prefetch ", ": finish load real albums, time = ");
        sbM.append("ms");
        wqi.c(str, sbM.toString(), new Object[0]);
        return qqgVar;
    }
}
