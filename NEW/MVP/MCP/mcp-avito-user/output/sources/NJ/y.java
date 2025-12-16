package nJ;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qJ.C47304a;

/* compiled from: IacProblemBannerClickedEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LnJ/y;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class y implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f415083b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415084c;

    /* compiled from: IacProblemBannerClickedEvent.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"LnJ/y$a;", "", "<init>", "()V", "", "NOTIFICATION_ENABLE_ALL_BANNER", "Ljava/lang/String;", "NOTIFICATION_ENABLE_ALL_POPUP", "NOTIFICATION_ENABLE_IMPORTANT_BANNER", "NOTIFICATION_ENABLE_IMPORTANT_POPUP", "_avito_iac-analytics_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public y(@Y61.k String str) {
        this.f415083b = str;
        this.f415084c = new ParametrizedClickStreamEvent(6690, 1, C47304a.a(Collections.singletonMap("iac_enabling_scenario", str)), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y) && kotlin.jvm.internal.L.f(this.f415083b, ((y) obj).f415083b);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f415084c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f415084c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f415084c.f90248c;
    }

    public final int hashCode() {
        return this.f415083b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("IacProblemBannerClickedEvent(iacProblemsScenario="), this.f415083b, ')');
    }
}
