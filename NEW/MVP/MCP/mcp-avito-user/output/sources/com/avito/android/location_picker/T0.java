package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerErrors;
import io.reactivex.rxjava3.internal.operators.maybe.C41928w;
import kotlin.Metadata;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_location-picker_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class T0 {
    @Y61.k
    public static final LocationPickerErrors a() {
        return new LocationPickerErrors(false, false, null, null, false, false, false, false, false, false, false, false, 4095, null);
    }

    @Y61.k
    public static final io.reactivex.rxjava3.core.q<kotlin.G0> b(boolean z12) {
        return z12 ? io.reactivex.rxjava3.core.q.i(kotlin.G0.f406611a) : C41928w.f403335b;
    }
}
