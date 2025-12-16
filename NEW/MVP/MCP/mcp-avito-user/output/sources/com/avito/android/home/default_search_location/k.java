package com.avito.android.home.default_search_location;

import android.location.Location;
import com.avito.android.remote.model.Coordinates;
import kotlin.Metadata;

/* compiled from: DefaultSearchLocationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lcom/avito/android/remote/model/Coordinates;", "it", "Landroid/location/Location;", "apply"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
final class k<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public static final k<T, R> f162388b = new k<>();

    @Override // l41.o
    public final Object apply(Object obj) {
        Location location = (Location) obj;
        return new Coordinates(location.getLatitude(), location.getLongitude());
    }
}
