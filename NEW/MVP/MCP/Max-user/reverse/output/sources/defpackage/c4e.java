package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class c4e extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ c4e(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                return ((ie4) w5Var.c(189)).t;
            case 1:
                return ((ie4) w5Var.c(189)).u;
            case 2:
                return new gk(w5Var.d(61), w5Var.d(210), w5Var.d(109), w5Var.d(HttpStatus.SC_PRECONDITION_FAILED), w5Var.d(385), w5Var.d(281), (lv4) w5Var.c(35), (lzf) w5Var.c(8), (a84) w5Var.c(84));
            case 3:
                return new kq7(w5Var.d(97), w5Var.d(98), w5Var.d(210), w5Var.d(398));
            case 4:
                return new d1g(w5Var.d(180));
            case 5:
                hwa hwaVar = (hwa) w5Var.c(79);
                d1g d1gVar = (d1g) w5Var.c(284);
                j0e j0eVarA = ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a();
                m0g m0gVar = (m0g) w5Var.c(HttpStatus.SC_FORBIDDEN);
                m0gVar.getClass();
                j0e j0eVarA2 = ((n0g) m0gVar).a();
                tw0 tw0Var = (tw0) w5Var.c(49);
                return new js5(hwaVar, d1gVar, j0eVarA, j0eVarA2, tw0Var, (a3g) w5Var.c(170));
            case 6:
                hwa hwaVar2 = (hwa) w5Var.c(79);
                d1g d1gVar2 = (d1g) w5Var.c(284);
                j0e j0eVarA3 = ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a();
                m0g m0gVar2 = (m0g) w5Var.c(HttpStatus.SC_FORBIDDEN);
                m0gVar2.getClass();
                j0e j0eVarA4 = ((n0g) m0gVar2).a();
                tw0 tw0Var2 = (tw0) w5Var.c(49);
                return new gs5(hwaVar2, d1gVar2, j0eVarA3, j0eVarA4, tw0Var2, (a3g) w5Var.c(170));
            case 7:
                return new x0g((pb3) w5Var.c(46), (age) w5Var.c(47));
            case 8:
                return new ck2((z7c) w5Var.c(32), (ur3) w5Var.c(139), (pj9) w5Var.c(215));
            case 9:
                bwf bwfVarD = w5Var.d(32);
                w5Var.getClass();
                w5Var.getClass();
                w5Var.getClass();
                return new qja(bwfVarD, w5Var.d(293), w5Var.d(147), w5Var.d(98), w5Var.d(294), w5Var.d(283), w5Var.d(230), w5Var.d(9), w5Var.d(31), w5Var.d(HttpStatus.SC_MULTI_STATUS), w5Var.d(15));
            case 10:
                return new oje(w5Var.d(139), w5Var.d(35), (yi5) w5Var.c(9), (di8) w5Var.c(6));
            case 11:
                return new loa(w5Var.d(322), w5Var.d(109), w5Var.d(46), w5Var.d(398), w5Var.d(323), (lzf) w5Var.c(8), (a84) w5Var.c(84));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new eka((tw0) w5Var.c(49), v7j.a(new p4e(w5Var, 12)), v7j.a(new p4e(w5Var, 13)), v7j.a(new p4e(w5Var, 14)));
            case 13:
                Context context = (Context) w5Var.c(12);
                q7b q7bVar = (q7b) w5Var.c(HttpStatus.SC_FAILED_DEPENDENCY);
                lk4 lk4Var = (lk4) w5Var.c(425);
                e3b e3bVar = (e3b) w5Var.c(426);
                z7c z7cVar = (z7c) w5Var.c(32);
                v7j.a(new p4e(w5Var, 15));
                return new yka(context, q7bVar, lk4Var, e3bVar, z7cVar);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new tfe(w5Var.d(296), w5Var.d(297), w5Var.d(298), w5Var.d(299), w5Var.d(HttpStatus.SC_MULTIPLE_CHOICES), w5Var.d(244), w5Var.d(HttpStatus.SC_MOVED_PERMANENTLY), w5Var.d(291), w5Var.d(HttpStatus.SC_MOVED_TEMPORARILY), w5Var.d(HttpStatus.SC_SEE_OTHER), w5Var.d(HttpStatus.SC_NOT_MODIFIED), w5Var.d(HttpStatus.SC_USE_PROXY), w5Var.d(306), w5Var.d(396), w5Var.d(309), w5Var.d(149), w5Var.d(122));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new ij7(w5Var.d(12), w5Var.d(32), w5Var.d(9), w5Var.d(HttpStatus.SC_GONE), new bwf(new b31(w5Var, 16)), w5Var.d(150), w5Var.d(97), w5Var.d(98), w5Var.d(88));
            case 16:
                return new g1g(w5Var.d(427));
            case LangUtils.HASH_SEED /* 17 */:
                return new kja((yi5) w5Var.c(9), v7j.a(new p4e(w5Var, 16)), v7j.a(new p4e(w5Var, 17)));
            case 18:
                return new tja(w5Var.d(186), (z7c) w5Var.c(32), (tw0) w5Var.c(49), w5Var.d(97), w5Var.d(398));
            case 19:
                return new wja(v7j.a(new p4e(w5Var, 28)), v7j.a(new p4e(w5Var, 29)), (z7c) w5Var.c(32), (tw0) w5Var.c(49), v7j.a(new q4e(w5Var, 0)), v7j.a(new p4e(w5Var, 18)), v7j.a(new p4e(w5Var, 19)), v7j.a(new p4e(w5Var, 20)), v7j.a(new p4e(w5Var, 21)), v7j.a(new p4e(w5Var, 22)), v7j.a(new p4e(w5Var, 23)), v7j.a(new p4e(w5Var, 24)), v7j.a(new p4e(w5Var, 25)), v7j.a(new p4e(w5Var, 26)), v7j.a(new p4e(w5Var, 27)));
            case 20:
                z7c z7cVar2 = (z7c) w5Var.c(32);
                tw0 tw0Var3 = (tw0) w5Var.c(49);
                bwf bwfVarD2 = w5Var.d(97);
                w5Var.getClass();
                bwf bwfVarD3 = w5Var.d(391);
                w5Var.getClass();
                return new hja(z7cVar2, tw0Var3, bwfVarD2, bwfVarD3);
            case 21:
                return (oje) w5Var.c(178);
            case 22:
                return new fja(v7j.a(new q4e(w5Var, 2)), v7j.a(new q4e(w5Var, 3)), (tw0) w5Var.c(49), v7j.a(new q4e(w5Var, 4)), v7j.a(new q4e(w5Var, 1)));
            case 23:
                return new gka(v7j.a(new q4e(w5Var, 5)), v7j.a(new q4e(w5Var, 6)));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new dja((tw0) w5Var.c(49), v7j.a(new q4e(w5Var, 7)));
            case 25:
                v7j.a(new q4e(w5Var, 11));
                return new tia(v7j.a(new q4e(w5Var, 12)), v7j.a(new q4e(w5Var, 13)), v7j.a(new q4e(w5Var, 8)), v7j.a(new q4e(w5Var, 9)), v7j.a(new q4e(w5Var, 10)));
            case 26:
                return new nja(v7j.a(new q4e(w5Var, 14)), v7j.a(new q4e(w5Var, 15)), v7j.a(new q4e(w5Var, 16)));
            case 27:
                return new ika(w5Var.d(251), w5Var.d(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED));
            case 28:
                return new cka(w5Var.d(109), w5Var.d(298), w5Var.d(291), w5Var.d(98), w5Var.d(321), w5Var.d(387), (lzf) w5Var.c(8), (a84) w5Var.c(84));
            default:
                return new xia();
        }
    }
}
