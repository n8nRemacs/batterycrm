package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class g4e extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ g4e(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                return new c6i(w5Var.d(170), w5Var.d(9), w5Var.d(56), w5Var.d(183), w5Var.d(139), w5Var.d(234), w5Var.d(235));
            case 1:
                return new dc4();
            case 2:
                return new ie4((q9b) w5Var.c(193), (yi5) w5Var.c(9), (a84) w5Var.c(84), (m4e) w5Var.c(190), (pb3) w5Var.c(46), w5Var.d(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED), (hwa) w5Var.c(79), (lzf) w5Var.c(8), (gk) w5Var.c(282), w5Var.d(397), w5Var.d(35));
            case 3:
                return (ie4) w5Var.c(188);
            case 4:
                return m4e.a;
            case 5:
                return v1a.y0;
            case 6:
                return b6a.z0;
            case 7:
                return new q9b((Context) w5Var.c(12), (qi8) w5Var.c(384), (q3b) w5Var.c(HttpStatus.SC_REQUEST_TIMEOUT), (g4b) w5Var.c(56), w5Var.d(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED), (nxg) w5Var.c(122));
            case 8:
                return new b27(w5Var.d(31), w5Var.d(35), w5Var.d(32), w5Var.d(171), w5Var.d(181), w5Var.d(79), w5Var.d(186), w5Var.d(199));
            case 9:
                bwf bwfVarD = w5Var.d(46);
                bwf bwfVarD2 = w5Var.d(9);
                return new fg8((tih) w5Var.c(76), (lzf) w5Var.c(8), w5Var.d(268), bwfVarD, bwfVarD2, w5Var.d(48), w5Var.d(79), w5Var.d(45), w5Var.d(182));
            case 10:
                bwf bwfVarD3 = w5Var.d(199);
                w5Var.getClass();
                return new dd(bwfVarD3, w5Var.d(46));
            case 11:
                return new s0c(w5Var.d(79), w5Var.d(35), w5Var.d(31), w5Var.d(186), new bwf(new b31(w5Var, 20)));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new uih(w5Var.d(32), w5Var.d(31), w5Var.d(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION), w5Var.d(HttpStatus.SC_MULTI_STATUS), w5Var.d(318), w5Var.d(216), w5Var.d(183), w5Var.d(324), w5Var.d(139), w5Var.d(15), w5Var.d(182));
            case 13:
                return new zg(new fs4(), new n4e(w5Var));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new l24((qv3) w5Var.c(98), new bwf(new b31(w5Var, 21)), w5Var.d(HttpStatus.SC_GONE), w5Var.d(32), w5Var.d(8));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new so4(w5Var.d(264));
            case 16:
                return new f8c(w5Var.d(189), w5Var.d(98), new bwf(new b31(w5Var, 22)), (lzf) w5Var.c(8), (a84) w5Var.c(84));
            case LangUtils.HASH_SEED /* 17 */:
                h8c h8cVar = new h8c(w5Var.d(HttpStatus.SC_PARTIAL_CONTENT), w5Var.d(HttpStatus.SC_GONE), w5Var.d(46), (tw0) w5Var.c(49), w5Var.d(31), w5Var.d(79), (lzf) w5Var.c(8), new bwf(new b31(w5Var, 23)));
                ((oje) w5Var.c(180)).a(h8cVar);
                return h8cVar;
            case 18:
                return new i8c(w5Var.d(HttpStatus.SC_MULTI_STATUS));
            case 19:
                return new g5i((Context) w5Var.c(12), (j0e) ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).c.getValue(), ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a(), new bwf(new b31(w5Var, 24)), (age) w5Var.c(47));
            case 20:
                kz4 kz4VarA = v7j.a(new s4e(w5Var, 16));
                tw0 tw0Var = (tw0) w5Var.c(49);
                z7c z7cVar = (z7c) w5Var.c(32);
                v7j.a(new s4e(w5Var, 17));
                kz4 kz4VarA2 = v7j.a(new s4e(w5Var, 18));
                kz4 kz4VarA3 = v7j.a(new s4e(w5Var, 12));
                kz4 kz4VarA4 = v7j.a(new s4e(w5Var, 13));
                kz4 kz4VarA5 = v7j.a(new s4e(w5Var, 14));
                j0e j0eVarA = ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a();
                deg degVar = (deg) w5Var.c(HttpStatus.SC_LENGTH_REQUIRED);
                v7j.a(new s4e(w5Var, 15));
                return new qv3(kz4VarA, tw0Var, z7cVar, kz4VarA2, kz4VarA3, kz4VarA4, kz4VarA5, j0eVarA, degVar);
            case 21:
                return new e7c(w5Var.d(HttpStatus.SC_GONE), w5Var.d(98), w5Var.d(32), w5Var.d(35), w5Var.d(9), w5Var.d(282));
            case 22:
                return new c7c((tw0) w5Var.c(49), w5Var.d(209));
            case 23:
                return new mm9(v7j.a(new s4e(w5Var, 19)));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new hl9(v7j.a(new s4e(w5Var, 20)));
            case 25:
                return new qy2(v7j.a(new s4e(w5Var, 26)), v7j.a(new s4e(w5Var, 27)), v7j.a(new s4e(w5Var, 28)), v7j.a(new s4e(w5Var, 21)), v7j.a(new s4e(w5Var, 22)), v7j.a(new s4e(w5Var, 23)), v7j.a(new s4e(w5Var, 24)), v7j.a(new s4e(w5Var, 25)));
            case 26:
                return new pj9(w5Var.d(98), w5Var.d(210), w5Var.d(212), w5Var.d(211), w5Var.d(HttpStatus.SC_PRECONDITION_FAILED));
            case 27:
                bsd bsdVar = (bsd) w5Var.c(265);
                bwf bwfVar = new bwf(new b31(w5Var, 25));
                bwf bwfVarD4 = w5Var.d(190);
                w5Var.getClass();
                return new gx9(bsdVar, bwfVar, bwfVarD4, w5Var.d(35), w5Var.d(8));
            case 28:
                return new dkb(v7j.a(new s4e(w5Var, 29)));
            default:
                ie4 ie4Var = (ie4) w5Var.c(189);
                tw0 tw0Var2 = (tw0) w5Var.c(49);
                z7c z7cVar2 = (z7c) w5Var.c(32);
                dkb dkbVar = (dkb) w5Var.c(216);
                c7c c7cVar = (c7c) w5Var.c(210);
                kz4 kz4VarA6 = v7j.a(new t4e(w5Var, 0));
                ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a();
                return new qi9(ie4Var, tw0Var2, z7cVar2, dkbVar, c7cVar, kz4VarA6, ((lv4) w5Var.c(35)).j().b);
        }
    }
}
