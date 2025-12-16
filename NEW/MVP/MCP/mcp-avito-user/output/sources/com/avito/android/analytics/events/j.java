package com.avito.android.analytics.events;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import yc.C50213a;

/* compiled from: MultiAddressesSlotShowEvent.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/events/j;", "Lcom/avito/android/analytics/provider/clickstream/a;", "a", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90161b;

    /* compiled from: MultiAddressesSlotShowEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/events/j$a;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f90162a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f90163b;

        public a(@Y61.k String str, @Y61.k String str2) {
            this.f90162a = str;
            this.f90163b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f90162a, aVar.f90162a) && L.f(this.f90163b, aVar.f90163b);
        }

        public final int hashCode() {
            return this.f90163b.hashCode() + (this.f90162a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Data(userAddressCount=");
            sb2.append(this.f90162a);
            sb2.append(", isEnabled=");
            return C22026a.c(sb2, this.f90163b, ')');
        }
    }

    public j(@Y61.k C50213a c50213a, @Y61.k a aVar) {
        LinkedHashMap linkedHashMapA = c50213a.a();
        c50213a.c();
        linkedHashMapA.put("esid", c50213a.c().f406620c);
        linkedHashMapA.put("user_address_count", aVar.f90162a);
        linkedHashMapA.put("is_enabled", aVar.f90163b);
        this.f90161b = new ParametrizedClickStreamEvent(9997, 2, linkedHashMapA, null, 8, null);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f90161b.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90161b.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f90161b.f90248c;
    }
}
