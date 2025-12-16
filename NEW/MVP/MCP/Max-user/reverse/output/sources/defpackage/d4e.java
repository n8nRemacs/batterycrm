package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class d4e extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ d4e(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                return (xia) w5Var.c(HttpStatus.SC_TEMPORARY_REDIRECT);
            case 1:
                return new aja(w5Var.d(198), w5Var.d(281), w5Var.d(46), w5Var.d(48), w5Var.d(HttpStatus.SC_TEMPORARY_REDIRECT));
            case 2:
                return (oje) w5Var.c(178);
            case 3:
                return new zd0();
            case 4:
                return new mg4(w5Var.d(428), w5Var.d(61), (nxg) w5Var.c(122));
            case 5:
                return new rr0(w5Var.d(137), w5Var.d(8));
            case 6:
                return new f35(((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a(), v7j.a(new q4e(w5Var, 17)), v7j.a(new q4e(w5Var, 18)), v7j.a(new q4e(w5Var, 19)));
            case 7:
                u6b u6bVar = (u6b) w5Var.c(399);
                w2h w2hVar = (w2h) w5Var.c(272);
                qx5 qx5Var = (qx5) w5Var.c(137);
                dd ddVar = (dd) w5Var.c(88);
                o0e o0eVar = (o0e) w5Var.c(429);
                m0g m0gVar = (m0g) w5Var.c(HttpStatus.SC_FORBIDDEN);
                m0gVar.getClass();
                return new u2h(u6bVar, w2hVar, qx5Var, ddVar, o0eVar, ((n0g) m0gVar).a(), (n0e) w5Var.c(430));
            case 8:
                return new quf((u6b) w5Var.c(399), (suf) w5Var.c(273), (qx5) w5Var.c(137), (dd) w5Var.c(88), (g4b) w5Var.c(56), (a84) w5Var.c(84));
            case 9:
                return new zy((hwa) w5Var.c(79), (ve2) w5Var.c(97), (z7c) w5Var.c(32));
            case 10:
                return new o7e(w5Var.d(HttpStatus.SC_GONE));
            case 11:
                return new kub((Context) w5Var.c(12), w5Var.d(189), w5Var.d(431), w5Var.d(31), (tw0) w5Var.c(49), (lzf) w5Var.c(8), (a84) w5Var.c(84), (yi5) w5Var.c(9));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return (kub) w5Var.c(317);
            case 13:
                return new lr3(w5Var.d(32), w5Var.d(35), w5Var.d(139), w5Var.d(180));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new ix4(w5Var.d(97));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new q05(v7j.a(new q4e(w5Var, 23)), v7j.a(new q4e(w5Var, 24)), v7j.a(new q4e(w5Var, 25)), v7j.a(new q4e(w5Var, 20)), v7j.a(new q4e(w5Var, 21)), v7j.a(new q4e(w5Var, 22)), v7j.a(new b31(w5Var, 17)));
            case 16:
                return new tqc(w5Var.d(181), w5Var.d(35), w5Var.d(32), w5Var.d(311), w5Var.d(171), w5Var.d(88), w5Var.d(79), w5Var.d(334), w5Var.d(323), w5Var.d(290), w5Var.d(31), w5Var.d(337));
            case LangUtils.HASH_SEED /* 17 */:
                return ((OneMeRoomDatabase) w5Var.c(195)).H();
            case 18:
                return new qpa(w5Var.d(335), w5Var.d(338), w5Var.d(339), (lzf) w5Var.c(8));
            case 19:
                return new qv5((iu5) w5Var.c(432), (qm4) w5Var.c(325), (ve2) w5Var.c(97), (qi9) w5Var.c(143), (gwg) w5Var.c(269), (bn9) w5Var.c(270), (u2h) w5Var.c(314), (quf) w5Var.c(315), (sv5) w5Var.c(326), (rv5) w5Var.c(433), (pv5) w5Var.c(434));
            case 20:
                return new qm4();
            case 21:
                return new sv5((qx5) w5Var.c(137));
            case 22:
                return new mce(((OneMeRoomDatabase) ((q9b) w5Var.c(193)).l()).P(), (ls7) w5Var.c(435), (kl4) w5Var.c(436));
            case 23:
                return new v04((z7c) w5Var.c(32), (f8c) w5Var.c(HttpStatus.SC_PARTIAL_CONTENT), (qv3) w5Var.c(98), (ve2) w5Var.c(97), (lv4) w5Var.c(35), (oje) w5Var.c(180), ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a());
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                bwf bwfVar = new bwf(new b31(w5Var, 18));
                l5c l5cVar = (l5c) ((age) w5Var.c(47));
                l5cVar.getClass();
                return new w0g(l5cVar.j(PmsKey.f107netnewclientenabled, false) ? new j35(w5Var.d(175), w5Var.d(179), w5Var.d(289), bwfVar, w5Var.d(187), w5Var.d(HttpStatus.SC_NOT_FOUND), w5Var.d(HttpStatus.SC_METHOD_NOT_ALLOWED), w5Var.d(5), (vya) w5Var.c(HttpStatus.SC_NOT_ACCEPTABLE), 5) : new j35(w5Var.d(174), w5Var.d(179), w5Var.d(289), bwfVar, w5Var.d(187), w5Var.d(HttpStatus.SC_NOT_FOUND), w5Var.d(HttpStatus.SC_METHOD_NOT_ALLOWED), w5Var.d(5), (vya) w5Var.c(HttpStatus.SC_NOT_ACCEPTABLE), 4), w5Var.d(32), w5Var.d(31), w5Var.d(35), w5Var.d(181), (oje) w5Var.c(180), (di8) w5Var.c(6));
            case 25:
                return new nu3(w5Var.d(98), w5Var.d(109));
            case 26:
                return new su3(w5Var.d(98), w5Var.d(97), w5Var.d(89), w5Var.d(79), w5Var.d(49));
            case 27:
                bwf bwfVarD = w5Var.d(98);
                bwf bwfVarD2 = w5Var.d(89);
                w5Var.getClass();
                return new n04(bwfVarD, bwfVarD2, w5Var.d(HttpStatus.SC_MULTI_STATUS), w5Var.d(79), w5Var.d(49));
            case 28:
                return new w04(w5Var.d(98), w5Var.d(89), w5Var.d(79), w5Var.d(49));
            default:
                return new ou3(w5Var.d(98), w5Var.d(89), w5Var.d(79), w5Var.d(49));
        }
    }
}
