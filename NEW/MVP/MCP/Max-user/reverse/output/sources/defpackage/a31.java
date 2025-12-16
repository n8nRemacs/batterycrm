package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class a31 extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ a31(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                return new f41(w5Var.d(470));
            case 1:
                return new w21(w5Var.d(470), new bv1(w5Var.d(12), w5Var.d(18), new wpc(w5Var.d(38)), w5Var.d(81), w5Var.d(47), w5Var.d(48)));
            case 2:
                return new gob(w5Var.d(470), w5Var.d(16), w5Var.d(18));
            case 3:
                return new oy4(w5Var.d(20), (sv1) w5Var.c(30), w5Var.d(8));
            case 4:
                return new nw1(w5Var.d(49), w5Var.d(384), (nxg) w5Var.c(122));
            case 5:
                return new c51((sv1) w5Var.c(30), w5Var.d(109), w5Var.d(79), w5Var.d(HttpStatus.SC_GONE), w5Var.d(8), w5Var.d(98), w5Var.d(386), w5Var.d(150));
            case 6:
                return new px1();
            case 7:
                return new sv1(w5Var.d(8), w5Var.d(84));
            case 8:
                return new d2e(w5Var.d(470), w5Var.d(30), w5Var.d(468), w5Var.d(156), (at1) w5Var.c(463), w5Var.d(386), w5Var.d(8));
            case 9:
                return new oqd(w5Var.d(12), w5Var.d(47), w5Var.d(61), w5Var.d(48), w5Var.d(23), w5Var.d(75), w5Var.d(462));
            case 10:
                return new z1f((Context) w5Var.c(12), (lzf) w5Var.c(8), w5Var.d(48));
            case 11:
                return new ix1(w5Var.d(12), w5Var.d(472), w5Var.d(425), w5Var.d(8), w5Var.d(473));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new cx1(w5Var.d(23), w5Var.d(473), w5Var.d(75));
            case 13:
                return new g1e(w5Var.d(470));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new yp5(w5Var.d(30), w5Var.d(8), w5Var.d(153), w5Var.d(HttpStatus.SC_INSUFFICIENT_STORAGE), w5Var.d(15));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new mc1(w5Var.d(12), w5Var.d(25));
            case 16:
                return new s91(w5Var.d(15), w5Var.d(461));
            case LangUtils.HASH_SEED /* 17 */:
                return new o01(w5Var.d(15), w5Var.d(10), w5Var.d(156), w5Var.d(48), w5Var.d(23));
            case 18:
                return new id1(w5Var.d(14), w5Var.d(48));
            case 19:
                e51 e51Var = e51.a;
                tv1 tv1VarB = e51Var.b();
                gm1 gm1Var = gm1.a;
                lq5 lq5Var = (lq5) gm1Var.getAccessor().c(506);
                v21 v21Var = (v21) e51Var.getAccessor().c(19);
                ax1 ax1VarA = e51Var.a();
                k18 k18Var = fm1.a;
                return new ub1(tv1VarB, lq5Var, v21Var, ax1VarA, gm1Var.getAccessor().d(153), gm1Var.getAccessor().d(29), gm1Var.getAccessor().d(16), fm1.e(), w5Var.d(48));
            case 20:
                return new esb((rt5) w5Var.c(48), (pb3) w5Var.c(46), w5Var.d(122));
            case 21:
                return new rk8();
            case 22:
                return new q3b(w5Var.d(9), w5Var.d(143), w5Var.d(47));
            case 23:
                return new rj2(w5Var);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new ij2(w5Var.d(HttpStatus.SC_GONE), w5Var.d(294), w5Var.d(532), w5Var.d(347), w5Var.d(346), w5Var.d(83), w5Var.d(534), (Context) w5Var.c(12), (lzf) w5Var.c(8), new b31(w5Var, 1));
            case 25:
                return (ij2) w5Var.c(569);
            case 26:
                return (ij2) w5Var.c(569);
            case 27:
                return new pc2((Context) w5Var.c(12));
            case 28:
                return new bpg((Context) w5Var.c(12), (h18) w5Var.c(114), (nxg) w5Var.c(122), (pc2) w5Var.c(571), (so3) w5Var.c(488));
            default:
                return new c13(w5Var);
        }
    }
}
