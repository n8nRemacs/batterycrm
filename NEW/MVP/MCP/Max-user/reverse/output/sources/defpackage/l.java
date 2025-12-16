package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.os.HandlerThread;
import one.me.aboutappsettings.AboutAppSettingsScreen;
import one.me.appearancesettings.multitheme.AppearanceSettingsMultiThemeScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.calls.ui.ui.waitingroom.AdminWaitingRoomScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.mediapicker.crop.AvatarEditScreen;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class l implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ l(int i) {
        this.a = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        Object ipdVar;
        Object ipdVar2;
        int i = 12;
        switch (this.a) {
            case 0:
                int i2 = AboutAppSettingsScreen.c;
                return new a0();
            case 1:
                yy7[] yy7VarArr = AddChatAdminsScreen.t0;
                return f1e.CHAT_INFO_ADD_ADMINISTRATOR;
            case 2:
                yy7[] yy7VarArr2 = AddChatMembersScreen.y0;
                return f1e.CHAT_INFO_ADD_PARTICIPANTS;
            case 3:
                yy7[] yy7VarArr3 = AdminWaitingRoomScreen.Z;
                return new sa(fm1.a(), gm1.a.getAccessor().d(508), new lcj(i));
            case 4:
                HandlerThread handlerThread = new HandlerThread("FrescoAnimationWorker");
                handlerThread.start();
                return new Handler(handlerThread.getLooper());
            case 5:
                return new jbe();
            case 6:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                return paint;
            case 7:
                try {
                    ipdVar = feg.a;
                    if (feg.b) {
                        ipdVar = null;
                    }
                } catch (Throwable th) {
                    ipdVar = new ipd(th);
                }
                return (feg) (ipdVar instanceof ipd ? null : ipdVar);
            case 8:
                mq mqVar = mq.a;
                try {
                    ipdVar2 = ((feg) mq.c.getValue()) != null ? jeg.a : null;
                } catch (Throwable th2) {
                    ipdVar2 = new ipd(th2);
                }
                return (jeg) (ipdVar2 instanceof ipd ? null : ipdVar2);
            case 9:
                yy7[] yy7VarArr4 = AppearanceSettingsMultiThemeScreen.Z;
                return f1e.SETTINGS_CHAT_DECORATION;
            case 10:
                yy7[] yy7VarArr5 = AppearanceSettingsMultiThemeScreen.Z;
                return new xr();
            case 11:
                return new oj7();
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new Paint(1);
            case 13:
                float f = 54;
                return new ynd(kti.d(vw4.d().getDisplayMetrics().density * f), kti.d(f * vw4.d().getDisplayMetrics().density));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                yy7[] yy7VarArr6 = AvatarEditScreen.u0;
                return new vd0();
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yy7[] yy7VarArr7 = AvatarEditScreen.u0;
                return f1e.AVATAR_PICKER_CROP;
            case 16:
                return new Canvas();
            case LangUtils.HASH_SEED /* 17 */:
                return new Path();
            case 18:
                return new Path();
            case 19:
                return k7d.a;
            case 20:
                yy7[] yy7VarArr8 = zh0.t0;
                return Boolean.FALSE;
            case 21:
                uld uldVar = new uld();
                uldVar.start();
                return uldVar;
            case 22:
                return new e6c(12);
            case 23:
                return new idc();
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new byte[17408];
            case 25:
                return new dd3();
            case 26:
                yy7[] yy7VarArr9 = CallAdminSettingsScreen.s0;
                k18 k18VarA = fm1.a();
                k18 k18VarD = fm1.d();
                gm1 gm1Var = gm1.a;
                return new h21(gm1Var.a(), gm1Var.getAccessor().d(15), k18VarA, k18VarD, fm1.c());
            case 27:
                yy7[] yy7VarArr10 = CallAdminSettingsScreen.s0;
                return new w11();
            case 28:
                yy7[] yy7VarArr11 = CallAdminSettingsScreen.s0;
                return vye.a;
            default:
                float fC = vw4.c() * 40.0f;
                return new float[]{fC, fC, fC, fC, fC, fC, fC, fC};
        }
    }
}
