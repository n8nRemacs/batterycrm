package defpackage;

import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: classes.dex */
public final class wbd extends k2g {
    public final /* synthetic */ long e;
    public final /* synthetic */ xbd f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wbd(String str, long j, xbd xbdVar) {
        super(str, true);
        this.e = j;
        this.f = xbdVar;
    }

    @Override // defpackage.k2g
    public final long a() {
        n0i n0iVar;
        xbd xbdVar = this.f;
        synchronized (xbdVar) {
            try {
                if (!xbdVar.o && (n0iVar = xbdVar.e) != null) {
                    int i = xbdVar.q ? xbdVar.p : -1;
                    xbdVar.p++;
                    xbdVar.q = true;
                    if (i != -1) {
                        StringBuilder sb = new StringBuilder("sent ping but didn't receive pong within ");
                        sb.append(xbdVar.u);
                        sb.append("ms (after ");
                        xbdVar.c(new SocketTimeoutException(ho7.j(sb, i - 1, " successful ping/pongs)")));
                    } else {
                        try {
                            n0iVar.c(9, xx0.d);
                        } catch (IOException e) {
                            xbdVar.c(e);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.e;
    }
}
