package Xu0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;

/* compiled from: StepOpenedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LXu0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_services-onboarding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Xu0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17049a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f19127b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19128c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Map<String, String> f19129d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19130e;

    public C17049a(int i12, int i13, @l Map<String, String> map) {
        this.f19127b = i12;
        this.f19128c = i13;
        this.f19129d = map;
        this.f19130e = new ParametrizedClickStreamEvent(i12, i13, map != null ? C35755b0.c(map) : P0.c(), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF222438b() {
        return this.f19127b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f19130e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF222439c() {
        return this.f19128c;
    }
}
