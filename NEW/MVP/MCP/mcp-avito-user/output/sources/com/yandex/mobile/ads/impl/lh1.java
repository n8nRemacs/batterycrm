package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import com.yandex.mobile.ads.exo.video.PlaceholderSurface;
import j.InterfaceC42164u;

/* loaded from: classes8.dex */
public final class lh1 {

    /* renamed from: a, reason: collision with root package name */
    private final bw f387485a = new bw();

    /* renamed from: b, reason: collision with root package name */
    @j.P
    private final b f387486b;

    /* renamed from: c, reason: collision with root package name */
    @j.P
    private final e f387487c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f387488d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    private Surface f387489e;

    /* renamed from: f, reason: collision with root package name */
    private float f387490f;

    /* renamed from: g, reason: collision with root package name */
    private float f387491g;

    /* renamed from: h, reason: collision with root package name */
    private float f387492h;

    /* renamed from: i, reason: collision with root package name */
    private float f387493i;

    /* renamed from: j, reason: collision with root package name */
    private int f387494j;

    /* renamed from: k, reason: collision with root package name */
    private long f387495k;

    /* renamed from: l, reason: collision with root package name */
    private long f387496l;

    /* renamed from: m, reason: collision with root package name */
    private long f387497m;

    /* renamed from: n, reason: collision with root package name */
    private long f387498n;

    /* renamed from: o, reason: collision with root package name */
    private long f387499o;

    /* renamed from: p, reason: collision with root package name */
    private long f387500p;

    /* renamed from: q, reason: collision with root package name */
    private long f387501q;

    @j.X
    public static final class a {
        @InterfaceC42164u
        public static void a(Surface surface, float f12) {
            try {
                surface.setFrameRate(f12, f12 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e12) {
                ka0.a("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e12);
            }
        }
    }

    public interface b {

        public interface a {
            void a(@j.P Display display);
        }

        void a();

        void a(a aVar);
    }

    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        private final WindowManager f387502a;

        private c(WindowManager windowManager) {
            this.f387502a = windowManager;
        }

        @Override // com.yandex.mobile.ads.impl.lh1.b
        public final void a() {
        }

        @j.P
        public static c a(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new c(windowManager);
            }
            return null;
        }

        @Override // com.yandex.mobile.ads.impl.lh1.b
        public final void a(b.a aVar) {
            aVar.a(this.f387502a.getDefaultDisplay());
        }
    }

    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f, reason: collision with root package name */
        private static final e f387505f = new e();

        /* renamed from: b, reason: collision with root package name */
        public volatile long f387506b = -9223372036854775807L;

        /* renamed from: c, reason: collision with root package name */
        private final Handler f387507c;

        /* renamed from: d, reason: collision with root package name */
        private Choreographer f387508d;

        /* renamed from: e, reason: collision with root package name */
        private int f387509e;

        private e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Handler handlerA = pc1.a(handlerThread.getLooper(), (Handler.Callback) this);
            this.f387507c = handlerA;
            handlerA.sendEmptyMessage(0);
        }

        public static e b() {
            return f387505f;
        }

        public final void a() {
            this.f387507c.sendEmptyMessage(1);
        }

        public final void c() {
            this.f387507c.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j12) {
            this.f387506b = j12;
            Choreographer choreographer = this.f387508d;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i12 = message.what;
            if (i12 == 0) {
                try {
                    this.f387508d = Choreographer.getInstance();
                } catch (RuntimeException e12) {
                    ka0.b("VideoFrameReleaseHelper", "Vsync sampling disabled due to platform error", e12);
                }
                return true;
            }
            if (i12 == 1) {
                Choreographer choreographer = this.f387508d;
                if (choreographer != null) {
                    int i13 = this.f387509e + 1;
                    this.f387509e = i13;
                    if (i13 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i12 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f387508d;
            if (choreographer2 != null) {
                int i14 = this.f387509e - 1;
                this.f387509e = i14;
                if (i14 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f387506b = -9223372036854775807L;
                }
            }
            return true;
        }
    }

    public lh1(@j.P Context context) {
        b bVarA = a(context);
        this.f387486b = bVarA;
        this.f387487c = bVarA != null ? e.b() : null;
        this.f387495k = -9223372036854775807L;
        this.f387496l = -9223372036854775807L;
        this.f387490f = -1.0f;
        this.f387493i = 1.0f;
        this.f387494j = 0;
    }

    private void d() {
        if (pc1.f388768a < 30 || this.f387489e == null) {
            return;
        }
        float fB2 = this.f387485a.e() ? this.f387485a.b() : this.f387490f;
        float f12 = this.f387491g;
        if (fB2 == f12) {
            return;
        }
        if (fB2 != -1.0f && f12 != -1.0f) {
            if (Math.abs(fB2 - this.f387491g) < ((!this.f387485a.e() || this.f387485a.d() < 5000000000L) ? 1.0f : 0.02f)) {
                return;
            }
        } else if (fB2 == -1.0f && this.f387485a.c() < 30) {
            return;
        }
        this.f387491g = fB2;
        a(false);
    }

    public final void b() {
        this.f387488d = true;
        this.f387497m = 0L;
        this.f387500p = -1L;
        this.f387498n = -1L;
        if (this.f387486b != null) {
            e eVar = this.f387487c;
            eVar.getClass();
            eVar.a();
            this.f387486b.a(new G0(this, 12));
        }
        a(false);
    }

    public final void c() {
        Surface surface;
        this.f387488d = false;
        b bVar = this.f387486b;
        if (bVar != null) {
            bVar.a();
            e eVar = this.f387487c;
            eVar.getClass();
            eVar.c();
        }
        if (pc1.f388768a < 30 || (surface = this.f387489e) == null || this.f387494j == Integer.MIN_VALUE || this.f387492h == 0.0f) {
            return;
        }
        this.f387492h = 0.0f;
        a.a(surface, 0.0f);
    }

    @j.X
    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        private final DisplayManager f387503a;

        /* renamed from: b, reason: collision with root package name */
        @j.P
        private b.a f387504b;

        private d(DisplayManager displayManager) {
            this.f387503a = displayManager;
        }

        @j.P
        public static d a(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new d(displayManager);
            }
            return null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i12) {
            b.a aVar = this.f387504b;
            if (aVar == null || i12 != 0) {
                return;
            }
            aVar.a(this.f387503a.getDisplay(0));
        }

        @Override // com.yandex.mobile.ads.impl.lh1.b
        public final void a(b.a aVar) {
            this.f387504b = aVar;
            this.f387503a.registerDisplayListener(this, pc1.a((Handler.Callback) null));
            aVar.a(this.f387503a.getDisplay(0));
        }

        @Override // com.yandex.mobile.ads.impl.lh1.b
        public final void a() {
            this.f387503a.unregisterDisplayListener(this);
            this.f387504b = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i12) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i12) {
        }
    }

    public final void a(int i12) {
        if (this.f387494j == i12) {
            return;
        }
        this.f387494j = i12;
        a(true);
    }

    public final void a(@j.P Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        Surface surface2 = this.f387489e;
        if (surface2 == surface) {
            return;
        }
        if (pc1.f388768a >= 30 && surface2 != null && this.f387494j != Integer.MIN_VALUE && this.f387492h != 0.0f) {
            this.f387492h = 0.0f;
            a.a(surface2, 0.0f);
        }
        this.f387489e = surface;
        a(true);
    }

    public final void b(float f12) {
        this.f387493i = f12;
        this.f387497m = 0L;
        this.f387500p = -1L;
        this.f387498n = -1L;
        a(false);
    }

    public final void a(float f12) {
        this.f387490f = f12;
        this.f387485a.f();
        d();
    }

    public final long a(long j12) {
        long j13;
        if (this.f387500p != -1 && this.f387485a.e()) {
            long jA2 = this.f387501q + ((long) (((this.f387497m - this.f387500p) * this.f387485a.a()) / this.f387493i));
            if (Math.abs(j12 - jA2) <= 20000000) {
                j12 = jA2;
            } else {
                this.f387497m = 0L;
                this.f387500p = -1L;
                this.f387498n = -1L;
            }
        }
        this.f387498n = this.f387497m;
        this.f387499o = j12;
        e eVar = this.f387487c;
        if (eVar == null || this.f387495k == -9223372036854775807L) {
            return j12;
        }
        long j14 = eVar.f387506b;
        if (j14 == -9223372036854775807L) {
            return j12;
        }
        long j15 = this.f387495k;
        long j16 = (((j12 - j14) / j15) * j15) + j14;
        if (j12 <= j16) {
            j13 = j16 - j15;
        } else {
            j13 = j16;
            j16 = j15 + j16;
        }
        if (j16 - j12 >= j12 - j13) {
            j16 = j13;
        }
        return j16 - this.f387496l;
    }

    public final void b(long j12) {
        long j13 = this.f387498n;
        if (j13 != -1) {
            this.f387500p = j13;
            this.f387501q = this.f387499o;
        }
        this.f387497m++;
        this.f387485a.a(j12 * 1000);
        d();
    }

    public final void a() {
        this.f387497m = 0L;
        this.f387500p = -1L;
        this.f387498n = -1L;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(boolean r4) {
        /*
            r3 = this;
            int r0 = com.yandex.mobile.ads.impl.pc1.f388768a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f387489e
            if (r0 == 0) goto L30
            int r1 = r3.f387494j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f387488d
            if (r1 == 0) goto L21
            float r1 = r3.f387491g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f387493i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f387492h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            return
        L2b:
            r3.f387492h = r1
            com.yandex.mobile.ads.impl.lh1.a.a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.lh1.a(boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@j.P Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            this.f387495k = refreshRate;
            this.f387496l = (refreshRate * 80) / 100;
        } else {
            ka0.d("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            this.f387495k = -9223372036854775807L;
            this.f387496l = -9223372036854775807L;
        }
    }

    @j.P
    private static b a(@j.P Context context) {
        if (context == null) {
            return null;
        }
        Context applicationContext = context.getApplicationContext();
        d dVarA = pc1.f388768a >= 17 ? d.a(applicationContext) : null;
        return dVarA == null ? c.a(applicationContext) : dVarA;
    }
}
