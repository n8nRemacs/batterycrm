package f8;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.analytics.provider.clickstream.c;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: CopyAddressOnClickEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lf8/b;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b extends c {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f395684f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f395685g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f395686h;

    public b(@l TreeClickStreamParent treeClickStreamParent, @k String str, @l String str2, @l String str3) {
        super(0L, treeClickStreamParent, 3198, 4);
        this.f395684f = str;
        this.f395685g = str2;
        this.f395686h = str3;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "iid", this.f395684f);
        String str = this.f395685g;
        if (str != null) {
            j(linkedHashMap, "cid", str);
        }
        String str2 = this.f395686h;
        if (str2 != null) {
            j(linkedHashMap, "from_page", str2);
        }
        return linkedHashMap;
    }
}
