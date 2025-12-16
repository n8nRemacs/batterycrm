package com.avito.android.location_picker;

import android.content.Intent;
import android.net.Uri;
import com.avito.android.location_picker.LocationPickerFragment;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import kotlin.Metadata;

/* compiled from: LocationPickerFragment.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/H0;", "Lcom/avito/android/location_picker/N0;", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class H0 implements N0 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LocationPickerFragment f182132b;

    public H0(LocationPickerFragment locationPickerFragment) {
        this.f182132b = locationPickerFragment;
    }

    @Override // com.avito.android.location_picker.N0
    public final void E3(@Y61.l Radius radius) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_RADIUS_RESULT", radius);
        kotlin.G0 g02 = kotlin.G0.f406611a;
        LocationPickerFragment.a aVar = LocationPickerFragment.f182158D0;
        LocationPickerFragment locationPickerFragment = this.f182132b;
        locationPickerFragment.B5(-1, intent);
        locationPickerFragment.r5();
    }

    @Override // com.avito.android.location_picker.N0
    public final void I1(@Y61.k AddressParameter.Value value, @Y61.l String str) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_ADDRESS_RESULT", value);
        intent.putExtra("EXTRA_ADDRESS_PARAM_ID", str);
        kotlin.G0 g02 = kotlin.G0.f406611a;
        LocationPickerFragment.a aVar = LocationPickerFragment.f182158D0;
        LocationPickerFragment locationPickerFragment = this.f182132b;
        locationPickerFragment.B5(-1, intent);
        locationPickerFragment.r5();
    }

    @Override // com.avito.android.location_picker.N0
    public final void R0() {
        this.f182132b.r5();
    }

    @Override // com.avito.android.location_picker.N0
    public final void T3() {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        LocationPickerFragment locationPickerFragment = this.f182132b;
        intent.setData(Uri.fromParts("package", locationPickerFragment.requireActivity().getPackageName(), null));
        locationPickerFragment.startActivity(intent);
    }
}
