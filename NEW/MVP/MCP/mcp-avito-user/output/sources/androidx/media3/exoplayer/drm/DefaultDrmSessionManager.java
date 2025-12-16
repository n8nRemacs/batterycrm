package androidx.media3.exoplayer.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.media3.common.C23097k;
import androidx.media3.common.C23108t;
import androidx.media3.common.D;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.analytics.w;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.f;
import androidx.media3.exoplayer.drm.g;
import androidx.media3.exoplayer.drm.l;
import androidx.media3.exoplayer.source.C23167s;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.H1;
import com.google.common.collect.O4;
import com.google.common.collect.W3;
import com.huawei.hms.support.api.entity.auth.AuthCode;
import j.P;
import j.X;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

@J
@X
/* loaded from: classes.dex */
public class DefaultDrmSessionManager implements androidx.media3.exoplayer.drm.g {

    /* renamed from: y, reason: collision with root package name */
    public static final /* synthetic */ int f49057y = 0;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f49058b;

    /* renamed from: c, reason: collision with root package name */
    public final l.g f49059c;

    /* renamed from: d, reason: collision with root package name */
    public final r f49060d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, String> f49061e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f49062f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f49063g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f49064h;

    /* renamed from: i, reason: collision with root package name */
    public final g f49065i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.l f49066j;

    /* renamed from: k, reason: collision with root package name */
    public final h f49067k;

    /* renamed from: l, reason: collision with root package name */
    public final long f49068l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f49069m;

    /* renamed from: n, reason: collision with root package name */
    public final Set<f> f49070n;

    /* renamed from: o, reason: collision with root package name */
    public final Set<DefaultDrmSession> f49071o;

    /* renamed from: p, reason: collision with root package name */
    public int f49072p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public l f49073q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public DefaultDrmSession f49074r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public DefaultDrmSession f49075s;

    /* renamed from: t, reason: collision with root package name */
    public Looper f49076t;

    /* renamed from: u, reason: collision with root package name */
    public Handler f49077u;

    /* renamed from: v, reason: collision with root package name */
    @P
    public byte[] f49078v;

    /* renamed from: w, reason: collision with root package name */
    public w f49079w;

    /* renamed from: x, reason: collision with root package name */
    @P
    public volatile d f49080x;

    public static final class MissingSchemeDataException extends Exception {
        public MissingSchemeDataException(UUID uuid, a aVar) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public static final class b {

        /* renamed from: d, reason: collision with root package name */
        public boolean f49084d;

        /* renamed from: f, reason: collision with root package name */
        public boolean f49086f;

        /* renamed from: a, reason: collision with root package name */
        public final HashMap<String, String> f49081a = new HashMap<>();

        /* renamed from: b, reason: collision with root package name */
        public UUID f49082b = C23097k.f47669d;

        /* renamed from: c, reason: collision with root package name */
        public androidx.media3.exoplayer.analytics.m f49083c = o.f49130d;

        /* renamed from: g, reason: collision with root package name */
        public final androidx.media3.exoplayer.upstream.k f49087g = new androidx.media3.exoplayer.upstream.k();

        /* renamed from: e, reason: collision with root package name */
        public int[] f49085e = new int[0];

        /* renamed from: h, reason: collision with root package name */
        public final long f49088h = 300000;
    }

    public class c implements l.d {
        public c(a aVar) {
        }
    }

    @SuppressLint({"HandlerLeak"})
    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            byte[] bArr = (byte[]) message.obj;
            if (bArr == null) {
                return;
            }
            Iterator it = DefaultDrmSessionManager.this.f49069m.iterator();
            while (it.hasNext()) {
                DefaultDrmSession defaultDrmSession = (DefaultDrmSession) it.next();
                defaultDrmSession.n();
                if (Arrays.equals(defaultDrmSession.f49046u, bArr)) {
                    if (message.what == 2 && defaultDrmSession.f49040o == 4) {
                        int i12 = M.f47887a;
                        defaultDrmSession.h(false);
                        return;
                    }
                    return;
                }
            }
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public class f implements g.b {

        /* renamed from: b, reason: collision with root package name */
        @P
        public final f.a f49091b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public DrmSession f49092c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f49093d;

        public f(@P f.a aVar) {
            this.f49091b = aVar;
        }

        @Override // androidx.media3.exoplayer.drm.g.b
        public final void release() {
            Handler handler = DefaultDrmSessionManager.this.f49077u;
            handler.getClass();
            M.I(handler, new androidx.media3.exoplayer.drm.b(this, 0));
        }
    }

    public class g implements DefaultDrmSession.a {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f49095a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        @P
        public DefaultDrmSession f49096b;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public final void a() {
            this.f49096b = null;
            HashSet hashSet = this.f49095a;
            AbstractC37401r1 abstractC37401r1V = AbstractC37401r1.v(hashSet);
            hashSet.clear();
            O4 o4ListIterator = abstractC37401r1V.listIterator(0);
            while (o4ListIterator.hasNext()) {
                DefaultDrmSession defaultDrmSession = (DefaultDrmSession) o4ListIterator.next();
                if (defaultDrmSession.l()) {
                    defaultDrmSession.h(true);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public final void b(Exception exc, boolean z12) {
            this.f49096b = null;
            HashSet hashSet = this.f49095a;
            AbstractC37401r1 abstractC37401r1V = AbstractC37401r1.v(hashSet);
            hashSet.clear();
            O4 o4ListIterator = abstractC37401r1V.listIterator(0);
            while (o4ListIterator.hasNext()) {
                DefaultDrmSession defaultDrmSession = (DefaultDrmSession) o4ListIterator.next();
                defaultDrmSession.getClass();
                defaultDrmSession.j(z12 ? 1 : 3, exc);
            }
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.a
        public final void c(DefaultDrmSession defaultDrmSession) {
            this.f49095a.add(defaultDrmSession);
            if (this.f49096b != null) {
                return;
            }
            this.f49096b = defaultDrmSession;
            l.h hVarH = defaultDrmSession.f49027b.h();
            defaultDrmSession.f49049x = hVarH;
            DefaultDrmSession.c cVar = defaultDrmSession.f49043r;
            int i12 = M.f47887a;
            hVarH.getClass();
            cVar.getClass();
            cVar.obtainMessage(0, new DefaultDrmSession.d(C23167s.f49826b.getAndIncrement(), true, SystemClock.elapsedRealtime(), hVarH)).sendToTarget();
        }
    }

    public class h implements DefaultDrmSession.b {
        public h(a aVar) {
        }

        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.b
        public final void a(DefaultDrmSession defaultDrmSession) {
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager.f49068l != -9223372036854775807L) {
                defaultDrmSessionManager.f49071o.remove(defaultDrmSession);
                Handler handler = defaultDrmSessionManager.f49077u;
                handler.getClass();
                handler.removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
        @Override // androidx.media3.exoplayer.drm.DefaultDrmSession.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(androidx.media3.exoplayer.drm.DefaultDrmSession r12, int r13) {
            /*
                r11 = this;
                r0 = 1
                r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                androidx.media3.exoplayer.drm.DefaultDrmSessionManager r3 = androidx.media3.exoplayer.drm.DefaultDrmSessionManager.this
                if (r13 != r0) goto L2c
                int r4 = r3.f49072p
                if (r4 <= 0) goto L2c
                long r4 = r3.f49068l
                int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r6 == 0) goto L2c
                java.util.Set<androidx.media3.exoplayer.drm.DefaultDrmSession> r13 = r3.f49071o
                r13.add(r12)
                android.os.Handler r13 = r3.f49077u
                r13.getClass()
                androidx.media3.exoplayer.drm.b r1 = new androidx.media3.exoplayer.drm.b
                r1.<init>(r12, r0)
                long r6 = android.os.SystemClock.uptimeMillis()
                long r6 = r6 + r4
                r13.postAtTime(r1, r12, r6)
                goto L9d
            L2c:
                if (r13 != 0) goto L9d
                java.util.ArrayList r13 = r3.f49069m
                r13.remove(r12)
                androidx.media3.exoplayer.drm.DefaultDrmSession r13 = r3.f49074r
                r0 = 0
                if (r13 != r12) goto L3a
                r3.f49074r = r0
            L3a:
                androidx.media3.exoplayer.drm.DefaultDrmSession r13 = r3.f49075s
                if (r13 != r12) goto L40
                r3.f49075s = r0
            L40:
                androidx.media3.exoplayer.drm.DefaultDrmSessionManager$g r13 = r3.f49065i
                java.util.HashSet r4 = r13.f49095a
                r4.remove(r12)
                androidx.media3.exoplayer.drm.DefaultDrmSession r5 = r13.f49096b
                if (r5 != r12) goto L8a
                r13.f49096b = r0
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L8a
                java.util.Iterator r0 = r4.iterator()
                java.lang.Object r0 = r0.next()
                androidx.media3.exoplayer.drm.DefaultDrmSession r0 = (androidx.media3.exoplayer.drm.DefaultDrmSession) r0
                r13.f49096b = r0
                androidx.media3.exoplayer.drm.l r13 = r0.f49027b
                androidx.media3.exoplayer.drm.l$h r10 = r13.h()
                r0.f49049x = r10
                androidx.media3.exoplayer.drm.DefaultDrmSession$c r13 = r0.f49043r
                int r0 = androidx.media3.common.util.M.f47887a
                r10.getClass()
                r13.getClass()
                androidx.media3.exoplayer.drm.DefaultDrmSession$d r0 = new androidx.media3.exoplayer.drm.DefaultDrmSession$d
                java.util.concurrent.atomic.AtomicLong r4 = androidx.media3.exoplayer.source.C23167s.f49826b
                long r5 = r4.getAndIncrement()
                long r8 = android.os.SystemClock.elapsedRealtime()
                r7 = 1
                r4 = r0
                r4.<init>(r5, r7, r8, r10)
                r4 = 0
                android.os.Message r13 = r13.obtainMessage(r4, r0)
                r13.sendToTarget()
            L8a:
                long r4 = r3.f49068l
                int r13 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r13 == 0) goto L9d
                android.os.Handler r13 = r3.f49077u
                r13.getClass()
                r13.removeCallbacksAndMessages(r12)
                java.util.Set<androidx.media3.exoplayer.drm.DefaultDrmSession> r13 = r3.f49071o
                r13.remove(r12)
            L9d:
                int r12 = androidx.media3.exoplayer.drm.DefaultDrmSessionManager.f49057y
                r3.j()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.drm.DefaultDrmSessionManager.h.b(androidx.media3.exoplayer.drm.DefaultDrmSession, int):void");
        }
    }

    public DefaultDrmSessionManager() {
        throw null;
    }

    public DefaultDrmSessionManager(UUID uuid, l.g gVar, r rVar, HashMap map, boolean z12, int[] iArr, boolean z13, androidx.media3.exoplayer.upstream.l lVar, long j12, a aVar) {
        uuid.getClass();
        C23110a.a("Use C.CLEARKEY_UUID instead", !C23097k.f47667b.equals(uuid));
        this.f49058b = uuid;
        this.f49059c = gVar;
        this.f49060d = rVar;
        this.f49061e = map;
        this.f49062f = z12;
        this.f49063g = iArr;
        this.f49064h = z13;
        this.f49066j = lVar;
        this.f49065i = new g();
        this.f49067k = new h(null);
        this.f49069m = new ArrayList();
        this.f49070n = W3.g();
        this.f49071o = W3.g();
        this.f49068l = j12;
    }

    public static boolean f(DrmSession drmSession) {
        DefaultDrmSession defaultDrmSession = (DefaultDrmSession) drmSession;
        defaultDrmSession.n();
        if (defaultDrmSession.f49040o == 1) {
            if (M.f47887a < 19) {
                return true;
            }
            DrmSession.DrmSessionException error = defaultDrmSession.getError();
            error.getClass();
            if (error.getCause() instanceof ResourceBusyException) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList i(DrmInitData drmInitData, UUID uuid, boolean z12) {
        ArrayList arrayList = new ArrayList(drmInitData.f47223e);
        for (int i12 = 0; i12 < drmInitData.f47223e; i12++) {
            DrmInitData.SchemeData schemeData = drmInitData.f47220b[i12];
            if ((schemeData.a(uuid) || (C23097k.f47668c.equals(uuid) && schemeData.a(C23097k.f47667b))) && (schemeData.f47228f != null || z12)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final int a(C23108t c23108t) {
        k(false);
        l lVar = this.f49073q;
        lVar.getClass();
        int iK2 = lVar.k();
        DrmInitData drmInitData = c23108t.f47760p;
        if (drmInitData == null) {
            int iF2 = D.f(c23108t.f47757m);
            int i12 = M.f47887a;
            int i13 = 0;
            while (true) {
                int[] iArr = this.f49063g;
                if (i13 >= iArr.length) {
                    i13 = -1;
                    break;
                }
                if (iArr[i13] == iF2) {
                    break;
                }
                i13++;
            }
            if (i13 != -1) {
                return iK2;
            }
            return 0;
        }
        if (this.f49078v == null) {
            UUID uuid = this.f49058b;
            if (i(drmInitData, uuid, true).isEmpty()) {
                if (drmInitData.f47223e != 1 || !drmInitData.f47220b[0].a(C23097k.f47667b)) {
                    return 1;
                }
                Objects.toString(uuid);
                androidx.media3.common.util.s.g();
            }
            String str = drmInitData.f47222d;
            if (str != null && !"cenc".equals(str)) {
                if ("cbcs".equals(str)) {
                    if (M.f47887a < 25) {
                        return 1;
                    }
                } else if ("cbc1".equals(str) || "cens".equals(str)) {
                    return 1;
                }
            }
        }
        return iK2;
    }

    @Override // androidx.media3.exoplayer.drm.g
    @P
    public final DrmSession b(@P f.a aVar, C23108t c23108t) {
        k(false);
        C23110a.g(this.f49072p > 0);
        C23110a.h(this.f49076t);
        return e(this.f49076t, aVar, c23108t, true);
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final g.b c(@P f.a aVar, C23108t c23108t) {
        C23110a.g(this.f49072p > 0);
        C23110a.h(this.f49076t);
        f fVar = new f(aVar);
        Handler handler = this.f49077u;
        handler.getClass();
        handler.post(new androidx.media3.exoplayer.drm.e(3, fVar, c23108t));
        return fVar;
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final void d(Looper looper, w wVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.f49076t;
                if (looper2 == null) {
                    this.f49076t = looper;
                    this.f49077u = new Handler(looper);
                } else {
                    C23110a.g(looper2 == looper);
                    this.f49077u.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f49079w = wVar;
    }

    @P
    public final DrmSession e(Looper looper, @P f.a aVar, C23108t c23108t, boolean z12) {
        ArrayList arrayListI;
        if (this.f49080x == null) {
            this.f49080x = new d(looper);
        }
        DrmInitData drmInitData = c23108t.f47760p;
        int i12 = 0;
        DefaultDrmSession defaultDrmSessionH = null;
        if (drmInitData == null) {
            int iF2 = D.f(c23108t.f47757m);
            l lVar = this.f49073q;
            lVar.getClass();
            if (lVar.k() == 2 && m.f49124d) {
                return null;
            }
            int[] iArr = this.f49063g;
            int i13 = M.f47887a;
            while (true) {
                if (i12 >= iArr.length) {
                    i12 = -1;
                    break;
                }
                if (iArr[i12] == iF2) {
                    break;
                }
                i12++;
            }
            if (i12 == -1 || lVar.k() == 1) {
                return null;
            }
            DefaultDrmSession defaultDrmSession = this.f49074r;
            if (defaultDrmSession == null) {
                DefaultDrmSession defaultDrmSessionH2 = h(AbstractC37401r1.C(), true, null, z12);
                this.f49069m.add(defaultDrmSessionH2);
                this.f49074r = defaultDrmSessionH2;
            } else {
                defaultDrmSession.g(null);
            }
            return this.f49074r;
        }
        if (this.f49078v == null) {
            arrayListI = i(drmInitData, this.f49058b, false);
            if (arrayListI.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f49058b, null);
                androidx.media3.common.util.s.d("DRM error", missingSchemeDataException);
                aVar.e(missingSchemeDataException);
                return new k(new DrmSession.DrmSessionException(missingSchemeDataException, AuthCode.StatusCode.CERT_FINGERPRINT_ERROR));
            }
        } else {
            arrayListI = null;
        }
        if (this.f49062f) {
            Iterator it = this.f49069m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                DefaultDrmSession defaultDrmSession2 = (DefaultDrmSession) it.next();
                if (M.a(defaultDrmSession2.f49026a, arrayListI)) {
                    defaultDrmSessionH = defaultDrmSession2;
                    break;
                }
            }
        } else {
            defaultDrmSessionH = this.f49075s;
        }
        if (defaultDrmSessionH == null) {
            defaultDrmSessionH = h(arrayListI, false, aVar, z12);
            if (!this.f49062f) {
                this.f49075s = defaultDrmSessionH;
            }
            this.f49069m.add(defaultDrmSessionH);
        } else {
            defaultDrmSessionH.g(aVar);
        }
        return defaultDrmSessionH;
    }

    public final DefaultDrmSession g(@P List<DrmInitData.SchemeData> list, boolean z12, @P f.a aVar) {
        this.f49073q.getClass();
        boolean z13 = this.f49064h | z12;
        l lVar = this.f49073q;
        byte[] bArr = this.f49078v;
        Looper looper = this.f49076t;
        looper.getClass();
        w wVar = this.f49079w;
        wVar.getClass();
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f49058b, lVar, this.f49065i, this.f49067k, list, z13, z12, bArr, this.f49061e, this.f49060d, looper, this.f49066j, wVar);
        defaultDrmSession.g(aVar);
        if (this.f49068l != -9223372036854775807L) {
            defaultDrmSession.g(null);
        }
        return defaultDrmSession;
    }

    public final DefaultDrmSession h(@P List<DrmInitData.SchemeData> list, boolean z12, @P f.a aVar, boolean z13) {
        DefaultDrmSession defaultDrmSessionG = g(list, z12, aVar);
        boolean zF2 = f(defaultDrmSessionG);
        long j12 = this.f49068l;
        Set<DefaultDrmSession> set = this.f49071o;
        if (zF2 && !set.isEmpty()) {
            Iterator it = H1.v(set).iterator();
            while (it.hasNext()) {
                ((DrmSession) it.next()).f(null);
            }
            defaultDrmSessionG.f(aVar);
            if (j12 != -9223372036854775807L) {
                defaultDrmSessionG.f(null);
            }
            defaultDrmSessionG = g(list, z12, aVar);
        }
        if (!f(defaultDrmSessionG) || !z13) {
            return defaultDrmSessionG;
        }
        Set<f> set2 = this.f49070n;
        if (set2.isEmpty()) {
            return defaultDrmSessionG;
        }
        Iterator it2 = H1.v(set2).iterator();
        while (it2.hasNext()) {
            ((f) it2.next()).release();
        }
        if (!set.isEmpty()) {
            Iterator it3 = H1.v(set).iterator();
            while (it3.hasNext()) {
                ((DrmSession) it3.next()).f(null);
            }
        }
        defaultDrmSessionG.f(aVar);
        if (j12 != -9223372036854775807L) {
            defaultDrmSessionG.f(null);
        }
        return g(list, z12, aVar);
    }

    public final void j() {
        if (this.f49073q != null && this.f49072p == 0 && this.f49069m.isEmpty() && this.f49070n.isEmpty()) {
            l lVar = this.f49073q;
            lVar.getClass();
            lVar.release();
            this.f49073q = null;
        }
    }

    public final void k(boolean z12) {
        if (z12 && this.f49076t == null) {
            androidx.media3.common.util.s.h("DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.f49076t;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            androidx.media3.common.util.s.h("DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.f49076t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final void prepare() {
        k(true);
        int i12 = this.f49072p;
        this.f49072p = i12 + 1;
        if (i12 != 0) {
            return;
        }
        if (this.f49073q == null) {
            l lVarC = this.f49059c.c(this.f49058b);
            this.f49073q = lVarC;
            lVarC.m(new c(null));
        } else {
            if (this.f49068l == -9223372036854775807L) {
                return;
            }
            int i13 = 0;
            while (true) {
                ArrayList arrayList = this.f49069m;
                if (i13 >= arrayList.size()) {
                    return;
                }
                ((DefaultDrmSession) arrayList.get(i13)).g(null);
                i13++;
            }
        }
    }

    @Override // androidx.media3.exoplayer.drm.g
    public final void release() {
        k(true);
        int i12 = this.f49072p - 1;
        this.f49072p = i12;
        if (i12 != 0) {
            return;
        }
        if (this.f49068l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f49069m);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((DefaultDrmSession) arrayList.get(i13)).f(null);
            }
        }
        Iterator it = H1.v(this.f49070n).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
        j();
    }
}
