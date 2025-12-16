package defpackage;

import android.media.MediaCodec;
import android.media.metrics.LogSessionId;
import androidx.media3.transformer.ExportException;
import androidx.work.WorkRequest;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class xk5 extends wk5 {
    public final jdc O0;
    public final int P0;
    public final ArrayList Q0;
    public final LogSessionId R0;
    public int S0;

    public xk5(jdc jdcVar, int i, v32 v32Var, zt ztVar, LogSessionId logSessionId) {
        super(2, v32Var, ztVar);
        this.O0 = jdcVar;
        this.P0 = i;
        this.R0 = logSessionId;
        this.Q0 = new ArrayList();
        this.S0 = -1;
    }

    @Override // defpackage.wk5
    public final boolean C() throws ExportException {
        if (this.E0.e()) {
            this.D0.f();
            this.F0 = true;
            return false;
        }
        sk4 sk4Var = this.E0;
        MediaCodec.BufferInfo bufferInfo = sk4Var.g(false) ? sk4Var.a : null;
        if (bufferInfo != null) {
            long j = bufferInfo.presentationTimeUs;
            long j2 = j - this.C0;
            if (j2 >= 0) {
                ArrayList arrayList = this.Q0;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (((Long) arrayList.get(i)).longValue() == j) {
                        arrayList.remove(i);
                    }
                }
                if (this.D0.c() != this.S0 && this.D0.h(j2)) {
                    this.E0.k(j2, true);
                    return true;
                }
            }
            this.E0.j();
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // defpackage.wk5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void D(defpackage.hf6 r5) {
        /*
            r4 = this;
            zwd r0 = r4.D0
            defpackage.hsi.h(r0)
            gf3 r0 = r5.D
            boolean r0 = defpackage.gf3.h(r0)
            if (r0 == 0) goto L13
            int r0 = r4.P0
            r1 = 1
            if (r0 != r1) goto L13
            goto L14
        L13:
            r1 = 0
        L14:
            zwd r0 = r4.D0
            android.view.Surface r0 = r0.b()
            r0.getClass()
            android.media.metrics.LogSessionId r2 = r4.R0
            jdc r3 = r4.O0
            sk4 r5 = r3.a(r5, r0, r1, r2)
            r4.E0 = r5
            int r5 = r5.f
            r4.S0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xk5.D(hf6):void");
    }

    @Override // defpackage.wk5
    public final void E(ph4 ph4Var) {
        long j = ph4Var.Y;
        if (j < this.v0) {
            this.Q0.add(Long.valueOf(j));
        }
    }

    @Override // defpackage.wk5
    public final void F(hf6 hf6Var) {
    }

    @Override // defpackage.wk5
    public final hf6 G(hf6 hf6Var) {
        if (this.P0 != 3 || !gf3.h(hf6Var.D)) {
            return hf6Var;
        }
        ff6 ff6VarA = hf6Var.a();
        ff6VarA.C = gf3.h;
        return new hf6(ff6VarA);
    }

    @Override // defpackage.wk5
    public final hf6 H(hf6 hf6Var) {
        gf3 gf3Var = hf6Var.D;
        if (gf3Var == null || !gf3Var.f()) {
            gf3Var = gf3.h;
        }
        if (this.P0 == 1 && gf3.h(gf3Var)) {
            gf3Var = gf3.h;
        }
        ff6 ff6VarA = hf6Var.a();
        ff6VarA.C = gf3Var;
        return new hf6(ff6VarA);
    }

    @Override // defpackage.wk5
    public final boolean L(ph4 ph4Var) {
        if (!ph4Var.j(4)) {
            ph4Var.o.getClass();
            if (this.E0 == null) {
                ph4Var.Y -= this.C0;
            }
        }
        return false;
    }

    @Override // defpackage.tk0
    public final long f(long j, long j2) {
        if (this.Z == 1) {
            return 1000000L;
        }
        int i = this.S0;
        return i == -1 ? WorkRequest.MIN_BACKOFF_MILLIS : i * 2000;
    }

    @Override // defpackage.tk0
    public final String h() {
        return "ExoAssetLoaderVideoRenderer";
    }
}
