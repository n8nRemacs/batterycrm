package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "text", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location_picker.c0, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31537c0 extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, String, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0 f182224l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31537c0(x0 x0Var) {
        super(2);
        this.f182224l = x0Var;
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, String str) {
        LocationPickerState locationPickerStateA = locationPickerState;
        String str2 = str;
        if (locationPickerStateA.f182366k) {
            locationPickerStateA = LocationPickerState.a(locationPickerStateA, null, false, 0.0f, str2, false, null, false, false, null, null, null, false, false, false, false, null, false, null, null, false, false, 16777167);
        }
        com.avito.android.location_picker.providers.w wVar = this.f182224l.f182814h;
        if (wVar != null) {
            wVar.f(locationPickerStateA);
        }
        return locationPickerStateA;
    }
}
