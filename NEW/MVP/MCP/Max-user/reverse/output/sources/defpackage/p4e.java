package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class p4e implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ p4e(w5 w5Var, int i) {
        this.a = i;
        this.b = w5Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                m0g m0gVar = (m0g) this.b.c(HttpStatus.SC_FORBIDDEN);
                m0gVar.getClass();
                return ((n0g) m0gVar).a();
            case 1:
                return this.b.c(47);
            case 2:
                return this.b.c(285);
            case 3:
                return this.b.c(278);
            case 4:
                return this.b.c(231);
            case 5:
                return this.b.c(46);
            case 6:
                return this.b.c(143);
            case 7:
                return this.b.c(186);
            case 8:
                return this.b.c(46);
            case 9:
                return this.b.c(143);
            case 10:
                return this.b.c(186);
            case 11:
                return this.b.c(237);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return this.b.c(97);
            case 13:
                return this.b.c(143);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return this.b.c(398);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return this.b.c(9);
            case 16:
                return this.b.c(189);
            case LangUtils.HASH_SEED /* 17 */:
                return this.b.c(318);
            case 18:
                return this.b.c(143);
            case 19:
                return this.b.c(398);
            case 20:
                return this.b.c(210);
            case 21:
                return this.b.c(190);
            case 22:
                return this.b.c(252);
            case 23:
                return this.b.c(294);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return this.b.c(35);
            case 25:
                return this.b.c(150);
            case 26:
                return this.b.c(250);
            case 27:
                return this.b.c(9);
            case 28:
                return this.b.c(189);
            default:
                return this.b.c(79);
        }
    }
}
