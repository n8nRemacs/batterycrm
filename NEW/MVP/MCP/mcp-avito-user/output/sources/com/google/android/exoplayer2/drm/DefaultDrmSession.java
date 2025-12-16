package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.C36526i;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.source.C36554q;
import com.google.android.exoplayer2.upstream.z;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36594j;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.U;
import j.B;
import j.P;
import j.X;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import v61.InterfaceC49174e;

@X
/* loaded from: classes6.dex */
class DefaultDrmSession implements DrmSession {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final List<DrmInitData.SchemeData> f344256a;

    /* renamed from: b, reason: collision with root package name */
    public final k f344257b;

    /* renamed from: c, reason: collision with root package name */
    public final a f344258c;

    /* renamed from: d, reason: collision with root package name */
    public final b f344259d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f344260e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f344261f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap<String, String> f344262g;

    /* renamed from: h, reason: collision with root package name */
    public final C36594j<e.a> f344263h;

    /* renamed from: i, reason: collision with root package name */
    public final z f344264i;

    /* renamed from: j, reason: collision with root package name */
    public final com.google.android.exoplayer2.analytics.p f344265j;

    /* renamed from: k, reason: collision with root package name */
    public final q f344266k;

    /* renamed from: l, reason: collision with root package name */
    public final UUID f344267l;

    /* renamed from: m, reason: collision with root package name */
    public final e f344268m;

    /* renamed from: n, reason: collision with root package name */
    public int f344269n;

    /* renamed from: o, reason: collision with root package name */
    public int f344270o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public HandlerThread f344271p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public c f344272q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public com.google.android.exoplayer2.decoder.c f344273r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public DrmSession.DrmSessionException f344274s;

    /* renamed from: t, reason: collision with root package name */
    @P
    public byte[] f344275t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f344276u;

    /* renamed from: v, reason: collision with root package name */
    @P
    public k.b f344277v;

    /* renamed from: w, reason: collision with root package name */
    @P
    public k.h f344278w;

    public static final class UnexpectedDrmSessionException extends IOException {
    }

    public interface a {
        void a();

        void b(Exception exc, boolean z12);

        void c(DefaultDrmSession defaultDrmSession);
    }

    public interface b {
        void a(DefaultDrmSession defaultDrmSession);

        void b(DefaultDrmSession defaultDrmSession, int i12);
    }

    @SuppressLint({"HandlerLeak"})
    public class c extends Handler {

        /* renamed from: a, reason: collision with root package name */
        @B
        public boolean f344279a;

        public c(Looper looper) {
            super(looper);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Exception excB;
            d dVar = (d) message.obj;
            try {
                int i12 = message.what;
                if (i12 == 0) {
                    excB = DefaultDrmSession.this.f344266k.b((k.h) dVar.f344283c);
                } else {
                    if (i12 != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    excB = defaultDrmSession.f344266k.a(defaultDrmSession.f344267l, (k.b) dVar.f344283c);
                }
            } catch (MediaDrmCallbackException e12) {
                d dVar2 = (d) message.obj;
                if (dVar2.f344282b) {
                    int i13 = dVar2.f344284d + 1;
                    dVar2.f344284d = i13;
                    if (i13 <= DefaultDrmSession.this.f344264i.a(3)) {
                        SystemClock.elapsedRealtime();
                        SystemClock.elapsedRealtime();
                        long jB2 = DefaultDrmSession.this.f344264i.b(new z.d(e12.getCause() instanceof IOException ? (IOException) e12.getCause() : new UnexpectedDrmSessionException(e12.getCause()), dVar2.f344284d));
                        if (jB2 != -9223372036854775807L) {
                            synchronized (this) {
                                try {
                                    if (!this.f344279a) {
                                        sendMessageDelayed(Message.obtain(message), jB2);
                                        return;
                                    }
                                } finally {
                                }
                            }
                        }
                    }
                }
                excB = e12;
            } catch (Exception e13) {
                C36605v.a("Key/provisioning request produced an unexpected exception. Not retrying.", e13);
                excB = e13;
            }
            z zVar = DefaultDrmSession.this.f344264i;
            long j12 = dVar.f344281a;
            zVar.getClass();
            synchronized (this) {
                try {
                    if (!this.f344279a) {
                        DefaultDrmSession.this.f344268m.obtainMessage(message.what, Pair.create(dVar.f344283c, excB)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f344281a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f344282b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f344283c;

        /* renamed from: d, reason: collision with root package name */
        public int f344284d;

        public d(long j12, boolean z12, long j13, Object obj) {
            this.f344281a = j12;
            this.f344282b = z12;
            this.f344283c = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Set<e.a> set;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i12 = message.what;
            if (i12 == 0) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                if (obj == defaultDrmSession.f344278w) {
                    if (defaultDrmSession.f344269n == 2 || defaultDrmSession.i()) {
                        defaultDrmSession.f344278w = null;
                        boolean z12 = obj2 instanceof Exception;
                        a aVar = defaultDrmSession.f344258c;
                        if (z12) {
                            aVar.b((Exception) obj2, false);
                            return;
                        }
                        try {
                            defaultDrmSession.f344257b.d((byte[]) obj2);
                            aVar.a();
                            return;
                        } catch (Exception e12) {
                            aVar.b(e12, true);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            if (i12 != 1) {
                return;
            }
            DefaultDrmSession defaultDrmSession2 = DefaultDrmSession.this;
            if (obj == defaultDrmSession2.f344277v && defaultDrmSession2.i()) {
                defaultDrmSession2.f344277v = null;
                if (obj2 instanceof Exception) {
                    defaultDrmSession2.k((Exception) obj2, false);
                    return;
                }
                try {
                    byte[] bArrC = defaultDrmSession2.f344257b.c(defaultDrmSession2.f344275t, (byte[]) obj2);
                    if (defaultDrmSession2.f344276u != null && bArrC != null && bArrC.length != 0) {
                        defaultDrmSession2.f344276u = bArrC;
                    }
                    defaultDrmSession2.f344269n = 4;
                    C36594j<e.a> c36594j = defaultDrmSession2.f344263h;
                    synchronized (c36594j.f348132b) {
                        set = c36594j.f348134d;
                    }
                    Iterator<e.a> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                } catch (Exception e13) {
                    defaultDrmSession2.k(e13, true);
                }
            }
        }
    }

    public DefaultDrmSession(UUID uuid, k kVar, a aVar, b bVar, @P List list, boolean z12, boolean z13, @P byte[] bArr, HashMap map, q qVar, Looper looper, z zVar, com.google.android.exoplayer2.analytics.p pVar) {
        this.f344267l = uuid;
        this.f344258c = aVar;
        this.f344259d = bVar;
        this.f344257b = kVar;
        this.f344260e = z12;
        this.f344261f = z13;
        if (bArr != null) {
            this.f344276u = bArr;
            this.f344256a = null;
        } else {
            list.getClass();
            this.f344256a = Collections.unmodifiableList(list);
        }
        this.f344262g = map;
        this.f344266k = qVar;
        this.f344263h = new C36594j<>();
        this.f344264i = zVar;
        this.f344265j = pVar;
        this.f344269n = 2;
        this.f344268m = new e(looper);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean a() {
        return this.f344260e;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID b() {
        return this.f344267l;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @P
    public final com.google.android.exoplayer2.decoder.c c() {
        return this.f344273r;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean d(String str) {
        byte[] bArr = this.f344275t;
        C36585a.e(bArr);
        return this.f344257b.j(str, bArr);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void e(@P e.a aVar) {
        int i12 = this.f344270o;
        if (i12 <= 0) {
            return;
        }
        int i13 = i12 - 1;
        this.f344270o = i13;
        if (i13 == 0) {
            this.f344269n = 0;
            e eVar = this.f344268m;
            int i14 = U.f348106a;
            eVar.removeCallbacksAndMessages(null);
            c cVar = this.f344272q;
            synchronized (cVar) {
                cVar.removeCallbacksAndMessages(null);
                cVar.f344279a = true;
            }
            this.f344272q = null;
            this.f344271p.quit();
            this.f344271p = null;
            this.f344273r = null;
            this.f344274s = null;
            this.f344277v = null;
            this.f344278w = null;
            byte[] bArr = this.f344275t;
            if (bArr != null) {
                this.f344257b.f(bArr);
                this.f344275t = null;
            }
        }
        if (aVar != null) {
            C36594j<e.a> c36594j = this.f344263h;
            synchronized (c36594j.f348132b) {
                try {
                    Integer num = (Integer) c36594j.f348133c.get(aVar);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(c36594j.f348135e);
                        arrayList.remove(aVar);
                        c36594j.f348135e = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            c36594j.f348133c.remove(aVar);
                            HashSet hashSet = new HashSet(c36594j.f348134d);
                            hashSet.remove(aVar);
                            c36594j.f348134d = Collections.unmodifiableSet(hashSet);
                        } else {
                            c36594j.f348133c.put(aVar, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } finally {
                }
            }
            if (this.f344263h.a(aVar) == 0) {
                aVar.f();
            }
        }
        this.f344259d.b(this, this.f344270o);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void f(@P e.a aVar) {
        if (this.f344270o < 0) {
            this.f344270o = 0;
        }
        if (aVar != null) {
            C36594j<e.a> c36594j = this.f344263h;
            synchronized (c36594j.f348132b) {
                try {
                    ArrayList arrayList = new ArrayList(c36594j.f348135e);
                    arrayList.add(aVar);
                    c36594j.f348135e = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) c36594j.f348133c.get(aVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(c36594j.f348134d);
                        hashSet.add(aVar);
                        c36594j.f348134d = Collections.unmodifiableSet(hashSet);
                    }
                    c36594j.f348133c.put(aVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i12 = this.f344270o + 1;
        this.f344270o = i12;
        if (i12 == 1) {
            C36585a.d(this.f344269n == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f344271p = handlerThread;
            handlerThread.start();
            this.f344272q = new c(this.f344271p.getLooper());
            if (l()) {
                h(true);
            }
        } else if (aVar != null && i() && this.f344263h.a(aVar) == 1) {
            aVar.d(this.f344269n);
        }
        this.f344259d.a(this);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    @P
    public final DrmSession.DrmSessionException getError() {
        if (this.f344269n == 1) {
            return this.f344274s;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return this.f344269n;
    }

    @v61.m
    public final void h(boolean z12) {
        long jMin;
        String str;
        Set<e.a> set;
        if (this.f344261f) {
            return;
        }
        byte[] bArr = this.f344275t;
        int i12 = U.f348106a;
        byte[] bArr2 = this.f344276u;
        if (bArr2 == null) {
            m(1, bArr, z12);
            return;
        }
        if (this.f344269n != 4) {
            try {
                this.f344257b.b(bArr, bArr2);
            } catch (Exception e12) {
                j(1, e12);
                return;
            }
        }
        if (C36526i.f345420d.equals(this.f344267l)) {
            byte[] bArr3 = this.f344275t;
            Pair pair = null;
            Map<String, String> mapA = bArr3 == null ? null : this.f344257b.a(bArr3);
            if (mapA != null) {
                long j12 = -9223372036854775807L;
                try {
                    str = mapA.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                long j13 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                Long lValueOf = Long.valueOf(j13);
                try {
                    String str2 = mapA.get("PlaybackDurationRemaining");
                    if (str2 != null) {
                        j12 = Long.parseLong(str2);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j12));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = Long.MAX_VALUE;
        }
        if (jMin <= 60) {
            m(2, bArr, z12);
            return;
        }
        if (jMin <= 0) {
            j(2, new KeysExpiredException());
            return;
        }
        this.f344269n = 4;
        C36594j<e.a> c36594j = this.f344263h;
        synchronized (c36594j.f348132b) {
            set = c36594j.f348134d;
        }
        Iterator<e.a> it = set.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    @InterfaceC49174e
    public final boolean i() {
        int i12 = this.f344269n;
        return i12 == 3 || i12 == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r8, java.lang.Exception r9) {
        /*
            r7 = this;
            com.google.android.exoplayer2.drm.DrmSession$DrmSessionException r0 = new com.google.android.exoplayer2.drm.DrmSession$DrmSessionException
            int r1 = com.google.android.exoplayer2.util.U.f348106a
            r2 = 21
            r3 = 1
            if (r1 < r2) goto L14
            boolean r2 = com.google.android.exoplayer2.drm.h.b.a(r9)
            if (r2 == 0) goto L14
            int r8 = com.google.android.exoplayer2.drm.h.b.b(r9)
            goto L5d
        L14:
            r2 = 23
            r4 = 6006(0x1776, float:8.416E-42)
            if (r1 < r2) goto L22
            boolean r2 = com.google.android.exoplayer2.drm.h.c.a(r9)
            if (r2 == 0) goto L22
        L20:
            r8 = r4
            goto L5d
        L22:
            r2 = 6002(0x1772, float:8.41E-42)
            r5 = 18
            if (r1 < r5) goto L30
            boolean r6 = com.google.android.exoplayer2.drm.h.a.b(r9)
            if (r6 == 0) goto L30
        L2e:
            r8 = r2
            goto L5d
        L30:
            if (r1 < r5) goto L3b
            boolean r1 = com.google.android.exoplayer2.drm.h.a.a(r9)
            if (r1 == 0) goto L3b
            r8 = 6007(0x1777, float:8.418E-42)
            goto L5d
        L3b:
            boolean r1 = r9 instanceof com.google.android.exoplayer2.drm.UnsupportedDrmException
            if (r1 == 0) goto L42
            r8 = 6001(0x1771, float:8.409E-42)
            goto L5d
        L42:
            boolean r1 = r9 instanceof com.google.android.exoplayer2.drm.DefaultDrmSessionManager.MissingSchemeDataException
            if (r1 == 0) goto L49
            r8 = 6003(0x1773, float:8.412E-42)
            goto L5d
        L49:
            boolean r1 = r9 instanceof com.google.android.exoplayer2.drm.KeysExpiredException
            if (r1 == 0) goto L50
            r8 = 6008(0x1778, float:8.419E-42)
            goto L5d
        L50:
            if (r8 != r3) goto L53
            goto L20
        L53:
            r1 = 2
            if (r8 != r1) goto L59
            r8 = 6004(0x1774, float:8.413E-42)
            goto L5d
        L59:
            r1 = 3
            if (r8 != r1) goto L8e
            goto L2e
        L5d:
            r0.<init>(r9, r8)
            r7.f344274s = r0
            java.lang.String r8 = "DRM session error"
            com.google.android.exoplayer2.util.C36605v.a(r8, r9)
            com.google.android.exoplayer2.util.j<com.google.android.exoplayer2.drm.e$a> r8 = r7.f344263h
            java.lang.Object r0 = r8.f348132b
            monitor-enter(r0)
            java.util.Set<E> r8 = r8.f348134d     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            java.util.Iterator r8 = r8.iterator()
        L73:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r8.next()
            com.google.android.exoplayer2.drm.e$a r0 = (com.google.android.exoplayer2.drm.e.a) r0
            r0.e(r9)
            goto L73
        L83:
            int r8 = r7.f344269n
            r9 = 4
            if (r8 == r9) goto L8a
            r7.f344269n = r3
        L8a:
            return
        L8b:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            throw r8
        L8e:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSession.j(int, java.lang.Exception):void");
    }

    public final void k(Exception exc, boolean z12) {
        if (exc instanceof NotProvisionedException) {
            this.f344258c.c(this);
        } else {
            j(z12 ? 1 : 2, exc);
        }
    }

    @InterfaceC49174e
    public final boolean l() {
        Set<e.a> set;
        if (i()) {
            return true;
        }
        try {
            byte[] bArrI = this.f344257b.i();
            this.f344275t = bArrI;
            this.f344257b.m(bArrI, this.f344265j);
            this.f344273r = this.f344257b.e(this.f344275t);
            this.f344269n = 3;
            C36594j<e.a> c36594j = this.f344263h;
            synchronized (c36594j.f348132b) {
                set = c36594j.f348134d;
            }
            Iterator<e.a> it = set.iterator();
            while (it.hasNext()) {
                it.next().d(3);
            }
            this.f344275t.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.f344258c.c(this);
            return false;
        } catch (Exception e12) {
            j(1, e12);
            return false;
        }
    }

    public final void m(int i12, byte[] bArr, boolean z12) {
        try {
            k.b bVarG = this.f344257b.g(bArr, this.f344256a, i12, this.f344262g);
            this.f344277v = bVarG;
            c cVar = this.f344272q;
            int i13 = U.f348106a;
            bVarG.getClass();
            cVar.getClass();
            cVar.obtainMessage(1, new d(C36554q.f346661b.getAndIncrement(), z12, SystemClock.elapsedRealtime(), bVarG)).sendToTarget();
        } catch (Exception e12) {
            k(e12, true);
        }
    }
}
