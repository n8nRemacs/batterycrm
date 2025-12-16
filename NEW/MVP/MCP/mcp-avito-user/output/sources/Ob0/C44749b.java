package ob0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.Collections;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: DeleteDeviceSuccessEvent8844.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lob0/b;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ob0.b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final /* data */ class C44749b implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final int f419943b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f419944c;

    public C44749b(int i12) {
        this.f419943b = i12;
        this.f419944c = new ParametrizedClickStreamEvent(8844, 1, Collections.singletonMap("iac_devices_to_call_cnt", Integer.valueOf(i12)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C44749b) && this.f419943b == ((C44749b) obj).f419943b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF395375b() {
        return this.f419944c.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f419944c.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF395376c() {
        return this.f419944c.f90248c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f419943b);
    }

    @k
    public final String toString() {
        return r.t(new StringBuilder("DeleteDeviceSuccessEvent8844(devicesLeftCount="), this.f419943b, ')');
    }
}
