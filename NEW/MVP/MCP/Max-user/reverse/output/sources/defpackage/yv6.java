package defpackage;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class yv6 extends ypd {
    public final /* synthetic */ int b;

    public /* synthetic */ yv6(int i) {
        this.b = i;
    }

    @Override // defpackage.ypd
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                return new tw6((Context) w5Var.c(12), (lzf) w5Var.c(8));
            case 1:
                return new ew0(w5Var.d(138));
            case 2:
                return (l7a) w5Var.c(634);
            case 3:
                return new ct6();
            case 4:
                return new fs6(w5Var.d(79), w5Var.d(109), w5Var.d(97), w5Var.d(138), w5Var.d(150), w5Var.d(61), w5Var.d(9));
            case 5:
                return new cb6(w5Var.d(35), w5Var.d(31), w5Var.d(123), w5Var.d(46), w5Var.d(47), w5Var.d(12));
            case 6:
                return new q70(w5Var.d(88), w5Var.d(46), w5Var.d(151));
            case 7:
                return new hi8(w5Var.d(182), w5Var.d(39), w5Var.d(46), w5Var.d(31), w5Var.d(HttpStatus.SC_NON_AUTHORITATIVE_INFORMATION), w5Var.d(165), w5Var.d(238), w5Var.d(123), w5Var.d(34));
            case 8:
                Context context = (Context) w5Var.c(12);
                pm4 pm4Var = new pm4();
                synchronized (pm4Var) {
                    pm4Var.a = true;
                }
                ho4 ho4Var = new ho4(context, pm4Var);
                nj0 nj0Var = new nj0(w5Var);
                ho4Var.b = nj0Var;
                fo4 fo4Var = ho4Var.a;
                if (nj0Var != ((oe4) fo4Var.o)) {
                    fo4Var.o = nj0Var;
                    ((HashMap) fo4Var.c).clear();
                    ((HashMap) fo4Var.d).clear();
                }
                return ho4Var;
            case 9:
                return new fn4();
            case 10:
                return new j25((Context) w5Var.c(12), (df4) w5Var.c(54), (ey0) w5Var.c(53), (oe4) w5Var.c(51), ((g4b) w5Var.c(56)).c());
            case 11:
                return new b1f(new File(az1.i(((Context) w5Var.c(12)).getCacheDir().getAbsolutePath(), "/media")), new x18(to8.j(new imb(l09.d, 524288000L), new imb(l09.b, 52428800L))), (df4) w5Var.c(54), false);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new ed9((tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case 13:
                return new io4(w5Var.d(HttpStatus.SC_PARTIAL_CONTENT), w5Var.d(46), w5Var.d(208), w5Var.d(48));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new lr9(w5Var);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new q85(21);
            case 16:
                return new dy9(w5Var.d(8), w5Var.d(186), w5Var.d(546), w5Var.d(547), w5Var.d(548));
            case LangUtils.HASH_SEED /* 17 */:
                return new r73(w5Var.d(79), w5Var.d(97), w5Var.d(109), w5Var.d(180));
            case 18:
                return new hxe(w5Var.d(47));
            case 19:
                return new q7b(w5Var.d(32), w5Var.d(111), w5Var.d(426), w5Var.d(680), (Context) w5Var.c(12));
            case 20:
                return new lk4();
            case 21:
                return new e3b((Context) w5Var.c(12), (lk4) w5Var.c(425));
            case 22:
                return new vi(new pi(), (Context) w5Var.c(12));
            case 23:
                return new j98();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new v6b();
            case 25:
                w5Var.d(124);
                return new v1a(26);
            case 26:
                return (v28) w5Var.c(682);
            case 27:
                return new pya(w5Var);
            case 28:
                return (f0g) w5Var.c(635);
            default:
                return new ft6(w5Var.d(HttpStatus.SC_GONE), w5Var.d(109), w5Var.d(88));
        }
    }
}
