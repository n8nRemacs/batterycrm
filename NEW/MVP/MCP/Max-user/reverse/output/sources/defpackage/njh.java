package defpackage;

import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class njh extends q0f {
    public final sua v;
    public xbd w;

    public njh(long j, Runnable runnable, m0f m0fVar, ExecutorService executorService, y6d y6dVar, z6d z6dVar, long j2, boolean z, ag5 ag5Var, boolean z2) {
        super("WS", j, runnable, m0fVar, executorService, y6dVar, z6dVar, j2, z, ag5Var, z2, new l0f("websocket_restart", "websocket_connected", "websocket_reconnected", "websocket_failed_pings", "websocket_failed_exception", "websocket_timeout"));
        this.v = new sua();
    }

    @Override // defpackage.q0f
    public final boolean safelyCloseSocketWithCodeAndReason(int i, String str) {
        xbd xbdVar = this.w;
        this.w = null;
        if (xbdVar == null) {
            return false;
        }
        xbdVar.b(i, "dispose");
        return true;
    }

    @Override // defpackage.q0f
    public final void safelyCreateNewSocket(String str, p0f p0fVar) throws NumberFormatException {
        kw6 kw6Var = new kw6();
        kw6Var.m(str);
        zmd zmdVarA = kw6Var.a();
        w7c w7cVar = new w7c((xpb) p0fVar);
        sua suaVar = this.v;
        suaVar.getClass();
        xbd xbdVar = new xbd(b3g.h, zmdVarA, w7cVar, new Random(), 0, suaVar.I0);
        if (zmdVarA.d.a("Sec-WebSocket-Extensions") != null) {
            xbdVar.c(new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"));
        } else {
            rua ruaVarA = suaVar.a();
            byte[] bArr = yxg.a;
            ruaVarA.e = new syf();
            ArrayList arrayList = new ArrayList(xbd.x);
            epc epcVar = epc.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(epcVar) && !arrayList.contains(epc.HTTP_1_1)) {
                throw new IllegalArgumentException(("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList).toString());
            }
            if (arrayList.contains(epcVar) && arrayList.size() > 1) {
                throw new IllegalArgumentException(("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList).toString());
            }
            if (arrayList.contains(epc.HTTP_1_0)) {
                throw new IllegalArgumentException(("protocols must not contain http/1.0: " + arrayList).toString());
            }
            if (arrayList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayList.remove(epc.SPDY_3);
            if (!arrayList.equals(ruaVarA.r)) {
                ruaVarA.z = null;
            }
            ruaVarA.r = Collections.unmodifiableList(arrayList);
            sua suaVar2 = new sua(ruaVarA);
            kw6 kw6VarA = zmdVarA.a();
            ((i17) kw6VarA.c).h("Upgrade", "websocket");
            ((i17) kw6VarA.c).h(HTTP.CONN_DIRECTIVE, "Upgrade");
            ((i17) kw6VarA.c).h("Sec-WebSocket-Key", xbdVar.a);
            ((i17) kw6VarA.c).h("Sec-WebSocket-Version", "13");
            ((i17) kw6VarA.c).h("Sec-WebSocket-Extensions", "permessage-deflate");
            zmd zmdVarA2 = kw6VarA.a();
            mbd mbdVar = new mbd(suaVar2, zmdVarA2, true);
            xbdVar.b = mbdVar;
            mbdVar.e(new ssb(xbdVar, 3, zmdVarA2));
        }
        this.w = xbdVar;
    }

    @Override // defpackage.q0f
    public final void safelyDoIfSocketExists(em6 em6Var) {
        xbd xbdVar = this.w;
        if (xbdVar != null) {
            em6Var.invoke(xbdVar.r.toString());
        }
    }

    @Override // defpackage.q0f
    public final void safelyResetSocketReference() {
        this.w = null;
    }

    @Override // defpackage.q0f
    public final boolean safelySendSocketMessage(String str) {
        xbd xbdVar = this.w;
        if (xbdVar == null) {
            return false;
        }
        xx0 xx0Var = new xx0(str.getBytes(lb2.a));
        xx0Var.b = str;
        synchronized (xbdVar) {
            if (!xbdVar.o && !xbdVar.l) {
                long j = xbdVar.k;
                if (r2.length + j > 16777216) {
                    xbdVar.b(1001, null);
                    return true;
                }
                xbdVar.k = j + r2.length;
                xbdVar.j.add(new ubd(xx0Var));
                xbdVar.f();
                return true;
            }
            return true;
        }
    }
}
