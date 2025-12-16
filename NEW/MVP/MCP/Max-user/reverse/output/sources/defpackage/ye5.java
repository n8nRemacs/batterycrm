package defpackage;

import android.media.MediaCodec;
import android.media.MediaFormat;
import androidx.camera.video.internal.compat.quirk.CameraUseInconsistentTimebaseQuirk;
import androidx.camera.video.internal.compat.quirk.CodecStuckOnFlushQuirk;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes.dex */
public final class ye5 extends MediaCodec.Callback {
    public final x79 a;
    public final boolean b;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;
    public long f = 0;
    public long g = 0;
    public boolean h = false;
    public boolean i = false;
    public boolean j = false;
    public final /* synthetic */ bf5 k;

    public ye5(bf5 bf5Var) {
        this.k = bf5Var;
        this.b = true;
        if (bf5Var.c) {
            xxf xxfVar = bf5Var.q;
            f9g f9gVar = bf5Var.p;
            CameraUseInconsistentTimebaseQuirk cameraUseInconsistentTimebaseQuirk = (CameraUseInconsistentTimebaseQuirk) pv4.a.e(CameraUseInconsistentTimebaseQuirk.class);
            x79 x79Var = new x79();
            x79Var.d = -1L;
            x79Var.a = xxfVar;
            x79Var.b = f9gVar;
            x79Var.c = cameraUseInconsistentTimebaseQuirk;
            this.a = x79Var;
        } else {
            this.a = null;
        }
        if (((CodecStuckOnFlushQuirk) pv4.a.e(CodecStuckOnFlushQuirk.class)) == null || !"video/mp4v-es".equals(bf5Var.d.getString("mime"))) {
            return;
        }
        this.b = false;
    }

    public final void a() {
        bf5 bf5Var;
        ke5 ke5Var;
        Executor executor;
        if (this.e) {
            return;
        }
        this.e = true;
        ScheduledFuture scheduledFuture = this.k.C;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.k.C = null;
        }
        synchronized (this.k.b) {
            bf5Var = this.k;
            ke5Var = bf5Var.r;
            executor = bf5Var.s;
        }
        bf5Var.l(new se5(this, executor, ke5Var));
    }

    public final void b(ae5 ae5Var, ke5 ke5Var, Executor executor) {
        bf5 bf5Var = this.k;
        bf5Var.n.add(ae5Var);
        wsf.b(wsf.g(ae5Var.o), new i5i(this, ae5Var, false), bf5Var.h);
        try {
            executor.execute(new kr4(ke5Var, 23, ae5Var));
        } catch (RejectedExecutionException e) {
            gri.c(bf5Var.a, "Unable to post to the supplied executor.", e);
            ae5Var.close();
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        this.k.h.execute(new kr4(this, 20, codecException));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i) {
        this.k.h.execute(new l30(this, i, 9));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i, MediaCodec.BufferInfo bufferInfo) {
        this.k.h.execute(new qe5(this, bufferInfo, mediaCodec, i, 1));
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        this.k.h.execute(new kr4(this, 21, mediaFormat));
    }
}
