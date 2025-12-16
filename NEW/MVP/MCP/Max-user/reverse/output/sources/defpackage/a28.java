package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class a28 implements io7 {
    public final /* synthetic */ int a;

    public /* synthetic */ a28(int i) {
        this.a = i;
    }

    @Override // defpackage.io7
    public final Object a(w5 w5Var) {
        switch (this.a) {
            case 0:
                return new z29(4);
            case 1:
                return new jbe(22);
            case 2:
                return new s78(w5Var.d(98), w5Var.d(97), w5Var.d(109), w5Var.d(142), w5Var.d(79), w5Var.d(143), w5Var.d(8), w5Var.d(144), w5Var.d(145), w5Var.d(146), w5Var.d(46), w5Var.d(61), w5Var.d(147), w5Var.d(116), w5Var.d(148), w5Var.d(149), w5Var.d(31), w5Var.d(141));
            case 3:
                return hf8.a;
            case 4:
                return ih8.a;
            case 5:
                return new yre(5);
            case 6:
                return new q14(w5Var.d(117), 1);
            case 7:
                return new z29(0);
            case 8:
                return fy9.a;
            case 9:
                return new yre(6);
            case 10:
                return new oya(w5Var);
            case 11:
                return uba.a;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new efe("Аналитика", PmsKey.f2analyticsenabled, true);
            case 13:
                return (ui8) w5Var.c(683);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new efe(PmsKey.f110newsessionlogic);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new uya(w5Var.d(48));
            case 16:
                return new efe("Отображать официальные аккаунты ботов", PmsKey.f116officialbotnamingenabled, false);
            case LangUtils.HASH_SEED /* 17 */:
                w5Var.d(674);
                return new e31(2);
            case 18:
                return zu7.a;
            case 19:
                return p58.a;
            case 20:
                return jo5.a;
            case 21:
                return (ui8) w5Var.c(679);
            case 22:
                return (qf9) w5Var.c(680);
            case 23:
                return (ui8) w5Var.c(681);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return (ui8) w5Var.c(682);
            case 25:
                return new lya(w5Var, 0);
            case 26:
                return new hya(w5Var);
            case 27:
                return (j98) w5Var.c(142);
            case 28:
                mq mqVar = mq.a;
                mq.b = w5Var.d(63);
                return mqVar;
            default:
                return nq.a;
        }
    }
}
