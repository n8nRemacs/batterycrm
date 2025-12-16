package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.chats.a;
import ru.ok.tamtam.login.b;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class f4e extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ f4e(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                return new kz(v7j.a(new s4e(w5Var, 7)), v7j.a(new s4e(w5Var, 8)), v7j.a(new s4e(w5Var, 9)), v7j.a(new s4e(w5Var, 2)), v7j.a(new s4e(w5Var, 3)), v7j.a(new s4e(w5Var, 4)), v7j.a(new s4e(w5Var, 5)), v7j.a(new s4e(w5Var, 6)));
            case 1:
                return new ut6(w5Var.d(79), w5Var.d(47), w5Var.d(98), w5Var.d(HttpStatus.SC_MULTI_STATUS), w5Var.d(283), w5Var.d(49));
            case 2:
                dd ddVar = (dd) w5Var.c(88);
                return new mue(ddVar, (tw0) w5Var.c(49), new q85(29), (yi5) w5Var.c(9), (c6i) w5Var.c(186));
            case 3:
                return new vcd((ve2) w5Var.c(97), (qv3) w5Var.c(98), ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a());
            case 4:
                return new jt6(w5Var.d(79), w5Var.d(47), w5Var.d(138), w5Var.d(46));
            case 5:
                return new kde(w5Var.d(79), w5Var.d(251), w5Var.d(9), w5Var.d(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED));
            case 6:
                return new b42(w5Var.d(79), w5Var.d(251), w5Var.d(9));
            case 7:
                return new w14((yi5) w5Var.c(9), (tw0) w5Var.c(49), ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).b(), ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a(), (qv3) w5Var.c(98), (v04) w5Var.c(100), (o7e) w5Var.c(99));
            case 8:
                return new vw1((hwa) w5Var.c(79), (qi9) w5Var.c(143), (ve2) w5Var.c(97), ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).b(), (qx5) w5Var.c(137), (tw0) w5Var.c(49), (z7c) w5Var.c(32), (g4b) w5Var.c(56), (od8) w5Var.c(374), (pj9) w5Var.c(215));
            case 9:
                return new en8();
            case 10:
                return new lcj(15);
            case 11:
                return new ac9((age) w5Var.c(47));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a();
                return new u1j(16);
            case 13:
                return new wef((hwa) w5Var.c(79), (tef) w5Var.c(231), ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a(), (d1g) w5Var.c(284));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new w64(w5Var.d(61), w5Var.d(314), w5Var.d(399), w5Var.d(438));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new zsf(w5Var.d(61), w5Var.d(315), w5Var.d(399), w5Var.d(438));
            case 16:
                return new od8(w5Var.d(143), w5Var.d(215));
            case LangUtils.HASH_SEED /* 17 */:
                return new y9c((z7c) w5Var.c(32), v7j.a(new s4e(w5Var, 10)), v7j.a(new s4e(w5Var, 11)));
            case 18:
                return new lh2((tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case 19:
                return new o58((tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case 20:
                return (tw0) w5Var.c(185);
            case 21:
                return new zh2((tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case 22:
                return new h18((lzf) w5Var.c(8), (yi5) w5Var.c(9));
            case 23:
                return b.a((tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                qi8 qi8Var = new qi8();
                qi8Var.a = new AtomicReference(eoi.a());
                return qi8Var;
            case 25:
                return a.a((tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case 26:
                return new vr6(w5Var.d(123), w5Var.d(150), w5Var.d(8));
            case 27:
                return new zz((lzf) w5Var.c(8));
            case 28:
                return new klc(((OneMeRoomDatabase) ((q9b) w5Var.c(193)).l()).K(), w5Var.d(8), w5Var.d(123), (a84) w5Var.c(84));
            default:
                return new xi8(w5Var.d(107), w5Var.d(436), w5Var.d(261), w5Var.d(384));
        }
    }
}
