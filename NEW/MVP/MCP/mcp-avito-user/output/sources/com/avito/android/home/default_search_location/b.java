package com.avito.android.home.default_search_location;

import android.location.Location;
import kotlin.Metadata;
import lW.InterfaceC43691a;

/* compiled from: DefaultSearchLocationAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/home/default_search_location/b;", "Lcom/avito/android/home/default_search_location/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43691a f162380a;

    public b(@Y61.k InterfaceC43691a interfaceC43691a) {
        this.f162380a = interfaceC43691a;
    }

    @Override // com.avito.android.home.default_search_location.a
    public final void b() {
        this.f162380a.g();
    }

    @Override // com.avito.android.home.default_search_location.a
    public final void c(@Y61.l String str) {
        this.f162380a.e(str);
    }

    @Override // com.avito.android.home.default_search_location.a
    public final void d(@Y61.l Location location, @Y61.l String str) {
        this.f162380a.f(location, str);
    }

    @Override // com.avito.android.home.default_search_location.a
    public final void e(@Y61.k Location location, @Y61.l Integer num) {
        this.f162380a.d(location, num);
    }
}
