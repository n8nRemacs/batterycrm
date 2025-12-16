package com.google.android.exoplayer2.ui;

import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.d0;
import com.google.android.exoplayer2.s0;
import com.google.android.exoplayer2.ui.C;
import com.google.android.exoplayer2.util.C36585a;
import com.google.android.exoplayer2.util.U;
import j.InterfaceC42164u;
import j.P;
import j.X;

/* compiled from: PlayerControlView.java */
/* loaded from: classes6.dex */
public class m extends FrameLayout {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ int f347507o = 0;

    /* renamed from: b, reason: collision with root package name */
    @P
    public d0 f347508b;

    /* renamed from: c, reason: collision with root package name */
    @P
    public d f347509c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f347510d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f347511e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f347512f;

    /* renamed from: g, reason: collision with root package name */
    public int f347513g;

    /* renamed from: h, reason: collision with root package name */
    public int f347514h;

    /* renamed from: i, reason: collision with root package name */
    public int f347515i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f347516j;

    /* renamed from: k, reason: collision with root package name */
    public long f347517k;

    /* renamed from: l, reason: collision with root package name */
    public long f347518l;

    /* renamed from: m, reason: collision with root package name */
    public long f347519m;

    /* renamed from: n, reason: collision with root package name */
    public long f347520n;

    /* compiled from: PlayerControlView.java */
    @X
    public static final class b {
        @InterfaceC42164u
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    /* compiled from: PlayerControlView.java */
    public final class c implements d0.g, C.a, View.OnClickListener {
        public c(a aVar) {
        }

        @Override // com.google.android.exoplayer2.ui.C.a
        public final void a(long j12) {
            int i12 = m.f347507o;
            m.this.getClass();
        }

        @Override // com.google.android.exoplayer2.ui.C.a
        public final void b(long j12, boolean z12) {
            d0 d0Var;
            int currentMediaItemIndex;
            m mVar = m.this;
            mVar.getClass();
            if (z12 || (d0Var = mVar.f347508b) == null) {
                return;
            }
            s0 currentTimeline = d0Var.getCurrentTimeline();
            if (mVar.f347512f && !currentTimeline.p()) {
                int iO2 = currentTimeline.o();
                currentMediaItemIndex = 0;
                while (true) {
                    long jR2 = U.R(currentTimeline.m(currentMediaItemIndex, null, 0L).f345893o);
                    if (j12 < jR2) {
                        break;
                    }
                    if (currentMediaItemIndex == iO2 - 1) {
                        j12 = jR2;
                        break;
                    } else {
                        j12 -= jR2;
                        currentMediaItemIndex++;
                    }
                }
            } else {
                currentMediaItemIndex = d0Var.getCurrentMediaItemIndex();
            }
            d0Var.f(currentMediaItemIndex, j12);
            mVar.e();
        }

        @Override // com.google.android.exoplayer2.ui.C.a
        public final void c(long j12) {
            m.this.getClass();
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            d0 d0Var = m.this.f347508b;
            if (d0Var != null && view == null) {
                d0Var.K();
            }
        }

        @Override // com.google.android.exoplayer2.d0.g
        public final void onEvents(d0 d0Var, d0.f fVar) {
            d0 d0Var2;
            boolean zB2 = fVar.b(4, 5);
            m mVar = m.this;
            if (zB2) {
                int i12 = m.f347507o;
                if (mVar.c() && mVar.f347510d && (d0Var2 = mVar.f347508b) != null && d0Var2.getPlaybackState() != 4 && mVar.f347508b.getPlaybackState() != 1) {
                    mVar.f347508b.getPlayWhenReady();
                }
            }
            if (fVar.b(4, 5, 7)) {
                int i13 = m.f347507o;
                mVar.e();
            }
            if (fVar.a(8)) {
                int i14 = m.f347507o;
                mVar.c();
            }
            if (fVar.a(9)) {
                int i15 = m.f347507o;
                mVar.c();
            }
            if (fVar.b(8, 9, 11, 0, 13)) {
                int i16 = m.f347507o;
                mVar.d();
            }
            if (fVar.b(11, 0)) {
                int i17 = m.f347507o;
                mVar.f();
            }
        }
    }

    /* compiled from: PlayerControlView.java */
    public interface d {
        void a();
    }

    /* compiled from: PlayerControlView.java */
    public interface e {
    }

    static {
        com.google.android.exoplayer2.H.a("goog.exo.ui");
    }

    public static void a(d0 d0Var) {
        int playbackState = d0Var.getPlaybackState();
        if (playbackState == 1) {
            d0Var.prepare();
        } else if (playbackState == 4) {
            d0Var.f(d0Var.getCurrentMediaItemIndex(), -9223372036854775807L);
        }
        d0Var.play();
    }

    public final void b() {
        removeCallbacks(null);
        if (this.f347513g <= 0) {
            this.f347517k = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j12 = this.f347513g;
        this.f347517k = jUptimeMillis + j12;
        if (this.f347510d) {
            postDelayed(null, j12);
        }
    }

    public final boolean c() {
        return getVisibility() == 0;
    }

    public final void d() {
        d0 d0Var;
        if (c() && this.f347510d && (d0Var = this.f347508b) != null) {
            d0Var.u(5);
            d0Var.u(7);
            d0Var.u(11);
            d0Var.u(12);
            d0Var.u(9);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        d0 d0Var = this.f347508b;
        if (d0Var == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (d0Var.getPlaybackState() == 4) {
                return true;
            }
            d0Var.z();
            return true;
        }
        if (keyCode == 89) {
            d0Var.E();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            int playbackState = d0Var.getPlaybackState();
            if (playbackState == 1 || playbackState == 4 || !d0Var.getPlayWhenReady()) {
                a(d0Var);
                return true;
            }
            d0Var.pause();
            return true;
        }
        if (keyCode == 87) {
            d0Var.K();
            return true;
        }
        if (keyCode == 88) {
            d0Var.C();
            return true;
        }
        if (keyCode == 126) {
            a(d0Var);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        d0Var.pause();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(null);
        } else if (motionEvent.getAction() == 1) {
            b();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void e() {
        long contentPosition;
        long jL2;
        if (c() && this.f347510d) {
            d0 d0Var = this.f347508b;
            if (d0Var != null) {
                contentPosition = d0Var.getContentPosition() + this.f347518l;
                jL2 = d0Var.l() + this.f347518l;
            } else {
                contentPosition = 0;
                jL2 = 0;
            }
            boolean z12 = contentPosition != this.f347519m;
            boolean z13 = jL2 != this.f347520n;
            this.f347519m = contentPosition;
            this.f347520n = jL2;
            d dVar = this.f347509c;
            if (dVar != null && (z12 || z13)) {
                dVar.a();
            }
            removeCallbacks(null);
            int playbackState = d0Var == null ? 1 : d0Var.getPlaybackState();
            if (d0Var != null && d0Var.k()) {
                long jMin = Math.min(1000L, 1000 - (contentPosition % 1000));
                float f12 = d0Var.getPlaybackParameters().f344180b;
                postDelayed(null, U.l(f12 > 0.0f ? (long) (jMin / f12) : 1000L, this.f347514h, 1000L));
            } else {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(null, 1000L);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[EDGE_INSN: B:17:0x0036->B:18:0x0037 BREAK  A[LOOP:0: B:11:0x0020->B:15:0x0032]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r13 = this;
            r0 = 1
            com.google.android.exoplayer2.d0 r1 = r13.f347508b
            if (r1 != 0) goto L6
            return
        L6:
            boolean r2 = r13.f347511e
            r3 = 0
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L36
            com.google.android.exoplayer2.s0 r2 = r1.getCurrentTimeline()
            int r7 = r2.o()
            r8 = 100
            if (r7 <= r8) goto L1b
            goto L36
        L1b:
            int r7 = r2.o()
            r8 = r5
        L20:
            if (r8 >= r7) goto L34
            com.google.android.exoplayer2.s0$d r9 = r2.m(r8, r6, r3)
            long r9 = r9.f345893o
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L32
            goto L36
        L32:
            int r8 = r8 + r0
            goto L20
        L34:
            r2 = r0
            goto L37
        L36:
            r2 = r5
        L37:
            r13.f347512f = r2
            r13.f347518l = r3
            com.google.android.exoplayer2.s0 r2 = r1.getCurrentTimeline()
            boolean r7 = r2.p()
            if (r7 != 0) goto L66
            int r1 = r1.getCurrentMediaItemIndex()
            boolean r7 = r13.f347512f
            if (r7 == 0) goto L4e
            goto L4f
        L4e:
            r5 = r1
        L4f:
            if (r7 == 0) goto L57
            int r7 = r2.o()
            int r7 = r7 - r0
            goto L58
        L57:
            r7 = r1
        L58:
            if (r5 > r7) goto L66
            if (r5 != r1) goto L62
            long r0 = com.google.android.exoplayer2.util.U.R(r3)
            r13.f347518l = r0
        L62:
            r2.n(r5, r6)
            throw r6
        L66:
            int r0 = com.google.android.exoplayer2.util.U.f348106a
            r13.e()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.m.f():void");
    }

    @P
    public d0 getPlayer() {
        return this.f347508b;
    }

    public int getRepeatToggleModes() {
        return this.f347515i;
    }

    public boolean getShowShuffleButton() {
        return this.f347516j;
    }

    public int getShowTimeoutMs() {
        return this.f347513g;
    }

    public boolean getShowVrButton() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        d0 d0Var;
        super.onAttachedToWindow();
        this.f347510d = true;
        long j12 = this.f347517k;
        if (j12 != -9223372036854775807L) {
            long jUptimeMillis = j12 - SystemClock.uptimeMillis();
            if (jUptimeMillis > 0) {
                postDelayed(null, jUptimeMillis);
            } else if (c()) {
                setVisibility(8);
                throw null;
            }
        } else if (c()) {
            b();
        }
        if (c() && this.f347510d && (d0Var = this.f347508b) != null && d0Var.getPlaybackState() != 4 && this.f347508b.getPlaybackState() != 1) {
            this.f347508b.getPlayWhenReady();
        }
        d();
        c();
        c();
        f();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f347510d = false;
        removeCallbacks(null);
        removeCallbacks(null);
    }

    public void setPlayer(@P d0 d0Var) {
        d0 d0Var2;
        C36585a.d(Looper.myLooper() == Looper.getMainLooper());
        C36585a.b(d0Var == null || d0Var.G() == Looper.getMainLooper());
        d0 d0Var3 = this.f347508b;
        if (d0Var3 == d0Var) {
            return;
        }
        if (d0Var3 != null) {
            d0Var3.s(null);
        }
        this.f347508b = d0Var;
        if (d0Var != null) {
            d0Var.N(null);
        }
        if (c() && this.f347510d && (d0Var2 = this.f347508b) != null && d0Var2.getPlaybackState() != 4 && this.f347508b.getPlaybackState() != 1) {
            this.f347508b.getPlayWhenReady();
        }
        d();
        c();
        c();
        f();
    }

    public void setProgressUpdateListener(@P d dVar) {
        this.f347509c = dVar;
    }

    public void setRepeatToggleModes(int i12) {
        this.f347515i = i12;
        d0 d0Var = this.f347508b;
        if (d0Var != null) {
            int repeatMode = d0Var.getRepeatMode();
            if (i12 == 0 && repeatMode != 0) {
                this.f347508b.setRepeatMode(0);
            } else if (i12 == 1 && repeatMode == 2) {
                this.f347508b.setRepeatMode(1);
            } else if (i12 == 2 && repeatMode == 1) {
                this.f347508b.setRepeatMode(2);
            }
        }
        c();
    }

    public void setShowFastForwardButton(boolean z12) {
        d();
    }

    public void setShowMultiWindowTimeBar(boolean z12) {
        this.f347511e = z12;
        f();
    }

    public void setShowNextButton(boolean z12) {
        d();
    }

    public void setShowPreviousButton(boolean z12) {
        d();
    }

    public void setShowRewindButton(boolean z12) {
        d();
    }

    public void setShowShuffleButton(boolean z12) {
        this.f347516j = z12;
        c();
    }

    public void setShowTimeoutMs(int i12) {
        this.f347513g = i12;
        if (c()) {
            b();
        }
    }

    public void setTimeBarMinUpdateInterval(int i12) {
        this.f347514h = U.k(i12, 16, 1000);
    }

    public void setShowVrButton(boolean z12) {
    }

    public void setVrButtonListener(@P View.OnClickListener onClickListener) {
    }
}
