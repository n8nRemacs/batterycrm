package ne;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.authorization.gorelkin.event.ParsingPermissionFormOpenSource;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ParsingPermissionFormOpenEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lne/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ne.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C44383a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f415221b;

    public C44383a() {
        ParsingPermissionFormOpenSource[] parsingPermissionFormOpenSourceArr = ParsingPermissionFormOpenSource.f93920b;
        this.f415221b = new ParametrizedClickStreamEvent(5170, 1, Collections.singletonMap("s", "auth"), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19127b() {
        return this.f415221b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f415221b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF11770c() {
        return this.f415221b.f90248c;
    }
}
