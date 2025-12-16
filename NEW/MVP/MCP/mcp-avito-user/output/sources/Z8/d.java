package z8;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: GalleryVideoEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lz8/d;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f443845f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f443846g;

    public d(@l TreeClickStreamParent treeClickStreamParent, @k String str, boolean z12) {
        super(0L, treeClickStreamParent, 4063, 2);
        this.f443845f = str;
        this.f443846g = z12;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "iid", this.f443845f);
        j(linkedHashMap, "click_from_block", Integer.valueOf(this.f443846g ? 1 : 0));
        return linkedHashMap;
    }
}
