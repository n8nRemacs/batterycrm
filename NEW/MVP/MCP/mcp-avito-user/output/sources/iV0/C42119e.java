package iv0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.services_portfolio.project.buyer.mvi.entity.ActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProjectBuyer.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Liv0/e;", "", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: iv0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C42119e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final ActionType f405386a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f405387b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f405388c;

    public C42119e(@l ActionType actionType, @l String str, @l DeepLink deepLink) {
        this.f405386a = actionType;
        this.f405387b = str;
        this.f405388c = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C42119e)) {
            return false;
        }
        C42119e c42119e = (C42119e) obj;
        return this.f405386a == c42119e.f405386a && L.f(this.f405387b, c42119e.f405387b) && L.f(this.f405388c, c42119e.f405388c);
    }

    public final int hashCode() {
        ActionType actionType = this.f405386a;
        int iHashCode = (actionType == null ? 0 : actionType.hashCode()) * 31;
        String str = this.f405387b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f405388c;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenAction(actionType=");
        sb2.append(this.f405386a);
        sb2.append(", title=");
        sb2.append(this.f405387b);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f405388c, ')');
    }
}
