package defpackage;

import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class j5a extends sm implements j1g, tsb, w8d {
    public final long X;
    public final long Y;
    public final ql9 Z;
    public final long d;
    public final long o;
    public final String s0;

    public j5a(long j, long j2, long j3, long j4, long j5, ql9 ql9Var) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = j4;
        this.Y = j5;
        this.Z = ql9Var;
        this.s0 = j5a.class.getName();
    }

    @Override // defpackage.tsb
    public final int c() throws Throwable {
        qi9 qi9VarN = n();
        long j = this.o;
        si9 si9VarM = qi9VarN.m(j);
        ve2 ve2VarL = l();
        long j2 = this.d;
        pb2 pb2VarM = ve2VarL.M(j2);
        Iterator it = r().h(this.a, usb.X0).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String str = this.s0;
            if (!zHasNext) {
                if (si9VarM == null || si9VarM.t0 == jm9.DELETED || pb2VarM == null || !(pb2VarM.F() || pb2VarM.V())) {
                    wqi.c(str, "onPreExecute: message or chat not found, REMOVE", new Object[0]);
                    return 3;
                }
                if (this.Y == 0) {
                    wqi.c(str, "onPreExecute: message serverId == 0, REMOVE", new Object[0]);
                    return 3;
                }
                if (pb2VarM.b.a != 0 || l().Y(pb2VarM)) {
                    wqi.c(str, "onPreExecute, READY", new Object[0]);
                    return 1;
                }
                wqi.c(str, "onPreExecute: chat serverId == 0, SKIP", new Object[0]);
                return 2;
            }
            j5a j5aVar = (j5a) ((r2g) it.next()).f;
            if (j5aVar.d == j2 && j5aVar.o == j) {
                wqi.c(str, "onPreExecute: later react task found, REMOVE", new Object[0]);
                return 3;
            }
        }
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        k5a k5aVar = (k5a) l0gVar;
        ul9 ul9Var = k5aVar.c;
        String str = this.s0;
        if (ul9Var == null) {
            tw0 tw0VarK = k();
            String str2 = k5aVar.d;
            if (str2 == null) {
                str2 = "server bug";
            }
            tw0VarK.c(new rj0(this.a, new pzf(str2, "", null)));
            wqi.q(str, "onSuccess: its server bug!, skip", new Object[0]);
            return;
        }
        wqi.c(str, "reactions, reactTamTask onSuccess, reactionInfoTotalCount = " + ul9Var.b + "}", new Object[0]);
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        nxg nxgVar = (nxg) tmVar.Z.getValue();
        tm tmVar2 = this.c;
        if (tmVar2 == null) {
            tmVar2 = null;
        }
        svi.e(nxgVar, ((q2b) ((lzf) tmVar2.Y.getValue())).a(), null, new i5a(this, ul9Var, null), 2);
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        wqi.f(this.s0, "reactions, reactTamTask onFail: %s", pzfVar);
        k().c(new rj0(this.a, pzfVar));
        w8d.a(this, pzfVar);
    }

    @Override // defpackage.tsb
    public final void f() throws Throwable {
        xl9 xl9Var;
        r().d(this.a);
        si9 si9VarM = n().m(this.o);
        if (si9VarM == null || (xl9Var = si9VarM.O0) == null) {
            return;
        }
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        x8d x8dVarB = ((yl9) tmVar.U.getValue()).b(this.Z.b);
        List list = xl9Var.a;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (fni.a(((wl9) it.next()).a.b, x8dVarB)) {
                    wqi.c(this.s0, "reactions, onMaxFailCount, remove reaction from message", new Object[0]);
                    return;
                }
            }
        }
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.MsgReact msgReact = new Tasks.MsgReact();
        msgReact.requestId = this.a;
        msgReact.chatId = this.d;
        msgReact.chatServerId = this.X;
        msgReact.messageId = this.o;
        msgReact.messageServerId = this.Y;
        ql9 ql9Var = this.Z;
        msgReact.reaction = ql9Var.b;
        msgReact.reactionType = ql9Var.a.ordinal();
        return fl9.toByteArray(msgReact);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.X0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        ql9 ql9Var = this.Z;
        String str = ql9Var.b;
        zf8 zf8Var = new zf8((xhb) null, 9);
        long j = this.Y;
        if (j == 0) {
            throw new IllegalArgumentException("param messageId can't be 0");
        }
        if (str.length() == 0) {
            throw new IllegalArgumentException("param reaction.id can't be empty");
        }
        zf8Var.t(this.X, ApiProtocol.PARAM_CHAT_ID);
        zf8Var.t(j, "messageId");
        zf8Var.v("reaction", to8.j(new imb("reactionType", ql9Var.a.name()), new imb("id", str)));
        return zf8Var;
    }
}
