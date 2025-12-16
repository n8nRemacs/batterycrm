package com.avito.android;

import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import com.avito.android.util.InterfaceC35950u;
import kotlin.Metadata;

/* compiled from: BeduinFeatures.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/u;", "Lcom/avito/android/t;", "_avito-discouraged_avito-feature_beduin"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.u, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C35287u extends AbstractC35201t {

    /* renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f304516l;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A0.a f304517b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A0.a f304518c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A0.a f304519d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A0.a f304520e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final A0.a f304521f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final A0.a f304522g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final A0.a f304523h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final A0.a f304524i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final A0.a f304525j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final A0.a f304526k;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(C35287u.class, "beduinItemBindingPerformance", "getBeduinItemBindingPerformance()Lcom/avito/android/toggle/Feature;", 0);
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        f304516l = new kotlin.reflect.n[]{n0Var.i(h0Var), com.akita.compose.theme.re23.style.C0.k(C35287u.class, "beduinSkippedFramesPerformance", "getBeduinSkippedFramesPerformance()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C35287u.class, "beduinAdvertSaturatorInExecuteRequest", "getBeduinAdvertSaturatorInExecuteRequest()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C35287u.class, "beduinCartItem", "getBeduinCartItem()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C35287u.class, "disableCancelOnDetachInImageComponent", "getDisableCancelOnDetachInImageComponent()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C35287u.class, "disableCancelOnDetachInBadgeBarComponent", "getDisableCancelOnDetachInBadgeBarComponent()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C35287u.class, "addPoolHolderToFlexContainer", "getAddPoolHolderToFlexContainer()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C35287u.class, "useNonSelfUpdatingListItemRadio", "getUseNonSelfUpdatingListItemRadio()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C35287u.class, "houseCardWhiteStatusBarIcons", "getHouseCardWhiteStatusBarIcons()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C35287u.class, "horizontalSliderCurrentPageInitialization", "getHorizontalSliderCurrentPageInitialization()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C35287u.class, "beduinIconTransformationAtBackground", "getBeduinIconTransformationAtBackground()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C35287u(@Y61.k InterfaceC35950u interfaceC35950u) {
        Owners owners = Owners.f210556y;
        this.f304517b = A0.u(this, "Сборка дополнительной перфоманс-метрики для beduin", "beduin_item_binding_performance", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        A0.u(this, "Сборка дополнительной перфоманс-метрики для beduin", "beduin_skipped_frames_performance", com.akita.compose.theme.re23.style.C0.d(interfaceC35950u, false), false, 0, owners, 56);
        Boolean bool = Boolean.TRUE;
        this.f304518c = A0.u(this, "Включаем установку статусов просмотренного и избранного у моделей объявлений пришедших из доп запросов", "beduinAdvertSaturator", bool, false, 0, owners, 56);
        this.f304519d = A0.u(this, "Beduin компонент CartItem", "beduinCartItem", bool, false, 0, Owners.f210404F0, 56);
        this.f304520e = A0.u(this, "Не отменять загрузку картинок для Beduin компонента Image", "disableCancelOnDetachInImageComponent", bool, false, 0, owners, 56);
        this.f304521f = A0.u(this, "Не отменять загрузку картинок для Beduin компонента BadgeBar", "disableCancelOnDetachInBadgeBarComponent", bool, false, 0, owners, 56);
        this.f304522g = A0.u(this, "Добавили ComponentsPoolHolder в BeduinFlexContainer", "addPoolHolderToFlexContainer", bool, false, 0, Owners.f210394C, 56);
        this.f304523h = A0.u(this, "Не обновлять состояние выбора внутри ListItemRadio", "useNonSelfUpdatingListItemRadio", bool, false, 0, Owners.f210509l0, 56);
        Owners owners2 = Owners.f210510l1;
        this.f304524i = A0.u(this, "Белые иконки в статусбаре на экране карточки дома и ЖК", "houseCardWhiteStatusBarIcons", bool, false, 0, owners2, 56);
        this.f304525j = A0.u(this, "Инициализация начального значения currentPage в HorizontalSliderComponent", "horizontalSliderCurrentPageInitialization", bool, false, 0, owners2, 56);
        this.f304526k = A0.u(this, "Добавляем обработку ресуров иконок на бекграунде для сниппетов", "tac_beduinIconTransformationAtBackground", bool, true, 0, Owners.f210393B3, 40);
    }

    @Override // com.avito.android.AbstractC35201t
    @Y61.k
    public final DE0.a<Boolean> A() {
        kotlin.reflect.n<Object> nVar = f304516l[5];
        return this.f304521f.a();
    }

    @Override // com.avito.android.AbstractC35201t
    @Y61.k
    public final DE0.a<Boolean> B() {
        kotlin.reflect.n<Object> nVar = f304516l[4];
        return this.f304520e.a();
    }

    @Override // com.avito.android.AbstractC35201t
    @Y61.k
    public final DE0.a<Boolean> C() {
        kotlin.reflect.n<Object> nVar = f304516l[9];
        return this.f304525j.a();
    }

    @Override // com.avito.android.AbstractC35201t
    @Y61.k
    public final DE0.a<Boolean> D() {
        kotlin.reflect.n<Object> nVar = f304516l[8];
        return this.f304524i.a();
    }

    @Override // com.avito.android.AbstractC35201t
    @Y61.k
    public final DE0.a<Boolean> E() {
        kotlin.reflect.n<Object> nVar = f304516l[7];
        return this.f304523h.a();
    }

    @Override // com.avito.android.AbstractC35201t
    @Y61.k
    public final DE0.a<Boolean> v() {
        kotlin.reflect.n<Object> nVar = f304516l[6];
        return this.f304522g.a();
    }

    @Override // com.avito.android.AbstractC35201t
    @Y61.k
    public final DE0.a<Boolean> w() {
        kotlin.reflect.n<Object> nVar = f304516l[2];
        return this.f304518c.a();
    }

    @Override // com.avito.android.AbstractC35201t
    @Y61.k
    public final DE0.a<Boolean> x() {
        kotlin.reflect.n<Object> nVar = f304516l[3];
        return this.f304519d.a();
    }

    @Override // com.avito.android.AbstractC35201t
    @Y61.k
    public final DE0.a<Boolean> y() {
        kotlin.reflect.n<Object> nVar = f304516l[10];
        return this.f304526k.a();
    }

    @Override // com.avito.android.AbstractC35201t
    @Y61.k
    public final DE0.a<Boolean> z() {
        kotlin.reflect.n<Object> nVar = f304516l[0];
        return this.f304517b.a();
    }
}
