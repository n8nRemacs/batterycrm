package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.externcalls.sdk.connection.MediaConnectionListener;
import ru.ok.android.externcalls.sdk.events.destroy.ConversationDestroyedInfo;

/* loaded from: classes.dex */
public final class mb1 extends xfh implements er1 {
    public final bsb X;
    public final k18 Y;
    public final bwf Z;
    public final s41 b;
    public final tv1 c;
    public final ax1 d;
    public final v21 o;
    public final tcf s0;
    public final tcf t0;
    public boolean u0;

    public mb1(boolean z, long j, String str, String str2, s41 s41Var, tv1 tv1Var, ax1 ax1Var, f7b f7bVar, mr1 mr1Var, v21 v21Var, bsb bsbVar, k18 k18Var, k18 k18Var2) {
        hb1 hb1Var;
        this.b = s41Var;
        this.c = tv1Var;
        this.d = ax1Var;
        this.o = v21Var;
        this.X = bsbVar;
        this.Y = k18Var;
        bwf bwfVar = new bwf(new nz(k18Var2, 3));
        this.Z = bwfVar;
        int iOrdinal = ((lb1) bwfVar.getValue()).ordinal();
        if (iOrdinal != 0) {
            ms8 ms8Var = ms8.b;
            if (iOrdinal == 1) {
                boolean z2 = bsbVar.a(z) == ms8Var;
                hb1Var = new hb1(new d51((Long) null, (CharSequence) str, new wd0(fui.a(r5b.a(str, f7bVar), Long.valueOf(j)), str2 != null ? new String(Base64.decode(str2, 0), StandardCharsets.UTF_8) : null), false, 9), z2, z ? ((mr1) k18Var.getValue()).c(z2) : null, mr1Var.d(z), gb1.Z, (z && z2) ? gb1.d : gb1.o, null);
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                hb1Var = new hb1(new d51((Long) null, (CharSequence) str, new wd0(fui.a(r5b.a(str, f7bVar), Long.valueOf(j)), str2 != null ? new String(Base64.decode(str2, 0), StandardCharsets.UTF_8) : null), false, 9), bsbVar.a(z) == ms8Var, null, mr1Var.d(z), gb1.s0, gb1.Y, z ? gb1.X : null);
            }
        } else {
            hb1Var = new hb1(new d51((Long) null, (CharSequence) str, new wd0(fui.a(r5b.a(str, f7bVar), Long.valueOf(j)), str2 != null ? new String(Base64.decode(str2, 0), StandardCharsets.UTF_8) : null), false, 9), false, null, mr1Var.d(z), gb1.Z, gb1.o, null);
        }
        tcf tcfVarA = ucf.a(hb1Var);
        this.s0 = tcfVarA;
        this.t0 = tcfVarA;
        ax1Var.d(this);
        svi.e(this.a, null, null, new kb1(this, null), 3);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallAccepted() {
        tcf tcfVar;
        Object value;
        super.onCallAccepted();
        do {
            tcfVar = this.s0;
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, new ib1(true, false)));
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onDestroyed(ConversationDestroyedInfo conversationDestroyedInfo) {
        tcf tcfVar;
        Object value;
        do {
            tcfVar = this.s0;
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, new ib1(false, false)));
    }

    @Override // defpackage.er1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaConnected(MediaConnectionListener.ConnectedInfo connectedInfo) {
        tcf tcfVar;
        Object value;
        do {
            tcfVar = this.s0;
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, new ib1(true, false)));
    }

    @Override // defpackage.er1, ru.ok.android.externcalls.sdk.connection.MediaConnectionListener
    public final void onMediaDisconnected(MediaConnectionListener.DisconnectedInfo disconnectedInfo) {
    }

    @Override // defpackage.xfh
    public final void s() {
        this.d.c(this);
    }

    public final void t(boolean z) {
        tcf tcfVar;
        Object value;
        ((hw1) this.c).f(z);
        ((w21) this.o).e(true);
        do {
            tcfVar = this.s0;
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, new ib1(true, true)));
    }

    public final void u(boolean z) {
        tcf tcfVar;
        Object value;
        ms8 ms8Var;
        bsb bsbVar;
        boolean z2;
        Object value2 = this.t0.getValue();
        hb1 hb1Var = value2 instanceof hb1 ? (hb1) value2 : null;
        if (hb1Var == null) {
            return;
        }
        do {
            tcfVar = this.s0;
            value = tcfVar.getValue();
            ms8Var = ms8.b;
            bsbVar = this.X;
            z2 = z && bsbVar.a(true) == ms8Var;
        } while (!tcfVar.c(value, hb1.a(hb1Var, null, z2, ((mr1) this.Y.getValue()).c(bsbVar.a(z2) == ms8Var), z2 ? gb1.d : gb1.o, 89)));
    }

    public final void v() {
        tcf tcfVar;
        Object value;
        ((hw1) this.c).z(m07.c);
        do {
            tcfVar = this.s0;
            value = tcfVar.getValue();
        } while (!tcfVar.c(value, new ib1(false, false)));
    }
}
