package Cd0;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: ClickModifyMultiAddressEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LCd0/z;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Cd0.z, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C13292z implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2490b;

    /* compiled from: ClickModifyMultiAddressEvent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/z$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Cd0.z$a */
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f2491a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f2492b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f2493c;

        public a(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
            this.f2491a = str;
            this.f2492b = str2;
            this.f2493c = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.L.f(this.f2491a, aVar.f2491a) && kotlin.jvm.internal.L.f(this.f2492b, aVar.f2492b) && kotlin.jvm.internal.L.f(this.f2493c, aVar.f2493c);
        }

        public final int hashCode() {
            return this.f2493c.hashCode() + androidx.compose.foundation.H.d(this.f2491a.hashCode() * 31, 31, this.f2492b);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Data(locationId=");
            sb2.append(this.f2491a);
            sb2.append(", addressId=");
            sb2.append(this.f2492b);
            sb2.append(", fromPage=");
            return C22026a.c(sb2, this.f2493c, ')');
        }
    }

    public C13292z(@Y61.k C50213a c50213a, @Y61.k a aVar) {
        LinkedHashMap linkedHashMapA = c50213a.a();
        c50213a.c();
        linkedHashMapA.put("esid", c50213a.c().f406620c);
        linkedHashMapA.put("location_id", aVar.f2491a);
        linkedHashMapA.put("address_id", aVar.f2492b);
        linkedHashMapA.put("from_page", aVar.f2493c);
        this.f2490b = new ParametrizedClickStreamEvent(10000, 3, linkedHashMapA, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF82866b() {
        return this.f2490b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2490b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF82867c() {
        return this.f2490b.f90248c;
    }
}
