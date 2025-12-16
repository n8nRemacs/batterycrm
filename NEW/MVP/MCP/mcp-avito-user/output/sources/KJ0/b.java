package kj0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: NetworkErrorEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkj0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_performance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f406554b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f406555c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f406556d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f406557e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f406558f;

    public b(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @l String str6, @l String str7, @l String str8, @l Boolean bool) {
        this.f406554b = str;
        this.f406555c = str3;
        this.f406556d = str4;
        this.f406557e = str5;
        Q q12 = new Q(ContextActionHandler.Link.URL, str);
        Q q13 = new Q("url_definition", str2);
        Q q14 = new Q("ios_network_error_type", str3);
        Q q15 = new Q("ios_network_error_subtype", str4);
        Q q16 = new Q("ios_network_error_text", C43066x.t0(500, str5));
        Q q17 = new Q("network_error_id", str6 == null ? "" : str6);
        Q q18 = new Q("carrier_name", str7 == null ? "" : str7);
        Q q19 = new Q("carrier_numeric_code", str8 == null ? "" : str8);
        String string = bool != null ? bool.toString() : null;
        this.f406558f = new ParametrizedClickStreamEvent(4599, 15, P0.g(q12, q13, q14, q15, q16, q17, q18, q19, new Q("uses_api_contracts", string != null ? string : "")), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f406558f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f406558f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f406558f.f90248c;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f406555c);
        sb2.append(" / ");
        sb2.append(this.f406556d);
        sb2.append(" / ");
        sb2.append(this.f406557e);
        sb2.append(" (");
        return C22026a.c(sb2, this.f406554b, ')');
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, Boolean bool, int i12, C42822w c42822w) {
        this(str, str2, str3, str4, str5, str6, str7, str8, (i12 & 256) != 0 ? null : bool);
    }
}
