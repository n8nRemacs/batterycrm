package defpackage;

import java.util.Map;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public final class fd8 extends bdf {
    public final /* synthetic */ int X = 0;
    public final /* synthetic */ rac Y;
    public final /* synthetic */ oac Z;
    public final /* synthetic */ Object s0;
    public final /* synthetic */ nac t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd8(hj0 hj0Var, rac racVar, oac oacVar, p7g p7gVar) {
        super(hj0Var, racVar, oacVar, "BackgroundThreadHandoffProducer");
        this.s0 = hj0Var;
        this.Y = racVar;
        this.Z = oacVar;
        this.t0 = p7gVar;
    }

    private final void h(Object obj) {
    }

    @Override // defpackage.bdf
    public final void b(Object obj) {
        switch (this.X) {
            case 0:
                ce5.d((ce5) obj);
                break;
            case 1:
                vc3.P((vc3) obj);
                break;
        }
    }

    @Override // defpackage.bdf
    public Map c(Object obj) {
        switch (this.X) {
            case 1:
                return bh7.a("createdThumbnail", String.valueOf(((vc3) obj) != null));
            default:
                return super.c(obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.bdf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d() throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fd8.d():java.lang.Object");
    }

    @Override // defpackage.bdf
    public void f(Exception exc) {
        switch (this.X) {
            case 1:
                super.f(exc);
                rac racVar = this.Y;
                oac oacVar = this.Z;
                racVar.e(oacVar, "VideoThumbnailProducer", false);
                ((mk0) oacVar).h("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                break;
            default:
                super.f(exc);
                break;
        }
    }

    @Override // defpackage.bdf
    public void g(Object obj) {
        switch (this.X) {
            case 1:
                vc3 vc3Var = (vc3) obj;
                super.g(vc3Var);
                boolean z = vc3Var != null;
                rac racVar = this.Y;
                oac oacVar = this.Z;
                racVar.e(oacVar, "VideoThumbnailProducer", z);
                ((mk0) oacVar).h("local", MediaStreamTrack.VIDEO_TRACK_KIND);
                break;
            case 2:
                rac racVar2 = this.Y;
                oac oacVar2 = this.Z;
                racVar2.a(oacVar2, "BackgroundThreadHandoffProducer", null);
                ((p7g) this.t0).b.a((hj0) this.s0, oacVar2);
                break;
            default:
                super.g(obj);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd8(gd8 gd8Var, hj0 hj0Var, rac racVar, oac oacVar, String str, rf7 rf7Var, rac racVar2, oac oacVar2) {
        super(hj0Var, racVar, oacVar, str);
        this.t0 = gd8Var;
        this.s0 = rf7Var;
        this.Y = racVar2;
        this.Z = oacVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fd8(re8 re8Var, hj0 hj0Var, rac racVar, oac oacVar, rac racVar2, oac oacVar2, rf7 rf7Var) {
        super(hj0Var, racVar, oacVar, "VideoThumbnailProducer");
        this.t0 = re8Var;
        this.Y = racVar2;
        this.Z = oacVar2;
        this.s0 = rf7Var;
    }
}
