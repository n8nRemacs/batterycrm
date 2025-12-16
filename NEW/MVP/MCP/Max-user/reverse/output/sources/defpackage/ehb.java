package defpackage;

import kotlin.NoWhenBranchMatchedException;
import one.video.player.error.OneVideoPlaybackException;

/* loaded from: classes2.dex */
public final class ehb implements jd5 {
    public final /* synthetic */ hhb a;

    public ehb(hhb hhbVar) {
        this.a = hhbVar;
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void b(ghb ghbVar) {
        this.a.X.e();
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void g(ghb ghbVar, float f) {
        this.a.X.f(f);
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void q(ghb ghbVar, chb chbVar, c32 c32Var, c32 c32Var2) {
        if (chbVar == chb.b) {
            this.a.X.i();
        }
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void r(ghb ghbVar) {
        this.a.X.c();
    }

    @Override // defpackage.jd5, defpackage.dhb
    public final void s(rl0 rl0Var, int i, int i2) {
        hhb hhbVar = this.a;
        bm3 bm3Var = hhbVar.X;
        switch (az1.v(i2)) {
            case 0:
                bm3Var.g();
                return;
            case 1:
                bm3Var.w();
                return;
            case 2:
                bm3Var.r();
                hhbVar.t0.r(3, hhbVar.Z);
                return;
            case 3:
                bm3Var.o();
                return;
            case 4:
                bm3Var.d();
                return;
            case 5:
                OneVideoPlaybackException oneVideoPlaybackException = rl0Var.w;
                if (oneVideoPlaybackException != null) {
                    ((y3b) hhbVar.a).a(new IllegalStateException("Playback failed", oneVideoPlaybackException));
                }
                bm3Var.z(oneVideoPlaybackException);
                return;
            case 6:
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
