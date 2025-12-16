package defpackage;

import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class ui2 extends sm implements j1g, tsb {
    public final long d;
    public final long o;

    public ui2(long j, long j2, long j3) {
        super(j);
        this.d = j2;
        this.o = j3;
    }

    @Override // defpackage.tsb
    public final int c() {
        return l().M(this.d) != null ? 1 : 3;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        k().c(new vi2(this.a, this.d));
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        String str = pzfVar.b;
        if (qaj.c(str)) {
            return;
        }
        if (fni.a(str, "chat.not.found")) {
            k().c(new vi2(this.a, this.d));
        }
        f();
    }

    @Override // defpackage.tsb
    public final void f() {
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ChannelLeave channelLeave = new Tasks.ChannelLeave();
        channelLeave.requestId = this.a;
        channelLeave.chatId = this.d;
        channelLeave.chatServerId = this.o;
        return fl9.toByteArray(channelLeave);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.y0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        fh2 fh2Var = new fh2(null, 4);
        fh2Var.t(this.o, ApiProtocol.PARAM_CHAT_ID);
        return fh2Var;
    }
}
