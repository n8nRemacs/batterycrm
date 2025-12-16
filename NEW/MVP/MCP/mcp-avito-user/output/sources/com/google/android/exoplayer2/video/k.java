package com.google.android.exoplayer2.video;

import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.exoplayer2.util.C36605v;
import com.google.android.exoplayer2.util.U;
import j.InterfaceC42164u;
import j.P;
import j.X;

/* compiled from: VideoFrameReleaseHelper.java */
/* loaded from: classes6.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.android.exoplayer2.video.e f348286a = new com.google.android.exoplayer2.video.e();

    /* renamed from: b, reason: collision with root package name */
    @P
    public final b f348287b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public final e f348288c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f348289d;

    /* renamed from: e, reason: collision with root package name */
    @P
    public Surface f348290e;

    /* renamed from: f, reason: collision with root package name */
    public float f348291f;

    /* renamed from: g, reason: collision with root package name */
    public float f348292g;

    /* renamed from: h, reason: collision with root package name */
    public float f348293h;

    /* renamed from: i, reason: collision with root package name */
    public float f348294i;

    /* renamed from: j, reason: collision with root package name */
    public int f348295j;

    /* renamed from: k, reason: collision with root package name */
    public long f348296k;

    /* renamed from: l, reason: collision with root package name */
    public long f348297l;

    /* renamed from: m, reason: collision with root package name */
    public long f348298m;

    /* renamed from: n, reason: collision with root package name */
    public long f348299n;

    /* renamed from: o, reason: collision with root package name */
    public long f348300o;

    /* renamed from: p, reason: collision with root package name */
    public long f348301p;

    /* renamed from: q, reason: collision with root package name */
    public long f348302q;

    /* compiled from: VideoFrameReleaseHelper.java */
    @X
    public static final class a {
        @InterfaceC42164u
        public static void a(Surface surface, float f12) {
            try {
                surface.setFrameRate(f12, f12 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e12) {
                C36605v.a("Failed to call Surface.setFrameRate", e12);
            }
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    public interface b {

        /* compiled from: VideoFrameReleaseHelper.java */
        public interface a {
        }

        void a();

        void b(com.avito.android.str_seller_orders.orders_seller.d dVar);
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    public static final class e implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: f, reason: collision with root package name */
        public static final e f348306f = new e();

        /* renamed from: b, reason: collision with root package name */
        public volatile long f348307b = -9223372036854775807L;

        /* renamed from: c, reason: collision with root package name */
        public final Handler f348308c;

        /* renamed from: d, reason: collision with root package name */
        public Choreographer f348309d;

        /* renamed from: e, reason: collision with root package name */
        public int f348310e;

        public e() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            handlerThread.start();
            Looper looper = handlerThread.getLooper();
            int i12 = U.f348106a;
            Handler handler = new Handler(looper, this);
            this.f348308c = handler;
            handler.sendEmptyMessage(0);
        }

        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j12) {
            this.f348307b = j12;
            Choreographer choreographer = this.f348309d;
            choreographer.getClass();
            choreographer.postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i12 = message.what;
            if (i12 == 0) {
                try {
                    this.f348309d = Choreographer.getInstance();
                } catch (RuntimeException e12) {
                    C36605v.a("Vsync sampling disabled due to platform error", e12);
                }
                return true;
            }
            if (i12 == 1) {
                Choreographer choreographer = this.f348309d;
                if (choreographer != null) {
                    int i13 = this.f348310e + 1;
                    this.f348310e = i13;
                    if (i13 == 1) {
                        choreographer.postFrameCallback(this);
                    }
                }
                return true;
            }
            if (i12 != 2) {
                return false;
            }
            Choreographer choreographer2 = this.f348309d;
            if (choreographer2 != null) {
                int i14 = this.f348310e - 1;
                this.f348310e = i14;
                if (i14 == 0) {
                    choreographer2.removeFrameCallback(this);
                    this.f348307b = -9223372036854775807L;
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
    public k(@j.P android.content.Context r4) {
        /*
            r3 = this;
            r3.<init>()
            com.google.android.exoplayer2.video.e r0 = new com.google.android.exoplayer2.video.e
            r0.<init>()
            r3.f348286a = r0
            r0 = 0
            if (r4 == 0) goto L3b
            android.content.Context r4 = r4.getApplicationContext()
            int r1 = com.google.android.exoplayer2.util.U.f348106a
            r2 = 17
            if (r1 < r2) goto L27
            java.lang.String r1 = "display"
            java.lang.Object r1 = r4.getSystemService(r1)
            android.hardware.display.DisplayManager r1 = (android.hardware.display.DisplayManager) r1
            if (r1 == 0) goto L27
            com.google.android.exoplayer2.video.k$d r2 = new com.google.android.exoplayer2.video.k$d
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
            com.google.android.exoplayer2.video.k$c r1 = new com.google.android.exoplayer2.video.k$c
            r1.<init>(r4)
            r2 = r1
            goto L3c
        L3b:
            r2 = r0
        L3c:
            r3.f348287b = r2
            if (r2 == 0) goto L42
            com.google.android.exoplayer2.video.k$e r0 = com.google.android.exoplayer2.video.k.e.f348306f
        L42:
            r3.f348288c = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3.f348296k = r0
            r3.f348297l = r0
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            r3.f348291f = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.f348294i = r4
            r4 = 0
            r3.f348295j = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.k.<init>(android.content.Context):void");
    }

    public final void a() {
        Surface surface;
        if (U.f348106a < 30 || (surface = this.f348290e) == null || this.f348295j == Integer.MIN_VALUE || this.f348293h == 0.0f) {
            return;
        }
        this.f348293h = 0.0f;
        a.a(surface, 0.0f);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b() {
        /*
            r9 = this;
            int r0 = com.google.android.exoplayer2.util.U.f348106a
            r1 = 30
            if (r0 < r1) goto L8d
            android.view.Surface r0 = r9.f348290e
            if (r0 != 0) goto Lc
            goto L8d
        Lc:
            com.google.android.exoplayer2.video.e r0 = r9.f348286a
            com.google.android.exoplayer2.video.e$a r2 = r0.f348212a
            boolean r2 = r2.a()
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r2 == 0) goto L39
            com.google.android.exoplayer2.video.e$a r2 = r0.f348212a
            boolean r2 = r2.a()
            if (r2 == 0) goto L37
            com.google.android.exoplayer2.video.e$a r2 = r0.f348212a
            long r4 = r2.f348221e
            r6 = 0
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L2b
            goto L2e
        L2b:
            long r6 = r2.f348222f
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
            float r2 = r9.f348291f
        L3b:
            float r4 = r9.f348292g
            int r5 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r5 != 0) goto L42
            return
        L42:
            int r5 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r5 == 0) goto L80
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 == 0) goto L80
            com.google.android.exoplayer2.video.e$a r1 = r0.f348212a
            boolean r1 = r1.a()
            if (r1 == 0) goto L71
            com.google.android.exoplayer2.video.e$a r1 = r0.f348212a
            boolean r1 = r1.a()
            if (r1 == 0) goto L5f
            com.google.android.exoplayer2.video.e$a r0 = r0.f348212a
            long r0 = r0.f348222f
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
            float r1 = r9.f348292g
            float r1 = r2 - r1
            float r1 = java.lang.Math.abs(r1)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L8d
            goto L87
        L80:
            if (r5 == 0) goto L83
            goto L87
        L83:
            int r0 = r0.f348216e
            if (r0 < r1) goto L8d
        L87:
            r9.f348292g = r2
            r0 = 0
            r9.c(r0)
        L8d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.k.b():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(boolean r4) {
        /*
            r3 = this;
            int r0 = com.google.android.exoplayer2.util.U.f348106a
            r1 = 30
            if (r0 < r1) goto L30
            android.view.Surface r0 = r3.f348290e
            if (r0 == 0) goto L30
            int r1 = r3.f348295j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != r2) goto L11
            goto L30
        L11:
            boolean r1 = r3.f348289d
            if (r1 == 0) goto L21
            float r1 = r3.f348292g
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 == 0) goto L21
            float r2 = r3.f348294i
            float r1 = r1 * r2
            goto L22
        L21:
            r1 = 0
        L22:
            if (r4 != 0) goto L2b
            float r4 = r3.f348293h
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 != 0) goto L2b
            return
        L2b:
            r3.f348293h = r1
            com.google.android.exoplayer2.video.k.a.a(r0, r1)
        L30:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.video.k.c(boolean):void");
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    public static final class c implements b {

        /* renamed from: a, reason: collision with root package name */
        public final WindowManager f348303a;

        public c(WindowManager windowManager) {
            this.f348303a = windowManager;
        }

        @Override // com.google.android.exoplayer2.video.k.b
        public final void b(com.avito.android.str_seller_orders.orders_seller.d dVar) {
            dVar.e(this.f348303a.getDefaultDisplay());
        }

        @Override // com.google.android.exoplayer2.video.k.b
        public final void a() {
        }
    }

    /* compiled from: VideoFrameReleaseHelper.java */
    @X
    public static final class d implements b, DisplayManager.DisplayListener {

        /* renamed from: a, reason: collision with root package name */
        public final DisplayManager f348304a;

        /* renamed from: b, reason: collision with root package name */
        @P
        public com.avito.android.str_seller_orders.orders_seller.d f348305b;

        public d(DisplayManager displayManager) {
            this.f348304a = displayManager;
        }

        @Override // com.google.android.exoplayer2.video.k.b
        public final void a() {
            this.f348304a.unregisterDisplayListener(this);
            this.f348305b = null;
        }

        @Override // com.google.android.exoplayer2.video.k.b
        public final void b(com.avito.android.str_seller_orders.orders_seller.d dVar) {
            this.f348305b = dVar;
            Handler handlerN = U.n(null);
            DisplayManager displayManager = this.f348304a;
            displayManager.registerDisplayListener(this, handlerN);
            dVar.e(displayManager.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayChanged(int i12) {
            com.avito.android.str_seller_orders.orders_seller.d dVar = this.f348305b;
            if (dVar == null || i12 != 0) {
                return;
            }
            dVar.e(this.f348304a.getDisplay(0));
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayAdded(int i12) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public final void onDisplayRemoved(int i12) {
        }
    }
}
