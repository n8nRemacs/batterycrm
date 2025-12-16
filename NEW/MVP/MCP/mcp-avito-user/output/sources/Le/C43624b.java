package lE;

import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: StrFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LlE/b;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_str"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lE.b, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C43624b extends A0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f413639o;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A0.a f413640b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A0.a f413641c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A0.a f413642d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A0.a f413643e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final A0.a f413644f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final A0.a f413645g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final A0.a f413646h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final A0.a f413647i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final A0.a f413648j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final A0.a f413649k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final A0.a f413650l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final A0.a f413651m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final A0.a f413652n;

    static {
        h0 h0Var = new h0(C43624b.class, "strShowNewGallery", "getStrShowNewGallery()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f413639o = new n[]{n0Var.i(h0Var), C0.k(C43624b.class, "carRentalCalendarRangeFixEnable", "getCarRentalCalendarRangeFixEnable()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C43624b.class, "strGetUpdatedTimeApicoV3", "getStrGetUpdatedTimeApicoV3()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C43624b.class, "disableParsingOldGuestsSelectorDeepLink", "getDisableParsingOldGuestsSelectorDeepLink()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C43624b.class, "strNonRefundDiscount", "getStrNonRefundDiscount()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C43624b.class, "showTravelPaymentToggles", "getShowTravelPaymentToggles()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C43624b.class, "show12MonthsInCalendars", "getShow12MonthsInCalendars()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C43624b.class, "showRedesignAdvertHotelOffers", "getShowRedesignAdvertHotelOffers()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C43624b.class, "webSocketsOnBookingScreenWithEventBus", "getWebSocketsOnBookingScreenWithEventBus()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C43624b.class, "useNewSellerOrdersScreen", "getUseNewSellerOrdersScreen()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C43624b.class, "useApicoGetOffer", "getUseApicoGetOffer()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C43624b.class, "strCalendarDataApicoV3", "getStrCalendarDataApicoV3()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(C43624b.class, "useAdaptiveImageHotelAvailableRooms", "getUseAdaptiveImageHotelAvailableRooms()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C43624b() {
        Owners owners = Owners.f210537s0;
        Boolean bool = Boolean.TRUE;
        this.f413640b = A0.u(this, "Показывать новую галерею в BX карточке", "strShowNewGallery", bool, false, 0, owners, 56);
        Owners owners2 = Owners.f210511l3;
        this.f413641c = A0.u(this, "Включаем фикс проверки доступности сегодняшней даты для бронирования - будет доступна", "carRentalCalendarRangeFixEnable", bool, false, 0, owners2, 56);
        this.f413642d = A0.u(this, "Перевод ручки str/booking/getUpdatedTime на контракт ApicoV3", "strGetUpdatedTimeApicoV3", bool, false, 0, owners2, 56);
        Boolean bool2 = Boolean.FALSE;
        this.f413643e = A0.u(this, "Выключаем парсинг локального для Android диплинка /guests-selector", "disableParsingOldGuestsSelectorDeepLink", bool2, false, 0, owners2, 56);
        Owners owners3 = Owners.f210523o3;
        this.f413644f = A0.u(this, "Скидка за невозвратное бронирование - обновления на страничке айтэма", "strNonRefundDiscount", bool, true, 0, owners3, 40);
        this.f413645g = A0.u(this, "Отображать расширенный блок с выбором оплаты и скидок", "showTravelPaymentToggles", bool, true, 0, Owners.f210408G3, 40);
        this.f413646h = A0.u(this, "Показываем 12 месяцев в шторке календаря поисковых фильтров", "show12MonthsInCalendars", bool, true, 0, owners3, 40);
        this.f413647i = A0.u(this, "Показывать редизайн виджета офферов отеля на карточке айтема", "showRedesignAdvertHotelOffers", bool, false, 0, owners, 56);
        this.f413648j = A0.u(this, "Реализация WebSocket на Экране Бронирования", "webSocketsOnBookingScreenWithEventBus", bool, false, 0, owners2, 56);
        this.f413649k = A0.u(this, "Использовать новый экран селлерских броней", "useNewSellerOrdersScreen", bool, false, 0, owners, 56);
        this.f413650l = A0.u(this, "Использовать апико ручку для получения оффера (getOffer)", "useApicoGetOffer", bool, false, 0, owners, 56);
        this.f413651m = A0.u(this, "Перевод ручки 1/str/item/booking/calendar/data на контракт ApicoV3", "strCalendarDataApicoV3", bool, false, 0, owners2, 56);
        this.f413652n = A0.u(this, "Использовать адаптивные картинки в галерее номера", "useAdaptiveImageHotelAvailableRooms", bool2, false, 0, owners, 56);
    }

    @Y61.k
    public final DE0.a<Boolean> v() {
        n<Object> nVar = f413639o[0];
        return this.f413640b.a();
    }

    @Y61.k
    public final DE0.a<Boolean> w() {
        n<Object> nVar = f413639o[8];
        return this.f413648j.a();
    }
}
