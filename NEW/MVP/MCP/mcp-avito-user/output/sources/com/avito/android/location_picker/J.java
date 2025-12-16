package com.avito.android.location_picker;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.location_picker.entities.AddressValidationState;
import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42784z0;
import uF.c;

/* compiled from: LocationPickerBinder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "LuF/c;", "result", "invoke", "(Lcom/avito/android/location_picker/entities/LocationPickerState;LuF/c;)Lcom/avito/android/location_picker/entities/LocationPickerState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class J extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, uF.c, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0 f182134l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J(x0 x0Var) {
        super(2);
        this.f182134l = x0Var;
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, uF.c cVar) {
        LocationPickerState locationPickerState2 = locationPickerState;
        uF.c cVar2 = cVar;
        if (!(cVar2 instanceof c.C12707c)) {
            if (cVar2 instanceof c.b) {
                return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, "", false, false, null, C42784z0.f406748b, LocationPickerErrors.a(locationPickerState2.f182369n, null, ((c.b) cVar2).getMessage(), false, false, false, false, 4087), false, false, false, false, null, false, null, null, false, false, 16770495);
            }
            if (cVar2 instanceof c.a) {
                return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, C42784z0.f406748b, LocationPickerErrors.a(locationPickerState2.f182369n, null, null, false, false, false, false, 4094), false, false, false, false, null, false, null, null, false, false, 16770559);
            }
            throw new NoWhenBranchMatchedException();
        }
        x0 x0Var = this.f182134l;
        x0Var.getClass();
        float f12 = (locationPickerState2.f182375t.f182381b.length() <= 0 || locationPickerState2.f182375t.f182386g == 0) ? 17.0f : locationPickerState2.f182360e;
        C42784z0 c42784z0 = C42784z0.f406748b;
        c.C12707c c12707c = (c.C12707c) cVar2;
        AvitoMapPoint avitoMapPointF = x0.f(x0Var, c12707c.getCoords());
        String jsonWebToken = c12707c.getJsonWebToken();
        AddressValidationState addressValidationStateA = AddressValidationState.a(locationPickerState2.f182378w, false, true, "", 1);
        String formattedAddress = c12707c.getFormattedAddress();
        String str = formattedAddress == null ? "" : formattedAddress;
        String formattedAddress2 = c12707c.getFormattedAddress();
        return LocationPickerState.a(locationPickerState2, avitoMapPointF, false, f12, str, !(formattedAddress2 == null || formattedAddress2.length() == 0), "", false, false, null, c42784z0, T0.a(), false, false, false, false, null, false, jsonWebToken, addressValidationStateA, false, false, 13624709);
    }
}
