package ko;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ExtendedProfileChangeSpecificScreenShownEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lko/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_extended-profile-change-specific_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ko.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C42721b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f406599b;

    public C42721b(@l String str, @l Integer num) {
        Q q12 = new Q("uid", str == null ? "" : str);
        String string = num != null ? num.toString() : null;
        this.f406599b = new ParametrizedClickStreamEvent(9511, 2, "ext_profile_specificity_selection_show", P0.g(q12, new Q("tariff_vertical_specificity_id", string != null ? string : "")));
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f406599b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f406599b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f406599b.f90248c;
    }
}
