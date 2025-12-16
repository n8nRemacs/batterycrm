package com.yandex.mobile.ads.exo.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.drm.c;
import com.yandex.mobile.ads.exo.drm.e;
import com.yandex.mobile.ads.exo.drm.f;
import com.yandex.mobile.ads.exo.drm.m;
import com.yandex.mobile.ads.impl.Cif;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.fm;
import com.yandex.mobile.ads.impl.jt0;
import com.yandex.mobile.ads.impl.ka0;
import com.yandex.mobile.ads.impl.p80;
import com.yandex.mobile.ads.impl.p90;
import com.yandex.mobile.ads.impl.pc0;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.q90;
import com.yandex.mobile.ads.impl.tm;
import com.yandex.mobile.ads.impl.wl1;
import com.yandex.mobile.ads.impl.xg;
import j.B;
import j.P;
import j.X;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import v61.InterfaceC49174e;

@X
/* loaded from: classes8.dex */
final class b implements com.yandex.mobile.ads.exo.drm.e {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final List<DrmInitData.SchemeData> f382835a;

    /* renamed from: b, reason: collision with root package name */
    private final m f382836b;

    /* renamed from: c, reason: collision with root package name */
    private final a f382837c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC10968b f382838d;

    /* renamed from: e, reason: collision with root package name */
    private final int f382839e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f382840f;

    /* renamed from: g, reason: collision with root package name */
    private final boolean f382841g;

    /* renamed from: h, reason: collision with root package name */
    private final HashMap<String, String> f382842h;

    /* renamed from: i, reason: collision with root package name */
    private final fm<f.a> f382843i;

    /* renamed from: j, reason: collision with root package name */
    private final p90 f382844j;

    /* renamed from: k, reason: collision with root package name */
    private final jt0 f382845k;

    /* renamed from: l, reason: collision with root package name */
    final p f382846l;

    /* renamed from: m, reason: collision with root package name */
    final UUID f382847m;

    /* renamed from: n, reason: collision with root package name */
    final e f382848n;

    /* renamed from: o, reason: collision with root package name */
    private int f382849o;

    /* renamed from: p, reason: collision with root package name */
    private int f382850p;

    /* renamed from: q, reason: collision with root package name */
    @P
    private HandlerThread f382851q;

    /* renamed from: r, reason: collision with root package name */
    @P
    private c f382852r;

    /* renamed from: s, reason: collision with root package name */
    @P
    private tm f382853s;

    /* renamed from: t, reason: collision with root package name */
    @P
    private e.a f382854t;

    /* renamed from: u, reason: collision with root package name */
    @P
    private byte[] f382855u;

    /* renamed from: v, reason: collision with root package name */
    private byte[] f382856v;

    /* renamed from: w, reason: collision with root package name */
    @P
    private m.a f382857w;

    /* renamed from: x, reason: collision with root package name */
    @P
    private m.d f382858x;

    public interface a {
    }

    /* renamed from: com.yandex.mobile.ads.exo.drm.b$b, reason: collision with other inner class name */
    public interface InterfaceC10968b {
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        @B
        private boolean f382859a;

        public c(Looper looper) {
            super(looper);
        }

        public final synchronized void a() {
            removeCallbacksAndMessages(null);
            this.f382859a = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Exception excA;
            d dVar = (d) message.obj;
            try {
                int i12 = message.what;
                if (i12 == 0) {
                    excA = ((o) b.this.f382846l).a((m.d) dVar.f382863c);
                } else {
                    if (i12 != 1) {
                        throw new RuntimeException();
                    }
                    b bVar = b.this;
                    excA = ((o) bVar.f382846l).a(bVar.f382847m, (m.a) dVar.f382863c);
                }
            } catch (pc0 e12) {
                d dVar2 = (d) message.obj;
                if (dVar2.f382862b) {
                    int i13 = dVar2.f382864d + 1;
                    dVar2.f382864d = i13;
                    if (i13 <= b.this.f382844j.a(3)) {
                        SystemClock.elapsedRealtime();
                        SystemClock.elapsedRealtime();
                        long jA2 = b.this.f382844j.a(new p90.a(e12.getCause() instanceof IOException ? (IOException) e12.getCause() : new f(e12.getCause()), dVar2.f382864d));
                        if (jA2 != -9223372036854775807L) {
                            synchronized (this) {
                                try {
                                    if (!this.f382859a) {
                                        sendMessageDelayed(Message.obtain(message), jA2);
                                        return;
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
                excA = e12;
            } catch (Exception e13) {
                ka0.b("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e13);
                excA = e13;
            }
            p90 p90Var = b.this.f382844j;
            long j12 = dVar.f382861a;
            p90Var.getClass();
            synchronized (this) {
                try {
                    if (!this.f382859a) {
                        b.this.f382848n.obtainMessage(message.what, Pair.create(dVar.f382863c, excA)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f382861a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f382862b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f382863c;

        /* renamed from: d, reason: collision with root package name */
        public int f382864d;

        public d(long j12, boolean z12, long j13, Object obj) {
            this.f382861a = j12;
            this.f382862b = z12;
            this.f382863c = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) throws NumberFormatException {
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i12 = message.what;
            if (i12 == 0) {
                b.a(b.this, obj, obj2);
            } else {
                if (i12 != 1) {
                    return;
                }
                b.this.a(obj, obj2);
            }
        }
    }

    public static final class f extends IOException {
        public f(@P Throwable th2) {
            super(th2);
        }
    }

    public b(UUID uuid, m mVar, a aVar, InterfaceC10968b interfaceC10968b, @P List<DrmInitData.SchemeData> list, int i12, boolean z12, boolean z13, @P byte[] bArr, HashMap<String, String> map, p pVar, Looper looper, p90 p90Var, jt0 jt0Var) {
        if (i12 == 1 || i12 == 3) {
            db.a(bArr);
        }
        this.f382847m = uuid;
        this.f382837c = aVar;
        this.f382838d = interfaceC10968b;
        this.f382836b = mVar;
        this.f382839e = i12;
        this.f382840f = z12;
        this.f382841g = z13;
        if (bArr != null) {
            this.f382856v = bArr;
            this.f382835a = null;
        } else {
            this.f382835a = Collections.unmodifiableList((List) db.a(list));
        }
        this.f382842h = map;
        this.f382846l = pVar;
        this.f382843i = new fm<>();
        this.f382844j = p90Var;
        this.f382845k = jt0Var;
        this.f382849o = 2;
        this.f382848n = new e(looper);
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final int c() {
        return this.f382849o;
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final boolean d() {
        return this.f382840f;
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    @P
    public final Map<String, String> e() {
        byte[] bArr = this.f382855u;
        if (bArr == null) {
            return null;
        }
        return this.f382836b.a(bArr);
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final UUID f() {
        return this.f382847m;
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    @P
    public final e.a g() {
        if (this.f382849o == 1) {
            return this.f382854t;
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    @P
    public final tm h() {
        return this.f382853s;
    }

    public final void i() {
        m.d dVarA = this.f382836b.a();
        this.f382858x = dVarA;
        c cVar = this.f382852r;
        int i12 = pc1.f388768a;
        dVarA.getClass();
        cVar.getClass();
        cVar.obtainMessage(0, new d(q90.a(), true, SystemClock.elapsedRealtime(), dVarA)).sendToTarget();
    }

    public final boolean a(byte[] bArr) {
        return Arrays.equals(this.f382855u, bArr);
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final void b(@P f.a aVar) {
        int i12;
        if (this.f382850p < 0) {
            StringBuilder sbA = Cif.a("Session reference count less than zero: ");
            sbA.append(this.f382850p);
            ka0.b("DefaultDrmSession", sbA.toString());
            this.f382850p = 0;
        }
        if (aVar != null) {
            this.f382843i.a(aVar);
        }
        int i13 = this.f382850p + 1;
        this.f382850p = i13;
        if (i13 == 1) {
            db.b(this.f382849o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f382851q = handlerThread;
            handlerThread.start();
            this.f382852r = new c(this.f382851q.getLooper());
            if (b()) {
                a(true);
            }
        } else if (aVar != null && (((i12 = this.f382849o) == 3 || i12 == 4) && this.f382843i.b(aVar) == 1)) {
            aVar.a(this.f382849o);
        }
        c.g gVar = (c.g) this.f382838d;
        if (com.yandex.mobile.ads.exo.drm.c.this.f382876l != -9223372036854775807L) {
            com.yandex.mobile.ads.exo.drm.c.this.f382879o.remove(this);
            Handler handler = com.yandex.mobile.ads.exo.drm.c.this.f382885u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    public final void a() {
        if (b()) {
            a(true);
        }
    }

    public final void a(Exception exc, boolean z12) {
        a(z12 ? 1 : 3, exc);
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final boolean a(String str) {
        return this.f382836b.a(str, (byte[]) db.b(this.f382855u));
    }

    @Override // com.yandex.mobile.ads.exo.drm.e
    public final void a(@P f.a aVar) {
        int i12 = this.f382850p;
        if (i12 <= 0) {
            ka0.b("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i13 = i12 - 1;
        this.f382850p = i13;
        if (i13 == 0) {
            this.f382849o = 0;
            e eVar = this.f382848n;
            int i14 = pc1.f388768a;
            eVar.removeCallbacksAndMessages(null);
            this.f382852r.a();
            this.f382852r = null;
            this.f382851q.quit();
            this.f382851q = null;
            this.f382853s = null;
            this.f382854t = null;
            this.f382857w = null;
            this.f382858x = null;
            byte[] bArr = this.f382855u;
            if (bArr != null) {
                this.f382836b.b(bArr);
                this.f382855u = null;
            }
        }
        if (aVar != null) {
            this.f382843i.c(aVar);
            if (this.f382843i.b(aVar) == 0) {
                aVar.d();
            }
        }
        ((c.g) this.f382838d).a(this, this.f382850p);
    }

    @InterfaceC49174e
    private boolean b() throws NumberFormatException {
        int i12 = this.f382849o;
        if (i12 == 3 || i12 == 4) {
            return true;
        }
        try {
            byte[] bArrC = this.f382836b.c();
            this.f382855u = bArrC;
            this.f382836b.a(bArrC, this.f382845k);
            this.f382853s = this.f382836b.d(this.f382855u);
            this.f382849o = 3;
            Iterator<f.a> it = this.f382843i.a().iterator();
            while (it.hasNext()) {
                it.next().a(3);
            }
            this.f382855u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            ((c.f) this.f382837c).b(this);
            return false;
        } catch (Exception e12) {
            a(1, e12);
            return false;
        }
    }

    public static void a(b bVar, Object obj, Object obj2) {
        if (obj == bVar.f382858x) {
            int i12 = bVar.f382849o;
            if (i12 == 2 || i12 == 3 || i12 == 4) {
                bVar.f382858x = null;
                if (obj2 instanceof Exception) {
                    ((c.f) bVar.f382837c).a((Exception) obj2, false);
                    return;
                }
                try {
                    bVar.f382836b.c((byte[]) obj2);
                    ((c.f) bVar.f382837c).a();
                } catch (Exception e12) {
                    ((c.f) bVar.f382837c).a(e12, true);
                }
            }
        }
    }

    @v61.m
    private void a(boolean z12) throws NumberFormatException {
        long jMin;
        if (this.f382841g) {
            return;
        }
        byte[] bArr = this.f382855u;
        int i12 = pc1.f388768a;
        int i13 = this.f382839e;
        if (i13 != 0 && i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    return;
                }
                this.f382856v.getClass();
                this.f382855u.getClass();
                a(this.f382856v, 3, z12);
                return;
            }
            byte[] bArr2 = this.f382856v;
            if (bArr2 != null) {
                try {
                    this.f382836b.a(bArr, bArr2);
                } catch (Exception e12) {
                    a(1, e12);
                    return;
                }
            }
            a(bArr, 2, z12);
            return;
        }
        byte[] bArr3 = this.f382856v;
        if (bArr3 == null) {
            a(bArr, 1, z12);
            return;
        }
        if (this.f382849o != 4) {
            try {
                this.f382836b.a(bArr, bArr3);
            } catch (Exception e13) {
                a(1, e13);
                return;
            }
        }
        if (xg.f391720d.equals(this.f382847m)) {
            Pair<Long, Long> pairA = wl1.a(this);
            pairA.getClass();
            jMin = Math.min(((Long) pairA.first).longValue(), ((Long) pairA.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (this.f382839e == 0 && jMin <= 60) {
            ka0.a("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            a(bArr, 2, z12);
            return;
        }
        if (jMin <= 0) {
            a(2, new p80());
            return;
        }
        this.f382849o = 4;
        Iterator<f.a> it = this.f382843i.a().iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    private void a(byte[] bArr, int i12, boolean z12) throws NumberFormatException {
        try {
            m.a aVarA = this.f382836b.a(bArr, this.f382835a, i12, this.f382842h);
            this.f382857w = aVarA;
            c cVar = this.f382852r;
            int i13 = pc1.f388768a;
            aVarA.getClass();
            cVar.getClass();
            cVar.obtainMessage(1, new d(q90.a(), z12, SystemClock.elapsedRealtime(), aVarA)).sendToTarget();
        } catch (Exception e12) {
            if (e12 instanceof NotProvisionedException) {
                ((c.f) this.f382837c).b(this);
            } else {
                a(1, e12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Object obj, Object obj2) throws NumberFormatException {
        if (obj == this.f382857w) {
            int i12 = this.f382849o;
            if (i12 == 3 || i12 == 4) {
                this.f382857w = null;
                if (obj2 instanceof Exception) {
                    Exception exc = (Exception) obj2;
                    if (exc instanceof NotProvisionedException) {
                        ((c.f) this.f382837c).b(this);
                        return;
                    } else {
                        a(2, exc);
                        return;
                    }
                }
                try {
                    byte[] bArr = (byte[]) obj2;
                    if (this.f382839e == 3) {
                        m mVar = this.f382836b;
                        byte[] bArr2 = this.f382856v;
                        int i13 = pc1.f388768a;
                        mVar.b(bArr2, bArr);
                        Iterator<f.a> it = this.f382843i.a().iterator();
                        while (it.hasNext()) {
                            it.next().b();
                        }
                        return;
                    }
                    byte[] bArrB = this.f382836b.b(this.f382855u, bArr);
                    int i14 = this.f382839e;
                    if ((i14 == 2 || (i14 == 0 && this.f382856v != null)) && bArrB != null && bArrB.length != 0) {
                        this.f382856v = bArrB;
                    }
                    this.f382849o = 4;
                    Iterator<f.a> it2 = this.f382843i.a().iterator();
                    while (it2.hasNext()) {
                        it2.next().a();
                    }
                } catch (Exception e12) {
                    if (e12 instanceof NotProvisionedException) {
                        ((c.f) this.f382837c).b(this);
                    } else {
                        a(1, e12);
                    }
                }
            }
        }
    }

    public final void a(int i12) {
        if (i12 == 2 && this.f382839e == 0 && this.f382849o == 4) {
            int i13 = pc1.f388768a;
            a(false);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(int r6, java.lang.Exception r7) throws java.lang.NumberFormatException {
        /*
            r5 = this;
            com.yandex.mobile.ads.exo.drm.e$a r0 = new com.yandex.mobile.ads.exo.drm.e$a
            int r1 = com.yandex.mobile.ads.impl.pc1.f388768a
            r2 = 21
            r3 = 1
            if (r1 < r2) goto L14
            boolean r2 = com.yandex.mobile.ads.exo.drm.i.a(r7)
            if (r2 == 0) goto L14
            int r6 = com.yandex.mobile.ads.exo.drm.i.b(r7)
            goto L5a
        L14:
            r2 = 23
            if (r1 < r2) goto L1f
            boolean r2 = com.yandex.mobile.ads.exo.drm.j.a(r7)
            if (r2 == 0) goto L1f
            goto L4c
        L1f:
            r2 = 18
            if (r1 < r2) goto L2a
            boolean r4 = com.yandex.mobile.ads.exo.drm.h.b(r7)
            if (r4 == 0) goto L2a
            goto L58
        L2a:
            if (r1 < r2) goto L35
            boolean r1 = com.yandex.mobile.ads.exo.drm.h.a(r7)
            if (r1 == 0) goto L35
            r6 = 6007(0x1777, float:8.418E-42)
            goto L5a
        L35:
            boolean r1 = r7 instanceof com.yandex.mobile.ads.impl.xb1
            if (r1 == 0) goto L3c
            r6 = 6001(0x1771, float:8.409E-42)
            goto L5a
        L3c:
            boolean r1 = r7 instanceof com.yandex.mobile.ads.exo.drm.c.d
            if (r1 == 0) goto L43
            r6 = 6003(0x1773, float:8.412E-42)
            goto L5a
        L43:
            boolean r1 = r7 instanceof com.yandex.mobile.ads.impl.p80
            if (r1 == 0) goto L4a
            r6 = 6008(0x1778, float:8.419E-42)
            goto L5a
        L4a:
            if (r6 != r3) goto L4f
        L4c:
            r6 = 6006(0x1776, float:8.416E-42)
            goto L5a
        L4f:
            r1 = 2
            if (r6 != r1) goto L55
            r6 = 6004(0x1774, float:8.413E-42)
            goto L5a
        L55:
            r1 = 3
            if (r6 != r1) goto L88
        L58:
            r6 = 6002(0x1772, float:8.41E-42)
        L5a:
            r0.<init>(r7, r6)
            r5.f382854t = r0
            java.lang.String r6 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            com.yandex.mobile.ads.impl.ka0.a(r6, r0, r7)
            com.yandex.mobile.ads.impl.fm<com.yandex.mobile.ads.exo.drm.f$a> r6 = r5.f382843i
            java.util.Set r6 = r6.a()
            java.util.Iterator r6 = r6.iterator()
        L70:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L80
            java.lang.Object r0 = r6.next()
            com.yandex.mobile.ads.exo.drm.f$a r0 = (com.yandex.mobile.ads.exo.drm.f.a) r0
            a(r7, r0)
            goto L70
        L80:
            int r6 = r5.f382849o
            r7 = 4
            if (r6 == r7) goto L87
            r5.f382849o = r3
        L87:
            return
        L88:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.drm.b.a(int, java.lang.Exception):void");
    }
}
