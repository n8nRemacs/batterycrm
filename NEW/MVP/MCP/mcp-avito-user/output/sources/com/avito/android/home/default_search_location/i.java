package com.avito.android.home.default_search_location;

import android.location.Location;
import com.avito.android.location.analytics.FindLocationPage;
import kotlin.Metadata;

/* compiled from: DefaultSearchLocationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/location/Location;", "it", "Lkotlin/G0;", "accept", "(Landroid/location/Location;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes13.dex */
final class i<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ s f162386b;

    public i(s sVar) {
        this.f162386b = sVar;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Location location = (Location) obj;
        s sVar = this.f162386b;
        sVar.f162413r = sVar.f162402g.now() - sVar.f162413r;
        sVar.f162405j = true;
        a aVar = sVar.f162398c;
        aVar.d(location, null);
        Integer numValueOf = Integer.valueOf((int) sVar.f162413r);
        FindLocationPage findLocationPage = FindLocationPage.f181725c;
        aVar.e(location, numValueOf);
        sVar.f162408m = sVar.f162413r < 1000;
    }
}
