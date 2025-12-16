package defpackage;

import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class pj1 extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ qj1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj1(qj1 qj1Var, int i) {
        super(12, (Object) null);
        this.c = i;
        this.d = qj1Var;
        switch (i) {
            case 1:
                super(12, nj1.a);
                break;
            default:
                break;
        }
    }

    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        v1c s1cVar;
        switch (this.c) {
            case 0:
                yeb yebVar = (yeb) obj2;
                if (fni.a((yeb) obj, yebVar)) {
                    return;
                }
                this.d.getFakePipView().setCustomTheme(yebVar);
                return;
            case 1:
                nj1 nj1Var = (nj1) obj2;
                if (((nj1) obj) != nj1Var) {
                    int iOrdinal = nj1Var.ordinal();
                    qj1 qj1Var = this.d;
                    if (iOrdinal == 0) {
                        s1cVar = t1c.a;
                    } else if (iOrdinal == 1) {
                        s1cVar = new s1c(qj1Var, new ukd(7, qj1Var), qj1Var.getPipPositionMediator());
                    } else {
                        if (iOrdinal != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        s1cVar = new f1c(qj1Var, new kce(7, qj1Var), qj1Var.getPipPositionMediator());
                    }
                    qj1Var.d = s1cVar;
                    return;
                }
                return;
            default:
                if (fni.a(obj, obj2)) {
                    return;
                }
                qj1 qj1Var2 = this.d;
                qj1Var2.c(qj1Var2.getLeft(), qj1Var2.getTop(), qj1Var2.getRight(), qj1Var2.getBottom());
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj1(j1c j1cVar, qj1 qj1Var) {
        super(12, j1cVar);
        this.c = 2;
        this.d = qj1Var;
    }
}
