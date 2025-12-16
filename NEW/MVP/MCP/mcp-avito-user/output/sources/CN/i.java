package CN;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.SearchParams;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: InlineFilterOnboardingEvents.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"LCN/i;", "Lcom/avito/android/analytics/provider/clickstream/a;", "<init>", "()V", "a", "b", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class i implements com.avito.android.analytics.provider.clickstream.a {

    /* compiled from: InlineFilterOnboardingEvents.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN/i$a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f2116b;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k SearchParams searchParams) {
            LinkedHashMap linkedHashMapJ = P0.j(new Q("cid", str), new Q("filter_name", str2), new Q("filter_id", str3));
            j.a(linkedHashMapJ, searchParams);
            G0 g02 = G0.f406611a;
            this.f2116b = new ParametrizedClickStreamEvent(10050, 1, linkedHashMapJ, null, 8, null);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF75431b() {
            return this.f2116b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f2116b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF75432c() {
            return this.f2116b.f90248c;
        }
    }

    /* compiled from: InlineFilterOnboardingEvents.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCN/i$b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_inline-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.analytics.provider.clickstream.a {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ParametrizedClickStreamEvent f2117b;

        public b(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.k SearchParams searchParams) {
            LinkedHashMap linkedHashMapJ = P0.j(new Q("cid", str), new Q("filter_name", str2), new Q("filter_id", str3));
            j.a(linkedHashMapJ, searchParams);
            G0 g02 = G0.f406611a;
            this.f2117b = new ParametrizedClickStreamEvent(10049, 2, linkedHashMapJ, null, 8, null);
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getEventId */
        public final int getF75431b() {
            return this.f2117b.f90247b;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        @Y61.k
        public final Map<String, Object> getParams() {
            return this.f2117b.f90249d;
        }

        @Override // com.avito.android.analytics.provider.clickstream.a
        /* renamed from: getVersion */
        public final int getF75432c() {
            return this.f2117b.f90248c;
        }
    }

    public /* synthetic */ i(C42822w c42822w) {
        this();
    }

    public i() {
    }
}
