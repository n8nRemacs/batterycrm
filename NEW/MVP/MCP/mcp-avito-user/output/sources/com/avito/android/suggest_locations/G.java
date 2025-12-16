package com.avito.android.suggest_locations;

import com.avito.android.geo_common.model.CoordsByAddressResult;
import com.avito.android.geo_common.model.location_picker.AddressSuggestion;
import com.avito.android.remote.model.Coordinates;
import kotlin.Metadata;

/* compiled from: SuggestLocationsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/geo_common/model/location_picker/AddressSuggestion;", "it", "Lcom/avito/android/geo_common/model/CoordsByAddressResult;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
final class G<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AddressSuggestion f292108b;

    public G(AddressSuggestion addressSuggestion) {
        this.f292108b = addressSuggestion;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        CoordsByAddressResult.Point point = ((CoordsByAddressResult) obj).getPoint();
        return AddressSuggestion.a(this.f292108b, new Coordinates(point.getLatitude(), point.getLongitude()));
    }
}
