package defpackage;

import java.util.Iterator;
import ru.ok.android.externcalls.sdk.video.CameraManager;

/* loaded from: classes.dex */
public final /* synthetic */ class qn1 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ qn1(Object obj, Object obj2, boolean z, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.o = obj3;
        this.b = z;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                qv1 qv1Var = ((wo1) this.c).c;
                ms8 ms8Var = (ms8) this.d;
                ms8 ms8Var2 = (ms8) this.o;
                ms8 ms8Var3 = ms8.b;
                boolean z = ms8Var == ms8Var3;
                boolean z2 = ms8Var2 == ms8Var3;
                ((w21) qv1Var.b).e(z);
                if (z) {
                    ((e9a) qv1Var.s.getValue()).h(Boolean.FALSE);
                }
                qv1Var.g(z2);
                qv1Var.getClass();
                int i = this.b ? 1 : 2;
                CameraManager cameraManagerA = qv1Var.e.a();
                if (cameraManagerA != null) {
                    cameraManagerA.switchCamera(new b32(i));
                }
                break;
            default:
                oh6 oh6Var = (oh6) this.c;
                vgb vgbVar = (vgb) this.d;
                u5g u5gVar = (u5g) this.o;
                Iterator it = oh6Var.b.iterator();
                while (it.hasNext()) {
                    ((dhb) it.next()).d(vgbVar, u5gVar, this.b);
                }
                break;
        }
        return qqg.a;
    }
}
