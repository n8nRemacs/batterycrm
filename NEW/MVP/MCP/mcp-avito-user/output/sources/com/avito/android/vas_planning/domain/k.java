package com.avito.android.vas_planning.domain;

import com.avito.android.util.P2;
import com.avito.android.vas_planning.model.VasPlannerState;
import io.reactivex.rxjava3.internal.operators.mixed.z;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: VasPlanningInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning/domain/k;", "", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface k {
    @Y61.k
    z a(@Y61.k String str, @Y61.k ArrayList arrayList);

    @Y61.k
    io.reactivex.rxjava3.core.z<P2<VasPlannerState>> b(@Y61.k String str);
}
