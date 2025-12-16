package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.db.room.OneMeRoomDatabase;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class b31 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ b31(w5 w5Var, int i) {
        this.a = i;
        this.b = w5Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        w5 w5Var = this.b;
        switch (i) {
            case 0:
                return new y7d(w5Var.d(47), w5Var.d(61), w5Var.d(75));
            case 1:
                return Long.valueOf(((w4e) ((pb3) w5Var.c(46))).s());
            case 2:
                return new nc2((Context) w5Var.c(12), (h18) w5Var.c(114), (nxg) w5Var.c(122), (pc2) w5Var.c(571), (so3) w5Var.c(488));
            case 3:
                return (psd) w5Var.c(117);
            case 4:
                return ((w4e) ((pb3) w5Var.c(46))).u();
            case 5:
                return ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a();
            case 6:
                return new e28(w5Var);
            case 7:
                return ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a();
            case 8:
                return ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a();
            case 9:
                jy0 jy0Var = new jy0();
                jy0Var.a = (ey0) w5Var.c(53);
                jy0Var.e = new bl4((Context) w5Var.c(12), (oe4) w5Var.c(51));
                jy0Var.d = true;
                jy0Var.f = 2;
                return jy0Var;
            case 10:
                return ((m8d) w5Var.c(662)).a;
            case 11:
                return ((r97) w5Var.c(446)).a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((g4b) w5Var.c(56)).c();
            case 13:
                g4b g4bVar = (g4b) w5Var.c(56);
                yy7[] yy7VarArr = g4b.q;
                return g4bVar.h(g4bVar.i(g4bVar.b().a("rlottie", false), "rlottie"), "rlottie");
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return Boolean.valueOf(((nv4) w5Var.c(86)).compareTo(nv4.HIGH) >= 0);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                g4b g4bVar2 = (g4b) w5Var.c(56);
                jj5 jj5Var = g4bVar2.k;
                yy7 yy7Var = g4b.q[4];
                return g4bVar2.e(jj5Var);
            case 16:
                return (ScheduledExecutorService) ((g4b) w5Var.c(56)).m.getValue();
            case LangUtils.HASH_SEED /* 17 */:
                return ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a();
            case 18:
                return new k4e(w5Var);
            case 19:
                ((lv4) w5Var.c(35)).e();
                return gwa.a;
            case 20:
                return ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).b();
            case 21:
                return Long.valueOf(((w4e) ((pb3) w5Var.c(46))).s());
            case 22:
                return ((g4b) w5Var.c(56)).c();
            case 23:
                return new o4e(w5Var);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ((OneMeRoomDatabase) ((q9b) w5Var.c(193)).l()).Y();
            case 25:
                return Long.valueOf(((w4e) ((pb3) w5Var.c(46))).s());
            case 26:
                return ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a();
            case 27:
                return ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a();
            case 28:
                m0g m0gVar = (m0g) w5Var.c(HttpStatus.SC_FORBIDDEN);
                m0gVar.getClass();
                return ((n0g) m0gVar).a();
            default:
                return ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a();
        }
    }
}
