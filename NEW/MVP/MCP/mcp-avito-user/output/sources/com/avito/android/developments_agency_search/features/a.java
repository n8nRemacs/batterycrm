package com.avito.android.developments_agency_search.features;

import Y61.k;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.A0;
import com.avito.android.ownership.Owners;
import kotlin.Metadata;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;

/* compiled from: DevelopmentsAgencySearchFeatures.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/features/a;", "Lcom/avito/android/A0;", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public class a extends A0 {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f136535e;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final A0.a f136536b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final A0.a f136537c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final A0.a f136538d;

    static {
        h0 h0Var = new h0(a.class, "enableAddingClientFunctionality", "getEnableAddingClientFunctionality()Lcom/avito/android/toggle/Feature;", 0);
        n0 n0Var = m0.f406844a;
        f136535e = new n[]{n0Var.i(h0Var), C0.k(a.class, "yandexMapsInDevelopmentsAgencySearch", "getYandexMapsInDevelopmentsAgencySearch()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "enableVdrRedirect", "getEnableVdrRedirect()Lcom/avito/android/toggle/Feature;", 0, n0Var), C0.k(a.class, "ndTrxUseNavigationV2", "getNdTrxUseNavigationV2()Lcom/avito/android/toggle/Feature;", 0, n0Var)};
    }

    public a() {
        Owners owners = Owners.f210522o1;
        Boolean bool = Boolean.FALSE;
        this.f136536b = A0.u(this, "Показывать доступ к функциональности добавления клиентов в Кабинете сделок", "enableAddingClientFunctionality", bool, false, 0, owners, 56);
        Boolean bool2 = Boolean.TRUE;
        A0.u(this, "Яндекс карты в агентском поиске новостроек", "yandexMapsInDevelopmentsAgencySearch", bool2, false, 0, owners, 56);
        this.f136537c = A0.u(this, "Редирект переведенных агентов из флоу новостроек в ВКС", "enableVdrRedirect", bool2, false, 0, Owners.f210526p1, 56);
        this.f136538d = A0.u(this, "Использовать навигацию 2.0 в Агентском поиске", "ndTrxUseNavigationV2", bool, false, 0, owners, 56);
    }
}
