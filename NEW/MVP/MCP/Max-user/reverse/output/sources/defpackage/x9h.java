package defpackage;

import android.graphics.Bitmap;

/* loaded from: classes2.dex */
public final class x9h extends xfh {
    public static final /* synthetic */ yy7[] B0;
    public final hbd A0;
    public final tcf X;
    public final xnb Y;
    public final ci5 Z;
    public final i5h b;
    public final lzf c;
    public final k18 d;
    public final bwf o;
    public final ci5 s0;
    public volatile int t0;
    public volatile int u0;
    public final tcf v0;
    public final hbd w0;
    public final tcf x0;
    public final t9f y0;
    public final tcf z0;

    static {
        z8a z8aVar = new z8a(x9h.class, "loadFramesJob", "getLoadFramesJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        B0 = new yy7[]{z8aVar};
    }

    public x9h() {
        uv2 uv2Var = uv2.a;
        i5h i5hVar = (i5h) uv2Var.getAccessor().c(495);
        lzf dispatchers = uv2Var.getDispatchers();
        hed hedVar = (hed) uv2Var.getAccessor().c(498);
        k18 k18Var = tv2.a;
        bwf bwfVarD = uv2Var.getAccessor().d(12);
        bwf bwfVar = new bwf(new fu2(6));
        this.b = i5hVar;
        this.c = dispatchers;
        this.d = bwfVarD;
        this.o = bwfVar;
        Boolean bool = Boolean.FALSE;
        tcf tcfVarA = ucf.a(bool);
        this.X = tcfVarA;
        this.Y = new xnb(gw0.m(new z41(hedVar.e, tcfVarA, new w9h(3, null), 3)), 16);
        this.Z = new ci5(0);
        this.s0 = new ci5(0);
        this.t0 = 10;
        this.u0 = kti.d(38 * vw4.d().getDisplayMetrics().density);
        tcf tcfVarA2 = ucf.a(null);
        this.v0 = tcfVarA2;
        this.w0 = new hbd(tcfVarA2);
        this.x0 = ucf.a(null);
        this.y0 = c7j.c();
        tcf tcfVarA3 = ucf.a(bool);
        this.z0 = tcfVarA3;
        q8h q8hVar = (q8h) i5hVar;
        q2b q2bVar = (q2b) dispatchers;
        this.A0 = gw0.C(gw0.u(gw0.j(q8hVar.B, new d53(q8hVar.w, 12), tcfVarA, tcfVarA3, new r9h(this, null)), q2bVar.a()), this.a, yve.a, l9h.a);
        gw0.w(gw0.u(new mwd(new v9h(new xnb(q8hVar.y, 15), null, this)), q2bVar.a()), this.a);
    }

    @Override // defpackage.xfh
    public final void s() {
        Bitmap bitmap = (Bitmap) this.v0.getValue();
        if (bitmap != null) {
            bitmap.recycle();
        }
        Bitmap bitmap2 = (Bitmap) this.x0.getValue();
        if (bitmap2 != null) {
            bitmap2.recycle();
        }
        yy7[] yy7VarArr = B0;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.y0;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[0], null);
    }
}
