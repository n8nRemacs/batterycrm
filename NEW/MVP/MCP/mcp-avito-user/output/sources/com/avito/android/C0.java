package com.avito.android;

import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;

/* compiled from: FiltersFeatures.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/C0;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito-discouraged_avito-feature_filters"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class C0 extends A0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f67235e;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final A0.a f67236b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final A0.a f67237c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final A0.a f67238d;

    static {
        kotlin.jvm.internal.h0 h0Var = new kotlin.jvm.internal.h0(C0.class, "forceReloadFiltersAfterMaxPriceChange", "getForceReloadFiltersAfterMaxPriceChange()Lcom/avito/android/toggle/Feature;", 0);
        kotlin.jvm.internal.n0 n0Var = kotlin.jvm.internal.m0.f406844a;
        f67235e = new kotlin.reflect.n[]{n0Var.i(h0Var), com.akita.compose.theme.re23.style.C0.k(C0.class, "localSortSectionedMultiselectGenerations", "getLocalSortSectionedMultiselectGenerations()Lcom/avito/android/toggle/Feature;", 0, n0Var), com.akita.compose.theme.re23.style.C0.k(C0.class, "useNewClearanceFilter", "getUseNewClearanceFilter()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public C0() {
        Owners owners = Owners.f210502j1;
        Boolean bool = Boolean.FALSE;
        this.f67236b = A0.u(this, "Автоматически перезагружать фильтры в поиске после изменения цены До", "forceReloadFiltersAfterMaxPriceChange", bool, false, 0, owners, 56);
        Owners owners2 = Owners.f210490g1;
        this.f67237c = A0.u(this, "Используем локальную сортировку секционном мультиселекте поколений", "localSortSectionedMultiselectGenerations", Boolean.TRUE, false, 0, owners2, 56);
        this.f67238d = A0.u(this, "Отображаем фильтр клиренса в новом дизайне", "useNewClearanceFilter", bool, false, 0, owners2, 56);
    }
}
