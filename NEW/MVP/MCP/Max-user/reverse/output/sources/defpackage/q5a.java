package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class q5a extends sm implements j1g, tsb {
    public final long X;
    public final long Y;
    public final dx0 Z;
    public final String d;
    public final String o;
    public final gx0 s0;

    public q5a(long j, String str, String str2, long j2, long j3, dx0 dx0Var, gx0 gx0Var) {
        super(j);
        this.d = str;
        this.o = str2;
        this.X = j2;
        this.Y = j3;
        this.Z = dx0Var;
        this.s0 = gx0Var;
    }

    @Override // defpackage.tsb
    public final int c() {
        return 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x016e  */
    @Override // defpackage.j1g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.l0g r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 444
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q5a.d(l0g):void");
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) throws Throwable {
        if (qaj.c(pzfVar.b)) {
            s(true);
            return;
        }
        f();
        s(false);
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        si9 si9VarM = tmVar.d().m(this.Y);
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED) {
            f();
        } else {
            tm tmVar2 = this.c;
            (tmVar2 != null ? tmVar2 : null).b().c(new vtb(pzfVar));
        }
    }

    @Override // defpackage.tsb
    public final void f() {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        tmVar.e().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.MsgSendCallback msgSendCallback = new Tasks.MsgSendCallback();
        msgSendCallback.requestId = this.a;
        msgSendCallback.callbackId = this.d;
        msgSendCallback.payload = this.o;
        msgSendCallback.timestamp = this.X;
        msgSendCallback.messageId = this.Y;
        msgSendCallback.buttonType = this.s0.a;
        Tasks.MsgSendCallback.ButtonPosition buttonPosition = new Tasks.MsgSendCallback.ButtonPosition();
        dx0 dx0Var = this.Z;
        buttonPosition.row = dx0Var.a;
        buttonPosition.column = dx0Var.b;
        msgSendCallback.buttonPosition = buttonPosition;
        return fl9.toByteArray(msgSendCallback);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.J0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        Long lValueOf = Long.valueOf(this.X);
        String str = this.s0.a;
        zf8 zf8Var = new zf8((xhb) null, 12);
        zf8Var.x("callbackId", this.d);
        zf8Var.x(ApiProtocol.PARAM_PAYLOAD, this.o);
        ((us) zf8Var.b).put("timestamp", lValueOf);
        zf8Var.x("type", str);
        return zf8Var;
    }

    public final void s(boolean z) throws Throwable {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        qi9 qi9VarD = tmVar.d();
        long j = this.Y;
        si9 si9VarM = qi9VarD.m(j);
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED) {
            f();
            return;
        }
        tm tmVar2 = this.c;
        if (tmVar2 == null) {
            tmVar2 = null;
        }
        gx9 gx9Var = (gx9) tmVar2.y.getValue();
        gx9Var.a.s(j, new bx9(new hd1(2, this, z), gx9Var));
        tm tmVar3 = this.c;
        (tmVar3 != null ? tmVar3 : null).b().c(new itg(si9VarM.Z, si9VarM.a, false));
    }
}
