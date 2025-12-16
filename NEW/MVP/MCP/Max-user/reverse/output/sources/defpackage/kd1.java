package defpackage;

import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes.dex */
public final class kd1 implements ConversationFeatureManager.FeatureListener {
    public final /* synthetic */ md1 a;
    public final /* synthetic */ k18 b;

    public kd1(md1 md1Var, k18 k18Var) {
        this.a = md1Var;
        this.b = k18Var;
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager.FeatureListener
    public final void onFeatureEnabledChanged(u81 u81Var, boolean z) {
        super.onFeatureEnabledChanged(u81Var, z);
        if (u81Var != u81.a) {
            return;
        }
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "CallInviteToP2PController", "Add participant to p2p changed=" + z + " feature=" + u81Var, null);
            }
        }
        tcf tcfVar = this.a.Z;
        boolean z2 = false;
        if (z) {
            gu5 gu5Var = (gu5) ((rt5) this.b.getValue());
            gu5Var.getClass();
            if (gu5Var.j(PmsKey.f56gcfromp2p, false)) {
                z2 = true;
            }
        }
        tcfVar.m(null, Boolean.valueOf(z2));
    }
}
