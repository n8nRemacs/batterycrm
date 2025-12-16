package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: PublishParamValueChangedEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/A0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class A0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f2371b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f2372c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f2373d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<Integer> f2374e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f2375f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final C50213a f2376g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2377h;

    public A0(@Y61.k String str, @Y61.k String str2, @Y61.k String str3, @Y61.l List<Integer> list, @Y61.l String str4, @Y61.k C50213a c50213a) {
        this.f2371b = str;
        this.f2372c = str2;
        this.f2373d = str3;
        this.f2374e = list;
        this.f2375f = str4;
        this.f2376g = c50213a;
        this.f2377h = new ParametrizedClickStreamEvent(2609, 7, B0.a(str, str2, str3, list, str4, c50213a), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF97978b() {
        return this.f2377h.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2377h.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF97979c() {
        return this.f2377h.f90248c;
    }

    @Y61.k
    public final String toString() {
        return "PublishInputChangedEventV6(2609) " + B0.a(this.f2371b, this.f2372c, this.f2373d, this.f2374e, this.f2375f, this.f2376g);
    }
}
