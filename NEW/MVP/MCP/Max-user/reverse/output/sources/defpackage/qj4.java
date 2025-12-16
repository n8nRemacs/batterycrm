package defpackage;

import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import org.webrtc.EglBase;
import org.webrtc.EglBase10Impl;
import org.webrtc.EglBase14Impl;
import org.webrtc.EglRenderer;
import org.webrtc.VideoTrack;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class qj4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qj4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        long j2;
        long j3;
        e10 e10Var;
        zj5 zj5Var;
        ReentrantReadWriteLock.ReadLock lock;
        int readHoldCount;
        ReentrantReadWriteLock.WriteLock writeLock;
        long j4;
        ArrayList arrayList;
        long j5;
        int i;
        long j6;
        int i2 = 0;
        boolean z = true;
        switch (this.a) {
            case 0:
                ak4 ak4Var = (ak4) this.b;
                if (ak4Var.h0 >= 300000) {
                    ((mw8) ak4Var.s.b).Z1 = true;
                    ak4Var.h0 = 0L;
                    return;
                }
                return;
            case 1:
                ql4 ql4Var = (ql4) this.b;
                if (ql4Var.c) {
                    return;
                }
                z45 z45Var = ql4Var.b;
                if (z45Var != null) {
                    z45Var.c(ql4Var.a);
                }
                ql4Var.d.n.remove(ql4Var);
                ql4Var.c = true;
                return;
            case 2:
                ((pl4) this.b).c(null);
                return;
            case 3:
                ap4 ap4Var = (ap4) this.b;
                synchronized (ap4Var.f) {
                    ((y6d) ap4Var.b).log("DefaultRemoteVideoTracks", ap4Var + ": remove remote video renderers");
                    for (Map.Entry entry : ap4Var.f.entrySet()) {
                        if (((nt1) entry.getKey()).a == cdh.a) {
                            VideoTrack videoTrack = (VideoTrack) ap4Var.g.get((String) ap4Var.i.get(entry.getKey()));
                            for (fch fchVar : (List) entry.getValue()) {
                                fchVar.a = null;
                                if (videoTrack != null) {
                                    try {
                                        videoTrack.removeSink(fchVar);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                    ap4Var.f.clear();
                    ap4Var.g.clear();
                }
                return;
            case 4:
                ((fsf) this.b).close();
                return;
            case 5:
                yp4 yp4Var = (yp4) this.b;
                yp4Var.t0 = true;
                yp4Var.a();
                return;
            case 6:
                ((rr4) this.b).h.L();
                return;
            case 7:
                ((d4h) this.b).O();
                return;
            case 8:
                ((ur4) this.b).g.c();
                return;
            case 9:
                ((wu1) this.b).cancel(true);
                return;
            case 10:
                f35 f35Var = (f35) this.b;
                String str = f35.g;
                kz4 kz4Var = f35Var.b;
                yy7[] yy7VarArr = f35.f;
                yy7 yy7Var = yy7VarArr[0];
                if (!((fxa) kz4Var.get()).b()) {
                    wqi.e(str, "restoreUploads: not authorized", null);
                    return;
                }
                wqi.c(str, "restoreUploadsFromStorage: ", new Object[0]);
                kz4 kz4Var2 = f35Var.d;
                yy7 yy7Var2 = yy7VarArr[2];
                int i3 = 1;
                Object wr8Var = new wr8(new ora(new vr8(new wr8(((n35) kz4Var2.get()).a(), tha.v0, i3), uha.v0, 0), wha.u0, 5).s(), jbe.u0, i3);
                azi.b(wr8Var instanceof on6 ? ((on6) wr8Var).b() : new vk3(i3, wr8Var), new y6i(14, f35Var), b6a.u0, pdf.d);
                return;
            case 11:
                ((AnimationDrawable) this.b).start();
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                d65 d65Var = (d65) this.b;
                boolean zIsPopupShowing = d65Var.h.isPopupShowing();
                d65Var.t(zIsPopupShowing);
                d65Var.m = zIsPopupShowing;
                return;
            case 13:
                i65 i65Var = (i65) this.b;
                i65Var.X = true;
                i65Var.a();
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                k65 k65Var = (k65) ((t86) this.b).d;
                if (k65Var != null) {
                    Iterator it = k65Var.values().iterator();
                    while (it.hasNext()) {
                        ((dsf) it.next()).c();
                    }
                    return;
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                e85 e85Var = (e85) this.b;
                e85Var.getClass();
                try {
                    e85Var.d.getClass();
                    return;
                } catch (Throwable th) {
                    e85Var.a.reportException("ProtocolInfo", "rtc.command.handle.command.onsent", th);
                    return;
                }
            case 16:
                ((EglBase10Impl.EglConnection) this.b).lambda$new$0();
                return;
            case LangUtils.HASH_SEED /* 17 */:
                ((EglBase14Impl.EglConnection) this.b).lambda$new$0();
                return;
            case 18:
                ((EglRenderer) this.b).renderFrameOnRenderThread();
                return;
            case 19:
                ((EglBase.EglConnection) this.b).release();
                return;
            case 20:
                sb5 sb5Var = (sb5) this.b;
                try {
                    c7c c7cVar = (c7c) sb5Var.a.getValue();
                    if (c7cVar != null) {
                        Iterator it2 = c7cVar.c.entrySet().iterator();
                        while (it2.hasNext()) {
                            d7c d7cVar = (d7c) ((Map.Entry) it2.next()).getValue();
                            d7cVar.g = null;
                            d7cVar.h = null;
                            d7cVar.i = null;
                            d7cVar.j = null;
                            d7cVar.k = null;
                            d7cVar.l = null;
                            d7cVar.m = null;
                            d7cVar.n = false;
                            d7cVar.o = false;
                            d7cVar.p = false;
                            pb2 pb2Var = d7cVar.f;
                            if (pb2Var != null) {
                                d7cVar.i(pb2Var);
                            }
                        }
                    }
                    ((ve2) sb5Var.b.getValue()).X();
                    ((qv3) sb5Var.c.getValue()).l();
                    wqi.c("sb5", "Success invalidate cache", new Object[0]);
                    return;
                } catch (Throwable th2) {
                    wqi.e("sb5", "Can't invalidate cache", th2);
                    return;
                }
            case 21:
                ((ye5) this.b).a();
                return;
            case 22:
                yf5.setRefreshingNext$lambda$3((yf5) this.b);
                return;
            case 23:
                zj5 zj5Var2 = (zj5) this.b;
                zj5Var2.s0 = Thread.currentThread();
                f4b f4bVar = zj5Var2.b;
                switch (f4bVar.a) {
                    case 0:
                        j = f4bVar.b;
                        break;
                    default:
                        j = f4bVar.b;
                        break;
                }
                f4b f4bVar2 = zj5Var2.b;
                switch (f4bVar2.a) {
                    case 0:
                        j2 = f4bVar2.c;
                        break;
                    default:
                        j2 = f4bVar2.c;
                        break;
                }
                e10 e10Var2 = new e10();
                e10Var2.e = zj5Var2;
                e10Var2.a = j2;
                e10Var2.c = new AtomicBoolean(true);
                e10Var2.d = new qj4(24, e10Var2);
                e10Var2.b = zj5.c(zj5Var2.g(), j2);
                while (!zj5Var2.a.isTerminated() && !zj5Var2.d) {
                    e10Var2.a();
                    long jK = s65.d(j, j2) <= 0 ? j : j2;
                    long jC = zj5.c(zj5Var2.g(), j);
                    ReentrantReadWriteLock.ReadLock lock2 = zj5Var2.Y.readLock();
                    lock2.lock();
                    try {
                        boolean z2 = zj5Var2.X.f != 0 ? z : false;
                        while (z2 && s65.d(zj5Var2.g(), jC) < 0) {
                            try {
                                ReentrantReadWriteLock reentrantReadWriteLock = zj5Var2.Y;
                                lock = reentrantReadWriteLock.readLock();
                                readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                                for (int i4 = 0; i4 < readHoldCount; i4++) {
                                    lock.unlock();
                                }
                                writeLock = reentrantReadWriteLock.writeLock();
                                writeLock.lock();
                            } catch (InterruptedException unused2) {
                                j3 = j2;
                                e10Var = e10Var2;
                                zj5Var = zj5Var2;
                            }
                            try {
                                int i5 = s65.d;
                                zj5 zj5Var3 = zj5Var2;
                                try {
                                    long jI = v9j.i(zj5Var2.Z.awaitNanos(s65.h(jK)), y65.NANOSECONDS);
                                    for (int i6 = 0; i6 < readHoldCount; i6++) {
                                        try {
                                            lock.lock();
                                        } catch (InterruptedException unused3) {
                                            j3 = j2;
                                            e10Var = e10Var2;
                                            zj5Var = zj5Var3;
                                            jK = s65.k(s65.k(jC, zj5Var.g()), v9j.h(1, y65.NANOSECONDS));
                                            zj5Var2 = zj5Var;
                                            j2 = j3;
                                            e10Var2 = e10Var;
                                        }
                                    }
                                    writeLock.unlock();
                                    if (s65.d(jI, 0L) > 0) {
                                        j3 = j2;
                                        e10Var = e10Var2;
                                        j4 = jK;
                                        zj5Var = zj5Var3;
                                    } else {
                                        long jG = zj5Var3.g();
                                        j3 = j2;
                                        try {
                                            if (s65.d(s65.k(jG, jC), 0L) > 0) {
                                                zj5Var = zj5Var3;
                                                try {
                                                    if (zj5Var.d) {
                                                        e10Var = e10Var2;
                                                        j4 = jK;
                                                    } else {
                                                        yj8 yj8Var = zj5Var.X;
                                                        long[] jArr = yj8Var.c;
                                                        Object[] objArr = yj8Var.d;
                                                        long[] jArr2 = yj8Var.b;
                                                        int length = jArr2.length - 2;
                                                        if (length >= 0) {
                                                            int i7 = 0;
                                                            arrayList = null;
                                                            while (true) {
                                                                long j7 = jArr2[i7];
                                                                ArrayList arrayList2 = arrayList;
                                                                e10Var = e10Var2;
                                                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                                                                    int i9 = 0;
                                                                    while (i9 < i8) {
                                                                        if ((j7 & 255) < 128) {
                                                                            int i10 = (i7 << 3) + i9;
                                                                            try {
                                                                                long j8 = jArr[i10];
                                                                                j5 = j7;
                                                                                ckh ckhVar = (ckh) objArr[i10];
                                                                                i = i9;
                                                                                j6 = jK;
                                                                                if (s65.d(ckhVar.b(jG), j) > 0) {
                                                                                    ArrayList arrayList3 = arrayList2 == null ? new ArrayList(zj5Var.X.f) : arrayList2;
                                                                                    arrayList3.add(ckhVar);
                                                                                    arrayList2 = arrayList3;
                                                                                }
                                                                            } catch (InterruptedException unused4) {
                                                                                jK = s65.k(s65.k(jC, zj5Var.g()), v9j.h(1, y65.NANOSECONDS));
                                                                                zj5Var2 = zj5Var;
                                                                                j2 = j3;
                                                                                e10Var2 = e10Var;
                                                                            }
                                                                        } else {
                                                                            j5 = j7;
                                                                            i = i9;
                                                                            j6 = jK;
                                                                        }
                                                                        i9 = i + 1;
                                                                        j7 = j5 >> 8;
                                                                        jK = j6;
                                                                    }
                                                                    j4 = jK;
                                                                    if (i8 != 8) {
                                                                        arrayList = arrayList2;
                                                                    }
                                                                } else {
                                                                    j4 = jK;
                                                                }
                                                                arrayList = arrayList2;
                                                                if (i7 != length) {
                                                                    i7++;
                                                                    e10Var2 = e10Var;
                                                                    jK = j4;
                                                                }
                                                            }
                                                        } else {
                                                            e10Var = e10Var2;
                                                            j4 = jK;
                                                            arrayList = null;
                                                        }
                                                        if (arrayList != null && !arrayList.isEmpty()) {
                                                            zj5Var.b.a(arrayList);
                                                        }
                                                    }
                                                } catch (InterruptedException unused5) {
                                                    e10Var = e10Var2;
                                                    jK = s65.k(s65.k(jC, zj5Var.g()), v9j.h(1, y65.NANOSECONDS));
                                                    zj5Var2 = zj5Var;
                                                    j2 = j3;
                                                    e10Var2 = e10Var;
                                                }
                                            } else {
                                                e10Var = e10Var2;
                                                j4 = jK;
                                                zj5Var = zj5Var3;
                                            }
                                            e10Var.a();
                                        } catch (InterruptedException unused6) {
                                            e10Var = e10Var2;
                                            zj5Var = zj5Var3;
                                            jK = s65.k(s65.k(jC, zj5Var.g()), v9j.h(1, y65.NANOSECONDS));
                                            zj5Var2 = zj5Var;
                                            j2 = j3;
                                            e10Var2 = e10Var;
                                        }
                                    }
                                    zj5Var2 = zj5Var;
                                    j2 = j3;
                                    e10Var2 = e10Var;
                                    jK = j4;
                                } catch (Throwable th3) {
                                    th = th3;
                                    j3 = j2;
                                    e10Var = e10Var2;
                                    zj5Var = zj5Var3;
                                    for (int i11 = 0; i11 < readHoldCount; i11++) {
                                        lock.lock();
                                    }
                                    writeLock.unlock();
                                    throw th;
                                    break;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                j3 = j2;
                                e10Var = e10Var2;
                                zj5Var = zj5Var2;
                            }
                        }
                        long j9 = j2;
                        e10 e10Var3 = e10Var2;
                        zj5 zj5Var4 = zj5Var2;
                        lock2.unlock();
                        zj5Var2 = zj5Var4;
                        j2 = j9;
                        e10Var2 = e10Var3;
                        z = true;
                    } finally {
                        lock2.unlock();
                    }
                }
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((AtomicBoolean) ((e10) this.b).c).set(true);
                return;
            case 25:
                em5 em5Var = (em5) this.b;
                a9 a9Var = em5Var.P0;
                Context context = em5Var.X;
                String str2 = zxg.a;
                Integer numValueOf = Integer.valueOf(j40.a(context).generateAudioSessionId());
                a9Var.f = numValueOf;
                rf0 rf0Var = new rf0(a9Var, numValueOf, i2);
                wwf wwfVar = (wwf) a9Var.c;
                if (wwfVar.a.getLooper().getThread().isAlive()) {
                    wwfVar.d(rf0Var);
                    return;
                }
                return;
            case 26:
                v4c v4cVar = (v4c) this.b;
                try {
                    synchronized (v4cVar) {
                    }
                    try {
                        v4cVar.a.a(v4cVar.d, v4cVar.e);
                        return;
                    } finally {
                        v4cVar.b(true);
                    }
                } catch (ExoPlaybackException e) {
                    pai.c("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e);
                    throw new RuntimeException(e);
                }
            case 27:
                w4c w4cVar = (w4c) this.b;
                try {
                    synchronized (w4cVar) {
                    }
                    try {
                        w4cVar.a.a(w4cVar.c, w4cVar.d);
                        return;
                    } finally {
                        w4cVar.a(true);
                    }
                } catch (androidx.media3.exoplayer.ExoPlaybackException e2) {
                    a8i.h("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e2);
                    throw new RuntimeException(e2);
                }
            case 28:
                ((fn5) this.b).c();
                return;
            default:
                ap5 ap5Var = (ap5) this.b;
                ((iy1) ap5Var.a).g(new yo5(ap5Var, i2), true);
                return;
        }
    }

    public /* synthetic */ qj4(rr4 rr4Var, qr4 qr4Var) {
        this.a = 6;
        this.b = rr4Var;
    }

    public /* synthetic */ qj4(Handler.Callback callback, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
