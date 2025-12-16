package Nw0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ClickOnSimilarAdvertEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LNw0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_similar-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Nw0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C14619a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f11873b;

    public C14619a(@k String str, @k String str2, @l String str3) {
        this.f11873b = new ParametrizedClickStreamEvent(3199, 4, "Нажатие на объявление из блока похожих/дополняющих", C35755b0.c(P0.g(new Q("iid", str), new Q("rec_item_id", str2), new Q("cid", str3))));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f11873b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f11873b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f11873b.f90248c;
    }
}
