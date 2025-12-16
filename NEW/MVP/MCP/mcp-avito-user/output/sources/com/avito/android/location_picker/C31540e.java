package com.avito.android.location_picker;

import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.location_picker.entities.LocationPickerErrors;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: LocationPickerBinder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "Lkotlin/G0;", "kotlin.jvm.PlatformType", "<anonymous parameter 1>", "invoke", "(Lcom/avito/android/location_picker/entities/LocationPickerState;Lkotlin/G0;)Lcom/avito/android/location_picker/entities/LocationPickerState;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.location_picker.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C31540e extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, kotlin.G0, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0 f182339l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31540e(x0 x0Var) {
        super(2);
        this.f182339l = x0Var;
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, kotlin.G0 g02) {
        LocationPickerState locationPickerStateA = locationPickerState;
        boolean zK2 = C43066x.K(locationPickerStateA.f182361f);
        x0 x0Var = this.f182339l;
        if (zK2) {
            locationPickerStateA = LocationPickerState.a(locationPickerStateA, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerStateA.f182369n, null, null, false, false, false, true, 3839), false, false, false, false, null, false, null, null, false, false, 16772863);
            com.avito.android.location_picker.providers.w wVar = x0Var.f182814h;
            if (wVar != null) {
                wVar.c(locationPickerStateA);
            }
        } else {
            List<AddressSuggestion> list = locationPickerStateA.f182368m;
            boolean z12 = locationPickerStateA.f182362g;
            if (!z12 && !list.isEmpty()) {
                locationPickerStateA = LocationPickerState.a(locationPickerStateA, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerStateA.f182369n, null, null, false, true, false, false, 4031), false, false, false, false, null, false, null, null, false, false, 16772863);
                com.avito.android.location_picker.providers.w wVar2 = x0Var.f182814h;
                if (wVar2 != null) {
                    wVar2.d(locationPickerStateA);
                }
            } else if (!z12 && list.isEmpty()) {
                locationPickerStateA = LocationPickerState.a(locationPickerStateA, null, false, 0.0f, null, false, null, false, false, null, null, LocationPickerErrors.a(locationPickerStateA.f182369n, null, null, false, false, true, false, 3967), false, false, false, false, null, false, null, null, false, false, 16772863);
                com.avito.android.location_picker.providers.w wVar3 = x0Var.f182814h;
                if (wVar3 != null) {
                    wVar3.d(locationPickerStateA);
                }
            }
        }
        return locationPickerStateA;
    }
}
