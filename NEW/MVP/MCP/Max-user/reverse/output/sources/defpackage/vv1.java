package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.audio.CallsAudioManager;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.id.ParticipantId;

/* loaded from: classes.dex */
public final class vv1 implements er1 {
    public final /* synthetic */ k18 X;
    public final /* synthetic */ hw1 a;
    public final /* synthetic */ k18 b;
    public final /* synthetic */ k18 c;
    public final /* synthetic */ k18 d;
    public final /* synthetic */ k18 o;

    public vv1(hw1 hw1Var, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = hw1Var;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.o = k18Var4;
        this.X = k18Var5;
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallAccepted() {
        Object value;
        mb4 mb4VarK;
        boolean z;
        super.onCallAccepted();
        Conversation conversationR = this.a.r();
        if (conversationR != null && conversationR.isCaller()) {
            yx1 yx1VarP = this.a.p();
            Conversation conversationR2 = this.a.r();
            String conversationId = conversationR2 != null ? conversationR2.getConversationId() : null;
            yx1VarP.getClass();
            yx1.d(yx1VarP, "CALL_RECEIVED_ACCEPT", conversationId, null, null, null, null, false, 236);
        }
        ((oqd) this.b.getValue()).e();
        ((w21) ((v21) this.c.getValue())).a(CallsAudioManager.State.CONVERSATION);
        hw1 hw1Var = this.a;
        k18 k18Var = this.b;
        tcf tcfVar = hw1Var.a1;
        do {
            value = tcfVar.getValue();
            mb4VarK = hw1Var.k();
            z = (mb4VarK.i || mb4VarK.j) ? false : true;
            if (z) {
                ((oqd) k18Var.getValue()).c();
            }
            hw1Var.p().f = 5;
        } while (!tcfVar.c(value, mb4.a(mb4VarK, null, System.currentTimeMillis(), null, null, false, true, false, null, z ? ao5.a : hw1Var.k().l, 4029)));
        Iterator it = this.a.Z0.iterator();
        while (it.hasNext()) {
            ((iq1) it.next()).onCallAccepted();
        }
        zo1 zo1Var = (zo1) this.d.getValue();
        Context context = (Context) this.o.getValue();
        zo1Var.getClass();
        zo1.d(context);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        hw1.b(this.a, conversationEndInfo.getReason());
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        hw1 hw1Var = this.a;
        co5 co5Var = hw1Var.k().l;
        if (!(co5Var instanceof wn5) && !(co5Var instanceof vn5) && !(co5Var instanceof xn5)) {
            hw1.b(hw1Var, conversationDestroyedInfo.getReason());
        }
        hw1Var.C();
        Iterator it = hw1Var.Z0.iterator();
        while (it.hasNext()) {
            ((iq1) it.next()).l();
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onJoinLinkUpdated(String str) {
        Object value;
        String str2 = str;
        hw1 hw1Var = this.a;
        tcf tcfVar = hw1Var.a1;
        gxi gxiVar = hw1Var.k().a;
        if (gxiVar == null) {
            return;
        }
        if (gxiVar instanceof kr1) {
            while (true) {
                Object value2 = tcfVar.getValue();
                hw1 hw1Var2 = hw1Var;
                if (tcfVar.c(value2, mb4.a(hw1Var.k(), new jr1(str2, false), 0L, null, str2, false, false, true, null, null, 7926))) {
                    ((c51) ((s41) this.X.getValue())).d(str2, false);
                    return;
                }
                hw1Var = hw1Var2;
            }
        } else if (!(gxiVar instanceof jr1)) {
            do {
                value = tcfVar.getValue();
            } while (!tcfVar.c(value, mb4.a(hw1Var.k(), null, 0L, null, str, false, false, false, null, null, 8183)));
        } else {
            while (true) {
                Object value3 = tcfVar.getValue();
                if (tcfVar.c(value3, mb4.a(hw1Var.k(), new jr1(str2, ((jr1) gxiVar).b), 0L, null, str2, false, false, false, null, null, 8182))) {
                    return;
                } else {
                    str2 = str;
                }
            }
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onMeInWaitingRoomChanged(boolean z) {
        Object value;
        mb4 mb4VarA;
        super.onMeInWaitingRoomChanged(z);
        ho7.q("me waiting room changed: isMeInWaitingRoom=", "CallEngineTag", z);
        hw1 hw1Var = this.a;
        tcf tcfVar = hw1Var.a1;
        do {
            value = tcfVar.getValue();
            mb4 mb4VarK = hw1Var.k();
            if (z) {
                hw1Var.p().f = 4;
                mb4VarA = mb4.a(mb4VarK, null, 0L, null, null, false, false, false, null, bo5.a, 4095);
            } else {
                mb4VarA = mb4.a(mb4VarK, null, 0L, null, null, false, false, false, null, zn5.a, 4095);
            }
        } while (!tcfVar.c(value, mb4VarA));
    }

    @Override // defpackage.er1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        String str;
        Object value;
        hw1 hw1Var = this.a;
        if (!hw1Var.k().j) {
            tcf tcfVar = hw1Var.a1;
            do {
                value = tcfVar.getValue();
            } while (!tcfVar.c(value, mb4.a(hw1Var.k(), null, 0L, null, null, false, false, false, null, null, 7679)));
        }
        hw1Var.H(connectedInfo.isFirstConnection());
        if (connectedInfo.isFirstConnection() || (str = hw1Var.k().c) == null) {
            return;
        }
        yx1 yx1VarP = hw1Var.p();
        boolean z = hw1Var.k().i;
        yx1VarP.getClass();
        yx1.d(yx1VarP, "BAD_CONNECTION_ALERT", str, "RECONNECT", null, null, null, z, 120);
    }

    @Override // defpackage.er1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
        Object value;
        hw1 hw1Var = this.a;
        tcf tcfVar = hw1Var.a1;
        do {
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, mb4.a(hw1Var.k(), null, 0L, null, null, false, false, false, null, ao5.a, 4095)));
        if (!hw1Var.k().i) {
            hw1Var.x().c();
        }
        hw1Var.p().f = 5;
        this.a.p().f = 7;
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onOpponentRegistered() {
        String conversationId;
        hw1 hw1Var = this.a;
        Conversation conversationR = hw1Var.r();
        if (conversationR == null || (conversationId = conversationR.getConversationId()) == null) {
            return;
        }
        hw1Var.p().c("CALL_REMOTE_RINGING", "CALL", null, null, conversationId);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsAdded(List list) {
        hw1.d(this.a);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsChanged(List list) {
        String str;
        ConversationParticipant me2;
        hw1 hw1Var = this.a;
        hw1.d(hw1Var);
        Conversation conversationR = hw1Var.r();
        ParticipantId externalId = (conversationR == null || (me2 = conversationR.getMe()) == null) ? null : me2.getExternalId();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            ConversationParticipant conversationParticipant = (ConversationParticipant) obj;
            if (conversationParticipant.isTalking() && !hw1Var.Y0.containsKey(conversationParticipant.getExternalId())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            char c = fni.a(((ConversationParticipant) it.next()).getExternalId(), externalId) ? (char) 2 : (char) 1;
            yx1 yx1VarP = hw1Var.p();
            Conversation conversationR2 = hw1Var.r();
            String conversationId = conversationR2 != null ? conversationR2.getConversationId() : null;
            BitSet bitSet = yx1VarP.e;
            if (c == 1 && !bitSet.get(0)) {
                bitSet.set(0);
            } else if (c == 2 && !bitSet.get(1)) {
                bitSet.set(1);
            }
            if (c == 1) {
                str = "IN";
            } else {
                if (c != 2) {
                    throw null;
                }
                str = "OUT";
            }
            yx1.d(yx1VarP, "FIRST_NON_ZERO_AUDIO", conversationId, str, null, null, null, false, 248);
        }
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsRemoved(List list) {
        hw1.d(this.a);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsUpdated(Collection collection) {
        hw1.d(this.a);
    }
}
