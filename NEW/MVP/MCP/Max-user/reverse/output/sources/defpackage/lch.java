package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import androidx.media3.common.VideoFrameProcessingException;
import androidx.media3.transformer.ExportException;
import defpackage.c4h;
import defpackage.gf3;
import defpackage.s2f;
import defpackage.s4h;
import defpackage.t4h;
import defpackage.uy0;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class lch extends bxd {
    public final kch e;
    public final ich f;
    public final ph4 g;
    public volatile long h;
    public long i;
    public boolean j;

    public lch(Context context, hf6 hf6Var, chg chgVar, mni mniVar, List list, final c4h c4hVar, cd3 cd3Var, u9a u9aVar, ehg ehgVar, w86 w86Var, uy0 uy0Var, long j, boolean z, wg7 wg7Var, int i, LogSessionId logSessionId) throws ExportException {
        super(hf6Var, u9aVar);
        boolean z2 = i < 1;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        gf3 gf3Var = hf6Var.D;
        gf3Var.getClass();
        gf3 gf3Var2 = gf3Var.c == 2 ? Objects.equals(hf6Var.n, "image/jpeg_r") ? new gf3(6, 1, 7, -1, -1, null) : gf3.h : gf3Var;
        ff6 ff6VarA = hf6Var.a();
        ff6VarA.C = gf3Var2;
        ich ichVar = new ich(cd3Var, new hf6(ff6VarA), wg7Var, u9aVar.b.a(2), chgVar, w86Var, logSessionId);
        this.f = ichVar;
        this.g = new ph4(0);
        if (ichVar.h == 2 && gf3.h(gf3Var)) {
            gf3Var2 = gf3.h;
        }
        try {
            kch kchVar = new kch(this, context, z ? new e7a(c4hVar) : new r4h(c4hVar) { // from class: androidx.media3.effect.SingleInputVideoGraph$Factory
                public final c4h a;

                {
                    this.a = c4hVar;
                }

                @Override // defpackage.r4h
                public final t4h a(Context context2, gf3 gf3Var3, uy0 uy0Var2, s4h s4hVar, Executor executor, long j2, boolean z3) {
                    return new s2f(uy0Var2, gf3Var3, this.a, s4hVar, context2, executor, z3);
                }
            }, gf3Var2, uy0Var, mniVar, list, ehgVar, j, i, z2);
            this.e = kchVar;
            kchVar.a.e();
        } catch (VideoFrameProcessingException e) {
            throw new ExportException("Video frame processing error", e, 5001, 0);
        }
    }

    @Override // defpackage.bxd
    public final sx6 j(g95 g95Var, hf6 hf6Var, int i) throws ExportException {
        try {
            kch kchVar = this.e;
            t4h t4hVar = kchVar.a;
            t4hVar.i(i);
            return new jch(t4hVar, i, kchVar.e);
        } catch (VideoFrameProcessingException e) {
            throw new ExportException("Video frame processing error", e, 5001, 0);
        }
    }

    @Override // defpackage.bxd
    public final ph4 k() {
        ph4 ph4Var = this.g;
        ich ichVar = this.f;
        MediaCodec.BufferInfo bufferInfo = null;
        ph4Var.o = ichVar.k != null ? ichVar.k.d() : null;
        if (this.g.o == null) {
            return null;
        }
        ich ichVar2 = this.f;
        if (ichVar2.k != null) {
            sk4 sk4Var = ichVar2.k;
            if (sk4Var.g(false)) {
                bufferInfo = sk4Var.a;
            }
        }
        bufferInfo.getClass();
        if (bufferInfo.presentationTimeUs == 0 && this.e.a.n() == this.j && this.h != -9223372036854775807L && bufferInfo.size > 0) {
            bufferInfo.presentationTimeUs = this.h;
        }
        ph4 ph4Var2 = this.g;
        long j = bufferInfo.presentationTimeUs;
        ph4Var2.Y = j;
        ph4Var2.b = bufferInfo.flags;
        this.i = j;
        return ph4Var2;
    }

    @Override // defpackage.bxd
    public final hf6 l() throws ExportException {
        ich ichVar = this.f;
        if (ichVar.k == null) {
            return null;
        }
        sk4 sk4Var = ichVar.k;
        sk4Var.g(false);
        hf6 hf6Var = sk4Var.j;
        if (hf6Var == null || ichVar.l == 0) {
            return hf6Var;
        }
        ff6 ff6VarA = hf6Var.a();
        ff6VarA.y = ichVar.l;
        return new hf6(ff6VarA);
    }

    @Override // defpackage.bxd
    public final boolean m() {
        boolean z;
        ich ichVar = this.f;
        if (ichVar.k == null || !ichVar.k.e()) {
            kch kchVar = this.e;
            if (kchVar.d) {
                z = false;
            } else {
                boolean z2 = kchVar.i.h != -9223372036854775807L;
                synchronized (kchVar.b) {
                    z = kchVar.g == 0 && z2;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.bxd
    public final void o() {
        this.e.a.release();
        ich ichVar = this.f;
        if (ichVar.k != null) {
            ichVar.k.i();
        }
        ichVar.m = true;
    }

    @Override // defpackage.bxd
    public final void p() throws ExportException {
        if (this.i == 0) {
            this.j = true;
        }
        ich ichVar = this.f;
        if (ichVar.k != null) {
            ichVar.k.j();
        }
        kch kchVar = this.e;
        if (kchVar.d) {
            return;
        }
        synchronized (kchVar.b) {
            hsi.g(kchVar.g > 0);
            kchVar.g--;
        }
        kchVar.b();
    }
}
