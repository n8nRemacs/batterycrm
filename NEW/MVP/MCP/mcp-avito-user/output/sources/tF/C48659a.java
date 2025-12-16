package tf;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.autoteka.analytics.event.report.ReportButtons;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: AutotekaReportClickNavBarButtonsEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltf/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tf.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C48659a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f439370b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ReportButtons f439371c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f439372d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f439373e;

    public C48659a(@l String str, @k ReportButtons reportButtons, @k String str2) {
        this.f439370b = str;
        this.f439371c = reportButtons;
        this.f439372d = str2;
        this.f439373e = new ParametrizedClickStreamEvent(9381, 1, C35755b0.c(P0.g(new Q("autoteka_public_report_id", str2), new Q("action_type", reportButtons.f96100b), new Q("x_autoteka", str))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48659a)) {
            return false;
        }
        C48659a c48659a = (C48659a) obj;
        return L.f(this.f439370b, c48659a.f439370b) && this.f439371c == c48659a.f439371c && L.f(this.f439372d, c48659a.f439372d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF5939c() {
        return this.f439373e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f439373e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF5940d() {
        return this.f439373e.f90248c;
    }

    public final int hashCode() {
        String str = this.f439370b;
        return this.f439372d.hashCode() + ((this.f439371c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AutotekaReportClickNavBarButtonsEvent(autotekaX=");
        sb2.append(this.f439370b);
        sb2.append(", button=");
        sb2.append(this.f439371c);
        sb2.append(", reportPublicID=");
        return C22026a.c(sb2, this.f439372d, ')');
    }
}
