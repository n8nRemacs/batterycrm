package Jx0;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ClickStreamAnalyticsEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LJx0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Jx0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C14258a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C0546a f9179c = new C0546a(null);

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f9180b;

    /* compiled from: ClickStreamAnalyticsEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LJx0/a$a;", "", "<init>", "()V", "_avito_str-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Jx0.a$a, reason: collision with other inner class name */
    public static final class C0546a {
        public /* synthetic */ C0546a(C42822w c42822w) {
            this();
        }

        @k
        public static C14258a a(@k SuggestAnalyticsEvent suggestAnalyticsEvent) {
            return new C14258a(suggestAnalyticsEvent.getId(), suggestAnalyticsEvent.getVersion(), suggestAnalyticsEvent.getParameters(), null);
        }

        public C0546a() {
        }
    }

    public C14258a() {
        throw null;
    }

    public C14258a(int i12, int i13, Map map, C42822w c42822w) {
        this.f9180b = new ParametrizedClickStreamEvent(i12, i13, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f9180b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f9180b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f9180b.f90248c;
    }
}
