package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.AddressValidationState;
import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import yW.AbstractC50189b;

/* compiled from: LocationPickerBinder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class M extends kotlin.jvm.internal.N implements Y41.l<LocationPickerState, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ AbstractC50189b f182175l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ x0 f182176m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(AbstractC50189b abstractC50189b, x0 x0Var) {
        super(1);
        this.f182175l = abstractC50189b;
        this.f182176m = x0Var;
    }

    @Override // Y41.l
    public final LocationPickerState invoke(LocationPickerState locationPickerState) {
        LocationPickerState locationPickerState2 = locationPickerState;
        AbstractC50189b abstractC50189b = this.f182175l;
        if (abstractC50189b instanceof AbstractC50189b.C12904b) {
            uF.g gVar = ((AbstractC50189b.C12904b) abstractC50189b).f443162a;
            return LocationPickerState.a(locationPickerState2, x0.f(this.f182176m, gVar.getCoordinates()), true, 11.0f, "", false, null, false, false, null, null, T0.a(), false, false, false, false, null, false, null, AddressValidationState.a(locationPickerState2.f182378w, false, false, "", 5), false, false, 14643137);
        }
        if (abstractC50189b instanceof AbstractC50189b.a) {
            return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, null, false, false, false, false, 4094), false, false, false, false, null, false, null, null, false, false, 16740351);
        }
        if (!(abstractC50189b instanceof AbstractC50189b.c)) {
            throw new NoWhenBranchMatchedException();
        }
        return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, ((AbstractC50189b.c) abstractC50189b).f443163a, false, false, false, false, 4087), false, false, false, false, null, false, null, null, false, false, 16740351);
    }
}
