package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "locationEnabled", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class C extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, Boolean, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public static final C f182100l = new C();

    public C() {
        super(2);
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, Boolean bool) {
        LocationPickerState locationPickerState2 = locationPickerState;
        boolean zBooleanValue = bool.booleanValue();
        return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, null, false, false, locationPickerState2.f(), zBooleanValue, null, false, null, null, !zBooleanValue, zBooleanValue, 4014079);
    }
}
