package com.avito.android.analytics.event;

import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: BottomNavigationLifecycleEvents.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/n;", "Lcom/avito/android/error_reporting/error_reporter/u;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics.event.n, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28429n implements com.avito.android.error_reporting.error_reporter.u {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f90103b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f90104c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ArrayList f90105d;

    public C28429n(@Y61.k String str, @Y61.k String str2, @Y61.k ArrayList arrayList) {
        this.f90103b = str;
        this.f90104c = str2;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((Fragment) it.next()).getClass().getSimpleName());
        }
        this.f90105d = arrayList2;
    }

    @Override // com.avito.android.error_reporting.error_reporter.u
    @Y61.k
    /* renamed from: getName */
    public final String getF147929e() {
        return toString();
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f90105d);
        sb2.append(' ');
        sb2.append(this.f90104c);
        sb2.append(" in ");
        return AK.c.s(sb2, this.f90103b, " tab");
    }
}
