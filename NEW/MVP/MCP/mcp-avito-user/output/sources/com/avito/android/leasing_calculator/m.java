package com.avito.android.leasing_calculator;

import com.avito.android.remote.model.LeasingApplicationCreationResponse;
import com.avito.android.remote.model.LeasingApplicationRequest;
import com.avito.android.remote.model.LeasingCalculator;
import com.avito.android.remote.model.LeasingOffersResponse;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: LeasingCalculatorRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/leasing_calculator/m;", "", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface m {
    void a(@Y61.l String str);

    @Y61.k
    z<P2<LeasingApplicationCreationResponse>> b(@Y61.k String str, @Y61.k LeasingApplicationRequest leasingApplicationRequest);

    void c(@Y61.l String str);

    void d(@Y61.l LeasingCalculator leasingCalculator);

    @Y61.k
    z<P2<LeasingOffersResponse>> e();

    @Y61.l
    Long f();

    void g(@Y61.l String str);

    @Y61.l
    /* renamed from: getAdvertId */
    String getF175117c();

    @Y61.l
    /* renamed from: getCategoryId */
    String getF175118d();

    @Y61.l
    /* renamed from: getData */
    LeasingCalculator getF175120f();

    @Y61.l
    /* renamed from: getMicroCategoryId */
    String getF175119e();
}
