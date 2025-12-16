package com.avito.android;

import com.avito.android.A0;
import com.avito.android.beduin.common.component.cart_item.BeduinCartItemModel;
import com.avito.android.ownership.Owners;
import com.avito.android.util.InterfaceC35950u;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: AdvertisingFeatures.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/i;", "Lcom/avito/android/A0;", "_avito-discouraged_avito-feature_advertising"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.i, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C30828i extends A0 {

    /* renamed from: k, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f164256k;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35950u f164257b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A0.a f164258c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A0.a f164259d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A0.a f164260e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final A0.a f164261f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final A0.a f164262g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final A0.a f164263h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final A0.a f164264i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final A0.a f164265j;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(C30828i.class, "yandexDebugIndicator", "getYandexDebugIndicator()Lcom/avito/android/toggle/Feature;", 0);
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        f164256k = new kotlin.reflect.n[]{n0Var.i(h0Var), com.akita.compose.theme.re23.style.C0.k(C30828i.class, "advTestMode", "getAdvTestMode()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30828i.class, "advTestAppInstallMode", "getAdvTestAppInstallMode()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30828i.class, "trackAdsErrorLoading", "getTrackAdsErrorLoading()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30828i.class, "buzzoolaRetryOnConnectionFailure", "getBuzzoolaRetryOnConnectionFailure()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30828i.class, "adKeepTrackedEvents", "getAdKeepTrackedEvents()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30828i.class, "viewEventNewTriggerTime", "getViewEventNewTriggerTime()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30828i.class, "brandspaceEntryPointDebug", "getBrandspaceEntryPointDebug()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30828i.class, "brandspaceMVI", "getBrandspaceMVI()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C30828i(@Y61.k InterfaceC35950u interfaceC35950u) {
        this.f164257b = interfaceC35950u;
        Owners owners = Owners.f210488g;
        Boolean bool = Boolean.FALSE;
        this.f164258c = A0.u(this, "Включает Yandex Debug режим", "yandexDebugIndicator", bool, false, 0, owners, 40);
        A0.u(this, "Показывать определенную рекламу для тестирования", "advTestMode", new OptionSet(BeduinCartItemModel.DISABLED_STRING, C42745f0.U(BeduinCartItemModel.DISABLED_STRING, "yandex", "myTarget", "buzzoola_direct", "buzzoola_premium", "buzzoola_premium_v2", "buzzoola_profilePromo", "avito", "random")), false, 0, owners, 40);
        this.f164259d = A0.u(this, "Показывать дизайн рекламы как app install", "advTestAppInstallMode", bool, false, 0, owners, 40);
        this.f164260e = A0.u(this, "Отправка NonFatalError's при ошибке загрузки рекламы", "track_ads_error_loading", bool, true, 0, owners, 40);
        Boolean bool2 = Boolean.TRUE;
        this.f164261f = A0.u(this, "Автоматически перезагружать рекламу в случае ошибки", "buzzoolaRetryOnConnectionFailure", bool2, true, 0, owners, 40);
        this.f164262g = A0.u(this, "Хранить состояние о затреканных событиях", "adKeepTrackedEvents", bool, true, 0, owners, 40);
        this.f164263h = A0.u(this, "ADV-6733: Шлём событие просмотра через 1 сек", "viewEventNewTriggerTime", bool, true, 0, owners, 40);
        this.f164264i = A0.u(this, "Отладка логирования точки входа в Brandspace, вероятность логирования 50%", "brandspaceEntryPointAnalyticDebug", bool, false, 0, owners, 40);
        this.f164265j = A0.u(this, "переход на mvi в brandspace", "brandspace_mvi", bool2, true, 0, owners, 40);
    }
}
