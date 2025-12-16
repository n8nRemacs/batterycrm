package defpackage;

import android.content.Context;
import android.os.SystemClock;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import one.me.net.ssl.api.InvalidSslSessionException;

/* loaded from: classes2.dex */
public final class c9f {
    public final String a = c9f.class.getName().concat("(DEF_SSL)");
    public final Context b;
    public final d9f c;
    public final znd d;
    public final bwf e;

    public c9f(Context context) {
        this.b = context.getApplicationContext();
        d9f d9fVar = new d9f();
        this.c = d9fVar;
        this.d = new znd(d9fVar);
        this.e = new bwf(new nte(10));
    }

    public final j6f a(String str) throws SSLException {
        lg8 lg8Var = lg8.d;
        String str2 = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str2, ho7.i("createSocketFactory, host=", str, " ->"), null);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            j6f j6fVar = new j6f(this.b, str);
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            d9f d9fVar = this.c;
            if (jCurrentTimeMillis2 >= 0) {
                d9fVar.a = jCurrentTimeMillis2;
                d9fVar.b += jCurrentTimeMillis2;
                d9fVar.c++;
            } else {
                d9fVar.getClass();
            }
            String str3 = this.a;
            l6b l6bVar2 = wqi.a;
            if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                l6bVar2.c(lg8Var, str3, a9h.d(jCurrentTimeMillis2, "<- createSocketFactory, took=", "ms"), null);
            }
            return j6fVar;
        } catch (SSLException e) {
            throw e;
        } catch (Throwable th) {
            throw new SSLException("Failed to create socket factory", th);
        }
    }

    public final void b(SSLSocket sSLSocket, String str) throws SSLPeerUnverifiedException {
        lg8 lg8Var = lg8.d;
        String str2 = this.a;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str2, ho7.i("verifySocket, host=", str, " ->"), null);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        d9f d9fVar = (d9f) this.d.a;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            try {
                SSLSession session = sSLSocket.getSession();
                if (!session.isValid()) {
                    throw new InvalidSslSessionException("session is not valid " + session, 2);
                }
                if ("SSL_NULL_WITH_NULL_NULL".equalsIgnoreCase(session.getCipherSuite())) {
                    throw new InvalidSslSessionException("Illegal session cipher suite", 2);
                }
                long jElapsedRealtime2 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (jElapsedRealtime2 >= 0) {
                    d9fVar.g = jElapsedRealtime2;
                    d9fVar.h += jElapsedRealtime2;
                    d9fVar.i++;
                }
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                d9f d9fVar2 = (d9f) this.d.a;
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                try {
                    if (!HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSocket.getSession())) {
                        throw new SSLPeerUnverifiedException("Failed to verify host=".concat(str));
                    }
                    d9fVar2.a(SystemClock.elapsedRealtime() - jElapsedRealtime3);
                    long jCurrentTimeMillis4 = System.currentTimeMillis() - jCurrentTimeMillis3;
                    String str3 = this.a;
                    l6b l6bVar2 = wqi.a;
                    if (l6bVar2 != null && l6bVar2.b(lg8Var)) {
                        l6bVar2.c(lg8Var, str3, a9h.d(jCurrentTimeMillis2 + jCurrentTimeMillis4, "<- verifySocket, took=", "ms"), null);
                    }
                } catch (SSLPeerUnverifiedException e) {
                    d9fVar2.a(SystemClock.elapsedRealtime() - jElapsedRealtime3);
                    wqi.e(this.a, kbj.a(sSLSocket, str), null);
                    throw e;
                } catch (Throwable th) {
                    d9fVar2.a(SystemClock.elapsedRealtime() - jElapsedRealtime3);
                    wqi.e(this.a, kbj.a(sSLSocket, str), null);
                    SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException("Failed to verify host=".concat(str));
                    sSLPeerUnverifiedException.initCause(th);
                    throw sSLPeerUnverifiedException;
                }
            } catch (Throwable th2) {
                long jElapsedRealtime4 = SystemClock.elapsedRealtime() - jElapsedRealtime;
                if (jElapsedRealtime4 >= 0) {
                    d9fVar.g = jElapsedRealtime4;
                    d9fVar.h += jElapsedRealtime4;
                    d9fVar.i++;
                }
                throw th2;
            }
        } catch (InvalidSslSessionException e2) {
            throw e2;
        } catch (Throwable th3) {
            throw new InvalidSslSessionException("Failed to check session", th3);
        }
    }
}
