package I8;

import Y61.k;
import Y61.l;
import cc.e;
import com.avito.android.advert_core.analytics.modelspecs.ModelCardFrom;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ShowModelCardEvent.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LI8/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "Lcc/e;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a implements com.avito.android.analytics.provider.clickstream.a, e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f7993b;

    public a(@k String str, int i12, int i13, int i14, @l String str2, @k ModelCardFrom modelCardFrom, @k ModelCardFrom modelCardFrom2) {
        this.f7993b = new ParametrizedClickStreamEvent(5220, 1, C35755b0.c(P0.j(new Q("iid", str), new Q("vendor_id", Integer.valueOf(i12)), new Q("catalog_id", Integer.valueOf(i13)), new Q("card_model_id", Integer.valueOf(i14)), new Q("target_page", modelCardFrom.f82832b), new Q("from_page", modelCardFrom2.f82832b), new Q("x", C35800g5.b(new C35792f5(str2))))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f7993b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f7993b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f7993b.f90248c;
    }
}
