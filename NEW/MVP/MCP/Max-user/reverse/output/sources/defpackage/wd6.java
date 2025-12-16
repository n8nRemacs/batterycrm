package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class wd6 implements wq {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wd6(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.wq
    public final void c() {
        switch (this.a) {
            case 0:
                izi.b((sac) this.c, Boolean.FALSE);
                break;
            case 1:
                x9f x9fVar = (x9f) this.b;
                if (x9fVar != null) {
                    x9fVar.cancel((CancellationException) null);
                    break;
                }
                break;
            default:
                ((fg8) this.c).f("background", false);
                break;
        }
    }

    @Override // defpackage.wq
    public final void n() {
        switch (this.a) {
            case 0:
                ((tid) this.b).a = System.currentTimeMillis();
                izi.b((sac) this.c, Boolean.TRUE);
                break;
            case 1:
                h77 h77Var = (h77) this.c;
                x9f x9fVar = (x9f) this.b;
                if (x9fVar == null || !x9fVar.isActive()) {
                    this.b = svi.e(d7j.a(((q2b) ((lzf) h77Var.X.getValue())).b()), null, null, new f77(h77Var, null), 3);
                    break;
                }
                break;
            default:
                k18 k18Var = (k18) this.b;
                w4e w4eVar = (w4e) ((pb3) k18Var.getValue());
                fde fdeVar = w4eVar.y;
                yy7[] yy7VarArr = w4e.m0;
                if (((Number) fdeVar.D(w4eVar, yy7VarArr[15])).longValue() == 0) {
                    pb3 pb3Var = (pb3) k18Var.getValue();
                    w4e w4eVar2 = (w4e) pb3Var;
                    w4eVar2.y.O(w4eVar2, yy7VarArr[15], Long.valueOf(System.currentTimeMillis()));
                    break;
                }
                break;
        }
    }

    public wd6(h77 h77Var) {
        this.a = 1;
        this.c = h77Var;
    }
}
