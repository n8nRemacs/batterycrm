package defpackage;

import android.graphics.RectF;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public abstract class b95 {
    public final f84 a;
    public final tcf b;
    public final tcf c;
    public final jve d;
    public final jve e;
    public final x26 f;
    public final Object g;
    public final Object h;
    public final tcf i;
    public final tcf j;
    public e95 k;
    public final AtomicLong l;
    public final AtomicLong m;

    public b95(f84 f84Var) {
        this.a = f84Var;
        k18 k18VarC = yec.a.c();
        tcf tcfVarA = ucf.a(null);
        this.b = tcfVarA;
        tcf tcfVarA2 = ucf.a(hd5.a);
        this.c = tcfVarA2;
        this.d = kve.b(0, 0, 7);
        this.e = kve.b(0, 0, 7);
        this.f = gw0.u(new z41(new d53(tcfVarA, 12), tcfVarA2, new ld0(3, (Continuation) null, 12), 3), ((q2b) ((lzf) k18VarC.getValue())).a());
        this.g = ipi.b(3, new ps3(24));
        this.h = ipi.b(3, new ps3(25));
        this.i = ucf.a(null);
        tcf tcfVarA3 = ucf.a(null);
        this.j = tcfVarA3;
        this.l = new AtomicLong();
        this.m = new AtomicLong();
        gw0.w(gw0.u(new g56(tcfVarA3, new z85(this, null), 1), ((q2b) ((lzf) k18VarC.getValue())).a()), f84Var);
    }

    public abstract void a(int i);

    public abstract void b();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final d95 c() {
        return (d95) this.h.getValue();
    }

    public abstract boolean d();

    public abstract long e();

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final u85 f() {
        return (u85) this.g.getValue();
    }

    public abstract void g(int i);

    public abstract Object h(String str, RectF rectF, Continuation continuation);

    public abstract qqg i();

    public abstract void j();

    public abstract void k();

    public abstract Object l(q44 q44Var);

    public abstract void m(int i, String str);
}
