package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;
import one.me.profile.screens.invite.ProfileInviteScreen;

/* loaded from: classes2.dex */
public final class eic extends y0f {
    public final ProfileInviteScreen o;

    public eic(ExecutorService executorService, ProfileInviteScreen profileInviteScreen) {
        super(executorService);
        this.o = profileInviteScreen;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final void r(qmc qmcVar, int i) {
        mid midVar;
        mjc mjcVar = (mjc) ((t98) C(i));
        qmcVar.z(mjcVar);
        if (mjcVar instanceof fjc) {
            midVar = qmcVar instanceof pq7 ? (pq7) qmcVar : null;
            if (midVar != null) {
                f8j.d(midVar.a, 300L, new ye6(6, new l3b(this, 12, mjcVar)));
                return;
            }
            return;
        }
        if (mjcVar instanceof yic) {
            boolean z = qmcVar instanceof aj2;
            aj2 aj2Var = z ? (aj2) qmcVar : null;
            if (aj2Var != null) {
                f8j.d(aj2Var.a, 300L, new j6(12, new dic(this, 0)));
            }
            midVar = z ? (aj2) qmcVar : null;
            if (midVar != null) {
                ((xi2) midVar.a).setOnMoreActionsClickListener(new dic(this, 1));
            }
        }
    }

    @Override // defpackage.y0f, defpackage.phd
    public final int l(int i) {
        return ((mjc) ((t98) C(i))).getK0();
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        int i2 = 268435455 & i;
        if (i2 == 8192) {
            return new pq7(new roe(viewGroup.getContext(), 0));
        }
        if (i2 == 4) {
            return new a20(viewGroup.getContext());
        }
        if (i2 == 16384) {
            return new aj2(new xi2(viewGroup.getContext()));
        }
        throw new IllegalStateException(("unknown item viewType: " + i).toString());
    }
}
