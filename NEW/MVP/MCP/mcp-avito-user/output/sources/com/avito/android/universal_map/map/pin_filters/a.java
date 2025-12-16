package com.avito.android.universal_map.map.pin_filters;

import com.avito.android.remote.model.TypedResult;
import io.reactivex.rxjava3.internal.operators.observable.O;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import uG0.C48896b;

/* compiled from: UniversalMapFiltersRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/pin_filters/a;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    @Y61.k
    O a(@Y61.k String str, @Y61.l Map map, @Y61.l Map map2, @Y61.l Map map3);

    @Y61.l
    Object b(@Y61.k String str, @Y61.l Map<String, ? extends Object> map, @Y61.l Map<String, ? extends Object> map2, @Y61.l Map<String, ? extends Object> map3, @Y61.k Continuation<? super TypedResult<C48896b>> continuation);
}
