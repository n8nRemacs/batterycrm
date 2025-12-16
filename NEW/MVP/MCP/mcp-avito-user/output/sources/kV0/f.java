package kv0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.services_portfolio.project.seller.mvi.entity.ActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProjectSeller.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkv0/f;", "", "_avito_services-portfolio_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final ActionType f413288a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f413289b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DeepLink f413290c;

    public f(@l ActionType actionType, @l String str, @l DeepLink deepLink) {
        this.f413288a = actionType;
        this.f413289b = str;
        this.f413290c = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f413288a == fVar.f413288a && L.f(this.f413289b, fVar.f413289b) && L.f(this.f413290c, fVar.f413290c);
    }

    public final int hashCode() {
        ActionType actionType = this.f413288a;
        int iHashCode = (actionType == null ? 0 : actionType.hashCode()) * 31;
        String str = this.f413289b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DeepLink deepLink = this.f413290c;
        return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ScreenAction(actionType=");
        sb2.append(this.f413288a);
        sb2.append(", title=");
        sb2.append(this.f413289b);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f413290c, ')');
    }
}
