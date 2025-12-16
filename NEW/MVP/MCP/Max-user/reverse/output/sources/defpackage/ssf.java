package defpackage;

import java.util.Collections;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class ssf extends sm implements j1g, tsb {
    public final boolean X;
    public final long d;
    public final long o;

    public ssf(long j, long j2, boolean z, long j3) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = z;
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
        if (qaj.c(pzfVar.b)) {
            return;
        }
        f();
    }

    @Override // defpackage.tsb
    public final void f() {
        r().d(this.a);
        ve2 ve2VarL = l();
        ve2VarL.getClass();
        ke2 ke2Var = new ke2(false, 1);
        long j = this.d;
        ve2VarL.r(j, false, ke2Var);
        k().c(new n73(Collections.singletonList(Long.valueOf(j)), false, false, null, null, 124));
        k().c(new t24(Collections.singletonList(Long.valueOf(this.o))));
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.SuspendBot suspendBot = new Tasks.SuspendBot();
        suspendBot.requestId = this.a;
        suspendBot.chatId = this.d;
        suspendBot.botId = this.o;
        suspendBot.suspend = this.X;
        return fl9.toByteArray(suspendBot);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.K0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        zf8 zf8Var = new zf8((xhb) null, 27);
        zf8Var.t(this.o, "botId");
        zf8Var.i(SdkMetricStatEvent.VALUE_KEY, this.X);
        return zf8Var;
    }
}
