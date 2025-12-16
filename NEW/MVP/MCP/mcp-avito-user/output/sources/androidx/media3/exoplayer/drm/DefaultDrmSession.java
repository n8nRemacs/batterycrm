package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.common.C23097k;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.C23120k;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.analytics.w;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.f;
import androidx.media3.exoplayer.drm.l;
import androidx.media3.exoplayer.source.C23167s;
import androidx.media3.exoplayer.upstream.l;
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
/* loaded from: classes.dex */
class DefaultDrmSession implements DrmSession {

    /* renamed from: a, reason: collision with root package name */
    @P
    public final List<DrmInitData.SchemeData> f49026a;

    /* renamed from: b, reason: collision with root package name */
    public final l f49027b;

    /* renamed from: c, reason: collision with root package name */
    public final a f49028c;

    /* renamed from: d, reason: collision with root package name */
    public final b f49029d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f49030e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f49031f;

    /* renamed from: g, reason: collision with root package name */
    public final HashMap<String, String> f49032g;

    /* renamed from: h, reason: collision with root package name */
    public final C23120k<f.a> f49033h;

    /* renamed from: i, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.l f49034i;

    /* renamed from: j, reason: collision with root package name */
    public final w f49035j;

    /* renamed from: k, reason: collision with root package name */
    public final r f49036k;

    /* renamed from: l, reason: collision with root package name */
    public final UUID f49037l;

    /* renamed from: m, reason: collision with root package name */
    public final Looper f49038m;

    /* renamed from: n, reason: collision with root package name */
    public final e f49039n;

    /* renamed from: o, reason: collision with root package name */
    public int f49040o;

    /* renamed from: p, reason: collision with root package name */
    public int f49041p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public HandlerThread f49042q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public c f49043r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public androidx.media3.decoder.c f49044s;

    /* renamed from: t, reason: collision with root package name */
    @P
    public DrmSession.DrmSessionException f49045t;

    /* renamed from: u, reason: collision with root package name */
    @P
    public byte[] f49046u;

    /* renamed from: v, reason: collision with root package name */
    public byte[] f49047v;

    /* renamed from: w, reason: collision with root package name */
    @P
    public l.b f49048w;

    /* renamed from: x, reason: collision with root package name */
    @P
    public l.h f49049x;

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
        public boolean f49050a;

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
                    excB = DefaultDrmSession.this.f49036k.b((l.h) dVar.f49054c);
                } else {
                    if (i12 != 1) {
                        throw new RuntimeException();
                    }
                    DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                    excB = defaultDrmSession.f49036k.a(defaultDrmSession.f49037l, (l.b) dVar.f49054c);
                }
            } catch (MediaDrmCallbackException e12) {
                d dVar2 = (d) message.obj;
                if (dVar2.f49053b) {
                    int i13 = dVar2.f49055d + 1;
                    dVar2.f49055d = i13;
                    if (i13 <= DefaultDrmSession.this.f49034i.a(3)) {
                        SystemClock.elapsedRealtime();
                        SystemClock.elapsedRealtime();
                        long jB2 = DefaultDrmSession.this.f49034i.b(new l.d(e12.getCause() instanceof IOException ? (IOException) e12.getCause() : new UnexpectedDrmSessionException(e12.getCause()), dVar2.f49055d));
                        if (jB2 != -9223372036854775807L) {
                            synchronized (this) {
                                try {
                                    if (!this.f49050a) {
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
                androidx.media3.common.util.s.h("Key/provisioning request produced an unexpected exception. Not retrying.", e13);
                excB = e13;
            }
            androidx.media3.exoplayer.upstream.l lVar = DefaultDrmSession.this.f49034i;
            long j12 = dVar.f49052a;
            lVar.getClass();
            synchronized (this) {
                try {
                    if (!this.f49050a) {
                        DefaultDrmSession.this.f49039n.obtainMessage(message.what, Pair.create(dVar.f49054c, excB)).sendToTarget();
                    }
                } finally {
                }
            }
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final long f49052a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f49053b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f49054c;

        /* renamed from: d, reason: collision with root package name */
        public int f49055d;

        public d(long j12, boolean z12, long j13, Object obj) {
            this.f49052a = j12;
            this.f49053b = z12;
            this.f49054c = obj;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class e extends Handler {
        public e(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            Set<f.a> set;
            Pair pair = (Pair) message.obj;
            Object obj = pair.first;
            Object obj2 = pair.second;
            int i12 = message.what;
            if (i12 == 0) {
                DefaultDrmSession defaultDrmSession = DefaultDrmSession.this;
                if (obj == defaultDrmSession.f49049x) {
                    if (defaultDrmSession.f49040o == 2 || defaultDrmSession.i()) {
                        defaultDrmSession.f49049x = null;
                        boolean z12 = obj2 instanceof Exception;
                        a aVar = defaultDrmSession.f49028c;
                        if (z12) {
                            aVar.b((Exception) obj2, false);
                            return;
                        }
                        try {
                            defaultDrmSession.f49027b.d((byte[]) obj2);
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
            if (obj == defaultDrmSession2.f49048w && defaultDrmSession2.i()) {
                defaultDrmSession2.f49048w = null;
                if (obj2 instanceof Exception) {
                    defaultDrmSession2.k((Exception) obj2, false);
                    return;
                }
                try {
                    byte[] bArrC = defaultDrmSession2.f49027b.c(defaultDrmSession2.f49046u, (byte[]) obj2);
                    if (defaultDrmSession2.f49047v != null && bArrC != null && bArrC.length != 0) {
                        defaultDrmSession2.f49047v = bArrC;
                    }
                    defaultDrmSession2.f49040o = 4;
                    C23120k<f.a> c23120k = defaultDrmSession2.f49033h;
                    synchronized (c23120k.f47910b) {
                        set = c23120k.f47912d;
                    }
                    Iterator<f.a> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().b();
                    }
                } catch (Exception e13) {
                    defaultDrmSession2.k(e13, true);
                }
            }
        }
    }

    public DefaultDrmSession(UUID uuid, l lVar, a aVar, b bVar, @P List list, boolean z12, boolean z13, @P byte[] bArr, HashMap map, r rVar, Looper looper, androidx.media3.exoplayer.upstream.l lVar2, w wVar) {
        this.f49037l = uuid;
        this.f49028c = aVar;
        this.f49029d = bVar;
        this.f49027b = lVar;
        this.f49030e = z12;
        this.f49031f = z13;
        if (bArr != null) {
            this.f49047v = bArr;
            this.f49026a = null;
        } else {
            list.getClass();
            this.f49026a = Collections.unmodifiableList(list);
        }
        this.f49032g = map;
        this.f49036k = rVar;
        this.f49033h = new C23120k<>();
        this.f49034i = lVar2;
        this.f49035j = wVar;
        this.f49040o = 2;
        this.f49038m = looper;
        this.f49039n = new e(looper);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean a() {
        n();
        return this.f49030e;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final UUID b() {
        n();
        return this.f49037l;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    @P
    public final androidx.media3.decoder.c c() {
        n();
        return this.f49044s;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final boolean d(String str) {
        n();
        byte[] bArr = this.f49046u;
        C23110a.h(bArr);
        return this.f49027b.j(str, bArr);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void f(@P f.a aVar) {
        n();
        int i12 = this.f49041p;
        if (i12 <= 0) {
            androidx.media3.common.util.s.c();
            return;
        }
        int i13 = i12 - 1;
        this.f49041p = i13;
        if (i13 == 0) {
            this.f49040o = 0;
            e eVar = this.f49039n;
            int i14 = M.f47887a;
            eVar.removeCallbacksAndMessages(null);
            c cVar = this.f49043r;
            synchronized (cVar) {
                cVar.removeCallbacksAndMessages(null);
                cVar.f49050a = true;
            }
            this.f49043r = null;
            this.f49042q.quit();
            this.f49042q = null;
            this.f49044s = null;
            this.f49045t = null;
            this.f49048w = null;
            this.f49049x = null;
            byte[] bArr = this.f49046u;
            if (bArr != null) {
                this.f49027b.f(bArr);
                this.f49046u = null;
            }
        }
        if (aVar != null) {
            C23120k<f.a> c23120k = this.f49033h;
            synchronized (c23120k.f47910b) {
                try {
                    Integer num = (Integer) c23120k.f47911c.get(aVar);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(c23120k.f47913e);
                        arrayList.remove(aVar);
                        c23120k.f47913e = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            c23120k.f47911c.remove(aVar);
                            HashSet hashSet = new HashSet(c23120k.f47912d);
                            hashSet.remove(aVar);
                            c23120k.f47912d = Collections.unmodifiableSet(hashSet);
                        } else {
                            c23120k.f47911c.put(aVar, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } finally {
                }
            }
            if (this.f49033h.a(aVar) == 0) {
                aVar.f();
            }
        }
        this.f49029d.b(this, this.f49041p);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final void g(@P f.a aVar) {
        n();
        if (this.f49041p < 0) {
            androidx.media3.common.util.s.c();
            this.f49041p = 0;
        }
        if (aVar != null) {
            C23120k<f.a> c23120k = this.f49033h;
            synchronized (c23120k.f47910b) {
                try {
                    ArrayList arrayList = new ArrayList(c23120k.f47913e);
                    arrayList.add(aVar);
                    c23120k.f47913e = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) c23120k.f47911c.get(aVar);
                    if (num == null) {
                        HashSet hashSet = new HashSet(c23120k.f47912d);
                        hashSet.add(aVar);
                        c23120k.f47912d = Collections.unmodifiableSet(hashSet);
                    }
                    c23120k.f47911c.put(aVar, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i12 = this.f49041p + 1;
        this.f49041p = i12;
        if (i12 == 1) {
            C23110a.g(this.f49040o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.f49042q = handlerThread;
            handlerThread.start();
            this.f49043r = new c(this.f49042q.getLooper());
            if (l()) {
                h(true);
            }
        } else if (aVar != null && i() && this.f49033h.a(aVar) == 1) {
            aVar.d(this.f49040o);
        }
        this.f49029d.a(this);
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    @P
    public final DrmSession.DrmSessionException getError() {
        n();
        if (this.f49040o == 1) {
            return this.f49045t;
        }
        return null;
    }

    @Override // androidx.media3.exoplayer.drm.DrmSession
    public final int getState() {
        n();
        return this.f49040o;
    }

    @v61.m
    public final void h(boolean z12) {
        long jMin;
        String str;
        Set<f.a> set;
        if (this.f49031f) {
            return;
        }
        byte[] bArr = this.f49046u;
        int i12 = M.f47887a;
        byte[] bArr2 = this.f49047v;
        if (bArr2 == null) {
            m(1, bArr, z12);
            return;
        }
        if (this.f49040o != 4) {
            try {
                this.f49027b.b(bArr, bArr2);
            } catch (Exception e12) {
                j(1, e12);
                return;
            }
        }
        if (C23097k.f47669d.equals(this.f49037l)) {
            n();
            byte[] bArr3 = this.f49046u;
            Pair pair = null;
            Map<String, String> mapA = bArr3 == null ? null : this.f49027b.a(bArr3);
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
            androidx.media3.common.util.s.b();
            m(2, bArr, z12);
        } else {
            if (jMin <= 0) {
                j(2, new KeysExpiredException());
                return;
            }
            this.f49040o = 4;
            C23120k<f.a> c23120k = this.f49033h;
            synchronized (c23120k.f47910b) {
                set = c23120k.f47912d;
            }
            Iterator<f.a> it = set.iterator();
            while (it.hasNext()) {
                it.next().c();
            }
        }
    }

    @InterfaceC49174e
    public final boolean i() {
        int i12 = this.f49040o;
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
            androidx.media3.exoplayer.drm.DrmSession$DrmSessionException r0 = new androidx.media3.exoplayer.drm.DrmSession$DrmSessionException
            int r1 = androidx.media3.common.util.M.f47887a
            r2 = 21
            r3 = 1
            if (r1 < r2) goto L14
            boolean r2 = androidx.media3.exoplayer.drm.i.b.a(r9)
            if (r2 == 0) goto L14
            int r8 = androidx.media3.exoplayer.drm.i.b.b(r9)
            goto L5d
        L14:
            r2 = 23
            r4 = 6006(0x1776, float:8.416E-42)
            if (r1 < r2) goto L22
            boolean r2 = androidx.media3.exoplayer.drm.i.c.a(r9)
            if (r2 == 0) goto L22
        L20:
            r8 = r4
            goto L5d
        L22:
            r2 = 6002(0x1772, float:8.41E-42)
            r5 = 18
            if (r1 < r5) goto L30
            boolean r6 = androidx.media3.exoplayer.drm.i.a.b(r9)
            if (r6 == 0) goto L30
        L2e:
            r8 = r2
            goto L5d
        L30:
            if (r1 < r5) goto L3b
            boolean r1 = androidx.media3.exoplayer.drm.i.a.a(r9)
            if (r1 == 0) goto L3b
            r8 = 6007(0x1777, float:8.418E-42)
            goto L5d
        L3b:
            boolean r1 = r9 instanceof androidx.media3.exoplayer.drm.UnsupportedDrmException
            if (r1 == 0) goto L42
            r8 = 6001(0x1771, float:8.409E-42)
            goto L5d
        L42:
            boolean r1 = r9 instanceof androidx.media3.exoplayer.drm.DefaultDrmSessionManager.MissingSchemeDataException
            if (r1 == 0) goto L49
            r8 = 6003(0x1773, float:8.412E-42)
            goto L5d
        L49:
            boolean r1 = r9 instanceof androidx.media3.exoplayer.drm.KeysExpiredException
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
            r7.f49045t = r0
            java.lang.String r8 = "DRM session error"
            androidx.media3.common.util.s.d(r8, r9)
            androidx.media3.common.util.k<androidx.media3.exoplayer.drm.f$a> r8 = r7.f49033h
            java.lang.Object r0 = r8.f47910b
            monitor-enter(r0)
            java.util.Set<E> r8 = r8.f47912d     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            java.util.Iterator r8 = r8.iterator()
        L73:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L83
            java.lang.Object r0 = r8.next()
            androidx.media3.exoplayer.drm.f$a r0 = (androidx.media3.exoplayer.drm.f.a) r0
            r0.e(r9)
            goto L73
        L83:
            int r8 = r7.f49040o
            r9 = 4
            if (r8 == r9) goto L8a
            r7.f49040o = r3
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.DefaultDrmSession.j(int, java.lang.Exception):void");
    }

    public final void k(Exception exc, boolean z12) {
        if (exc instanceof NotProvisionedException) {
            this.f49028c.c(this);
        } else {
            j(z12 ? 1 : 2, exc);
        }
    }

    @InterfaceC49174e
    public final boolean l() {
        Set<f.a> set;
        if (i()) {
            return true;
        }
        try {
            byte[] bArrI = this.f49027b.i();
            this.f49046u = bArrI;
            this.f49027b.l(bArrI, this.f49035j);
            this.f49044s = this.f49027b.e(this.f49046u);
            this.f49040o = 3;
            C23120k<f.a> c23120k = this.f49033h;
            synchronized (c23120k.f47910b) {
                set = c23120k.f47912d;
            }
            Iterator<f.a> it = set.iterator();
            while (it.hasNext()) {
                it.next().d(3);
            }
            this.f49046u.getClass();
            return true;
        } catch (NotProvisionedException unused) {
            this.f49028c.c(this);
            return false;
        } catch (Exception e12) {
            j(1, e12);
            return false;
        }
    }

    public final void m(int i12, byte[] bArr, boolean z12) {
        try {
            l.b bVarG = this.f49027b.g(bArr, this.f49026a, i12, this.f49032g);
            this.f49048w = bVarG;
            c cVar = this.f49043r;
            int i13 = M.f47887a;
            bVarG.getClass();
            cVar.getClass();
            cVar.obtainMessage(1, new d(C23167s.f49826b.getAndIncrement(), z12, SystemClock.elapsedRealtime(), bVarG)).sendToTarget();
        } catch (Exception e12) {
            k(e12, true);
        }
    }

    public final void n() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f49038m;
        if (threadCurrentThread != looper.getThread()) {
            androidx.media3.common.util.s.h("DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
