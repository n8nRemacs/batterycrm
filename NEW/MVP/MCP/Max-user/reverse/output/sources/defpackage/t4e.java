package defpackage;

import javax.net.ssl.SSLContext;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class t4e implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ w5 b;

    public /* synthetic */ t4e(w5 w5Var, int i) {
        this.a = i;
        this.b = w5Var;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        w5 w5Var = this.b;
        switch (i) {
            case 0:
                return w5Var.c(215);
            case 1:
                return w5Var.c(190);
            case 2:
                return w5Var.c(98);
            case 3:
                return w5Var.c(143);
            case 4:
                return w5Var.c(170);
            case 5:
                return w5Var.c(216);
            case 6:
                return w5Var.c(186);
            case 7:
                return w5Var.c(217);
            case 8:
                return w5Var.c(144);
            case 9:
                return w5Var.c(HttpStatus.SC_LENGTH_REQUIRED);
            case 10:
                return w5Var.c(290);
            case 11:
                return w5Var.c(189);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return w5Var.c(9);
            case 13:
                return w5Var.c(79);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return w5Var.c(189);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return w5Var.c(284);
            case 16:
                return w5Var.c(236);
            case LangUtils.HASH_SEED /* 17 */:
                return w5Var.c(189);
            case 18:
                return w5Var.c(137);
            case 19:
                return w5Var.c(79);
            case 20:
                return w5Var.c(271);
            case 21:
                return w5Var.c(270);
            case 22:
                return (SSLContext) ((c9f) w5Var.c(172)).e.getValue();
            case 23:
                return (SSLContext) ((c9f) w5Var.c(172)).e.getValue();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                g4b g4bVar = (g4b) w5Var.c(56);
                yy7[] yy7VarArr = g4b.q;
                return g4bVar.f(1, "upload-video", 2, 5, true);
            default:
                return ((g4b) w5Var.c(56)).c();
        }
    }
}
