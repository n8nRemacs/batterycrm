package Z10;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactInfoOpenedEvent.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LZ10/d;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_mortgage-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class d implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f19835b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f19836c;

    public d(@l String str) {
        this.f19835b = str;
        this.f19836c = new ParametrizedClickStreamEvent(15222, 0, C35755b0.c(Collections.singletonMap("utm_source", str)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && L.f(this.f19835b, ((d) obj).f19835b);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f19836c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f19836c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f19836c.f90248c;
    }

    public final int hashCode() {
        String str = this.f19835b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ContactInfoOpenedEvent(utmSource="), this.f19835b, ')');
    }
}
