package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;

/* loaded from: classes.dex */
public final class ex8 implements och {
    public final /* synthetic */ jx8 b;

    public ex8(jx8 jx8Var) {
        this.b = jx8Var;
    }

    @Override // defpackage.och
    public final void a(VideoSink$VideoSinkException videoSink$VideoSinkException) {
        hf6 hf6Var = videoSink$VideoSinkException.a;
        jx8 jx8Var = this.b;
        jx8Var.F1 = jx8Var.d(videoSink$VideoSinkException, hf6Var, false, 7001);
    }

    @Override // defpackage.och
    public final void b() {
        jx8 jx8Var = this.b;
        if (jx8Var.f2 != null) {
            jx8Var.O0(0, 1);
        }
    }

    @Override // defpackage.och
    public final void c() {
        im5 im5Var = this.b.R0;
        if (im5Var != null) {
            im5Var.a();
        }
    }

    @Override // defpackage.och
    public final void g(sch schVar) {
    }

    @Override // defpackage.och
    public final void onFirstFrameRendered() {
        jx8 jx8Var = this.b;
        Surface surface = jx8Var.f2;
        if (surface != null) {
            vhb vhbVar = jx8Var.R1;
            Handler handler = (Handler) vhbVar.b;
            if (handler != null) {
                handler.post(new nh2(vhbVar, surface, SystemClock.elapsedRealtime(), 7));
            }
            jx8Var.i2 = true;
        }
    }
}
