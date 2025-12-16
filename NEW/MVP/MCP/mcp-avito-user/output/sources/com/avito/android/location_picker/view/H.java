package com.avito.android.location_picker.view;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* compiled from: LocationPickerViewChanger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/category_parameters/AddressParameter$Value;", "it", "Lcom/avito/android/location_picker/entities/LocationPickerState;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class H<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final H<T, R> f182514b = new H<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        LocationPickerState locationPickerState = (LocationPickerState) obj;
        AvitoMapPoint avitoMapPoint = locationPickerState.f182358c;
        return new AddressParameter.Value(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude(), locationPickerState.f182361f, locationPickerState.f182377v, null, 16, null);
    }
}
