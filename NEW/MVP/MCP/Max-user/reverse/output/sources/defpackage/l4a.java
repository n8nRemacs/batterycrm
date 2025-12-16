package defpackage;

import java.util.Iterator;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class l4a extends sm implements j1g, tsb, w8d {
    public static final /* synthetic */ int Z = 0;
    public final long X;
    public final long Y;
    public final long d;
    public final long o;

    public l4a(long j, long j2, long j3, long j4, long j5) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = j4;
        this.Y = j5;
    }

    @Override // defpackage.tsb
    public final int c() throws Throwable {
        qi9 qi9VarN = n();
        long j = this.o;
        si9 si9VarM = qi9VarN.m(j);
        ve2 ve2VarL = l();
        long j2 = this.d;
        pb2 pb2VarM = ve2VarL.M(j2);
        Iterator it = r().h(this.a, usb.Y0).iterator();
        while (it.hasNext()) {
            l4a l4aVar = (l4a) ((r2g) it.next()).f;
            if (l4aVar.d == j2 && l4aVar.o == j) {
                wqi.c("l4a", "onPreExecute: later cancel_reaction task found, REMOVE", new Object[0]);
                return 3;
            }
        }
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED || pb2VarM == null || !(pb2VarM.F() || pb2VarM.V())) {
            wqi.c("l4a", "onPreExecute: message or chat not found, REMOVE", new Object[0]);
            return 3;
        }
        if (this.Y == 0) {
            wqi.c("l4a", "onPreExecute: message serverId == 0, REMOVE", new Object[0]);
            return 3;
        }
        if (pb2VarM.b.a != 0 || l().Y(pb2VarM)) {
            return 1;
        }
        wqi.c("l4a", "onPreExecute: chat serverId == 0, SKIP", new Object[0]);
        return 2;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        ul9 ul9Var = ((m4a) l0gVar).c;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, "l4a", "onSuccess: reactionInfoTotalCount = " + (ul9Var != null ? Integer.valueOf(ul9Var.b) : null) + "}", null);
            }
        }
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        nxg nxgVar = (nxg) tmVar.Z.getValue();
        tm tmVar2 = this.c;
        if (tmVar2 == null) {
            tmVar2 = null;
        }
        svi.e(nxgVar, ((q2b) ((lzf) tmVar2.Y.getValue())).a(), null, new k4a(this, ul9Var, null), 2);
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        wqi.f("l4a", "reactions, cancelTask onFail %s", pzfVar);
        k().c(new rj0(this.a, pzfVar));
        w8d.a(this, pzfVar);
    }

    @Override // defpackage.tsb
    public final void f() {
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.MsgCancelReaction msgCancelReaction = new Tasks.MsgCancelReaction();
        msgCancelReaction.requestId = this.a;
        msgCancelReaction.chatId = this.d;
        msgCancelReaction.chatServerId = this.X;
        msgCancelReaction.messageId = this.o;
        msgCancelReaction.messageServerId = this.Y;
        return fl9.toByteArray(msgCancelReaction);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.Y0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        zf8 zf8Var = new zf8((xhb) null, 1);
        long j = this.Y;
        if (j == 0) {
            throw new IllegalArgumentException("param messageId can't be 0");
        }
        zf8Var.t(this.X, ApiProtocol.PARAM_CHAT_ID);
        zf8Var.t(j, "messageId");
        return zf8Var;
    }
}
