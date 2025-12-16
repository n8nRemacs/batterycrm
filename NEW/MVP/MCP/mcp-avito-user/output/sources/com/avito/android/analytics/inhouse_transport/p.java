package com.avito.android.analytics.inhouse_transport;

import androidx.view.InterfaceC22982O;
import androidx.view.InterfaceC23042i0;
import androidx.view.Lifecycle;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: InHouseAnalyticsWatchDog.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/analytics/inhouse_transport/p;", "Landroidx/lifecycle/O;", "Lkotlin/G0;", "onEnterBackground", "()V", "onEnterForeground", "_common_analytics-transport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class p implements InterfaceC22982O {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<h31.e<k>> f90205b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<o> f90206c;

    /* JADX WARN: Multi-variable type inference failed */
    public p(@Y61.k List<? extends h31.e<k>> list, @Y61.k h31.e<o> eVar) {
        this.f90205b = list;
        this.f90206c = eVar;
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_STOP)
    public final void onEnterBackground() {
        Iterator<T> it = this.f90205b.iterator();
        while (it.hasNext()) {
            ((k) ((h31.e) it.next()).get()).flush();
        }
        this.f90206c.get().shutdown();
    }

    @InterfaceC23042i0(Lifecycle.Event.ON_START)
    public final void onEnterForeground() {
        this.f90206c.get().reset();
    }
}
