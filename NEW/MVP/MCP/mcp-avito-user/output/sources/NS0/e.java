package Ns0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TimeGapClearedEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LNs0/e;", "Lcom/avito/android/analytics/provider/clickstream/a;", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.analytics.provider.clickstream.b f11787b = new com.avito.android.analytics.provider.clickstream.b(9906, 1);

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        com.avito.android.analytics.provider.clickstream.b bVar = this.f11787b;
        int i12 = bVar.f90262b;
        com.avito.android.analytics.provider.clickstream.b bVar2 = ((e) obj).f11787b;
        return i12 == bVar2.f90262b || bVar.f90263c == bVar2.f90263c || L.f(bVar.f90264d, bVar2.f90264d);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF19677b() {
        return this.f11787b.f90262b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f11787b.f90264d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF19678c() {
        return this.f11787b.f90263c;
    }

    public final int hashCode() {
        com.avito.android.analytics.provider.clickstream.b bVar = this.f11787b;
        return bVar.f90264d.hashCode() + r.e(bVar.f90263c, Integer.hashCode(bVar.f90262b) * 31, 31);
    }
}
