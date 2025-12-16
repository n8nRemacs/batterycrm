package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class bf8 extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ bf8(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        int i = 1;
        switch (this.b) {
            case 0:
                Context context = (Context) w5Var.c(12);
                return new of8(w5Var.d(104), w5Var.d(105), context);
            case 1:
                return new nt6(w5Var.d(HttpStatus.SC_EXPECTATION_FAILED));
            case 2:
                return xl8.b;
            case 3:
                return new h03((tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case 4:
                return new is0((ch2) w5Var.c(223), (pb3) w5Var.c(46), (h03) w5Var.c(611), (lzf) w5Var.c(8));
            case 5:
                return new y9f(((Context) w5Var.c(12)).getApplicationContext(), "exoplayer_internal.db", null, 1);
            case 6:
                return new o3b((Context) w5Var.c(12), w5Var.d(52), w5Var.d(57), w5Var.d(53));
            case 7:
                return new kr9(w5Var);
            case 8:
                return new gya(w5Var);
            case 9:
                Context context2 = (Context) w5Var.c(12);
                z7c z7cVar = (z7c) w5Var.c(32);
                qb5 qb5Var = (qb5) w5Var.c(483);
                y6i y6iVar = new y6i(27, w5Var.d(83));
                gya gyaVar = (gya) w5Var.c(658);
                yi5 yi5Var = (yi5) w5Var.c(9);
                bwf bwfVarD = w5Var.d(98);
                w5Var.getClass();
                return new f7b(context2, z7cVar, qb5Var, y6iVar, gyaVar, yi5Var, bwfVarD, (l6g) w5Var.c(347), (e7b) w5Var.c(HttpStatus.SC_METHOD_FAILURE), w5Var.d(282));
            case 10:
                return new e7b((Context) w5Var.c(12), w5Var.d(281), w5Var.d(8), w5Var.d(480), w5Var.d(123), w5Var.d(47), w5Var.d(48), w5Var.d(500));
            case 11:
                return new g5b((Context) w5Var.c(12));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new y7b(w5Var.d(472), w5Var.d(HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE), w5Var.d(679), w5Var.d(311));
            case 13:
                return new iz5((Context) w5Var.c(12));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new u6b((Context) w5Var.c(12), (yi5) w5Var.c(9), (iz5) w5Var.c(111), (age) w5Var.c(47), (iya) w5Var.c(431), (d1e) w5Var.c(443), (lzf) w5Var.c(8), w5Var.d(48));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return (u6b) w5Var.c(659);
            case 16:
                return (u6b) w5Var.c(659);
            case LangUtils.HASH_SEED /* 17 */:
                return (u6b) w5Var.c(659);
            case 18:
                return new fya(w5Var);
            case 19:
                return new iya(w5Var);
            case 20:
                iu5.a.getClass();
                return v17.x0;
            case 21:
                return new pv5();
            case 22:
                sua suaVar = (sua) w5Var.c(92);
                lv4 lv4Var = (lv4) w5Var.c(35);
                age ageVar = (age) w5Var.c(47);
                rua ruaVarA = suaVar.a();
                ruaVarA.c.clear();
                l5c l5cVar = (l5c) ageVar;
                l5cVar.getClass();
                if (sg4.a((int) l5cVar.m(PmsKey.f37debugmode, 0)) != sg4.DISABLED) {
                    ruaVarA.d.add(new mt0(i, "m8d"));
                } else {
                    lv4Var.e();
                }
                return new m8d(new sua(ruaVarA));
            case 23:
                return new r97(new rd(new bwf(new b31(w5Var, 10)), (tgg) w5Var.c(438)));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new y0g(new bwf(new b31(w5Var, 11)));
            case 25:
                return new ozf(w5Var.d(284), w5Var.d(663), w5Var.d(32), w5Var.d(137), w5Var.d(HttpStatus.SC_FORBIDDEN), w5Var.d(9), w5Var.d(139));
            case 26:
                ((vw6) ((alf) w5Var.c(80))).a();
                bwf bwfVarD2 = w5Var.d(664);
                bwf bwfVarD3 = w5Var.d(625);
                w5Var.getClass();
                return new vb5(bwfVarD2, bwfVarD3);
            case 27:
                return new tb5(w5Var.d(480), w5Var.d(489));
            case 28:
                return new ac5((nv4) w5Var.c(86));
            default:
                return new jya(w5Var);
        }
    }
}
