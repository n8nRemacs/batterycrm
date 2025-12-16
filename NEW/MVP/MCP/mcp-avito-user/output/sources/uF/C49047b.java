package uf;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.autoteka.helpers.AutoSearchType;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: AutotekaDetailsGetReportClickEvent2.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luf/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uf.b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49047b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f440214b;

    public C49047b(@l String str, int i12, @l Long l12, @l String str2, @l String str3, @l String str4) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q("from_block", l12), new Q("action_type", str3), new Q("x", C35800g5.b(new C35792f5(str2))), new Q("autoteka_search_type", Integer.valueOf(i12)), new Q("x_autoteka", str4));
        AutoSearchType[] autoSearchTypeArr = AutoSearchType.f96643b;
        if (i12 == 1) {
            linkedHashMapJ.put("iid", str);
        }
        G0 g02 = G0.f406611a;
        this.f440214b = new ParametrizedClickStreamEvent(7936, 6, C35755b0.c(linkedHashMapJ), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f440214b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f440214b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f440214b.f90248c;
    }
}
