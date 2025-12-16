package com.avito.android.comparison.data;

import Y61.k;
import Y61.l;
import com.avito.android.comparison.remote.model.ComparisonResponse;
import com.avito.android.remote.model.TypedResult;
import io.reactivex.rxjava3.core.z;
import kotlin.Metadata;

/* compiled from: ComparisonRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/data/a;", "", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {
    @k
    z<TypedResult<ComparisonResponse>> a(@k String str, @k String str2, @l String str3);

    @k
    z<TypedResult<ComparisonResponse>> b(@k String str, @l String str2, boolean z12);
}
