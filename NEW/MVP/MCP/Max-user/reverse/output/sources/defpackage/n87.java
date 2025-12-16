package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;
import org.apache.http.protocol.HTTP;
import ru.ok.android.externcalls.sdk.rate.connection.CandidateTypeHintConfig;

/* loaded from: classes.dex */
public final class n87 implements fj5 {
    public static final List g = yxg.k("connection", CandidateTypeHintConfig.TYPE_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List h = yxg.k("connection", CandidateTypeHintConfig.TYPE_HOST, "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");
    public volatile t87 a;
    public final epc b;
    public volatile boolean c;
    public final qbd d;
    public final rbd e;
    public final m87 f;

    public n87(sua suaVar, qbd qbdVar, rbd rbdVar, m87 m87Var) {
        this.d = qbdVar;
        this.e = rbdVar;
        this.f = m87Var;
        List list = suaVar.B0;
        epc epcVar = epc.H2_PRIOR_KNOWLEDGE;
        this.b = list.contains(epcVar) ? epcVar : epc.HTTP_2;
    }

    @Override // defpackage.fj5
    public final x6f a(ood oodVar) {
        return this.a.g;
    }

    @Override // defpackage.fj5
    public final void b() {
        this.a.g().close();
    }

    @Override // defpackage.fj5
    public final b4f c(zmd zmdVar, long j) {
        return this.a.g();
    }

    @Override // defpackage.fj5
    public final void cancel() {
        this.c = true;
        t87 t87Var = this.a;
        if (t87Var != null) {
            t87Var.e(9);
        }
    }

    @Override // defpackage.fj5
    public final long d(ood oodVar) {
        if (v97.a(oodVar)) {
            return yxg.j(oodVar);
        }
        return 0L;
    }

    @Override // defpackage.fj5
    public final nod e(boolean z) throws IOException {
        j17 j17Var;
        t87 t87Var = this.a;
        synchronized (t87Var) {
            t87Var.i.i();
            while (t87Var.e.isEmpty() && t87Var.k == 0) {
                try {
                    try {
                        t87Var.wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    t87Var.i.l();
                    throw th;
                }
            }
            t87Var.i.l();
            if (t87Var.e.isEmpty()) {
                IOException iOException = t87Var.l;
                if (iOException != null) {
                    throw iOException;
                }
                throw new StreamResetException(t87Var.k);
            }
            j17Var = (j17) t87Var.e.removeFirst();
        }
        epc epcVar = this.b;
        ArrayList arrayList = new ArrayList(20);
        int size = j17Var.size();
        lk6 lk6VarB = null;
        for (int i = 0; i < size; i++) {
            String strB = j17Var.b(i);
            String strD = j17Var.d(i);
            if (fni.a(strB, ":status")) {
                lk6VarB = kcj.b("HTTP/1.1 " + strD);
            } else if (!h.contains(strB)) {
                arrayList.add(strB);
                arrayList.add(vmf.c0(strD).toString());
            }
        }
        if (lk6VarB == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        nod nodVar = new nod();
        nodVar.b = epcVar;
        nodVar.c = lk6VarB.b;
        nodVar.d = (String) lk6VarB.d;
        Object[] array = arrayList.toArray(new String[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }
        i17 i17Var = new i17();
        af3.t(i17Var.a, (String[]) array);
        nodVar.f = i17Var;
        if (z && nodVar.c == 100) {
            return null;
        }
        return nodVar;
    }

    @Override // defpackage.fj5
    public final qbd f() {
        return this.d;
    }

    @Override // defpackage.fj5
    public final void g(zmd zmdVar) throws IOException {
        int i;
        t87 t87Var;
        boolean z;
        if (this.a != null) {
            return;
        }
        boolean z2 = zmdVar.e != null;
        j17 j17Var = zmdVar.d;
        ArrayList arrayList = new ArrayList(j17Var.size() + 4);
        arrayList.add(new c17(c17.f, zmdVar.c));
        xx0 xx0Var = c17.g;
        ga7 ga7Var = zmdVar.b;
        String strB = ga7Var.b();
        String strD = ga7Var.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new c17(xx0Var, strB));
        String strA = j17Var.a(HTTP.TARGET_HOST);
        if (strA != null) {
            arrayList.add(new c17(c17.i, strA));
        }
        arrayList.add(new c17(c17.h, ga7Var.b));
        int size = j17Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strB2 = j17Var.b(i2);
            Locale locale = Locale.US;
            if (strB2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strB2.toLowerCase(locale);
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && fni.a(j17Var.d(i2), "trailers"))) {
                arrayList.add(new c17(lowerCase, j17Var.d(i2)));
            }
        }
        m87 m87Var = this.f;
        boolean z3 = !z2;
        synchronized (m87Var.G0) {
            synchronized (m87Var) {
                try {
                    if (m87Var.o > 1073741823) {
                        m87Var.l(8);
                    }
                    if (m87Var.X) {
                        throw new ConnectionShutdownException();
                    }
                    i = m87Var.o;
                    m87Var.o = i + 2;
                    t87Var = new t87(i, m87Var, z3, false, null);
                    z = !z2 || m87Var.D0 >= m87Var.E0 || t87Var.c >= t87Var.d;
                    if (t87Var.i()) {
                        m87Var.b.put(Integer.valueOf(i), t87Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m87Var.G0.w(i, arrayList, z3);
        }
        if (z) {
            m87Var.G0.flush();
        }
        this.a = t87Var;
        if (this.c) {
            this.a.e(9);
            throw new IOException("Canceled");
        }
        s87 s87Var = this.a.i;
        long j = this.e.d;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        s87Var.g(j, timeUnit);
        this.a.j.g(this.e.e, timeUnit);
    }

    @Override // defpackage.fj5
    public final void h() {
        this.f.flush();
    }
}
