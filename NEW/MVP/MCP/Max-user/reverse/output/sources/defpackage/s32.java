package defpackage;

import android.graphics.Rect;
import android.net.Uri;
import android.view.Surface;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.ok.tamtam.android.widgets.quickcamera.CameraExceptionImpl;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;

/* loaded from: classes2.dex */
public final /* synthetic */ class s32 implements ju3 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s32(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.ju3
    public final void accept(Object obj) {
        Object krcVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                CameraxCameraApiView cameraxCameraApiView = (CameraxCameraApiView) obj2;
                ach achVar = (ach) obj;
                int i2 = CameraxCameraApiView.u0;
                if (achVar instanceof vbh) {
                    vbh vbhVar = (vbh) achVar;
                    if (vbhVar.c != 0) {
                        wqi.c(CameraxCameraApiView.class.getName(), "onCameraError", new Object[0]);
                        q22 q22Var = cameraxCameraApiView.s0;
                        if (q22Var != null) {
                            ((s6b) q22Var).c(new CameraExceptionImpl(vbhVar.d));
                            break;
                        }
                    } else {
                        wqi.c(CameraxCameraApiView.class.getName(), "onVideoTaken", new Object[0]);
                        q22 q22Var2 = cameraxCameraApiView.s0;
                        if (q22Var2 != null) {
                            File file = vbhVar.a.b.c;
                            ytc ytcVar = (ytc) ((s6b) q22Var2).a;
                            if (ytcVar.getCanRecordingVideo()) {
                                buc bucVar = ytcVar.d;
                                if (bucVar == null) {
                                    bucVar = null;
                                }
                                xfh.o(bucVar, ((q2b) bucVar.Z).b(), new auc(bucVar, file, null), 2);
                                break;
                            }
                        }
                    }
                }
                break;
            case 1:
                kw6 kw6Var = (kw6) obj2;
                m1a m1aVar = (m1a) obj;
                ni0 ni0Var = (ni0) ((bwf) kw6Var.c).getValue();
                HashMap map = m1aVar.a;
                s5j.a("The detector does not exist", map.containsKey(ni0Var) || m1aVar.b.containsKey(ni0Var));
                List<mi0> list = (List) map.get(ni0Var);
                if (list != null) {
                    tcf tcfVar = (tcf) kw6Var.d;
                    if (list.isEmpty()) {
                        krcVar = jrc.a;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        for (mi0 mi0Var : list) {
                            String strH = mi0Var.a.h();
                            Rect rect = mi0Var.b;
                            yqc yqcVar = (strH == null || rect == null) ? null : new yqc(strH, rect);
                            if (yqcVar != null) {
                                arrayList.add(yqcVar);
                            }
                        }
                        krcVar = new krc(arrayList, false);
                    }
                    tcfVar.m(null, krcVar);
                    break;
                }
                break;
            case 2:
                f2h f2hVar = (f2h) obj2;
                hbh hbhVar = (hbh) obj;
                hbhVar.e = ((ml0) f2hVar).a;
                hbhVar.h = f2hVar;
                break;
            case 3:
                ((bhd) obj2).I = (Uri) obj;
                break;
            case 4:
                vb0 vb0Var = (vb0) obj;
                for (Map.Entry entry : ((Map) obj2).entrySet()) {
                    int i3 = vb0Var.b - ((ua0) entry.getKey()).f;
                    if (((ua0) entry.getKey()).g) {
                        i3 = -i3;
                    }
                    int iH = bhg.h(i3);
                    dsf dsfVar = (dsf) entry.getValue();
                    dsfVar.getClass();
                    jei.d(new vu0(dsfVar, iH, -1, 5));
                }
                break;
            case 5:
                nl nlVar = (nl) obj2;
                gri.a("SurfaceViewImpl", "Safe to release surface.");
                if (nlVar != null) {
                    nlVar.k();
                    break;
                }
                break;
            case 6:
                ((tu1) obj2).b((ub0) obj);
                break;
            default:
                tz4 tz4Var = (tz4) obj2;
                ub0 ub0Var = (ub0) obj;
                gri.a("VideoEncoderSession", "Surface can be closed: " + ub0Var.b.hashCode());
                Surface surface = ub0Var.b;
                if (surface == ((Surface) tz4Var.g)) {
                    tz4Var.g = null;
                    ((tu1) tz4Var.n).b((bf5) tz4Var.f);
                    tz4Var.e();
                    break;
                } else {
                    surface.release();
                    break;
                }
        }
    }
}
