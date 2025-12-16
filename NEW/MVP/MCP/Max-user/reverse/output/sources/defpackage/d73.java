package defpackage;

import java.util.Collection;
import java.util.Map;
import one.me.chats.tab.ChatsTabWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.DevMenuScreen;
import one.me.login.inputname.InputNameScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.sdk.concurrent.watchdog.ThreadExecutorStuckException;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.sdk.ml.config.KwsFeaturesConfigProviderImpl;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class d73 implements em6 {
    public final /* synthetic */ int a;

    public /* synthetic */ d73(int i) {
        this.a = i;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        jza jzaVar = jza.c;
        gza gzaVar = gza.d;
        iza izaVar = iza.a;
        qqg qqgVar = qqg.a;
        switch (i) {
            case 0:
                yy7[] yy7VarArr = ChatsTabWidget.F0;
                a63.c.p0().b(":start-conversation", null);
                break;
            case 1:
                ((Integer) obj).getClass();
                break;
            case 2:
                yy7[] yy7VarArr2 = zd3.l;
                break;
            case 3:
                wqi.e("OneMeExecutors", "hanged threads", new ThreadExecutorStuckException((Collection) obj));
                break;
            case 4:
                wqi.e("OneMeExecutors", "stucked threads", new ThreadExecutorStuckException((Collection) obj));
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                d14 d14Var = (d14) obj;
                break;
            case 10:
                break;
            case 11:
                ((Boolean) obj).getClass();
                break;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                v74 v74Var = (v74) obj;
                if (v74Var instanceof z74) {
                    break;
                }
                break;
            case 13:
                yy7[] yy7VarArr3 = DevMenuScreen.Y;
                av4.c.p0().d();
                break;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                yy7[] yy7VarArr4 = DialogNotificationsSettingsScreen.X;
                gna.c.p0().d();
                break;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                break;
            case 16:
                Map map = ((cj9) obj).f;
                Object obj2 = map != null ? map.get(KwsFeaturesConfigProviderImpl.URL_KEY) : null;
                if (obj2 instanceof String) {
                    break;
                }
                break;
            case LangUtils.HASH_SEED /* 17 */:
                break;
            case 18:
                mei.d(ho7.f(zj5.t0.getAndIncrement(), "service-watchdog-"), new vj5((Runnable) obj, 0));
                break;
            case 19:
                break;
            case 20:
                Long l = (Long) obj;
                l.longValue();
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                break;
            case 25:
                break;
            case 26:
                j6e j6eVar = (j6e) obj;
                break;
            case 27:
                break;
            case 28:
                OneMeButton oneMeButton = (OneMeButton) obj;
                yy7[] yy7VarArr5 = InputNameScreen.A0;
                oneMeButton.setText(t3d.oneme_login_input_name_continue_button_disabled);
                oneMeButton.setMode(izaVar);
                oneMeButton.setAppearance(gzaVar);
                oneMeButton.setSize(jzaVar);
                oneMeButton.setEnabled(false);
                break;
            default:
                OneMeButton oneMeButton2 = (OneMeButton) obj;
                yy7[] yy7VarArr6 = InputNameScreen.A0;
                oneMeButton2.setId(xyc.oneme_login_input_name_continue_btn);
                oneMeButton2.setText(t3d.oneme_login_input_name_continue_button_active);
                oneMeButton2.setMode(izaVar);
                oneMeButton2.setAppearance(gzaVar);
                oneMeButton2.setSize(jzaVar);
                oneMeButton2.setEnabled(true);
                break;
        }
        return qqgVar;
    }
}
