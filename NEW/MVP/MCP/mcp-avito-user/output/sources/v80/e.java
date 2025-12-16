package V80;

import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionChart.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV80/e;", "", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final f f16946a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f16947b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final b f16948c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final DeepLink f16949d;

    public e(@Y61.k f fVar, @Y61.k ArrayList arrayList, @Y61.l b bVar, @Y61.l DeepLink deepLink) {
        this.f16946a = fVar;
        this.f16947b = arrayList;
        this.f16948c = bVar;
        this.f16949d = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f16946a.equals(eVar.f16946a) && this.f16947b.equals(eVar.f16947b) && L.f(this.f16948c, eVar.f16948c) && L.f(this.f16949d, eVar.f16949d);
    }

    public final int hashCode() {
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f16947b, this.f16946a.hashCode() * 31, 31);
        b bVar = this.f16948c;
        int iHashCode = (iG2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        DeepLink deepLink = this.f16949d;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PositionChartMobile(chartParams=");
        sb2.append(this.f16946a);
        sb2.append(", cols=");
        sb2.append(this.f16947b);
        sb2.append(", scrollDepth=");
        sb2.append(this.f16948c);
        sb2.append(", chartScrollEventDeepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f16949d, ')');
    }
}
