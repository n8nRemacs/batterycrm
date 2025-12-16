package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.PlaybackException;
import java.util.List;

/* loaded from: classes.dex */
public final class px8 implements u3c {
    public final long X;
    public boolean Y;
    public final yx8 Z;
    public final q9g a;
    public boolean b;
    public final ox8 c;
    public final nx8 d;
    public final Handler o;

    public px8(Context context, tje tjeVar, Bundle bundle, nx8 nx8Var, Looper looper, yx8 yx8Var, h79 h79Var) {
        px8 px8Var;
        ox8 ly8Var;
        hsi.e(context, "context must not be null");
        hsi.e(tjeVar, "token must not be null");
        a8i.j("MediaController", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + zxg.a + "]");
        this.a = new q9g();
        this.X = -9223372036854775807L;
        this.d = nx8Var;
        this.o = new Handler(looper);
        this.Z = yx8Var;
        if (tjeVar.a.d()) {
            h79Var.getClass();
            ly8Var = new ry8(context, this, tjeVar, bundle, looper, h79Var);
            px8Var = this;
        } else {
            px8Var = this;
            ly8Var = new ly8(context, px8Var, tjeVar, bundle, looper);
        }
        px8Var.c = ly8Var;
        ly8Var.connect();
    }

    @Override // defpackage.u3c
    public final void A(int i, long j, List list) {
        D();
        hsi.e(list, "mediaItems must not be null");
        for (int i2 = 0; i2 < list.size(); i2++) {
            hsi.a("items must not contain null, index=" + i2, list.get(i2) != null);
        }
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            ox8Var.A(i, j, list);
        } else {
            a8i.l("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    public final void B(k20 k20Var, boolean z) {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            ox8Var.M(k20Var, z);
        } else {
            a8i.l("MediaController", "The controller is not connected. Ignoring setAudioAttributes().");
        }
    }

    @Override // defpackage.u3c
    public final void C(List list) {
        D();
        hsi.e(list, "mediaItems must not be null");
        for (int i = 0; i < list.size(); i++) {
            hsi.a("items must not contain null, index=" + i, list.get(i) != null);
        }
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            ox8Var.C(list);
        } else {
            a8i.l("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    public final void D() {
        hsi.f("MediaController method is called from a wrong thread. See javadoc of MediaController for details.", Looper.myLooper() == this.o.getLooper());
    }

    @Override // defpackage.u3c
    public final boolean S(int i) {
        D();
        ox8 ox8Var = this.c;
        return (!ox8Var.isConnected() ? o3c.b : ox8Var.D()).a(i);
    }

    @Override // defpackage.u3c
    public final float a() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            return ox8Var.a();
        }
        return 1.0f;
    }

    public final void b(r3c r3cVar) {
        this.c.G(r3cVar);
    }

    public final long c() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            return ox8Var.K();
        }
        return 0L;
    }

    public final k09 d() {
        s9g s9gVarV = v();
        if (s9gVarV.p()) {
            return null;
        }
        return s9gVarV.m(t(), this.a, 0L).c;
    }

    @Override // defpackage.u3c
    public final long e() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            return ox8Var.e();
        }
        return 0L;
    }

    @Override // defpackage.u3c
    public final boolean f() {
        D();
        ox8 ox8Var = this.c;
        return ox8Var.isConnected() && ox8Var.f();
    }

    @Override // defpackage.u3c
    public final long g() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            return ox8Var.g();
        }
        return 0L;
    }

    @Override // defpackage.u3c
    public final long getDuration() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            return ox8Var.getDuration();
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.u3c
    public final int getPlaybackState() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            return ox8Var.getPlaybackState();
        }
        return 1;
    }

    @Override // defpackage.u3c
    public final int getRepeatMode() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            return ox8Var.getRepeatMode();
        }
        return 0;
    }

    @Override // defpackage.u3c
    public final void h(k09 k09Var, long j) {
        D();
        hsi.e(k09Var, "mediaItems must not be null");
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            ox8Var.h(k09Var, j);
        } else {
            a8i.l("MediaController", "The controller is not connected. Ignoring setMediaItem().");
        }
    }

    @Override // defpackage.u3c
    public final boolean i() {
        D();
        ox8 ox8Var = this.c;
        return ox8Var.isConnected() && ox8Var.i();
    }

    @Override // defpackage.u3c
    public final int j() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            return ox8Var.j();
        }
        return -1;
    }

    @Override // defpackage.u3c
    public final void k() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            ox8Var.k();
        } else {
            a8i.l("MediaController", "The controller is not connected. Ignoring seekTo().");
        }
    }

    @Override // defpackage.u3c
    public final int l() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            return ox8Var.l();
        }
        return -1;
    }

    public final boolean m() {
        D();
        s9g s9gVarV = v();
        return !s9gVarV.p() && s9gVarV.m(t(), this.a, 0L).h;
    }

    @Override // defpackage.u3c
    public final PlaybackException n() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            return ox8Var.n();
        }
        return null;
    }

    public final boolean o() {
        D();
        ox8 ox8Var = this.c;
        return ox8Var.isConnected() && ox8Var.d();
    }

    @Override // defpackage.u3c
    public final long p() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            return ox8Var.p();
        }
        return 0L;
    }

    @Override // defpackage.u3c
    public final void play() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            ox8Var.play();
        } else {
            a8i.l("MediaController", "The controller is not connected. Ignoring play().");
        }
    }

    @Override // defpackage.u3c
    public final void prepare() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            ox8Var.prepare();
        } else {
            a8i.l("MediaController", "The controller is not connected. Ignoring prepare().");
        }
    }

    @Override // defpackage.u3c
    public final kgg q() {
        D();
        ox8 ox8Var = this.c;
        return ox8Var.isConnected() ? ox8Var.q() : kgg.b;
    }

    public final void r() {
        hsi.g(Looper.myLooper() == this.o.getLooper());
        hsi.g(!this.Y);
        this.Y = true;
        yx8 yx8Var = this.Z;
        yx8Var.t0 = true;
        px8 px8Var = yx8Var.s0;
        if (px8Var != null) {
            yx8Var.k(px8Var);
        }
    }

    @Override // defpackage.u3c
    public final int s() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            return ox8Var.s();
        }
        return -1;
    }

    @Override // defpackage.u3c
    public final int t() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            return ox8Var.t();
        }
        return -1;
    }

    @Override // defpackage.u3c
    public final int u() {
        D();
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            return ox8Var.u();
        }
        return 0;
    }

    @Override // defpackage.u3c
    public final s9g v() {
        D();
        ox8 ox8Var = this.c;
        return ox8Var.isConnected() ? ox8Var.v() : s9g.a;
    }

    public final void w() {
        D();
        if (this.b) {
            return;
        }
        a8i.j("MediaController", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.8.0] [" + zxg.a + "] [" + e19.b() + "]");
        this.b = true;
        Handler handler = this.o;
        handler.removeCallbacksAndMessages(null);
        try {
            this.c.release();
        } catch (Exception e) {
            a8i.f("MediaController", "Exception while releasing impl", e);
        }
        if (this.Y) {
            hsi.g(Looper.myLooper() == handler.getLooper());
            this.d.C(this);
        } else {
            this.Y = true;
            yx8 yx8Var = this.Z;
            yx8Var.getClass();
            yx8Var.l(new SecurityException("Session rejected the connection request."));
        }
    }

    @Override // defpackage.u3c
    public final void x(k09 k09Var) {
        D();
        hsi.e(k09Var, "mediaItems must not be null");
        ox8 ox8Var = this.c;
        if (ox8Var.isConnected()) {
            ox8Var.x(k09Var);
        } else {
            a8i.l("MediaController", "The controller is not connected. Ignoring setMediaItems().");
        }
    }

    @Override // defpackage.u3c
    public final boolean y() {
        D();
        ox8 ox8Var = this.c;
        return ox8Var.isConnected() && ox8Var.y();
    }

    public final void z(Runnable runnable) {
        zxg.a0(this.o, runnable);
    }
}
