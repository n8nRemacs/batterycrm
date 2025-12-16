package sW;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.location_list.analytics.FromBlock;
import java.util.HashMap;
import java.util.Map;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: LocationListScreenCloseEvent.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LsW/a;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_location-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sW.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C48114a implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f437686b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f437687c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f437688d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final FromBlock f437689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f437690f;

    public C48114a(@l String str, @l String str2, @k String str3, @k FromBlock fromBlock) {
        this.f437686b = str;
        this.f437687c = str2;
        this.f437688d = str3;
        this.f437689e = fromBlock;
        HashMap mapE = P0.e(new Q("from_block", Integer.valueOf(fromBlock.f181946b)), new Q("location_text_input", str3));
        if (str2 != null) {
            mapE.put("lid", str2);
        }
        if (str != null) {
            mapE.put("cid", str);
        }
        G0 g02 = G0.f406611a;
        this.f437690f = new ParametrizedClickStreamEvent(2918, 1, mapE, null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48114a)) {
            return false;
        }
        C48114a c48114a = (C48114a) obj;
        return L.f(this.f437686b, c48114a.f437686b) && L.f(this.f437687c, c48114a.f437687c) && L.f(this.f437688d, c48114a.f437688d) && this.f437689e == c48114a.f437689e;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF328428b() {
        return this.f437690f.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f437690f.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF328429c() {
        return this.f437690f.f90248c;
    }

    public final int hashCode() {
        String str = this.f437686b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f437687c;
        return this.f437689e.hashCode() + H.d((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f437688d);
    }

    @k
    public final String toString() {
        return "LocationListScreenCloseEvent(categoryId=" + this.f437686b + ", locationId=" + this.f437687c + ", locationInput=" + this.f437688d + ", fromBlock=" + this.f437689e + ')';
    }
}
