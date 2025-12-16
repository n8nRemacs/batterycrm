package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class s4e implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ s4e(w5 w5Var, int i) {
        this.a = i;
        this.b = w5Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.c(82);
            case 1:
                return this.b.c(372);
            case 2:
                return this.b.c(245);
            case 3:
                return this.b.c(49);
            case 4:
                return this.b.c(137);
            case 5:
                return this.b.c(348);
            case 6:
                return this.b.c(56);
            case 7:
                return this.b.c(HttpStatus.SC_FORBIDDEN);
            case 8:
                return this.b.c(79);
            case 9:
                return this.b.c(46);
            case 10:
                return this.b.c(319);
            case 11:
                return this.b.c(320);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return this.b.c(HttpStatus.SC_GONE);
            case 13:
                return this.b.c(HttpStatus.SC_MULTI_STATUS);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return this.b.c(89);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return this.b.c(149);
            case 16:
                return this.b.c(189);
            case LangUtils.HASH_SEED /* 17 */:
                return this.b.c(79);
            case 18:
                return this.b.c(9);
            case 19:
                return this.b.c(32);
            case 20:
                return this.b.c(32);
            case 21:
                return this.b.c(HttpStatus.SC_MULTI_STATUS);
            case 22:
                return this.b.c(47);
            case 23:
                return this.b.c(HttpStatus.SC_PROXY_AUTHENTICATION_REQUIRED);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return this.b.c(397);
            case 25:
                return this.b.c(48);
            case 26:
                return this.b.c(181);
            case 27:
                return this.b.c(HttpStatus.SC_GONE);
            case 28:
                return this.b.c(HttpStatus.SC_PARTIAL_CONTENT);
            default:
                return this.b.c(79);
        }
    }
}
