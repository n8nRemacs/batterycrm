package com.avito.android.location_picker;

import com.avito.android.location_picker.analytics.ScreenCloseFromBlock;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "reason", "Lcom/avito/android/location_picker/analytics/ScreenCloseFromBlock;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class Y extends kotlin.jvm.internal.N implements Y41.p<LocationPickerState, ScreenCloseFromBlock, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ x0 f182191l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(x0 x0Var) {
        super(2);
        this.f182191l = x0Var;
    }

    @Override // Y41.p
    public final LocationPickerState invoke(LocationPickerState locationPickerState, ScreenCloseFromBlock screenCloseFromBlock) {
        LocationPickerState locationPickerState2 = locationPickerState;
        this.f182191l.f182821o.b(locationPickerState2, screenCloseFromBlock);
        return locationPickerState2;
    }
}
