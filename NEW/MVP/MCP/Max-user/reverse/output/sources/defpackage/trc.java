package defpackage;

import android.content.Context;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class trc extends xfh {
    public static final /* synthetic */ yy7[] u0;
    public final ci5 X;
    public final t9f Y;
    public final x9f Z;
    public final kw6 b;
    public final lzf c;
    public final hbd d;
    public final n1a o;
    public final tcf s0;
    public final hbd t0;

    static {
        z8a z8aVar = new z8a(trc.class, "scanLocalImageJob", "getScanLocalImageJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        u0 = new yy7[]{z8aVar};
    }

    public trc() {
        mrc mrcVar = mrc.a;
        Context context = (Context) mrcVar.getAccessor().c(12);
        ExecutorService executorServiceC = ((g4b) mrcVar.getAccessor().c(56)).c();
        kw6 kw6Var = new kw6();
        kw6Var.a = context;
        kw6Var.b = executorServiceC;
        kw6Var.c = new bwf(new e44(24, kw6Var));
        tcf tcfVarA = ucf.a(jrc.a);
        kw6Var.d = tcfVarA;
        kw6Var.o = new hbd(tcfVarA);
        lzf lzfVar = (lzf) mrcVar.getAccessor().c(8);
        this.b = kw6Var;
        this.c = lzfVar;
        this.d = (hbd) kw6Var.o;
        String name = kw6.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "GoogleMlKit analyzer", null);
            }
        }
        this.o = new n1a(Collections.singletonList((ni0) ((bwf) kw6Var.c).getValue()), executorServiceC, new s32(1, kw6Var));
        this.X = new ci5(0);
        this.Y = c7j.c();
        tcf tcfVarA2 = ucf.a(Boolean.FALSE);
        this.s0 = tcfVarA2;
        this.t0 = new hbd(tcfVarA2);
        x9f x9fVar = this.Z;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.Z = xfh.o(this, ((q2b) lzfVar).a(), new src(this, null), 2);
    }

    public final void t(zyd zydVar) {
        xfh.r(this.X, new prc(zydVar));
    }
}
