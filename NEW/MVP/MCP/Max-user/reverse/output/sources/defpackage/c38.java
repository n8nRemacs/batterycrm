package defpackage;

import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import android.util.Patterns;
import java.util.ArrayList;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.login.LoginScreen;
import one.me.mediapicker.MediaPickerScreen;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final /* synthetic */ class c38 implements cm6 {
    public final /* synthetic */ int a;

    public /* synthetic */ c38(int i) {
        this.a = i;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        int i = 13;
        int i2 = 1;
        switch (this.a) {
            case 0:
                return t1b.a.d();
            case 1:
                int i3 = LinkInterceptorWidget.d;
                return (t78) t1b.a.getAccessor().c(677);
            case 2:
                return Patterns.WEB_URL;
            case 3:
                return Patterns.WEB_URL;
            case 4:
                return new MediaMetadataRetriever();
            case 5:
                hh8 hh8Var = hh8.a;
                return new z70(hh8Var.getAccessor().d(88), hh8Var.getAccessor().d(39));
            case 6:
                hh8 hh8Var2 = hh8.a;
                return new w70(hh8Var2.getAccessor().d(88), hh8Var2.getAccessor().d(39));
            case 7:
                return new n70(hh8.a.getAccessor().d(39));
            case 8:
                yy7[] yy7VarArr = LoginScreen.c;
                return new ii8(hh8.a.getAccessor().d(10));
            case 9:
                return new tp5(0);
            case 10:
                return new tp5(0);
            case 11:
                yy7[] yy7VarArr2 = LogsViewerScreen.X;
                yi8 yi8Var = yi8.a;
                return new sj8((l6b) yi8Var.getAccessor().c(555), (lzf) yi8Var.getAccessor().c(8));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new zya(u3d.oneme_main_profile_title, new wya(new om8(i2), new wm7(i)), m6b.j, ":settings", m6b.i);
            case 13:
                yy7[] yy7VarArr3 = MediaBarPermissionWidget.Y;
                return new kt8();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                yy7[] yy7VarArr4 = MediaBarWidget.c1;
                uv2 uv2Var = uv2.a;
                return new buc(new enb((d1e) uv2Var.getAccessor().c(443), 6, ((q2b) uv2Var.getDispatchers()).b()), new vxd((d1e) uv2Var.getAccessor().c(443), ((q2b) uv2Var.getDispatchers()).b()), (sd8) uv2Var.getAccessor().c(493), (qx5) uv2Var.getAccessor().c(137), (d1e) uv2Var.getAccessor().c(443), (u6b) uv2Var.getAccessor().c(399), uv2Var.getDispatchers(), (rt5) uv2Var.getAccessor().c(48));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                yy7[] yy7VarArr5 = MediaBarWidget.c1;
                return new eb9();
            case 16:
                yy7[] yy7VarArr6 = MediaBarWidget.c1;
                return new dbe((de8) uv2.a.getAccessor().c(492), new sae(false, true));
            case LangUtils.HASH_SEED /* 17 */:
                return new Path();
            case 18:
                return new float[8];
            case 19:
                return new byte[131072];
            case 20:
                yy7[] yy7VarArr7 = MediaPickerScreen.B0;
                return Boolean.FALSE;
            case 21:
                yy7[] yy7VarArr8 = MediaPickerScreen.B0;
                return new mp6(new c38(20));
            case 22:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                return paint;
            case 23:
                hd5 hd5Var = hd5.a;
                return new m11(i, new ic9(hd5Var, hd5Var));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                float[] fArr = new float[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    fArr[i4] = vw4.d().getDisplayMetrics().density * 16.0f;
                }
                return fArr;
            case 25:
                return new gq3(i2);
            case 26:
                return new ArrayList(1);
            case 27:
                return new u74(vw4.d().getDisplayMetrics().density * 4.0f);
            case 28:
                return new u74(vw4.d().getDisplayMetrics().density * 76.0f);
            default:
                return new w27();
        }
    }
}
