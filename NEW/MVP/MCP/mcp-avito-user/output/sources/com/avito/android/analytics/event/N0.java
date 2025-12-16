package com.avito.android.analytics.event;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: SendPollEvent.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/N0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class N0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f89971b;

    /* renamed from: c, reason: collision with root package name */
    public final int f89972c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f89973d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f89974e;

    /* renamed from: f, reason: collision with root package name */
    public final int f89975f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<Integer> f89976g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f89977h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final LinkedHashMap f89978i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f89979j;

    public N0(int i12, int i13, @Y61.l String str, @Y61.l String str2, int i14, @Y61.k List list, @Y61.k String str3, @Y61.l LinkedHashMap linkedHashMap) {
        this.f89971b = i12;
        this.f89972c = i13;
        this.f89973d = str;
        this.f89974e = str2;
        this.f89975f = i14;
        this.f89976g = list;
        this.f89977h = str3;
        this.f89978i = linkedHashMap;
        LinkedHashMap linkedHashMapJ = kotlin.collections.P0.j(new kotlin.Q("uid", str), new kotlin.Q("orderid", null), new kotlin.Q("item_id", str2), new kotlin.Q("poll_id", Integer.valueOf(i14)), new kotlin.Q("answer_ids", list), new kotlin.Q("poll_comment", null), new kotlin.Q("poll_label", str3), new kotlin.Q("business_platform", "3"));
        if (linkedHashMap != null) {
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                linkedHashMapJ.put(entry.getKey(), entry.getValue());
            }
        }
        kotlin.G0 g02 = kotlin.G0.f406611a;
        this.f89979j = new ParametrizedClickStreamEvent(i12, i13, C35755b0.c(linkedHashMapJ), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n02 = (N0) obj;
        return this.f89971b == n02.f89971b && this.f89972c == n02.f89972c && kotlin.jvm.internal.L.f(this.f89973d, n02.f89973d) && kotlin.jvm.internal.L.f(null, null) && this.f89974e.equals(n02.f89974e) && this.f89975f == n02.f89975f && kotlin.jvm.internal.L.f(this.f89976g, n02.f89976g) && kotlin.jvm.internal.L.f(null, null) && this.f89977h.equals(n02.f89977h) && kotlin.jvm.internal.L.f(this.f89978i, n02.f89978i);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF83080b() {
        return this.f89971b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f89979j.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF83081c() {
        return this.f89972c;
    }

    public final int hashCode() {
        int iE2 = androidx.appcompat.app.r.e(this.f89972c, Integer.hashCode(this.f89971b) * 31, 31);
        String str = this.f89973d;
        int iD2 = androidx.compose.foundation.H.d(androidx.compose.foundation.H.e(androidx.appcompat.app.r.e(this.f89975f, androidx.compose.foundation.H.d((iE2 + (str == null ? 0 : str.hashCode())) * 961, 31, this.f89974e), 31), 961, this.f89976g), 31, this.f89977h);
        LinkedHashMap linkedHashMap = this.f89978i;
        return iD2 + (linkedHashMap != null ? linkedHashMap.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendPollEvent(eventId=");
        sb2.append(this.f89971b);
        sb2.append(", version=");
        sb2.append(this.f89972c);
        sb2.append(", userID=");
        sb2.append(this.f89973d);
        sb2.append(", orderID=null, itemID=");
        sb2.append(this.f89974e);
        sb2.append(", pollID=");
        sb2.append(this.f89975f);
        sb2.append(", answerID=");
        sb2.append(this.f89976g);
        sb2.append(", comment=null, pollLabel=");
        sb2.append(this.f89977h);
        sb2.append(", payloadParams=");
        return org.webrtc.h.e(sb2, this.f89978i, ')');
    }
}
