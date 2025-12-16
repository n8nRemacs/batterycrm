package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.arch.Widget;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class bya implements io7 {
    public final /* synthetic */ int a;

    public /* synthetic */ bya(int i) {
        this.a = i;
    }

    @Override // defpackage.io7
    public final Object a(w5 w5Var) {
        switch (this.a) {
            case 0:
                return new ccb((Widget) ((b3b) w5Var.c(657)).f().w());
            case 1:
                return new t78(w5Var.d(140));
            case 2:
                return tya.a;
            case 3:
                return new mjd(w5Var.d(HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE), w5Var.d(46), w5Var.d(480), w5Var.d(481), w5Var.d(12));
            case 4:
                return new efe("One Video Player", PmsKey.f118onevideoplayer, false);
            case 5:
                pb3 pb3Var = (pb3) w5Var.c(46);
                return new ed8(new r5g("OneVideo: отображение debug info у видео"), new tv(0, 8, pb3.class, pb3Var, "isVideoDebugViewAvailable", "isVideoDebugViewAvailable()Z"), new ru4(pb3Var, 3), yud.T0, 16);
            case 6:
                return new q0h(w5Var.d(88), w5Var.d(139));
            case 7:
                return new odc(w5Var.d(48), 0);
            case 8:
                pb3 pb3Var2 = (pb3) w5Var.c(46);
                return new ed8(new r5g("Отображение debug info в профиле"), new tv(0, 9, pb3.class, pb3Var2, "isDebugProfileInfoEnabled", "isDebugProfileInfoEnabled()Z"), new ru4(pb3Var2, 4), yud.T0, 16);
            case 9:
                return new bfc(w5Var.d(47), 0);
            case 10:
                return new efe("Пункт \"Тип канала и ссылка\" (при редактировании канала)", PmsKey.f43editchanneltypescreenenabled, false);
            case 11:
                return new efe("Пункт \"Тип чата и ссылка\" (при редактировании чата)", PmsKey.f44editchattypescreenenabled, false);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new efe("Включить права на управления ссылкой в чате", PmsKey.f29chatinvitelinkpermissionsenabled, false);
            case 13:
                return new elc(w5Var.d(HttpStatus.SC_PARTIAL_CONTENT), w5Var.d(208), w5Var.d(123), w5Var.d(48), w5Var.d(46), w5Var.d(47));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return nrc.b;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return (ui8) w5Var.c(294);
            case 16:
                return (ui8) w5Var.c(317);
            case LangUtils.HASH_SEED /* 17 */:
                return (ui8) w5Var.c(343);
            case 18:
                return (ui8) w5Var.c(354);
            case 19:
                return (ui8) w5Var.c(367);
            case 20:
                return new lya(w5Var, 1);
            case 21:
                return (ui8) w5Var.c(HttpStatus.SC_PARTIAL_CONTENT);
            case 22:
                return (ui8) w5Var.c(219);
            case 23:
                return (ui8) w5Var.c(150);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return (ui8) w5Var.c(229);
            case 25:
                return (ui8) w5Var.c(239);
            case 26:
                return (ui8) w5Var.c(241);
            case 27:
                return (ui8) w5Var.c(149);
            case 28:
                return (ui8) w5Var.c(290);
            default:
                return new rtg(w5Var.d(79), w5Var.d(61), w5Var.d(8));
        }
    }
}
