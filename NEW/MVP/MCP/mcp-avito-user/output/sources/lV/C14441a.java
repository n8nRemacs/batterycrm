package Lv;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.delivery_tarifikator.analytics.clickstream.ErrorLevel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: Events.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLv/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_delivery-tarifikator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Lv.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* data */ class C14441a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ErrorLevel f10174b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f10175c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f10176d;

    public C14441a(@k ErrorLevel errorLevel, @k String str) {
        this.f10174b = errorLevel;
        this.f10175c = str;
        this.f10176d = new ParametrizedClickStreamEvent(12319, 10, P0.g(new Q("error_level", errorLevel.f135228b), new Q("error_text", str)), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14441a)) {
            return false;
        }
        C14441a c14441a = (C14441a) obj;
        return this.f10174b == c14441a.f10174b && L.f(this.f10175c, c14441a.f10175c);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f10176d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f10176d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f10176d.f90248c;
    }

    public final int hashCode() {
        return this.f10175c.hashCode() + (this.f10174b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TarifikatorClientErrorEvent(errorLevel=");
        sb2.append(this.f10174b);
        sb2.append(", errorText=");
        return C22026a.c(sb2, this.f10175c, ')');
    }
}
