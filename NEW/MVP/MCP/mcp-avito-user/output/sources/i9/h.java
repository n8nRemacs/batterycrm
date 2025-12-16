package i9;

import com.avito.android.advert_core.analytics.toolbar.BackFromPage;
import com.avito.android.analytics.event.AbstractC28427m;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BackPressAdvertTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li9/h;", "Lcom/avito/android/analytics/event/m;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class h extends AbstractC28427m {

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final String f398385g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final BackFromPage f398386h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final String f398387i;

    public /* synthetic */ h(long j12, TreeClickStreamParent treeClickStreamParent, String str, boolean z12, BackFromPage backFromPage, int i12, C42822w c42822w) {
        this(j12, treeClickStreamParent, str, z12, (i12 & 16) != 0 ? BackFromPage.f82882b : backFromPage);
    }

    @Override // com.avito.android.analytics.event.AbstractC28427m
    @Y61.k
    public final Map<String, Object> k() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "iid", this.f398385g);
        this.f398386h.getClass();
        return linkedHashMap;
    }

    @Override // com.avito.android.analytics.event.AbstractC28427m
    @Y61.k
    /* renamed from: l, reason: from getter */
    public final String getF398387i() {
        return this.f398387i;
    }

    public h(long j12, @Y61.l TreeClickStreamParent treeClickStreamParent, @Y61.k String str, boolean z12, @Y61.k BackFromPage backFromPage) {
        super(j12, treeClickStreamParent, z12);
        this.f398385g = str;
        this.f398386h = backFromPage;
        this.f398387i = "item_view";
    }
}
