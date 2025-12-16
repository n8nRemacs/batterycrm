package Uc;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: ReviewArbitrageDetailsOpenEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LUc/f;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f16520b;

    /* compiled from: ReviewArbitrageDetailsOpenEvent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LUc/f$a;", "", "a", "b", "LUc/f$a$a;", "LUc/f$a$b;", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f16521a;

        /* compiled from: ReviewArbitrageDetailsOpenEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUc/f$a$a;", "LUc/f$a;", "<init>", "()V", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Uc.f$a$a, reason: collision with other inner class name */
        public static final class C1132a extends a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C1132a f16522b = new C1132a();

            public C1132a() {
                super("buyer", null);
            }
        }

        /* compiled from: ReviewArbitrageDetailsOpenEvent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LUc/f$a$b;", "LUc/f$a;", "<init>", "()V", "_avito_analytics-ratings-reviews_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b extends a {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final b f16523b = new b();

            public b() {
                super("seller", null);
            }
        }

        public a(String str, C42822w c42822w) {
            this.f16521a = str;
        }
    }

    public f(@l Long l12, @k a aVar) {
        this.f16520b = new ParametrizedClickStreamEvent(8481, 1, C35755b0.c(P0.g(new Q("review_id", l12), new Q("role_in_deal", aVar.f16521a))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f16520b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f16520b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f16520b.f90248c;
    }
}
