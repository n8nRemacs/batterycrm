package B7;

import com.avito.android.advert_amenities.analytics.AmenitiesAndInteriorPhotoAnalyticsTrackerImpl;
import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AmenitiesAndInteriorPhotoAnalyticsTrackerImpl_Factory.java */
@e
@y
@x
/* loaded from: classes10.dex */
public final class b implements h<AmenitiesAndInteriorPhotoAnalyticsTrackerImpl> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f877a;

    public b(Provider<InterfaceC28373a> provider) {
        this.f877a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new AmenitiesAndInteriorPhotoAnalyticsTrackerImpl(this.f877a.get());
    }
}
