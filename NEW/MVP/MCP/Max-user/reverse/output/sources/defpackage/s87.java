package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class s87 extends wx {
    public final /* synthetic */ int k;
    public final Object l;

    public /* synthetic */ s87(int i, Object obj) {
        this.k = i;
        this.l = obj;
    }

    @Override // defpackage.wx
    public final void k() throws IOException {
        switch (this.k) {
            case 0:
                ((t87) this.l).e(9);
                m87 m87Var = ((t87) this.l).n;
                synchronized (m87Var) {
                    long j = m87Var.x0;
                    long j2 = m87Var.w0;
                    if (j < j2) {
                        return;
                    }
                    m87Var.w0 = j2 + 1;
                    m87Var.y0 = System.nanoTime() + 1000000000;
                    m87Var.Z.c(new k87(ho7.l(new StringBuilder(), m87Var.c, " ping"), m87Var), 0L);
                    return;
                }
            case 1:
                ((mbd) this.l).d();
                return;
            default:
                Socket socket = (Socket) this.l;
                try {
                    socket.close();
                    return;
                } catch (AssertionError e) {
                    Logger logger = yua.a;
                    boolean z = false;
                    if (e.getCause() != null) {
                        String message = e.getMessage();
                        if (message != null ? vmf.s(message, "getsockname failed", false) : false) {
                            z = true;
                        }
                    }
                    if (!z) {
                        throw e;
                    }
                    yua.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                    return;
                } catch (Exception e2) {
                    yua.a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
                    return;
                }
        }
    }

    public void l() {
        if (j()) {
            throw m(null);
        }
    }

    public IOException m(IOException iOException) {
        switch (this.k) {
            case 0:
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            default:
                SocketTimeoutException socketTimeoutException2 = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException2.initCause(iOException);
                }
                return socketTimeoutException2;
        }
    }
}
