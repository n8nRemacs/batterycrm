package com.avito.android.location.find;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import io.reactivex.rxjava3.internal.operators.observable.U;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: FindLocationPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/find/p;", "Lcom/avito/android/location/find/o;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class p implements o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f181764a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<z> f181765b;

    @Inject
    public p(@Y61.k d dVar, @Y61.k w wVar) {
        this.f181764a = dVar;
        this.f181765b = C42745f0.U(A.f181742a, dVar, wVar);
    }

    @Override // com.avito.android.location.find.o
    public final void a(@Y61.k Context context) {
        this.f181764a.a(context);
    }

    @Override // com.avito.android.location.find.o
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Location> b(@Y61.k Activity activity, boolean z12, boolean z13) {
        for (z zVar : this.f181765b) {
            zVar.d(activity);
            if (zVar.b()) {
                return zVar.e(z12);
            }
        }
        return U.f403867b;
    }

    @Override // com.avito.android.location.find.o
    public final void c(@Y61.k Context context) {
        this.f181764a.c(context);
    }
}
