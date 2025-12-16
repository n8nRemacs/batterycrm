package com.avito.android.analytics.screens.tracker;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.Screen;
import com.avito.android.memory.consumption.f;
import com.avito.android.memory.consumption.m;
import kotlin.Metadata;

/* compiled from: ScreenMemoryConsumptionTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/tracker/A;", "Lcom/avito/android/analytics/screens/tracker/z;", "_avito_analytics-screens_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class A implements InterfaceC28503z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f90701a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Screen f90702b;

    public A(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Screen screen) {
        this.f90701a = interfaceC28373a;
        this.f90702b = screen;
    }

    public final void a(@Y61.k f.a aVar) {
        new com.avito.android.memory.consumption.f(this.f90701a, new m.b(this.f90702b.f90471b)).d(aVar);
    }
}
