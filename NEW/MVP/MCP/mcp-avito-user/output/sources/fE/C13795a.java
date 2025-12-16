package Fe;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AutoLoanCabinetEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LFe/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_auto-loans-cabinet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Fe.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C13795a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f5938b;

    /* renamed from: c, reason: collision with root package name */
    public final int f5939c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5940d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Map<String, Object> f5941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f5942f;

    public C13795a(int i12, int i13, @k String str, @k Map map) {
        this.f5938b = str;
        this.f5939c = i12;
        this.f5940d = i13;
        this.f5941e = map;
        this.f5942f = new ParametrizedClickStreamEvent(i12, i13, P0.k(Collections.singletonMap("from_page", str), map), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13795a)) {
            return false;
        }
        C13795a c13795a = (C13795a) obj;
        return L.f(this.f5938b, c13795a.f5938b) && this.f5939c == c13795a.f5939c && this.f5940d == c13795a.f5940d && L.f(this.f5941e, c13795a.f5941e);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF5939c() {
        return this.f5939c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f5942f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF5940d() {
        return this.f5940d;
    }

    public final int hashCode() {
        return this.f5941e.hashCode() + r.e(this.f5940d, r.e(this.f5939c, this.f5938b.hashCode() * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutoLoanCabinetEvent(screenName=");
        sb2.append(this.f5938b);
        sb2.append(", eventId=");
        sb2.append(this.f5939c);
        sb2.append(", version=");
        sb2.append(this.f5940d);
        sb2.append(", additionalParams=");
        return r.w(sb2, this.f5941e, ')');
    }

    public /* synthetic */ C13795a(String str, int i12, int i13, Map map, int i14, C42822w c42822w) {
        this(i12, i13, str, (i14 & 8) != 0 ? P0.c() : map);
    }

    public /* synthetic */ C13795a(String str, int i12, int i13, long j12, long j13, Map map, int i14, C42822w c42822w) {
        this(str, i12, i13, j12, j13, (Map<String, ? extends Object>) ((i14 & 32) != 0 ? P0.c() : map));
    }

    public C13795a(long j12, @k String str, long j13, @k String str2) {
        this(str, 15825, 0, j12, j13, (Map<String, ? extends Object>) Collections.singletonMap("data", Collections.singletonMap("button", str2)));
    }

    public C13795a(@k String str, int i12, int i13, long j12, long j13, @k Map<String, ? extends Object> map) {
        this(i12, i13, str, P0.k(P0.g(new Q("item_id", Long.valueOf(j12)), new Q("ofp_application_id", Long.valueOf(j13))), map));
    }
}
