package defpackage;

import java.io.IOException;
import java.io.PushbackInputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;
import tech.kwik.flupke.core.HttpError;
import tech.kwik.flupke.webtransport.impl.BufferedStreamsLimitExceededException;

/* loaded from: classes3.dex */
public final class tb3 {
    public volatile int d;
    public final String f;
    public final int g;
    public final y87 h;
    public final long i;
    public final ConcurrentHashMap a = new ConcurrentHashMap();
    public final ReentrantLock b = new ReentrantLock();
    public final ConcurrentHashMap c = new ConcurrentHashMap();
    public volatile long e = -1;

    public tb3(URI uri, v87 v87Var) throws IOException {
        String host = uri.getHost();
        this.f = host;
        int port = uri.getPort();
        this.g = port;
        try {
            URI uri2 = new URI("https://" + host + ":" + port);
            new HashMap();
            Optional.empty();
            xo8 xo8Var = v87Var.d;
            ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) xo8Var.c;
            int port2 = uri2.getPort();
            port2 = port2 <= 0 ? 443 : port2;
            String host2 = uri2.getHost();
            a97 a97Var = new a97();
            a97Var.a = host2;
            a97Var.b = port2;
            try {
                y87 y87VarU = xo8Var.u(a97Var);
                concurrentHashMap.put(a97Var, y87VarU);
                this.h = y87VarU;
                if (((List) y87VarU.l).contains(350866729L)) {
                    throw new IllegalArgumentException("Cannot overwrite internal settings parameter");
                }
                ((HashMap) y87VarU.d).put(350866729L, 1L);
                y87VarU.d();
                this.i = ((Long) y87VarU.i(350866729L).orElse(1L)).longValue();
                ((HashMap) y87VarU.c).put(84L, new rb3(this, 0));
                y87VarU.n = new rb3(this, 1);
            } catch (RuntimeException e) {
                if (!(e.getCause() instanceof IOException)) {
                    throw e;
                }
                throw ((IOException) e.getCause());
            }
        } catch (URISyntaxException unused) {
            throw new IOException(wy1.h("Invalid server URI: ", this.f));
        }
    }

    public final void a(long j, ca7 ca7Var) {
        this.b.lock();
        try {
            rie rieVar = (rie) this.a.get(Long.valueOf(j));
            if (rieVar != null && rieVar.e == qie.b) {
                rieVar.d(ca7Var);
            } else if (rieVar == null && j <= this.e) {
                ca7Var.d(386759528L);
                if (ca7Var.c()) {
                    ca7Var.e(386759528L);
                }
            } else {
                if (this.d >= 3) {
                    throw new BufferedStreamsLimitExceededException();
                }
                ((List) this.c.computeIfAbsent(Long.valueOf(j), new m0(3))).add(ca7Var);
                this.d++;
            }
            this.b.unlock();
        } catch (Throwable th) {
            this.b.unlock();
            throw th;
        }
    }

    public final rie b(URI uri) throws gn8, IOException, NumberFormatException, HttpError {
        sb3 sb3Var = new sb3(0);
        sb3 sb3Var2 = new sb3(0);
        if (!this.f.equals(uri.getHost()) || this.g != uri.getPort()) {
            throw new IllegalArgumentException("WebTransport URI must have the same host and port as the server URI used with the constructor");
        }
        if (this.a.size() >= this.i) {
            throw new IllegalStateException(a9h.d(this.i, "Maximum number of sessions (", ") reached"));
        }
        try {
            new HashMap();
            Optional.empty();
            d97 d97VarU = this.h.u(new kce(22, uri), Duration.ofSeconds(5L));
            sa9 sa9Var = new sa9();
            sa9Var.a = d97VarU;
            sa9Var.b = new HashMap();
            sa9Var.c = new PushbackInputStream(d97VarU.c, 8);
            wha.q(Collections.EMPTY_MAP, new l17(1));
            uri.getAuthority();
            uri.getPath();
            if (uri.getQuery() != null) {
                uri.getQuery();
            }
            try {
                rie rieVar = new rie(this.h, sa9Var, sb3Var, sb3Var2, this);
                this.b.lock();
                try {
                    this.e = rieVar.c;
                    this.a.put(Long.valueOf(rieVar.c), rieVar);
                    return rieVar;
                } finally {
                    this.b.unlock();
                }
            } catch (InterruptedException unused) {
                throw new HttpError("HTTP CONNECT request was interrupted");
            }
        } catch (InterruptedException unused2) {
        }
    }

    public final void c(rie rieVar) {
        long j = rieVar.c;
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.a.remove(Long.valueOf(j));
            this.c.remove(Long.valueOf(j));
        } finally {
            reentrantLock.unlock();
        }
    }
}
