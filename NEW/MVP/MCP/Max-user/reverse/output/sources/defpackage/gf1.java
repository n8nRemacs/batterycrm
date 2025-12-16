package defpackage;

import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.widgets.quickcamera.CameraxCameraApiView;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class gf1 implements em6 {
    public final /* synthetic */ int a;

    public /* synthetic */ gf1(int i) {
        this.a = i;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        switch (i) {
            case 0:
                b6a b6aVar = CallLinkInfoScreen.A0;
                ((yeb) obj).b();
                break;
            case 1:
                if (!(obj instanceof Iterable)) {
                    break;
                } else {
                    break;
                }
            case 2:
                if (!(obj instanceof Iterable)) {
                    break;
                } else {
                    break;
                }
            case 3:
                break;
            case 4:
                yy7[] yy7VarArr = CallOpponentsListWidget.H0;
                ((EditText) obj).getText().clear();
                break;
            case 5:
                break;
            case 6:
                int i2 = CameraxCameraApiView.u0;
                long j = ((s65) obj).a;
                int i3 = s65.d;
                t32 t32Var = new t32(a9h.d(s65.m(j, y65.SECONDS), "Не получили ответ от камеры за ", "sec"));
                wqi.e(CameraxCameraApiView.class.getName(), t32Var.getMessage(), t32Var);
                break;
            case 7:
                int i4 = CameraxCameraApiView.u0;
                t32 t32Var2 = new t32(a9h.d(s65.g(((s65) obj).a), "Значение ожидание камеры должно быть больше 0 и больше ", "ms"));
                wqi.e(CameraxCameraApiView.class.getName(), t32Var2.getMessage(), t32Var2);
                break;
            case 8:
                ((Long) obj).getClass();
                yy7[] yy7VarArr2 = ChangeOwnerScreen.t0;
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                break;
            case 13:
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                break;
            case 16:
                break;
            case LangUtils.HASH_SEED /* 17 */:
                break;
            case 18:
                yy7[] yy7VarArr3 = ChatMediaTabWidget.v0;
                kkc.c.S0();
                break;
            case 19:
                gl9 gl9Var = (gl9) obj;
                long j2 = gl9Var.a;
                long j3 = gl9Var.e;
                long j4 = gl9Var.g;
                StringBuilder sbL = az1.l(j2, "p_id=", ",m_id=");
                sbL.append(j3);
                sbL.append(",sender=");
                sbL.append(j4);
                break;
            case 20:
                gl9 gl9Var2 = (gl9) obj;
                break;
            case 21:
                yy7[] yy7VarArr4 = ChatNotificationsSettingsScreen.X;
                gna.c.p0().d();
                break;
            case 22:
                break;
            case 23:
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                pb2 pb2Var = (pb2) obj;
                rf2 rf2Var = pb2Var.b;
                if ((rf2Var.b != pf2.c && rf2Var.a == 0 && rf2Var.j == 0 && rf2Var.c0 == null) || pb2Var.I() || (rf2Var.H.g && pb2Var.c == null)) {
                    z = false;
                }
                break;
            case 25:
                yy7[] yy7VarArr5 = ChatsListSearchScreen.I0;
                break;
            case 26:
                j6e j6eVar = (j6e) obj;
                break;
            case 27:
                break;
            case 28:
                yy7[] yy7VarArr6 = ChatsListWidget.L0;
                break;
            default:
                yy7[] yy7VarArr7 = ChatsListWidget.L0;
                break;
        }
        return x7j.c((RecyclerView) obj);
    }
}
