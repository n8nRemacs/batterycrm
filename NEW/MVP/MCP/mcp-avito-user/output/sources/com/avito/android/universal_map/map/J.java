package com.avito.android.universal_map.map;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.TypedResult;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: UniversalMapInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/J;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface J {
    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.O a(@Y61.k String str, @Y61.k AvitoMapPoint avitoMapPoint, @Y61.k AvitoMapPoint avitoMapPoint2, @Y61.l Float f12, @Y61.k Map map, @Y61.l Map map2, @Y61.l Map map3, boolean z12);

    @Y61.k
    io.reactivex.rxjava3.core.z<TypedResult<uG0.d>> b(@Y61.k String str, @Y61.l Float f12, @Y61.l Map<String, ? extends Object> map);
}
