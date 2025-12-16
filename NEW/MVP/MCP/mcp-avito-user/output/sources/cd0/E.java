package Cd0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import yc.C50213a;

/* compiled from: ClickSaveNewDeliveryAddressEvent.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LCd0/E;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class E implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f2386b;

    /* compiled from: ClickSaveNewDeliveryAddressEvent.kt */
    @androidx.compose.runtime.internal.P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LCd0/E$a;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f2387a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f2388b;

        public a(@Y61.k String str, @Y61.k String str2) {
            this.f2387a = str;
            this.f2388b = str2;
        }
    }

    public E(@Y61.k C50213a c50213a, @Y61.k a aVar) {
        LinkedHashMap linkedHashMapA = c50213a.a();
        c50213a.c();
        linkedHashMapA.put("esid", c50213a.c().f406620c);
        linkedHashMapA.put("location_id", aVar.f2388b);
        linkedHashMapA.put("address_id", aVar.f2387a);
        this.f2386b = new ParametrizedClickStreamEvent(11426, 0, linkedHashMapA, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF90129b() {
        return this.f2386b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f2386b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF90130c() {
        return this.f2386b.f90248c;
    }
}
