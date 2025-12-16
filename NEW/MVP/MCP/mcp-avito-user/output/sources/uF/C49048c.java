package uf;

import Y61.k;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.autoteka.analytics.event.FromBlock;
import com.avito.android.autoteka.helpers.AutoSearchType;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: AutotekaDetailsGetReportClickEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Luf/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uf.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C49048c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f440215b;

    public C49048c(@k String str, @k String str2, @k FromBlock fromBlock, int i12) {
        LinkedHashMap linkedHashMapJ = P0.j(new Q(ContextActionHandler.Link.URL, str2), new Q("from_block", Integer.valueOf(fromBlock.f96095b)));
        AutoSearchType[] autoSearchTypeArr = AutoSearchType.f96643b;
        if (i12 == 1) {
            linkedHashMapJ.put("iid", str);
        }
        G0 g02 = G0.f406611a;
        this.f440215b = new ParametrizedClickStreamEvent(2398, 2, linkedHashMapJ, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f440215b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f440215b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f440215b.f90248c;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C49048c(String str, String str2, FromBlock fromBlock, int i12, int i13, C42822w c42822w) {
        if ((i13 & 8) != 0) {
            AutoSearchType[] autoSearchTypeArr = AutoSearchType.f96643b;
            i12 = 1;
        }
        this(str, str2, fromBlock, i12);
    }
}
