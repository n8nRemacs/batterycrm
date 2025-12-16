package com.avito.android.location_picker.view;

import com.avito.android.location_picker.entities.AddressValidationState;
import com.avito.android.location_picker.entities.LocationPickerState;
import kotlin.Metadata;

/* compiled from: LocationPickerViewChanger.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/avito/android/location_picker/entities/LocationPickerState;", "test"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location_picker.view.t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31597t<T> implements l41.r {

    /* renamed from: b, reason: collision with root package name */
    public static final C31597t<T> f182797b = new C31597t<>();

    @Override // l41.r
    public final boolean test(Object obj) {
        AddressValidationState addressValidationState = ((LocationPickerState) obj).f182378w;
        return !addressValidationState.f182342c && addressValidationState.f182344e.length() > 0;
    }
}
