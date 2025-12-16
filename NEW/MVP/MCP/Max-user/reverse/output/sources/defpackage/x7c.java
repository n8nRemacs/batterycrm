package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class x7c extends t2f {
    public final /* synthetic */ int b;

    public /* synthetic */ x7c(int i) {
        this.b = i;
    }

    @Override // defpackage.t2f
    public final Object b(w5 w5Var) {
        switch (this.b) {
            case 0:
                return (sxg) w5Var.c(59);
            case 1:
                return new gn5((Context) w5Var.c(12), "experiments_prefs", (bx5) w5Var.c(71));
            case 2:
                return new l5c((Context) w5Var.c(12), (bx5) w5Var.c(71), (gn5) w5Var.c(62));
            case 3:
                return (l5c) w5Var.c(63);
            case 4:
                return (age) w5Var.c(63);
            case 5:
                return new gu5((Context) w5Var.c(12), (bx5) w5Var.c(71), (l5c) w5Var.c(64));
            case 6:
                return (f5e) w5Var.c(65);
            case 7:
                return new zt6(w5Var.d(12), w5Var.d(109), w5Var.d(110), w5Var.d(111), w5Var.d(47), w5Var.d(8), w5Var.d(112), w5Var.d(113));
            case 8:
                return new dac((Context) w5Var.c(12), w5Var.d(399), (tw0) w5Var.c(49), w5Var.d(47));
            case 9:
                return new ni8(w5Var.d(32), w5Var.d(98), w5Var.d(HttpStatus.SC_PARTIAL_CONTENT), w5Var.d(97), w5Var.d(252), w5Var.d(210), w5Var.d(231), w5Var.d(398), w5Var.d(189), w5Var.d(183), w5Var.d(35), w5Var.d(HttpStatus.SC_LOCKED), w5Var.d(312), w5Var.d(258), w5Var.d(313), w5Var.d(HttpStatus.SC_UNSUPPORTED_MEDIA_TYPE), w5Var.d(314), w5Var.d(315), w5Var.d(316), w5Var.d(240), w5Var.b(0), w5Var.d(110), w5Var.d(8), w5Var.d(122), w5Var.d(48));
            case 10:
                return ((ie4) w5Var.c(189)).f;
            case 11:
                return ((ie4) w5Var.c(189)).d;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return ((ie4) w5Var.c(189)).e;
            case 13:
                return ((ie4) w5Var.c(189)).c;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return ((ie4) w5Var.c(189)).b;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return ((ie4) w5Var.c(189)).h;
            case 16:
                return ((ie4) w5Var.c(189)).g;
            case LangUtils.HASH_SEED /* 17 */:
                return ((ie4) w5Var.c(189)).k;
            case 18:
                j98 j98Var = (j98) w5Var.c(142);
                uda udaVar = (uda) w5Var.c(173);
                j98Var.getClass();
                c9f c9fVar = (c9f) w5Var.c(172);
                w5Var.getClass();
                return new xo4(udaVar, c9fVar, new kk4(28), new qs3(w5Var.d(139), (age) w5Var.c(47)), ((n0g) ((m0g) w5Var.c(HttpStatus.SC_FORBIDDEN))).a());
            case 19:
                return ((ie4) w5Var.c(189)).l;
            case 20:
                return ((ie4) w5Var.c(189)).m;
            case 21:
                return ((ie4) w5Var.c(189)).i;
            case 22:
                return ((ie4) w5Var.c(189)).j;
            case 23:
                return ((ie4) w5Var.c(189)).n;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ((ie4) w5Var.c(189)).o;
            case 25:
                return ((ie4) w5Var.c(189)).p;
            case 26:
                return ((ie4) w5Var.c(189)).q;
            case 27:
                return ((ie4) w5Var.c(189)).r;
            case 28:
                return ((ie4) w5Var.c(189)).s;
            default:
                return new cz4();
        }
    }
}
