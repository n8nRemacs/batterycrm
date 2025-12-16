package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import lW.InterfaceC43691a;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location_picker.t, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31575t extends kotlin.jvm.internal.N implements Y41.l<LocationPickerState, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0 f182496l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Throwable f182497m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31575t(x0 x0Var, Throwable th2) {
        super(1);
        this.f182496l = x0Var;
        this.f182497m = th2;
    }

    @Override // Y41.l
    public final LocationPickerState invoke(LocationPickerState locationPickerState) {
        LocationPickerState locationPickerState2 = locationPickerState;
        InterfaceC43691a interfaceC43691a = this.f182496l.f182815i;
        Throwable th2 = this.f182497m;
        interfaceC43691a.f(null, th2.getMessage());
        return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, th2.getMessage(), false, false, false, false, 4087), false, false, false, false, null, false, null, null, false, false, 16773119);
    }
}
