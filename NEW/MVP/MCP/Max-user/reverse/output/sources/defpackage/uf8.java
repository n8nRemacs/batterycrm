package defpackage;

import java.util.Arrays;
import java.util.Locale;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class uf8 extends sm implements tsb, j1g {
    public final String X;
    public final long d;
    public final long o;

    public uf8(long j, long j2, long j3) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = uf8.class.getName();
    }

    @Override // defpackage.tsb
    public final int c() {
        si9 si9VarI;
        long j = this.d;
        StringBuilder sbL = az1.l(j, "onPreExecute: serverChatId = ", ", serverMessageId = ");
        long j2 = this.o;
        sbL.append(j2);
        wqi.c(this.X, sbL.toString(), new Object[0]);
        pb2 pb2VarJ = l().J(j);
        return (pb2VarJ == null || (si9VarI = n().i(pb2VarJ.a, j2)) == null || si9VarI.t0 == jm9.DELETED) ? 3 : 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        vf8 vf8Var = (vf8) l0gVar;
        pb2 pb2VarJ = l().J(this.d);
        if (pb2VarJ != null) {
            long jF = n().f(pb2VarJ.a, p().a.s(), vf8Var.c);
            if (jF != 0) {
                k().c(new itg(pb2VarJ.a, jF, false));
            } else {
                wqi.e(this.X, String.format(Locale.ENGLISH, "Can't insert message: response = %s", Arrays.copyOf(new Object[]{vf8Var}, 1)), null);
            }
        }
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        k().c(new rj0(this.a, pzfVar));
        if (qaj.c(pzfVar.b)) {
            return;
        }
        f();
    }

    @Override // defpackage.tsb
    public final void f() {
        wqi.e(this.X, "onMaxFailCount", null);
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.LocationStop locationStop = new Tasks.LocationStop();
        locationStop.requestId = this.a;
        locationStop.chatId = this.d;
        locationStop.messageId = this.o;
        return fl9.toByteArray(locationStop);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.P0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        fh2 fh2Var = new fh2(null, 29);
        fh2Var.t(this.d, ApiProtocol.PARAM_CHAT_ID);
        fh2Var.t(this.o, "messageId");
        return fh2Var;
    }
}
