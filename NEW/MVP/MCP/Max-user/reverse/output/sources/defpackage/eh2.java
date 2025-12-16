package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class eh2 extends sm implements j1g, tsb {
    public final String X;
    public final long d;
    public final long o;

    public eh2(long j, long j2, long j3) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = eh2.class.getName();
    }

    @Override // defpackage.tsb
    public final int c() {
        return l().M(this.d) != null ? 1 : 3;
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
        long j = this.a;
        wqi.f(this.X, "onMaxFailCount: remove task, requestId = %d", Long.valueOf(j));
        r().d(j);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ChatHide chatHide = new Tasks.ChatHide();
        chatHide.requestId = this.a;
        chatHide.chatId = this.d;
        chatHide.chatServerId = this.o;
        return fl9.toByteArray(chatHide);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.U0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        fh2 fh2Var = new fh2(null, 0);
        fh2Var.t(this.o, ApiProtocol.PARAM_CHAT_ID);
        return fh2Var;
    }
}
