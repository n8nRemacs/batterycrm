package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class sdf extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ sdf(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                return new sc4(w5Var.d(88), w5Var.d(46));
            case 1:
                return new b9h(w5Var.d(88), w5Var.d(46), w5Var.d(109));
            case 2:
                return new zjh(w5Var.d(88), w5Var.d(46));
            case 3:
                return new al7(w5Var.d(46), w5Var.d(88));
            case 4:
                return new t9c(w5Var.d(88), w5Var.d(46));
            case 5:
                return new gda((lzf) w5Var.c(8), (tih) w5Var.c(76), (cef) w5Var.c(152), w5Var.d(88), w5Var.d(46), w5Var.d(47), w5Var.d(3));
            case 6:
                return new cef();
            case 7:
                return (cef) w5Var.c(152);
            case 8:
                return new msb(w5Var.d(88), w5Var.d(46), w5Var.d(151), (lzf) w5Var.c(8));
            case 9:
                return new ii0(w5Var.d(46), w5Var.d(88), w5Var.d(151));
            case 10:
                return new yx1(w5Var.d(46), w5Var.d(88), w5Var.d(151));
            case 11:
                return new blh(w5Var.d(88), w5Var.d(46));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new noh(w5Var.d(88), w5Var.d(46));
            case 13:
                return new ci9(w5Var.d(88), w5Var.d(46));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new yz7(w5Var.d(231), w5Var.d(240), w5Var.d(241), w5Var.d(475));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new wf8();
            case 16:
                return new deg();
            case LangUtils.HASH_SEED /* 17 */:
                return new qf0((Context) w5Var.c(12), w5Var.d(596), w5Var.d(8), w5Var.d(122));
            case 18:
                bwf bwfVarD = w5Var.d(88);
                bwf bwfVarD2 = w5Var.d(9);
                bwf bwfVarD3 = w5Var.d(139);
                bwf bwfVarD4 = w5Var.d(35);
                return new tgg(bwfVarD, bwfVarD2, bwfVarD3, new bwf(new j4e(bwfVarD4, 3)), w5Var.d(137), w5Var.d(399));
            case 19:
                return new aug((gwg) w5Var.c(269), (d1g) w5Var.c(284), (g1g) w5Var.c(295), (tgg) w5Var.c(438), (pb3) w5Var.c(46), (hwa) w5Var.c(79), (j0e) ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).g.getValue());
            case 20:
                bwf bwfVar = new bwf(new t4e(w5Var, 25));
                return new ugg((tgg) w5Var.c(438), w5Var, w5Var.d(8), bwfVar, w5Var.d(92), w5Var.d(450), w5Var.d(48), new bwf(new t4e(w5Var, 24)));
            case 21:
                return new ytf(w5Var.d(79), w5Var.d(46), w5Var.d(180), w5Var.d(269), w5Var.d(448), (tgg) w5Var.c(438));
            case 22:
                return new duf(w5Var.d(48), w5Var.d(8), w5Var.d(371), w5Var.d(372), w5Var.d(373), w5Var.d(449), w5Var.d(438));
            case 23:
                return new zy5(w5Var.d(92), (tgg) w5Var.c(438));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new q97(new rd(w5Var.d(92), (tgg) w5Var.c(438)));
            case 25:
                return new ctf(new ieb(w5Var.d(92), w5Var.d(139), (tgg) w5Var.c(438)));
            case 26:
                return new igg(new xw4());
            case 27:
                return new s1e((Context) w5Var.c(12));
            case 28:
                return new szg(w5Var);
            default:
                return new vxf((Context) w5Var.c(12), w5Var.d(80), w5Var.d(46), w5Var.d(81), (ms7) w5Var.c(82), w5Var.d(73), w5Var.d(83), (a84) w5Var.c(84), w5Var.d(85), w5Var.d(48), w5Var.d(47), w5Var.d(86));
        }
    }
}
