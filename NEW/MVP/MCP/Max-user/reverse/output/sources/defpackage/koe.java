package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* loaded from: classes2.dex */
public final class koe extends y0f {
    public final joe o;

    public koe(joe joeVar, ExecutorService executorService) {
        super(executorService);
        this.o = joeVar;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(uoe uoeVar, int i) {
        if (!(uoeVar instanceof soe)) {
            if (uoeVar instanceof sre) {
                uoeVar.z((t98) C(i));
                return;
            }
            return;
        }
        soe soeVar = (soe) uoeVar;
        View view = soeVar.a;
        ioe ioeVar = (ioe) ((t98) C(i));
        ((roe) view).setModelItem(ioeVar);
        joe joeVar = this.o;
        soeVar.E0 = joeVar;
        if (ioeVar.d() instanceof doe) {
            ((roe) view).setOnSwitchCheckedListener(new qk(18, joeVar));
        } else {
            ((roe) view).setOnSwitchListener(null);
        }
        f8j.d(view, 300L, new wfe(joeVar, 2, ioeVar));
    }

    @Override // defpackage.phd
    public final void s(mid midVar, int i, List list) {
        uoe uoeVar = (uoe) midVar;
        if (list.isEmpty()) {
            r(uoeVar, i);
            return;
        }
        goe goeVar = new goe(9);
        for (Object obj : list) {
            goe goeVar2 = obj instanceof goe ? (goe) obj : null;
            if (goeVar2 != null) {
                goeVar.c0(goeVar2);
            }
        }
        uoeVar.A((t98) this.d.f.get(i), goeVar);
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        return i == qab.g ? new sre(new rre(viewGroup.getContext())) : new soe(new roe(viewGroup.getContext(), 0));
    }
}
