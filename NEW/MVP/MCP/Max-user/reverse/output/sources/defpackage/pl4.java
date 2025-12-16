package defpackage;

import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.drm.KeysExpiredException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class pl4 implements z45 {
    public final List a;
    public final el5 b;
    public final h79 c;
    public final kce d;
    public final boolean e;
    public final boolean f;
    public final HashMap g;
    public final q74 h;
    public final tha i;
    public final n4c j;
    public final dl6 k;
    public final UUID l;
    public final Looper m;
    public final ey n;
    public int o;
    public int p;
    public HandlerThread q;
    public nl4 r;
    public xa4 s;
    public DrmSession$DrmSessionException t;
    public byte[] u;
    public byte[] v;
    public cl5 w;
    public dl5 x;

    public pl4(UUID uuid, el5 el5Var, h79 h79Var, kce kceVar, List list, boolean z, boolean z2, byte[] bArr, HashMap map, dl6 dl6Var, Looper looper, tha thaVar, n4c n4cVar) {
        this.l = uuid;
        this.c = h79Var;
        this.d = kceVar;
        this.b = el5Var;
        this.e = z;
        this.f = z2;
        if (bArr != null) {
            this.v = bArr;
            this.a = null;
        } else {
            list.getClass();
            this.a = Collections.unmodifiableList(list);
        }
        this.g = map;
        this.k = dl6Var;
        this.h = new q74();
        this.i = thaVar;
        this.j = n4cVar;
        this.o = 2;
        this.m = looper;
        this.n = new ey(this, looper, 2);
    }

    @Override // defpackage.z45
    public final UUID a() {
        n();
        return this.l;
    }

    @Override // defpackage.z45
    public final boolean b() {
        n();
        return this.e;
    }

    @Override // defpackage.z45
    public final void c(d55 d55Var) {
        n();
        int i = this.p;
        if (i <= 0) {
            a8i.g("DefaultDrmSession", "release() called on a session that's already fully released.");
            return;
        }
        int i2 = i - 1;
        this.p = i2;
        if (i2 == 0) {
            this.o = 0;
            ey eyVar = this.n;
            String str = zxg.a;
            eyVar.removeCallbacksAndMessages(null);
            nl4 nl4Var = this.r;
            synchronized (nl4Var) {
                nl4Var.removeCallbacksAndMessages(null);
                nl4Var.b = true;
            }
            this.r = null;
            this.q.quit();
            this.q = null;
            this.s = null;
            this.t = null;
            this.w = null;
            this.x = null;
            byte[] bArr = this.u;
            if (bArr != null) {
                this.b.w(bArr);
                this.u = null;
            }
        }
        if (d55Var != null) {
            q74 q74Var = this.h;
            synchronized (q74Var.a) {
                try {
                    Integer num = (Integer) q74Var.b.get(d55Var);
                    if (num != null) {
                        ArrayList arrayList = new ArrayList(q74Var.d);
                        arrayList.remove(d55Var);
                        q74Var.d = Collections.unmodifiableList(arrayList);
                        if (num.intValue() == 1) {
                            q74Var.b.remove(d55Var);
                            HashSet hashSet = new HashSet(q74Var.c);
                            hashSet.remove(d55Var);
                            q74Var.c = Collections.unmodifiableSet(hashSet);
                        } else {
                            q74Var.b.put(d55Var, Integer.valueOf(num.intValue() - 1));
                        }
                    }
                } finally {
                }
            }
            if (this.h.a(d55Var) == 0) {
                d55Var.e();
            }
        }
        kce kceVar = this.d;
        int i3 = this.p;
        sl4 sl4Var = (sl4) kceVar.b;
        if (i3 == 1 && sl4Var.p > 0 && sl4Var.l != -9223372036854775807L) {
            sl4Var.o.add(this);
            Handler handler = sl4Var.u;
            handler.getClass();
            handler.postAtTime(new qj4(2, this), this, SystemClock.uptimeMillis() + sl4Var.l);
        } else if (i3 == 0) {
            sl4Var.m.remove(this);
            if (sl4Var.r == this) {
                sl4Var.r = null;
            }
            if (sl4Var.s == this) {
                sl4Var.s = null;
            }
            h79 h79Var = sl4Var.i;
            HashSet hashSet2 = (HashSet) h79Var.b;
            hashSet2.remove(this);
            if (((pl4) h79Var.c) == this) {
                h79Var.c = null;
                if (!hashSet2.isEmpty()) {
                    pl4 pl4Var = (pl4) hashSet2.iterator().next();
                    h79Var.c = pl4Var;
                    dl5 dl5VarJ = pl4Var.b.j();
                    pl4Var.x = dl5VarJ;
                    nl4 nl4Var2 = pl4Var.r;
                    String str2 = zxg.a;
                    dl5VarJ.getClass();
                    nl4Var2.getClass();
                    nl4Var2.obtainMessage(1, new ol4(ub8.c.getAndIncrement(), true, SystemClock.elapsedRealtime(), dl5VarJ)).sendToTarget();
                }
            }
            if (sl4Var.l != -9223372036854775807L) {
                Handler handler2 = sl4Var.u;
                handler2.getClass();
                handler2.removeCallbacksAndMessages(this);
                sl4Var.o.remove(this);
            }
        }
        sl4Var.j();
    }

    @Override // defpackage.z45
    public final void d(d55 d55Var) {
        n();
        if (this.p < 0) {
            a8i.g("DefaultDrmSession", "Session reference count less than zero: " + this.p);
            this.p = 0;
        }
        if (d55Var != null) {
            q74 q74Var = this.h;
            synchronized (q74Var.a) {
                try {
                    ArrayList arrayList = new ArrayList(q74Var.d);
                    arrayList.add(d55Var);
                    q74Var.d = Collections.unmodifiableList(arrayList);
                    Integer num = (Integer) q74Var.b.get(d55Var);
                    if (num == null) {
                        HashSet hashSet = new HashSet(q74Var.c);
                        hashSet.add(d55Var);
                        q74Var.c = Collections.unmodifiableSet(hashSet);
                    }
                    q74Var.b.put(d55Var, Integer.valueOf(num != null ? num.intValue() + 1 : 1));
                } finally {
                }
            }
        }
        int i = this.p + 1;
        this.p = i;
        if (i == 1) {
            hsi.g(this.o == 2);
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:DrmRequestHandler");
            this.q = handlerThread;
            handlerThread.start();
            this.r = new nl4(this, this.q.getLooper());
            if (l()) {
                h(true);
            }
        } else if (d55Var != null && i() && this.h.a(d55Var) == 1) {
            d55Var.c(this.o);
        }
        sl4 sl4Var = (sl4) this.d.b;
        if (sl4Var.l != -9223372036854775807L) {
            sl4Var.o.remove(this);
            Handler handler = sl4Var.u;
            handler.getClass();
            handler.removeCallbacksAndMessages(this);
        }
    }

    @Override // defpackage.z45
    public final boolean e(String str) {
        n();
        byte[] bArr = this.u;
        hsi.h(bArr);
        return this.b.K(str, bArr);
    }

    @Override // defpackage.z45
    public final DrmSession$DrmSessionException f() {
        n();
        if (this.o == 1) {
            return this.t;
        }
        return null;
    }

    @Override // defpackage.z45
    public final xa4 g() {
        n();
        return this.s;
    }

    @Override // defpackage.z45
    public final int getState() {
        n();
        return this.o;
    }

    public final void h(boolean z) {
        long jMin;
        String str;
        Set set;
        if (this.f) {
            return;
        }
        byte[] bArr = this.u;
        String str2 = zxg.a;
        boolean z2 = true;
        if (this.v == null) {
            m(1, z, bArr);
            return;
        }
        if (this.o != 4) {
            try {
                this.b.s(this.u, this.v);
            } catch (Exception | NoSuchMethodError e) {
                j(1, e);
                z2 = false;
            }
            if (!z2) {
                return;
            }
        }
        if (cy0.d.equals(this.l)) {
            n();
            byte[] bArr2 = this.u;
            Pair pair = null;
            Map mapC = bArr2 == null ? null : this.b.c(bArr2);
            if (mapC != null) {
                long j = -9223372036854775807L;
                try {
                    str = (String) mapC.get("LicenseDurationRemaining");
                } catch (NumberFormatException unused) {
                }
                long j2 = str != null ? Long.parseLong(str) : -9223372036854775807L;
                Long lValueOf = Long.valueOf(j2);
                try {
                    String str3 = (String) mapC.get("PlaybackDurationRemaining");
                    if (str3 != null) {
                        j = Long.parseLong(str3);
                    }
                } catch (NumberFormatException unused2) {
                }
                pair = new Pair(lValueOf, Long.valueOf(j));
            }
            pair.getClass();
            jMin = Math.min(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
        } else {
            jMin = BuildConfig.MAX_TIME_TO_UPLOAD;
        }
        if (jMin <= 60) {
            a8i.e("DefaultDrmSession", "Offline license has expired or will expire soon. Remaining seconds: " + jMin);
            m(2, z, bArr);
            return;
        }
        if (jMin <= 0) {
            j(2, new KeysExpiredException());
            return;
        }
        this.o = 4;
        q74 q74Var = this.h;
        synchronized (q74Var.a) {
            set = q74Var.c;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((d55) it.next()).b();
        }
    }

    public final boolean i() {
        int i = this.o;
        return i == 3 || i == 4;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r6, java.lang.Throwable r7) {
        /*
            r5 = this;
            androidx.media3.exoplayer.drm.DrmSession$DrmSessionException r0 = new androidx.media3.exoplayer.drm.DrmSession$DrmSessionException
            boolean r1 = r7 instanceof android.media.MediaDrm.MediaDrmStateException
            r2 = 1
            if (r1 == 0) goto L17
            r6 = r7
            android.media.MediaDrm$MediaDrmStateException r6 = (android.media.MediaDrm.MediaDrmStateException) r6
            java.lang.String r6 = r6.getDiagnosticInfo()
            int r6 = defpackage.zxg.B(r6)
            int r6 = defpackage.zxg.A(r6)
            goto L5c
        L17:
            boolean r1 = r7 instanceof android.media.MediaDrmResetException
            r3 = 6006(0x1776, float:8.416E-42)
            if (r1 == 0) goto L1f
        L1d:
            r6 = r3
            goto L5c
        L1f:
            boolean r1 = r7 instanceof android.media.NotProvisionedException
            r4 = 6002(0x1772, float:8.41E-42)
            if (r1 != 0) goto L54
            boolean r1 = defpackage.t9j.b(r7)
            if (r1 == 0) goto L2c
            goto L54
        L2c:
            boolean r1 = r7 instanceof android.media.DeniedByServerException
            if (r1 == 0) goto L33
            r6 = 6007(0x1777, float:8.418E-42)
            goto L5c
        L33:
            boolean r1 = r7 instanceof androidx.media3.exoplayer.drm.UnsupportedDrmException
            if (r1 == 0) goto L3a
            r6 = 6001(0x1771, float:8.409E-42)
            goto L5c
        L3a:
            boolean r1 = r7 instanceof androidx.media3.exoplayer.drm.DefaultDrmSessionManager$MissingSchemeDataException
            if (r1 == 0) goto L41
            r6 = 6003(0x1773, float:8.412E-42)
            goto L5c
        L41:
            boolean r1 = r7 instanceof androidx.media3.exoplayer.drm.KeysExpiredException
            if (r1 == 0) goto L48
            r6 = 6008(0x1778, float:8.419E-42)
            goto L5c
        L48:
            if (r6 != r2) goto L4b
            goto L1d
        L4b:
            r1 = 2
            if (r6 != r1) goto L51
            r6 = 6004(0x1774, float:8.413E-42)
            goto L5c
        L51:
            r1 = 3
            if (r6 != r1) goto L56
        L54:
            r6 = r4
            goto L5c
        L56:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>()
            throw r6
        L5c:
            r0.<init>(r6, r7)
            r5.t = r0
            java.lang.String r6 = "DefaultDrmSession"
            java.lang.String r0 = "DRM session error"
            defpackage.a8i.h(r6, r0, r7)
            boolean r6 = r7 instanceof java.lang.Exception
            if (r6 == 0) goto L8e
            q74 r6 = r5.h
            java.lang.Object r0 = r6.a
            monitor-enter(r0)
            java.util.Set r6 = r6.c     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            java.util.Iterator r6 = r6.iterator()
        L78:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La2
            java.lang.Object r0 = r6.next()
            d55 r0 = (defpackage.d55) r0
            r1 = r7
            java.lang.Exception r1 = (java.lang.Exception) r1
            r0.d(r1)
            goto L78
        L8b:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8b
            throw r6
        L8e:
            boolean r6 = r7 instanceof java.lang.Error
            if (r6 == 0) goto Laa
            boolean r6 = defpackage.t9j.c(r7)
            if (r6 != 0) goto La2
            boolean r6 = defpackage.t9j.b(r7)
            if (r6 == 0) goto L9f
            goto La2
        L9f:
            java.lang.Error r7 = (java.lang.Error) r7
            throw r7
        La2:
            int r6 = r5.o
            r7 = 4
            if (r6 == r7) goto La9
            r5.o = r2
        La9:
            return
        Laa:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Unexpected Throwable subclass"
            r6.<init>(r0, r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl4.j(int, java.lang.Throwable):void");
    }

    public final void k(Throwable th, boolean z) {
        if ((th instanceof NotProvisionedException) || t9j.b(th)) {
            this.c.H(this);
        } else {
            j(z ? 1 : 2, th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean l() {
        /*
            r4 = this;
            boolean r0 = r4.i()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            el5 r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r0 = r0.p()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.u = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            el5 r2 = r4.b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            n4c r3 = r4.j     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r2.I(r0, r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            el5 r0 = r4.b     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            byte[] r2 = r4.u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            xa4 r0 = r0.n(r2)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r4.s = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0 = 3
            r4.o = r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            q74 r2 = r4.h     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.lang.Object r3 = r2.a     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            monitor-enter(r3)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            java.util.Set r2 = r2.c     // Catch: java.lang.Throwable -> L4a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L30:
            boolean r3 = r2.hasNext()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            if (r3 == 0) goto L40
            java.lang.Object r3 = r2.next()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            d55 r3 = (defpackage.d55) r3     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r3.c(r0)     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            goto L30
        L40:
            byte[] r0 = r4.u     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            r0.getClass()     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
            return r1
        L46:
            r0 = move-exception
            goto L4d
        L48:
            r0 = move-exception
            goto L4d
        L4a:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L4a
            throw r0     // Catch: java.lang.NoSuchMethodError -> L46 java.lang.Exception -> L48 android.media.NotProvisionedException -> L5d
        L4d:
            boolean r2 = defpackage.t9j.b(r0)
            if (r2 == 0) goto L59
            h79 r0 = r4.c
            r0.H(r4)
            goto L62
        L59:
            r4.j(r1, r0)
            goto L62
        L5d:
            h79 r0 = r4.c
            r0.H(r4)
        L62:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pl4.l():boolean");
    }

    public final void m(int i, boolean z, byte[] bArr) {
        try {
            cl5 cl5VarF = this.b.F(bArr, this.a, i, this.g);
            this.w = cl5VarF;
            nl4 nl4Var = this.r;
            String str = zxg.a;
            cl5VarF.getClass();
            nl4Var.getClass();
            nl4Var.obtainMessage(2, new ol4(ub8.c.getAndIncrement(), z, SystemClock.elapsedRealtime(), cl5VarF)).sendToTarget();
        } catch (Exception | NoSuchMethodError e) {
            k(e, true);
        }
    }

    public final void n() {
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.m;
        if (threadCurrentThread != looper.getThread()) {
            a8i.m("DefaultDrmSession", "DefaultDrmSession accessed on the wrong thread.\nCurrent thread: " + Thread.currentThread().getName() + "\nExpected thread: " + looper.getThread().getName(), new IllegalStateException());
        }
    }
}
