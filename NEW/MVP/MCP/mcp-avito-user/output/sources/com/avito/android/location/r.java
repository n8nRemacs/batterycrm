package com.avito.android.location;

import com.avito.android.remote.model.Location;
import io.reactivex.rxjava3.internal.operators.observable.B0;
import kotlin.Metadata;

/* compiled from: SavedLocationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/r;", "", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface r {

    /* compiled from: SavedLocationInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public static /* synthetic */ void a(r rVar, Location location, LocationSource locationSource, int i12) {
            if ((i12 & 2) != 0) {
                locationSource = null;
            }
            rVar.a(location, locationSource, (i12 & 4) == 0);
        }

        public static /* synthetic */ io.reactivex.rxjava3.core.z b(r rVar, boolean z12, int i12) {
            if ((i12 & 1) != 0) {
                z12 = false;
            }
            return rVar.e(z12, (i12 & 2) == 0);
        }
    }

    void a(@Y61.l Location location, @Y61.l LocationSource locationSource, boolean z12);

    boolean b(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.internal.operators.observable.C c();

    @Y61.k
    B0 d();

    @Y61.k
    B0 e(boolean z12, boolean z13);

    @Y61.l
    Location f();
}
