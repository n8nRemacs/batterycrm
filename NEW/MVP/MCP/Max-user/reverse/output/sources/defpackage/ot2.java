package defpackage;

import java.util.Collections;
import java.util.Iterator;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Tasks;

/* loaded from: classes2.dex */
public final class ot2 extends sm implements j1g, tsb {
    public final long d;
    public final boolean o;

    public ot2(long j, long j2, boolean z) {
        super(j);
        this.d = j2;
        this.o = z;
    }

    @Override // defpackage.tsb
    public final int c() {
        a3g a3gVarR = r();
        usb usbVar = usb.E0;
        long j = this.a;
        Iterator it = a3gVarR.h(j, usbVar).iterator();
        while (it.hasNext()) {
            ot2 ot2Var = (ot2) ((r2g) it.next()).f;
            if (ot2Var.d == this.d && ot2Var.a > j) {
                return 3;
            }
        }
        return 1;
    }

    @Override // defpackage.j1g
    public final void d(l0g l0gVar) {
        pt2 pt2Var = (pt2) l0gVar;
        if (pt2Var.c != null) {
            l().g0(this.d, bf2.d);
            l().m0(Collections.singletonList(pt2Var.c));
        }
    }

    @Override // defpackage.j1g
    public final void e(pzf pzfVar) {
        if (!qaj.c(pzfVar.b)) {
            f();
        }
        k().c(new rj0(this.a, pzfVar));
    }

    @Override // defpackage.tsb
    public final void f() {
        l().g0(this.d, bf2.d);
        r().d(this.a);
    }

    @Override // defpackage.tsb
    public final byte[] g() {
        Tasks.ChatPinSetVisibility chatPinSetVisibility = new Tasks.ChatPinSetVisibility();
        chatPinSetVisibility.requestId = this.a;
        chatPinSetVisibility.chatServerId = this.d;
        chatPinSetVisibility.show = this.o;
        return fl9.toByteArray(chatPinSetVisibility);
    }

    @Override // defpackage.tsb
    public final long getId() {
        return this.a;
    }

    @Override // defpackage.tsb
    public final usb getType() {
        return usb.E0;
    }

    @Override // defpackage.sm
    public final n2 i() {
        fh2 fh2Var = new fh2(null, 9);
        fh2Var.t(this.d, ApiProtocol.PARAM_CHAT_ID);
        fh2Var.i("show", this.o);
        return fh2Var;
    }
}
