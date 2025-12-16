package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class q4e implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ q4e(w5 w5Var, int i) {
        this.a = i;
        this.b = w5Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.c(97);
            case 1:
                return this.b.c(150);
            case 2:
                return this.b.c(97);
            case 3:
                return this.b.c(398);
            case 4:
                return this.b.c(253);
            case 5:
                return this.b.c(97);
            case 6:
                return this.b.c(143);
            case 7:
                return this.b.c(97);
            case 8:
                return this.b.c(46);
            case 9:
                return this.b.c(79);
            case 10:
                return this.b.c(236);
            case 11:
                return this.b.c(231);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return this.b.c(241);
            case 13:
                return this.b.c(240);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return this.b.c(32);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return this.b.c(319);
            case 16:
                return this.b.c(320);
            case LangUtils.HASH_SEED /* 17 */:
                return this.b.c(237);
            case 18:
                return this.b.c(31);
            case 19:
                return this.b.c(271);
            case 20:
                return this.b.c(143);
            case 21:
                return this.b.c(79);
            case 22:
                return this.b.c(284);
            case 23:
                return this.b.c(97);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return this.b.c(98);
            case 25:
                return this.b.c(HttpStatus.SC_REQUEST_TIMEOUT);
            case 26:
                return this.b.c(181);
            case 27:
                return this.b.c(35);
            case 28:
                return this.b.c(88);
            default:
                return this.b.c(9);
        }
    }
}
