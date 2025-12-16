package com.avito.android.zstd;

import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: NetworkCompressionEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/zstd/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_zstd_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f331349b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f331350c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f331351d;

    /* renamed from: e, reason: collision with root package name */
    public final long f331352e;

    /* renamed from: f, reason: collision with root package name */
    public final long f331353f;

    /* renamed from: g, reason: collision with root package name */
    public final long f331354g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f331355h;

    public a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, long j12, long j13, long j14) {
        this.f331349b = str;
        this.f331350c = str2;
        this.f331351d = str3;
        this.f331352e = j12;
        this.f331353f = j13;
        this.f331354g = j14;
        Q q12 = new Q("url_definition", str);
        Q q13 = new Q("content_encoding", str3);
        Q q14 = new Q("request_count", "1");
        int i12 = 0;
        if (str2.length() != 0 && (!C43066x.q(str2, str3, true))) {
            i12 = 1;
        }
        this.f331355h = new ParametrizedClickStreamEvent(7830, 1, P0.g(q12, q13, q14, new Q("encoding_mismatch_count", String.valueOf(i12)), new Q("total_body_bytes_encoded", String.valueOf(j12)), new Q("total_body_bytes_decoded", String.valueOf(j13)), new Q("mobile_event_duration", String.valueOf(j14))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f331349b, aVar.f331349b) && L.f(this.f331350c, aVar.f331350c) && L.f(this.f331351d, aVar.f331351d) && this.f331352e == aVar.f331352e && this.f331353f == aVar.f331353f && this.f331354g == aVar.f331354g;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f331355h.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f331355h.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f331355h.f90248c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f331354g) + r.g(r.g(H.d(H.d(this.f331349b.hashCode() * 31, 31, this.f331350c), 31, this.f331351d), 31, this.f331352e), 31, this.f331353f);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NetworkCompressionEvent(urlDefinition=");
        sb2.append(this.f331349b);
        sb2.append(", preferredEncoding=");
        sb2.append(this.f331350c);
        sb2.append(", contentEncoding=");
        sb2.append(this.f331351d);
        sb2.append(", encodedSize=");
        sb2.append(this.f331352e);
        sb2.append(", decodedSize=");
        sb2.append(this.f331353f);
        sb2.append(", receivePhaseDuration=");
        return r.u(sb2, this.f331354g, ')');
    }
}
