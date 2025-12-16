package com.avito.android.universal_map.map_mvi.pins;

import Y61.k;
import Y61.l;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.universal_map.remote.model.UniversalMapPointsRectResult;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: UniversalMapPinsRepository.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/pins/a;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface a {
    @l
    Object a(@k String str, @k AvitoMapPoint avitoMapPoint, @k AvitoMapPoint avitoMapPoint2, @l Float f12, @k Map<String, ? extends Object> map, @l Map<String, ? extends Object> map2, @l Map<String, ? extends Object> map3, @k Continuation<? super TypedResult<UniversalMapPointsRectResult>> continuation);
}
