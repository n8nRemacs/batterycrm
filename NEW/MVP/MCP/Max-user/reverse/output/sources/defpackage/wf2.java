package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class wf2 extends sm implements j1g, tsb {
    public final long X;
    public final boolean Y;
    public final long d;
    public final long o;

    public wf2(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = j4;
        this.Y = z;
    }

    @Override // defpackage.tsb
    public final int c() {
        ve2 ve2VarL = l();
        long j = this.d;
        pb2 pb2VarM = ve2VarL.M(j);
        if (pb2VarM == null || pb2VarM.b.c != of2.d) {
            return 1;
        }
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        ((ma3) tmVar.M.getValue()).a(j, this.X);
        return 3;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        ve2 ve2VarL = l();
        of2 of2Var = of2.d;
        long j = this.d;
        ve2VarL.s(j, of2Var);
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        ((ma3) tmVar.M.getValue()).a(j, this.X);
        k().c(new vkd(j));
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
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ChatDelete chatDelete = new Tasks.ChatDelete();
        chatDelete.requestId = this.a;
        chatDelete.chatId = this.d;
        chatDelete.chatServerId = this.o;
        chatDelete.lastEventTime = this.X;
        chatDelete.forAll = this.Y;
        return fl9.toByteArray(chatDelete);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.Y;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        wua wuaVar = new wua((xhb) null, 29);
        wuaVar.t(this.o, ApiProtocol.PARAM_CHAT_ID);
        wuaVar.t(this.X, "lastEventTime");
        wuaVar.i("forAll", this.Y);
        return wuaVar;
    }
}
