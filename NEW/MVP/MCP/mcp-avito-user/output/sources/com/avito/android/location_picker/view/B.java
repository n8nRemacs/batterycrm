package com.avito.android.location_picker.view;

import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.location_picker.entities.LocationPickerState;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.Radius;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Iterator;
import java.util.Optional;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: LocationPickerViewChanger.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u000f\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/avito/android/location_picker/entities/LocationPickerState;", VoiceInfo.STATE, "Ljava/util/Optional;", "Lcom/avito/android/remote/model/Radius;", "Lj41/e;", "apply", "(Lcom/avito/android/location_picker/entities/LocationPickerState;)Ljava/util/Optional;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class B<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final B<T, R> f182508b = new B<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        Optional optionalOf;
        T next;
        LocationPickerState locationPickerState = (LocationPickerState) obj;
        Iterator<T> it = locationPickerState.f182375t.f182382c.iterator();
        while (true) {
            optionalOf = null;
            if (!it.hasNext()) {
                next = (T) null;
                break;
            }
            next = it.next();
            if (((Radius) next).isActive()) {
                break;
            }
        }
        Radius radius = next;
        if (radius != null) {
            AvitoMapPoint avitoMapPoint = locationPickerState.f182358c;
            radius.setCoordinates(new Coordinates(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude()));
            optionalOf = Optional.of(radius);
        }
        return optionalOf == null ? Optional.empty() : optionalOf;
    }
}
