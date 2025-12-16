package com.avito.android.location_picker.view;

import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.List;
import kotlin.Metadata;

/* compiled from: LocationPickerViewChanger.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", VoiceInfo.STATE, "Lcom/avito/android/location_picker/entities/LocationPickerState;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class K extends kotlin.jvm.internal.N implements Y41.l<LocationPickerState, List<? extends AddressSuggestion>> {

    /* renamed from: l, reason: collision with root package name */
    public static final K f182517l = new K();

    public K() {
        super(1);
    }

    @Override // Y41.l
    public final List<? extends AddressSuggestion> invoke(LocationPickerState locationPickerState) {
        return locationPickerState.f182368m;
    }
}
