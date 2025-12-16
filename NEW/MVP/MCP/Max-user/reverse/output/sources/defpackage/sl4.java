package defpackage;

import android.media.ResourceBusyException;
import android.media.UnsupportedSchemeException;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.UnsupportedDrmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;

/* loaded from: classes.dex */
public final class sl4 implements k55 {
    public final UUID b;
    public final os5 c;
    public final dl6 d;
    public final HashMap e;
    public final boolean f;
    public final int[] g;
    public final boolean h;
    public final h79 i;
    public final tha j;
    public final kce k;
    public final long l;
    public final ArrayList m;
    public final Set n;
    public final Set o;
    public int p;
    public el5 q;
    public pl4 r;
    public pl4 s;
    public Looper t;
    public Handler u;
    public byte[] v;
    public n4c w;
    public volatile ey x;

    public sl4(UUID uuid, dl6 dl6Var, HashMap map, boolean z, int[] iArr, boolean z2, tha thaVar) {
        uuid.getClass();
        hsi.a("Use C.CLEARKEY_UUID instead", !cy0.b.equals(uuid));
        this.b = uuid;
        this.c = lk6.o;
        this.d = dl6Var;
        this.e = map;
        this.f = z;
        this.g = iArr;
        this.h = z2;
        this.j = thaVar;
        this.i = new h79(15);
        this.k = new kce(15, this);
        this.m = new ArrayList();
        this.n = Collections.newSetFromMap(new IdentityHashMap());
        this.o = Collections.newSetFromMap(new IdentityHashMap());
        this.l = 300000L;
    }

    public static boolean f(pl4 pl4Var) {
        pl4Var.n();
        if (pl4Var.o != 1) {
            return false;
        }
        DrmSession$DrmSessionException drmSession$DrmSessionExceptionF = pl4Var.f();
        drmSession$DrmSessionExceptionF.getClass();
        Throwable cause = drmSession$DrmSessionExceptionF.getCause();
        return (cause instanceof ResourceBusyException) || t9j.c(cause);
    }

    public static ArrayList i(y45 y45Var, UUID uuid, boolean z) {
        ArrayList arrayList = new ArrayList(y45Var.d);
        for (int i = 0; i < y45Var.d; i++) {
            w45 w45Var = y45Var.a[i];
            if ((w45Var.a(uuid) || (cy0.c.equals(uuid) && w45Var.a(cy0.b))) && (w45Var.o != null || z)) {
                arrayList.add(w45Var);
            }
        }
        return arrayList;
    }

    @Override // defpackage.k55
    public final z45 a(d55 d55Var, hf6 hf6Var) {
        k(false);
        hsi.g(this.p > 0);
        hsi.h(this.t);
        return e(this.t, d55Var, hf6Var, true);
    }

    @Override // defpackage.k55
    public final i55 b(d55 d55Var, hf6 hf6Var) {
        hsi.g(this.p > 0);
        hsi.h(this.t);
        ql4 ql4Var = new ql4(this, d55Var);
        Handler handler = this.u;
        handler.getClass();
        handler.post(new my1(ql4Var, 24, hf6Var));
        return ql4Var;
    }

    @Override // defpackage.k55
    public final void c(Looper looper, n4c n4cVar) {
        synchronized (this) {
            try {
                Looper looper2 = this.t;
                if (looper2 == null) {
                    this.t = looper;
                    this.u = new Handler(looper);
                } else {
                    hsi.g(looper2 == looper);
                    this.u.getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.w = n4cVar;
    }

    @Override // defpackage.k55
    public final int d(hf6 hf6Var) {
        k(false);
        el5 el5Var = this.q;
        el5Var.getClass();
        int iH = el5Var.H();
        y45 y45Var = hf6Var.r;
        if (y45Var == null) {
            int iH2 = xz9.h(hf6Var.n);
            int i = 0;
            while (true) {
                int[] iArr = this.g;
                if (i >= iArr.length) {
                    i = -1;
                    break;
                }
                if (iArr[i] == iH2) {
                    break;
                }
                i++;
            }
            if (i == -1) {
                return 0;
            }
        } else if (this.v == null) {
            UUID uuid = this.b;
            if (i(y45Var, uuid, true).isEmpty()) {
                if (y45Var.d == 1 && y45Var.a[0].a(cy0.b)) {
                    a8i.l("DefaultDrmSessionMgr", "DrmInitData only contains common PSSH SchemeData. Assuming support for: " + uuid);
                }
                return 1;
            }
            String str = y45Var.c;
            if (str != null && !"cenc".equals(str) && !"cbcs".equals(str) && ("cbc1".equals(str) || "cens".equals(str))) {
                return 1;
            }
        }
        return iH;
    }

    public final z45 e(Looper looper, d55 d55Var, hf6 hf6Var, boolean z) {
        ArrayList arrayListI;
        if (this.x == null) {
            this.x = new ey(this, looper, 3);
        }
        y45 y45Var = hf6Var.r;
        int i = 0;
        pl4 pl4Var = null;
        if (y45Var == null) {
            int iH = xz9.h(hf6Var.n);
            el5 el5Var = this.q;
            el5Var.getClass();
            if (el5Var.H() != 2 || !jk6.c) {
                int[] iArr = this.g;
                while (true) {
                    if (i >= iArr.length) {
                        i = -1;
                        break;
                    }
                    if (iArr[i] == iH) {
                        break;
                    }
                    i++;
                }
                if (i != -1 && el5Var.H() != 1) {
                    pl4 pl4Var2 = this.r;
                    if (pl4Var2 == null) {
                        t76 t76Var = wg7.b;
                        pl4 pl4VarH = h(zjd.o, true, null, z);
                        this.m.add(pl4VarH);
                        this.r = pl4VarH;
                    } else {
                        pl4Var2.d(null);
                    }
                    return this.r;
                }
            }
            return null;
        }
        if (this.v == null) {
            arrayListI = i(y45Var, this.b, false);
            if (arrayListI.isEmpty()) {
                DefaultDrmSessionManager$MissingSchemeDataException defaultDrmSessionManager$MissingSchemeDataException = new DefaultDrmSessionManager$MissingSchemeDataException("Media does not support uuid: " + this.b);
                a8i.h("DefaultDrmSessionMgr", "DRM error", defaultDrmSessionManager$MissingSchemeDataException);
                if (d55Var != null) {
                    d55Var.d(defaultDrmSessionManager$MissingSchemeDataException);
                }
                return new jh5(new DrmSession$DrmSessionException(6003, defaultDrmSessionManager$MissingSchemeDataException));
            }
        } else {
            arrayListI = null;
        }
        if (this.f) {
            Iterator it = this.m.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                pl4 pl4Var3 = (pl4) it.next();
                if (Objects.equals(pl4Var3.a, arrayListI)) {
                    pl4Var = pl4Var3;
                    break;
                }
            }
        } else {
            pl4Var = this.s;
        }
        if (pl4Var != null) {
            pl4Var.d(d55Var);
            return pl4Var;
        }
        pl4 pl4VarH2 = h(arrayListI, false, d55Var, z);
        if (!this.f) {
            this.s = pl4VarH2;
        }
        this.m.add(pl4VarH2);
        return pl4VarH2;
    }

    public final pl4 g(List list, boolean z, d55 d55Var) {
        this.q.getClass();
        boolean z2 = this.h | z;
        el5 el5Var = this.q;
        byte[] bArr = this.v;
        Looper looper = this.t;
        looper.getClass();
        n4c n4cVar = this.w;
        n4cVar.getClass();
        pl4 pl4Var = new pl4(this.b, el5Var, this.i, this.k, list, z2, z, bArr, this.e, this.d, looper, this.j, n4cVar);
        pl4Var.d(d55Var);
        if (this.l != -9223372036854775807L) {
            pl4Var.d(null);
        }
        return pl4Var;
    }

    public final pl4 h(List list, boolean z, d55 d55Var, boolean z2) {
        pl4 pl4VarG = g(list, z, d55Var);
        boolean zF = f(pl4VarG);
        long j = this.l;
        Set set = this.o;
        if (zF && !set.isEmpty()) {
            rrg it = hh7.j(set).iterator();
            while (it.hasNext()) {
                ((z45) it.next()).c(null);
            }
            pl4VarG.c(d55Var);
            if (j != -9223372036854775807L) {
                pl4VarG.c(null);
            }
            pl4VarG = g(list, z, d55Var);
        }
        if (f(pl4VarG) && z2) {
            Set set2 = this.n;
            if (!set2.isEmpty()) {
                rrg it2 = hh7.j(set2).iterator();
                while (it2.hasNext()) {
                    ((ql4) it2.next()).release();
                }
                if (!set.isEmpty()) {
                    rrg it3 = hh7.j(set).iterator();
                    while (it3.hasNext()) {
                        ((z45) it3.next()).c(null);
                    }
                }
                pl4VarG.c(d55Var);
                if (j != -9223372036854775807L) {
                    pl4VarG.c(null);
                }
                return g(list, z, d55Var);
            }
        }
        return pl4VarG;
    }

    public final void j() {
        if (this.q != null && this.p == 0 && this.m.isEmpty() && this.n.isEmpty()) {
            el5 el5Var = this.q;
            el5Var.getClass();
            el5Var.release();
            this.q = null;
        }
    }

    public final void k(boolean z) {
        if (z && this.t == null) {
            a8i.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed before setPlayer(), possibly on the wrong thread.", new IllegalStateException());
            return;
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.t;
        looper.getClass();
        if (threadCurrentThread != looper.getThread()) {
            a8i.m("DefaultDrmSessionMgr", "DefaultDrmSessionManager accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + this.t.getThread().getName(), new IllegalStateException());
        }
    }

    @Override // defpackage.k55
    public final void prepare() throws UnsupportedDrmException {
        el5 b6aVar;
        k(true);
        int i = this.p;
        this.p = i + 1;
        if (i != 0) {
            return;
        }
        if (this.q == null) {
            UUID uuid = this.b;
            this.c.getClass();
            try {
                try {
                    try {
                        b6aVar = new lk6(uuid);
                    } catch (Exception e) {
                        throw new UnsupportedDrmException(e);
                    }
                } catch (UnsupportedSchemeException e2) {
                    throw new UnsupportedDrmException(e2);
                }
            } catch (UnsupportedDrmException unused) {
                a8i.g("FrameworkMediaDrm", "Failed to instantiate a FrameworkMediaDrm for uuid: " + uuid + ".");
                b6aVar = new b6a(19);
            }
            this.q = b6aVar;
            b6aVar.D(new ukd(15, this));
            return;
        }
        if (this.l == -9223372036854775807L) {
            return;
        }
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.m;
            if (i2 >= arrayList.size()) {
                return;
            }
            ((pl4) arrayList.get(i2)).d(null);
            i2++;
        }
    }

    @Override // defpackage.k55
    public final void release() {
        k(true);
        int i = this.p - 1;
        this.p = i;
        if (i != 0) {
            return;
        }
        if (this.l != -9223372036854775807L) {
            ArrayList arrayList = new ArrayList(this.m);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((pl4) arrayList.get(i2)).c(null);
            }
        }
        rrg it = hh7.j(this.n).iterator();
        while (it.hasNext()) {
            ((ql4) it.next()).release();
        }
        j();
    }
}
