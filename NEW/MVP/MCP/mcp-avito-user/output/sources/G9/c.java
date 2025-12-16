package g9;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.remote.model.AdvertDetails;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ShowSimilarsTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg9/c;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AdvertDetails f396360f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f396361g;

    /* renamed from: h, reason: collision with root package name */
    public final int f396362h;

    public c(@l TreeClickStreamParent treeClickStreamParent, @k AdvertDetails advertDetails, @l String str, int i12) {
        super(0L, treeClickStreamParent, 3204, 3);
        this.f396360f = advertDetails;
        this.f396361g = str;
        this.f396362h = i12;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "iid", this.f396360f.getId());
        j(linkedHashMap, "x", this.f396361g);
        j(linkedHashMap, "position", Integer.valueOf(this.f396362h));
        return linkedHashMap;
    }
}
