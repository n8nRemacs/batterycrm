package defpackage;

import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;

/* loaded from: classes.dex */
public final class r11 implements ConversationFeatureManager.FeatureListener {
    public final /* synthetic */ v11 a;

    public r11(v11 v11Var) {
        this.a = v11Var;
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager.FeatureListener
    public final void onFeatureEnabledChanged(u81 u81Var, boolean z) {
        super.onFeatureEnabledChanged(u81Var, z);
        if (u81Var != u81.b) {
            return;
        }
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "CallAdminSettingsController", xc0.f("Record in call was changed for me to ", z), null);
            }
        }
        tcf tcfVar = this.a.E0;
        while (true) {
            Object value = tcfVar.getValue();
            boolean z2 = z;
            if (tcfVar.c(value, ca.a((ca) value, false, false, false, false, z2, false, 111))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager.FeatureListener
    public final void onFeatureRolesChanged(u81 u81Var, FeatureRoles featureRoles) {
        Object value;
        super.onFeatureRolesChanged(u81Var, featureRoles);
        if (u81Var != u81.b) {
            return;
        }
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "CallAdminSettingsController", "Record in call was changed for role=" + featureRoles, null);
            }
        }
        boolean z = featureRoles instanceof FeatureRoles.EnabledForAll;
        tcf tcfVar = this.a.E0;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, ca.a((ca) value, false, false, false, false, z, false, 111)));
        Conversation conversationA = this.a.d().a();
        if (conversationA != null ? conversationA.isMeCreatorOrAdmin() : false) {
            this.a.C0.h(new eb(z));
        }
    }
}
