package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.work.WorkRequest;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.android.externcalls.sdk.signaling.SignalingTransportBuilder;
import ru.ok.android.externcalls.sdk.stat.negotiation.NegotiationErrorStat;

/* loaded from: classes2.dex */
public abstract class q0f implements oze {
    public static final int CLOSE_SOCKET_CODE_DISPOSE = 1001;
    public static final int CLOSE_SOCKET_CODE_TIMEOUT = 4000;
    public static final o0f Companion = new o0f();
    public static final int MSG_PING_FROM_SERVER_TIMEOUT = 2;
    public static final int MSG_RECONNECT = 1;
    public static final int MSG_REQUEST_FALLBACK = 3;
    public static final String PING = "ping";
    public static final String PONG = "pong";
    public static final long RECONNECT_DELAY_MILLIS = 2000;
    public static final long SERVER_PING_TIMEOUT_MAX = 61000;
    public static final long SERVER_PING_TIMEOUT_MIN = 11000;
    public static final String URL_TYPE_RETRY = "retry";
    public long a;
    public final Runnable b;
    public final m0f c;
    public final ExecutorService d;
    public final y6d e;
    public long f;
    public final boolean g;
    public final ag5 h;
    public final boolean i;
    public final l0f j;
    public final Handler k;
    public boolean m;
    public volatile String n;
    public volatile long p;
    public nze q;
    public final b0f s;
    public volatile r0f u;
    public final Object l = new Object();
    public volatile long o = SystemClock.elapsedRealtime();
    public volatile s9i r = new s9i(null, null);
    public final Object t = new Object();

    public q0f(String str, long j, Runnable runnable, m0f m0fVar, ExecutorService executorService, y6d y6dVar, z6d z6dVar, long j2, boolean z, ag5 ag5Var, boolean z2, l0f l0fVar) {
        String strA;
        this.a = j;
        this.b = runnable;
        this.c = m0fVar;
        this.d = executorService;
        this.e = y6dVar;
        this.f = j2;
        this.g = z;
        this.h = ag5Var;
        this.i = z2;
        this.j = l0fVar;
        this.s = new b0f(y6dVar, z6dVar, str);
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            throw new IllegalStateException("Looper thread is required to create signaling transport");
        }
        if (z2) {
            strA = kaj.a(ag5Var);
        } else {
            Companion.getClass();
            strA = o0f.a(ag5Var);
        }
        this.n = strA;
        this.k = new Handler(looperMyLooper, new dn3(8, this));
    }

    public static final boolean a(q0f q0fVar, Message message) {
        q0fVar.a(message);
        return true;
    }

    public static final void access$handleSocketFailure(q0f q0fVar, boolean z, Throwable th) {
        b0f b0fVar = q0fVar.s;
        b0fVar.b.logException(b0fVar.a, "handleWebSocketFailure", th);
        q0fVar.c.onFailedByException(q0fVar.j, th);
        q0fVar.a(z);
    }

    public static final void access$handleSocketMessage(q0f q0fVar, String str) {
        String strA;
        String strOptString;
        b0f b0fVar = q0fVar.s;
        String str2 = b0fVar.a;
        y6d y6dVar = b0fVar.b;
        if (b0fVar.c.shouldHideSensitiveInformation()) {
            a9h.o(" <- ", qaj.b(str), y6dVar, str2);
        } else {
            a9h.o(" <- ", str, y6dVar, str2);
        }
        q0fVar.c.onMessageReceived(q0fVar.j);
        if (q0fVar.f > 0) {
            q0fVar.k.removeMessages(2);
            synchronized (q0fVar.t) {
                q0fVar.safelyDoIfSocketExists(new m9i(q0fVar, 1));
            }
        }
        if (fni.a(str, PING)) {
            synchronized (q0fVar.t) {
                if (q0fVar.safelySendSocketMessage(PONG)) {
                    q0fVar.s.b(PONG);
                    q0fVar.o = SystemClock.elapsedRealtime();
                }
            }
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString2 = jSONObject.optString("type", null);
            String strOptString3 = jSONObject.optString(NegotiationErrorStat.KEY_ERROR, null);
            if (NegotiationErrorStat.KEY_ERROR.equals(strOptString2) && "conversation-ended".equals(strOptString3)) {
                q0fVar.dispose();
            }
            long jOptLong = jSONObject.optLong("stamp", 0L);
            if (jOptLong > 0) {
                synchronized (q0fVar.t) {
                    q0fVar.p = Math.max(jOptLong, q0fVar.p);
                }
            }
            nze nzeVar = q0fVar.q;
            if (nzeVar != null) {
                ((pze) ((zkb) nzeVar).b).f(jSONObject);
            }
            String strOptString4 = jSONObject.optString("notification", null);
            if ("notification".equals(strOptString2) && "connection".equals(strOptString4)) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(ApiProtocol.PARAM_PEER_ID);
                Long lI = (jSONObjectOptJSONObject == null || (strOptString = jSONObjectOptJSONObject.optString("id", null)) == null) ? null : cnf.i(strOptString);
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("conversation");
                String strOptString5 = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("id", null) : null;
                if (strOptString5 == null || lI == null) {
                    return;
                }
                synchronized (q0fVar.t) {
                    try {
                        q0fVar.r = new s9i(strOptString5, lI);
                        ag5 ag5VarA = ag5.a(q0fVar.h, strOptString5, lI);
                        if (q0fVar.i) {
                            strA = kaj.a(ag5VarA);
                        } else {
                            Companion.getClass();
                            strA = o0f.a(ag5VarA);
                        }
                        q0fVar.n = strA;
                    } finally {
                    }
                }
            }
        } catch (JSONException e) {
            b0f b0fVar2 = q0fVar.s;
            b0fVar2.b.reportException(b0fVar2.a, "ws.signaling.json", e);
        } catch (Throwable th) {
            b0f b0fVar3 = q0fVar.s;
            b0fVar3.b.reportException(b0fVar3.a, "ws.signaling.unexpected_throwable", th);
        }
    }

    public static final void access$handleSocketOpen(q0f q0fVar) {
        q0fVar.s.a("handleWebSocketOpen");
        q0fVar.c.onConnected(q0fVar.j);
        nze nzeVar = q0fVar.q;
        if (nzeVar != null) {
            zkb zkbVar = (zkb) nzeVar;
            synchronized (((pze) zkbVar.b).f) {
                try {
                    pze pzeVar = (pze) zkbVar.b;
                    if (pzeVar.r) {
                        pzeVar.u = pzeVar.t;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pze pzeVar2 = (pze) zkbVar.b;
            pzeVar2.c.post(new ui(12, pzeVar2, true));
        }
    }

    public static final void b(q0f q0fVar, String str) {
        synchronized (q0fVar.t) {
            try {
                if (q0fVar.safelySendSocketMessage(str)) {
                    q0fVar.s.b(str);
                } else {
                    q0fVar.s.a("Socket is absent, waiting?");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final String createEndpointUrl(ag5 ag5Var) {
        Companion.getClass();
        return o0f.a(ag5Var);
    }

    public static final String replaceOrAppendQueryParam(String str, String str2, String str3) {
        Companion.getClass();
        return o0f.b(str, str2, str3);
    }

    @Override // defpackage.oze
    public void dispose() {
        this.s.a("transport.dispose");
        synchronized (this.l) {
            if (this.m) {
                return;
            }
            this.m = true;
            this.k.removeCallbacksAndMessages(null);
            this.d.execute(new thg(6, this));
        }
    }

    public final y6d getLog() {
        return this.e;
    }

    public final b0f getSignalingLogger() {
        return this.s;
    }

    public final Object getSocketLock() {
        return this.t;
    }

    public final void init() {
        a("init", true);
    }

    public boolean isFallbackSupported() {
        return false;
    }

    @Override // defpackage.oze
    public void registerListener(nze nzeVar) {
        this.q = nzeVar;
    }

    @Override // defpackage.oze
    public void restart(String str) {
        if (str == null) {
            return;
        }
        this.c.onRestart(this.j);
        this.d.execute(new n0f(this, 1, str));
    }

    public abstract boolean safelyCloseSocketWithCodeAndReason(int i, String str);

    public abstract void safelyCreateNewSocket(String str, p0f p0fVar);

    public abstract void safelyDoIfSocketExists(em6 em6Var);

    public abstract void safelyResetSocketReference();

    public abstract boolean safelySendSocketMessage(String str);

    @Override // defpackage.oze
    public void send(String str) {
        if (str == null) {
            return;
        }
        this.d.execute(new n0f(this, 0, str));
    }

    public void setListener(r0f r0fVar) {
        this.u = r0fVar;
    }

    @Override // defpackage.oze
    public void updateActivityTimeout(long j) {
        this.a = Math.max(Math.max(j / 2, j - 60000), WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
        if (this.f > 0) {
            this.f = Math.max(Math.min(j / 4, SERVER_PING_TIMEOUT_MAX), SERVER_PING_TIMEOUT_MIN);
        }
        b0f b0fVar = this.s;
        long j2 = this.a;
        long j3 = this.f;
        StringBuilder sbL = az1.l(j2, "updateTimeoutMS timeoutMS=", " serverPingTimeoutMs=");
        sbL.append(j3);
        b0fVar.a(sbL.toString());
    }

    public static final void a(q0f q0fVar, String str) {
        String str2 = q0fVar.n;
        Companion.getClass();
        String strB = o0f.b(o0f.b(str2, ApiProtocol.KEY_TOKEN, str), "tgt", URL_TYPE_RETRY);
        if (q0fVar.g) {
            long j = q0fVar.p;
            if (j > 0) {
                strB = o0f.b(strB, "recoverTs", String.valueOf(j));
            }
        }
        q0fVar.s.a("transport.restart");
        synchronized (q0fVar.t) {
            q0fVar.n = strB;
        }
        synchronized (q0fVar.l) {
            q0fVar.m = false;
            q0fVar.a("restart", false);
        }
    }

    public final void b() {
        this.s.a("reconnect requested");
        this.d.execute(new bee(8, this));
    }

    public final boolean b(boolean z) {
        if (!z) {
            this.s.a("not an initial connection, avoid fallback in this case");
            return false;
        }
        if (!isFallbackSupported()) {
            this.s.a("fallback is not supported for this kind of transport");
            return false;
        }
        r0f r0fVar = this.u;
        if (r0fVar == null) {
            this.s.a("no fallback request listener provided, will not request fallback");
            return false;
        }
        this.k.removeMessages(3);
        Handler handler = this.k;
        s9i s9iVar = this.r;
        handler.sendMessage(handler.obtainMessage(3, new w8i(r0fVar, new s9i(s9iVar.b, s9iVar.a))));
        this.s.a("fallback to another instance request submitted");
        return true;
    }

    public static final void a(q0f q0fVar) {
        String strB = q0fVar.n;
        if (q0fVar.g) {
            o0f o0fVar = Companion;
            long j = q0fVar.p;
            if (j <= 0) {
                o0fVar.getClass();
            } else {
                String strValueOf = String.valueOf(j);
                o0fVar.getClass();
                strB = o0f.b(strB, "recoverTs", strValueOf);
            }
        }
        q0fVar.s.a("transport.reconnect");
        synchronized (q0fVar.t) {
            q0fVar.n = strB;
        }
        synchronized (q0fVar.l) {
            q0fVar.m = false;
            q0fVar.a("reconnect", false);
        }
    }

    public final void a(String str, boolean z) {
        this.s.a("connect, " + str);
        if (this.f > 0) {
            this.k.removeMessages(2);
        }
        synchronized (this.l) {
            if (this.m) {
                this.s.a("cant connect because released");
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.o;
            if (j != 0 && jElapsedRealtime - j > this.a) {
                this.c.onTimeout(this.j);
                this.s.a("not connecting, lastPongTime = " + j + " time = " + jElapsedRealtime);
                Runnable runnable = this.b;
                if (runnable != null) {
                    runnable.run();
                }
                dispose();
            } else {
                this.c.onConnect(this.j);
                this.d.execute(new jt(this, z));
            }
        }
    }

    public final void a(Message message) {
        int i = message.what;
        if (i == 1) {
            b();
            return;
        }
        if (i == 2) {
            a();
            return;
        }
        if (i == 3) {
            Object obj = message.obj;
            w8i w8iVar = obj instanceof w8i ? (w8i) obj : null;
            if (w8iVar == null) {
                return;
            }
            r0f r0fVar = w8iVar.a;
            s9i s9iVar = w8iVar.b;
            s0f s0fVar = new s0f(true, s9iVar.b, s9iVar.a);
            cb6 cb6Var = (cb6) ((zkb) r0fVar).b;
            ReentrantLock reentrantLock = (ReentrantLock) cb6Var.f;
            reentrantLock.lock();
            try {
                if (this != ((oze) cb6Var.c)) {
                    reentrantLock.unlock();
                    return;
                }
                setListener(null);
                dispose();
                oze ozeVarBuild = ((SignalingTransportBuilder) ((d92) cb6Var.a).b).build(s0fVar);
                nze nzeVar = (nze) cb6Var.d;
                if (nzeVar != null) {
                    ozeVarBuild.registerListener(nzeVar);
                }
                Long l = (Long) cb6Var.e;
                if (l != null) {
                    ozeVarBuild.updateActivityTimeout(l.longValue());
                }
                q0f q0fVar = ozeVarBuild instanceof q0f ? (q0f) ozeVarBuild : null;
                if (q0fVar != null) {
                    q0fVar.setListener((zkb) cb6Var.b);
                }
                cb6Var.c = ozeVarBuild;
                reentrantLock.unlock();
                return;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        }
        throw new RuntimeException(ho7.f(message.what, "unhandled message "));
    }

    public final void a() {
        boolean zSafelyCloseSocketWithCodeAndReason;
        this.s.a("handleServerPingTimeout, timeout=" + this.f);
        synchronized (this.t) {
            zSafelyCloseSocketWithCodeAndReason = safelyCloseSocketWithCodeAndReason(CLOSE_SOCKET_CODE_TIMEOUT, "dispose");
        }
        if (zSafelyCloseSocketWithCodeAndReason) {
            this.c.onFailedByPings(this.j);
        }
        a(false);
    }

    public final void a(boolean z) {
        pze pzeVar;
        boolean z2;
        this.s.a("handleDisconnected");
        if (this.f > 0) {
            this.k.removeMessages(2);
        }
        synchronized (this.t) {
            safelyResetSocketReference();
        }
        synchronized (this.l) {
            if (!this.m && !b(z)) {
                this.s.a("submit request to reconnect in 2000 ms");
                this.k.removeMessages(1);
                this.k.sendEmptyMessageDelayed(1, 2000L);
            }
        }
        nze nzeVar = this.q;
        if (nzeVar != null) {
            zkb zkbVar = (zkb) nzeVar;
            synchronized (((pze) zkbVar.b).f) {
                pzeVar = (pze) zkbVar.b;
                z2 = false;
                pzeVar.s = false;
            }
            pzeVar.c.post(new ui(12, pzeVar, z2));
        }
    }

    public final void a(String str) {
        this.s.a("handleWebSocketClosed, reason=" + str);
        a(false);
    }
}
