package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class wd2 extends sm implements j1g, tsb {
    public final String X;
    public final long d;
    public final sj3 o;

    public wd2(long j, long j2, sj3 sj3Var) {
        super(j);
        this.d = j2;
        this.o = sj3Var;
        this.X = wd2.class.getName();
    }

    @Override // defpackage.tsb
    public final int c() {
        of2 of2Var;
        pb2 pb2VarM = l().M(this.d);
        return (pb2VarM == null || (of2Var = pb2VarM.b.c) == of2.d || of2Var == of2.o) ? 3 : 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        k().c(new xd2(this.a, this.d));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        if (qaj.c(pzfVar.b)) {
            return;
        }
        f();
        k().c(new rj0(pzfVar));
    }

    @Override // defpackage.tsb
    public final void f() {
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ChatComplain chatComplain = new Tasks.ChatComplain();
        chatComplain.requestId = this.a;
        chatComplain.chatId = this.d;
        sj3 sj3Var = this.o;
        chatComplain.complaint = sj3Var == null ? "" : sj3Var.a;
        return fl9.toByteArray(chatComplain);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.I0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        pb2 pb2VarM = l().M(this.d);
        if (pb2VarM == null) {
            wqi.c(this.X, "chat is null", new Object[0]);
            return null;
        }
        long j = pb2VarM.b.a;
        wua wuaVar = new wua((xhb) null, 27);
        wuaVar.t(j, ApiProtocol.PARAM_CHAT_ID);
        sj3 sj3Var = this.o;
        if (sj3Var != null) {
            wuaVar.x("complaint", sj3Var.a);
        }
        return wuaVar;
    }
}
