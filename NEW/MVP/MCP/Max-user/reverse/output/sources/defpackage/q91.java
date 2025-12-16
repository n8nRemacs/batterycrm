package defpackage;

import android.widget.FrameLayout;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class q91 extends d2f {
    public final p91 E0;

    public q91(FrameLayout frameLayout) {
        super(frameLayout);
        this.E0 = (p91) frameLayout.findViewById(eyc.call_opponents);
    }

    @Override // defpackage.d2f
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public final void A(zib zibVar, Object obj) {
        List list = obj instanceof List ? (List) obj : null;
        p91 p91Var = this.E0;
        if (list == null || list.isEmpty()) {
            p91Var.setOpponents(zibVar);
            return;
        }
        nz5 nz5Var = new nz5(lee.g(new b26((zde) new at(2, list), (em6) new n8(21), (em6) nee.a), zx0.u0));
        while (nz5Var.hasNext()) {
            yib yibVar = (yib) nz5Var.next();
            if (yibVar == null) {
                throw new NoWhenBranchMatchedException();
            }
            p91Var.setOpponents(yibVar.a);
        }
    }

    @Override // defpackage.d2f
    public final void z(t98 t98Var) {
        this.E0.setOpponents((zib) t98Var);
    }
}
