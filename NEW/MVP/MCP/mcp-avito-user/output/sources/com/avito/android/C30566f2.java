package com.avito.android;

import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import com.avito.android.util.feature.OptionSet;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: SbcFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/f2;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_sbc"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.f2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C30566f2 extends A0 {

    /* renamed from: o, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f155067o;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A0.a f155068b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A0.a f155069c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A0.a f155070d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A0.a f155071e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final A0.a f155072f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final A0.a f155073g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final A0.a f155074h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final A0.a f155075i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final A0.a f155076j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final A0.a f155077k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final A0.a f155078l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final A0.a f155079m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final A0.a f155080n;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(C30566f2.class, "sbcNewTrxFlow", "getSbcNewTrxFlow()Lcom/avito/android/toggle/Feature;", 0);
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        f155067o = new kotlin.reflect.n[]{n0Var.i(h0Var), com.akita.compose.theme.re23.style.C0.k(C30566f2.class, "sbcOnboardingPlatformSellersCard", "getSbcOnboardingPlatformSellersCard()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30566f2.class, "sbcInVasFlow", "getSbcInVasFlow()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30566f2.class, "sbcAutoDispatchesSupport", "getSbcAutoDispatchesSupport()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30566f2.class, "crmRecommendationBlocksSupport", "getCrmRecommendationBlocksSupport()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30566f2.class, "sbcDispatchEdit", "getSbcDispatchEdit()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30566f2.class, "sbcAutoDispatchCreationSupport", "getSbcAutoDispatchCreationSupport()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30566f2.class, "crmNotificationCenterBeduinRedesign", "getCrmNotificationCenterBeduinRedesign()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30566f2.class, "crmNotificationCenterBeduinRedesignAbGroup", "getCrmNotificationCenterBeduinRedesignAbGroup()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30566f2.class, "sbcUxFeedbackConfiguratorCloseCampaign", "getSbcUxFeedbackConfiguratorCloseCampaign()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30566f2.class, "sbcFastChipsOnboardingEnabled", "getSbcFastChipsOnboardingEnabled()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30566f2.class, "sbcAutodispatchForecast", "getSbcAutodispatchForecast()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C30566f2.class, "crmEmailChangeAndConfirmSupport", "getCrmEmailChangeAndConfirmSupport()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C30566f2() {
        Owners owners = Owners.f210436Q;
        Boolean bool = Boolean.TRUE;
        this.f155068b = A0.u(this, "Enables new trx flow in sbc", "sbcNewTrxFlow", bool, false, 0, owners, 56);
        this.f155069c = A0.u(this, "Enable onboarding platform on sellers card", "sbcOnboardingPlatformSellersCard", bool, false, 0, owners, 56);
        this.f155070d = A0.u(this, "Enables sbc step in vas flow configurator", "sbcInVasFlow", bool, false, 0, owners, 56);
        this.f155071e = A0.u(this, "Support sbc auto dispatches", "sbcAutoDispatchesSupport", bool, false, 0, owners, 56);
        Owners owners2 = Owners.f210431O;
        this.f155072f = A0.u(this, "Enable to open bx landing with several recommendation lists", "crmRecommendationBlocksSupport", bool, false, 0, owners2, 56);
        this.f155073g = A0.u(this, "Enable open dispatch edit screen and remove item from dispatch", "sbcDispatchEdit", bool, false, 0, owners, 56);
        this.f155074h = A0.u(this, "Enable to create auto dispatch in sbc configurator", "sbcAutoDispatchCreationSupport", bool, false, 0, owners, 56);
        this.f155075i = A0.u(this, "Enables beduin version of NotificationCenter screen", "crmNotificationCenterBeduinRedesign", bool, false, 0, owners2, 56);
        this.f155076j = A0.u(this, "Select ab-test group to use (or not) beduin version of NotificationCenter screen", "crmNotificationCenterBeduinRedesignAbGroup", new OptionSet("control", C42745f0.U("control", "test")), false, 0, owners2, 40);
        this.f155077k = A0.u(this, "Enables to show uxFeedback when sbc configurator closed by user", "sbcUxFeedbackConfiguratorCloseCampaign", bool, false, 0, owners, 56);
        this.f155078l = A0.u(this, "Enables onboarding for fast chips feature", "sbcFastChipsOnboardingEnabled", bool, false, 0, owners, 56);
        this.f155079m = A0.u(this, "Enables budget and audience predict for autodispatch", "sbcAutodispatchForecast", bool, false, 0, owners, 56);
        this.f155080n = A0.u(this, "Enables deeplinks to change and confirm email", "crmEmailChangeAndConfirmSupport", Boolean.FALSE, false, 0, owners2, 56);
    }
}
