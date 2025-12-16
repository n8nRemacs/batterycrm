package Dx0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: CloseStoriesWebView.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LDx0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Dx0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13457a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f3577b;

    public C13457a(@l String str, @l String str2, @l String str3, @l String str4) {
        HashMap map = new HashMap();
        if (str2 != null) {
            map.put("cid", str2);
        }
        if (str != null) {
            map.put("errors_detailed", str);
        }
        if (str3 != null) {
            map.put("story_id", str3);
        }
        if (str4 != null) {
            map.put("ref", str4);
        }
        G0 g02 = G0.f406611a;
        this.f3577b = new ParametrizedClickStreamEvent(7886, 2, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f3577b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f3577b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f3577b.f90248c;
    }

    public /* synthetic */ C13457a(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
        this(str, str2, str3, (i12 & 8) != 0 ? null : str4);
    }
}
