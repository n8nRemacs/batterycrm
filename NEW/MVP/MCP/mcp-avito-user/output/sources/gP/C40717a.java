package gp;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.client_room.model.PartnerStatus;
import ep.C40142d;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RecallEvent.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lgp/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: gp.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C40717a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f396868b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f396869c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f396870d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f396871e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f396872f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final PartnerStatus f396873g;

    public C40717a(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k PartnerStatus partnerStatus) {
        this.f396868b = str;
        this.f396869c = str2;
        this.f396870d = str3;
        this.f396871e = str4;
        this.f396872f = str5;
        this.f396873g = partnerStatus;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40717a)) {
            return false;
        }
        C40717a c40717a = (C40717a) obj;
        return L.f(this.f396868b, c40717a.f396868b) && L.f(this.f396869c, c40717a.f396869c) && L.f(this.f396870d, c40717a.f396870d) && L.f(this.f396871e, c40717a.f396871e) && L.f(this.f396872f, c40717a.f396872f) && L.f(this.f396873g, c40717a.f396873g);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return 10265;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        Q q12 = new Q("rre_trx_agency_lead_id", this.f396869c);
        Q q13 = new Q("rre_trx_agreement_support_comment", this.f396870d);
        Q q14 = new Q("rre_trx_agreement_support_topic", this.f396871e);
        Q q15 = new Q("phone", this.f396868b);
        String str = this.f396872f;
        LinkedHashMap linkedHashMapJ = P0.j(q12, q13, q14, q15, new Q("utm_source", str), new Q("pp_source", str));
        PartnerStatus partnerStatus = this.f396873g;
        Q<String, String> qA2 = C40142d.a(partnerStatus);
        if (qA2 != null) {
        }
        Q<String, String> qB2 = C40142d.b(partnerStatus);
        if (qB2 != null) {
            linkedHashMapJ.put(qB2.f406619b, qB2.f406620c);
        }
        return linkedHashMapJ;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return 1;
    }

    public final int hashCode() {
        return this.f396873g.hashCode() + H.d(H.d(H.d(H.d(this.f396868b.hashCode() * 31, 31, this.f396869c), 31, this.f396870d), 31, this.f396871e), 31, this.f396872f);
    }

    @k
    public final String toString() {
        return "RecallEvent(phone=" + this.f396868b + ", leadId=" + this.f396869c + ", comment=" + this.f396870d + ", reason=" + this.f396871e + ", source=" + this.f396872f + ", status=" + this.f396873g + ')';
    }
}
