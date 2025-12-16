package Yv0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;

/* compiled from: StrBookingFillGuestDetailsEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LYv0/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Yv0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18335e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19736b;

    public C18335e(@k String str, @l String str2, @l Boolean bool, @l String str3) {
        this.f19736b = new ParametrizedClickStreamEvent(11989, 1, C35755b0.c(P0.j(new Q("iid", str), new Q("uid", str3), new Q("srcp", str2), new Q("with_pet", bool))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f19736b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f19736b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f19736b.f90248c;
    }

    public /* synthetic */ C18335e(String str, String str2, Boolean bool, String str3, int i12, C42822w c42822w) {
        this(str, str2, bool, (i12 & 8) != 0 ? null : str3);
    }
}
