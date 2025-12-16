package androidx.media3.session;

import androidx.media3.session.C23206a1;
import androidx.media3.session.O0;
import com.google.common.util.concurrent.C37568u0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class U0 implements C23206a1.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f52319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C23206a1 f52320c;

    public /* synthetic */ U0(C23206a1 c23206a1, int i12) {
        this.f52319b = i12;
        this.f52320c = c23206a1;
    }

    @Override // androidx.media3.session.C23206a1.g
    public final void b(O0.g gVar) {
        switch (this.f52319b) {
            case 0:
                this.f52320c.f52357b.f52302p.f0();
                break;
            case 1:
                this.f52320c.f52357b.f52302p.k0();
                break;
            case 2:
                this.f52320c.f52357b.f52302p.l0();
                break;
            case 3:
                T0 t02 = this.f52320c.f52357b;
                if (t02.f52302p.q0() != null) {
                    t02.f52290d.getClass();
                    C37568u0.d(new O1(-6));
                    break;
                }
                break;
            case 4:
                this.f52320c.f52357b.f52302p.e0();
                break;
            case 5:
                this.f52320c.f52357b.f52302p.prepare();
                break;
            case 6:
                this.f52320c.f52357b.f52302p.stop();
                break;
            case 7:
                this.f52320c.f52357b.f52302p.i0();
                break;
            case 8:
                this.f52320c.f52357b.f52302p.j0();
                break;
            case 9:
                T0 t03 = this.f52320c.f52357b;
                if (t03.h()) {
                    G1 g12 = t03.f52302p;
                    if (g12.a0() != 0) {
                        androidx.media3.common.util.M.z(g12);
                        break;
                    } else {
                        t03.j(g12);
                        break;
                    }
                }
                break;
            case 10:
                G1 g13 = this.f52320c.f52357b.f52302p;
                if (g13 != null && g13.getPlayWhenReady() && g13.getPlaybackState() != 1 && g13.getPlaybackState() != 4) {
                    if (g13.u(1)) {
                        g13.pause();
                        break;
                    }
                } else {
                    androidx.media3.common.util.M.z(g13);
                    break;
                }
                break;
            default:
                G1 g14 = this.f52320c.f52357b.f52302p;
                if (g14 != null && g14.u(1)) {
                    g14.pause();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ U0(C23206a1 c23206a1, androidx.media3.common.J j12) {
        this.f52319b = 3;
        this.f52320c = c23206a1;
    }
}
