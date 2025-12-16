package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import androidx.camera.video.internal.encoder.EncodeException;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class l32 implements ju3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l32(Object obj, int i, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ju3
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Surface surface = (Surface) this.b;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.c;
                surface.release();
                surfaceTexture.release();
                break;
            case 1:
                yp4 yp4Var = (yp4) this.b;
                fsf fsfVar = (fsf) this.c;
                fsfVar.close();
                Surface surface2 = (Surface) yp4Var.Z.remove(fsfVar);
                if (surface2 != null) {
                    tz4 tz4Var = yp4Var.a;
                    ho6.d((AtomicBoolean) tz4Var.c, true);
                    ho6.c((Thread) tz4Var.e);
                    tz4Var.s(surface2, true);
                    break;
                }
                break;
            case 2:
                i65 i65Var = (i65) this.b;
                fsf fsfVar2 = (fsf) this.c;
                fsfVar2.close();
                Surface surface3 = (Surface) i65Var.Z.remove(fsfVar2);
                if (surface3 != null) {
                    g65 g65Var = i65Var.a;
                    ho6.d((AtomicBoolean) g65Var.c, true);
                    ho6.c((Thread) g65Var.e);
                    g65Var.s(surface3, true);
                    break;
                }
                break;
            case 3:
                laa laaVar = (laa) this.b;
                jf8 jf8Var = (jf8) obj;
                jf8Var.c = ((Boolean) this.c).booleanValue();
                laaVar.X.getClass();
                wqi.e("of8", "background permissions is not supported yet", null);
                jf8Var.d = false;
                break;
            case 4:
                bhd bhdVar = (bhd) this.b;
                tu1 tu1Var = (tu1) this.c;
                Throwable th = (Throwable) obj;
                if (bhdVar.V == null) {
                    if (th instanceof EncodeException) {
                        bhdVar.A(5);
                    } else {
                        bhdVar.A(6);
                    }
                    bhdVar.V = th;
                    bhdVar.K();
                    tu1Var.b(null);
                    break;
                }
                break;
            default:
                q8h q8hVar = (q8h) this.b;
                k7h k7hVar = (k7h) this.c;
                ach achVar = (ach) obj;
                if (!(achVar instanceof ybh)) {
                    if (achVar instanceof vbh) {
                        svi.e(q8hVar.i, ((q2b) q8hVar.q()).b(), null, new p8h(achVar, q8hVar, k7hVar, null), 2);
                        break;
                    }
                } else {
                    String str = q8hVar.h;
                    l6b l6bVar = wqi.a;
                    if (l6bVar != null) {
                        lg8 lg8Var = lg8.d;
                        if (l6bVar.b(lg8Var)) {
                            l6bVar.c(lg8Var, str, "VideoMessage Recording. VideoRecordEvent.Start recording start", null);
                        }
                    }
                    if (q8hVar.r != null) {
                        q8hVar.J.O(q8hVar, q8h.M[0], svi.e(q8hVar.i, null, i84.b, new m8h(q8hVar, null), 1));
                    }
                    q8hVar.v.m(null, f5h.a);
                    break;
                }
                break;
        }
    }
}
