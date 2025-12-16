package defpackage;

import kotlin.NoWhenBranchMatchedException;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class xo5 extends hge implements tsb {
    public static final /* synthetic */ int Z = 0;
    public final long X;
    public final String Y;
    public final long b;
    public final String c;
    public final String d;
    public final long o;

    public xo5(long j, String str, String str2, long j2, long j3, String str3) {
        this.b = j;
        this.c = str;
        this.d = str2;
        this.o = j2;
        this.X = j3;
        this.Y = str3;
    }

    @Override // defpackage.tsb
    public final int c() throws Throwable {
        long j = this.o;
        if (j <= 0) {
            return 1;
        }
        si9 si9VarM = l().m(j);
        return (si9VarM == null || si9VarM.t0 == jm9.DELETED) ? 3 : 1;
    }

    @Override // defpackage.tsb
    public final void f() throws Throwable {
        p().d(this.b);
        pb2 pb2VarM = b().M(this.X);
        long j = this.o;
        if (pb2VarM != null) {
            ige igeVar = this.a;
            if (igeVar == null) {
                igeVar = null;
            }
            dkb dkbVar = (dkb) igeVar.p.getValue();
            long j2 = pb2VarM.b.a;
            dkbVar.getClass();
            dkb.b(j2, j);
        }
        si9 si9VarM = l().m(j);
        if (si9VarM == null || si9VarM.t0 == jm9.DELETED) {
            wqi.c("xo5", "onMaxFailCount: Message was deleted", new Object[0]);
            return;
        }
        l().t(si9VarM, xi9.Y);
        r().c(new itg(si9VarM.Z, si9VarM.a, false));
        she.v(s());
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ExternalVideoSend externalVideoSend = new Tasks.ExternalVideoSend();
        externalVideoSend.requestId = this.b;
        externalVideoSend.externalUrl = this.c;
        externalVideoSend.attachLocalId = this.d;
        externalVideoSend.messageId = this.o;
        externalVideoSend.chatId = this.X;
        externalVideoSend.stickerId = this.Y;
        return fl9.toByteArray(externalVideoSend);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.b;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.O0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 5;
    }

    @Override // defpackage.hge
    public final void u() throws Throwable {
        ige igeVar = this.a;
        if (igeVar == null) {
            igeVar = null;
        }
        lv5 lv5Var = (lv5) igeVar.b.getValue();
        lv5Var.getClass();
        int iOrdinal = ((iv5) svi.g(bd5.a, new kv5(lv5Var, this.b, this.c, this.d, this.o, this.X, this.Y, null))).ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            return;
        }
        if (iOrdinal != 5) {
            throw new NoWhenBranchMatchedException();
        }
        f();
    }
}
