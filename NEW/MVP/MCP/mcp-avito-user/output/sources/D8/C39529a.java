package d8;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.provider.clickstream.c;
import com.avito.android.remote.model.AdvertDetails;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AbuseClickTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ld8/a;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: d8.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C39529a extends c {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final AdvertDetails f393709f;

    public C39529a(@l TreeClickStreamParent treeClickStreamParent, @k AdvertDetails advertDetails) {
        super(0L, treeClickStreamParent, 3206, 1);
        this.f393709f = advertDetails;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AdvertDetails advertDetails = this.f393709f;
        j(linkedHashMap, "iid", advertDetails.getId());
        j(linkedHashMap, "cid", advertDetails.getCategoryId());
        return linkedHashMap;
    }
}
