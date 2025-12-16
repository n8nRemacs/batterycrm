package defpackage;

import android.content.res.Resources;
import android.view.View;
import java.util.BitSet;

/* loaded from: classes2.dex */
public final class soe extends uoe {
    public joe E0;

    @Override // defpackage.d2f
    public final void A(t98 t98Var, Object obj) throws Resources.NotFoundException {
        ioe ioeVar = (ioe) t98Var;
        goe goeVar = obj instanceof goe ? (goe) obj : null;
        View view = this.a;
        if (goeVar == null) {
            ((roe) view).setModelItem(ioeVar);
            return;
        }
        BitSet bitSet = (BitSet) goeVar.b;
        bitSet.get(0);
        if (bitSet.get(1)) {
            ((roe) view).setTitle(ioeVar.getTitle());
        }
        if (bitSet.get(2)) {
            ((roe) view).setType(ioeVar.getType());
        }
        if (bitSet.get(3)) {
            ((roe) view).setDescription(ioeVar.a());
        }
        if (bitSet.get(4)) {
            roe roeVar = (roe) view;
            roeVar.setOnSwitchListener(null);
            roeVar.setEndView(ioeVar.d());
            if (ioeVar.d() instanceof doe) {
                roeVar.setOnSwitchCheckedListener(new qk(19, this));
            }
        }
        if (bitSet.get(5)) {
            ((roe) view).setCounter(ioeVar.b());
        }
        if (bitSet.get(6)) {
            ((roe) view).setUpperText(ioeVar.c());
        }
        if (bitSet.get(7)) {
            ((roe) view).setStartIcon(ioeVar.e());
        }
    }

    @Override // defpackage.d2f
    public final void E() {
        this.E0 = null;
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        ((roe) this.a).setModelItem((ioe) t98Var);
    }
}
