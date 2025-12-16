package com.avito.android.advertising.splitter.features;

import Y61.k;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: CommercialInternalFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/splitter/features/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class a extends A0 {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f88526i;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f88527b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f88528c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f88529d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final A0.a f88530e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final A0.a f88531f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final A0.a f88532g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final A0.a f88533h;

    static {
        h0 h0Var = new h0(a.class, "adDisableYandexCancellation", "getAdDisableYandexCancellation()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f88526i = new n[]{n0Var.i(h0Var), C0.k(a.class, "adRetryInPixelService", "getAdRetryInPixelService()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "adBadgeRedesignYandexFeedbackWithCustomDesign", "getAdBadgeRedesignYandexFeedbackWithCustomDesign()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "adBadgeRedesignYandexWideSponsoredView", "getAdBadgeRedesignYandexWideSponsoredView()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "adCalcArea", "getAdCalcArea()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "disableLoadedAdHolderInAdvert", "getDisableLoadedAdHolderInAdvert()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "adBdUIUseV2BannerFormatInSearch", "getAdBdUIUseV2BannerFormatInSearch()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public a() {
        Owners owners = Owners.f210488g;
        Boolean bool = Boolean.FALSE;
        this.f88527b = A0.u(this, "Отключаем отмену загрузки yandex рекламы", "adDisableYandexCancellation", bool, true, 0, owners, 40);
        this.f88528c = A0.u(this, "Переотправка пикселей", "retryInPixelService", bool, true, 0, owners, 40);
        this.f88529d = A0.u(this, "Кастомный Yandex Feedback дизайн в тесте с беджом", "adBadgeRedesignYandexFeedbackWithCustomDesign", bool, false, 0, owners, 56);
        this.f88530e = A0.u(this, "Yandex широким рекламным беджом в тесте с беджом", "adBadgeRedesignYandexWideSponsoredView", bool, false, 0, owners, 56);
        this.f88531f = A0.u(this, "Считаем занимаемую площадь экрана рекламным баннером", "adCalcArea", bool, false, 0, owners, 56);
        this.f88532g = A0.u(this, "Выключаем рекламный кеш в карточке товара", "disableLoadedAdHolderInAdvert", bool, false, 0, owners, 56);
        this.f88533h = A0.u(this, "Включаем v2 формат для рекламных водопадов в поиске", "adBdUIUseV2BannerFormatInSearch", bool, false, 0, owners, 56);
    }
}
