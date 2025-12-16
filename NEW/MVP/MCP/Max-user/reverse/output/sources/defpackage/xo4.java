package defpackage;

import android.net.TrafficStats;
import java.net.Socket;
import java.net.SocketException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public final class xo4 implements cb3 {
    public final uda a;
    public final AtomicBoolean b = new AtomicBoolean();
    public final LinkedHashMap c;
    public final LinkedHashSet d;
    public final qs3 e;
    public final j0e f;
    public final c9f g;
    public volatile Iterator h;
    public volatile ypc i;
    public final nr3 j;
    public yq3 k;

    public xo4(uda udaVar, c9f c9fVar, kk4 kk4Var, qs3 qs3Var, j0e j0eVar) {
        new AtomicBoolean();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashSet();
        this.k = new yq3(false);
        this.a = udaVar;
        this.e = qs3Var;
        this.f = j0eVar;
        this.g = c9fVar;
        this.j = new nr3("api.oneme.ru", "443", true);
    }

    @Override // defpackage.cb3
    public final qs3 b() {
        return this.e;
    }

    @Override // defpackage.cb3
    public final void c(Socket socket) throws SocketException {
        if (socket != null) {
            TrafficStats.untagSocket(socket);
        }
    }

    @Override // defpackage.cb3
    public final void close() {
        wqi.c("xo4", "close request", new Object[0]);
        l(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x016f, code lost:
    
        throw r0;
     */
    @Override // defpackage.cb3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.Socket connect() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 424
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xo4.connect():java.net.Socket");
    }

    @Override // defpackage.cb3
    public final int d() {
        if (this.i != null) {
            return this.i.f.b();
        }
        return -1;
    }

    @Override // defpackage.cb3
    public final boolean e() {
        return true;
    }

    @Override // defpackage.cb3
    public final void g(boolean z) {
        this.b.set(z);
    }

    @Override // defpackage.cb3
    public final long h(int i) {
        return fj0.p(i, this.a.a.d());
    }

    @Override // defpackage.cb3
    public final String i() {
        return this.i != null ? this.i.f.a : "unresolved";
    }

    @Override // defpackage.cb3
    public final yq3 k() {
        return this.k;
    }

    public final void l(ypc ypcVar) {
        wqi.c("xo4", "cancel tasks".concat(ypcVar != null ? wy1.h(", except ", ypcVar.f.toString()) : ""), new Object[0]);
        synchronized (this.d) {
            try {
                for (Map.Entry entry : this.c.entrySet()) {
                    if (ypcVar == null) {
                        ((Future) entry.getValue()).cancel(true);
                    } else if (!((nr3) entry.getKey()).equals(ypcVar.f)) {
                        ((Future) entry.getValue()).cancel(true);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final ypc m() {
        ypc ypcVar;
        ypc ypcVar2;
        Iterator it = this.c.values().iterator();
        while (true) {
            ypcVar = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                ypcVar2 = (ypc) ((Future) it.next()).get();
            } catch (CancellationException e) {
                wqi.c("xo4", "skip cancelled task, error: " + e.toString(), new Object[0]);
            } catch (Exception e2) {
                wqi.e("xo4", "execution error: " + e2.toString(), null);
                wqi.c("xo4", "connection error", new Object[0]);
            }
            if (ypcVar2 != null && ypcVar2.d != null) {
                ypcVar = ypcVar2;
                break;
            }
        }
        synchronized (this.d) {
            this.c.clear();
        }
        return ypcVar;
    }

    public final void n(nr3 nr3Var, int i, int i2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        wqi.c("xo4", "schedule connection: delay = %d host = %s", Integer.valueOf(i2), nr3Var.toString());
        ypc ypcVar = new ypc(this.a, nr3Var, this.g, this.e, i);
        wk3 wk3Var = new wk3(2, new wo4(this, 0, ypcVar));
        j0e j0eVar = this.f;
        hs8 hs8Var = new hs8(new k2f(wk3Var.m(j0eVar), new wo4(1, this), 1), 4, new gk0(this, ypcVar));
        tta ttaVarR = vqa.r(i2, timeUnit, j0eVar);
        tn6 tn6Var = new tn6();
        try {
            ttaVarR.a(new j2f(tn6Var, hs8Var));
            this.c.put(nr3Var, tn6Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            raj.c(th);
            NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:4:0x000c, B:6:0x0020, B:12:0x002f, B:14:0x0037, B:20:0x0046, B:22:0x004c, B:25:0x0053, B:28:0x0062, B:31:0x006b, B:33:0x0092, B:35:0x009d, B:36:0x00a2, B:38:0x00b1, B:40:0x00b7, B:41:0x00bc, B:42:0x00e2, B:19:0x0041, B:11:0x002a), top: B:47:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:4:0x000c, B:6:0x0020, B:12:0x002f, B:14:0x0037, B:20:0x0046, B:22:0x004c, B:25:0x0053, B:28:0x0062, B:31:0x006b, B:33:0x0092, B:35:0x009d, B:36:0x00a2, B:38:0x00b1, B:40:0x00b7, B:41:0x00bc, B:42:0x00e2, B:19:0x0041, B:11:0x002a), top: B:47:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o() {
        /*
            r8 = this;
            java.lang.String r0 = "hosts updated: "
            java.lang.String r1 = "xo4"
            java.lang.String r2 = "update hosts"
            defpackage.wqi.d(r1, r2)
            java.util.LinkedHashSet r1 = r8.d
            monitor-enter(r1)
            java.util.LinkedHashSet r2 = r8.d     // Catch: java.lang.Throwable -> L68
            r2.clear()     // Catch: java.lang.Throwable -> L68
            uda r2 = r8.a     // Catch: java.lang.Throwable -> L68
            z7c r3 = r2.b     // Catch: java.lang.Throwable -> L68
            j98 r2 = r2.d     // Catch: java.lang.Throwable -> L68
            pe8 r4 = r3.a     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = r4.I()     // Catch: java.lang.Throwable -> L68
            r5 = 0
            if (r4 == 0) goto L2a
            int r6 = r4.length()     // Catch: java.lang.Throwable -> L68
            if (r6 <= 0) goto L27
            goto L28
        L27:
            r4 = r5
        L28:
            if (r4 != 0) goto L2f
        L2a:
            r2.getClass()     // Catch: java.lang.Throwable -> L68
            java.lang.String r4 = "api.oneme.ru"
        L2f:
            pe8 r6 = r3.a     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = r6.J()     // Catch: java.lang.Throwable -> L68
            if (r6 == 0) goto L41
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L68
            if (r7 <= 0) goto L3e
            goto L3f
        L3e:
            r6 = r5
        L3f:
            if (r6 != 0) goto L46
        L41:
            r2.getClass()     // Catch: java.lang.Throwable -> L68
            java.lang.String r6 = "443"
        L46:
            boolean r2 = defpackage.b7j.d(r4)     // Catch: java.lang.Throwable -> L68
            if (r2 != 0) goto L5f
            boolean r2 = defpackage.b7j.d(r6)     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto L53
            goto L5f
        L53:
            nr3 r2 = new nr3     // Catch: java.lang.Throwable -> L68
            pe8 r3 = r3.a     // Catch: java.lang.Throwable -> L68
            boolean r3 = r3.L()     // Catch: java.lang.Throwable -> L68
            r2.<init>(r4, r6, r3)     // Catch: java.lang.Throwable -> L68
            goto L60
        L5f:
            r2 = r5
        L60:
            if (r2 == 0) goto L6b
            java.util.LinkedHashSet r3 = r8.d     // Catch: java.lang.Throwable -> L68
            r3.add(r2)     // Catch: java.lang.Throwable -> L68
            goto L6b
        L68:
            r0 = move-exception
            goto Le4
        L6b:
            uda r2 = r8.a     // Catch: java.lang.Throwable -> L68
            lv4 r2 = r2.a     // Catch: java.lang.Throwable -> L68
            r2.e()     // Catch: java.lang.Throwable -> L68
            java.util.LinkedHashSet r2 = r8.d     // Catch: java.lang.Throwable -> L68
            nr3 r3 = r8.j     // Catch: java.lang.Throwable -> L68
            r2.add(r3)     // Catch: java.lang.Throwable -> L68
            uda r2 = r8.a     // Catch: java.lang.Throwable -> L68
            z7c r2 = r2.b     // Catch: java.lang.Throwable -> L68
            pe8 r2 = r2.a     // Catch: java.lang.Throwable -> L68
            fde r3 = r2.q     // Catch: java.lang.Throwable -> L68
            yy7[] r4 = defpackage.w4e.m0     // Catch: java.lang.Throwable -> L68
            r6 = 5
            r4 = r4[r6]     // Catch: java.lang.Throwable -> L68
            java.lang.Object r2 = r3.D(r2, r4)     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L68
            boolean r3 = defpackage.b7j.d(r2)     // Catch: java.lang.Throwable -> L68
            if (r3 != 0) goto L9b
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L68 org.json.JSONException -> L9b
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L68 org.json.JSONException -> L9b
            nr3 r5 = defpackage.nr3.a(r3)     // Catch: java.lang.Throwable -> L68 org.json.JSONException -> L9b
        L9b:
            if (r5 == 0) goto La2
            java.util.LinkedHashSet r2 = r8.d     // Catch: java.lang.Throwable -> L68
            r2.add(r5)     // Catch: java.lang.Throwable -> L68
        La2:
            uda r2 = r8.a     // Catch: java.lang.Throwable -> L68
            java.util.LinkedHashSet r3 = r8.d     // Catch: java.lang.Throwable -> L68
            defpackage.b7j.a(r2, r3)     // Catch: java.lang.Throwable -> L68
            uda r2 = r8.a     // Catch: java.lang.Throwable -> L68
            java.util.List r2 = defpackage.b7j.b(r2)     // Catch: java.lang.Throwable -> L68
            if (r2 == 0) goto Lbc
            boolean r3 = r2.isEmpty()     // Catch: java.lang.Throwable -> L68
            if (r3 != 0) goto Lbc
            java.util.LinkedHashSet r3 = r8.d     // Catch: java.lang.Throwable -> L68
            r3.addAll(r2)     // Catch: java.lang.Throwable -> L68
        Lbc:
            java.util.LinkedHashSet r2 = r8.d     // Catch: java.lang.Throwable -> L68
            nr3 r3 = r8.j     // Catch: java.lang.Throwable -> L68
            r2.add(r3)     // Catch: java.lang.Throwable -> L68
            java.util.LinkedHashSet r2 = r8.d     // Catch: java.lang.Throwable -> L68
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L68
            r8.h = r2     // Catch: java.lang.Throwable -> L68
            java.lang.String r2 = "xo4"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L68
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L68
            java.util.LinkedHashSet r0 = r8.d     // Catch: java.lang.Throwable -> L68
            int r0 = r0.size()     // Catch: java.lang.Throwable -> L68
            r3.append(r0)     // Catch: java.lang.Throwable -> L68
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L68
            defpackage.wqi.d(r2, r0)     // Catch: java.lang.Throwable -> L68
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
            return
        Le4:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L68
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xo4.o():void");
    }
}
