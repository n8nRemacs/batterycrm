package defpackage;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.AccelerateDecelerateInterpolator;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.tools.server.ServerHostBottomSheet;
import one.me.devmenu.tools.server.ServerPortBottomSheet;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;
import one.me.settings.SettingsListScreen;
import one.me.settings.media.ui.SettingMediaScreen;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;
import one.me.settings.privacy.ui.onboarding.SafeModeOnboardingScreen;
import one.me.settings.privacy.ui.pincode.SetupPinCodeScreen;
import one.me.settings.ringtone.ui.SettingRingtoneScreen;
import one.me.settings.storage.ui.SettingsStorageScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerDialogFragment;
import ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class efd implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ efd(int i) {
        this.a = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                yy7[] yy7VarArr = RecordControlsWidget.g1;
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                return gradientDrawable;
            case 1:
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(704595023);
                return shapeDrawable;
            case 2:
                return hld.e();
            case 3:
                float fC = vw4.c() * 24.0f;
                return new float[]{fC, fC, fC, fC, fC, fC, fC, fC};
            case 4:
                return new ShapeDrawable(new OvalShape());
            case 5:
                yy7[] yy7VarArr2 = SafeModeOnboardingScreen.X;
                bqe bqeVar = bqe.a;
                return new wwd(bqeVar.a(), bqeVar.getAccessor().d(392));
            case 6:
                return new wzd();
            case 7:
                yy7[] yy7VarArr3 = ScheduledSendPickerViewModel.p;
                return cxi.a(0);
            case 8:
                yy7[] yy7VarArr4 = ScheduledSendPickerViewModel.p;
                return cxi.b(0);
            case 9:
                return Long.valueOf(TimeUnit.SECONDS.toSeconds(1L));
            case 10:
                AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = d3e.w0;
                return qqg.a;
            case 11:
                return new tic(x8b.K);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                yy7[] yy7VarArr5 = ServerHostBottomSheet.K0;
                return new r77();
            case 13:
                yy7[] yy7VarArr6 = ServerPortBottomSheet.F0;
                return new u6c();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                yy7[] yy7VarArr7 = SettingMediaScreen.X;
                return f1e.SETTINGS_MEDIA;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yy7[] yy7VarArr8 = SettingMediaScreen.X;
                lpe lpeVar = lpe.a;
                return new sle(lpeVar.getAccessor().d(8), lpeVar.getAccessor().d(60), lpeVar.getAccessor().d(282), lpeVar.getAccessor().d(48));
            case 16:
                yy7[] yy7VarArr9 = SettingRingtoneScreen.Z;
                return f1e.SETTINGS_RINGTONE;
            case LangUtils.HASH_SEED /* 17 */:
                yy7[] yy7VarArr10 = SettingRingtoneScreen.Z;
                return new dna(ire.a.getAccessor().d(61));
            case 18:
                int i = lvd.a;
                return new ome();
            case 19:
                yy7[] yy7VarArr11 = SettingsBlacklistScreen.Y;
                bqe bqeVar2 = bqe.a;
                return new lne(new mq0(bqeVar2.getAccessor().d(49), bqeVar2.a()));
            case 20:
                return new Matrix();
            case 21:
                return Collections.singletonList(lke.APPEARANCE);
            case 22:
                return Collections.singletonList(lke.ESIA_CONNECT);
            case 23:
                return Collections.singletonList(lke.INVITE_FRIENDS);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return ve3.j(lke.NOTIFICATIONS, lke.PRIVACY, lke.MESSAGES, lke.SAVED_MESSAGES, lke.FOLDERS);
            case 25:
                o98 o98VarD = ve3.d();
                o98VarD.add(lke.SUPPORT);
                o98VarD.add(lke.ABOUT);
                return ve3.a(o98VarD);
            case 26:
                o98 o98VarD2 = ve3.d();
                o98VarD2.add(lke.BATTERY);
                o98VarD2.add(lke.STORAGE);
                return ve3.a(o98VarD2);
            case 27:
                yy7[] yy7VarArr12 = SettingsListScreen.A0;
                return new mx3(woe.a.getAccessor().d(47));
            case 28:
                yy7[] yy7VarArr13 = SettingsStorageScreen.X;
                wre wreVar = wre.a;
                return new nse(wreVar.getAccessor().d(8), wreVar.getAccessor().d(59), wreVar.getAccessor().d(324), wreVar.getAccessor().d(37), (Context) wreVar.getAccessor().c(12));
            default:
                int i2 = SetupPinCodeScreen.d;
                return new rse();
        }
    }

    public /* synthetic */ efd(ScheduledSendPickerDialogFragment scheduledSendPickerDialogFragment) {
        this.a = 6;
    }
}
