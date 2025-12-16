package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class vd2 extends sm implements j1g, tsb {
    public final long d;
    public final long o;

    public vd2(long j, long j2, long j3) {
        super(j);
        this.d = j2;
        this.o = j3;
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
        k().c(new n73(Collections.singletonList(Long.valueOf(this.d)), true, false, null, null, 124));
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
        of2 of2Var;
        r().d(this.a);
        ve2 ve2VarL = l();
        long j = this.d;
        pb2 pb2VarM = ve2VarL.M(j);
        if (pb2VarM != null && ((of2Var = pb2VarM.b.c) == of2.d || of2Var == of2.o)) {
            l().s(j, of2.a);
        }
        k().c(new n73(Collections.singletonList(Long.valueOf(j)), true, false, null, null, 124));
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ChatClose chatClose = new Tasks.ChatClose();
        chatClose.requestId = this.a;
        chatClose.chatId = this.d;
        chatClose.chatServerId = this.o;
        return fl9.toByteArray(chatClose);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.z0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        wua wuaVar = new wua((xhb) null, 26);
        wuaVar.t(this.o, ApiProtocol.PARAM_CHAT_ID);
        return wuaVar;
    }
}
