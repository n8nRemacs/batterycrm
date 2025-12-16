package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class i4e extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ i4e(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                kgf kgfVar = (kgf) w5Var.c(276);
                tef tefVar = (tef) w5Var.c(233);
                hwa hwaVar = (hwa) w5Var.c(79);
                j0e j0eVarA = ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a();
                m0g m0gVar = (m0g) w5Var.c(HttpStatus.SC_FORBIDDEN);
                m0gVar.getClass();
                return new igf(kgfVar, tefVar, hwaVar, j0eVarA, ((n0g) m0gVar).a(), (d1g) w5Var.c(284));
            case 1:
                return new ps5(v7j.a(new p4e(w5Var, 3)), v7j.a(new p4e(w5Var, 4)), v7j.a(new b31(w5Var, 27)), v7j.a(new b31(w5Var, 28)), v7j.a(new p4e(w5Var, 5)), v7j.a(new p4e(w5Var, 1)), v7j.a(new p4e(w5Var, 2)));
            case 2:
                return new vr5(w5Var.d(277), w5Var.d(239), w5Var.d(286), new bwf(new b31(w5Var, 29)), new bwf(new p4e(w5Var, 0)), w5Var.d(287));
            case 3:
                return new uda((lv4) w5Var.c(35), (z7c) w5Var.c(32), (ur3) w5Var.c(139), (j98) w5Var.c(142));
            case 4:
                return new vu((tef) w5Var.c(231), (z7c) w5Var.c(32), (ve2) w5Var.c(97), (hwa) w5Var.c(79), (vr5) w5Var.c(241), (ps5) w5Var.c(240), (m4e) w5Var.c(190), (wj) w5Var.c(281));
            case 5:
                return new va4(w5Var.d(46), w5Var.d(47), w5Var.d(HttpStatus.SC_METHOD_FAILURE), (OneMeRoomDatabase) ((q9b) w5Var.c(193)).l(), w5Var.d(9), (b1b) w5Var.c(HttpStatus.SC_UNPROCESSABLE_ENTITY), (g5b) w5Var.c(421), (nxg) w5Var.c(122));
            case 6:
                return new u5a(w5Var.d(143), w5Var.d(189), w5Var.d(190), w5Var.d(210), w5Var.d(97), w5Var.d(35), w5Var.d(49), w5Var.d(79), w5Var.d(245), w5Var.d(252), w5Var.d(48), w5Var.d(46));
            case 7:
                return new d20(v7j.a(new p4e(w5Var, 6)), (tw0) w5Var.c(49), v7j.a(new p4e(w5Var, 7)));
            case 8:
                return new dv5(w5Var.d(169));
            case 9:
                return new mxd((qi9) w5Var.c(143), (c7c) w5Var.c(210), (ve2) w5Var.c(97), (tw0) w5Var.c(49), (z7c) w5Var.c(32), (yy) w5Var.c(250));
            case 10:
                return new w85((qi9) w5Var.c(143), (ve2) w5Var.c(97), (c7c) w5Var.c(210), (tw0) w5Var.c(49), (pb3) w5Var.c(46));
            case 11:
                return new eaf(v7j.a(new p4e(w5Var, 9)), v7j.a(new p4e(w5Var, 10)), v7j.a(new p4e(w5Var, 11)), v7j.a(new p4e(w5Var, 8)));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((zzf) w5Var.c(249)).e();
            case 13:
                bwf bwfVarD = w5Var.d(172);
                return new zzf((lv4) w5Var.c(35), (yi5) w5Var.c(9), (age) w5Var.c(47), new bwf(new b31(w5Var, 15)), new bwf(new j4e(bwfVarD, 0)), new bwf(new j4e(bwfVarD, 1)), new bwf(new j4e(bwfVarD, 2)));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                qs3 qs3Var = new qs3(w5Var.d(139), (age) w5Var.c(47));
                l5c l5cVar = (l5c) ((age) w5Var.c(47));
                l5cVar.getClass();
                if (!l5cVar.j(PmsKey.f107netnewclientenabled, false)) {
                    j98 j98Var = (j98) w5Var.c(142);
                    cz4 cz4Var = l5cVar.j(PmsKey.f106netclientdnsenabled, false) ? (cz4) w5Var.c(177) : null;
                    uda udaVar = (uda) w5Var.c(173);
                    j98Var.getClass();
                    return new nk4(udaVar, (c9f) w5Var.c(172), cz4Var, qs3Var, ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a());
                }
                w7c w7cVar = new w7c();
                w1g w1gVar = (w1g) w5Var.c(187);
                v1g v1gVar = w1gVar instanceof v1g ? (v1g) w1gVar : null;
                if (v1gVar == null) {
                    v1gVar = new v1g(w1gVar);
                }
                w7cVar.a = v1gVar;
                return new wq5((uda) w5Var.c(173), (c9f) w5Var.c(172), qs3Var, (cz4) w5Var.c(177), w7cVar);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new yy(w5Var.d(288), w5Var.d(143), w5Var.d(399), w5Var.d(49), w5Var.d(245));
            case 16:
                return new em9(w5Var.d(49), w5Var.d(109), w5Var.d(138), w5Var.d(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED), w5Var.d(46));
            case LangUtils.HASH_SEED /* 17 */:
                return new abd(w5Var.d(79), w5Var.d(32), w5Var.d(97), w5Var.d(HttpStatus.SC_FORBIDDEN), w5Var.d(183), w5Var.d(143), w5Var.d(398), w5Var.d(290));
            case 18:
                return new ma3(w5Var.d(97), w5Var.d(398));
            case 19:
                bwf bwfVarD2 = w5Var.d(97);
                bwf bwfVarD3 = w5Var.d(252);
                bwf bwfVarD4 = w5Var.d(398);
                bwf bwfVarD5 = w5Var.d(291);
                return new ald(bwfVarD2, bwfVarD3, bwfVarD4, bwfVarD5, w5Var.d(122));
            case 20:
                return new vb2(w5Var.d(109), w5Var.d(223), w5Var.d(149), w5Var.d(46), w5Var.d(47));
            case 21:
                return new lx3(w5Var.d(49), w5Var.d(98), w5Var.d(283));
            case 22:
                ve2 ve2Var = (ve2) w5Var.c(97);
                qi9 qi9Var = (qi9) w5Var.c(143);
                z7c z7cVar = (z7c) w5Var.c(32);
                c6i c6iVar = (c6i) w5Var.c(186);
                y7b y7bVar = (y7b) w5Var.c(398);
                tw0 tw0Var = (tw0) w5Var.c(49);
                a3g a3gVar = (a3g) w5Var.c(170);
                m0g m0gVar2 = (m0g) w5Var.c(HttpStatus.SC_FORBIDDEN);
                m0gVar2.getClass();
                return new qh2(ve2Var, qi9Var, z7cVar, c6iVar, y7bVar, tw0Var, a3gVar, ((n0g) m0gVar2).a());
            case 23:
                return new vm9(w5Var.d(270), w5Var.d(31), w5Var.d(56), w5Var.d(237));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new d5a(w5Var.d(49), w5Var.d(143), w5Var.d(97), w5Var.d(46), w5Var.d(186));
            case 25:
                return (pga) w5Var.c(174);
            case 26:
                return new p5e(w5Var.d(97), w5Var.d(98), w5Var.d(99), w5Var.d(100), w5Var.d(47));
            case 27:
                return new h6e(w5Var.d(45), w5Var.d(83));
            case 28:
                return new s6e(w5Var.d(45), w5Var.d(83));
            default:
                return new rg9();
        }
    }
}
