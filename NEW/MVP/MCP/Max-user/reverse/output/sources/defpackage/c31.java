package defpackage;

import android.content.Context;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class c31 implements io7 {
    public final /* synthetic */ int a;

    public /* synthetic */ c31(int i) {
        this.a = i;
    }

    @Override // defpackage.io7
    public final Object a(w5 w5Var) {
        switch (this.a) {
            case 0:
                return new efe("📞 Админские настройки в групповых звонках", PmsKey.gcas, false);
            case 1:
                return new efe("📞 Зал ожидания в групповых звонках", PmsKey.gcwre, false);
            case 2:
                return new efe(new r5g("📞 Логгирование WebRtc в звонках"), PmsKey.f22callssdkwebrtclogs, false);
            case 3:
                return new efe(new r5g("📞 Включить режим NoHost"), PmsKey.f19callssdkenablenohost, false);
            case 4:
                bwf bwfVarD = w5Var.d(46);
                return new ed8(new r5g("📞 Debug-menu в звонке"), new tv(0, 1, pb3.class, (pb3) bwfVarD.getValue(), "isCallsDebugMenuEnabled", "isCallsDebugMenuEnabled()Z"), new d31(bwfVarD, 0), kwc.ic_call_22, 16);
            case 5:
                return x91.a;
            case 6:
                return new yre(1);
            case 7:
                return (ui8) w5Var.c(121);
            case 8:
                return new pfe(PmsKey.f13callpermissionsinterval, 0L, new String[]{"0 - Используется старая логика", "> 0 - Время в секундах, через которое будет осуществлена проверка на включенные уведомления"}, null, 20);
            case 9:
                return new tf2(w5Var.d(48), w5Var.d(220));
            case 10:
                return new efe(PmsKey.f28chatanim);
            case 11:
                return new efe("📞 Изменение порядка иконок звонков в чате", PmsKey.f11calliconsreorder, false);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new efe("📞 Включение видео-звонка в групповых чатах", PmsKey.f152videogroupcall, false);
            case 13:
                return new ux5((tw0) w5Var.c(49), (lzf) w5Var.c(8));
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new odc(w5Var.d(48), 1);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new efe("Включить поворот Media во viewer", PmsKey.f94mediaviewerrotationenabled, false);
            case 16:
                return new efe("Включить фулвью поста во viewer", PmsKey.f30chatmediascrollablecaptionenabled, false);
            case LangUtils.HASH_SEED /* 17 */:
                return new z29(6);
            case 18:
                return new efe("Единое видео в WebView в чате", PmsKey.f67inlineevplayer, false);
            case 19:
                return new efe("Автоплей видео в WebView", PmsKey.f55forceplayembed, false);
            case 20:
                return new xj6(w5Var.d(558), w5Var.d(78), w5Var.d(8), (a84) w5Var.c(84));
            case 21:
                return y63.a;
            case 22:
                return new z29(5);
            case 23:
                return new x63((Context) w5Var.c(12), (f8c) w5Var.c(HttpStatus.SC_PARTIAL_CONTENT), (h8c) w5Var.c(HttpStatus.SC_MULTI_STATUS), w5Var.d(48));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new x6e((Context) w5Var.c(12), w5Var.d(HttpStatus.SC_GONE), w5Var.d(HttpStatus.SC_PRECONDITION_FAILED), w5Var.d(455), w5Var.d(109), w5Var.d(HttpStatus.SC_MULTI_STATUS), w5Var.d(46), w5Var.d(48));
            case 25:
                return xj3.b;
            case 26:
                return new efe("Включить получение жалоб с сервера", PmsKey.f136serversidecomplainsenabled, false);
            case 27:
                return new efe("Включить жалобы на канал", PmsKey.f26channelscomplaintenabled, false);
            case 28:
                return new q14(w5Var.d(47), 0);
            default:
                return new pfe(PmsKey.f98minloglevel, 2L, new String[]{"Вступает в силу после рестарта", "2 - V", "3 - D", "4 - I", "5 - E", "6 - A"}, null, 20);
        }
    }
}
