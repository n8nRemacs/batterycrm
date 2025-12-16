package defpackage;

import android.app.Application;
import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class em extends ypd {
    public final /* synthetic */ int b;

    public /* synthetic */ em(int i) {
        this.b = i;
    }

    @Override // defpackage.ypd
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                return new ui0((tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case 1:
                return new b5g((Context) w5Var.c(12), (lzf) w5Var.c(8), (Context) w5Var.c(12), (v3b) w5Var.c(500));
            case 2:
                return new e4c((lzf) w5Var.c(8), w5Var.d(522), (l7a) w5Var.c(37), (v40) w5Var.c(36));
            case 3:
                return new f00((lzf) w5Var.c(8), (zz) w5Var.c(390), (Application) w5Var.c(14));
            case 4:
                return new o80(w5Var.d(139), w5Var.d(32), (hrb) w5Var.c(78));
            case 5:
                return new z68(w5Var.d(109), w5Var.d(148), w5Var.d(46));
            case 6:
                return new v7h(w5Var.d(128), w5Var.d(8), w5Var.d(76));
            case 7:
                return new qs6(w5Var.d(HttpStatus.SC_GONE), w5Var.d(12));
            case 8:
                return new t5h(w5Var.d(381), w5Var.d(513), w5Var.d(125), w5Var.d(529), w5Var.d(8), w5Var.d(382));
            case 9:
                return new i6h(w5Var.d(109), w5Var.d(138), w5Var.d(125), w5Var.d(245), w5Var.d(8), w5Var.d(381), w5Var.d(132), w5Var.d(48));
            case 10:
                return new f14(1);
            case 11:
                return new f14(0);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new mk4();
            case 13:
                return new sh0((Application) w5Var.c(14), (tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new f14(2);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new y3e(w5Var.d(156));
            case 16:
                tv1 tv1Var = (tv1) w5Var.c(15);
                x65 x65Var = (x65) w5Var.c(17);
                nnb nnbVar = (nnb) w5Var.c(16);
                f41 f41Var = (f41) w5Var.c(18);
                v21 v21Var = (v21) w5Var.c(19);
                vpc vpcVar = (vpc) w5Var.c(38);
                s41 s41Var = (s41) w5Var.c(22);
                g1e g1eVar = (g1e) w5Var.c(28);
                return new qv1(tv1Var, v21Var, x65Var, nnbVar, f41Var, s41Var, (px1) w5Var.c(27), g1eVar, (u1e) w5Var.c(460), vpcVar, (sv1) w5Var.c(30), (z01) w5Var.c(468), (jd1) w5Var.c(467), w5Var.d(156), (ur3) w5Var.c(139));
            case LangUtils.HASH_SEED /* 17 */:
                return new mr1((Context) w5Var.c(12));
            case 18:
                return new ks1((qv1) w5Var.c(508), w5Var.d(156), w5Var.d(109), w5Var.d(468), w5Var.d(48));
            case 19:
                return new mj1((qsb) w5Var.c(10));
            case 20:
                return new uq9(w5Var.d(138), w5Var.d(215), w5Var.d(8));
            case 21:
                return new vu7(w5Var.d(79), w5Var.d(109), w5Var.d(49), w5Var.d(46));
            case 22:
                return new fd9((tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case 23:
                return new uc9(w5Var.d(123));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new zr6(w5Var.d(47));
            case 25:
                return qa6.c;
            case 26:
                return new xr6(w5Var.d(46), w5Var.d(534));
            case 27:
                t86 t86VarN = ((l5c) ((age) w5Var.c(47))).n();
                String str = t86VarN != null ? (String) t86VarN.b : null;
                return (str == null || str.length() == 0) ? new pd((Context) w5Var.c(12), new bwf(new b31(w5Var, 4))) : new e7i(w5Var.d(92), (lzf) w5Var.c(8), str);
            case 28:
                return new cw6((Context) w5Var.c(12));
            default:
                return new ew6();
        }
    }
}
