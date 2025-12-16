package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.internal.Symbol;
import ru.ok.android.externcalls.sdk.Conversation;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;
import ru.ok.android.externcalls.sdk.events.end.ConversationEndInfo;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* loaded from: classes.dex */
public final class dob implements nnb, er1 {
    public static final /* synthetic */ yy7[] A0;
    public final k18 X;
    public final k18 Y;
    public final sv1 a;
    public final at1 b;
    public final tf1 c;
    public final k18 d;
    public final k18 o;
    public final bwf s0;
    public x9f u0;
    public x9f v0;
    public final n9a w0;
    public final t9f x0;
    public final tcf y0;
    public final tcf z0;
    public final bwf Z = new bwf(new ffb(3, this));
    public final jve t0 = kve.a(1, 1, 2);

    static {
        z8a z8aVar = new z8a(dob.class, "participantsUpdatesJob", "getParticipantsUpdatesJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        A0 = new yy7[]{z8aVar};
    }

    public dob(k18 k18Var, k18 k18Var2, sv1 sv1Var, at1 at1Var, tf1 tf1Var, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = sv1Var;
        this.b = at1Var;
        this.c = tf1Var;
        this.d = k18Var;
        this.o = k18Var4;
        this.X = k18Var2;
        this.Y = k18Var5;
        this.s0 = new bwf(new nz(k18Var5, 27));
        ((ax1) k18Var3.getValue()).d(this);
        Symbol symbol = o9a.a;
        this.w0 = new n9a();
        this.x0 = c7j.c();
        tcf tcfVarA = ucf.a(new onb(cnb.e));
        this.y0 = tcfVarA;
        this.z0 = tcfVarA;
    }

    public final void a() {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "ParticipantsRepository", "Call participant state clear", null);
            }
        }
        Conversation conversationA = ((n64) this.d.getValue()).a();
        ParticipantStatesManager participantStatesManager = conversationA != null ? conversationA.getParticipantStatesManager() : null;
        if (participantStatesManager != null) {
            participantStatesManager.removeHandListener((ParticipantStatesManager.Listener) this.Z.getValue());
        }
        x9f x9fVar = this.u0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.u0 = null;
        x9f x9fVar2 = this.v0;
        if (x9fVar2 != null) {
            x9fVar2.cancel((CancellationException) null);
        }
        this.v0 = null;
        t9f t9fVar = this.x0;
        yy7[] yy7VarArr = A0;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7VarArr[0]);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        this.x0.O(this, yy7VarArr[0], null);
        this.t0.g();
        svi.e(this.a, (z74) this.s0.getValue(), null, new cob(this, hd5.a, cnb.c, null), 2);
    }

    public final void c() {
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "ParticipantsRepository", xc0.f("ParticipantsRepository call notifyUpdate calls scope isActive=", d7j.f(this.a)), null);
            }
        }
        this.t0.h(((n64) this.d.getValue()).a());
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallEnded(ConversationEndInfo conversationEndInfo) {
        a();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallParticipantsNetworkStatusChanged(List list) {
        c();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        a();
    }

    @Override // defpackage.er1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        if (connectedInfo.isFirstConnection()) {
            c();
        }
    }

    @Override // defpackage.er1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsAdded(List list) {
        c();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsChanged(List list) {
        c();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsRemoved(List list) {
        c();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onParticipantsUpdated(Collection collection) {
        c();
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onRolesChanged(ConversationParticipant conversationParticipant) {
        c();
    }
}
