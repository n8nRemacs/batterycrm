package androidx.media3.exoplayer.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import androidx.media3.common.C23101l;
import androidx.media3.common.C23108t;
import androidx.media3.common.C23125v;
import androidx.media3.common.D;
import androidx.media3.common.InterfaceC23105p;
import androidx.media3.common.W;
import androidx.media3.common.X;
import androidx.media3.common.util.C;
import androidx.media3.common.util.C23110a;
import androidx.media3.common.util.H;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.u;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.C23138g;
import androidx.media3.exoplayer.C23139h;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.F;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.e0;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.l;
import androidx.media3.exoplayer.mediacodec.n;
import androidx.media3.exoplayer.mediacodec.q;
import androidx.media3.exoplayer.mediacodec.r;
import androidx.media3.exoplayer.mediacodec.s;
import androidx.media3.exoplayer.video.h;
import androidx.media3.exoplayer.video.l;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.O4;
import com.huawei.hms.adapter.internal.AvailableCode;
import j.InterfaceC42153i;
import j.InterfaceC42164u;
import j.P;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Pattern;
import v61.InterfaceC49173d;

/* compiled from: MediaCodecVideoRenderer.java */
@J
/* loaded from: classes.dex */
public class c extends MediaCodecRenderer {

    /* renamed from: n1, reason: collision with root package name */
    public static final int[] f50220n1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: o1, reason: collision with root package name */
    public static boolean f50221o1;

    /* renamed from: p1, reason: collision with root package name */
    public static boolean f50222p1;

    /* renamed from: F0, reason: collision with root package name */
    public final Context f50223F0;

    /* renamed from: G0, reason: collision with root package name */
    public final h f50224G0;

    /* renamed from: H0, reason: collision with root package name */
    public final l.a f50225H0;

    /* renamed from: I0, reason: collision with root package name */
    public final d f50226I0;

    /* renamed from: J0, reason: collision with root package name */
    public final long f50227J0;

    /* renamed from: K0, reason: collision with root package name */
    public final int f50228K0;

    /* renamed from: L0, reason: collision with root package name */
    public final boolean f50229L0;

    /* renamed from: M0, reason: collision with root package name */
    public b f50230M0;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f50231N0;

    /* renamed from: O0, reason: collision with root package name */
    public boolean f50232O0;

    /* renamed from: P0, reason: collision with root package name */
    @P
    public Surface f50233P0;

    /* renamed from: Q0, reason: collision with root package name */
    @P
    public PlaceholderSurface f50234Q0;

    /* renamed from: R0, reason: collision with root package name */
    public boolean f50235R0;

    /* renamed from: S0, reason: collision with root package name */
    public int f50236S0;

    /* renamed from: T0, reason: collision with root package name */
    public boolean f50237T0;

    /* renamed from: U0, reason: collision with root package name */
    public boolean f50238U0;

    /* renamed from: V0, reason: collision with root package name */
    public boolean f50239V0;

    /* renamed from: W0, reason: collision with root package name */
    public long f50240W0;

    /* renamed from: X0, reason: collision with root package name */
    public long f50241X0;

    /* renamed from: Y0, reason: collision with root package name */
    public long f50242Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int f50243Z0;

    /* renamed from: a1, reason: collision with root package name */
    public int f50244a1;

    /* renamed from: b1, reason: collision with root package name */
    public int f50245b1;

    /* renamed from: c1, reason: collision with root package name */
    public long f50246c1;

    /* renamed from: d1, reason: collision with root package name */
    public long f50247d1;

    /* renamed from: e1, reason: collision with root package name */
    public long f50248e1;

    /* renamed from: f1, reason: collision with root package name */
    public int f50249f1;

    /* renamed from: g1, reason: collision with root package name */
    public long f50250g1;

    /* renamed from: h1, reason: collision with root package name */
    public X f50251h1;

    /* renamed from: i1, reason: collision with root package name */
    @P
    public X f50252i1;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f50253j1;

    /* renamed from: k1, reason: collision with root package name */
    public int f50254k1;

    /* renamed from: l1, reason: collision with root package name */
    @P
    public C1845c f50255l1;

    /* renamed from: m1, reason: collision with root package name */
    @P
    public g f50256m1;

    /* compiled from: MediaCodecVideoRenderer.java */
    @j.X
    public static final class a {
        @InterfaceC42164u
        public static boolean a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display == null || !display.isHdr()) {
                return false;
            }
            for (int i12 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                if (i12 == 1) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f50257a;

        /* renamed from: b, reason: collision with root package name */
        public final int f50258b;

        /* renamed from: c, reason: collision with root package name */
        public final int f50259c;

        public b(int i12, int i13, int i14) {
            this.f50257a = i12;
            this.f50258b = i13;
            this.f50259c = i14;
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    @j.X
    /* renamed from: androidx.media3.exoplayer.video.c$c, reason: collision with other inner class name */
    public final class C1845c implements l.c, Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        public final Handler f50260b;

        public C1845c(androidx.media3.exoplayer.mediacodec.l lVar) {
            Handler handlerN = M.n(this);
            this.f50260b = handlerN;
            lVar.h(this, handlerN);
        }

        @Override // androidx.media3.exoplayer.mediacodec.l.c
        public final void a(long j12) {
            if (M.f47887a >= 30) {
                b(j12);
            } else {
                Handler handler = this.f50260b;
                handler.sendMessageAtFrontOfQueue(Message.obtain(handler, 0, (int) (j12 >> 32), (int) j12));
            }
        }

        public final void b(long j12) {
            c cVar = c.this;
            if (this != cVar.f50255l1 || cVar.f49259J == null) {
                return;
            }
            if (j12 == Long.MAX_VALUE) {
                cVar.f49310y0 = true;
                return;
            }
            try {
                cVar.D0(j12);
                cVar.K0(cVar.f50251h1);
                cVar.f49247A0.f49159e++;
                cVar.J0();
                cVar.l0(j12);
            } catch (ExoPlaybackException e12) {
                cVar.f49312z0 = e12;
            }
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            int i12 = message.arg1;
            int i13 = message.arg2;
            int i14 = M.f47887a;
            b(((i12 & 4294967295L) << 32) | (4294967295L & i13));
            return true;
        }
    }

    /* compiled from: MediaCodecVideoRenderer.java */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final h f50262a;

        /* renamed from: b, reason: collision with root package name */
        public final c f50263b;

        /* renamed from: e, reason: collision with root package name */
        public Handler f50266e;

        /* renamed from: f, reason: collision with root package name */
        @P
        public W f50267f;

        /* renamed from: g, reason: collision with root package name */
        @P
        public CopyOnWriteArrayList<InterfaceC23105p> f50268g;

        /* renamed from: h, reason: collision with root package name */
        public Pair<Long, C23108t> f50269h;

        /* renamed from: i, reason: collision with root package name */
        @P
        public Pair<Surface, C> f50270i;

        /* renamed from: l, reason: collision with root package name */
        public boolean f50273l;

        /* renamed from: m, reason: collision with root package name */
        public boolean f50274m;

        /* renamed from: c, reason: collision with root package name */
        public final ArrayDeque<Long> f50264c = new ArrayDeque<>();

        /* renamed from: d, reason: collision with root package name */
        public final ArrayDeque<Pair<Long, C23108t>> f50265d = new ArrayDeque<>();

        /* renamed from: j, reason: collision with root package name */
        public int f50271j = -1;

        /* renamed from: k, reason: collision with root package name */
        public boolean f50272k = true;

        /* renamed from: n, reason: collision with root package name */
        public final X f50275n = X.f47549f;

        /* renamed from: o, reason: collision with root package name */
        public long f50276o = -9223372036854775807L;

        /* renamed from: p, reason: collision with root package name */
        public long f50277p = -9223372036854775807L;

        /* compiled from: MediaCodecVideoRenderer.java */
        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public static Constructor<?> f50278a;

            /* renamed from: b, reason: collision with root package name */
            public static Method f50279b;

            /* renamed from: c, reason: collision with root package name */
            public static Method f50280c;

            /* renamed from: d, reason: collision with root package name */
            public static Constructor<?> f50281d;

            /* renamed from: e, reason: collision with root package name */
            public static Method f50282e;

            @InterfaceC49173d
            public static void a() throws ClassNotFoundException {
                if (f50278a == null || f50279b == null || f50280c == null) {
                    Class<?> cls = Class.forName("androidx.media3.effect.ScaleAndRotateTransformation$Builder");
                    f50278a = cls.getConstructor(new Class[0]);
                    f50279b = cls.getMethod("setRotationDegrees", Float.TYPE);
                    f50280c = cls.getMethod("build", new Class[0]);
                }
                if (f50281d == null || f50282e == null) {
                    Class<?> cls2 = Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                    f50281d = cls2.getConstructor(new Class[0]);
                    f50282e = cls2.getMethod("build", new Class[0]);
                }
            }
        }

        public d(h hVar, c cVar) {
            this.f50262a = hVar;
            this.f50263b = cVar;
        }

        public final void a() {
            C23110a.h(this.f50267f);
            this.f50267f.flush();
            this.f50264c.clear();
            this.f50266e.removeCallbacksAndMessages(null);
            if (this.f50273l) {
                this.f50273l = false;
                this.f50274m = false;
            }
        }

        public final boolean b() {
            return this.f50267f != null;
        }

        public final boolean c(C23108t c23108t, long j12, boolean z12) {
            C23110a.h(this.f50267f);
            C23110a.g(this.f50271j != -1);
            if (this.f50267f.d() >= this.f50271j) {
                return false;
            }
            this.f50267f.c();
            Pair<Long, C23108t> pair = this.f50269h;
            if (pair == null) {
                this.f50269h = Pair.create(Long.valueOf(j12), c23108t);
            } else if (!M.a(c23108t, pair.second)) {
                this.f50265d.add(Pair.create(Long.valueOf(j12), c23108t));
            }
            if (z12) {
                this.f50273l = true;
            }
            return true;
        }

        public final void d(long j12) {
            C23110a.h(this.f50267f);
            this.f50267f.a();
            this.f50264c.remove();
            long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            c cVar = this.f50263b;
            cVar.f50247d1 = jElapsedRealtime;
            if (j12 != -2) {
                cVar.J0();
            }
        }

        public final void e(long j12, long j13) {
            long j14;
            C23110a.h(this.f50267f);
            while (true) {
                ArrayDeque<Long> arrayDeque = this.f50264c;
                if (arrayDeque.isEmpty()) {
                    return;
                }
                c cVar = this.f50263b;
                boolean z12 = cVar.f49145h == 2;
                Long lPeek = arrayDeque.peek();
                lPeek.getClass();
                long jLongValue = lPeek.longValue();
                long j15 = jLongValue + this.f50277p;
                long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                long j16 = (long) ((j15 - j12) / cVar.f49257H);
                if (z12) {
                    j16 -= jElapsedRealtime - j13;
                }
                if (cVar.O0(j12, j16)) {
                    d(-1L);
                    return;
                }
                if (!z12 || j12 == cVar.f50240W0 || j16 > 50000) {
                    return;
                }
                h hVar = this.f50262a;
                hVar.c(j15);
                long jA2 = hVar.a((j16 * 1000) + System.nanoTime());
                long jNanoTime = (jA2 - System.nanoTime()) / 1000;
                cVar.getClass();
                if (jNanoTime < -30000) {
                    d(-2L);
                } else {
                    ArrayDeque<Pair<Long, C23108t>> arrayDeque2 = this.f50265d;
                    if (!arrayDeque2.isEmpty() && j15 > ((Long) arrayDeque2.peek().first).longValue()) {
                        this.f50269h = arrayDeque2.remove();
                    }
                    C23108t c23108t = (C23108t) this.f50269h.second;
                    g gVar = cVar.f50256m1;
                    if (gVar != null) {
                        j14 = jA2;
                        gVar.e(jLongValue, j14, c23108t, cVar.f49261L);
                    } else {
                        j14 = jA2;
                    }
                    if (this.f50276o >= j15) {
                        this.f50276o = -9223372036854775807L;
                        cVar.K0(this.f50275n);
                    }
                    d(j14);
                }
            }
        }

        public final void f() {
            W w12 = this.f50267f;
            w12.getClass();
            w12.release();
            this.f50267f = null;
            Handler handler = this.f50266e;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            CopyOnWriteArrayList<InterfaceC23105p> copyOnWriteArrayList = this.f50268g;
            if (copyOnWriteArrayList != null) {
                copyOnWriteArrayList.clear();
            }
            this.f50264c.clear();
            this.f50272k = true;
        }

        public final void g(C23108t c23108t) {
            W w12 = this.f50267f;
            w12.getClass();
            new C23125v(c23108t.f47762r, c23108t.f47763s, c23108t.f47766v, 0L, null);
            w12.g();
            if (this.f50273l) {
                this.f50273l = false;
                this.f50274m = false;
            }
        }

        public final void h(Surface surface, C c12) {
            Pair<Surface, C> pair = this.f50270i;
            if (pair != null && ((Surface) pair.first).equals(surface) && ((C) this.f50270i.second).equals(c12)) {
                return;
            }
            this.f50270i = Pair.create(surface, c12);
            if (b()) {
                W w12 = this.f50267f;
                w12.getClass();
                int i12 = c12.f47873a;
                w12.b();
            }
        }
    }

    public c(Context context, l.b bVar, q qVar, long j12, @P Handler handler, @P l lVar) {
        super(2, bVar, qVar, 30.0f);
        this.f50227J0 = j12;
        this.f50228K0 = 50;
        Context applicationContext = context.getApplicationContext();
        this.f50223F0 = applicationContext;
        h hVar = new h(applicationContext);
        this.f50224G0 = hVar;
        this.f50225H0 = new l.a(handler, lVar);
        this.f50226I0 = new d(hVar, this);
        this.f50229L0 = "NVIDIA".equals(M.f47889c);
        this.f50241X0 = -9223372036854775807L;
        this.f50236S0 = 1;
        this.f50251h1 = X.f47549f;
        this.f50254k1 = 0;
        this.f50252i1 = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0123  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean F0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 3206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.c.F0(java.lang.String):boolean");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int G0(androidx.media3.exoplayer.mediacodec.n r11, androidx.media3.common.C23108t r12) {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.c.G0(androidx.media3.exoplayer.mediacodec.n, androidx.media3.common.t):int");
    }

    public static List H0(Context context, q qVar, C23108t c23108t, boolean z12, boolean z13) {
        List listE;
        String str = c23108t.f47757m;
        if (str == null) {
            return AbstractC37401r1.C();
        }
        if (M.f47887a >= 26 && "video/dolby-vision".equals(str) && !a.a(context)) {
            String strB = MediaCodecUtil.b(c23108t);
            if (strB == null) {
                listE = AbstractC37401r1.C();
            } else {
                qVar.getClass();
                listE = MediaCodecUtil.e(strB, z12, z13);
            }
            if (!listE.isEmpty()) {
                return listE;
            }
        }
        Pattern pattern = MediaCodecUtil.f49321a;
        qVar.getClass();
        List<n> listE2 = MediaCodecUtil.e(c23108t.f47757m, z12, z13);
        String strB2 = MediaCodecUtil.b(c23108t);
        List listC = strB2 == null ? AbstractC37401r1.C() : MediaCodecUtil.e(strB2, z12, z13);
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        aVar.e(listE2);
        aVar.e(listC);
        return aVar.i();
    }

    public static int I0(n nVar, C23108t c23108t) {
        if (c23108t.f47758n == -1) {
            return G0(nVar, c23108t);
        }
        List<byte[]> list = c23108t.f47759o;
        int size = list.size();
        int length = 0;
        for (int i12 = 0; i12 < size; i12++) {
            length += list.get(i12).length;
        }
        return c23108t.f47758n + length;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int A0(q qVar, C23108t c23108t) {
        boolean z12;
        int i12 = 0;
        if (!"video".equals(D.e(c23108t.f47757m))) {
            return d0.e(0, 0, 0);
        }
        boolean z13 = c23108t.f47760p != null;
        Context context = this.f50223F0;
        List listH0 = H0(context, qVar, c23108t, z13, false);
        if (z13 && listH0.isEmpty()) {
            listH0 = H0(context, qVar, c23108t, false, false);
        }
        if (listH0.isEmpty()) {
            return d0.e(1, 0, 0);
        }
        int i13 = c23108t.f47744H;
        if (i13 != 0 && i13 != 2) {
            return d0.e(2, 0, 0);
        }
        n nVar = (n) listH0.get(0);
        boolean zD2 = nVar.d(c23108t);
        if (zD2) {
            z12 = true;
        } else {
            for (int i14 = 1; i14 < listH0.size(); i14++) {
                n nVar2 = (n) listH0.get(i14);
                if (nVar2.d(c23108t)) {
                    zD2 = true;
                    z12 = false;
                    nVar = nVar2;
                    break;
                }
            }
            z12 = true;
        }
        int i15 = zD2 ? 4 : 3;
        int i16 = nVar.e(c23108t) ? 16 : 8;
        int i17 = nVar.f49392g ? 64 : 0;
        int i18 = z12 ? 128 : 0;
        if (M.f47887a >= 26 && "video/dolby-vision".equals(c23108t.f47757m) && !a.a(context)) {
            i18 = 256;
        }
        if (zD2) {
            List listH02 = H0(context, qVar, c23108t, z13, true);
            if (!listH02.isEmpty()) {
                Pattern pattern = MediaCodecUtil.f49321a;
                ArrayList arrayList = new ArrayList(listH02);
                Collections.sort(arrayList, new s(new r(c23108t)));
                n nVar3 = (n) arrayList.get(0);
                if (nVar3.d(c23108t) && nVar3.e(c23108t)) {
                    i12 = 32;
                }
            }
        }
        return i15 | i16 | i12 | i17 | i18;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC23136e
    public final void D() {
        l.a aVar = this.f50225H0;
        this.f50252i1 = null;
        E0();
        this.f50235R0 = false;
        this.f50255l1 = null;
        try {
            super.D();
            C23138g c23138g = this.f49247A0;
            aVar.getClass();
            synchronized (c23138g) {
            }
            Handler handler = aVar.f50321a;
            if (handler != null) {
                handler.post(new k(aVar, c23138g, 1));
            }
            aVar.a(X.f47549f);
        } catch (Throwable th2) {
            C23138g c23138g2 = this.f49247A0;
            aVar.getClass();
            synchronized (c23138g2) {
                Handler handler2 = aVar.f50321a;
                if (handler2 != null) {
                    handler2.post(new k(aVar, c23138g2, 1));
                }
                aVar.a(X.f47549f);
                throw th2;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC23136e
    public final void E(boolean z12, boolean z13) {
        super.E(z12, z13);
        e0 e0Var = this.f49142e;
        e0Var.getClass();
        boolean z14 = e0Var.f49154a;
        C23110a.g((z14 && this.f50254k1 == 0) ? false : true);
        if (this.f50253j1 != z14) {
            this.f50253j1 = z14;
            s0();
        }
        C23138g c23138g = this.f49247A0;
        l.a aVar = this.f50225H0;
        Handler handler = aVar.f50321a;
        if (handler != null) {
            handler.post(new k(aVar, c23138g, 0));
        }
        this.f50238U0 = z13;
        this.f50239V0 = false;
    }

    public final void E0() {
        androidx.media3.exoplayer.mediacodec.l lVar;
        this.f50237T0 = false;
        if (M.f47887a < 23 || !this.f50253j1 || (lVar = this.f49259J) == null) {
            return;
        }
        this.f50255l1 = new C1845c(lVar);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC23136e
    public final void F(long j12, boolean z12) throws Exception {
        super.F(j12, z12);
        d dVar = this.f50226I0;
        if (dVar.b()) {
            dVar.a();
        }
        E0();
        h hVar = this.f50224G0;
        hVar.f50297m = 0L;
        hVar.f50300p = -1L;
        hVar.f50298n = -1L;
        this.f50246c1 = -9223372036854775807L;
        this.f50240W0 = -9223372036854775807L;
        this.f50244a1 = 0;
        if (!z12) {
            this.f50241X0 = -9223372036854775807L;
        } else {
            long j13 = this.f50227J0;
            this.f50241X0 = j13 > 0 ? SystemClock.elapsedRealtime() + j13 : -9223372036854775807L;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC23136e
    @TargetApi(17)
    public final void H() {
        d dVar = this.f50226I0;
        try {
            super.H();
        } finally {
            if (dVar.b()) {
                dVar.f();
            }
            PlaceholderSurface placeholderSurface = this.f50234Q0;
            if (placeholderSurface != null) {
                if (this.f50233P0 == placeholderSurface) {
                    this.f50233P0 = null;
                }
                placeholderSurface.release();
                this.f50234Q0 = null;
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC23136e
    public final void I() {
        this.f50243Z0 = 0;
        this.f50242Y0 = SystemClock.elapsedRealtime();
        this.f50247d1 = SystemClock.elapsedRealtime() * 1000;
        this.f50248e1 = 0L;
        this.f50249f1 = 0;
        h hVar = this.f50224G0;
        hVar.f50288d = true;
        hVar.f50297m = 0L;
        hVar.f50300p = -1L;
        hVar.f50298n = -1L;
        h.b bVar = hVar.f50286b;
        if (bVar != null) {
            h.e eVar = hVar.f50287c;
            eVar.getClass();
            eVar.f50307c.sendEmptyMessage(1);
            bVar.b(new Ae0.c(hVar, 12));
        }
        hVar.e(false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC23136e
    public final void J() {
        this.f50241X0 = -9223372036854775807L;
        int i12 = this.f50243Z0;
        l.a aVar = this.f50225H0;
        if (i12 > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j12 = jElapsedRealtime - this.f50242Y0;
            int i13 = this.f50243Z0;
            Handler handler = aVar.f50321a;
            if (handler != null) {
                handler.post(new i(aVar, i13, j12));
            }
            this.f50243Z0 = 0;
            this.f50242Y0 = jElapsedRealtime;
        }
        int i14 = this.f50249f1;
        if (i14 != 0) {
            long j13 = this.f50248e1;
            Handler handler2 = aVar.f50321a;
            if (handler2 != null) {
                handler2.post(new i(aVar, j13, i14));
            }
            this.f50248e1 = 0L;
            this.f50249f1 = 0;
        }
        h hVar = this.f50224G0;
        hVar.f50288d = false;
        h.b bVar = hVar.f50286b;
        if (bVar != null) {
            bVar.a();
            h.e eVar = hVar.f50287c;
            eVar.getClass();
            eVar.f50307c.sendEmptyMessage(2);
        }
        hVar.b();
    }

    public final void J0() {
        this.f50239V0 = true;
        if (this.f50237T0) {
            return;
        }
        this.f50237T0 = true;
        Surface surface = this.f50233P0;
        l.a aVar = this.f50225H0;
        Handler handler = aVar.f50321a;
        if (handler != null) {
            handler.post(new j(0, aVar, SystemClock.elapsedRealtime(), surface));
        }
        this.f50235R0 = true;
    }

    public final void K0(X x12) {
        if (x12.equals(X.f47549f) || x12.equals(this.f50252i1)) {
            return;
        }
        this.f50252i1 = x12;
        this.f50225H0.a(x12);
    }

    public final void L0(androidx.media3.exoplayer.mediacodec.l lVar, int i12) {
        H.a("releaseOutputBuffer");
        lVar.releaseOutputBuffer(i12, true);
        H.b();
        this.f49247A0.f49159e++;
        this.f50244a1 = 0;
        if (this.f50226I0.b()) {
            return;
        }
        this.f50247d1 = SystemClock.elapsedRealtime() * 1000;
        K0(this.f50251h1);
        J0();
    }

    public final void M0(androidx.media3.exoplayer.mediacodec.l lVar, C23108t c23108t, int i12, long j12, boolean z12) {
        long jNanoTime;
        g gVar;
        d dVar = this.f50226I0;
        if (dVar.b()) {
            long jA02 = a0();
            C23110a.g(dVar.f50277p != -9223372036854775807L);
            jNanoTime = ((j12 + jA02) - dVar.f50277p) * 1000;
        } else {
            jNanoTime = System.nanoTime();
        }
        if (z12 && (gVar = this.f50256m1) != null) {
            gVar.e(j12, jNanoTime, c23108t, this.f49261L);
        }
        if (M.f47887a >= 21) {
            N0(lVar, i12, jNanoTime);
        } else {
            L0(lVar, i12);
        }
    }

    @j.X
    public final void N0(androidx.media3.exoplayer.mediacodec.l lVar, int i12, long j12) {
        H.a("releaseOutputBuffer");
        lVar.e(i12, j12);
        H.b();
        this.f49247A0.f49159e++;
        this.f50244a1 = 0;
        if (this.f50226I0.b()) {
            return;
        }
        this.f50247d1 = SystemClock.elapsedRealtime() * 1000;
        K0(this.f50251h1);
        J0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final C23139h O(n nVar, C23108t c23108t, C23108t c23108t2) {
        C23139h c23139hB = nVar.b(c23108t, c23108t2);
        b bVar = this.f50230M0;
        int i12 = bVar.f50257a;
        int i13 = c23139hB.f49174e;
        if (c23108t2.f47762r > i12 || c23108t2.f47763s > bVar.f50258b) {
            i13 |= 256;
        }
        if (I0(nVar, c23108t2) > this.f50230M0.f50259c) {
            i13 |= 64;
        }
        int i14 = i13;
        return new C23139h(nVar.f49386a, c23108t, c23108t2, i14 != 0 ? 0 : c23139hB.f49173d, i14);
    }

    public final boolean O0(long j12, long j13) {
        boolean z12 = this.f49145h == 2;
        boolean z13 = this.f50239V0 ? !this.f50237T0 : z12 || this.f50238U0;
        long jElapsedRealtime = (SystemClock.elapsedRealtime() * 1000) - this.f50247d1;
        if (this.f50241X0 != -9223372036854775807L || j12 < a0()) {
            return false;
        }
        return z13 || (z12 && j13 < -30000 && jElapsedRealtime > 100000);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final MediaCodecDecoderException P(IllegalStateException illegalStateException, @P n nVar) {
        Surface surface = this.f50233P0;
        MediaCodecVideoDecoderException mediaCodecVideoDecoderException = new MediaCodecVideoDecoderException(illegalStateException, nVar);
        System.identityHashCode(surface);
        if (surface != null) {
            surface.isValid();
        }
        return mediaCodecVideoDecoderException;
    }

    public final boolean P0(n nVar) {
        return M.f47887a >= 23 && !this.f50253j1 && !F0(nVar.f49386a) && (!nVar.f49391f || PlaceholderSurface.b(this.f50223F0));
    }

    public final void Q0(androidx.media3.exoplayer.mediacodec.l lVar, int i12) {
        H.a("skipVideoBuffer");
        lVar.releaseOutputBuffer(i12, false);
        H.b();
        this.f49247A0.f49160f++;
    }

    public final void R0(int i12, int i13) {
        int i14;
        C23138g c23138g = this.f49247A0;
        c23138g.f49162h += i12;
        int i15 = i12 + i13;
        c23138g.f49161g += i15;
        this.f50243Z0 += i15;
        int i16 = this.f50244a1 + i15;
        this.f50244a1 = i16;
        c23138g.f49163i = Math.max(i16, c23138g.f49163i);
        int i17 = this.f50228K0;
        if (i17 <= 0 || (i14 = this.f50243Z0) < i17 || i14 <= 0) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j12 = jElapsedRealtime - this.f50242Y0;
        int i18 = this.f50243Z0;
        l.a aVar = this.f50225H0;
        Handler handler = aVar.f50321a;
        if (handler != null) {
            handler.post(new i(aVar, i18, j12));
        }
        this.f50243Z0 = 0;
        this.f50242Y0 = jElapsedRealtime;
    }

    public final void S0(long j12) {
        C23138g c23138g = this.f49247A0;
        c23138g.f49165k += j12;
        c23138g.f49166l++;
        this.f50248e1 += j12;
        this.f50249f1++;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean W() {
        return this.f50253j1 && M.f47887a < 23;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final float X(float f12, C23108t[] c23108tArr) {
        float fMax = -1.0f;
        for (C23108t c23108t : c23108tArr) {
            float f13 = c23108t.f47764t;
            if (f13 != -1.0f) {
                fMax = Math.max(fMax, f13);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f12;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final ArrayList Y(q qVar, C23108t c23108t, boolean z12) {
        List listH0 = H0(this.f50223F0, qVar, c23108t, z12, this.f50253j1);
        Pattern pattern = MediaCodecUtil.f49321a;
        ArrayList arrayList = new ArrayList(listH0);
        Collections.sort(arrayList, new s(new r(c23108t)));
        return arrayList;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @TargetApi(17)
    public final l.a Z(n nVar, C23108t c23108t, @P MediaCrypto mediaCrypto, float f12) {
        C23101l c23101l;
        b bVar;
        Point point;
        float f13;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        Point point2;
        int i12;
        char c12;
        boolean z12;
        Surface surfaceE;
        Pair<Integer, Integer> pairD;
        int iG02;
        PlaceholderSurface placeholderSurface = this.f50234Q0;
        if (placeholderSurface != null && placeholderSurface.f50180b != nVar.f49391f) {
            if (this.f50233P0 == placeholderSurface) {
                this.f50233P0 = null;
            }
            placeholderSurface.release();
            this.f50234Q0 = null;
        }
        String str = nVar.f49388c;
        C23108t[] c23108tArr = this.f49147j;
        c23108tArr.getClass();
        int iMax = c23108t.f47762r;
        int iI02 = I0(nVar, c23108t);
        int length = c23108tArr.length;
        float f14 = c23108t.f47764t;
        int i13 = c23108t.f47762r;
        C23101l c23101l2 = c23108t.f47769y;
        int i14 = c23108t.f47763s;
        if (length == 1) {
            if (iI02 != -1 && (iG02 = G0(nVar, c23108t)) != -1) {
                iI02 = Math.min((int) (iI02 * 1.5f), iG02);
            }
            bVar = new b(iMax, i14, iI02);
            c23101l = c23101l2;
        } else {
            int length2 = c23108tArr.length;
            int iMax2 = i14;
            int i15 = 0;
            boolean z13 = false;
            while (i15 < length2) {
                C23108t c23108tA = c23108tArr[i15];
                C23108t[] c23108tArr2 = c23108tArr;
                if (c23101l2 != null && c23108tA.f47769y == null) {
                    C23108t.b bVarA = c23108tA.a();
                    bVarA.f47799w = c23101l2;
                    c23108tA = bVarA.a();
                }
                if (nVar.b(c23108t, c23108tA).f49173d != 0) {
                    int i16 = c23108tA.f47763s;
                    i12 = length2;
                    int i17 = c23108tA.f47762r;
                    c12 = 65535;
                    z13 |= i17 == -1 || i16 == -1;
                    iMax = Math.max(iMax, i17);
                    iMax2 = Math.max(iMax2, i16);
                    iI02 = Math.max(iI02, I0(nVar, c23108tA));
                } else {
                    i12 = length2;
                    c12 = 65535;
                }
                i15++;
                c23108tArr = c23108tArr2;
                length2 = i12;
            }
            if (z13) {
                androidx.media3.common.util.s.g();
                boolean z14 = i14 > i13;
                int i18 = z14 ? i14 : i13;
                int i19 = z14 ? i13 : i14;
                float f15 = i19 / i18;
                int[] iArr = f50220n1;
                c23101l = c23101l2;
                int i22 = 0;
                while (i22 < 9) {
                    int i23 = iArr[i22];
                    int[] iArr2 = iArr;
                    int i24 = (int) (i23 * f15);
                    if (i23 <= i18 || i24 <= i19) {
                        break;
                    }
                    int i25 = i18;
                    int i26 = i19;
                    if (M.f47887a >= 21) {
                        int i27 = z14 ? i24 : i23;
                        if (!z14) {
                            i23 = i24;
                        }
                        MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f49389d;
                        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
                            f13 = f15;
                            point2 = null;
                        } else {
                            int widthAlignment = videoCapabilities.getWidthAlignment();
                            int heightAlignment = videoCapabilities.getHeightAlignment();
                            f13 = f15;
                            point2 = new Point(M.g(i27, widthAlignment) * widthAlignment, M.g(i23, heightAlignment) * heightAlignment);
                        }
                        Point point3 = point2;
                        if (nVar.f(point2.x, point2.y, f14)) {
                            point = point3;
                            break;
                        }
                        i22++;
                        iArr = iArr2;
                        i18 = i25;
                        i19 = i26;
                        f15 = f13;
                    } else {
                        f13 = f15;
                        try {
                            int iG2 = M.g(i23, 16) * 16;
                            int iG3 = M.g(i24, 16) * 16;
                            if (iG2 * iG3 <= MediaCodecUtil.i()) {
                                int i28 = z14 ? iG3 : iG2;
                                if (!z14) {
                                    iG2 = iG3;
                                }
                                point = new Point(i28, iG2);
                            } else {
                                i22++;
                                iArr = iArr2;
                                i18 = i25;
                                i19 = i26;
                                f15 = f13;
                            }
                        } catch (MediaCodecUtil.DecoderQueryException unused) {
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    C23108t.b bVarA2 = c23108t.a();
                    bVarA2.f47792p = iMax;
                    bVarA2.f47793q = iMax2;
                    iI02 = Math.max(iI02, G0(nVar, bVarA2.a()));
                    androidx.media3.common.util.s.g();
                }
            } else {
                c23101l = c23101l2;
            }
            bVar = new b(iMax, iMax2, iI02);
        }
        this.f50230M0 = bVar;
        int i29 = this.f50253j1 ? this.f50254k1 : 0;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", i13);
        mediaFormat.setInteger("height", i14);
        u.b(mediaFormat, c23108t.f47759o);
        if (f14 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f14);
        }
        u.a(mediaFormat, "rotation-degrees", c23108t.f47765u);
        if (c23101l != null) {
            C23101l c23101l3 = c23101l;
            u.a(mediaFormat, "color-transfer", c23101l3.f47679d);
            u.a(mediaFormat, "color-standard", c23101l3.f47677b);
            u.a(mediaFormat, "color-range", c23101l3.f47678c);
            byte[] bArr = c23101l3.f47680e;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c23108t.f47757m) && (pairD = MediaCodecUtil.d(c23108t)) != null) {
            u.a(mediaFormat, "profile", ((Integer) pairD.first).intValue());
        }
        mediaFormat.setInteger("max-width", bVar.f50257a);
        mediaFormat.setInteger("max-height", bVar.f50258b);
        u.a(mediaFormat, "max-input-size", bVar.f50259c);
        int i32 = M.f47887a;
        if (i32 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f12 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f12);
            }
        }
        if (this.f50229L0) {
            z12 = true;
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        } else {
            z12 = true;
        }
        if (i29 != 0) {
            mediaFormat.setFeatureEnabled("tunneled-playback", z12);
            mediaFormat.setInteger("audio-session-id", i29);
        }
        if (this.f50233P0 == null) {
            if (!P0(nVar)) {
                throw new IllegalStateException();
            }
            if (this.f50234Q0 == null) {
                this.f50234Q0 = PlaceholderSurface.c(this.f50223F0, nVar.f49391f);
            }
            this.f50233P0 = this.f50234Q0;
        }
        d dVar = this.f50226I0;
        if (dVar.b() && i32 >= 29 && dVar.f50263b.f50223F0.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            mediaFormat.setInteger("allow-frame-drop", 0);
        }
        if (dVar.b()) {
            W w12 = dVar.f50267f;
            w12.getClass();
            surfaceE = w12.e();
        } else {
            surfaceE = this.f50233P0;
        }
        return new l.a(nVar, mediaFormat, c23108t, surfaceE, mediaCrypto);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.AbstractC23136e, androidx.media3.exoplayer.c0
    public final boolean a() {
        boolean z12 = this.f49306w0;
        d dVar = this.f50226I0;
        return dVar.b() ? z12 & dVar.f50274m : z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v8, types: [android.view.Surface] */
    @Override // androidx.media3.exoplayer.AbstractC23136e, androidx.media3.exoplayer.Y.b
    public final void b(int i12, @P Object obj) throws Exception {
        Surface surface;
        h hVar = this.f50224G0;
        d dVar = this.f50226I0;
        if (i12 != 1) {
            if (i12 == 7) {
                this.f50256m1 = (g) obj;
                return;
            }
            if (i12 == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.f50254k1 != iIntValue) {
                    this.f50254k1 = iIntValue;
                    if (this.f50253j1) {
                        s0();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i12 == 4) {
                int iIntValue2 = ((Integer) obj).intValue();
                this.f50236S0 = iIntValue2;
                androidx.media3.exoplayer.mediacodec.l lVar = this.f49259J;
                if (lVar != null) {
                    lVar.a(iIntValue2);
                    return;
                }
                return;
            }
            if (i12 == 5) {
                int iIntValue3 = ((Integer) obj).intValue();
                if (hVar.f50294j == iIntValue3) {
                    return;
                }
                hVar.f50294j = iIntValue3;
                hVar.e(true);
                return;
            }
            if (i12 == 13) {
                obj.getClass();
                List list = (List) obj;
                CopyOnWriteArrayList<InterfaceC23105p> copyOnWriteArrayList = dVar.f50268g;
                if (copyOnWriteArrayList == null) {
                    dVar.f50268g = new CopyOnWriteArrayList<>(list);
                    return;
                } else {
                    copyOnWriteArrayList.clear();
                    dVar.f50268g.addAll(list);
                    return;
                }
            }
            if (i12 != 14) {
                return;
            }
            obj.getClass();
            C c12 = (C) obj;
            if (c12.f47873a == 0 || c12.f47874b == 0 || (surface = this.f50233P0) == null) {
                return;
            }
            dVar.h(surface, c12);
            return;
        }
        PlaceholderSurface placeholderSurfaceC = obj instanceof Surface ? (Surface) obj : null;
        if (placeholderSurfaceC == null) {
            PlaceholderSurface placeholderSurface = this.f50234Q0;
            if (placeholderSurface != null) {
                placeholderSurfaceC = placeholderSurface;
            } else {
                n nVar = this.f49266Q;
                if (nVar != null && P0(nVar)) {
                    placeholderSurfaceC = PlaceholderSurface.c(this.f50223F0, nVar.f49391f);
                    this.f50234Q0 = placeholderSurfaceC;
                }
            }
        }
        Surface surface2 = this.f50233P0;
        l.a aVar = this.f50225H0;
        if (surface2 == placeholderSurfaceC) {
            if (placeholderSurfaceC == null || placeholderSurfaceC == this.f50234Q0) {
                return;
            }
            X x12 = this.f50252i1;
            if (x12 != null) {
                aVar.a(x12);
            }
            if (this.f50235R0) {
                Surface surface3 = this.f50233P0;
                Handler handler = aVar.f50321a;
                if (handler != null) {
                    handler.post(new j(0, aVar, SystemClock.elapsedRealtime(), surface3));
                    return;
                }
                return;
            }
            return;
        }
        this.f50233P0 = placeholderSurfaceC;
        hVar.getClass();
        PlaceholderSurface placeholderSurface2 = placeholderSurfaceC instanceof PlaceholderSurface ? null : placeholderSurfaceC;
        if (hVar.f50289e != placeholderSurface2) {
            hVar.b();
            hVar.f50289e = placeholderSurface2;
            hVar.e(true);
        }
        this.f50235R0 = false;
        int i13 = this.f49145h;
        androidx.media3.exoplayer.mediacodec.l lVar2 = this.f49259J;
        if (lVar2 != null && !dVar.b()) {
            if (M.f47887a < 23 || placeholderSurfaceC == null || this.f50231N0) {
                s0();
                d0();
            } else {
                lVar2.c(placeholderSurfaceC);
            }
        }
        if (placeholderSurfaceC == null || placeholderSurfaceC == this.f50234Q0) {
            this.f50252i1 = null;
            E0();
            if (dVar.b()) {
                W w12 = dVar.f50267f;
                w12.getClass();
                w12.b();
                dVar.f50270i = null;
                return;
            }
            return;
        }
        X x13 = this.f50252i1;
        if (x13 != null) {
            aVar.a(x13);
        }
        E0();
        if (i13 == 2) {
            long j12 = this.f50227J0;
            this.f50241X0 = j12 > 0 ? SystemClock.elapsedRealtime() + j12 : -9223372036854775807L;
        }
        if (dVar.b()) {
            dVar.h(placeholderSurfaceC, C.f47872c);
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @TargetApi(AvailableCode.HMS_IS_SPOOF)
    public final void b0(DecoderInputBuffer decoderInputBuffer) {
        if (this.f50232O0) {
            ByteBuffer byteBuffer = decoderInputBuffer.f48326g;
            byteBuffer.getClass();
            if (byteBuffer.remaining() >= 7) {
                byte b12 = byteBuffer.get();
                short s5 = byteBuffer.getShort();
                short s12 = byteBuffer.getShort();
                byte b13 = byteBuffer.get();
                byte b14 = byteBuffer.get();
                byteBuffer.position(0);
                if (b12 == -75 && s5 == 60 && s12 == 1 && b13 == 4) {
                    if (b14 == 0 || b14 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        androidx.media3.exoplayer.mediacodec.l lVar = this.f49259J;
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        lVar.setParameters(bundle);
                    }
                }
            }
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void f0(Exception exc) {
        androidx.media3.common.util.s.d("Video codec error", exc);
        l.a aVar = this.f50225H0;
        Handler handler = aVar.f50321a;
        if (handler != null) {
            handler.post(new J11.c(14, aVar, exc));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void g0(long j12, long j13, String str) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        l.a aVar = this.f50225H0;
        Handler handler = aVar.f50321a;
        if (handler != null) {
            handler.post(new androidx.media3.exoplayer.audio.e(aVar, str, j12, j13, 1));
        }
        this.f50231N0 = F0(str);
        n nVar = this.f49266Q;
        nVar.getClass();
        boolean z12 = false;
        int i12 = 1;
        if (M.f47887a >= 29 && "video/x-vnd.on2.vp9".equals(nVar.f49387b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = nVar.f49389d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            int length = codecProfileLevelArr.length;
            int i13 = 0;
            while (true) {
                if (i13 >= length) {
                    break;
                }
                if (codecProfileLevelArr[i13].profile == 16384) {
                    z12 = true;
                    break;
                }
                i13++;
            }
        }
        this.f50232O0 = z12;
        int i14 = M.f47887a;
        if (i14 >= 23 && this.f50253j1) {
            androidx.media3.exoplayer.mediacodec.l lVar = this.f49259J;
            lVar.getClass();
            this.f50255l1 = new C1845c(lVar);
        }
        d dVar = this.f50226I0;
        Context context = dVar.f50263b.f50223F0;
        if (i14 >= 29 && context.getApplicationContext().getApplicationInfo().targetSdkVersion >= 29) {
            i12 = 5;
        }
        dVar.f50271j = i12;
    }

    @Override // androidx.media3.exoplayer.c0, androidx.media3.exoplayer.d0
    public final String getName() {
        return "MediaCodecVideoRenderer";
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void h0(String str) {
        l.a aVar = this.f50225H0;
        Handler handler = aVar.f50321a;
        if (handler != null) {
            handler.post(new J11.c(15, aVar, str, false));
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @P
    public final C23139h i0(F f12) throws Exception {
        C23139h c23139hI0 = super.i0(f12);
        C23108t c23108t = f12.f48506b;
        l.a aVar = this.f50225H0;
        Handler handler = aVar.f50321a;
        if (handler != null) {
            handler.post(new Me.m(aVar, c23108t, c23139hI0, 9));
        }
        return c23139hI0;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x008c  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j0(androidx.media3.common.C23108t r11, @j.P android.media.MediaFormat r12) {
        /*
            r10 = this;
            androidx.media3.exoplayer.mediacodec.l r0 = r10.f49259J
            if (r0 == 0) goto L9
            int r1 = r10.f50236S0
            r0.a(r1)
        L9:
            boolean r0 = r10.f50253j1
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            int r12 = r11.f47762r
            int r0 = r11.f47763s
            goto L64
        L14:
            r12.getClass()
            java.lang.String r0 = "crop-right"
            boolean r3 = r12.containsKey(r0)
            java.lang.String r4 = "crop-top"
            java.lang.String r5 = "crop-bottom"
            java.lang.String r6 = "crop-left"
            if (r3 == 0) goto L39
            boolean r3 = r12.containsKey(r6)
            if (r3 == 0) goto L39
            boolean r3 = r12.containsKey(r5)
            if (r3 == 0) goto L39
            boolean r3 = r12.containsKey(r4)
            if (r3 == 0) goto L39
            r3 = r1
            goto L3a
        L39:
            r3 = r2
        L3a:
            if (r3 == 0) goto L47
            int r0 = r12.getInteger(r0)
            int r6 = r12.getInteger(r6)
            int r0 = r0 - r6
            int r0 = r0 + r1
            goto L4d
        L47:
            java.lang.String r0 = "width"
            int r0 = r12.getInteger(r0)
        L4d:
            if (r3 == 0) goto L5b
            int r3 = r12.getInteger(r5)
            int r12 = r12.getInteger(r4)
            int r3 = r3 - r12
            int r3 = r3 + r1
            r12 = r3
            goto L61
        L5b:
            java.lang.String r3 = "height"
            int r12 = r12.getInteger(r3)
        L61:
            r9 = r0
            r0 = r12
            r12 = r9
        L64:
            float r3 = r11.f47766v
            int r4 = androidx.media3.common.util.M.f47887a
            r5 = 21
            if (r4 < r5) goto L6d
            goto L6e
        L6d:
            r1 = r2
        L6e:
            androidx.media3.exoplayer.video.c$d r4 = r10.f50226I0
            int r5 = r11.f47765u
            if (r1 == 0) goto L85
            r1 = 90
            if (r5 == r1) goto L7c
            r1 = 270(0x10e, float:3.78E-43)
            if (r5 != r1) goto L8c
        L7c:
            r1 = 1065353216(0x3f800000, float:1.0)
            float r3 = r1 / r3
            r5 = r2
            r9 = r0
            r0 = r12
            r12 = r9
            goto L8d
        L85:
            boolean r1 = r4.b()
            if (r1 != 0) goto L8c
            goto L8d
        L8c:
            r5 = r2
        L8d:
            androidx.media3.common.X r1 = new androidx.media3.common.X
            r1.<init>(r12, r0, r5, r3)
            r10.f50251h1 = r1
            float r1 = r11.f47764t
            androidx.media3.exoplayer.video.h r6 = r10.f50224G0
            r6.f50290f = r1
            androidx.media3.exoplayer.video.b r1 = r6.f50285a
            androidx.media3.exoplayer.video.b$a r7 = r1.f50207a
            r7.c()
            androidx.media3.exoplayer.video.b$a r7 = r1.f50208b
            r7.c()
            r1.f50209c = r2
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r1.f50210d = r7
            r1.f50211e = r2
            r6.d()
            boolean r1 = r4.b()
            if (r1 == 0) goto Lcd
            androidx.media3.common.t$b r11 = r11.a()
            r11.f47792p = r12
            r11.f47793q = r0
            r11.f47795s = r5
            r11.f47796t = r3
            androidx.media3.common.t r11 = r11.a()
            r4.g(r11)
        Lcd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.c.j0(androidx.media3.common.t, android.media.MediaFormat):void");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @InterfaceC42153i
    public final void l0(long j12) {
        super.l0(j12);
        if (this.f50253j1) {
            return;
        }
        this.f50245b1--;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final void m0() {
        E0();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.c0
    public final boolean n() {
        PlaceholderSurface placeholderSurface;
        Pair<Surface, C> pair;
        if (super.n()) {
            d dVar = this.f50226I0;
            if ((!dVar.b() || (pair = dVar.f50270i) == null || !((C) pair.second).equals(C.f47872c)) && (this.f50237T0 || (((placeholderSurface = this.f50234Q0) != null && this.f50233P0 == placeholderSurface) || this.f49259J == null || this.f50253j1))) {
                this.f50241X0 = -9223372036854775807L;
                return true;
            }
        }
        if (this.f50241X0 == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f50241X0) {
            return true;
        }
        this.f50241X0 = -9223372036854775807L;
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @InterfaceC42153i
    public final void n0(DecoderInputBuffer decoderInputBuffer) {
        boolean z12 = this.f50253j1;
        if (!z12) {
            this.f50245b1++;
        }
        if (M.f47887a >= 23 || !z12) {
            return;
        }
        long j12 = decoderInputBuffer.f48325f;
        D0(j12);
        K0(this.f50251h1);
        this.f49247A0.f49159e++;
        J0();
        l0(j12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.c0
    @InterfaceC42153i
    public final void o(long j12, long j13) throws Exception {
        super.o(j12, j13);
        d dVar = this.f50226I0;
        if (dVar.b()) {
            dVar.e(j12, j13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @j.InterfaceC42153i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void o0(androidx.media3.common.C23108t r13) throws java.lang.IllegalAccessException, androidx.media3.exoplayer.ExoPlaybackException, java.lang.InstantiationException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.c.o0(androidx.media3.common.t):void");
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean q0(long j12, long j13, @P androidx.media3.exoplayer.mediacodec.l lVar, @P ByteBuffer byteBuffer, int i12, int i13, int i14, long j14, boolean z12, boolean z13, C23108t c23108t) throws Exception {
        long j15;
        long j16;
        long j17;
        c cVar;
        long j18;
        long j19;
        boolean z14;
        boolean z15;
        lVar.getClass();
        if (this.f50240W0 == -9223372036854775807L) {
            this.f50240W0 = j12;
        }
        long j22 = this.f50246c1;
        h hVar = this.f50224G0;
        d dVar = this.f50226I0;
        if (j14 != j22) {
            if (!dVar.b()) {
                hVar.c(j14);
            }
            this.f50246c1 = j14;
        }
        long jA02 = j14 - a0();
        if (z12 && !z13) {
            Q0(lVar, i12);
            return true;
        }
        boolean z16 = this.f49145h == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j23 = (long) ((j14 - j12) / this.f49257H);
        if (z16) {
            j23 -= jElapsedRealtime - j13;
        }
        long j24 = j23;
        if (this.f50233P0 == this.f50234Q0) {
            if (j24 >= -30000) {
                return false;
            }
            Q0(lVar, i12);
            S0(j24);
            return true;
        }
        if (O0(j12, j24)) {
            if (!dVar.b()) {
                z15 = true;
            } else {
                if (!dVar.c(c23108t, jA02, z13)) {
                    return false;
                }
                z15 = false;
            }
            M0(lVar, c23108t, i12, jA02, z15);
            S0(j24);
            return true;
        }
        if (z16 && j12 != this.f50240W0) {
            long jNanoTime = System.nanoTime();
            long jA2 = hVar.a((j24 * 1000) + jNanoTime);
            long j25 = !dVar.b() ? (jA2 - jNanoTime) / 1000 : j24;
            boolean z17 = this.f50241X0 != -9223372036854775807L;
            if (j25 >= -500000 || z13) {
                j15 = jA02;
            } else {
                androidx.media3.exoplayer.source.P p12 = this.f49146i;
                p12.getClass();
                j15 = jA02;
                int iB2 = p12.b(j12 - this.f49148k);
                if (iB2 != 0) {
                    if (z17) {
                        C23138g c23138g = this.f49247A0;
                        c23138g.f49158d += iB2;
                        c23138g.f49160f += this.f50245b1;
                    } else {
                        this.f49247A0.f49164j++;
                        R0(iB2, this.f50245b1);
                    }
                    if (V()) {
                        d0();
                    }
                    if (!dVar.b()) {
                        return false;
                    }
                    dVar.a();
                    return false;
                }
            }
            if (j25 < -30000 && !z13) {
                if (z17) {
                    Q0(lVar, i12);
                    z14 = true;
                } else {
                    H.a("dropVideoBuffer");
                    lVar.releaseOutputBuffer(i12, false);
                    H.b();
                    z14 = true;
                    R0(0, 1);
                }
                S0(j25);
                return z14;
            }
            if (dVar.b()) {
                dVar.e(j12, j13);
                long j26 = j15;
                if (!dVar.c(c23108t, j26, z13)) {
                    return false;
                }
                M0(lVar, c23108t, i12, j26, false);
                return true;
            }
            long j27 = j15;
            if (M.f47887a < 21) {
                long j28 = j25;
                if (j28 < 30000) {
                    if (j28 > 11000) {
                        try {
                            Thread.sleep((j28 - 10000) / 1000);
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            return false;
                        }
                    }
                    g gVar = this.f50256m1;
                    if (gVar != null) {
                        j16 = j28;
                        gVar.e(j27, jA2, c23108t, this.f49261L);
                    } else {
                        j16 = j28;
                    }
                    L0(lVar, i12);
                    S0(j16);
                    return true;
                }
            } else if (j25 < 50000) {
                if (jA2 == this.f50250g1) {
                    Q0(lVar, i12);
                    cVar = this;
                    j18 = jA2;
                    j19 = j25;
                } else {
                    g gVar2 = this.f50256m1;
                    if (gVar2 != null) {
                        j18 = jA2;
                        j17 = j25;
                        cVar = this;
                        gVar2.e(j27, j18, c23108t, this.f49261L);
                    } else {
                        j17 = j25;
                        cVar = this;
                        j18 = jA2;
                    }
                    cVar.N0(lVar, i12, j18);
                    j19 = j17;
                }
                cVar.S0(j19);
                cVar.f50250g1 = j18;
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    @InterfaceC42153i
    public final void u0() {
        super.u0();
        this.f50245b1 = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer, androidx.media3.exoplayer.c0
    public final void x(float f12, float f13) throws Exception {
        super.x(f12, f13);
        h hVar = this.f50224G0;
        hVar.f50293i = f12;
        hVar.f50297m = 0L;
        hVar.f50300p = -1L;
        hVar.f50298n = -1L;
        hVar.e(false);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final boolean y0(n nVar) {
        return this.f50233P0 != null || P0(nVar);
    }
}
