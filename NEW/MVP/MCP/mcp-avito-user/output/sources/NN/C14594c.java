package Nn;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: CategoryClickEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNn/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nn.c, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C14594c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f11748b;

    public C14594c(@k String str, @l String str2) {
        this.f11748b = new ParametrizedClickStreamEvent(3183, 2, C35755b0.c(P0.g(new Q("shortcut_description", str), new Q("cid", str2))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f11748b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f11748b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f11748b.f90248c;
    }
}
