package defpackage;

import android.media.metrics.LogSessionId;

/* loaded from: classes.dex */
public final class vk5 extends wk5 {
    public final jdc O0;
    public final LogSessionId P0;
    public boolean Q0;

    public vk5(jdc jdcVar, v32 v32Var, zt ztVar, LogSessionId logSessionId) {
        super(1, v32Var, ztVar);
        this.O0 = jdcVar;
        this.P0 = logSessionId;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006c  */
    @Override // defpackage.wk5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C() throws androidx.media3.transformer.ExportException {
        /*
            r6 = this;
            zwd r0 = r6.D0
            ph4 r0 = r0.e()
            r1 = 0
            if (r0 != 0) goto La
            goto L6b
        La:
            boolean r2 = r6.Q0
            r3 = 1
            if (r2 != 0) goto L63
            sk4 r2 = r6.E0
            boolean r2 = r2.e()
            if (r2 == 0) goto L2c
            java.nio.ByteBuffer r2 = r0.o
            r2.getClass()
            r2.limit(r1)
            r2 = 4
            r0.a(r2)
            zwd r0 = r6.D0
            boolean r0 = r0.g()
            r6.F0 = r0
            return r1
        L2c:
            sk4 r2 = r6.E0
            java.nio.ByteBuffer r2 = r2.d()
            if (r2 != 0) goto L35
            goto L6b
        L35:
            int r4 = r2.limit()
            r0.y(r4)
            java.nio.ByteBuffer r4 = r0.o
            java.nio.ByteBuffer r2 = r4.put(r2)
            r2.flip()
            sk4 r2 = r6.E0
            boolean r4 = r2.g(r1)
            if (r4 == 0) goto L50
            android.media.MediaCodec$BufferInfo r2 = r2.a
            goto L51
        L50:
            r2 = 0
        L51:
            r2.getClass()
            long r4 = r2.presentationTimeUs
            r0.Y = r4
            int r2 = r2.flags
            r0.b = r2
            sk4 r0 = r6.E0
            r0.j()
            r6.Q0 = r3
        L63:
            zwd r0 = r6.D0
            boolean r0 = r0.g()
            if (r0 != 0) goto L6c
        L6b:
            return r1
        L6c:
            r6.Q0 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vk5.C():boolean");
    }

    @Override // defpackage.wk5
    public final void D(hf6 hf6Var) {
        this.E0 = this.O0.d(hf6Var, this.P0);
    }

    @Override // defpackage.wk5
    public final boolean L(ph4 ph4Var) {
        if (ph4Var.j(4)) {
            return false;
        }
        long j = ph4Var.Y - this.C0;
        ph4Var.Y = j;
        if (this.E0 == null || j >= 0) {
            return false;
        }
        ph4Var.w();
        return true;
    }

    @Override // defpackage.tk0
    public final String h() {
        return "ExoAssetLoaderAudioRenderer";
    }
}
