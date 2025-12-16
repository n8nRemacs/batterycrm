package P70;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: GalleryCloseFullscreenEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LP70/a;", "Lcom/avito/android/analytics/provider/clickstream/c;", "_avito_photo-gallery_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a extends com.avito.android.analytics.provider.clickstream.c {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f12843f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f12844g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f12845h;

    public a(@l TreeClickStreamParent treeClickStreamParent, @k String str, @k String str2, boolean z12) {
        super(0L, treeClickStreamParent, 3227, 2);
        this.f12843f = str;
        this.f12844g = str2;
        this.f12845h = z12;
    }

    @Override // com.avito.android.analytics.provider.clickstream.c
    @k
    public final Map<String, Object> i() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        j(linkedHashMap, "iid", this.f12843f);
        j(linkedHashMap, "cid", this.f12844g);
        j(linkedHashMap, "exit_by_swipe", Boolean.valueOf(this.f12845h));
        return linkedHashMap;
    }
}
