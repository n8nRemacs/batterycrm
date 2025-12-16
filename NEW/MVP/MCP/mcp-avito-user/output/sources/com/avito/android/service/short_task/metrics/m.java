package com.avito.android.service.short_task.metrics;

import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Metric.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service/short_task/metrics/m;", "", "_avito_application_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f274089a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Object f274090b;

    public m(@Y61.k String str, @Y61.k Object obj) {
        this.f274089a = str;
        this.f274090b = obj;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f274089a, mVar.f274089a) && L.f(this.f274090b, mVar.f274090b);
    }

    public final int hashCode() {
        return this.f274090b.hashCode() + (this.f274089a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Metric(name=");
        sb2.append(this.f274089a);
        sb2.append(", value=");
        return H.n(sb2, this.f274090b, ')');
    }
}
