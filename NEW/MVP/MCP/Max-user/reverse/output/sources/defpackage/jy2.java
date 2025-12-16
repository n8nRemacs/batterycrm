package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class jy2 extends sm implements j1g, tsb {
    public final long d;
    public final boolean o;

    public jy2(long j, long j2, boolean z) {
        super(j);
        this.d = j2;
        this.o = z;
    }

    @Override // defpackage.tsb
    public final int c() {
        return 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
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
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ChatSubscribe chatSubscribe = new Tasks.ChatSubscribe();
        chatSubscribe.requestId = this.a;
        chatSubscribe.chatServerId = this.d;
        chatSubscribe.subscribe = this.o;
        return fl9.toByteArray(chatSubscribe);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.D0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        fh2 fh2Var = new fh2(null, 12);
        fh2Var.t(this.d, ApiProtocol.PARAM_CHAT_ID);
        fh2Var.i("subscribe", this.o);
        return fh2Var;
    }
}
