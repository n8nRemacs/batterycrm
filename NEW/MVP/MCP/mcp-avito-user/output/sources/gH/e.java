package Gh;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.ArrayList;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ShowBeduinV1ContentEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGh/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f6709b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ArrayList f6710c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f6711d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f6712e;

    public e(@l String str, @l String str2, @k ArrayList arrayList) {
        this.f6709b = str;
        this.f6710c = arrayList;
        this.f6711d = str2;
        kotlin.collections.builders.d dVar = new kotlin.collections.builders.d();
        dVar.put("screen_name", str == null ? "Undefined" : str);
        String str3 = arrayList.isEmpty() ? null : arrayList;
        dVar.put("feature_owners", str3 == null ? "Undefined" : str3);
        dVar.put("feature_name", str2 == null ? "Undefined" : str2);
        G0 g02 = G0.f406611a;
        this.f6712e = new ParametrizedClickStreamEvent(13233, 0, dVar.b(), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f6709b, eVar.f6709b) && this.f6710c.equals(eVar.f6710c) && L.f(this.f6711d, eVar.f6711d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF75431b() {
        return this.f6712e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f6712e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF75432c() {
        return this.f6712e.f90248c;
    }

    public final int hashCode() {
        String str = this.f6709b;
        int iG2 = androidx.compose.ui.graphics.colorspace.e.g(this.f6710c, (str == null ? 0 : str.hashCode()) * 31, 31);
        String str2 = this.f6711d;
        return iG2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ShowBeduinV1ContentEvent(screenName=");
        sb2.append(this.f6709b);
        sb2.append(", owners=");
        sb2.append(this.f6710c);
        sb2.append(", featureName=");
        return C22026a.c(sb2, this.f6711d, ')');
    }
}
