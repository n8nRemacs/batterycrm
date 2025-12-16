package com.avito.android.search.filter;

import android.location.Location;
import com.avito.android.remote.model.Coordinates;
import kotlin.Metadata;

/* compiled from: FiltersInteractor.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "it", "Lkotlin/G0;", "accept", "(Landroid/location/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class K<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E f261871b;

    public K(E e12) {
        this.f261871b = e12;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Location location = (Location) obj;
        E e12 = this.f261871b;
        e12.f261782s.f(location, null);
        e12.f261754C = new Coordinates(location.getLatitude(), location.getLongitude());
    }
}
