package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.pinbars.PinBarsWidget;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class iv8 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iv8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = this.a;
        int i2 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new qz3(23, (c38) obj);
            case 1:
                return new qz3(24, (ou8) obj);
            case 2:
                return new qz3(25, (c38) obj);
            case 3:
                return new qz3(26, (c38) obj);
            case 4:
                return new qz3(27, (qn2) obj);
            case 5:
                return new qz3(28, (c38) obj);
            case 6:
                return new qz3(29, (h39) obj);
            case 7:
                return new n39(0, (h39) obj);
            case 8:
                return new n39(i2, (ob9) obj);
            case 9:
                return new n39(2, (de9) obj);
            case 10:
                return new n39(3, (ki9) obj);
            case 11:
                return new n39(4, (oo9) obj);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                yy7[] yy7VarArr = MessagesListWidget.b1;
                vu9 vu9VarK0 = ((MessagesListWidget) obj).K0();
                fff fffVar = (fff) vu9VarK0.Q1.getValue();
                if (fffVar != null) {
                    int i3 = 1;
                    ((c6i) vu9VarK0.V0.getValue()).b(new yge(new xge(i3, vu9VarK0.b.a, fffVar.a)));
                }
                uh7 uh7VarA = gq9.a.a();
                if (uh7VarA != null) {
                    uh7VarA.f(gke.h(new th7(rh7.b, 1), new th7(rh7.X, 1)), f1e.CHAT);
                }
                return qqg.a;
            case 13:
                return new n39(5, (wj1) obj);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new n39(6, (zu9) obj);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new n39(7, (yq9) obj);
            case 16:
                return new n39(8, (ofa) obj);
            case LangUtils.HASH_SEED /* 17 */:
                return new n39(9, (yq9) obj);
            case 18:
                return new n39(10, (yq9) obj);
            case 19:
                return new n39(11, (zfb) obj);
            case 20:
                return new n39(12, (zfb) obj);
            case 21:
                return new n39(13, (xxb) obj);
            case 22:
                return new n39(14, (zfb) obj);
            case 23:
                return new n39(15, (oyb) obj);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new n39(16, (zfb) obj);
            case 25:
                return new n39(17, (zyb) obj);
            case 26:
                return a93.s0.z(((PinBarsWidget) obj).getContext()).c;
            case 27:
                return new n39(18, (szb) obj);
            case 28:
                return new n39(19, (wj1) obj);
            default:
                return new n39(20, (l3b) obj);
        }
    }
}
