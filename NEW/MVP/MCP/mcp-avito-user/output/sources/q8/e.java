package q8;

import Y61.k;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SafeDealBuyButtonClickEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lq8/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final LinkedHashMap f429048b;

    public e(String str, String str2, String str3, String str4, boolean z12, String str5, String str6, boolean z13, int i12, C42822w c42822w) {
        z13 = (i12 & 128) != 0 ? false : z13;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        i(linkedHashMap, new Q("iid", str));
        i(linkedHashMap, new Q("uid", str2));
        i(linkedHashMap, new Q("cid", str3));
        i(linkedHashMap, new Q("srcp", str4));
        i(linkedHashMap, new Q("is_user_auth", Boolean.valueOf(z12)));
        i(linkedHashMap, new Q("safedeal_services", str5));
        i(linkedHashMap, new Q("is_marketplace", Boolean.valueOf(z13)));
        i(linkedHashMap, new Q("x", C35800g5.b(new C35792f5(str6))));
        this.f429048b = linkedHashMap;
    }

    public static void i(LinkedHashMap linkedHashMap, Q q12) {
        B b12 = q12.f406620c;
        if (b12 != 0) {
            linkedHashMap.put(q12.f406619b, b12);
        }
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return 2483;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f429048b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return 7;
    }
}
