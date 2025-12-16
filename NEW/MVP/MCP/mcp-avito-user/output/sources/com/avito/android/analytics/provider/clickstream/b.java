package com.avito.android.analytics.provider.clickstream;

import Y61.k;
import Y61.l;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: SimpleClickStreamEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/provider/clickstream/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class b implements a {

    /* renamed from: b, reason: collision with root package name */
    public final int f90262b;

    /* renamed from: c, reason: collision with root package name */
    public final int f90263c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, Object> f90264d = P0.c();

    public b(int i12, int i13) {
        this.f90262b = i12;
        this.f90263c = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f90262b == bVar.f90262b && this.f90263c == bVar.f90263c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF90247b() {
        return this.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f90264d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF90248c() {
        return this.f90263c;
    }

    public final int hashCode() {
        return (this.f90262b * 31) + this.f90263c;
    }

    @k
    public final String toString() {
        return "ClickStreamEvent (id:" + getF90247b() + ", params:" + getParams() + ", version:" + getF90248c() + ')';
    }
}
