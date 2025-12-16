package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import one.me.profileedit.screens.memberpermissions.ProfileMemberPermissionsScreen;

/* loaded from: classes2.dex */
public final class tjc extends y0f {
    public final ProfileMemberPermissionsScreen o;

    public tjc(ExecutorService executorService, ProfileMemberPermissionsScreen profileMemberPermissionsScreen) {
        super(executorService);
        this.o = profileMemberPermissionsScreen;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(ugc ugcVar, int i) {
        qfc qfcVar = (qfc) ((t98) C(i));
        ugcVar.z(qfcVar);
        if (qfcVar instanceof a7) {
            y6 y6Var = ugcVar instanceof y6 ? (y6) ugcVar : null;
            if (y6Var != null) {
                ((roe) y6Var.a).setOnSwitchListener(new xt4(new ir9(2, this.o, sjc.class, "onChecked", "onChecked(JZ)V", 0, 12), new ts9(1, this.o, sjc.class, "onDisabledClick", "onDisabledClick(J)V", 0, 10)));
            }
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    public final int l(int i) {
        return ((qfc) ((t98) C(i))).getK0();
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        int i2 = 536870911 & i;
        if (i2 == 1024) {
            return new y6(viewGroup.getContext());
        }
        if (i2 == 2048) {
            return new d2c(viewGroup.getContext());
        }
        throw new IllegalStateException(("unknown item viewType: " + i).toString());
    }
}
