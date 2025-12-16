package com.avito.android.analytics;

import java.util.Set;
import kotlin.Metadata;

/* compiled from: CompositeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/k;", "Lcom/avito/android/analytics/j;", "_common_analytics-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.k, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final /* data */ class C28460k implements InterfaceC28459j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<InterfaceC28457i> f90224b;

    /* JADX WARN: Multi-variable type inference failed */
    public C28460k(@Y61.k Set<? extends InterfaceC28457i> set) {
        this.f90224b = set;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28460k) && kotlin.jvm.internal.L.f(this.f90224b, ((C28460k) obj).f90224b);
    }

    @Override // com.avito.android.analytics.InterfaceC28459j
    @Y61.k
    public final Set<InterfaceC28457i> getEvents() {
        return this.f90224b;
    }

    public final int hashCode() {
        return this.f90224b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return AK.c.u(new StringBuilder("CompositeEventImpl(events="), this.f90224b, ')');
    }
}
