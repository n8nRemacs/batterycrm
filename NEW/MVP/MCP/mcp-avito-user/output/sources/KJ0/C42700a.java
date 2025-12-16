package kj0;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.remote.analytics.C34244a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: ErrorDialogShownEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkj0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_performance_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: kj0.a, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C42700a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f406553b;

    public C42700a(boolean z12, @k String str, @l C34244a c34244a, @l String str2, @l String str3) {
        Q q12 = new Q("error_dialog_type", z12 ? "in_screen" : "toast");
        Q q13 = new Q("ios_network_error_text", str);
        String str4 = c34244a != null ? c34244a.f253102a : null;
        Q q14 = new Q("network_error_id", str4 == null ? "" : str4);
        String str5 = c34244a != null ? c34244a.f253104c : null;
        Q q15 = new Q("diagnostic_error_id", str5 == null ? "" : str5);
        String str6 = c34244a != null ? c34244a.f253104c : null;
        Q q16 = new Q("reason_diagnostic_context_id", str6 == null ? "" : str6);
        String str7 = c34244a != null ? c34244a.f253103b : null;
        this.f406553b = new ParametrizedClickStreamEvent(5596, 7, P0.g(q12, q13, q14, q15, q16, new Q("diagnostic_context", str7 == null ? "" : str7), new Q("screen_name", str2 == null ? "" : str2), new Q("screen_random_id", str3 != null ? str3 : ""), new Q("new_exception_id", "unknown-error")), null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f406553b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f406553b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f406553b.f90248c;
    }
}
