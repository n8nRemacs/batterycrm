package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.feature.ConversationFeatureManager;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.media.mute.MediaMuteManager;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;
import ru.ok.android.externcalls.sdk.waiting_room.WaitingRoomParticipantsUpdate;

/* loaded from: classes.dex */
public final class v11 implements z01 {
    public static final /* synthetic */ yy7[] G0;
    public final bwf A0;
    public final bwf B0;
    public final jve C0;
    public final jve D0;
    public final tcf E0;
    public final tcf F0;
    public final k18 X;
    public final bwf Y = new bwf(new e11(this, 0));
    public final AtomicReference Z = new AtomicReference(new xs(0));
    public final sv1 a;
    public final at1 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final tcf s0;
    public final tcf t0;
    public final AtomicBoolean u0;
    public final AtomicBoolean v0;
    public final AtomicBoolean w0;
    public final AtomicBoolean x0;
    public x9f y0;
    public final t9f z0;

    static {
        z8a z8aVar = new z8a(v11.class, "usersUpdateJob", "getUsersUpdateJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        G0 = new yy7[]{z8aVar};
    }

    public v11(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, sv1 sv1Var, k18 k18Var5, at1 at1Var, k18 k18Var6, k18 k18Var7) {
        this.a = sv1Var;
        this.b = at1Var;
        this.c = k18Var;
        this.d = k18Var5;
        this.o = k18Var6;
        this.X = k18Var7;
        tcf tcfVarA = ucf.a(qa.d);
        this.s0 = tcfVarA;
        this.t0 = tcfVarA;
        this.u0 = new AtomicBoolean(false);
        this.v0 = new AtomicBoolean(false);
        this.w0 = new AtomicBoolean(false);
        this.x0 = new AtomicBoolean(false);
        this.z0 = c7j.c();
        this.A0 = new bwf(new fq(this, k18Var2, k18Var3, k18Var4));
        this.B0 = new bwf(new e11(this, 1));
        jve jveVarA = kve.a(1, 1, 2);
        this.C0 = jveVarA;
        this.D0 = jveVarA;
        tcf tcfVarA2 = ucf.a(ca.h);
        this.E0 = tcfVarA2;
        this.F0 = tcfVarA2;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01a7 -> B:50:0x01ae). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.v11 r25, defpackage.xs r26, defpackage.q44 r27) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v11.a(v11, xs, q44):java.lang.Object");
    }

    public static boolean h(h29 h29Var) {
        return h29Var != h29.c;
    }

    public final void c(zi1 zi1Var, boolean z) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "CallAdminSettingsController", "Update user from waiting room " + zi1Var + " with apply state=" + z, null);
            }
        }
        Conversation conversationA = d().a();
        String conversationId = conversationA != null ? conversationA.getConversationId() : null;
        if (z) {
            yx1 yx1Var = (yx1) this.o.getValue();
            Long lValueOf = Long.valueOf(zi1Var.a);
            yx1Var.getClass();
            yx1.d(yx1Var, "PROMOTE_JOIN_WAITING_ROOM", conversationId, null, lValueOf, null, null, true, 116);
        } else {
            yx1 yx1Var2 = (yx1) this.o.getValue();
            Long lValueOf2 = Long.valueOf(zi1Var.a);
            yx1Var2.getClass();
            yx1.d(yx1Var2, "REJECT_JOIN_WAITING_ROOM", conversationId, null, lValueOf2, null, null, true, 116);
        }
        ParticipantId participantIdC = knb.c(zi1Var);
        if (z) {
            Conversation conversationA2 = d().a();
            if (conversationA2 != null) {
                conversationA2.promoteParticipant(participantIdC, true);
            }
        } else {
            Conversation conversationA3 = d().a();
            if (conversationA3 != null) {
                conversationA3.removeParticipant(participantIdC);
            }
        }
        if (z) {
            return;
        }
        this.Z.getAndUpdate(new k11(0, zi1Var));
        m();
    }

    public final n64 d() {
        return (n64) this.c.getValue();
    }

    public final MediaMuteManager e() {
        Conversation conversationA = d().a();
        if (conversationA != null) {
            return conversationA.getMediaMuteManager();
        }
        return null;
    }

    public final ParticipantStatesManager f() {
        Conversation conversationA = d().a();
        if (conversationA != null) {
            return conversationA.getParticipantStatesManager();
        }
        return null;
    }

    public final ConversationFeatureManager g() {
        Conversation conversationA = d().a();
        if (conversationA != null) {
            return conversationA.getFeatureManager();
        }
        return null;
    }

    public final void i(boolean z) {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "CallAdminSettingsController", xc0.f("Raise own hands change to isEnabled=", z), null);
            }
        }
        ParticipantStatesManager participantStatesManagerF = f();
        if (participantStatesManagerF != null) {
            participantStatesManagerF.setOwnHandRaised(z);
        }
        this.x0.set(z);
    }

    public final void j(boolean z) {
        u81 u81Var = u81.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "CallAdminSettingsController", xc0.f("Screen record change state to ", z), null);
            }
        }
        if (z) {
            ConversationFeatureManager conversationFeatureManagerG = g();
            if (conversationFeatureManagerG != null) {
                ConversationFeatureManager.enableFeatureForAll$default(conversationFeatureManagerG, u81Var, null, null, 6, null);
                return;
            }
            return;
        }
        ConversationFeatureManager conversationFeatureManagerG2 = g();
        if (conversationFeatureManagerG2 != null) {
            ConversationFeatureManager.enableFeatureForRoles$default(conversationFeatureManagerG2, u81Var, gke.h(wi1.b, wi1.a), null, null, 12, null);
        }
    }

    public final void k() {
        AtomicBoolean atomicBoolean = this.w0;
        if (!atomicBoolean.get() && this.v0.get() && this.u0.get()) {
            tcf tcfVar = this.E0;
            if (!((ca) tcfVar.getValue()).a) {
                boolean z = ((ca) tcfVar.getValue()).b;
                boolean z2 = ((ca) tcfVar.getValue()).c;
                jve jveVar = this.C0;
                if (!z && !z2) {
                    jveVar.h(new ya());
                } else if (!z && z2) {
                    jveVar.h(new za(true, false));
                } else if (z && !z2) {
                    jveVar.h(new bb(true, false));
                }
            }
            atomicBoolean.set(true);
        }
    }

    public final void l(boolean z, boolean z2, boolean z3) {
        while (true) {
            tcf tcfVar = this.E0;
            Object value = tcfVar.getValue();
            ca caVar = (ca) value;
            ConversationFeatureManager conversationFeatureManagerG = g();
            boolean z4 = (conversationFeatureManagerG != null ? conversationFeatureManagerG.getFeatureRoles(u81.b) : null) instanceof FeatureRoles.EnabledForAll;
            Conversation conversationA = d().a();
            boolean zIsMeCreatorOrAdmin = conversationA != null ? conversationA.isMeCreatorOrAdmin() : false;
            Conversation conversationA2 = d().a();
            boolean zIsWaitingRoomEnabled = conversationA2 != null ? conversationA2.isWaitingRoomEnabled() : false;
            caVar.getClass();
            boolean z5 = z;
            boolean z6 = z2;
            boolean z7 = z3;
            if (tcfVar.c(value, new ca(zIsMeCreatorOrAdmin, z5, z6, z7, z4, false, zIsWaitingRoomEnabled))) {
                return;
            }
            z = z5;
            z2 = z6;
            z3 = z7;
        }
    }

    public final void m() {
        x9f x9fVarE = svi.e(this.a, ((q2b) ((lzf) this.X.getValue())).a(), null, new s11(this, null), 2);
        this.z0.O(this, G0[0], x9fVarE);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsAdded(List list) {
        this.Z.getAndUpdate(new d11(0, list));
        m();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        tcf tcfVar;
        Object value;
        boolean zH;
        i29 mediaOptionsForCall$default;
        h29 h29Var;
        i29 mediaOptionsForCall$default2;
        h29 h29Var2;
        i29 mediaOptionsForCall$default3;
        h29 h29Var3;
        ConversationParticipant me2;
        super.onRolesChanged(conversationParticipant);
        ParticipantId externalId = conversationParticipant != null ? conversationParticipant.getExternalId() : null;
        Conversation conversationA = d().a();
        if (fni.a(externalId, (conversationA == null || (me2 = conversationA.getMe()) == null) ? null : me2.getExternalId())) {
            do {
                tcfVar = this.E0;
                value = tcfVar.getValue();
                zH = false;
            } while (!tcfVar.c(value, ca.a((ca) value, (conversationParticipant != null ? conversationParticipant.isAdmin() : false) || (conversationParticipant != null ? conversationParticipant.isCreator() : false), false, false, false, false, false, 126)));
            MediaMuteManager mediaMuteManagerE = e();
            boolean zH2 = (mediaMuteManagerE == null || (mediaOptionsForCall$default3 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE, null, 1, null)) == null || (h29Var3 = mediaOptionsForCall$default3.b) == null) ? false : h(h29Var3);
            MediaMuteManager mediaMuteManagerE2 = e();
            boolean zH3 = (mediaMuteManagerE2 == null || (mediaOptionsForCall$default2 = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE2, null, 1, null)) == null || (h29Var2 = mediaOptionsForCall$default2.a) == null) ? false : h(h29Var2);
            MediaMuteManager mediaMuteManagerE3 = e();
            if (mediaMuteManagerE3 != null && (mediaOptionsForCall$default = MediaMuteManager.getMediaOptionsForCall$default(mediaMuteManagerE3, null, 1, null)) != null && (h29Var = mediaOptionsForCall$default.c) != null) {
                zH = h(h29Var);
            }
            l(zH2, zH3, zH);
            this.v0.set(true);
            k();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onWaitingRoomEnabledChanged(boolean z) {
        super.onWaitingRoomEnabledChanged(z);
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "CallAdminSettingsController", xc0.f("Waiting room change state updating ", z), null);
            }
        }
        tcf tcfVar = this.E0;
        while (true) {
            Object value = tcfVar.getValue();
            boolean z2 = z;
            if (tcfVar.c(value, ca.a((ca) value, false, false, false, false, false, z2, 63))) {
                return;
            } else {
                z = z2;
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onWaitingRoomParticipantsChanged(WaitingRoomParticipantsUpdate waitingRoomParticipantsUpdate) {
        super.onWaitingRoomParticipantsChanged(waitingRoomParticipantsUpdate);
        this.Z.getAndUpdate(new j11(waitingRoomParticipantsUpdate, 0, this));
        m();
    }
}
