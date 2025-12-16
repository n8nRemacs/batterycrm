package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final class qu4 implements io7 {
    public final /* synthetic */ int a;

    public /* synthetic */ qu4(int i) {
        this.a = i;
    }

    @Override // defpackage.io7
    public final Object a(w5 w5Var) {
        switch (this.a) {
            case 0:
                pb3 pb3Var = (pb3) w5Var.c(46);
                r5g r5gVar = new r5g("Разрешить логирование sensitive информации");
                pe8 pe8Var = (pe8) pb3Var;
                b4 b4Var = pe8Var.T0;
                yy7 yy7Var = pe8.U0[33];
                return new ed8(r5gVar, new tv(0, 3, f9a.class, (a4) b4Var.o, SdkMetricStatEvent.VALUE_KEY, "getValue()Ljava/lang/Object;"), new z11(6, pe8Var), 0, 24);
            case 1:
                pb3 pb3Var2 = (pb3) w5Var.c(46);
                return new ed8(new n5g(j3d.oneme_settings_iar_time_condition), new tv(0, 4, pb3.class, pb3Var2, "isDisableInAppReviewTimeCondition", "isDisableInAppReviewTimeCondition()Z"), new ru4(pb3Var2, 0), 0, 24);
            case 2:
                pb3 pb3Var3 = (pb3) w5Var.c(46);
                return new ed8(new n5g(j3d.oneme_settings_iar_market_build_condition), new tv(0, 5, pb3.class, pb3Var3, "isEnableInAppReviewNotFromMarketBuild", "isEnableInAppReviewNotFromMarketBuild()Z"), new ru4(pb3Var3, 1), 0, 24);
            case 3:
                pb3 pb3Var4 = (pb3) w5Var.c(46);
                return new ed8(new n5g(j3d.oneme_settings_web_app_ssl), new tv(0, 6, pb3.class, pb3Var4, "isDisableWebAppSsl", "isDisableWebAppSsl()Z"), new ru4(pb3Var4, 2), 0, 24);
            case 4:
                return new e31(1);
            case 5:
                return new efe("Включить просмотры в каналах", PmsKey.f155viewscountenabled, false);
            case 6:
                return new efe(PmsKey.landscape);
            case 7:
                return new efe("Включить новую версию экрана с картой", PmsKey.f75locationmapwidgetenabled, false);
            case 8:
                return new pfe(PmsKey.f32chatlistsubtitlever, 0L, new String[]{"Версия EllipsizeEndTextView в списке чатов", "0 - LegacyEllipsizeEndTextView", "1 - NewEllipsizeEndTextView"}, null, 20);
            case 9:
                return new yre(2);
            case 10:
                return new ak7(w5Var.d(12), w5Var.d(46), w5Var.d(35), w5Var.d(81));
            case 11:
                return new dfe(w5Var.d(116), (pb3) w5Var.c(46));
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new oue(w5Var.d(12));
            case 13:
                return new hv4();
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new y7g(w5Var.d(8));
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new t17(w5Var.d(12), w5Var.d(111), w5Var.d(8), w5Var.d(454));
            case 16:
                return new gd(w5Var.d(454), w5Var.d(199), 0);
            case LangUtils.HASH_SEED /* 17 */:
                return new gd(w5Var.d(97), w5Var.d(398), 1);
            case 18:
                return new efe(PmsKey.f141streamablemp4);
            case 19:
                return new efe(PmsKey.f66informerenabled);
            case 20:
                return hw5.b;
            case 21:
                return new z29(2);
            case 22:
                return new yre(3);
            case 23:
                bwf bwfVarD = w5Var.d(61);
                bwf bwfVarD2 = w5Var.d(347);
                bwf bwfVarD3 = w5Var.d(46);
                bwf bwfVarD4 = w5Var.d(8);
                bwf bwfVarD5 = w5Var.d(12);
                bwf bwfVarD6 = w5Var.d(215);
                w5Var.d(109);
                return new gz(bwfVarD, bwfVarD2, bwfVarD3, bwfVarD4, bwfVarD5, bwfVarD6, w5Var.d(346), w5Var.d(HttpStatus.SC_GONE), w5Var.d(534));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return aw6.a;
            case 25:
                return new z29(3);
            case 26:
                zh7 zh7Var = (zh7) w5Var.c(456);
                zh7Var.getClass();
                if (((fxa) qh7.a.getAccessor().c(31)).b()) {
                    return zh7Var.c;
                }
                zh7Var.c = null;
                return null;
            case 27:
                return (k0a) w5Var.c(579);
            case 28:
                return new yre(4);
            default:
                return new ks6(w5Var.d(123), w5Var.d(41));
        }
    }
}
