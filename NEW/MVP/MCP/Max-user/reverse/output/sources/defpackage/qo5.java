package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class qo5 extends xfh {
    public x9f X;
    public final k18 b;
    public final k18 c;
    public final String d;
    public final ci5 o;

    public qo5() {
        ho5 ho5Var = ho5.a;
        bwf bwfVarD = ho5Var.getAccessor().d(45);
        bwf bwfVarD2 = ho5Var.getAccessor().d(8);
        this.b = bwfVarD;
        this.c = bwfVarD2;
        this.d = qo5.class.getName();
        this.o = new ci5(0);
    }

    @Override // defpackage.xfh
    public final void s() {
        x9f x9fVar = this.X;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.X = null;
    }
}
