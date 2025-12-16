package Cw0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: DownloadUpdateResultEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCw0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_silent-update_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cw0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13366b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2797b;

    public C13366b(@k String str, @l String str2) {
        this.f2797b = new ParametrizedClickStreamEvent(14876, 2, P0.g(new Q("answer_text", str), new Q("source_screen", str2 == null ? "" : str2)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f2797b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f2797b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f2797b.f90248c;
    }
}
