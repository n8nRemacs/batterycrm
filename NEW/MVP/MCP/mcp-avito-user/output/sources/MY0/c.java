package My0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: StrCancellationSettingsScreenActionEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMy0/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f11143b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f11144c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final b f11145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f11146e;

    public c(@k String str, @l String str2, @k b bVar) {
        this.f11143b = str;
        this.f11144c = str2;
        this.f11145d = bVar;
        this.f11146e = new ParametrizedClickStreamEvent(14048, 0, P0.g(new Q("uid", String.valueOf(str2)), new Q("iid", str), new Q("type", bVar.getF11134a())), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f11143b, cVar.f11143b) && L.f(this.f11144c, cVar.f11144c) && L.f(this.f11145d, cVar.f11145d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f11146e.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f11146e.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f11146e.f90248c;
    }

    public final int hashCode() {
        int iHashCode = this.f11143b.hashCode() * 31;
        String str = this.f11144c;
        return this.f11145d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "StrCancellationSettingsScreenActionEvent(advertId=" + this.f11143b + ", userId=" + this.f11144c + ", screenAction=" + this.f11145d + ')';
    }
}
