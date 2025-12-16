package defpackage;

import one.me.chats.forward.ForwardPickerScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class yo3 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yo3(int i, Object obj) {
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
                return new sl2(26, (fu2) obj);
            case 1:
                return new sl2(27, (gp3) obj);
            case 2:
                return new sl2(28, (wp3) obj);
            case 3:
                return new sl2(29, (wj1) obj);
            case 4:
                return (Boolean) ((mq3) obj).X1.invoke();
            case 5:
                return new qz3(0, (wj1) obj);
            case 6:
                return new qz3(i2, (az3) obj);
            case 7:
                return Class.forName((String) obj);
            case 8:
                return new qz3(2, (ps3) obj);
            case 9:
                return new qz3(3, (ps3) obj);
            case 10:
                return new qz3(4, (ps3) obj);
            case 11:
                return new qz3(5, (wj1) obj);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new qz3(6, (e44) obj);
            case 13:
                return new qz3(7, (nq5) obj);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new qz3(8, (sc6) obj);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ForwardPickerScreen forwardPickerScreen = (ForwardPickerScreen) obj;
                yy7[] yy7VarArr = ForwardPickerScreen.I0;
                ForwardPickerScreen.K0(forwardPickerScreen, forwardPickerScreen.M0(), new n5g(avd.m0), true);
                forwardPickerScreen.y0 = k54.X;
                return qqg.a;
            case 16:
                return new qz3(9, (nq5) obj);
            case LangUtils.HASH_SEED /* 17 */:
                return new qz3(10, (qm7) obj);
            case 18:
                return new qz3(11, (an7) obj);
            case 19:
                return new qz3(12, (i77) obj);
            case 20:
                return new qz3(13, (xr7) obj);
            case 21:
                return new qz3(14, (fr7) obj);
            case 22:
                return new qz3(15, (fr7) obj);
            case 23:
                return new qz3(16, (i77) obj);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new qz3(17, (wj1) obj);
            case 25:
                return new qz3(18, (c38) obj);
            case 26:
                return new qz3(19, (c38) obj);
            case 27:
                return new qz3(20, (c38) obj);
            case 28:
                return new qz3(21, (fr7) obj);
            default:
                return new qz3(22, (c38) obj);
        }
    }
}
