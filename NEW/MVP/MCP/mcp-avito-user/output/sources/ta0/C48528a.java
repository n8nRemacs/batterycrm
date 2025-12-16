package tA0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.suggest_locations.analytics.FromBlock;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: SuggestLocationsScreenCloseEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LtA0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_suggest-locations_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tA0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48528a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f439183b;

    public C48528a(@l String str, @l String str2, @k String str3, @k FromBlock fromBlock, @l Integer num, @l String str4, @l String str5, @l String str6) {
        HashMap mapE = P0.e(new Q("from_block", Integer.valueOf(fromBlock.f292258b)), new Q("location_text_input", str3));
        if (str2 != null) {
            mapE.put("lid", str2);
        }
        if (str != null) {
            mapE.put("cid", str);
        }
        if (num != null) {
            mapE.put("from_page", Integer.valueOf(num.intValue()));
        }
        if (str4 != null) {
            mapE.put("locationid", str4);
        }
        if (str5 != null) {
            mapE.put("geo_session", str5);
        }
        if (str6 != null) {
            mapE.put("user_key", str6);
        }
        G0 g02 = G0.f406611a;
        this.f439183b = new ParametrizedClickStreamEvent(2918, 9, mapE, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f439183b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f439183b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f439183b.f90248c;
    }
}
