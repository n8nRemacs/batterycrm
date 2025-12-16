package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.location_picker.entities.RadiusViewState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import yW.AbstractC50188a;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "LyW/a;", "result", "invoke", "(Lcom/avito/android/location_picker/entities/LocationPickerState;LyW/a;)Lcom/avito/android/location_picker/entities/LocationPickerState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.o, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31560o extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, AbstractC50188a, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public static final C31560o f182430l = new C31560o();

    public C31560o() {
        super(2);
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, AbstractC50188a abstractC50188a) {
        LocationPickerState locationPickerState2 = locationPickerState;
        AbstractC50188a abstractC50188a2 = abstractC50188a;
        if (!(abstractC50188a2 instanceof AbstractC50188a.c)) {
            if (abstractC50188a2 instanceof AbstractC50188a.b) {
                return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, null, false, false, false, false, 3071), false, false, false, false, null, false, null, null, false, false, 16773119);
            }
            if (abstractC50188a2 instanceof AbstractC50188a.C12903a) {
                return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerState2.f182369n, null, null, false, false, false, false, 3583), false, false, false, false, null, false, null, null, false, false, 16773119);
            }
            throw new NoWhenBranchMatchedException();
        }
        AbstractC50188a.c cVar = (AbstractC50188a.c) abstractC50188a2;
        long advertCount = cVar.getAdvertCount();
        String title = cVar.getCounterButton().getTitle();
        if (title == null) {
            title = "";
        }
        String str = title;
        Boolean enabled = cVar.getCounterButton().getEnabled();
        return LocationPickerState.a(locationPickerState2, null, false, 0.0f, null, false, null, false, false, null, null, null, false, false, false, false, RadiusViewState.a(locationPickerState2.f182375t, null, null, false, null, 0L, null, false, advertCount, str, enabled != null ? enabled.booleanValue() : false, null, false, 20991), false, null, null, false, false, 16515071);
    }
}
