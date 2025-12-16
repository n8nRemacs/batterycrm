package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.android.prefs.PmsKey;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes.dex */
public final class e implements io7 {
    public final /* synthetic */ int a;

    public /* synthetic */ e(int i) {
        this.a = i;
    }

    @Override // defpackage.io7
    public final Object a(w5 w5Var) {
        switch (this.a) {
            case 0:
                return h.a;
            case 1:
                return new pfe(PmsKey.f91mediaorder, 0L, new String[]{"0 - Медиа всегда снизу", "1 - Медиа всегда сверху", "2 - Медиа сверху только в постах каналов", "3 - Порядок управляется с бека"}, null, 20);
            case 2:
                return new efe("Отображение и отправка markdown quote элемента", PmsKey.f124quotesenabled, false);
            case 3:
                return new efe("Меню форматирования для miui всех версий", PmsKey.f101miuimenuenabled, false);
            case 4:
                return new efe("search-loader-v2-enabled", PmsKey.f132searchloaderv2enabled, false);
            case 5:
                return new efe("media-playlist-enabled", PmsKey.f92mediaplaylistenabled, false);
            case 6:
                return new efe("show-warning-links`", PmsKey.f139showwarninglinks, false);
            case 7:
                return new efe(PmsKey.f145suspendvideoconverter);
            case 8:
                return pq.a;
            case 9:
                return new z29(1);
            case 10:
                return (ui8) w5Var.c(462);
            case 11:
                return new efe("📞 Чат в групповом звонке", PmsKey.f58groupcallchatsupport, false);
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                return new efe("📞 Переход из 1-1 звонка в групповой", PmsKey.f56gcfromp2p, false);
            case 13:
                return new efe("📞 Преднастройки группового звонка по ссылке", PmsKey.f57gclinkpresettings, false);
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                return new efe("📞 Кастомный ригтон входящего звонка", PmsKey.f10callcustomringtone, false);
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                return new efe("📞 Локальный бродкаст для действий в ПиП", PmsKey.f74localpipbroadcast, false);
            case 16:
                return new e31(0);
            case LangUtils.HASH_SEED /* 17 */:
                return new efe("📞 Быстрый старт через клиентский бекенд", PmsKey.cfs, false);
            case 18:
                return new efe("Включить KeywordSpotter", PmsKey.f16callsloadkwsbysdkenabled, false);
            case 19:
                return new efe("📞 Удалять не-Opus аудиокодеки из SDP", PmsKey.f21callssdkremovenonopusaudiocodecs, false);
            case 20:
                return new efe("📞 Включить WebTransport", PmsKey.f23callssdkwtenabled, false);
            case 21:
                return r61.a;
            case 22:
                return new pfe(PmsKey.f20callssdkmajb, 0L, null, new r5g("📞 Кастомный AJB"), 12);
            case 23:
                return new efe(new r5g("📞 Последовательное переключение аудио устройств"), PmsKey.f17callssdkamspeakerfix, false);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                return new pfe(PmsKey.f46enableunknowncontactbottomsheet, 0L, new String[]{"0 - не показывать опрос", "1 - кнопки Добавить в контакты и Заблокировать", "2 - кнопки Всё в порядке и Заблокировать"}, new r5g("📞 Отображение индикатора неизвестного контакта"), 4);
            case 25:
                return new pfe(PmsKey.f129ringtoneplayerfocus, 0L, new String[]{"0 - запрашивать временный фокус (старое поведение)", "1 - запрашивать постоянный фокус", "2 - игнорировать сообщение об изменении фокуса"}, new r5g("📞 Настройка аудио фокуса плеера рингтонов"), 4);
            case 26:
                return new efe(new r5g("📞 Скрывать уведомление при открытии экрана входящего звонка"), PmsKey.f60hideincomingcallnotif, false);
            case 27:
                return new efe("📞 Групповые звонки", PmsKey.gce, false);
            case 28:
                return new efe("📞 Групповые звонки: пермишен участников чата", PmsKey.gcmpe, false);
            default:
                return new efe("📞 Запись звонка", PmsKey.grse, false);
        }
    }
}
