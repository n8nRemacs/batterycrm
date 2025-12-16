package defpackage;

import java.util.Iterator;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* loaded from: classes.dex */
public final /* synthetic */ class i11 implements ParticipantStatesManager.Listener {
    public final /* synthetic */ int a;
    public final /* synthetic */ er1 b;

    public /* synthetic */ i11(er1 er1Var, int i) {
        this.a = i;
        this.b = er1Var;
    }

    @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
    public final void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
        ConversationParticipant me2;
        switch (this.a) {
            case 0:
                v11 v11Var = (v11) this.b;
                Conversation conversationA = v11Var.d().a();
                Object obj = null;
                ParticipantId externalId = (conversationA == null || (me2 = conversationA.getMe()) == null) ? null : me2.getExternalId();
                Iterator<T> it = stateChangedEvent.getChanges().iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (fni.a(((ParticipantStatesManager.ParticipantStateChange) next).getParticipantId(), externalId)) {
                            obj = next;
                        }
                    }
                }
                ParticipantStatesManager.ParticipantStateChange participantStateChange = (ParticipantStatesManager.ParticipantStateChange) obj;
                if (participantStateChange != null && v11Var.x0.compareAndSet(!participantStateChange.isOn(), participantStateChange.isOn())) {
                    v11Var.C0.h(va.a);
                    break;
                }
                break;
            default:
                ((dob) this.b).c();
                break;
        }
    }
}
