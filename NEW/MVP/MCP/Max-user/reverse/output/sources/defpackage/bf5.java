package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.LruCache;
import android.util.Range;
import android.view.Surface;
import androidx.camera.video.internal.compat.quirk.EncoderNotUsePersistentInputSurfaceQuirk;
import androidx.camera.video.internal.compat.quirk.SignalEosOutputBufferNotComeQuirk;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class bf5 implements je5 {
    public static final Range E;
    public ScheduledFuture C;
    public int D;
    public final String a;
    public final boolean c;
    public final MediaFormat d;
    public final MediaCodec e;
    public final ge5 f;
    public final i3 g;
    public final qee h;
    public final ha8 i;
    public final tu1 j;
    public final f9g p;
    public final Object b = new Object();
    public final ArrayDeque k = new ArrayDeque();
    public final ArrayDeque l = new ArrayDeque();
    public final HashSet m = new HashSet();
    public final HashSet n = new HashSet();
    public final ArrayDeque o = new ArrayDeque();
    public final xxf q = new xxf();
    public ke5 r = ke5.q;
    public Executor s = ayi.a();
    public Range t = E;
    public long u = 0;
    public boolean v = false;
    public Long w = null;
    public ScheduledFuture x = null;
    public ye5 y = null;
    public boolean z = false;
    public boolean A = false;
    public boolean B = false;

    static {
        Long lValueOf = Long.valueOf(BuildConfig.MAX_TIME_TO_UPLOAD);
        E = Range.create(lValueOf, lValueOf);
    }

    public bf5(Executor executor, me5 me5Var) throws InvalidConfigException, IOException {
        executor.getClass();
        me5Var.getClass();
        LruCache lruCache = fd3.a;
        try {
            MediaCodec mediaCodecCreateEncoderByType = MediaCodec.createEncoderByType(me5Var.a());
            this.e = mediaCodecCreateEncoderByType;
            MediaCodecInfo codecInfo = mediaCodecCreateEncoderByType.getCodecInfo();
            this.h = new qee(executor);
            MediaFormat mediaFormatB = me5Var.b();
            this.d = mediaFormatB;
            f9g f9gVarC = me5Var.c();
            this.p = f9gVarC;
            if (me5Var instanceof e90) {
                this.a = "AudioEncoder";
                this.c = false;
                this.f = new we5(this);
                f30 f30Var = new f30(codecInfo, me5Var.a());
                Objects.requireNonNull(((MediaCodecInfo.CodecCapabilities) f30Var.b).getAudioCapabilities());
                this.g = f30Var;
            } else {
                if (!(me5Var instanceof bc0)) {
                    throw new InvalidConfigException("Unknown encoder config type");
                }
                this.a = "VideoEncoder";
                this.c = true;
                this.f = new ze5(this);
                g3h g3hVar = new g3h(codecInfo, me5Var.a());
                if (mediaFormatB.containsKey("bitrate")) {
                    int integer = mediaFormatB.getInteger("bitrate");
                    int iIntValue = ((Integer) g3hVar.c.getBitrateRange().clamp(Integer.valueOf(integer))).intValue();
                    if (integer != iIntValue) {
                        mediaFormatB.setInteger("bitrate", iIntValue);
                        gri.a("VideoEncoder", "updated bitrate from " + integer + " to " + iIntValue);
                    }
                }
                this.g = g3hVar;
            }
            gri.a(this.a, "mInputTimebase = " + f9gVarC);
            gri.a(this.a, "mMediaFormat = " + mediaFormatB);
            try {
                h();
                AtomicReference atomicReference = new AtomicReference();
                this.i = wsf.g(ixi.a(new tu0(atomicReference, 4)));
                tu1 tu1Var = (tu1) atomicReference.get();
                tu1Var.getClass();
                this.j = tu1Var;
                i(1);
            } catch (MediaCodec.CodecException e) {
                throw new InvalidConfigException(e);
            }
        } catch (IOException | IllegalArgumentException e2) {
            throw new InvalidConfigException(e2);
        }
    }

    public final ha8 a() {
        switch (az1.v(this.D)) {
            case 0:
                return new ag7(1, new IllegalStateException("Encoder is not started yet."));
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                AtomicReference atomicReference = new AtomicReference();
                wu1 wu1VarA = ixi.a(new tu0(atomicReference, 3));
                tu1 tu1Var = (tu1) atomicReference.get();
                tu1Var.getClass();
                this.l.offer(tu1Var);
                tu1Var.a(new kr4(this, 16, tu1Var), this.h);
                c();
                return wu1VarA;
            case 7:
                return new ag7(1, new IllegalStateException("Encoder is in error state."));
            case 8:
                return new ag7(1, new IllegalStateException("Encoder is released."));
            default:
                throw new IllegalStateException("Unknown state: ".concat(u45.t(this.D)));
        }
    }

    public final void b(int i, String str, Throwable th) {
        switch (az1.v(this.D)) {
            case 0:
                d(i, str, th);
                h();
                break;
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                i(8);
                l(new qe5(this, i, str, th, 0));
                break;
            case 7:
                gri.j(this.a, "Get more than one error: " + str + "(" + i + ")", th);
                break;
        }
    }

    public final void c() {
        while (true) {
            ArrayDeque arrayDeque = this.l;
            if (arrayDeque.isEmpty()) {
                return;
            }
            ArrayDeque arrayDeque2 = this.k;
            if (arrayDeque2.isEmpty()) {
                return;
            }
            tu1 tu1Var = (tu1) arrayDeque.poll();
            Objects.requireNonNull(tu1Var);
            Integer num = (Integer) arrayDeque2.poll();
            Objects.requireNonNull(num);
            try {
                em7 em7Var = new em7(this.e, num.intValue());
                if (tu1Var.b(em7Var)) {
                    this.m.add(em7Var);
                    wsf.g(em7Var.d).d(new kr4(this, 14, em7Var), this.h);
                } else {
                    em7Var.a();
                }
            } catch (MediaCodec.CodecException e) {
                b(1, e.getMessage(), e);
                return;
            }
        }
    }

    public final void d(int i, String str, Throwable th) {
        ke5 ke5Var;
        Executor executor;
        synchronized (this.b) {
            ke5Var = this.r;
            executor = this.s;
        }
        try {
            executor.execute(new se5(ke5Var, i, str, th));
        } catch (RejectedExecutionException e) {
            gri.c(this.a, "Unable to post to the supplied executor.", e);
        }
    }

    public final void e() {
        this.q.getClass();
        this.h.execute(new pe5(this, xxf.b(), 0));
    }

    public final void f() {
        Surface surface;
        HashSet hashSet;
        if (this.z) {
            this.e.stop();
            this.z = false;
        }
        this.e.release();
        ge5 ge5Var = this.f;
        if (ge5Var instanceof ze5) {
            ze5 ze5Var = (ze5) ge5Var;
            synchronized (ze5Var.a) {
                surface = ze5Var.b;
                ze5Var.b = null;
                hashSet = new HashSet(ze5Var.c);
                ze5Var.c.clear();
            }
            if (surface != null) {
                surface.release();
            }
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((Surface) it.next()).release();
            }
        }
        i(9);
        this.j.b(null);
    }

    public final void g() {
        this.e.setParameters(ho7.e(0, "request-sync"));
    }

    public final void h() {
        r2h r2hVar;
        Executor executor;
        this.t = E;
        this.u = 0L;
        this.o.clear();
        this.k.clear();
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            ((tu1) it.next()).c();
        }
        this.l.clear();
        this.e.reset();
        this.z = false;
        this.A = false;
        this.B = false;
        this.v = false;
        ScheduledFuture scheduledFuture = this.x;
        Surface surfaceCreateInputSurface = null;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.x = null;
        }
        ScheduledFuture scheduledFuture2 = this.C;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            this.C = null;
        }
        ye5 ye5Var = this.y;
        if (ye5Var != null) {
            ye5Var.j = true;
        }
        ye5 ye5Var2 = new ye5(this);
        this.y = ye5Var2;
        this.e.setCallback(ye5Var2);
        this.e.configure(this.d, (Surface) null, (MediaCrypto) null, 1);
        ge5 ge5Var = this.f;
        if (ge5Var instanceof ze5) {
            ze5 ze5Var = (ze5) ge5Var;
            ze5Var.getClass();
            EncoderNotUsePersistentInputSurfaceQuirk encoderNotUsePersistentInputSurfaceQuirk = (EncoderNotUsePersistentInputSurfaceQuirk) pv4.a.e(EncoderNotUsePersistentInputSurfaceQuirk.class);
            synchronized (ze5Var.a) {
                try {
                    if (encoderNotUsePersistentInputSurfaceQuirk == null) {
                        if (ze5Var.b == null) {
                            surfaceCreateInputSurface = MediaCodec.createPersistentInputSurface();
                            ze5Var.b = surfaceCreateInputSurface;
                        }
                        ze5Var.X.e.setInputSurface(ze5Var.b);
                    } else {
                        Surface surface = ze5Var.b;
                        if (surface != null) {
                            ze5Var.c.add(surface);
                        }
                        surfaceCreateInputSurface = ze5Var.X.e.createInputSurface();
                        ze5Var.b = surfaceCreateInputSurface;
                    }
                    r2hVar = ze5Var.d;
                    executor = ze5Var.o;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (surfaceCreateInputSurface == null || r2hVar == null || executor == null) {
                return;
            }
            try {
                executor.execute(new kr4(r2hVar, 24, surfaceCreateInputSurface));
            } catch (RejectedExecutionException e) {
                gri.c(ze5Var.X.a, "Unable to post to the supplied executor.", e);
            }
        }
    }

    public final void i(int i) {
        if (this.D == i) {
            return;
        }
        gri.a(this.a, "Transitioning encoder internal state: " + u45.t(this.D) + " --> " + u45.t(i));
        this.D = i;
    }

    public final void j() {
        gri.a(this.a, "signalCodecStop");
        ge5 ge5Var = this.f;
        if (ge5Var instanceof we5) {
            ((we5) ge5Var).a(false);
            ArrayList arrayList = new ArrayList();
            Iterator it = this.m.iterator();
            while (it.hasNext()) {
                arrayList.add(wsf.g(((em7) it.next()).d));
            }
            wsf.k(arrayList).d(new ne5(this, 2), this.h);
            return;
        }
        if (ge5Var instanceof ze5) {
            try {
                if (pv4.a.e(SignalEosOutputBufferNotComeQuirk.class) != null) {
                    ye5 ye5Var = this.y;
                    qee qeeVar = this.h;
                    ScheduledFuture scheduledFuture = this.C;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.C = ayi.d().schedule(new kr4(qeeVar, 15, ye5Var), 1000L, TimeUnit.MILLISECONDS);
                }
                this.e.signalEndOfInputStream();
                this.B = true;
            } catch (MediaCodec.CodecException e) {
                b(1, e.getMessage(), e);
            }
        }
    }

    public final void k() {
        this.q.getClass();
        this.h.execute(new pe5(this, xxf.b(), 1));
    }

    public final void l(Runnable runnable) {
        String str = this.a;
        gri.a(str, "stopMediaCodec");
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = this.n;
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            arrayList.add(wsf.g(((ae5) it.next()).o));
        }
        HashSet hashSet2 = this.m;
        Iterator it2 = hashSet2.iterator();
        while (it2.hasNext()) {
            arrayList.add(wsf.g(((em7) it2.next()).d));
        }
        if (!arrayList.isEmpty()) {
            gri.a(str, "Waiting for resources to return. encoded data = " + hashSet.size() + ", input buffers = " + hashSet2.size());
        }
        wsf.k(arrayList).d(new se5(this, arrayList, runnable, 1), this.h);
    }
}
