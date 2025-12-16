package defpackage;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.SocketFactory;

/* loaded from: classes.dex */
public final class unc implements u25 {
    public volatile boolean a;
    public volatile Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;

    public unc(uda udaVar, cz4 cz4Var, yq3 yq3Var, uaj uajVar, w7c w7cVar, AtomicBoolean atomicBoolean) {
        this.c = uajVar;
        this.d = w7cVar;
        this.e = atomicBoolean;
        this.f = new Object();
        this.g = ho7.f(System.identityHashCode(this), "TcpConnector@");
    }

    @Override // defpackage.u25
    public void a(i25 i25Var) {
        this.g = i25Var;
        boolean z = false;
        while (!z) {
            try {
                if (this.a) {
                    break;
                }
                this.b = new tnc(this);
                ((ExecutorService) this.c).execute((tnc) this.b);
                try {
                    ((tnc) this.b).get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        String str = zxg.a;
                        throw cause;
                    }
                }
            } finally {
                tnc tncVar = (tnc) this.b;
                tncVar.getClass();
                tncVar.a();
            }
        }
    }

    public Socket b(InetAddress inetAddress, int i) throws Exception {
        InetAddress inetAddress2;
        uaj uajVar = (uaj) this.c;
        wq5 wq5Var = (wq5) uajVar.c;
        cz4 cz4Var = wq5Var.j;
        String str = (String) uajVar.d;
        cz4Var.b(str, inetAddress);
        Socket socketO = fj0.o((SocketFactory) uajVar.e);
        try {
            inetAddress2 = inetAddress;
        } catch (Exception e) {
            e = e;
            inetAddress2 = inetAddress;
        }
        try {
            wq5Var.m(socketO, str, inetAddress2, uajVar.b, i);
            cz4Var.a(str, inetAddress2, true);
            return socketO;
        } catch (Exception e2) {
            e = e2;
            Exception exc = e;
            fj0.q(socketO);
            cz4Var.a(str, inetAddress2, false);
            throw exc;
        }
    }

    public n8d c() {
        return (n8d) ((LinkedBlockingQueue) this.g).poll(15, TimeUnit.SECONDS);
    }

    @Override // defpackage.u25
    public void cancel() {
        this.a = true;
        tnc tncVar = (tnc) this.b;
        if (tncVar != null) {
            tncVar.cancel(true);
        }
    }

    public boolean d() {
        return ((AtomicBoolean) this.e).get() && !this.a && ((Socket) this.b) == null;
    }

    @Override // defpackage.u25
    public void remove() {
        ly0 ly0Var = (ly0) this.e;
        ((b1f) ly0Var.a).l(ly0Var.o.h((ze4) this.d));
    }

    public unc(DatagramSocket datagramSocket, bh8 bh8Var, vsc vscVar, a6 a6Var) throws SocketException {
        this.a = false;
        Objects.requireNonNull(datagramSocket);
        this.b = datagramSocket;
        this.c = bh8Var;
        this.d = vscVar;
        this.e = a6Var;
        Thread thread = new Thread(new awa(17, this), "receiver");
        this.f = thread;
        thread.setDaemon(true);
        this.g = new LinkedBlockingQueue();
        try {
            bh8Var.debug("Socket receive buffer size: " + datagramSocket.getReceiveBufferSize());
        } catch (SocketException unused) {
        }
    }

    public unc(k09 k09Var, jy0 jy0Var, ExecutorService executorService, long j, long j2) {
        this.c = executorService;
        a09 a09Var = k09Var.b;
        a09Var.getClass();
        Map map = Collections.EMPTY_MAP;
        Uri uri = a09Var.a;
        String str = a09Var.f;
        hsi.i(uri, "The uri must be set.");
        ze4 ze4Var = new ze4(uri, 0L, 1, null, map, j, j2, str, 4);
        this.d = ze4Var;
        ly0 ly0VarC = jy0Var.c();
        this.e = ly0VarC;
        this.f = new cz0(ly0VarC, ze4Var, null, new xu9(19, this));
    }
}
