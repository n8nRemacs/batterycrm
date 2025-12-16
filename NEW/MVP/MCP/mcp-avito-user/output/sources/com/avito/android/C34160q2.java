package com.avito.android;

import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;

/* compiled from: SearchFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/q2;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.q2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C34160q2 extends A0 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f246158g;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A0.a f246159b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A0.a f246160c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A0.a f246161d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final A0.a f246162e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final A0.a f246163f;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(C34160q2.class, "searchUxFeedback", "getSearchUxFeedback()Lcom/avito/android/toggle/Feature;", 0);
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        f246158g = new kotlin.reflect.n[]{n0Var.i(h0Var), com.akita.compose.theme.re23.style.C0.k(C34160q2.class, "itemMapWithoutActivity", "getItemMapWithoutActivity()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C34160q2.class, "optimizeSectionedMultiselectStringConverter", "getOptimizeSectionedMultiselectStringConverter()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C34160q2.class, "rootLayoutWithAdditionalButton", "getRootLayoutWithAdditionalButton()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C34160q2.class, "provideBeduinRecyclerViewByTag", "getProvideBeduinRecyclerViewByTag()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C34160q2() {
        Owners owners = Owners.f210394C;
        Boolean bool = Boolean.TRUE;
        this.f246159b = A0.u(this, "Опросы по использованию поиска", "searchUxFeedback", bool, false, 0, owners, 56);
        this.f246160c = A0.u(this, "Карта на карточке без activity", "itemMapWithoutActivity", bool, false, 0, Owners.f210489g0, 56);
        this.f246161d = A0.u(this, "Изменение способа конвертации строки для селектора в фильтрах Марка, Модель, Поколение", "optimizeSectionedMultiselectStringConverter", Boolean.FALSE, false, 0, Owners.f210490g1, 56);
        this.f246162e = A0.u(this, "Использовать на Серпе корневой layout с Additional Buttons внизу экрана", "rootLayoutWithAdditionalButton", bool, false, 0, Owners.f210511l3, 56);
        this.f246163f = A0.u(this, "Поиск RecyclerView бедуин виджета по formId", "provideBeduinRecyclerViewByTag", bool, false, 0, Owners.f210448U, 56);
    }
}
