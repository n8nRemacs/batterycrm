package com.avito.beduin.v2.interaction.analytics.flow;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AnalyticsEventParam.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/analytics/flow/b;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f337258a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f337259b;

    public b(@k String str, @k String str2) {
        this.f337258a = str;
        this.f337259b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f337258a, bVar.f337258a) && L.f(this.f337259b, bVar.f337259b);
    }

    public final int hashCode() {
        return this.f337259b.hashCode() + (this.f337258a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnalyticsEventParam(key=");
        sb2.append(this.f337258a);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f337259b, ')');
    }
}
