package defpackage;

import java.util.List;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class o4a extends sm implements j1g, tsb {
    public static final /* synthetic */ int v0 = 0;
    public final List X;
    public final List Y;
    public final sj3 Z;
    public final long d;
    public final long o;
    public final boolean s0;
    public final rs4 t0;
    public final boolean u0;

    public o4a(long j, long j2, long j3, List list, List list2, sj3 sj3Var, boolean z, rs4 rs4Var, boolean z2) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = list;
        this.Y = list2;
        this.Z = sj3Var;
        this.s0 = z;
        this.t0 = rs4Var;
        this.u0 = z2;
    }

    @Override // defpackage.tsb
    public final int c() {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        return tmVar.c().M(this.d) != null ? 1 : 3;
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x04df  */
    @Override // defpackage.j1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.l0g r109) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o4a.d(l0g):void");
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        if (qaj.c(pzfVar.b)) {
            return;
        }
        f();
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        tmVar.b().c(new rj0(this.a, pzfVar));
    }

    @Override // defpackage.tsb
    public final void f() {
        wqi.c("o4a", "onMaxFailCount", new Object[0]);
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        tmVar.e().d(this.a);
        s(this.X);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.MsgDelete msgDelete = new Tasks.MsgDelete();
        msgDelete.requestId = this.a;
        msgDelete.chatId = this.d;
        msgDelete.chatServerId = this.o;
        msgDelete.messagesId = jqi.c(this.X);
        msgDelete.messagesServerId = jqi.c(this.Y);
        msgDelete.forMe = this.s0;
        msgDelete.itemTypeId = this.t0.a;
        msgDelete.notDeleteMessageFromDb = this.u0;
        sj3 sj3Var = this.Z;
        if (sj3Var != null) {
            msgDelete.complaint = sj3Var.a;
        }
        return fl9.toByteArray(msgDelete);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.b;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        pb2 pb2VarM = tmVar.c().M(this.d);
        if (pb2VarM == null) {
            return null;
        }
        boolean z = !pb2VarM.M() && this.s0;
        zf8 zf8Var = new zf8(xhb.p1, 2);
        zf8Var.t(this.o, ApiProtocol.PARAM_CHAT_ID);
        zf8Var.o("messageIds", ue3.d0(this.Y));
        sj3 sj3Var = this.Z;
        if (sj3Var != null) {
            zf8Var.x("complaint", sj3Var.a);
        }
        zf8Var.i("forMe", z);
        zf8Var.x("itemType", this.t0.name());
        return zf8Var;
    }

    public final void s(List list) {
        wqi.c("o4a", "returnToActiveMessages, messageIds = " + list.size(), new Object[0]);
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        tmVar.d().a.c.d().p(this.d, list, jm9.ACTIVE);
    }
}
