package i9;

import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.remote.model.AdvertDetails;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: ClickNoteTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li9/i;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class i extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final AdvertDetails f398388f;

    public i(@Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.k AdvertDetails advertDetails) {
        super(0L, treeClickStreamParent, 3213, 2);
        this.f398388f = advertDetails;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @Y61.k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdvertDetails advertDetails = this.f398388f;
        j(linkedHashMap, "iid", advertDetails.getId());
        j(linkedHashMap, "cid", advertDetails.getCategoryId());
        return linkedHashMap;
    }
}
