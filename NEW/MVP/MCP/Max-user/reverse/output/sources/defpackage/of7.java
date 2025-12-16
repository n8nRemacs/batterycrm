package defpackage;

import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.image.ImageDecoderException;
import java.util.ArrayDeque;

/* loaded from: classes.dex */
public final class of7 extends tk0 {
    public final zo0 C0;
    public final ph4 D0;
    public final ArrayDeque E0;
    public boolean F0;
    public boolean G0;
    public nf7 H0;
    public long I0;
    public long J0;
    public int K0;
    public int L0;
    public hf6 M0;
    public ap0 N0;
    public ph4 O0;
    public af7 P0;
    public Bitmap Q0;
    public boolean R0;
    public c32 S0;
    public c32 T0;
    public int U0;
    public boolean V0;

    public of7(zo0 zo0Var) {
        super(4);
        this.C0 = zo0Var;
        this.P0 = af7.a;
        this.D0 = new ph4(0);
        this.H0 = nf7.c;
        this.E0 = new ArrayDeque();
        this.J0 = -9223372036854775807L;
        this.I0 = -9223372036854775807L;
        this.K0 = 0;
        this.L0 = 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean B(long r13) throws androidx.media3.exoplayer.ExoPlaybackException, java.lang.InterruptedException {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of7.B(long):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean C(long r13) {
        /*
            Method dump skipped, instructions count: 338
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of7.C(long):boolean");
    }

    public final void D() throws ExoPlaybackException, InterruptedException {
        if (this.V0) {
            hf6 hf6Var = this.M0;
            hf6Var.getClass();
            zo0 zo0Var = this.C0;
            zo0Var.getClass();
            int iA = zo0.a(hf6Var);
            if (iA != tk0.b(4, 0, 0, 0) && iA != tk0.b(3, 0, 0, 0)) {
                throw d(new ImageDecoderException("Provided decoder factory can't create decoder for format."), this.M0, false, 4005);
            }
            ap0 ap0Var = this.N0;
            if (ap0Var != null) {
                ap0Var.release();
            }
            this.N0 = new ap0(zo0Var.a);
            this.V0 = false;
        }
    }

    public final void E() throws InterruptedException {
        this.O0 = null;
        this.K0 = 0;
        this.J0 = -9223372036854775807L;
        ap0 ap0Var = this.N0;
        if (ap0Var != null) {
            ap0Var.release();
            this.N0 = null;
        }
    }

    @Override // defpackage.tk0, defpackage.u4c
    public final void a(int i, Object obj) {
        if (i != 15) {
            return;
        }
        af7 af7Var = obj instanceof af7 ? (af7) obj : null;
        if (af7Var == null) {
            af7Var = af7.a;
        }
        this.P0 = af7Var;
    }

    @Override // defpackage.tk0
    public final String h() {
        return "ImageRenderer";
    }

    @Override // defpackage.tk0
    public final boolean j() {
        return this.G0;
    }

    @Override // defpackage.tk0
    public final boolean l() {
        int i = this.L0;
        if (i != 3) {
            return i == 0 && this.R0;
        }
        return true;
    }

    @Override // defpackage.tk0
    public final void m() throws InterruptedException {
        this.M0 = null;
        this.H0 = nf7.c;
        this.E0.clear();
        E();
        this.P0.getClass();
    }

    @Override // defpackage.tk0
    public final void n(boolean z, boolean z2) {
        this.L0 = z2 ? 1 : 0;
    }

    @Override // defpackage.tk0
    public final void o(long j, boolean z) {
        this.L0 = Math.min(this.L0, 1);
        this.G0 = false;
        this.F0 = false;
        this.Q0 = null;
        this.S0 = null;
        this.T0 = null;
        this.R0 = false;
        this.O0 = null;
        ap0 ap0Var = this.N0;
        if (ap0Var != null) {
            ap0Var.flush();
        }
        this.E0.clear();
    }

    @Override // defpackage.tk0
    public final void p() throws InterruptedException {
        E();
    }

    @Override // defpackage.tk0
    public final void q() throws InterruptedException {
        E();
        this.L0 = Math.min(this.L0, 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r2 >= r6) goto L15;
     */
    @Override // defpackage.tk0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u(defpackage.hf6[] r5, long r6, long r8, defpackage.d99 r10) {
        /*
            r4 = this;
            nf7 r5 = r4.H0
            long r5 = r5.b
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L31
            java.util.ArrayDeque r5 = r4.E0
            boolean r6 = r5.isEmpty()
            if (r6 == 0) goto L26
            long r6 = r4.J0
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 == 0) goto L31
            long r2 = r4.I0
            int r10 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r10 == 0) goto L26
            int r6 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r6 < 0) goto L26
            goto L31
        L26:
            nf7 r6 = new nf7
            long r0 = r4.J0
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L31:
            nf7 r5 = new nf7
            r5.<init>(r0, r8)
            r4.H0 = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.of7.u(hf6[], long, long, d99):void");
    }

    @Override // defpackage.tk0
    public final void w(long j, long j2) throws ExoPlaybackException, InterruptedException {
        if (this.G0) {
            return;
        }
        if (this.M0 == null) {
            xt4 xt4Var = this.c;
            xt4Var.clear();
            ph4 ph4Var = this.D0;
            ph4Var.w();
            int iV = v(xt4Var, ph4Var, 2);
            if (iV != -5) {
                if (iV == -4) {
                    hsi.g(ph4Var.j(4));
                    this.F0 = true;
                    this.G0 = true;
                    return;
                }
                return;
            }
            hf6 hf6Var = (hf6) xt4Var.c;
            hsi.h(hf6Var);
            this.M0 = hf6Var;
            this.V0 = true;
        }
        if (this.N0 == null) {
            D();
        }
        try {
            Trace.beginSection("drainAndFeedDecoder");
            while (B(j)) {
            }
            while (C(j)) {
            }
            Trace.endSection();
        } catch (ImageDecoderException e) {
            throw d(e, null, false, 4003);
        }
    }

    @Override // defpackage.tk0
    public final int z(hf6 hf6Var) {
        this.C0.getClass();
        return zo0.a(hf6Var);
    }
}
