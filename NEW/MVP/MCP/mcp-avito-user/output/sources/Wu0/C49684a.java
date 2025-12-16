package wu0;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceOrderRequestSentEvent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lwu0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: wu0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C49684a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f441846b;

    /* compiled from: ServiceOrderRequestSentEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lwu0/a$a;", "", "<init>", "()V", "", "FROM_SERP_SOURCE", "Ljava/lang/String;", "_avito_service-order-widget_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: wu0.a$a, reason: collision with other inner class name */
    public static final class C12834a {
        public /* synthetic */ C12834a(C42822w c42822w) {
            this();
        }

        public C12834a() {
        }
    }

    static {
        new C12834a(null);
    }

    public C49684a(String str, String str2, int i12, C42822w c42822w) {
        str2 = (i12 & 2) != 0 ? "serp" : str2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null) {
            linkedHashMap.put("iid", str);
        }
        if (str2 != null) {
            linkedHashMap.put("from_source", str2);
        }
        G0 g02 = G0.f406611a;
        this.f441846b = new ParametrizedClickStreamEvent(9036, 2, linkedHashMap, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f441846b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f441846b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f441846b.f90248c;
    }
}
