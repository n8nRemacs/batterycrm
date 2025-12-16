package com.avito.android.location_picker.view;

import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: LocationPickerViewChanger.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", VoiceInfo.STATE, "Lcom/avito/android/location_picker/entities/LocationPickerState;", "invoke", "(Lcom/avito/android/location_picker/entities/LocationPickerState;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class L extends kotlin.jvm.internal.N implements Y41.l<LocationPickerState, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public static final L f182518l = new L();

    public L() {
        super(1);
    }

    @Override // Y41.l
    public final Boolean invoke(LocationPickerState locationPickerState) {
        return Boolean.valueOf(locationPickerState.f182366k);
    }
}
