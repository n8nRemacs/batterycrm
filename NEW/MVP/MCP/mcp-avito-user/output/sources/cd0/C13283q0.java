package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: PhotosEmptyOnParamsUpdateEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/q0;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cd0.q0, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13283q0 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2464b;

    public C13283q0(@Y61.k C50213a c50213a, int i12, @Y61.k ArrayList arrayList) {
        this.f2464b = new ParametrizedClickStreamEvent(6887, 1, kotlin.collections.P0.l(kotlin.collections.P0.l(c50213a.a(), new kotlin.Q(PhotoParameter.TYPE, Integer.valueOf(i12))), new kotlin.Q("photos_ids", arrayList)), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f2464b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2464b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f2464b.f90248c;
    }
}
