package My0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: StrCancellationSettingsApplyClickEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMy0/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: My0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C14544a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f11131b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f11132c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f11133d;

    public C14544a(@k String str, @l String str2) {
        this.f11131b = str;
        this.f11132c = str2;
        this.f11133d = new ParametrizedClickStreamEvent(14050, 0, P0.g(new Q("uid", String.valueOf(str2)), new Q("iid", str), new Q("type", "submit"), new Q("from_page", "refund_form")), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14544a)) {
            return false;
        }
        C14544a c14544a = (C14544a) obj;
        return L.f(this.f11131b, c14544a.f11131b) && L.f(this.f11132c, c14544a.f11132c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f11133d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f11133d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f11133d.f90248c;
    }

    public final int hashCode() {
        int iHashCode = this.f11131b.hashCode() * 31;
        String str = this.f11132c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StrCancellationSettingsApplyClickEvent(advertId=");
        sb2.append(this.f11131b);
        sb2.append(", userId=");
        return C22026a.c(sb2, this.f11132c, ')');
    }
}
