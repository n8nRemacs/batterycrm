package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: AddPhotoOnPublishEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/t;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cd0.t, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13286t implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2469b;

    public C13286t(@Y61.k C50213a c50213a, @Y61.k String str, float f12, float f13, long j12, @Y61.k String str2) {
        this.f2469b = new ParametrizedClickStreamEvent(318, 10, com.avito.android.authorization.auto_recovery.phone_confirm.b.l("extension", str2, kotlin.collections.P0.l(kotlin.collections.P0.l(kotlin.collections.P0.l(kotlin.collections.P0.l(c50213a.a(), new kotlin.Q("at", str)), new kotlin.Q("width", Float.valueOf(f12))), new kotlin.Q("height", Float.valueOf(f13))), new kotlin.Q("size", Long.valueOf(j12)))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f2469b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2469b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f2469b.f90248c;
    }
}
