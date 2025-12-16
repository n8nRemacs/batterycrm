package My0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.str_cancellation_settings.analytics.FromPageLabel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: StrCancellationSettingsScreenShownEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMy0/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f11147b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f11148c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final FromPageLabel f11149d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f11150e;

    public d(@k String str, @l String str2, @l FromPageLabel fromPageLabel) {
        this.f11147b = str;
        this.f11148c = str2;
        this.f11149d = fromPageLabel;
        this.f11150e = new ParametrizedClickStreamEvent(14047, 0, P0.g(new Q("uid", String.valueOf(str2)), new Q("iid", str), new Q("from_page", String.valueOf(fromPageLabel != null ? fromPageLabel.f288148b : null))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f11147b, dVar.f11147b) && L.f(this.f11148c, dVar.f11148c) && this.f11149d == dVar.f11149d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f11150e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f11150e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f11150e.f90248c;
    }

    public final int hashCode() {
        int iHashCode = this.f11147b.hashCode() * 31;
        String str = this.f11148c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        FromPageLabel fromPageLabel = this.f11149d;
        return iHashCode2 + (fromPageLabel != null ? fromPageLabel.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "StrCancellationSettingsScreenShownEvent(advertId=" + this.f11147b + ", userId=" + this.f11148c + ", fromPageLabel=" + this.f11149d + ')';
    }
}
