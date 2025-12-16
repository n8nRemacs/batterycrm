package Cg;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.avl_analytics.AvlEntryType;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AvlFullscreenOpened.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCg/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_avl-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cg.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C13300a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f2575b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f2576c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2577d;

    public C13300a(@l String str, @l String str2, @l String str3, @l Integer num, @l Integer num2, @l AvlEntryType avlEntryType, @l String str4, @l String str5, @l String str6) {
        this.f2575b = str;
        this.f2576c = str5;
        HashMap map = new HashMap();
        if (str2 != null) {
            map.put("cid", str2);
        }
        if (str3 != null) {
            map.put("iid", str3);
        }
        if (num != null) {
            map.put("position", Integer.valueOf(num.intValue()));
        }
        if (str5 != null) {
            map.put("x", str5);
        }
        if (str != null) {
            map.put("from_page", str);
        }
        if (num2 != null) {
            map.put("avl_entry_position", Integer.valueOf(num2.intValue()));
        }
        if (avlEntryType != null) {
            map.put("avl_entry_type", "full-width");
        }
        if (str4 != null) {
            map.put("x_avl_hash", str4);
        }
        if (str6 != null) {
            map.put("source_session_id", str6);
        }
        G0 g02 = G0.f406611a;
        this.f2577d = new ParametrizedClickStreamEvent(7724, 11, map, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f2577d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f2577d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f2577d.f90248c;
    }
}
