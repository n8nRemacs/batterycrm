package St;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: OnClickPrimaryButton.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LSt/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: St.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C15220a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f15175b;

    public C15220a(@k String str, @l String str2) {
        this.f15175b = new ParametrizedClickStreamEvent(10922, 1, C35755b0.c(P0.g(new Q("item_id", str), new Q("user_id", str2), new Q("button_name", "cv_create"))), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f15175b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f15175b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f15175b.f90248c;
    }
}
