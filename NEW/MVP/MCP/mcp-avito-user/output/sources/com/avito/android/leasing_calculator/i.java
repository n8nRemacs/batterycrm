package com.avito.android.leasing_calculator;

import com.avito.android.remote.model.LeasingApplicationCreationResponse;
import com.avito.android.remote.model.LeasingApplicationRequest;
import com.avito.android.util.P2;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: LeasingCalculatorInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/leasing_calculator/i;", "", "_avito_leasing-calculator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface i {
    @Y61.k
    z<P2<LeasingApplicationCreationResponse>> b(@Y61.k String str, @Y61.k LeasingApplicationRequest leasingApplicationRequest);

    @Y61.k
    z c(long j12, long j13, @Y61.k String str);
}
