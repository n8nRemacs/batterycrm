package androidx.media3.exoplayer.video;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Surface;
import android.view.WindowManager;
import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.common.util.s;
import androidx.media3.exoplayer.video.b;
import j.InterfaceC42164u;
import j.P;
import j.X;

/* compiled from: VideoFrameReleaseHelper.java */
@J
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.video.b f50285a = new androidx.media3.exoplayer.video.b();

    /* renamed from: b, reason: collision with root package name */
    @P
    public final b f50286b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final e f50287c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f50288d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public Surface f50289e;

    /* renamed from: f, reason: collision with root package name */
    public float f50290f;

    /* renamed from: g, reason: collision with root package name */
    public float f50291g;

    /* renamed from: h, reason: collision with root package name */
    public float f50292h;

    /* renamed from: i, reason: collision with root package name */
    public float f50293i;

    /* renamed from: j, reason: collision with root package name */
    public int f50294j;

    /* renamed from: k, reason: collision with root package name */
    public long f50295k;

    /* renamed from: l, reason: collision with root package name */
    public long f50296l;

    /* renamed from: m, reason: collision with root package name */
    public long f50297m;

    /* renamed from: n, reason: collision with root package name */
    public long f50298n;

    /* renamed from: o, reason: collision with root package name */
    public long f50299o;

    /* renamed from: p, reason: collision with root package name */
    public long f50300p;

    /* renamed from: q, reason: collision with root package name */
    public long f50301q;

    /* compiled from: VideoFrameReleaseHelper.java */
    @X
    public static final class a {
        @InterfaceC42164u
        public static void a(Surface surface, float f12) {
            try {
                surface.setFrameRate(f12, f12 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e12) {
                s.d("Failed to call Surface.setFrameRate", e12);
            }
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    public interface b {

        /* compiled from: VideoFrameReleaseHelper.java */
        public interface a {
        }

        void a();

        void b(Ae0.c cVar);
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f, reason: collision with root package name */
        public static final e f50305f = new e();

        /* renamed from: b, reason: collision with root package name */
        public volatile long f50306b = -9223372036854775807L;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f50307c;

        /* renamed from: d, reason: collision with root package name */
        public Choreographer f50308d;

        /* renamed from: e, reason: collision with root package name */
        public int f50309e;

        public e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i12 = M.f47887a;
            Handler handler = new Handler(looper, this);
            this.f50307c = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j12) {
            this.f50306b = j12;
            Choreographer choreographer = this.f50308d;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i12 = message.what;
            if (i12 == 0) {
                try {
                    this.f50308d = Choreographer.getInstance();
                } catch (RuntimeException e12) {
                    s.h("Vsync sampling disabled due to platform error", e12);
                }
                return true;
            }
            if (i12 == 1) {
                Choreographer choreographer = this.f50308d;
                if (choreographer != null) {
                    int i13 = this.f50309e + 1;
                    this.f50309e = i13;
                    if (i13 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i12 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f50308d;
            if (choreographer2 != null) {
                int i14 = this.f50309e - 1;
                this.f50309e = i14;
                if (i14 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f50306b = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public h(@j.P android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            androidx.media3.exoplayer.video.b r0 = new androidx.media3.exoplayer.video.b
            r0.<init>()
            r3.f50285a = r0
            r0 = 0
            if (r4 == 0) goto L3b
            android.content.Context r4 = r4.getApplicationContext()
            int r1 = androidx.media3.common.util.M.f47887a
            r2 = 17
            if (r1 < r2) goto L27
            java.lang.String r1 = "display"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            if (r1 == 0) goto L27
            androidx.media3.exoplayer.video.h$d r2 = new androidx.media3.exoplayer.video.h$d
            r2.<init>(r1)
            goto L28
        L27:
            r2 = r0
        L28:
            if (r2 != 0) goto L3c
            java.lang.String r1 = "window"
            java.lang.Object r4 = r4.getSystemService(r1)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            if (r4 == 0) goto L3b
            androidx.media3.exoplayer.video.h$c r1 = new androidx.media3.exoplayer.video.h$c
            r1.<init>(r4)
            r2 = r1
            goto L3c
        L3b:
            r2 = r0
        L3c:
            r3.f50286b = r2
            if (r2 == 0) goto L42
            androidx.media3.exoplayer.video.h$e r0 = androidx.media3.exoplayer.video.h.e.f50305f
        L42:
            r3.f50287c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f50295k = r0
            r3.f50296l = r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f50290f = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f50293i = r4
            r4 = 0
            r3.f50294j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.h.<init>(android.content.Context):void");
    }

    public final long a(long j12) {
        long j13;
        long j14;
        long j15;
        if (this.f50300p == -1 || !this.f50285a.f50207a.a()) {
            j13 = j12;
        } else {
            androidx.media3.exoplayer.video.b bVar = this.f50285a;
            if (bVar.f50207a.a()) {
                b.a aVar = bVar.f50207a;
                long j16 = aVar.f50216e;
                j15 = j16 == 0 ? 0L : aVar.f50217f / j16;
            } else {
                j15 = -9223372036854775807L;
            }
            j13 = this.f50301q + ((long) (((this.f50297m - this.f50300p) * j15) / this.f50293i));
            if (Math.abs(j12 - j13) > 20000000) {
                this.f50297m = 0L;
                this.f50300p = -1L;
                this.f50298n = -1L;
                j13 = j12;
            }
        }
        this.f50298n = this.f50297m;
        this.f50299o = j13;
        e eVar = this.f50287c;
        if (eVar == null || this.f50295k == -9223372036854775807L) {
            return j13;
        }
        long j17 = eVar.f50306b;
        if (j17 == -9223372036854775807L) {
            return j13;
        }
        long j18 = this.f50295k;
        long j19 = (((j13 - j17) / j18) * j18) + j17;
        if (j13 <= j19) {
            j14 = j19 - j18;
        } else {
            j14 = j19;
            j19 = j18 + j19;
        }
        if (j19 - j13 >= j13 - j14) {
            j19 = j14;
        }
        return j19 - this.f50296l;
    }

    public final void b() {
        Surface surface;
        if (M.f47887a < 30 || (surface = this.f50289e) == null || this.f50294j == Integer.MIN_VALUE || this.f50292h == 0.0f) {
            return;
        }
        this.f50292h = 0.0f;
        a.a(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(long r11) {
        /*
            r10 = this;
            long r0 = r10.f50298n
            r2 = -1
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 == 0) goto Le
            r10.f50300p = r0
            long r0 = r10.f50299o
            r10.f50301q = r0
        Le:
            long r0 = r10.f50297m
            r2 = 1
            long r0 = r0 + r2
            r10.f50297m = r0
            r0 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 * r0
            androidx.media3.exoplayer.video.b r0 = r10.f50285a
            androidx.media3.exoplayer.video.b$a r1 = r0.f50207a
            r1.b(r11)
            androidx.media3.exoplayer.video.b$a r1 = r0.f50207a
            boolean r1 = r1.a()
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L2c
            r0.f50209c = r5
            goto L65
        L2c:
            long r6 = r0.f50210d
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 == 0) goto L65
            boolean r1 = r0.f50209c
            if (r1 == 0) goto L52
            androidx.media3.exoplayer.video.b$a r1 = r0.f50208b
            long r6 = r1.f50215d
            r8 = 0
            int r8 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r8 != 0) goto L47
            r1 = r5
            goto L50
        L47:
            long r6 = r6 - r2
            r2 = 15
            long r6 = r6 % r2
            int r2 = (int) r6
            boolean[] r1 = r1.f50218g
            boolean r1 = r1[r2]
        L50:
            if (r1 == 0) goto L5e
        L52:
            androidx.media3.exoplayer.video.b$a r1 = r0.f50208b
            r1.c()
            androidx.media3.exoplayer.video.b$a r1 = r0.f50208b
            long r2 = r0.f50210d
            r1.b(r2)
        L5e:
            r0.f50209c = r4
            androidx.media3.exoplayer.video.b$a r1 = r0.f50208b
            r1.b(r11)
        L65:
            boolean r1 = r0.f50209c
            if (r1 == 0) goto L7b
            androidx.media3.exoplayer.video.b$a r1 = r0.f50208b
            boolean r1 = r1.a()
            if (r1 == 0) goto L7b
            androidx.media3.exoplayer.video.b$a r1 = r0.f50207a
            androidx.media3.exoplayer.video.b$a r2 = r0.f50208b
            r0.f50207a = r2
            r0.f50208b = r1
            r0.f50209c = r5
        L7b:
            r0.f50210d = r11
            androidx.media3.exoplayer.video.b$a r11 = r0.f50207a
            boolean r11 = r11.a()
            if (r11 == 0) goto L86
            goto L8a
        L86:
            int r11 = r0.f50211e
            int r5 = r11 + 1
        L8a:
            r0.f50211e = r5
            r10.d()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.h.c(long):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            r9 = this;
            int r0 = androidx.media3.common.util.M.f47887a
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.f50289e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            androidx.media3.exoplayer.video.b r0 = r9.f50285a
            androidx.media3.exoplayer.video.b$a r2 = r0.f50207a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            androidx.media3.exoplayer.video.b$a r2 = r0.f50207a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            androidx.media3.exoplayer.video.b$a r2 = r0.f50207a
            long r4 = r2.f50216e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f50217f
            long r6 = r6 / r4
        L2e:
            double r4 = (double) r6
            r6 = 4741671816366391296(0x41cdcd6500000000, double:1.0E9)
            double r6 = r6 / r4
            float r2 = (float) r6
            goto L3b
        L37:
            r2 = r3
            goto L3b
        L39:
            float r2 = r9.f50290f
        L3b:
            float r4 = r9.f50291g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            return
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            androidx.media3.exoplayer.video.b$a r1 = r0.f50207a
            boolean r1 = r1.a()
            if (r1 == 0) goto L71
            androidx.media3.exoplayer.video.b$a r1 = r0.f50207a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5f
            androidx.media3.exoplayer.video.b$a r0 = r0.f50207a
            long r0 = r0.f50217f
            goto L64
        L5f:
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L64:
            r3 = 5000000000(0x12a05f200, double:2.470328229E-314)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 < 0) goto L71
            r0 = 1017370378(0x3ca3d70a, float:0.02)
            goto L73
        L71:
            r0 = 1065353216(0x3f800000, float:1.0)
        L73:
            float r1 = r9.f50291g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.f50211e
            if (r0 < r1) goto L8d
        L87:
            r9.f50291g = r2
            r0 = 0
            r9.e(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.h.d():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(boolean r4) {
        /*
            r3 = this;
            int r0 = androidx.media3.common.util.M.f47887a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f50289e
            if (r0 == 0) goto L30
            int r1 = r3.f50294j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f50288d
            if (r1 == 0) goto L21
            float r1 = r3.f50291g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f50293i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f50292h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            return
        L2b:
            r3.f50292h = r1
            androidx.media3.exoplayer.video.h.a.a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.video.h.e(boolean):void");
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final WindowManager f50302a;

        public c(WindowManager windowManager) {
            this.f50302a = windowManager;
        }

        @Override // androidx.media3.exoplayer.video.h.b
        public final void b(Ae0.c cVar) {
            cVar.l(this.f50302a.getDefaultDisplay());
        }

        @Override // androidx.media3.exoplayer.video.h.b
        public final void a() {
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    @X
    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayManager f50303a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public Ae0.c f50304b;

        public d(DisplayManager displayManager) {
            this.f50303a = displayManager;
        }

        @Override // androidx.media3.exoplayer.video.h.b
        public final void a() {
            this.f50303a.unregisterDisplayListener(this);
            this.f50304b = null;
        }

        @Override // androidx.media3.exoplayer.video.h.b
        public final void b(Ae0.c cVar) {
            this.f50304b = cVar;
            Handler handlerN = M.n(null);
            DisplayManager displayManager = this.f50303a;
            displayManager.registerDisplayListener(this, handlerN);
            cVar.l(displayManager.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i12) {
            Ae0.c cVar = this.f50304b;
            if (cVar == null || i12 != 0) {
                return;
            }
            cVar.l(this.f50303a.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i12) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i12) {
        }
    }
}
