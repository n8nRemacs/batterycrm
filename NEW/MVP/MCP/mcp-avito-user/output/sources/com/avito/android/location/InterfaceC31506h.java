package com.avito.android.location;

import com.avito.android.remote.model.Location;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;

/* compiled from: LocationInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/h;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.location.h, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public interface InterfaceC31506h {

    /* compiled from: LocationInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.location.h$a */
    public static final class a {
    }

    boolean b(@Y61.k String str);

    void h(@Y61.k Location location);

    void i(@Y61.k String str);

    @Y61.k
    io.reactivex.rxjava3.core.z<G0> j();

    @Y61.k
    io.reactivex.rxjava3.core.z<Location> l();

    @Y61.k
    io.reactivex.rxjava3.core.z<Q<Location, Boolean>> o(boolean z12);
}
