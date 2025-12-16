package com.avito.android.location_picker.providers;

import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.geo_common.model.location_picker.LocationFlowType;
import io.reactivex.rxjava3.internal.operators.maybe.s0;
import io.reactivex.rxjava3.internal.operators.single.U;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AddressGeoCoder.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/providers/a;", "", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location_picker.providers.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC31564a {

    /* compiled from: AddressGeoCoder.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.location_picker.providers.a$a, reason: collision with other inner class name */
    public static final class C5351a {
    }

    @Y61.k
    U a(@Y61.k AvitoMapPoint avitoMapPoint, @Y61.l String str);

    @Y61.k
    U b();

    @Y61.l
    Object c(@Y61.k String str, @Y61.k ContinuationImpl continuationImpl);

    @Y61.k
    s0 d(@Y61.k String str, @Y61.k AvitoMapBounds avitoMapBounds);

    @Y61.k
    U e(@Y61.k String str);

    @Y61.k
    s0 f(@Y61.k AvitoMapPoint avitoMapPoint, @Y61.k LocationFlowType locationFlowType);

    @Y61.l
    Object g(@Y61.k String str, @Y61.k AvitoMapBounds avitoMapBounds, @Y61.k ContinuationImpl continuationImpl);
}
