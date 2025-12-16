package com.avito.android.location_picker.view;

import com.avito.android.avito_map.AvitoMapCameraPosition;
import com.avito.android.location_picker.entities.LocationPickerState;
import kotlin.Metadata;

/* compiled from: LocationPickerViewChanger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/avito_map/AvitoMapCameraPosition;", "it", "Lcom/avito/android/location_picker/entities/LocationPickerState;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class J<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final J<T, R> f182516b = new J<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        LocationPickerState locationPickerState = (LocationPickerState) obj;
        return new AvitoMapCameraPosition(locationPickerState.f182358c, locationPickerState.f182360e, 0.0f, null, null, 24, null);
    }
}
