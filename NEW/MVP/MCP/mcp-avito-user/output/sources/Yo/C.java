package Yo;

import androidx.compose.runtime.internal.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: SubmittingSelectShowedEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYo/C;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class C implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f19662b;

    /* renamed from: c, reason: collision with root package name */
    public final int f19663c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Map<String, Object> f19664d;

    public C() {
        this(0, 0, null, 7, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId, reason: from getter */
    public final int getF19662b() {
        return this.f19662b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f19664d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion, reason: from getter */
    public final int getF19663c() {
        return this.f19663c;
    }

    public C(int i12, int i13, Map map, int i14, C42822w c42822w) {
        i12 = (i14 & 1) != 0 ? 10576 : i12;
        i13 = (i14 & 2) != 0 ? 0 : i13;
        map = (i14 & 4) != 0 ? P0.c() : map;
        this.f19662b = i12;
        this.f19663c = i13;
        this.f19664d = map;
    }
}
