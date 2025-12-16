package defpackage;

import android.util.ArrayMap;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import one.me.sdk.net.client.api.AddressUnreachableException;

/* loaded from: classes2.dex */
public final class nk4 extends fj0 {
    public final cz4 j;
    public final zp7 k;
    public volatile List l;
    public int m;
    public final AtomicBoolean n;

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:8:0x002d, B:10:0x0040, B:16:0x004f, B:18:0x0057, B:24:0x0066, B:26:0x006c, B:29:0x0073, B:31:0x0080, B:34:0x0097, B:36:0x00b8, B:44:0x00db, B:37:0x00bd, B:38:0x00c6, B:40:0x00cc, B:42:0x00d6, B:23:0x0061, B:15:0x004a), top: B:49:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061 A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:8:0x002d, B:10:0x0040, B:16:0x004f, B:18:0x0057, B:24:0x0066, B:26:0x006c, B:29:0x0073, B:31:0x0080, B:34:0x0097, B:36:0x00b8, B:44:0x00db, B:37:0x00bd, B:38:0x00c6, B:40:0x00cc, B:42:0x00d6, B:23:0x0061, B:15:0x004a), top: B:49:0x002d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nk4(defpackage.uda r4, defpackage.c9f r5, defpackage.cz4 r6, defpackage.qs3 r7, defpackage.j0e r8) {
        /*
            r3 = this;
            java.lang.String r8 = "api.oneme.ru"
            java.lang.String r0 = "443"
            nr3 r1 = new nr3
            r2 = 1
            r1.<init>(r8, r0, r2)
            r3.<init>(r4, r1, r5, r7)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r3.l = r4
            r4 = 0
            r3.m = r4
            java.util.concurrent.atomic.AtomicBoolean r7 = new java.util.concurrent.atomic.AtomicBoolean
            r7.<init>()
            r3.n = r7
            r3.j = r6
            r7 = 0
            if (r6 == 0) goto L29
            zp7 r6 = new zp7
            r6.<init>(r5)
            goto L2a
        L29:
            r6 = r7
        L2a:
            r3.k = r6
            monitor-enter(r3)
            java.util.List r5 = r3.l     // Catch: java.lang.Throwable -> L95
            r5.clear()     // Catch: java.lang.Throwable -> L95
            uda r5 = r3.a     // Catch: java.lang.Throwable -> L95
            z7c r6 = r5.b     // Catch: java.lang.Throwable -> L95
            j98 r5 = r5.d     // Catch: java.lang.Throwable -> L95
            pe8 r8 = r6.a     // Catch: java.lang.Throwable -> L95
            java.lang.String r8 = r8.I()     // Catch: java.lang.Throwable -> L95
            if (r8 == 0) goto L4a
            int r0 = r8.length()     // Catch: java.lang.Throwable -> L95
            if (r0 <= 0) goto L47
            goto L48
        L47:
            r8 = r7
        L48:
            if (r8 != 0) goto L4f
        L4a:
            r5.getClass()     // Catch: java.lang.Throwable -> L95
            java.lang.String r8 = "api.oneme.ru"
        L4f:
            pe8 r0 = r6.a     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = r0.J()     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L61
            int r1 = r0.length()     // Catch: java.lang.Throwable -> L95
            if (r1 <= 0) goto L5e
            goto L5f
        L5e:
            r0 = r7
        L5f:
            if (r0 != 0) goto L66
        L61:
            r5.getClass()     // Catch: java.lang.Throwable -> L95
            java.lang.String r0 = "443"
        L66:
            boolean r5 = defpackage.b7j.d(r8)     // Catch: java.lang.Throwable -> L95
            if (r5 != 0) goto L7e
            boolean r5 = defpackage.b7j.d(r0)     // Catch: java.lang.Throwable -> L95
            if (r5 == 0) goto L73
            goto L7e
        L73:
            nr3 r7 = new nr3     // Catch: java.lang.Throwable -> L95
            pe8 r5 = r6.a     // Catch: java.lang.Throwable -> L95
            boolean r5 = r5.L()     // Catch: java.lang.Throwable -> L95
            r7.<init>(r8, r0, r5)     // Catch: java.lang.Throwable -> L95
        L7e:
            if (r7 == 0) goto L97
            java.lang.String r5 = "nk4"
            java.lang.String r6 = "default host = %s"
            java.lang.String r8 = r7.toString()     // Catch: java.lang.Throwable -> L95
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Throwable -> L95
            defpackage.wqi.c(r5, r6, r8)     // Catch: java.lang.Throwable -> L95
            java.util.List r5 = r3.l     // Catch: java.lang.Throwable -> L95
            r5.add(r7)     // Catch: java.lang.Throwable -> L95
            goto L97
        L95:
            r4 = move-exception
            goto Le1
        L97:
            uda r5 = r3.a     // Catch: java.lang.Throwable -> L95
            lv4 r5 = r5.a     // Catch: java.lang.Throwable -> L95
            r5.e()     // Catch: java.lang.Throwable -> L95
            java.util.List r5 = r3.l     // Catch: java.lang.Throwable -> L95
            uda r6 = r3.a     // Catch: java.lang.Throwable -> L95
            java.util.List r6 = defpackage.b7j.b(r6)     // Catch: java.lang.Throwable -> L95
            r5.addAll(r6)     // Catch: java.lang.Throwable -> L95
            java.util.List r5 = r3.l     // Catch: java.lang.Throwable -> L95
            nr3 r6 = r3.f     // Catch: java.lang.Throwable -> L95
            r5.add(r6)     // Catch: java.lang.Throwable -> L95
            java.util.List r5 = r3.l     // Catch: java.lang.Throwable -> L95
            int r6 = r5.size()     // Catch: java.lang.Throwable -> L95
            if (r6 > r2) goto Lbd
            java.util.List r5 = java.util.Collections.unmodifiableList(r5)     // Catch: java.lang.Throwable -> L95
            goto Ldb
        Lbd:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L95
            r6.<init>()     // Catch: java.lang.Throwable -> L95
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L95
        Lc6:
            boolean r7 = r5.hasNext()     // Catch: java.lang.Throwable -> L95
            if (r7 == 0) goto Lda
            java.lang.Object r7 = r5.next()     // Catch: java.lang.Throwable -> L95
            boolean r8 = r6.contains(r7)     // Catch: java.lang.Throwable -> L95
            if (r8 != 0) goto Lc6
            r6.add(r7)     // Catch: java.lang.Throwable -> L95
            goto Lc6
        Lda:
            r5 = r6
        Ldb:
            r3.l = r5     // Catch: java.lang.Throwable -> L95
            r3.m = r4     // Catch: java.lang.Throwable -> L95
            monitor-exit(r3)
            return
        Le1:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L95
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk4.<init>(uda, c9f, cz4, qs3, j0e):void");
    }

    @Override // defpackage.cb3
    public final void close() {
    }

    @Override // defpackage.fj0, defpackage.cb3
    public final Socket connect() throws Exception {
        try {
            Socket socketConnect = super.connect();
            this.m = 0;
            return socketConnect;
        } catch (Exception e) {
            synchronized (this) {
                this.m = (this.m + 1) % this.l.size();
                throw e;
            }
        }
    }

    @Override // defpackage.cb3
    public final int d() {
        return r().b();
    }

    @Override // defpackage.cb3
    public final void g(boolean z) {
        this.n.set(z);
    }

    @Override // defpackage.cb3
    public final String i() {
        return r().a;
    }

    @Override // defpackage.cb3
    public final int j() {
        return 15000;
    }

    @Override // defpackage.fj0
    public final void l(Socket socket, String str, int i, int i2) throws IOException {
        boolean z;
        InetAddress[] inetAddressArr;
        v32 v32Var;
        ReentrantLock reentrantLock;
        Object next;
        cz4 cz4Var = this.j;
        if (cz4Var == null) {
            super.l(socket, str, i, i2);
            return;
        }
        lg8 lg8Var = lg8.d;
        String str2 = cz4Var.b;
        l6b l6bVar = wqi.a;
        if (l6bVar != null && l6bVar.b(lg8Var)) {
            l6bVar.c(lg8Var, str2, ho7.i("resolve, host=", str, " ..."), null);
        }
        cz4Var.c.lock();
        try {
            v67 v67Var = (v67) cz4Var.d.get(str);
            if (v67Var != null) {
                z = v67Var.d;
                v67Var.d = false;
            } else {
                z = true;
            }
            v32 v32VarE = z ? cz4Var.e(str) : null;
            cz4Var.c.lock();
            if (v32VarE != null) {
                try {
                    inetAddressArr = (InetAddress[]) v32VarE.c;
                } finally {
                }
            } else {
                inetAddressArr = null;
            }
            v67 v67VarF = cz4Var.f(str, inetAddressArr);
            ss7 ss7Var = v67VarF != null ? (ss7) ue3.I(v67VarF.c) : null;
            if (ss7Var == null && !z) {
                String str3 = cz4Var.b;
                l6b l6bVar2 = wqi.a;
                if (l6bVar2 != null) {
                    lg8 lg8Var2 = lg8.X;
                    if (l6bVar2.b(lg8Var2)) {
                        l6bVar2.c(lg8Var2, str3, ho7.i("resolve, ip not found for ", str, ", refresh cache ..."), null);
                    }
                }
                v32 v32VarE2 = cz4Var.e(str);
                if (v32VarE2 != null) {
                    reentrantLock = cz4Var.c;
                    reentrantLock.lock();
                    try {
                        v67 v67VarF2 = cz4Var.f(str, (InetAddress[]) v32VarE2.c);
                        ss7 ss7Var2 = v67VarF2 != null ? (ss7) ue3.I(v67VarF2.c) : null;
                        reentrantLock.unlock();
                        v32VarE = v32VarE2;
                        ss7Var = ss7Var2;
                    } finally {
                    }
                } else {
                    ss7Var = null;
                }
            }
            if (ss7Var == null) {
                reentrantLock = cz4Var.c;
                reentrantLock.lock();
                try {
                    v67 v67Var2 = (v67) cz4Var.d.get(str);
                    if (v67Var2 != null) {
                        v67Var2.d = true;
                    }
                    reentrantLock.unlock();
                    v32Var = null;
                } finally {
                }
            } else {
                InetAddress[] inetAddressArr2 = {ss7Var.a};
                long j = v32VarE != null ? v32VarE.b : 0L;
                v32 v32Var2 = new v32(inetAddressArr2, j);
                String str4 = cz4Var.b;
                l6b l6bVar3 = wqi.a;
                if (l6bVar3 != null && l6bVar3.b(lg8Var)) {
                    StringBuilder sb = new StringBuilder("resolve, ");
                    sb.append(str);
                    sb.append(" -> ");
                    sb.append(ss7Var);
                    sb.append("/");
                    l6bVar3.c(lg8Var, str4, ho7.k(sb, j, "ms"), null);
                }
                v32Var = v32Var2;
            }
            if (v32Var != null) {
                yq3 yq3Var = this.g;
                long j2 = v32Var.b;
                yq3Var.getClass();
                yq3Var.d = Math.max(j2, 0L);
                this.j.b(str, ((InetAddress[]) v32Var.c)[0]);
                try {
                    m(socket, str, ((InetAddress[]) v32Var.c)[0], i, i2);
                    this.j.a(str, ((InetAddress[]) v32Var.c)[0], true);
                    return;
                } catch (Throwable th) {
                    this.j.a(str, ((InetAddress[]) v32Var.c)[0], false);
                    throw th;
                }
            }
            super.l(socket, str, i, i2);
            InetAddress inetAddress = socket.getInetAddress();
            if (inetAddress != null) {
                cz4 cz4Var2 = this.j;
                String str5 = cz4Var2.b;
                l6b l6bVar4 = wqi.a;
                if (l6bVar4 != null && l6bVar4.b(lg8Var)) {
                    l6bVar4.c(lg8Var, str5, "addInetAddress, host=" + str + ", address=" + inetAddress, null);
                }
                reentrantLock = cz4Var2.c;
                reentrantLock.lock();
                try {
                    ArrayMap arrayMap = cz4Var2.d;
                    Object v67Var3 = arrayMap.get(str);
                    if (v67Var3 == null) {
                        v67Var3 = new v67(str);
                        arrayMap.put(str, v67Var3);
                    }
                    ArrayList arrayList = ((v67) v67Var3).c;
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (((ss7) next).a.equals(inetAddress)) {
                                break;
                            }
                        }
                    }
                    ss7 ss7Var3 = (ss7) next;
                    if (ss7Var3 == null) {
                        ss7Var3 = new ss7(inetAddress);
                        arrayList.add(ss7Var3);
                    }
                    reentrantLock.unlock();
                    String str6 = cz4Var2.b;
                    l6b l6bVar5 = wqi.a;
                    if (l6bVar5 != null && l6bVar5.b(lg8Var)) {
                        l6bVar5.c(lg8Var, str6, "addInetAddress, " + ss7Var3 + " added to cache", null);
                    }
                } finally {
                }
            }
        } finally {
        }
    }

    @Override // defpackage.fj0
    public final void m(Socket socket, String str, InetAddress inetAddress, int i, int i2) throws IOException {
        ss7 ss7Var;
        Object next;
        try {
            super.m(socket, str, inetAddress, i, i2);
        } catch (SocketTimeoutException e) {
            cz4 cz4Var = this.j;
            if (cz4Var == null) {
                throw e;
            }
            ReentrantLock reentrantLock = cz4Var.c;
            reentrantLock.lock();
            try {
                v67 v67Var = (v67) cz4Var.d.get(str);
                char c = 1;
                if (v67Var != null) {
                    Iterator it = v67Var.c.iterator();
                    while (true) {
                        ss7Var = null;
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        } else {
                            next = it.next();
                            if (((ss7) next).a.equals(inetAddress)) {
                                break;
                            }
                        }
                    }
                    ss7 ss7Var2 = (ss7) next;
                    if (ss7Var2 != null) {
                        if (ss7Var2.c > 0) {
                            if (ss7Var2.d == 0) {
                                ss7Var = ss7Var2;
                            }
                        }
                        if (ss7Var != null) {
                            c = 2;
                        }
                    }
                }
                if (c != 2) {
                    throw e;
                }
                throw new AddressUnreachableException(inetAddress, e);
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x0120 A[LOOP:0: B:3:0x0009->B:79:0x0120, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00b0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0050 A[SYNTHETIC] */
    @Override // defpackage.fj0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.net.Socket n(javax.net.SocketFactory r10, java.lang.String r11, int r12) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nk4.n(javax.net.SocketFactory, java.lang.String, int):java.net.Socket");
    }

    public final synchronized nr3 r() {
        return (nr3) this.l.get(this.m);
    }
}
