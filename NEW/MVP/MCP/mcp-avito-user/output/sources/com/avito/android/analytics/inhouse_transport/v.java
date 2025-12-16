package com.avito.android.analytics.inhouse_transport;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42754k;

/* compiled from: InMemoryEventStorage.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/analytics/inhouse_transport/v;", "", "T", "Lcom/avito/android/analytics/inhouse_transport/u;", "_common_analytics-transport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class v<T> implements u<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Object f90214a = new Object();

    /* renamed from: b, reason: collision with root package name */
    @J41.a
    @Y61.k
    public final C42754k<T> f90215b;

    public v(int i12) {
        this.f90215b = new C42754k<>((int) (i12 * 1.5d));
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    public final int a() {
        int f406668c;
        synchronized (this.f90214a) {
            f406668c = this.f90215b.getF406668c();
        }
        return f406668c;
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    public final void add(@Y61.k T t12) {
        synchronized (this.f90214a) {
            this.f90215b.addLast(t12);
        }
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    public final void b(@Y61.k List<? extends T> list) {
        synchronized (this.f90214a) {
            this.f90215b.addAll(list);
        }
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    @Y61.k
    public final List<T> d() {
        return e(a());
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    @Y61.k
    public final List<T> e(int i12) {
        List<T> listM0;
        synchronized (this.f90214a) {
            if (i12 >= this.f90215b.getF406668c()) {
                i12 = this.f90215b.getF406668c();
            }
            List<T> listSubList = this.f90215b.subList(0, i12);
            listM0 = C42745f0.M0(listSubList);
            listSubList.clear();
        }
        return listM0;
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    public final boolean isEmpty() {
        boolean z12;
        synchronized (this.f90214a) {
            z12 = a() == 0;
        }
        return z12;
    }

    @Override // com.avito.android.analytics.inhouse_transport.u
    public final void c() {
    }
}
