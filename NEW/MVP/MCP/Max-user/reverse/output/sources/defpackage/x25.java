package defpackage;

import java.util.Arrays;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class x25 extends sm implements tsb, j1g {
    public final String X;
    public final long d;
    public final long o;

    public x25(long j, long j2, long j3) {
        super(j);
        this.d = j2;
        this.o = j3;
        this.X = x25.class.getName();
    }

    @Override // defpackage.tsb
    public final int c() {
        return 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        String str = this.X;
        wqi.c(str, "onSuccess: " + l0gVar, new Object[0]);
        pb2 pb2VarM = l().M(this.d);
        if (pb2VarM == null) {
            wqi.h(str, "no chat, ignore!", null);
            return;
        }
        rf2 rf2Var = pb2VarM.b;
        if (rf2Var.c0 == null) {
            wqi.h(str, "draft already is null, ignore!", null);
            l().u(this.d, this.o, null);
            return;
        }
        long j = rf2Var.d0;
        if (j == 0) {
            wqi.h(str, "local draft not yet sync, ignore!", null);
            return;
        }
        long j2 = this.o;
        if (j < j2) {
            l().u(this.d, this.o, null);
            wqi.o(str, null, "chat has server draft older than current DRAFT_DISCARD server time, diff = %d, clear it", Arrays.copyOf(new Object[]{Long.valueOf(j2 - j)}, 1));
        }
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
        wqi.e(this.X, "onMaxFailCount", null);
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.DraftDiscard draftDiscard = new Tasks.DraftDiscard();
        draftDiscard.requestId = this.a;
        draftDiscard.chatId = this.d;
        draftDiscard.serverTime = this.o;
        return fl9.toByteArray(draftDiscard);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.W0;
    }

    @Override // defpackage.tsb
    public final int h() {
        return 1000000;
    }

    @Override // defpackage.sm
    public final n2 i() {
        long jLongValue;
        pb2 pb2VarM = l().M(this.d);
        xhb xhbVar = null;
        if (pb2VarM == null) {
            wqi.c(this.X, "createRequest: No chat. return null", new Object[0]);
            return null;
        }
        if (pb2VarM.Q()) {
            ku3 ku3VarN = pb2VarM.n();
            Long lValueOf = ku3VarN != null ? Long.valueOf(ku3VarN.p()) : null;
            if (lValueOf == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            jLongValue = lValueOf.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jLongValue == 0 ? pb2VarM.b.a : 0L;
        fh2 fh2Var = new fh2(xhbVar, 24);
        if (jLongValue != 0) {
            fh2Var.t(jLongValue, "userId");
        }
        if (j != 0) {
            fh2Var.t(j, ApiProtocol.PARAM_CHAT_ID);
        }
        long j2 = this.o;
        if (j2 != 0) {
            fh2Var.t(j2, "time");
        }
        return fh2Var;
    }
}
