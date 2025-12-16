package defpackage;

import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class qzg implements io7 {
    public final /* synthetic */ int a;

    public /* synthetic */ qzg(int i) {
        this.a = i;
    }

    @Override // defpackage.io7
    public final Object a(w5 w5Var) {
        switch (this.a) {
            case 0:
                return (ui8) w5Var.c(74);
            case 1:
                return new pxh((ew7) w5Var.c(587), w5Var.d(589));
            case 2:
                return new yrh((ew7) w5Var.c(587), w5Var.d(589));
            case 3:
                return new jph((ew7) w5Var.c(587), w5Var.d(589));
            case 4:
                return new efe("Включить кэширование WebView", PmsKey.f159webviewcacheenabled, false);
            case 5:
                return new bfc(w5Var.d(46), 1);
            case 6:
                bwf bwfVarD = w5Var.d(46);
                return new ed8(new r5g("Полноэкранный режим веб-аппов"), new tv(0, 10, pb3.class, (pb3) bwfVarD.getValue(), "isWebAppFullscreen", "isWebAppFullscreen()Z"), new d31(bwfVarD, 1), yud.P1, 16);
            case 7:
                return new ith((ew7) w5Var.c(587), w5Var.d(158), w5Var.d(589));
            case 8:
                return new pzh((ew7) w5Var.c(587), w5Var.d(158), w5Var.d(589));
            case 9:
                return new hsh((ew7) w5Var.c(587), w5Var.d(158), w5Var.d(589));
            case 10:
                return new azh((ew7) w5Var.c(587), w5Var.d(158), w5Var.d(589));
            case 11:
                ew7 ew7Var = (ew7) w5Var.c(587);
                bwf bwfVarD2 = w5Var.d(158);
                bwf bwfVarD3 = w5Var.d(589);
                w5Var.getClass();
                return new eqh(ew7Var, bwfVarD2, bwfVarD3);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new uoh((ew7) w5Var.c(587), w5Var.d(158), w5Var.d(589));
            case 13:
                ew7 ew7Var2 = (ew7) w5Var.c(587);
                bwf bwfVarD4 = w5Var.d(158);
                bwf bwfVarD5 = w5Var.d(589);
                bwf bwfVarD6 = w5Var.d(77);
                w5Var.getClass();
                return new aoh(ew7Var2, bwfVarD4, bwfVarD5, bwfVarD6);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new rzh(moi.a((ew7) w5Var.c(587), q8.s0), w5Var.d(158));
            default:
                return v0i.a;
        }
    }
}
