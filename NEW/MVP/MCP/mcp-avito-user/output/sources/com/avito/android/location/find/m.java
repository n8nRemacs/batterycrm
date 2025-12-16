package com.avito.android.location.find;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FindDetectLocationPresenterImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/location/find/m;", "Lcom/avito/android/location/find/l;", "_avito_user-location_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class m implements l {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f181759a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final i f181760b;

    @Inject
    public m(@Y61.k d dVar, @Y61.k i iVar) {
        this.f181759a = dVar;
        this.f181760b = iVar;
    }

    @Override // com.avito.android.location.find.o
    public final void a(@Y61.k Context context) {
        this.f181759a.a(context);
    }

    @Override // com.avito.android.location.find.o
    @Y61.k
    public final io.reactivex.rxjava3.core.z<Location> b(@Y61.k Activity activity, boolean z12, boolean z13) {
        d dVar = this.f181759a;
        dVar.d(activity);
        return dVar.b() ? dVar.e(z12) : this.f181760b.e(z13);
    }

    @Override // com.avito.android.location.find.o
    public final void c(@Y61.k Context context) {
        this.f181759a.c(context);
    }
}
