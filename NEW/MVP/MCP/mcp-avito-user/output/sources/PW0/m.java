package pw0;

import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrustItemsState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lpw0/m;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final ParametrizedClickStreamEvent f428895a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final DeepLink f428896b;

    public m(@Y61.l ParametrizedClickStreamEvent parametrizedClickStreamEvent, @Y61.l DeepLink deepLink) {
        this.f428895a = parametrizedClickStreamEvent;
        this.f428896b = deepLink;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f428895a, mVar.f428895a) && L.f(this.f428896b, mVar.f428896b);
    }

    public final int hashCode() {
        ParametrizedClickStreamEvent parametrizedClickStreamEvent = this.f428895a;
        int iHashCode = (parametrizedClickStreamEvent == null ? 0 : parametrizedClickStreamEvent.hashCode()) * 31;
        DeepLink deepLink = this.f428896b;
        return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrustItemsState(onShowEvent=");
        sb2.append(this.f428895a);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f428896b, ')');
    }
}
