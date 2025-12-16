package ru.ok.android.externcalls.sdk.sessionroom.internal.participant;

import defpackage.cm6;
import defpackage.dje;
import defpackage.eje;
import defpackage.fje;
import defpackage.fni;
import defpackage.fp1;
import defpackage.gp1;
import defpackage.hp1;
import defpackage.imb;
import defpackage.ip1;
import defpackage.jp1;
import defpackage.p01;
import defpackage.q01;
import defpackage.r01;
import defpackage.s01;
import defpackage.t01;
import defpackage.to8;
import defpackage.u01;
import defpackage.wi1;
import defpackage.yi1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import ru.ok.android.externcalls.sdk.participant.state.internal.ParticipantStatesManagerImpl;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010&R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ok/android/externcalls/sdk/sessionroom/internal/participant/SessionRoomParticipantStatesHandler;", "Ljp1;", "Lu01;", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "participantStatesManager", "Lkotlin/Function0;", "", "isMeCreatorOrAdmin", "<init>", "(Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;Lcm6;)V", "", "Lyi1;", "participants", "Lqqg;", "dismissAssistanceRequestIfAdminAppearedInRoom", "(Ljava/util/Collection;)V", "dismissAssistanceRequestIfNecessary", "()V", "lowerMyHandAndDismissAssistanceRequestIfNecessary", "Lfp1;", "params", "onCurrentParticipantActiveRoomChanged", "(Lfp1;)V", "Lp01;", "onActiveParticipantsAdded", "(Lp01;)V", "Lt01;", "onActiveParticipantUpdated", "(Lt01;)V", "Lq01;", "onActiveParticipantsChanged", "(Lq01;)V", "Lr01;", "onActiveParticipantsDeAnonimized", "(Lr01;)V", "Ls01;", "onActiveParticipantsRemoved", "(Ls01;)V", "Lru/ok/android/externcalls/sdk/participant/state/internal/ParticipantStatesManagerImpl;", "Lcm6;", "Lfje;", "roomId", "Lfje;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SessionRoomParticipantStatesHandler implements jp1, u01 {
    private final cm6 isMeCreatorOrAdmin;
    private final ParticipantStatesManagerImpl participantStatesManager;
    private fje roomId = dje.a;

    public SessionRoomParticipantStatesHandler(ParticipantStatesManagerImpl participantStatesManagerImpl, cm6 cm6Var) {
        this.participantStatesManager = participantStatesManagerImpl;
        this.isMeCreatorOrAdmin = cm6Var;
    }

    private final void dismissAssistanceRequestIfAdminAppearedInRoom(Collection<yi1> participants) {
        if (this.roomId instanceof dje) {
            return;
        }
        Iterator<yi1> it = participants.iterator();
        while (it.hasNext()) {
            List list = it.next().e;
            if (list.contains(wi1.b) || list.contains(wi1.a)) {
                dismissAssistanceRequestIfNecessary();
                return;
            }
        }
    }

    private final void dismissAssistanceRequestIfNecessary() {
        if (this.participantStatesManager.isAssistanceRequested()) {
            this.participantStatesManager.setAssistanceRequested(false);
        }
    }

    private final void lowerMyHandAndDismissAssistanceRequestIfNecessary() {
        ParticipantStatesManagerImpl participantStatesManagerImpl = this.participantStatesManager;
        ParticipantStatesManagerImpl.State state = ParticipantStatesManagerImpl.State.HAND_RAISED;
        ParticipantStatesManagerImpl.Companion companion = ParticipantStatesManagerImpl.INSTANCE;
        ParticipantStatesManagerImpl.updateMyStates$default(participantStatesManagerImpl, to8.j(new imb(state, companion.getSTATE_OFF()), new imb(ParticipantStatesManagerImpl.State.ASSISTANCE_REQUESTED, companion.getSTATE_OFF())), null, null, 6, null);
    }

    @Override // defpackage.u01
    public void onActiveParticipantUpdated(t01 params) {
        dismissAssistanceRequestIfAdminAppearedInRoom(params.b);
    }

    @Override // defpackage.u01
    public void onActiveParticipantsAdded(p01 params) {
        dismissAssistanceRequestIfAdminAppearedInRoom(params.a);
    }

    @Override // defpackage.u01
    public void onActiveParticipantsChanged(q01 params) {
        dismissAssistanceRequestIfAdminAppearedInRoom(params.a);
    }

    @Override // defpackage.u01
    public void onActiveParticipantsDeAnonimized(r01 params) {
        dismissAssistanceRequestIfAdminAppearedInRoom(params.a);
    }

    @Override // defpackage.u01
    public void onActiveParticipantsRemoved(s01 params) {
    }

    @Override // defpackage.jp1
    public void onCurrentParticipantActiveRoomChanged(fp1 params) {
        fje fjeVar = this.roomId;
        fje fjeVar2 = params.a;
        if (fni.a(fjeVar, fjeVar2)) {
            return;
        }
        lowerMyHandAndDismissAssistanceRequestIfNecessary();
        if (((Boolean) this.isMeCreatorOrAdmin.invoke()).booleanValue() && (fjeVar2 instanceof eje)) {
            ParticipantStatesManagerImpl.resetStates$default(this.participantStatesManager, ParticipantStatesManagerImpl.State.ASSISTANCE_REQUESTED, (eje) fjeVar2, null, null, 12, null);
        }
        this.roomId = fjeVar2;
    }

    @Override // defpackage.jp1
    public /* bridge */ /* synthetic */ void onCurrentParticipantInvitedToRoom(gp1 gp1Var) {
    }

    @Override // defpackage.jp1
    public /* bridge */ /* synthetic */ void onRoomRemoved(hp1 hp1Var) {
    }

    @Override // defpackage.jp1
    public /* bridge */ /* synthetic */ void onRoomUpdated(ip1 ip1Var) {
    }
}
