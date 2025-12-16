package com.avito.android;

import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;

/* compiled from: UserAdvertFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/N2;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_user-advert"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public class N2 extends A0 {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f67352m;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A0.a f67353b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A0.a f67354c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A0.a f67355d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A0.a f67356e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final A0.a f67357f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final A0.a f67358g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final A0.a f67359h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final A0.a f67360i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final A0.a f67361j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final A0.a f67362k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final A0.a f67363l;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(N2.class, "realtyOwnerVerificationSupport", "getRealtyOwnerVerificationSupport()Lcom/avito/android/toggle/Feature;", 0);
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        f67352m = new kotlin.reflect.n[]{n0Var.i(h0Var), com.akita.compose.theme.re23.style.C0.k(N2.class, "myAdvertPromoBlockFeedSupport", "getMyAdvertPromoBlockFeedSupport()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(N2.class, "publishCsatUxFeedback", "getPublishCsatUxFeedback()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(N2.class, "servicesVerificationActions", "getServicesVerificationActions()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(N2.class, "myAdvertDetailsMultiItems", "getMyAdvertDetailsMultiItems()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(N2.class, "showTipsGroup", "getShowTipsGroup()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(N2.class, "advertFaqSurvey", "getAdvertFaqSurvey()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(N2.class, "advertScrollTrackEvents", "getAdvertScrollTrackEvents()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(N2.class, "userAdvertStatsBeduinBlock", "getUserAdvertStatsBeduinBlock()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(N2.class, "closeReasonRedesign", "getCloseReasonRedesign()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(N2.class, "notProcessedAndroidOnlyFields", "getNotProcessedAndroidOnlyFields()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public N2() {
        Owners owners = Owners.f210506k1;
        Boolean bool = Boolean.TRUE;
        this.f67353b = A0.u(this, "Поддержка блоков верификации собственника в SS и LTR (+ бейджи)", "realtyOwnerVerificationSupport", bool, false, 0, owners, 56);
        this.f67354c = A0.u(this, "Поддержа ленты промоблоков на селлерской карточке", "myAdvertPromoBlockFeedSupport", bool, false, 0, owners, 56);
        Owners owners2 = Owners.f210494h1;
        Boolean bool2 = Boolean.FALSE;
        this.f67355d = A0.u(this, "Запуск опросника об удовлетворенности процессом подачи", "sx_publish_csat_uxfeedback", bool2, false, 0, owners2, 56);
        this.f67356e = A0.u(this, "Экран предложения пройти верификацию и получить Профессиональный профиль", "servicesVerificationActions", bool, false, 0, Owners.f210403F, 56);
        this.f67357f = A0.u(this, "Поддержка мультиайтемов на карточке селлера", "myAdvertDetailsMultiItemsEnabled", bool, false, 0, Owners.f210457X, 56);
        this.f67358g = A0.u(this, "Показывать подсказку для объявлений в разделе \"Мои объявления\"", "userAdvertShowTipsGroup", bool, false, 0, Owners.f210389A0, 56);
        this.f67359h = A0.u(this, "FAQ опрос по айтему после подачи обьявления", "advertFaqSurvey", bool, false, 0, Owners.f210393B3, 56);
        Owners owners3 = Owners.f210450U2;
        this.f67360i = A0.u(this, "Трекаем скролл на карточке объявления", "userAdvertScrollTrackEvents", bool, false, 0, owners3, 56);
        this.f67361j = A0.u(this, "Включить бедуин блок статистики, вместо нативного", "userAdvertStatsBeduinBlock", bool2, false, 0, Owners.f210546u3, 56);
        this.f67362k = A0.u(this, "Редизайн закрытия объявления", "close_reason_redesign", bool, false, 0, Owners.f210456W2, 56);
        this.f67363l = A0.u(this, "Отключить обработку полей advertOptions, features в карточке селлера (поля, которых нет на iOS)", "not_processed_android_only_fields", bool, false, 0, owners3, 56);
    }

    @Y61.k
    public final DE0.a<Boolean> v() {
        kotlin.reflect.n<Object> nVar = f67352m[9];
        return this.f67362k.a();
    }
}
