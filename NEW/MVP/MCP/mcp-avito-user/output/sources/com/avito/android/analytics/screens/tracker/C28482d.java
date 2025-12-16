package com.avito.android.analytics.screens.tracker;

import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.analytics.screens.tracker.H;
import kotlin.Metadata;

/* compiled from: BaseScreenTrackerFactoryImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/d;", "Lcom/avito/android/analytics/screens/tracker/c;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.screens.tracker.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28482d implements InterfaceC28481c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f90803a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final I f90804b;

    public C28482d(@Y61.k com.avito.android.util.C c12, @Y61.k I i12) {
        this.f90803a = c12;
        this.f90804b = i12;
    }

    @Override // com.avito.android.analytics.screens.tracker.InterfaceC28481c
    @Y61.k
    public final F a(@Y61.k C28478k c28478k) {
        K k12 = new K(this.f90803a, this.f90804b, c28478k.f90636a, c28478k.f90637b);
        String str = c28478k.f90638c;
        H.c cVar = new H.c(str, true);
        return new F(k12.b(cVar), k12.c(cVar), k12.a(), str);
    }

    @Override // com.avito.android.analytics.screens.tracker.InterfaceC28481c
    public final K b(Screen screen, com.avito.android.analytics.screens.r rVar) {
        return new K(this.f90803a, this.f90804b, screen, rVar);
    }
}
