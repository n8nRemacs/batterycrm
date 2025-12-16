package com.yandex.mobile.ads.exo.drm;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.yandex.mobile.ads.embedded.guava.collect.m0;
import com.yandex.mobile.ads.embedded.guava.collect.q0;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.drm.b;
import com.yandex.mobile.ads.exo.drm.f;
import com.yandex.mobile.ads.exo.drm.g;
import com.yandex.mobile.ads.exo.drm.m;
import com.yandex.mobile.ads.impl.ap;
import com.yandex.mobile.ads.impl.db;
import com.yandex.mobile.ads.impl.jt0;
import com.yandex.mobile.ads.impl.p90;
import com.yandex.mobile.ads.impl.pc1;
import com.yandex.mobile.ads.impl.vw;
import com.yandex.mobile.ads.impl.xg;
import j.P;
import j.X;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

@X
/* loaded from: classes8.dex */
public final class c implements com.yandex.mobile.ads.exo.drm.g {

    /* renamed from: b, reason: collision with root package name */
    private final UUID f382866b;

    /* renamed from: c, reason: collision with root package name */
    private final m.c f382867c;

    /* renamed from: d, reason: collision with root package name */
    private final p f382868d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap<String, String> f382869e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f382870f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f382871g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f382872h;

    /* renamed from: i, reason: collision with root package name */
    private final f f382873i;

    /* renamed from: j, reason: collision with root package name */
    private final p90 f382874j;

    /* renamed from: k, reason: collision with root package name */
    private final g f382875k;

    /* renamed from: l, reason: collision with root package name */
    private final long f382876l;

    /* renamed from: m, reason: collision with root package name */
    private final ArrayList f382877m;

    /* renamed from: n, reason: collision with root package name */
    private final Set<e> f382878n;

    /* renamed from: o, reason: collision with root package name */
    private final Set<com.yandex.mobile.ads.exo.drm.b> f382879o;

    /* renamed from: p, reason: collision with root package name */
    private int f382880p;

    /* renamed from: q, reason: collision with root package name */
    @P
    private m f382881q;

    /* renamed from: r, reason: collision with root package name */
    @P
    private com.yandex.mobile.ads.exo.drm.b f382882r;

    /* renamed from: s, reason: collision with root package name */
    @P
    private com.yandex.mobile.ads.exo.drm.b f382883s;

    /* renamed from: t, reason: collision with root package name */
    private Looper f382884t;

    /* renamed from: u, reason: collision with root package name */
    private Handler f382885u;

    /* renamed from: v, reason: collision with root package name */
    private int f382886v;

    /* renamed from: w, reason: collision with root package name */
    @P
    private byte[] f382887w;

    /* renamed from: x, reason: collision with root package name */
    private jt0 f382888x;

    /* renamed from: y, reason: collision with root package name */
    @P
    volatile HandlerC10969c f382889y;

    public class b implements m.b {
        private b() {
        }

        public /* synthetic */ b(c cVar, int i12) {
            this();
        }
    }

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.yandex.mobile.ads.exo.drm.c$c, reason: collision with other inner class name */
    public class HandlerC10969c extends Handler {
        public HandlerC10969c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            Iterator it = c.this.f382877m.iterator();
            while (it.hasNext()) {
                com.yandex.mobile.ads.exo.drm.b bVar = (com.yandex.mobile.ads.exo.drm.b) it.next();
                if (bVar.a(bArr)) {
                    bVar.a(message.what);
                    return;
                }
            }
        }
    }

    public static final class d extends Exception {
        public /* synthetic */ d(UUID uuid, int i12) {
            this(uuid);
        }

        private d(UUID uuid) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public class e implements g.b {

        /* renamed from: b, reason: collision with root package name */
        @P
        private final f.a f382900b;

        /* renamed from: c, reason: collision with root package name */
        @P
        private com.yandex.mobile.ads.exo.drm.e f382901c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f382902d;

        public e(@P f.a aVar) {
            this.f382900b = aVar;
        }

        @Override // com.yandex.mobile.ads.exo.drm.g.b
        public final void release() {
            Handler handler = c.this.f382885u;
            handler.getClass();
            pc1.a(handler, (Runnable) new q(this, 0));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(vw vwVar) {
            if (c.this.f382880p == 0 || this.f382902d) {
                return;
            }
            c cVar = c.this;
            Looper looper = cVar.f382884t;
            looper.getClass();
            this.f382901c = c.a(cVar, looper, this.f382900b, vwVar);
            c.this.f382878n.add(this);
        }

        public final void a(vw vwVar) {
            Handler handler = c.this.f382885u;
            handler.getClass();
            handler.post(new r(4, this, vwVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            if (this.f382902d) {
                return;
            }
            com.yandex.mobile.ads.exo.drm.e eVar = this.f382901c;
            if (eVar != null) {
                eVar.a(this.f382900b);
            }
            c.this.f382878n.remove(this);
            this.f382902d = true;
        }
    }

    public class g implements b.InterfaceC10968b {
        private g() {
        }

        public final void a(com.yandex.mobile.ads.exo.drm.b bVar, int i12) {
            if (i12 == 1 && c.this.f382880p > 0 && c.this.f382876l != -9223372036854775807L) {
                c.this.f382879o.add(bVar);
                Handler handler = c.this.f382885u;
                handler.getClass();
                handler.postAtTime(new q(bVar, 1), bVar, c.this.f382876l + SystemClock.uptimeMillis());
            } else if (i12 == 0) {
                c.this.f382877m.remove(bVar);
                if (c.this.f382882r == bVar) {
                    c.this.f382882r = null;
                }
                if (c.this.f382883s == bVar) {
                    c.this.f382883s = null;
                }
                c.this.f382873i.a(bVar);
                if (c.this.f382876l != -9223372036854775807L) {
                    Handler handler2 = c.this.f382885u;
                    handler2.getClass();
                    handler2.removeCallbacksAndMessages(bVar);
                    c.this.f382879o.remove(bVar);
                }
            }
            c.d(c.this);
        }

        public /* synthetic */ g(c cVar, int i12) {
            this();
        }
    }

    public /* synthetic */ c(UUID uuid, m.c cVar, o oVar, HashMap map, boolean z12, int[] iArr, boolean z13, ap apVar, long j12, int i12) {
        this(uuid, cVar, oVar, map, z12, iArr, z13, apVar, j12);
    }

    public static void d(c cVar) {
        if (cVar.f382881q != null && cVar.f382880p == 0 && cVar.f382877m.isEmpty() && cVar.f382878n.isEmpty()) {
            m mVar = cVar.f382881q;
            mVar.getClass();
            mVar.release();
            cVar.f382881q = null;
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.g
    public final void prepare() {
        int i12 = this.f382880p;
        this.f382880p = i12 + 1;
        if (i12 != 0) {
            return;
        }
        int i13 = 0;
        if (this.f382881q == null) {
            m mVarA = this.f382867c.a(this.f382866b);
            this.f382881q = mVarA;
            mVarA.a(new b(this, i13));
        } else if (this.f382876l != -9223372036854775807L) {
            while (i13 < this.f382877m.size()) {
                ((com.yandex.mobile.ads.exo.drm.b) this.f382877m.get(i13)).b(null);
                i13++;
            }
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.g
    public final void release() {
        int i12 = this.f382880p - 1;
        this.f382880p = i12;
        if (i12 != 0) {
            return;
        }
        if (this.f382876l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f382877m);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((com.yandex.mobile.ads.exo.drm.b) arrayList.get(i13)).a((f.a) null);
            }
        }
        Iterator itG = com.yandex.mobile.ads.embedded.guava.collect.r.a(this.f382878n).iterator();
        while (itG.hasNext()) {
            ((e) itG.next()).release();
        }
        if (this.f382881q != null && this.f382880p == 0 && this.f382877m.isEmpty() && this.f382878n.isEmpty()) {
            m mVar = this.f382881q;
            mVar.getClass();
            mVar.release();
            this.f382881q = null;
        }
    }

    private c(UUID uuid, m.c cVar, o oVar, HashMap map, boolean z12, int[] iArr, boolean z13, ap apVar, long j12) {
        db.a(uuid);
        db.a("Use C.CLEARKEY_UUID instead", !xg.f391718b.equals(uuid));
        this.f382866b = uuid;
        this.f382867c = cVar;
        this.f382868d = oVar;
        this.f382869e = map;
        this.f382870f = z12;
        this.f382871g = iArr;
        this.f382872h = z13;
        this.f382874j = apVar;
        this.f382873i = new f();
        this.f382875k = new g(this, 0);
        this.f382886v = 0;
        this.f382877m = new ArrayList();
        this.f382878n = m0.a();
        this.f382879o = m0.a();
        this.f382876l = j12;
    }

    public static /* synthetic */ com.yandex.mobile.ads.exo.drm.e a(c cVar, Looper looper, f.a aVar, vw vwVar) {
        return cVar.a(looper, aVar, vwVar, false);
    }

    @Override // com.yandex.mobile.ads.exo.drm.g
    public final g.b b(@P f.a aVar, vw vwVar) {
        db.b(this.f382880p > 0);
        db.b(this.f382884t);
        e eVar = new e(aVar);
        eVar.a(vwVar);
        return eVar;
    }

    public final void a(@P byte[] bArr) {
        db.b(this.f382877m.isEmpty());
        this.f382886v = 0;
        this.f382887w = bArr;
    }

    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private boolean f382893d;

        /* renamed from: f, reason: collision with root package name */
        private boolean f382895f;

        /* renamed from: a, reason: collision with root package name */
        private final HashMap<String, String> f382890a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        private UUID f382891b = xg.f391720d;

        /* renamed from: c, reason: collision with root package name */
        private m.c f382892c = n.f382924e;

        /* renamed from: g, reason: collision with root package name */
        private ap f382896g = new ap();

        /* renamed from: e, reason: collision with root package name */
        private int[] f382894e = new int[0];

        /* renamed from: h, reason: collision with root package name */
        private long f382897h = 300000;

        public final a a(UUID uuid, m.c cVar) {
            uuid.getClass();
            this.f382891b = uuid;
            cVar.getClass();
            this.f382892c = cVar;
            return this;
        }

        public final a b(boolean z12) {
            this.f382895f = z12;
            return this;
        }

        public final a a(boolean z12) {
            this.f382893d = z12;
            return this;
        }

        public final a a(int... iArr) {
            for (int i12 : iArr) {
                boolean z12 = true;
                if (i12 != 2 && i12 != 1) {
                    z12 = false;
                }
                db.a(z12);
            }
            this.f382894e = (int[]) iArr.clone();
            return this;
        }

        public final c a(o oVar) {
            return new c(this.f382891b, this.f382892c, oVar, this.f382890a, this.f382893d, this.f382894e, this.f382895f, this.f382896g, this.f382897h, 0);
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.g
    public final void a(Looper looper, jt0 jt0Var) {
        synchronized (this) {
            try {
                Looper looper2 = this.f382884t;
                if (looper2 == null) {
                    this.f382884t = looper;
                    this.f382885u = new Handler(looper);
                } else {
                    db.b(looper2 == looper);
                    this.f382885u.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f382888x = jt0Var;
    }

    public class f implements b.a {

        /* renamed from: a, reason: collision with root package name */
        private final HashSet f382904a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        @P
        private com.yandex.mobile.ads.exo.drm.b f382905b;

        /* JADX WARN: Multi-variable type inference failed */
        public final void a() {
            this.f382905b = null;
            com.yandex.mobile.ads.embedded.guava.collect.p pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) this.f382904a);
            this.f382904a.clear();
            q0 q0VarA = pVarA.listIterator(0);
            while (q0VarA.hasNext()) {
                ((com.yandex.mobile.ads.exo.drm.b) q0VarA.next()).a();
            }
        }

        public final void b(com.yandex.mobile.ads.exo.drm.b bVar) {
            this.f382904a.add(bVar);
            if (this.f382905b != null) {
                return;
            }
            this.f382905b = bVar;
            bVar.i();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void a(Exception exc, boolean z12) {
            this.f382905b = null;
            com.yandex.mobile.ads.embedded.guava.collect.p pVarA = com.yandex.mobile.ads.embedded.guava.collect.p.a((Collection) this.f382904a);
            this.f382904a.clear();
            q0 q0VarA = pVarA.listIterator(0);
            while (q0VarA.hasNext()) {
                ((com.yandex.mobile.ads.exo.drm.b) q0VarA.next()).a(exc, z12);
            }
        }

        public final void a(com.yandex.mobile.ads.exo.drm.b bVar) {
            this.f382904a.remove(bVar);
            if (this.f382905b == bVar) {
                this.f382905b = null;
                if (this.f382904a.isEmpty()) {
                    return;
                }
                com.yandex.mobile.ads.exo.drm.b bVar2 = (com.yandex.mobile.ads.exo.drm.b) this.f382904a.iterator().next();
                this.f382905b = bVar2;
                bVar2.i();
            }
        }
    }

    @Override // com.yandex.mobile.ads.exo.drm.g
    @P
    public final com.yandex.mobile.ads.exo.drm.e a(@P f.a aVar, vw vwVar) {
        db.b(this.f382880p > 0);
        db.b(this.f382884t);
        return a(this.f382884t, aVar, vwVar, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00f5  */
    @Override // com.yandex.mobile.ads.exo.drm.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(com.yandex.mobile.ads.impl.vw r11) {
        /*
            Method dump skipped, instructions count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.drm.c.a(com.yandex.mobile.ads.impl.vw):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0218 A[LOOP:5: B:137:0x0212->B:139:0x0218, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0269 A[LOOP:6: B:157:0x0263->B:159:0x0269, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0095 A[LOOP:1: B:38:0x008f->B:40:0x0095, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e5 A[LOOP:2: B:57:0x00df->B:59:0x00e5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0183  */
    @j.P
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.yandex.mobile.ads.exo.drm.e a(android.os.Looper r17, @j.P com.yandex.mobile.ads.exo.drm.f.a r18, com.yandex.mobile.ads.impl.vw r19, boolean r20) {
        /*
            Method dump skipped, instructions count: 694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.drm.c.a(android.os.Looper, com.yandex.mobile.ads.exo.drm.f$a, com.yandex.mobile.ads.impl.vw, boolean):com.yandex.mobile.ads.exo.drm.e");
    }

    private com.yandex.mobile.ads.exo.drm.b a(@P List<DrmInitData.SchemeData> list, boolean z12, @P f.a aVar) {
        this.f382881q.getClass();
        boolean z13 = this.f382872h | z12;
        UUID uuid = this.f382866b;
        m mVar = this.f382881q;
        f fVar = this.f382873i;
        g gVar = this.f382875k;
        int i12 = this.f382886v;
        byte[] bArr = this.f382887w;
        HashMap<String, String> map = this.f382869e;
        p pVar = this.f382868d;
        Looper looper = this.f382884t;
        looper.getClass();
        p90 p90Var = this.f382874j;
        jt0 jt0Var = this.f382888x;
        jt0Var.getClass();
        com.yandex.mobile.ads.exo.drm.b bVar = new com.yandex.mobile.ads.exo.drm.b(uuid, mVar, fVar, gVar, list, i12, z13, z12, bArr, map, pVar, looper, p90Var, jt0Var);
        bVar.b(aVar);
        if (this.f382876l != -9223372036854775807L) {
            bVar.b(null);
        }
        return bVar;
    }
}
