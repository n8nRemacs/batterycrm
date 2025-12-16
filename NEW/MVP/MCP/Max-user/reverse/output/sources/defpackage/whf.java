package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class whf extends xfh {
    public static final /* synthetic */ yy7[] x0;
    public final tcf X;
    public final hbd Y;
    public final ci5 Z;
    public final long b;
    public final lzf c;
    public final k18 d;
    public final k18 o;
    public final tcf s0;
    public final AtomicReference t0;
    public final AtomicReference u0;
    public final t9f v0;
    public x9f w0;

    static {
        z8a z8aVar = new z8a(whf.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        x0 = new yy7[]{z8aVar};
    }

    public whf(long j, k18 k18Var, fze fzeVar, k18 k18Var2, lzf lzfVar) {
        this.b = j;
        this.c = lzfVar;
        this.d = k18Var;
        this.o = k18Var2;
        tcf tcfVarA = ucf.a(f7e.c);
        this.X = tcfVarA;
        this.Y = new hbd(tcfVarA);
        this.Z = new ci5(0);
        tcf tcfVarA2 = ucf.a(null);
        this.s0 = tcfVarA2;
        this.t0 = new AtomicReference(hd5.a);
        this.u0 = new AtomicReference(new rhf((String) null, 3));
        this.v0 = c7j.c();
        gw0.w(gw0.u(new g56(new d53(new uxb(s8j.a(((tef) fzeVar.a.getValue()).l), fzeVar, 17), 9), new qhf(this, null), 1), ((q2b) lzfVar).b()), this.a);
        gw0.w(new g56(gw0.k(new d53(tcfVarA2, 8), 200L), new bzb(2, this, whf.class, "searchStickersByQuery", "searchStickersByQuery(Ljava/lang/String;)V", 4, 18), 1), this.a);
    }

    public static final fff t(whf whfVar, jef jefVar) {
        whfVar.getClass();
        long j = jefVar.a;
        long j2 = jefVar.u0;
        String str = jefVar.Z;
        if (l8g.c(str)) {
            str = jefVar.d;
        }
        return new fff(j, j2, j2, str, jefVar.v0, jefVar.y0, jefVar.b, jefVar.c, false, false, 0L, 7744);
    }

    public final boolean u() {
        rhf rhfVar = (rhf) this.u0.get();
        String str = rhfVar.a;
        return (rhfVar.b == 0 || str == null || str.length() == 0 || ((f7e) this.Y.a.getValue()).b.isEmpty()) ? false : true;
    }
}
