package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.internal.Symbol;
import one.me.android.OneMeApplication;
import one.me.chats.picker.chats.PickerChatsTabWidget;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class dga implements em6 {
    public final /* synthetic */ int a;

    public /* synthetic */ dga(int i) {
        this.a = i;
    }

    @Override // defpackage.em6
    public final Object invoke(Object obj) {
        int i = this.a;
        qqg qqgVar = qqg.a;
        switch (i) {
            case 0:
                return Integer.valueOf(((yeb) obj).getIcon().h);
            case 1:
                return Integer.valueOf(((yeb) obj).b().m);
            case 2:
                return Boolean.valueOf(((d14) obj).a == 5);
            case 3:
                yy7[] yy7VarArr = NotificationsSettingsScreen.u0;
                gna.c.p0().d();
                return qqgVar;
            case 4:
                ls8 ls8Var = (ls8) obj;
                rwa rwaVar = OneMeApplication.s0;
                StringBuilder sbQ = xrf.q("    ", TimeUnit.NANOSECONDS.toMillis(ls8Var.c), ls8Var.a, ": executing=");
                sbQ.append("ms");
                return sbQ.toString();
            case 5:
                ls8 ls8Var2 = (ls8) obj;
                rwa rwaVar2 = OneMeApplication.s0;
                StringBuilder sbQ2 = xrf.q("    ", TimeUnit.NANOSECONDS.toMillis(ls8Var2.b), ls8Var2.a, ": waiting=");
                sbQ2.append("ms");
                return sbQ2.toString();
            case 6:
                ls8 ls8Var3 = (ls8) obj;
                rwa rwaVar3 = OneMeApplication.s0;
                String str = ls8Var3.a;
                TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                long millis = timeUnit.toMillis(ls8Var3.c);
                long millis2 = timeUnit.toMillis(ls8Var3.b);
                StringBuilder sbQ3 = xrf.q("    ", millis, str, ": executing=");
                sbQ3.append("ms, waiting=");
                sbQ3.append(millis2);
                return sbQ3.toString();
            case 7:
                int i2 = zud.h;
                yy7[] yy7VarArr2 = OneMeButton.A0;
                return Boolean.valueOf(((View) obj).getId() != i2);
            case 8:
                return Integer.valueOf(((yeb) obj).getIcon().f);
            case 9:
                int iIntValue = ((Integer) obj).intValue();
                return Integer.valueOf(iIntValue != 0 ? iIntValue != 1 ? 10 : 15 : 18);
            case 10:
                Symbol symbol = o9a.a;
                return new n9a();
            case 11:
                View view = (View) obj;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup == null) {
                    return null;
                }
                if (viewGroup.getChildCount() == 0) {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    return new at(8, viewGroup);
                }
                return null;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                ssd ssdVar = ssd.a;
                View view2 = (View) obj;
                if (view2 instanceof ViewGroup) {
                    ((ViewGroup) view2).setOnHierarchyChangeListener(ssdVar);
                }
                return Boolean.TRUE;
            case 13:
                yy7[] yy7VarArr3 = g4b.q;
                return qqgVar;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return Integer.valueOf(((yeb) obj).getText().j);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return Integer.valueOf(26 - ((((Integer) obj).intValue() + 1) * 4));
            case 16:
                return Integer.valueOf(((yeb) obj).getText().j);
            case LangUtils.HASH_SEED /* 17 */:
                return ((tv3) obj).a();
            case 18:
                int i3 = zud.h;
                yy7[] yy7VarArr4 = OneMeTitleSubtitleButton.y0;
                return Boolean.valueOf(((View) obj).getId() != i3);
            case 19:
                yy7[] yy7VarArr5 = OtherNotificationsSettingsScreen.X;
                gna.c.p0().d();
                return qqgVar;
            case 20:
                erb erbVar = ((jqb) obj).d;
                if (erbVar != null) {
                    return new fd(erbVar);
                }
                throw new IllegalArgumentException("Required value was null.");
            case 21:
                return ((hs2) obj).A0;
            case 22:
                yy7[] yy7VarArr6 = PickerChatsTabWidget.x0;
                return Boolean.FALSE;
            case 23:
                ((Integer) obj).getClass();
                yy7[] yy7VarArr7 = PickerContactsListWidget.y0;
                return Boolean.FALSE;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ((uch) obj).toString();
            case 25:
                return ucf.a(null);
            case 26:
                imb imbVar = (imb) obj;
                return new cbc(((Long) imbVar.a).longValue(), Collections.singletonList((String) imbVar.b));
            case 27:
                yy7[] yy7VarArr8 = ProfileInviteScreen.X;
                kkc.c.S0();
                return qqgVar;
            case 28:
                return Integer.valueOf(((yeb) obj).getText().i);
            default:
                return Integer.valueOf(((yeb) obj).getText().g);
        }
    }
}
