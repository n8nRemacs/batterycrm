package pz;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.C35755b0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: RecallEventV5.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpz/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_entry-point-room-client_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: pz.d, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C47169d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f428913b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f428914c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f428915d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f428916e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f428917f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final LinkedHashMap f428918g;

    public C47169d(@k String str, @l String str2, @k String str3, @l String str4, @l String str5) {
        this.f428913b = str;
        this.f428914c = str2;
        this.f428915d = str3;
        this.f428916e = str4;
        this.f428917f = str5;
        this.f428918g = C35755b0.c(P0.g(new Q("rre_trx_agency_lead_id", str2), new Q("rre_trx_agreement_support_comment", str3), new Q("rre_trx_agreement_support_topic", null), new Q("phone", str), new Q("pp_source", str4), new Q("item_id", str5)));
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47169d)) {
            return false;
        }
        C47169d c47169d = (C47169d) obj;
        return L.f(this.f428913b, c47169d.f428913b) && this.f428914c.equals(c47169d.f428914c) && L.f(this.f428915d, c47169d.f428915d) && L.f(null, null) && L.f(this.f428916e, c47169d.f428916e) && L.f(this.f428917f, c47169d.f428917f);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return 10265;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f428918g;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return 5;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f428913b.hashCode() * 31, 31, this.f428914c), 961, this.f428915d);
        String str = this.f428916e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f428917f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RecallEventV5(phone=");
        sb2.append(this.f428913b);
        sb2.append(", leadId=");
        sb2.append(this.f428914c);
        sb2.append(", comment=");
        sb2.append(this.f428915d);
        sb2.append(", reason=null, source=");
        sb2.append(this.f428916e);
        sb2.append(", itemId=");
        return C22026a.c(sb2, this.f428917f, ')');
    }
}
