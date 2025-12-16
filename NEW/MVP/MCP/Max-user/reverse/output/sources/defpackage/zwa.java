package defpackage;

import android.os.Handler;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class zwa extends dtf implements sm6 {
    public final /* synthetic */ AtomicBoolean X;
    public final /* synthetic */ Handler Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zwa(AtomicBoolean atomicBoolean, Handler handler, Continuation continuation) {
        super(2, continuation);
        this.X = atomicBoolean;
        this.Y = handler;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zwa zwaVar = (zwa) l((xk) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zwaVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zwa zwaVar = new zwa(this.X, this.Y, continuation);
        zwaVar.o = obj;
        return zwaVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g8j.b(obj);
        xk xkVar = (xk) this.o;
        if (this.X.get()) {
            t1b t1bVar = t1b.a;
            w4e w4eVar = (w4e) ((pb3) t1bVar.getAccessor().c(46));
            w4eVar.g0.O(w4eVar, w4e.m0[50], Boolean.TRUE);
            ssb ssbVarB = eei.b();
            xkVar.initCause((Throwable) ssbVarB.c);
            wqi.p("ANR", "detect " + xkVar, xkVar);
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.o;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, "ANR-ThreadDump", ssbVarB.toString(), null);
                }
            }
            t1bVar.d().a(null, xkVar);
            if (this.X.compareAndSet(true, false)) {
                this.Y.postAtFrontOfQueue(new awa(2, this.X));
            }
        }
        return qqgVar;
    }
}
