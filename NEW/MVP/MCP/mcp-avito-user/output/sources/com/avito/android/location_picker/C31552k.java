package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "error", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location_picker.k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31552k extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, Throwable, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public static final C31552k f182421l = new C31552k();

    public C31552k() {
        super(2);
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, Throwable th2) {
        LocationPickerState locationPickerState2 = locationPickerState;
        return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, th2.getMessage(), false, false, false, false, 4087), false, false, false, false, null, false, null, null, false, false, 16772863);
    }
}
