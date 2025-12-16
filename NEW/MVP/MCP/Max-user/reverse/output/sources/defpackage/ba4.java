package defpackage;

import java.io.ByteArrayOutputStream;
import java.util.Collections;
import ru.ok.tamtam.nano.Tasks;
import ru.ok.tamtam.stats.LogController$AnalyticsDebugException;

/* loaded from: classes2.dex */
public final class ba4 extends sm implements j1g, tsb {
    public final dm d;
    public final String o;

    public ba4(long j, dm dmVar) {
        super(j);
        this.d = dmVar;
        this.o = ba4.class.getName();
    }

    @Override // defpackage.tsb
    public final int c() {
        return 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        wqi.c(this.o, "onSuccess: logEntry=" + this.d, new Object[0]);
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        StringBuilder sb = new StringBuilder("onFail: logEntry=");
        dm dmVar = this.d;
        sb.append(dmVar);
        wqi.c(this.o, sb.toString(), new Object[0]);
        String str = pzfVar.b;
        if (qaj.c(str)) {
            return;
        }
        f();
        LogController$AnalyticsDebugException logController$AnalyticsDebugException = new LogController$AnalyticsDebugException("Could not send crit event " + dmVar + ".\nError: " + str + ".\nMessage: " + pzfVar.c, null);
        tm tmVar = this.c;
        ((y3b) ((yi5) (tmVar != null ? tmVar : null).w.getValue())).a(logController$AnalyticsDebugException);
    }

    @Override // defpackage.tsb
    public final void f() {
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.CritLog critLog = new Tasks.CritLog();
        critLog.requestId = this.a;
        dm dmVar = this.d;
        critLog.time = dmVar.a;
        critLog.userId = dmVar.b;
        critLog.sessionId = dmVar.c;
        critLog.type = dmVar.d;
        critLog.event = dmVar.e;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        efi.q(dmVar.f, byteArrayOutputStream);
        critLog.params = byteArrayOutputStream.toByteArray();
        return fl9.toByteArray(critLog);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.b1;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        return new zf8(Collections.singletonList(this.d));
    }
}
