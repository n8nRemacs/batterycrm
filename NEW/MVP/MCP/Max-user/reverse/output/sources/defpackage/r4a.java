package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class r4a extends sm implements j1g, tsb {
    public final long X;
    public final rs4 Y;
    public long Z;
    public final long d;
    public final long o;

    public r4a(long j, long j2, long j3, long j4, rs4 rs4Var) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = j4;
        this.Y = rs4Var;
    }

    @Override // defpackage.tsb
    public final int c() {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        pb2 pb2VarM = tmVar.c().M(this.d);
        if (pb2VarM == null) {
            return 3;
        }
        this.Z = pb2VarM.b.a;
        return 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) throws Throwable {
        s4a s4aVar = (s4a) l0gVar;
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        tmVar.d().b(this.d, this.o, this.X);
        tm tmVar2 = this.c;
        (tmVar2 != null ? tmVar2 : null).c().m0(Collections.singletonList(s4aVar.c));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        if (qaj.c(pzfVar.b)) {
            return;
        }
        f();
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
        Tasks.MsgDeleteRange msgDeleteRange = new Tasks.MsgDeleteRange();
        msgDeleteRange.requestId = this.a;
        msgDeleteRange.chatId = this.d;
        msgDeleteRange.startTime = this.o;
        msgDeleteRange.endTime = this.X;
        msgDeleteRange.itemTypeId = this.Y.a;
        return fl9.toByteArray(msgDeleteRange);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.H0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        long j = this.Z;
        zf8 zf8Var = new zf8(xhb.r1, 3);
        zf8Var.t(j, ApiProtocol.PARAM_CHAT_ID);
        zf8Var.t(this.o, "startTime");
        zf8Var.t(this.X, "endTime");
        zf8Var.x("itemType", this.Y.name());
        return zf8Var;
    }
}
