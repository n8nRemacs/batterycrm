package com.avito.android.analytics.provider.clickstream;

import Y61.k;
import Y61.l;
import j.k0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: TreeClickStreamEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/provider/clickstream/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_analytics-clickstream_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class c implements a {

    /* renamed from: b, reason: collision with root package name */
    public final long f90265b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final TreeClickStreamParent f90266c;

    /* renamed from: d, reason: collision with root package name */
    public final int f90267d;

    /* renamed from: e, reason: collision with root package name */
    public final int f90268e;

    public c(long j12, @l TreeClickStreamParent treeClickStreamParent, int i12, int i13) {
        this.f90265b = j12;
        this.f90266c = treeClickStreamParent;
        this.f90267d = i12;
        this.f90268e = i13;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF90262b() {
        return this.f90267d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long j12 = this.f90265b;
        if (j12 != 0) {
            linkedHashMap.put("state_id", Long.valueOf(j12));
        }
        TreeClickStreamParent treeClickStreamParent = this.f90266c;
        linkedHashMap.putAll(treeClickStreamParent != null ? treeClickStreamParent.c() : P0.c());
        linkedHashMap.putAll(i());
        return linkedHashMap;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF90263c() {
        return this.f90268e;
    }

    @k0
    @k
    public abstract Map<String, Object> i();

    public final void j(@k LinkedHashMap linkedHashMap, @k String str, @l Object obj) {
        if (obj != null) {
            linkedHashMap.put(str, obj);
        }
    }
}
