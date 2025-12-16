package com.google.android.exoplayer2.drm;

import android.annotation.SuppressLint;
import android.media.ResourceBusyException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.google.android.exoplayer2.C36526i;
import com.google.android.exoplayer2.I;
import com.google.android.exoplayer2.drm.DefaultDrmSession;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.e;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.drm.k;
import com.google.android.exoplayer2.source.C36554q;
import com.google.android.exoplayer2.upstream.x;
import com.google.android.exoplayer2.upstream.z;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.U;
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

@X
/* loaded from: classes6.dex */
public class DefaultDrmSessionManager implements com.google.android.exoplayer2.drm.f {

    /* renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f344286x = 0;

    /* renamed from: b, reason: collision with root package name */
    public final UUID f344287b;

    /* renamed from: c, reason: collision with root package name */
    public final k.g f344288c;

    /* renamed from: d, reason: collision with root package name */
    public final q f344289d;

    /* renamed from: e, reason: collision with root package name */
    public final HashMap<String, String> f344290e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f344291f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f344292g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f344293h;

    /* renamed from: i, reason: collision with root package name */
    public final g f344294i;

    /* renamed from: j, reason: collision with root package name */
    public final z f344295j;

    /* renamed from: k, reason: collision with root package name */
    public final h f344296k;

    /* renamed from: l, reason: collision with root package name */
    public final long f344297l;

    /* renamed from: m, reason: collision with root package name */
    public final ArrayList f344298m;

    /* renamed from: n, reason: collision with root package name */
    public final Set<f> f344299n;

    /* renamed from: o, reason: collision with root package name */
    public final Set<DefaultDrmSession> f344300o;

    /* renamed from: p, reason: collision with root package name */
    public int f344301p;

    /* renamed from: q, reason: collision with root package name */
    @P
    public k f344302q;

    /* renamed from: r, reason: collision with root package name */
    @P
    public DefaultDrmSession f344303r;

    /* renamed from: s, reason: collision with root package name */
    @P
    public DefaultDrmSession f344304s;

    /* renamed from: t, reason: collision with root package name */
    public Looper f344305t;

    /* renamed from: u, reason: collision with root package name */
    public Handler f344306u;

    /* renamed from: v, reason: collision with root package name */
    public com.google.android.exoplayer2.analytics.p f344307v;

    /* renamed from: w, reason: collision with root package name */
    @P
    public volatile d f344308w;

    public static final class MissingSchemeDataException extends Exception {
        public MissingSchemeDataException(UUID uuid, a aVar) {
            super("Media does not support uuid: " + uuid);
        }
    }

    public static final class b {
        public b() {
            new HashMap();
            UUID uuid = C36526i.f345420d;
            new x();
        }
    }

    public class c implements k.d {
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
            Iterator it = DefaultDrmSessionManager.this.f344298m.iterator();
            while (it.hasNext()) {
                DefaultDrmSession defaultDrmSession = (DefaultDrmSession) it.next();
                if (Arrays.equals(defaultDrmSession.f344275t, bArr)) {
                    if (message.what == 2 && defaultDrmSession.f344269n == 4) {
                        int i12 = U.f348106a;
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

    public class f implements f.b {

        /* renamed from: b, reason: collision with root package name */
        @P
        public final e.a f344311b;

        /* renamed from: c, reason: collision with root package name */
        @P
        public DrmSession f344312c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f344313d;

        public f(@P e.a aVar) {
            this.f344311b = aVar;
        }

        @Override // com.google.android.exoplayer2.drm.f.b
        public final void release() {
            Handler handler = DefaultDrmSessionManager.this.f344306u;
            handler.getClass();
            U.K(handler, new com.google.android.exoplayer2.drm.b(this, 0));
        }
    }

    public class g implements DefaultDrmSession.a {

        /* renamed from: a, reason: collision with root package name */
        public final HashSet f344315a = new HashSet();

        /* renamed from: b, reason: collision with root package name */
        @P
        public DefaultDrmSession f344316b;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public final void a() {
            this.f344316b = null;
            HashSet hashSet = this.f344315a;
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
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public final void b(Exception exc, boolean z12) {
            this.f344316b = null;
            HashSet hashSet = this.f344315a;
            AbstractC37401r1 abstractC37401r1V = AbstractC37401r1.v(hashSet);
            hashSet.clear();
            O4 o4ListIterator = abstractC37401r1V.listIterator(0);
            while (o4ListIterator.hasNext()) {
                DefaultDrmSession defaultDrmSession = (DefaultDrmSession) o4ListIterator.next();
                defaultDrmSession.getClass();
                defaultDrmSession.j(z12 ? 1 : 3, exc);
            }
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.a
        public final void c(DefaultDrmSession defaultDrmSession) {
            this.f344315a.add(defaultDrmSession);
            if (this.f344316b != null) {
                return;
            }
            this.f344316b = defaultDrmSession;
            k.h hVarH = defaultDrmSession.f344257b.h();
            defaultDrmSession.f344278w = hVarH;
            DefaultDrmSession.c cVar = defaultDrmSession.f344272q;
            int i12 = U.f348106a;
            hVarH.getClass();
            cVar.getClass();
            cVar.obtainMessage(0, new DefaultDrmSession.d(C36554q.f346661b.getAndIncrement(), true, SystemClock.elapsedRealtime(), hVarH)).sendToTarget();
        }
    }

    public class h implements DefaultDrmSession.b {
        public h(a aVar) {
        }

        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        public final void a(DefaultDrmSession defaultDrmSession) {
            DefaultDrmSessionManager defaultDrmSessionManager = DefaultDrmSessionManager.this;
            if (defaultDrmSessionManager.f344297l != -9223372036854775807L) {
                defaultDrmSessionManager.f344300o.remove(defaultDrmSession);
                Handler handler = defaultDrmSessionManager.f344306u;
                handler.getClass();
                handler.removeCallbacksAndMessages(defaultDrmSession);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
        @Override // com.google.android.exoplayer2.drm.DefaultDrmSession.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void b(com.google.android.exoplayer2.drm.DefaultDrmSession r12, int r13) {
            /*
                r11 = this;
                r0 = 1
                r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager r3 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.this
                if (r13 != r0) goto L2c
                int r4 = r3.f344301p
                if (r4 <= 0) goto L2c
                long r4 = r3.f344297l
                int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r6 == 0) goto L2c
                java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> r13 = r3.f344300o
                r13.add(r12)
                android.os.Handler r13 = r3.f344306u
                r13.getClass()
                com.google.android.exoplayer2.drm.b r1 = new com.google.android.exoplayer2.drm.b
                r1.<init>(r12, r0)
                long r6 = android.os.SystemClock.uptimeMillis()
                long r6 = r6 + r4
                r13.postAtTime(r1, r12, r6)
                goto L9d
            L2c:
                if (r13 != 0) goto L9d
                java.util.ArrayList r13 = r3.f344298m
                r13.remove(r12)
                com.google.android.exoplayer2.drm.DefaultDrmSession r13 = r3.f344303r
                r0 = 0
                if (r13 != r12) goto L3a
                r3.f344303r = r0
            L3a:
                com.google.android.exoplayer2.drm.DefaultDrmSession r13 = r3.f344304s
                if (r13 != r12) goto L40
                r3.f344304s = r0
            L40:
                com.google.android.exoplayer2.drm.DefaultDrmSessionManager$g r13 = r3.f344294i
                java.util.HashSet r4 = r13.f344315a
                r4.remove(r12)
                com.google.android.exoplayer2.drm.DefaultDrmSession r5 = r13.f344316b
                if (r5 != r12) goto L8a
                r13.f344316b = r0
                boolean r0 = r4.isEmpty()
                if (r0 != 0) goto L8a
                java.util.Iterator r0 = r4.iterator()
                java.lang.Object r0 = r0.next()
                com.google.android.exoplayer2.drm.DefaultDrmSession r0 = (com.google.android.exoplayer2.drm.DefaultDrmSession) r0
                r13.f344316b = r0
                com.google.android.exoplayer2.drm.k r13 = r0.f344257b
                com.google.android.exoplayer2.drm.k$h r10 = r13.h()
                r0.f344278w = r10
                com.google.android.exoplayer2.drm.DefaultDrmSession$c r13 = r0.f344272q
                int r0 = com.google.android.exoplayer2.util.U.f348106a
                r10.getClass()
                r13.getClass()
                com.google.android.exoplayer2.drm.DefaultDrmSession$d r0 = new com.google.android.exoplayer2.drm.DefaultDrmSession$d
                java.util.concurrent.atomic.AtomicLong r4 = com.google.android.exoplayer2.source.C36554q.f346661b
                long r5 = r4.getAndIncrement()
                long r8 = android.os.SystemClock.elapsedRealtime()
                r7 = 1
                r4 = r0
                r4.<init>(r5, r7, r8, r10)
                r4 = 0
                android.os.Message r13 = r13.obtainMessage(r4, r0)
                r13.sendToTarget()
            L8a:
                long r4 = r3.f344297l
                int r13 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
                if (r13 == 0) goto L9d
                android.os.Handler r13 = r3.f344306u
                r13.getClass()
                r13.removeCallbacksAndMessages(r12)
                java.util.Set<com.google.android.exoplayer2.drm.DefaultDrmSession> r13 = r3.f344300o
                r13.remove(r12)
            L9d:
                int r12 = com.google.android.exoplayer2.drm.DefaultDrmSessionManager.f344286x
                r3.j()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.drm.DefaultDrmSessionManager.h.b(com.google.android.exoplayer2.drm.DefaultDrmSession, int):void");
        }
    }

    public DefaultDrmSessionManager() {
        throw null;
    }

    public DefaultDrmSessionManager(UUID uuid, k.g gVar, q qVar, HashMap map, boolean z12, int[] iArr, boolean z13, z zVar, long j12, a aVar) {
        uuid.getClass();
        C36585a.a("Use C.CLEARKEY_UUID instead", !C36526i.f345418b.equals(uuid));
        this.f344287b = uuid;
        this.f344288c = gVar;
        this.f344289d = qVar;
        this.f344290e = map;
        this.f344291f = z12;
        this.f344292g = iArr;
        this.f344293h = z13;
        this.f344295j = zVar;
        this.f344294i = new g();
        this.f344296k = new h(null);
        this.f344298m = new ArrayList();
        this.f344299n = W3.g();
        this.f344300o = W3.g();
        this.f344297l = j12;
    }

    public static boolean f(DrmSession drmSession) {
        DefaultDrmSession defaultDrmSession = (DefaultDrmSession) drmSession;
        if (defaultDrmSession.f344269n == 1) {
            if (U.f348106a < 19) {
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
        ArrayList arrayList = new ArrayList(drmInitData.f344321e);
        for (int i12 = 0; i12 < drmInitData.f344321e; i12++) {
            DrmInitData.SchemeData schemeData = drmInitData.f344318b[i12];
            if ((schemeData.a(uuid) || (C36526i.f345419c.equals(uuid) && schemeData.a(C36526i.f345418b))) && (schemeData.f344326f != null || z12)) {
                arrayList.add(schemeData);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final f.b a(@P e.a aVar, I i12) {
        C36585a.d(this.f344301p > 0);
        C36585a.e(this.f344305t);
        f fVar = new f(aVar);
        Handler handler = this.f344306u;
        handler.getClass();
        handler.post(new com.google.android.exoplayer2.drm.d(3, fVar, i12));
        return fVar;
    }

    @Override // com.google.android.exoplayer2.drm.f
    @P
    public final DrmSession b(@P e.a aVar, I i12) {
        C36585a.d(this.f344301p > 0);
        C36585a.e(this.f344305t);
        return e(this.f344305t, aVar, i12, true);
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final int c(I i12) {
        k kVar = this.f344302q;
        kVar.getClass();
        int iK2 = kVar.k();
        DrmInitData drmInitData = i12.f343479p;
        if (drmInitData == null) {
            int i13 = com.google.android.exoplayer2.util.z.i(i12.f343476m);
            int i14 = U.f348106a;
            int i15 = 0;
            while (true) {
                int[] iArr = this.f344292g;
                if (i15 >= iArr.length) {
                    i15 = -1;
                    break;
                }
                if (iArr[i15] == i13) {
                    break;
                }
                i15++;
            }
            if (i15 != -1) {
                return iK2;
            }
            return 0;
        }
        UUID uuid = this.f344287b;
        if (i(drmInitData, uuid, true).isEmpty()) {
            if (drmInitData.f344321e != 1 || !drmInitData.f344318b[0].a(C36526i.f345418b)) {
                return 1;
            }
            Objects.toString(uuid);
        }
        String str = drmInitData.f344320d;
        if (str != null && !"cenc".equals(str)) {
            if ("cbcs".equals(str)) {
                if (U.f348106a < 25) {
                    return 1;
                }
            } else if ("cbc1".equals(str) || "cens".equals(str)) {
                return 1;
            }
        }
        return iK2;
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final void d(Looper looper, com.google.android.exoplayer2.analytics.p pVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.f344305t;
                if (looper2 == null) {
                    this.f344305t = looper;
                    this.f344306u = new Handler(looper);
                } else {
                    C36585a.d(looper2 == looper);
                    this.f344306u.getClass();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f344307v = pVar;
    }

    @P
    public final DrmSession e(Looper looper, @P e.a aVar, I i12, boolean z12) {
        if (this.f344308w == null) {
            this.f344308w = new d(looper);
        }
        DrmInitData drmInitData = i12.f343479p;
        int i13 = 0;
        DefaultDrmSession defaultDrmSessionH = null;
        if (drmInitData != null) {
            ArrayList arrayListI = i(drmInitData, this.f344287b, false);
            if (arrayListI.isEmpty()) {
                MissingSchemeDataException missingSchemeDataException = new MissingSchemeDataException(this.f344287b, null);
                C36605v.a("DRM error", missingSchemeDataException);
                if (aVar != null) {
                    aVar.e(missingSchemeDataException);
                }
                return new j(new DrmSession.DrmSessionException(missingSchemeDataException, AuthCode.StatusCode.CERT_FINGERPRINT_ERROR));
            }
            if (this.f344291f) {
                Iterator it = this.f344298m.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    DefaultDrmSession defaultDrmSession = (DefaultDrmSession) it.next();
                    if (U.a(defaultDrmSession.f344256a, arrayListI)) {
                        defaultDrmSessionH = defaultDrmSession;
                        break;
                    }
                }
            } else {
                defaultDrmSessionH = this.f344304s;
            }
            if (defaultDrmSessionH == null) {
                defaultDrmSessionH = h(arrayListI, false, aVar, z12);
                if (!this.f344291f) {
                    this.f344304s = defaultDrmSessionH;
                }
                this.f344298m.add(defaultDrmSessionH);
            } else {
                defaultDrmSessionH.f(aVar);
            }
            return defaultDrmSessionH;
        }
        int i14 = com.google.android.exoplayer2.util.z.i(i12.f343476m);
        k kVar = this.f344302q;
        kVar.getClass();
        if (kVar.k() == 2 && l.f344348d) {
            return null;
        }
        int[] iArr = this.f344292g;
        int i15 = U.f348106a;
        while (true) {
            if (i13 >= iArr.length) {
                i13 = -1;
                break;
            }
            if (iArr[i13] == i14) {
                break;
            }
            i13++;
        }
        if (i13 == -1 || kVar.k() == 1) {
            return null;
        }
        DefaultDrmSession defaultDrmSession2 = this.f344303r;
        if (defaultDrmSession2 == null) {
            DefaultDrmSession defaultDrmSessionH2 = h(AbstractC37401r1.C(), true, null, z12);
            this.f344298m.add(defaultDrmSessionH2);
            this.f344303r = defaultDrmSessionH2;
        } else {
            defaultDrmSession2.f(null);
        }
        return this.f344303r;
    }

    public final DefaultDrmSession g(@P List<DrmInitData.SchemeData> list, boolean z12, @P e.a aVar) {
        this.f344302q.getClass();
        boolean z13 = this.f344293h | z12;
        k kVar = this.f344302q;
        Looper looper = this.f344305t;
        looper.getClass();
        com.google.android.exoplayer2.analytics.p pVar = this.f344307v;
        pVar.getClass();
        DefaultDrmSession defaultDrmSession = new DefaultDrmSession(this.f344287b, kVar, this.f344294i, this.f344296k, list, z13, z12, null, this.f344290e, this.f344289d, looper, this.f344295j, pVar);
        defaultDrmSession.f(aVar);
        if (this.f344297l != -9223372036854775807L) {
            defaultDrmSession.f(null);
        }
        return defaultDrmSession;
    }

    public final DefaultDrmSession h(@P List<DrmInitData.SchemeData> list, boolean z12, @P e.a aVar, boolean z13) {
        DefaultDrmSession defaultDrmSessionG = g(list, z12, aVar);
        boolean zF2 = f(defaultDrmSessionG);
        long j12 = this.f344297l;
        Set<DefaultDrmSession> set = this.f344300o;
        if (zF2 && !set.isEmpty()) {
            Iterator it = H1.v(set).iterator();
            while (it.hasNext()) {
                ((DrmSession) it.next()).e(null);
            }
            defaultDrmSessionG.e(aVar);
            if (j12 != -9223372036854775807L) {
                defaultDrmSessionG.e(null);
            }
            defaultDrmSessionG = g(list, z12, aVar);
        }
        if (!f(defaultDrmSessionG) || !z13) {
            return defaultDrmSessionG;
        }
        Set<f> set2 = this.f344299n;
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
                ((DrmSession) it3.next()).e(null);
            }
        }
        defaultDrmSessionG.e(aVar);
        if (j12 != -9223372036854775807L) {
            defaultDrmSessionG.e(null);
        }
        return g(list, z12, aVar);
    }

    public final void j() {
        if (this.f344302q != null && this.f344301p == 0 && this.f344298m.isEmpty() && this.f344299n.isEmpty()) {
            k kVar = this.f344302q;
            kVar.getClass();
            kVar.release();
            this.f344302q = null;
        }
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final void prepare() {
        int i12 = this.f344301p;
        this.f344301p = i12 + 1;
        if (i12 != 0) {
            return;
        }
        if (this.f344302q == null) {
            k kVarC = this.f344288c.c(this.f344287b);
            this.f344302q = kVarC;
            kVarC.l(new c(null));
        } else {
            if (this.f344297l == -9223372036854775807L) {
                return;
            }
            int i13 = 0;
            while (true) {
                ArrayList arrayList = this.f344298m;
                if (i13 >= arrayList.size()) {
                    return;
                }
                ((DefaultDrmSession) arrayList.get(i13)).f(null);
                i13++;
            }
        }
    }

    @Override // com.google.android.exoplayer2.drm.f
    public final void release() {
        int i12 = this.f344301p - 1;
        this.f344301p = i12;
        if (i12 != 0) {
            return;
        }
        if (this.f344297l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.f344298m);
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                ((DefaultDrmSession) arrayList.get(i13)).e(null);
            }
        }
        Iterator it = H1.v(this.f344299n).iterator();
        while (it.hasNext()) {
            ((f) it.next()).release();
        }
        j();
    }
}
