package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Lcom/avito/android/location_picker/entities/LocationPickerState;", "T", "", VoiceInfo.STATE, "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final class A0 extends kotlin.jvm.internal.N implements Y41.l<LocationPickerState, LocationPickerState> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.N f182096l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Throwable f182097m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public A0(Y41.p<? super LocationPickerState, ? super Throwable, LocationPickerState> pVar, Throwable th2) {
        super(1);
        this.f182096l = (kotlin.jvm.internal.N) pVar;
        this.f182097m = th2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final LocationPickerState invoke(LocationPickerState locationPickerState) {
        return (LocationPickerState) this.f182096l.invoke(locationPickerState, this.f182097m);
    }
}
