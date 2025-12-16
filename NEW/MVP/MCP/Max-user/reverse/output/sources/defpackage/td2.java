package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class td2 extends sm implements j1g, tsb {
    public final long X;
    public final boolean Y;
    public final long d;
    public final long o;

    public td2(long j, long j2, long j3, long j4, boolean z) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = j4;
        this.Y = z;
    }

    @Override // defpackage.tsb
    public final int c() {
        pb2 pb2VarM = l().M(this.d);
        if (pb2VarM == null) {
            return 1;
        }
        of2 of2Var = pb2VarM.b.c;
        return (of2Var == of2.d || of2Var == of2.o) ? 3 : 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        tm tmVar = this.c;
        if (tmVar == null) {
            tmVar = null;
        }
        ((ma3) tmVar.M.getValue()).a(this.d, this.X);
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        if (pzfVar instanceof hzf) {
            return;
        }
        f();
    }

    @Override // defpackage.tsb
    public final void f() {
        r().d(this.a);
        n().u(this.d, this.X, jm9.ACTIVE);
        ve2 ve2VarL = l();
        long j = this.d;
        ve2VarL.H(j);
        k().c(new n73(Collections.singletonList(Long.valueOf(j)), true, false, null, null, 124));
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ChatClear chatClear = new Tasks.ChatClear();
        chatClear.requestId = this.a;
        chatClear.chatId = this.d;
        chatClear.chatServerId = this.o;
        chatClear.lastEventTime = this.X;
        chatClear.forAll = this.Y;
        return fl9.toByteArray(chatClear);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.t0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        wua wuaVar = new wua((xhb) null, 25);
        wuaVar.t(this.o, ApiProtocol.PARAM_CHAT_ID);
        wuaVar.t(this.X, "lastEventTime");
        wuaVar.i("forAll", this.Y);
        return wuaVar;
    }
}
