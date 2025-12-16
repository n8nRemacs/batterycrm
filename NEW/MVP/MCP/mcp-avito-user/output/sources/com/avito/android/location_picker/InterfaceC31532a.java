package com.avito.android.location_picker;

import com.avito.android.location_picker.entities.LocationPickerState;
import kotlin.Metadata;

/* compiled from: LocationPickerBinder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/location_picker/a;", "", "a", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location_picker.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC31532a {

    /* compiled from: LocationPickerBinder.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location_picker/a$a;", "", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.location_picker.a$a, reason: collision with other inner class name */
    public interface InterfaceC5348a {
    }

    void a();

    void b();

    @Y61.k
    io.reactivex.rxjava3.disposables.c c();

    void d(@Y61.k LocationPickerFragment locationPickerFragment);

    void destroy();

    @Y61.l
    LocationPickerState f0();
}
