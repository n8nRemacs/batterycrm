package f8;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.provider.clickstream.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: AddressClickTreeEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf8/a;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: f8.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C40243a extends c {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f395680f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f395681g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f395682h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f395683i;

    public C40243a(@l TreeClickStreamParent treeClickStreamParent, @k String str, @l String str2, @l String str3, @k String str4) {
        super(0L, treeClickStreamParent, 3197, 6);
        this.f395680f = str;
        this.f395681g = str2;
        this.f395682h = str3;
        this.f395683i = str4;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "cid", this.f395681g);
        j(linkedHashMap, "iid", this.f395680f);
        j(linkedHashMap, "mcid", this.f395682h);
        j(linkedHashMap, "from_page", this.f395683i);
        return linkedHashMap;
    }
}
