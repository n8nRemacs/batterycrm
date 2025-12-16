package defpackage;

import android.content.Context;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.http.HttpStatus;

/* loaded from: classes2.dex */
public final class gd6 extends xfh {
    public final k18 X;
    public final k18 Y;
    public final tcf Z;
    public final long b;
    public final Context c;
    public final lzf d;
    public final cb6 o;
    public final hbd s0;
    public final tcf t0;
    public final hbd u0;
    public final AtomicReference v0;
    public final tcf w0;
    public final hbd x0;

    public gd6(long j) {
        vb6 vb6Var = vb6.a;
        Context context = (Context) vb6Var.getAccessor().c(12);
        va4 va4Var = (va4) vb6Var.getAccessor().c(149);
        lzf lzfVar = (lzf) vb6Var.getAccessor().c(8);
        cb6 cb6VarC = vb6Var.c();
        bwf bwfVarD = vb6Var.getAccessor().d(109);
        bwf bwfVarD2 = vb6Var.getAccessor().d(454);
        bwf bwfVarD3 = vb6Var.getAccessor().d(HttpStatus.SC_METHOD_FAILURE);
        this.b = j;
        this.c = context;
        this.d = lzfVar;
        this.o = cb6VarC;
        this.X = bwfVarD2;
        this.Y = bwfVarD;
        tcf tcfVarA = ucf.a(null);
        this.Z = tcfVarA;
        this.s0 = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(Boolean.FALSE);
        this.t0 = tcfVarA2;
        this.u0 = new hbd(tcfVarA2);
        this.v0 = new AtomicReference(null);
        tcf tcfVarA3 = ucf.a(rd5.a);
        this.w0 = tcfVarA3;
        this.x0 = new hbd(tcfVarA3);
        gw0.w(gw0.u(new g56(va4Var.v0, new cd6(this, bwfVarD3, null), 1), ((q2b) lzfVar).a()), this.a);
    }
}
