package lc;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.event.imv_cars.IconType;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.L;

/* compiled from: ImvInformationButtonClickedEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llc/c;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lc.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C43726c implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f413940b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final IconType f413941c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f413942d;

    public C43726c(@l String str, @k IconType iconType) {
        this.f413940b = str;
        this.f413941c = iconType;
        this.f413942d = new ParametrizedClickStreamEvent(4106, 1, C35755b0.c(P0.j(new Q("iid", str), new Q("icon_type", iconType.f90097b))), null, 8, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C43726c)) {
            return false;
        }
        C43726c c43726c = (C43726c) obj;
        return L.f(this.f413940b, c43726c.f413940b) && this.f413941c == c43726c.f413941c;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF224266b() {
        return this.f413942d.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @k
    public final Map<String, Object> getParams() {
        return this.f413942d.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF224267c() {
        return this.f413942d.f90248c;
    }

    public final int hashCode() {
        String str = this.f413940b;
        return this.f413941c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public final String toString() {
        return "ImvInformationButtonClickedEvent(itemId=" + this.f413940b + ", iconType=" + this.f413941c + ')';
    }
}
