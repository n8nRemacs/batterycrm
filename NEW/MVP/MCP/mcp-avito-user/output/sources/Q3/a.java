package Q3;

import Y61.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: AdaptiveImagePickedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LQ3/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_common_adaptive-image-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f13438b = new com.avito.android.analytics.provider.clickstream.b(9308, 1);

    /* renamed from: c, reason: collision with root package name */
    @k
    public final LinkedHashMap f13439c;

    public a(@k String str, int i12, int i13, int i14, int i15, int i16, int i17, boolean z12, boolean z13, float f12) {
        this.f13439c = P0.j(new Q("network_type", str), new Q("screen_width", Integer.valueOf(i12)), new Q("screen_height", Integer.valueOf(i13)), new Q("img_width", Integer.valueOf(i14)), new Q("img_height", Integer.valueOf(i15)), new Q("content_mode", Integer.valueOf(i16)), new Q("fallback_resolution", Integer.valueOf(i17)), new Q("network_is_constrained", Boolean.valueOf(z12)), new Q("battery_save", Boolean.valueOf(z13)), new Q("average_image_load_speed", Float.valueOf(f12)));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF6279b() {
        return this.f13438b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f13439c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF6280c() {
        return this.f13438b.f90263c;
    }
}
