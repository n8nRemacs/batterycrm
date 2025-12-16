package defpackage;

import android.view.View;
import java.util.BitSet;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class xq1 extends d2f implements or1 {
    public final pr1 E0;

    public xq1(vq1 vq1Var, pr1 pr1Var) {
        super(vq1Var);
        this.E0 = pr1Var;
    }

    @Override // defpackage.d2f
    public final void A(t98 t98Var, Object obj) {
        bg1 bg1Var = (bg1) t98Var;
        ag1 ag1Var = obj instanceof ag1 ? (ag1) obj : null;
        View view = this.a;
        if (ag1Var == null) {
            pr1 pr1Var = this.E0;
            pr1Var.a.add(this);
            B(pr1Var.b);
            vq1 vq1Var = (vq1) view;
            vq1Var.F(bg1Var.b, false);
            vq1Var.D(bg1Var.c, bg1Var.d, false);
            B(pr1Var.b);
            return;
        }
        BitSet bitSet = (BitSet) ag1Var.b;
        if (bitSet.get(0)) {
            ((vq1) view).F(bg1Var.b, bitSet.get(2));
        }
        if (bitSet.get(1)) {
            ((vq1) view).D(bg1Var.c, bg1Var.d, bitSet.get(2));
        }
        if (bitSet.get(2)) {
            ((vq1) view).A(bg1Var.o);
        }
    }

    @Override // defpackage.or1
    public final void B(nr1 nr1Var) {
        int i = nr1Var != null ? nr1Var.a : 0;
        int i2 = i == 0 ? -1 : wq1.$EnumSwitchMapping$0[az1.v(i)];
        if (i2 != -1) {
            View view = this.a;
            if (i2 == 1) {
                vq1 vq1Var = (vq1) view;
                vq1Var.setStatus(null);
                vq1Var.setTitle(null);
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                vq1 vq1Var2 = (vq1) view;
                vq1Var2.setTitle(nr1Var.b);
                vq1Var2.setStatus(nr1Var.c);
            }
        }
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        bg1 bg1Var = (bg1) t98Var;
        pr1 pr1Var = this.E0;
        pr1Var.a.add(this);
        B(pr1Var.b);
        vq1 vq1Var = (vq1) this.a;
        vq1Var.F(bg1Var.b, false);
        vq1Var.D(bg1Var.c, bg1Var.d, false);
        B(pr1Var.b);
    }
}
